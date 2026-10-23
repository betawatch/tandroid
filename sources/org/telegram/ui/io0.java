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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class io0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List g1 = Arrays.asList("http", "https");
    public static final List h1 = Collections.singletonList("tg");
    public lt A0;
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
    public final org.telegram.ui.Cells.l4[] I;
    public TLRPC.TL_payments_validateRequestedInfo I0;
    public final ArrayList J;
    public TLRPC.TL_inputPaymentCredentialsGooglePay J0;
    public final org.telegram.ui.Cells.b7[] K;
    public String K0;
    public org.telegram.ui.Cells.w8 L;
    public String L0;
    public final org.telegram.ui.Cells.e9[] M;
    public JSONObject M0;
    public final org.telegram.ui.Cells.ca[] N;
    public MessageObject N0;
    public FrameLayout O;
    public String O0;
    public FrameLayout P;
    public boolean P0;
    public LinearLayout Q;
    public boolean Q0;
    public org.telegram.ui.Cells.f9 R;
    public String[] R0;
    public org.telegram.ui.Cells.i3 S;
    public boolean S0;
    public go0 T;
    public boolean T0;
    public TextView U;
    public boolean U0;
    public org.telegram.ui.Cells.p6 V;
    public boolean V0;
    public eo0 W;
    public boolean W0;
    public org.telegram.ui.Cells.k5 X;
    public boolean X0;
    public final org.telegram.ui.Cells.d9[] Y;
    public org.telegram.ui.ActionBar.g6 Y0;
    public float Z;
    public ho0 Z0;
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
    public fn0 d0;
    public Utilities.Callback d1;
    public com.google.android.gms.internal.clearcut.v0 e;
    public boolean e0;
    public x10 e1;
    public EditTextBoldCursor[] f;
    public io0 f0;
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
    public org.telegram.ui.Components.cr r;
    public org.telegram.ui.ActionBar.o2 r0;
    public org.telegram.ui.Components.cr s;
    public ln0 s0;
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

    public io0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.l4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ca[2];
        this.Y = new org.telegram.ui.Cells.d9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l4, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, o2Var, z11);
    }

    public static /* synthetic */ void U(io0 io0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        a50 a50Var = new a50(18, io0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            a50Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(gettmppassword, a50Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        a50Var.run(null, tL_error2);
    }

    public static /* synthetic */ void V(io0 io0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        io0Var.D0(false);
        io0Var.H0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    io0Var.E0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    io0Var.E0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    io0Var.E0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    io0Var.E0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    io0Var.E0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    io0Var.E0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    io0Var.E0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    io0Var.E0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    io0Var.E0(7);
                    break;
                default:
                    org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void W(io0 io0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        io0Var.E0 = tL_payments_validatedRequestedInfo;
        if (io0Var.C0.saved_info != null && !io0Var.T0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new ci.d6(20), io0Var.W0 ? 8 : 0);
        }
        io0Var.t0();
        io0Var.D0(false);
        io0Var.H0(true, false);
    }

    public static /* synthetic */ void X(io0 io0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        io0Var.D0(false);
        io0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void Y(io0 io0Var, org.telegram.ui.Components.qc qcVar, boolean z10, TLRPC.Message message) {
        qcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(io0Var.currentAccount).getInputPeer(message.peer_id);
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new in0(io0Var, 3), 2);
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(sn.V9(message.id, MessageObject.getDialogId(message)));
        }
    }

    public static void Z(io0 io0Var) {
        ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ci.d6(20), io0Var.W0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(io0Var.getParentActivity());
        alertDialog$Builder.a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        io0Var.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(io0 io0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        ai.w9 w9Var = new ai.w9(io0Var, z10, str, 8);
        if (z10) {
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(updatepasswordsettings, w9Var, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = io0Var.a0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            w9Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            w9Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(updatepasswordsettings, w9Var, 10);
    }

    public static /* synthetic */ void b0(io0 io0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, tL_payments_sendPaymentForm, new Object[0]);
        io0Var.D0(false);
        io0Var.H0(false, false);
        io0Var.a1 = true;
        io0Var.f1 = 4;
        ho0 ho0Var = io0Var.Z0;
        if (ho0Var != null) {
            ho0Var.a(4);
        }
    }

    public static void c0(io0 io0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ai.nd.k1(io0Var.getParentActivity(), io0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, io0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        io0 io0Var2 = new io0((TLRPC.PaymentReceipt) tLObject);
        io0Var2.c1 = io0Var.c1;
        io0Var2.d1 = io0Var.d1;
        R.showAsSheet(io0Var2, m2Var);
    }

    public static /* synthetic */ void d0(io0 io0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        io0Var.H0(true, false);
        io0Var.D0(false);
        if (tLObject != null) {
            io0Var.v0 = true;
            UserConfig.getInstance(io0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(io0Var.currentAccount).saveConfig(false);
            io0Var.t0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            io0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(io0Var.f[1], 3.25f);
        io0Var.f[1].setText("");
    }

    public static void e0(io0 io0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ai.nd.k1(io0Var.getParentActivity(), io0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, io0Var.Y0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        io0 io0Var2 = new io0((TLRPC.PaymentReceipt) tLObject);
        io0Var2.c1 = io0Var.c1;
        io0Var2.d1 = io0Var.d1;
        R.showAsSheet(io0Var2, m2Var);
    }

    public static /* synthetic */ void f0(io0 io0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.f5.f0(io0Var.currentAccount, tL_error, io0Var, getpassword, new Object[0]);
            io0Var.H0(true, false);
            io0Var.D0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.i0(password, false)) {
            org.telegram.ui.Components.f5.x0(io0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new re0(io0Var, password, AndroidUtilities.getStringBytes(str), 16));
        } else {
            io0Var.v0 = false;
            io0Var.t0();
        }
    }

    public static /* synthetic */ void g0(io0 io0Var, org.telegram.ui.Components.qc qcVar, boolean z10, TLRPC.Message[] messageArr) {
        qcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(io0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new in0(io0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(sn.V9(messageArr[0].id, MessageObject.getDialogId(messageArr[0])));
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
    public static void h0(io0 io0Var, String str, View view) {
        int i10;
        org.telegram.ui.Cells.p6 p6Var = io0Var.V;
        if (p6Var != null && !io0Var.F) {
            io0Var.Z = -io0Var.Z;
            AndroidUtilities.shakeViewSpring(p6Var.getTextView(), io0Var.Z);
            AndroidUtilities.shakeViewSpring(io0Var.V.getCheckBox(), io0Var.Z);
            try {
                io0Var.V.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z10 = io0Var.V0;
        int i11 = 1;
        if (z10 && io0Var.C0.saved_info != null && io0Var.I0 == null) {
            io0Var.D0(true);
            bh0 bh0Var = new bh0(14, io0Var, view);
            if (io0Var.Q0) {
                return;
            }
            io0Var.H0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            io0Var.I0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = io0Var.b1;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (io0Var.N0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = io0Var.getMessagesController().getInputPeer(io0Var.N0.messageOwner.peer_id);
                tL_inputInvoiceMessage.msg_id = io0Var.N0.getId();
                io0Var.I0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = io0Var.O0;
                io0Var.I0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = io0Var.I0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = io0Var.C0.saved_info;
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new ca(io0Var, bh0Var, tL_payments_validateRequestedInfo2, 29), (io0Var.W0 ? 8 : 0) | 2);
            return;
        }
        if (z10) {
            TLRPC.PaymentForm paymentForm = io0Var.C0;
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
                            io0Var.G0(new org.telegram.ui.Components.uu(0, view));
                            return;
                        } else {
                            io0 io0Var2 = new io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, i10, io0Var.E0, io0Var.G0, io0Var.H0, io0Var.w0, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                            io0Var2.c1 = io0Var.c1;
                            io0Var2.d1 = io0Var.d1;
                            io0Var.presentFragment(io0Var2);
                            return;
                        }
                    }
                }
                i10 = (io0Var.y0 == null && io0Var.w0 == null && io0Var.J0 == null) ? 2 : 1;
                if (i10 != 2) {
                }
                io0 io0Var22 = new io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, i10, io0Var.E0, io0Var.G0, io0Var.H0, io0Var.w0, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                io0Var22.c1 = io0Var.c1;
                io0Var22.d1 = io0Var.d1;
                io0Var.presentFragment(io0Var22);
                return;
            }
            if (io0Var.y0 == null) {
                if (io0Var.w0 == null) {
                }
            }
            if (io0Var.G0 == null) {
            }
        }
        if (!io0Var.C0.password_missing && io0Var.y0 != null) {
            if (UserConfig.getInstance(io0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(io0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(io0Var.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(io0Var.currentAccount).tmpPassword = null;
                UserConfig.getInstance(io0Var.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(io0Var.currentAccount).tmpPassword == null) {
                io0Var.X0 = true;
                io0 io0Var3 = new io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, 3, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                io0Var3.c1 = io0Var.c1;
                io0Var3.d1 = io0Var.d1;
                io0Var.presentFragment(io0Var3);
                io0Var.X0 = false;
                return;
            }
            if (io0Var.V0) {
                io0Var.V0 = false;
                NotificationCenter.getInstance(io0Var.currentAccount).removeObserver(io0Var, NotificationCenter.paymentFinished);
            }
        }
        TLRPC.User user = io0Var.l0;
        if (user == null || user.verified) {
            io0Var.I0(io0Var.R0[0]);
            return;
        }
        String str2 = "payment_warning_" + io0Var.l0.id;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(io0Var.currentAccount);
        if (notificationsSettings.getBoolean(str2, false)) {
            io0Var.I0(io0Var.R0[0]);
            return;
        }
        notificationsSettings.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(io0Var.getParentActivity());
        String string = LocaleController.getString(R.string.PaymentWarning);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = LocaleController.formatString("PaymentWarningText", R.string.PaymentWarningText, io0Var.p0, str);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new gn0(io0Var, i11));
        io0Var.showDialog(c2Var);
    }

    public static void i0(io0 io0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(new TL_account.getPassword(), new ei.o3(10, io0Var, z10), 8);
            return;
        }
        io0Var.H0(true, false);
        if (z10) {
            TL_account.Password password = io0Var.a0;
            password.has_password = false;
            password.current_algo = null;
            io0Var.T.a(password);
            io0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (io0Var.getParentActivity() == null) {
                return;
            }
            io0Var.t0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    io0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    io0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    io0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            }
            io0Var.c0 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(io0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ql0(2, io0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.T = string;
            c2Var.R = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = io0Var.showDialog(c2Var);
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
    public static void j0(io0 io0Var) {
        Integer num;
        Integer num2;
        int i10;
        boolean z10;
        boolean z11;
        Integer num3;
        boolean z12;
        boolean z13;
        String[] split = io0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer parseInt = Utilities.parseInt((CharSequence) split[0]);
            num2 = Utilities.parseInt((CharSequence) split[1]);
            num = parseInt;
        } else {
            num = null;
            num2 = null;
        }
        wc.a aVar = new wc.a(io0Var.f[0].getText().toString(), num, num2, io0Var.f[3].getText().toString(), io0Var.f[2].getText().toString(), null, null, null, null, io0Var.f[5].getText().toString(), io0Var.f[4].getText().toString(), null, null, null, null, null, null);
        io0Var.x0 = aVar.a() + " *" + aVar.b();
        boolean z14 = num != null && num2 != null && UserConfig.getInstance(io0Var.currentAccount).getClientPhone().startsWith("7") && "smartglocal".equals(io0Var.C0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (w7.o9.d(str)) {
            i10 = 0;
        } else {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!w7.o9.d(replaceAll) && replaceAll != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        boolean z15 = true;
                        int i12 = 0;
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
                                i12 += parseInt2;
                                length--;
                                z15 = z16;
                            } else if (i12 % 10 == 0) {
                                String a2 = aVar.a();
                                if (!"American Express".equals(a2) ? !(!"Diners Club".equals(a2) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    if (!z14) {
                                        Integer num4 = aVar.c;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && w7.j9.a(num3.intValue()) >= oa.d.w3().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || w7.j9.a(num3.intValue()) < oa.d.w3().get(1)) {
                                                z12 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (w7.j9.a(intValue) >= oa.d.w3().get(1)) {
                                                    Calendar w32 = oa.d.w3();
                                                    if (w7.j9.a(intValue) != w32.get(1) || intValue2 >= w32.get(2) + 1) {
                                                        z13 = false;
                                                        z12 = !z13;
                                                    }
                                                }
                                                z13 = true;
                                                z12 = !z13;
                                            }
                                        }
                                        io0Var.E0(1);
                                        return;
                                    }
                                    if (io0Var.i0 && io0Var.f[2].length() == 0) {
                                        io0Var.E0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!w7.o9.d(str2)) {
                                        String trim = str2.trim();
                                        String a10 = aVar.a();
                                        boolean z17 = (a10 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(a10) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            for (int i13 = 0; i13 < trim.length(); i13++) {
                                                if (Character.isDigit(trim.charAt(i13))) {
                                                }
                                            }
                                            z10 = true;
                                            if (z10 && z17) {
                                                z11 = true;
                                                if (!z11) {
                                                    io0Var.E0(3);
                                                    return;
                                                }
                                                if (io0Var.g0 && io0Var.f[4].length() == 0) {
                                                    io0Var.E0(4);
                                                    return;
                                                }
                                                if (io0Var.h0 && io0Var.f[5].length() == 0) {
                                                    io0Var.E0(5);
                                                    return;
                                                }
                                                io0Var.H0(true, true);
                                                try {
                                                    if ("stripe".equals(io0Var.C0.native_provider)) {
                                                        String str3 = io0Var.j0;
                                                        le.b bVar = new le.b(new oa.d(25), 24);
                                                        oa.d.N3(str3);
                                                        xn0 xn0Var = new xn0(io0Var);
                                                        try {
                                                            oa.d.N3(str3);
                                                            new uc.a(bVar, str3, aVar, xn0Var).execute(new Void[0]);
                                                        } catch (vc.c e) {
                                                            xn0Var.a(e);
                                                        }
                                                    } else if ("smartglocal".equals(io0Var.C0.native_provider)) {
                                                        new yn0(io0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
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
                    } else if (!Character.isDigit(replaceAll.charAt(i11))) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            i10 = 0;
        }
        io0Var.E0(i10);
    }

    public static void k0(io0 io0Var) {
        if (UserConfig.getInstance(io0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(io0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(io0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(io0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(io0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(io0Var.currentAccount).tmpPassword != null) {
            io0Var.z0();
            return;
        }
        if (io0Var.f[1].length() == 0) {
            try {
                io0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(io0Var.f[1], 2.5f);
            return;
        }
        String obj = io0Var.f[1].getText().toString();
        io0Var.H0(true, true);
        io0Var.D0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(getpassword, new ca(io0Var, obj, getpassword, 28), (io0Var.W0 ? 8 : 0) | 2);
    }

    public static void m0(io0 io0Var) {
        if (io0Var.Q0) {
            return;
        }
        io0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        io0Var.I0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = io0Var.b1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (io0Var.N0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = io0Var.getMessagesController().getInputPeer(io0Var.N0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = io0Var.N0.getId();
            io0Var.I0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = io0Var.O0;
            io0Var.I0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = io0Var.I0;
        tL_payments_validateRequestedInfo2.save = io0Var.T0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (io0Var.C0.invoice.name_requested) {
            io0Var.I0.info.name = io0Var.f[6].getText().toString();
            io0Var.I0.info.flags |= 1;
        }
        if (io0Var.C0.invoice.phone_requested) {
            io0Var.I0.info.phone = "+" + io0Var.f[8].getText().toString() + io0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = io0Var.I0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (io0Var.C0.invoice.email_requested) {
            io0Var.I0.info.email = io0Var.f[7].getText().toString().trim();
            io0Var.I0.info.flags |= 4;
        }
        if (io0Var.C0.invoice.shipping_address_requested) {
            io0Var.I0.info.shipping_address = new TLRPC.TL_postAddress();
            io0Var.I0.info.shipping_address.street_line1 = io0Var.f[0].getText().toString();
            io0Var.I0.info.shipping_address.street_line2 = io0Var.f[1].getText().toString();
            io0Var.I0.info.shipping_address.city = io0Var.f[2].getText().toString();
            io0Var.I0.info.shipping_address.state = io0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = io0Var.I0.info.shipping_address;
            String str = io0Var.B0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = io0Var.f[5].getText().toString();
            io0Var.I0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(io0Var.currentAccount).sendRequest(io0Var.I0, new a50(16, io0Var, io0Var.I0), (io0Var.W0 ? 8 : 0) | 2);
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
                org.telegram.ui.Cells.i3 i3Var = this.S;
                try {
                    i3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(i3Var, 2.5f);
                return;
            } else {
                H0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new in0(this, 0), 10);
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
        Utilities.globalQueue.postRunnable(new ei.s1(this, z10, str, str2, updatepasswordsettings));
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
            a1.g.A(sb2, ", ", str4, ", ", str5);
            d9VarArr[2].b(R.drawable.msg_payment_address, a1.g.s(sb2, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        d9VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            d9VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        d9VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            d9VarArr[4].b(R.drawable.msg_calls, jf.b.c().b(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), (tL_paymentRequestedInfo.email == null && this.G0 == null) ? false : true);
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = str;
        c2Var.T = str2;
        showDialog(c2Var);
    }

    public final void G0(Runnable runnable) {
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
        h3Var.fixNavigationBar();
        h3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        h3Var.bigTitle = true;
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
        h3Var.items = charSequenceArr;
        h3Var.itemIcons = iArr;
        h3Var.onClickListener = a3Var;
        showDialog(h3Var);
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
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.cr, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.cr, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.cr, Float>) property3, 1.0f));
                } else {
                    this.U.setVisibility(0);
                    this.W.setEnabled(true);
                    AnimatorSet animatorSet3 = this.v;
                    org.telegram.ui.Components.cr crVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(crVar, (Property<org.telegram.ui.Components.cr, Float>) property4, 0.1f);
                    org.telegram.ui.Components.cr crVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(crVar2, (Property<org.telegram.ui.Components.cr, Float>) property5, 0.1f);
                    org.telegram.ui.Components.cr crVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(crVar3, (Property<org.telegram.ui.Components.cr, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.U, (Property<TextView, Float>) property6, 1.0f));
                }
                this.v.addListener(new zn0(this, z11, i10));
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
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.cr, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.cr, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.cr, Float>) property9, 1.0f));
        } else if (this.w != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.cr, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.cr, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.cr, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.v;
            org.telegram.ui.Components.cr crVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(crVar4, (Property<org.telegram.ui.Components.cr, Float>) property10, 0.1f);
            org.telegram.ui.Components.cr crVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(crVar5, (Property<org.telegram.ui.Components.cr, Float>) property11, 0.1f);
            org.telegram.ui.Components.cr crVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(crVar6, (Property<org.telegram.ui.Components.cr, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.v.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.v.addListener(new zn0(this, z11, i11));
        this.v.setDuration(150L);
        this.v.start();
    }

    public final void I0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.p0, this.q0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new gn0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
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
            org.telegram.ui.Cells.l4[] l4VarArr = this.I;
            org.telegram.ui.Cells.ca[] caVarArr = this.N;
            if (password == null) {
                H0(true, true);
                e9VarArr[2].setVisibility(8);
                caVarArr[0].setVisibility(8);
                caVarArr[1].setVisibility(8);
                this.S.setVisibility(8);
                l4VarArr[0].setVisibility(8);
                l4VarArr[1].setVisibility(8);
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
                caVarArr[0].setVisibility(8);
                caVarArr[1].setVisibility(8);
                e9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.S.setVisibility(8);
                l4VarArr[0].setVisibility(0);
                l4VarArr[1].setVisibility(0);
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
            caVarArr[0].setVisibility(0);
            caVarArr[1].setVisibility(0);
            this.S.setVisibility(0);
            e9VarArr[1].setText("");
            l4VarArr[0].setVisibility(8);
            l4VarArr[1].setVisibility(8);
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
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, b7Var.getContext(), b7Var, null);
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
                    spannableStringBuilder.setSpan(new fo0(this), i10, i11 - 1, 33);
                }
            }
            this.L.setEnabled(true);
            e9VarArr[0].setText(spannableStringBuilder);
            this.L.setVisibility(0);
            e9VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.b7 b7Var2 = b7VarArr[2];
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7, b7Var2.getContext(), b7Var2, null);
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.ei);
            int childCount = this.s0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.s0.getChildAt(i10);
                if (textView2.getTag().equals(this.H0)) {
                    org.telegram.ui.ActionBar.k6.z1(themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.fi, this.Y0);
                } else {
                    org.telegram.ui.ActionBar.k6.z1(536870911 & themedColor, textView2.getBackground());
                    org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.Z8, this.Y0);
                }
                textView2.invalidate();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    /* JADX WARN: Code restructure failed: missing block: B:178:0x030d, code lost:
    
        if (r15.email_requested == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x1015, code lost:
    
        if (r12.email_requested == false) goto L466;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0d2c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c38  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0214  */
    /* JADX WARN: Type inference failed for: r3v313, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v317, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v318, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v353, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v177, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v332, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v333, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        String str;
        String str2;
        String str3;
        char c10;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z10;
        int i11;
        int i12;
        int i13;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.b7 b7Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str4;
        ?? frameLayout;
        int i14;
        String str5;
        int i15;
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
        this.actionBar.setActionBarMenuOnItemClick(new tn0(this));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        int i16 = this.u0;
        int i17 = 6;
        int i18 = 3;
        if (i16 == 0 || i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4 || i16 == 6) {
            this.n = m10.h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(context, 1);
            this.r = crVar;
            crVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, w7.z5.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout2, getResourceProvider());
        ScrollView scrollView = new ScrollView(context);
        this.E = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.E, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        frameLayout2.addView(this.E, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.u0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        int i19 = 0;
        this.Q.setClipChildren(false);
        int i20 = -2;
        this.E.addView(this.Q, new FrameLayout.LayoutParams(-1, -2));
        int i21 = this.u0;
        int i22 = 10;
        int i23 = 2;
        String str8 = "";
        int i24 = 1;
        String str9 = null;
        if (i21 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e) {
                e = e;
                i11 = i19;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i19, split[2]);
                    i11 = i19;
                    try {
                        this.b.put(split[2], split[i11]);
                        this.c.put(split[i11], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[i11], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i19 = i11;
                    } catch (Exception e7) {
                        e = e7;
                    }
                } else {
                    i11 = i19;
                    bufferedReader.close();
                    Collections.sort(this.a, new o70(3));
                    this.f = new EditTextBoldCursor[10];
                    i12 = i11;
                    while (i12 < i22) {
                        if (i12 == 0) {
                            this.I[i11] = new org.telegram.ui.Cells.l4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[i11], getResourceProvider());
                            this.I[i11].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.Q.addView(this.I[i11], w7.z5.n(-1, -2));
                        } else if (i12 == i17) {
                            this.K[i11] = new org.telegram.ui.Cells.b7(context, (Object) null);
                            this.Q.addView(this.K[i11], w7.z5.n(-1, -2));
                            this.I[i24] = new org.telegram.ui.Cells.l4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[i24], getResourceProvider());
                            this.I[i24].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.Q.addView(this.I[i24], w7.z5.n(-1, -2));
                        }
                        if (i12 == 8) {
                            frameLayout = new LinearLayout(context);
                            ?? r42 = i11;
                            frameLayout.setClipChildren(r42);
                            frameLayout.setOrientation(r42 == true ? 1 : 0);
                            this.Q.addView(frameLayout, w7.z5.n(-1, 50));
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, getResourceProvider());
                        } else if (i12 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.Q.addView(frameLayout, w7.z5.n(-1, 50));
                            int i25 = org.telegram.ui.ActionBar.k6.d6;
                            org.telegram.ui.ActionBar.r6.i(i25, frameLayout, getResourceProvider());
                            int i26 = i12 != 5 ? i24 : 0;
                            if (i26 != 0) {
                                if (i12 != 7 || this.C0.invoice.phone_requested) {
                                    if (i12 == i17) {
                                        TLRPC.TL_invoice tL_invoice2 = this.C0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                i26 = 0;
                            }
                            if (i26 != 0) {
                                org.telegram.ui.Components.un unVar = new org.telegram.ui.Components.un(context, 18);
                                org.telegram.ui.ActionBar.r6.i(i25, unVar, getResourceProvider());
                                this.J.add(unVar);
                                frameLayout.addView(unVar, new FrameLayout.LayoutParams(-1, i24, 83));
                            }
                        }
                        if (i12 == 9) {
                            this.f[i12] = new org.telegram.ui.Components.o40(context);
                        } else {
                            this.f[i12] = new EditTextBoldCursor(context);
                        }
                        this.f[i12].setTag(Integer.valueOf(i12));
                        this.f[i12].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.F(this.f[i12], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor = this.f[i12];
                        int i27 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i27, getResourceProvider());
                        this.f[i12].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.x(this.f[i12], i27, getResourceProvider());
                        this.f[i12].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i12].setCursorWidth(1.5f);
                        if (i12 == 4) {
                            final int i28 = 0;
                            this.f[i12].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.dn0
                                public final /* synthetic */ io0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i28) {
                                        case 0:
                                            io0 io0Var = this.b;
                                            if (io0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar = new rt(null, false);
                                                    rtVar.n = true;
                                                    rtVar.r = new gn0(io0Var, 4);
                                                    io0Var.presentFragment(rtVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            io0 io0Var2 = this.b;
                                            if (io0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar2 = new rt(null, false);
                                                    rtVar2.n = true;
                                                    rtVar2.r = new gn0(io0Var2, 2);
                                                    io0Var2.presentFragment(rtVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i12].setInputType(0);
                        }
                        if (i12 == 9 || i12 == 8) {
                            this.f[i12].setInputType(i18);
                        } else if (i12 == 7) {
                            this.f[i12].setInputType(1);
                        } else {
                            this.f[i12].setInputType(16385);
                        }
                        this.f[i12].setImeOptions(268435461);
                        switch (i12) {
                            case 0:
                                this.f[i12].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i12].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i12].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i12].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i12].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i12].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i12].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i12].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i12].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str10 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str11 = this.C0.saved_info.shipping_address.country_iso2;
                                    this.B0 = str11;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i12];
                                    if (str10 == null) {
                                        str10 = str11;
                                    }
                                    editTextBoldCursor2.setText(str10);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i12].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i12].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i12].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str6 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i12].setText(str6);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i12].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.C0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str7 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i12].setText(str7);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i12];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i12 == 8) {
                            TextView textView = new TextView(context);
                            this.H = textView;
                            textView.setText("+");
                            org.telegram.ui.ActionBar.r6.W(this.H, i27, getResourceProvider());
                            this.H.setTextSize(1, 16.0f);
                            frameLayout.addView(this.H, w7.z5.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i12].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                            this.f[i12].setGravity(19);
                            this.f[i12].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i12], w7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i12].addTextChangedListener(new ao0(this));
                        } else if (i12 == 9) {
                            this.f[i12].setPadding(0, 0, 0, 0);
                            this.f[i12].setGravity(19);
                            frameLayout.addView(this.f[i12], w7.z5.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i12].addTextChangedListener(new rr(this, 4));
                        } else {
                            this.f[i12].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i12].setGravity(LocaleController.isRTL ? 5 : i18);
                            frameLayout.addView(this.f[i12], w7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i29 = i23;
                        this.f[i12].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.en0
                            public final /* synthetic */ io0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i30, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i29) {
                                    case 0:
                                        io0 io0Var = this.b;
                                        if (i30 != 6) {
                                            io0Var.getClass();
                                            break;
                                        } else {
                                            io0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        io0 io0Var2 = this.b;
                                        if (i30 != 6) {
                                            io0Var2.getClass();
                                            if (i30 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        io0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    io0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            io0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        io0 io0Var3 = this.b;
                                        io0Var3.getClass();
                                        if (i30 != 5) {
                                            if (i30 == 6) {
                                                io0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = io0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    io0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        io0 io0Var4 = this.b;
                                        io0Var4.getClass();
                                        if (i30 != 5) {
                                            if (i30 == 6) {
                                                io0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i31 = intValue3 + 1;
                                                editTextBoldCursorArr = io0Var4.f;
                                                if (i31 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i31 == 4 ? intValue3 + 2 : i31;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            io0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        io0 io0Var5 = this.b;
                                        if (i30 != 6) {
                                            io0Var5.getClass();
                                            break;
                                        } else {
                                            io0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i12 == 9) {
                            TLRPC.TL_invoice tL_invoice3 = this.C0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user = null;
                                int i30 = 0;
                                while (i30 < this.C0.users.size()) {
                                    TLRPC.User user2 = this.C0.users.get(i30);
                                    int i31 = i18;
                                    int i32 = i17;
                                    String str12 = str8;
                                    if (user2.id == this.C0.provider_id) {
                                        user = user2;
                                    }
                                    i30++;
                                    i18 = i31;
                                    i17 = i32;
                                    str8 = str12;
                                }
                                i14 = i17;
                                str5 = str8;
                                i15 = i18;
                                String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : str5;
                                z11 = true;
                                this.M[1] = new org.telegram.ui.Cells.e9(context, this.Y0);
                                org.telegram.ui.ActionBar.r6.c0(this.M[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                                this.Q.addView(this.M[1], w7.z5.n(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.C0.invoice;
                                boolean z12 = tL_invoice4.email_to_provider;
                                if (z12 && tL_invoice4.phone_to_provider) {
                                    this.M[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, formatName));
                                } else if (z12) {
                                    this.M[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, formatName));
                                } else {
                                    this.M[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, formatName));
                                }
                            } else {
                                this.K[1] = new org.telegram.ui.Cells.b7(context, (Object) null);
                                this.Q.addView(this.K[1], w7.z5.n(-1, -2));
                                i14 = i17;
                                str5 = str8;
                                i15 = i18;
                                z11 = true;
                            }
                            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context, this.Y0);
                            this.L = w8Var;
                            org.telegram.ui.ActionBar.r6.T(w8Var, org.telegram.ui.ActionBar.k6.M0(z11), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                            this.L.f(LocaleController.getString(R.string.PaymentShippingSave), this.T0, false);
                            this.Q.addView(this.L, w7.z5.n(-1, -2));
                            this.L.setOnClickListener(new cn0(this, 8));
                            this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.c0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            this.M[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.Q.addView(this.M[0], w7.z5.n(-1, -2));
                        } else {
                            i14 = i17;
                            str5 = str8;
                            i15 = i18;
                        }
                        i12++;
                        i18 = i15;
                        i17 = i14;
                        str8 = str5;
                        i22 = 10;
                        i23 = 2;
                        i24 = 1;
                        i11 = 0;
                    }
                    int i33 = i17;
                    int i34 = i18;
                    if (this.C0.invoice.name_requested) {
                        i13 = 8;
                        ((ViewGroup) this.f[i33].getParent()).setVisibility(8);
                    } else {
                        i13 = 8;
                    }
                    if (!this.C0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i13].getParent()).setVisibility(i13);
                    }
                    if (!this.C0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i13);
                    }
                    tL_invoice = this.C0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f[i33].setImeOptions(268435462);
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
                    org.telegram.ui.Cells.l4 l4Var = this.I[1];
                    TLRPC.TL_invoice tL_invoice7 = this.C0.invoice;
                    l4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.C0.invoice.shipping_address_requested) {
                        this.I[0].setVisibility(8);
                        this.K[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[i34].getParent()).setVisibility(8);
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
                Collections.sort(this.a, new o70(3));
                this.f = new EditTextBoldCursor[10];
                i12 = i11;
                while (i12 < i22) {
                }
                int i332 = i17;
                int i342 = i18;
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
                org.telegram.ui.Cells.l4 l4Var2 = this.I[1];
                TLRPC.TL_invoice tL_invoice72 = this.C0.invoice;
                l4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
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
            int i35 = 3;
            int i36 = 16;
            if (i21 == 2) {
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
                    this.Q.addView(this.O, w7.z5.n(-1, 50));
                    this.z0 = true;
                    H0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    AndroidUtilities.checkAndroidTheme(context, true);
                    org.telegram.ui.Components.w91 w91Var = new org.telegram.ui.Components.w91(this, context);
                    this.w = w91Var;
                    w91Var.getSettings().setJavaScriptEnabled(true);
                    this.w.getSettings().setDomStorageEnabled(true);
                    this.w.getSettings().setSupportZoom(true);
                    this.w.getSettings().setBuiltInZoomControls(true);
                    this.w.getSettings().setDisplayZoomControls(false);
                    this.w.getSettings().setUseWideViewPort(true);
                    this.w.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                    this.w.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.w.setWebViewClient(new bo0(this, context));
                    this.Q.addView(this.w, w7.z5.c(-2.0f, -1));
                    this.K[2] = new org.telegram.ui.Cells.b7(context, (Object) null);
                    this.Q.addView(this.K[2], w7.z5.n(-1, -2));
                    org.telegram.ui.Cells.w8 w8Var2 = new org.telegram.ui.Cells.w8(context, this.Y0);
                    this.L = w8Var2;
                    org.telegram.ui.ActionBar.r6.T(w8Var2, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                    this.L.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.U0, false);
                    this.Q.addView(this.L, w7.z5.n(-1, -2));
                    this.L.setOnClickListener(new cn0(this, 9));
                    this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                    org.telegram.ui.ActionBar.r6.c0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    K0();
                    this.Q.addView(this.M[0], w7.z5.n(-1, -2));
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
                    int i37 = 6;
                    this.f = new EditTextBoldCursor[6];
                    int i38 = 0;
                    while (i38 < i37) {
                        if (i38 == 0) {
                            this.I[0] = new org.telegram.ui.Cells.l4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.Q.addView(this.I[0], w7.z5.n(-1, -2));
                        } else if (i38 == 4) {
                            this.I[1] = new org.telegram.ui.Cells.l4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[1], getResourceProvider());
                            this.I[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                            this.Q.addView(this.I[1], w7.z5.n(-1, -2));
                        }
                        boolean z13 = (i38 == i35 || i38 == 5 || (i38 == 4 && !this.h0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i39 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i39, frameLayout3, getResourceProvider());
                        this.Q.addView(frameLayout3, w7.z5.n(-1, 50));
                        this.f[i38] = new EditTextBoldCursor(context);
                        this.f[i38].setTag(Integer.valueOf(i38));
                        this.f[i38].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.F(this.f[i38], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i38];
                        int i40 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor4, i40, getResourceProvider());
                        this.f[i38].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.x(this.f[i38], i40, getResourceProvider());
                        this.f[i38].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i38].setCursorWidth(1.5f);
                        if (i38 == 3) {
                            this.f[i38].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i38].setInputType(130);
                            this.f[i38].setTypeface(Typeface.DEFAULT);
                            this.f[i38].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i38 == 0) {
                            this.f[i38].setInputType(3);
                        } else if (i38 == 4) {
                            final int i41 = 1;
                            this.f[i38].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.dn0
                                public final /* synthetic */ io0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i41) {
                                        case 0:
                                            io0 io0Var = this.b;
                                            if (io0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar = new rt(null, false);
                                                    rtVar.n = true;
                                                    rtVar.r = new gn0(io0Var, 4);
                                                    io0Var.presentFragment(rtVar);
                                                }
                                                break;
                                            }
                                            break;
                                        default:
                                            io0 io0Var2 = this.b;
                                            if (io0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar2 = new rt(null, false);
                                                    rtVar2.n = true;
                                                    rtVar2.r = new gn0(io0Var2, 2);
                                                    io0Var2.presentFragment(rtVar2);
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i38].setInputType(0);
                        } else if (i38 == 1) {
                            this.f[i38].setInputType(16386);
                        } else if (i38 == 2) {
                            this.f[i38].setInputType(4097);
                        } else {
                            this.f[i38].setInputType(16385);
                            this.f[i38].setImeOptions(268435461);
                            if (i38 != 0) {
                                this.f[i38].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                            } else if (i38 == 1) {
                                this.f[i38].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                            } else if (i38 == 2) {
                                this.f[i38].setHint(LocaleController.getString(R.string.PaymentCardName));
                            } else if (i38 == 3) {
                                this.f[i38].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                            } else if (i38 == 4) {
                                this.f[i38].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                            } else if (i38 == 5) {
                                this.f[i38].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                            }
                            if (i38 != 0) {
                                this.f[i38].addTextChangedListener(new co0(this));
                            } else if (i38 == 1) {
                                this.f[i38].addTextChangedListener(new do0(this));
                            }
                            this.f[i38].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i38].setGravity(!LocaleController.isRTL ? 5 : 3);
                            frameLayout3.addView(this.f[i38], w7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i42 = 3;
                            this.f[i38].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.en0
                                public final /* synthetic */ io0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i302, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i42) {
                                        case 0:
                                            io0 io0Var = this.b;
                                            if (i302 != 6) {
                                                io0Var.getClass();
                                                break;
                                            } else {
                                                io0Var.A0(false);
                                                break;
                                            }
                                        case 1:
                                            io0 io0Var2 = this.b;
                                            if (i302 != 6) {
                                                io0Var2.getClass();
                                                if (i302 == 5) {
                                                    int intValue = ((Integer) textView2.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            io0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        io0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                io0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            io0 io0Var3 = this.b;
                                            io0Var3.getClass();
                                            if (i302 != 5) {
                                                if (i302 == 6) {
                                                    io0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = io0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        io0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            io0 io0Var4 = this.b;
                                            io0Var4.getClass();
                                            if (i302 != 5) {
                                                if (i302 == 6) {
                                                    io0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                do {
                                                    int i312 = intValue3 + 1;
                                                    editTextBoldCursorArr = io0Var4.f;
                                                    if (i312 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i312 == 4 ? intValue3 + 2 : i312;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                io0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            io0 io0Var5 = this.b;
                                            if (i302 != 6) {
                                                io0Var5.getClass();
                                                break;
                                            } else {
                                                io0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i38 != 3) {
                                this.K[0] = new org.telegram.ui.Cells.b7(context, (Object) null);
                                this.Q.addView(this.K[0], w7.z5.n(-1, -2));
                            } else if (i38 == 5) {
                                this.K[2] = new org.telegram.ui.Cells.b7(context, (Object) null);
                                this.Q.addView(this.K[2], w7.z5.n(-1, -2));
                                org.telegram.ui.Cells.w8 w8Var3 = new org.telegram.ui.Cells.w8(context, this.Y0);
                                this.L = w8Var3;
                                org.telegram.ui.ActionBar.r6.T(w8Var3, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i39), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                                this.L.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.U0, false);
                                this.Q.addView(this.L, w7.z5.n(-1, -2));
                                this.L.setOnClickListener(new cn0(this, 10));
                                this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                                org.telegram.ui.ActionBar.r6.c0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                                K0();
                                this.Q.addView(this.M[0], w7.z5.n(-1, -2));
                            } else if (i38 == 0) {
                                n0(context);
                                frameLayout3.addView(this.O, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                            }
                            if (!z13) {
                                org.telegram.ui.Components.un unVar2 = new org.telegram.ui.Components.un(context, 19);
                                org.telegram.ui.ActionBar.r6.i(i39, unVar2, getResourceProvider());
                                this.J.add(unVar2);
                                frameLayout3.addView(unVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            if ((i38 == 4 && !this.g0) || ((i38 == 5 && !this.h0) || (i38 == 2 && !this.i0))) {
                                frameLayout3.setVisibility(8);
                            }
                            i38++;
                            i37 = 6;
                            i35 = 3;
                        }
                        this.f[i38].setImeOptions(268435461);
                        if (i38 != 0) {
                        }
                        if (i38 != 0) {
                        }
                        this.f[i38].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i38].setGravity(!LocaleController.isRTL ? 5 : 3);
                        frameLayout3.addView(this.f[i38], w7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i422 = 3;
                        this.f[i38].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.en0
                            public final /* synthetic */ io0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i302, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i422) {
                                    case 0:
                                        io0 io0Var = this.b;
                                        if (i302 != 6) {
                                            io0Var.getClass();
                                            break;
                                        } else {
                                            io0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        io0 io0Var2 = this.b;
                                        if (i302 != 6) {
                                            io0Var2.getClass();
                                            if (i302 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        io0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    io0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            io0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        io0 io0Var3 = this.b;
                                        io0Var3.getClass();
                                        if (i302 != 5) {
                                            if (i302 == 6) {
                                                io0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = io0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    io0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        io0 io0Var4 = this.b;
                                        io0Var4.getClass();
                                        if (i302 != 5) {
                                            if (i302 == 6) {
                                                io0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i312 = intValue3 + 1;
                                                editTextBoldCursorArr = io0Var4.f;
                                                if (i312 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i312 == 4 ? intValue3 + 2 : i312;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            io0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        io0 io0Var5 = this.b;
                                        if (i302 != 6) {
                                            io0Var5.getClass();
                                            break;
                                        } else {
                                            io0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i38 != 3) {
                        }
                        if (!z13) {
                        }
                        if (i38 == 4) {
                            frameLayout3.setVisibility(8);
                            i38++;
                            i37 = 6;
                            i35 = 3;
                        }
                        frameLayout3.setVisibility(8);
                        i38++;
                        i37 = 6;
                        i35 = 3;
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
            } else if (i21 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.E0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new org.telegram.ui.Cells.k6[size];
                int i43 = 0;
                while (i43 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.E0.shipping_options.get(i43);
                    this.h[i43] = new org.telegram.ui.Cells.k6(context);
                    this.h[i43].setTag(Integer.valueOf(i43));
                    org.telegram.ui.ActionBar.r6.T(this.h[i43], org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                    this.h[i43].c(a1.g.D(s0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i43 == 0, i43 != size + (-1));
                    this.h[i43].setOnClickListener(new cn0(this, 11));
                    this.Q.addView(this.h[i43]);
                    i43++;
                }
                this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                org.telegram.ui.ActionBar.r6.c0(this.M[0], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                this.Q.addView(this.M[0], w7.z5.n(-1, -2));
            } else {
                int i44 = 13;
                if (i21 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i45 = 0;
                    for (int i46 = 2; i45 < i46; i46 = 2) {
                        if (i45 == 0) {
                            z10 = false;
                            this.I[0] = new org.telegram.ui.Cells.l4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.Q.addView(this.I[0], w7.z5.n(-1, -2));
                        } else {
                            z10 = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z10);
                        this.Q.addView(frameLayout4, w7.z5.n(-1, 50));
                        int i47 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i47, frameLayout4, getResourceProvider());
                        boolean z14 = i45 != 1;
                        if (z14) {
                            if (i45 != 7 || this.C0.invoice.phone_requested) {
                                if (i45 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.C0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z14 = false;
                        }
                        if (z14) {
                            org.telegram.ui.Components.un unVar3 = new org.telegram.ui.Components.un(context, i36);
                            org.telegram.ui.ActionBar.r6.i(i47, unVar3, getResourceProvider());
                            this.J.add(unVar3);
                            frameLayout4.addView(unVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i45] = new EditTextBoldCursor(context);
                        this.f[i45].setTag(Integer.valueOf(i45));
                        this.f[i45].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.F(this.f[i45], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i45];
                        int i48 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor5, i48, getResourceProvider());
                        this.f[i45].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.x(this.f[i45], i48, getResourceProvider());
                        this.f[i45].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i45].setCursorWidth(1.5f);
                        if (i45 == 0) {
                            this.f[i45].setOnTouchListener(new di.d(28));
                            this.f[i45].setInputType(0);
                        } else {
                            this.f[i45].setInputType(129);
                            this.f[i45].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i45].setImeOptions(268435462);
                        if (i45 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i45];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i45 == 1) {
                            this.f[i45].setHint(LocaleController.getString(R.string.LoginPassword));
                            this.f[i45].requestFocus();
                        }
                        this.f[i45].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i45].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout4.addView(this.f[i45], w7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i49 = 4;
                        this.f[i45].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.en0
                            public final /* synthetic */ io0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i302, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i49) {
                                    case 0:
                                        io0 io0Var = this.b;
                                        if (i302 != 6) {
                                            io0Var.getClass();
                                            break;
                                        } else {
                                            io0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        io0 io0Var2 = this.b;
                                        if (i302 != 6) {
                                            io0Var2.getClass();
                                            if (i302 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        io0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    io0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            io0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        io0 io0Var3 = this.b;
                                        io0Var3.getClass();
                                        if (i302 != 5) {
                                            if (i302 == 6) {
                                                io0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = io0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    io0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        io0 io0Var4 = this.b;
                                        io0Var4.getClass();
                                        if (i302 != 5) {
                                            if (i302 == 6) {
                                                io0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i312 = intValue3 + 1;
                                                editTextBoldCursorArr = io0Var4.f;
                                                if (i312 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i312 == 4 ? intValue3 + 2 : i312;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            io0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        io0 io0Var5 = this.b;
                                        if (i302 != 6) {
                                            io0Var5.getClass();
                                            break;
                                        } else {
                                            io0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i45 == 1) {
                            this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            org.telegram.ui.Cells.e9 e9Var2 = this.M[0];
                            int i50 = R.string.PaymentConfirmationMessage;
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.y0;
                            e9Var2.setText(LocaleController.formatString("PaymentConfirmationMessage", i50, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.e9 e9Var3 = this.M[0];
                            int i51 = R.drawable.greydivider;
                            int i52 = org.telegram.ui.ActionBar.k6.b7;
                            org.telegram.ui.ActionBar.r6.c0(e9Var3, context, i51, i52);
                            this.Q.addView(this.M[0], w7.z5.n(-1, -2));
                            this.N[0] = new org.telegram.ui.Cells.ca(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.T(this.N[0], org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i47), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                            this.N[0].b(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                            this.Q.addView(this.N[0], w7.z5.n(-1, -2));
                            this.N[0].setOnClickListener(new cn0(this, i44));
                            this.M[1] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.c0(this.M[1], context, R.drawable.greydivider_bottom, i52);
                            this.Q.addView(this.M[1], w7.z5.n(-1, -2));
                        }
                        i45++;
                        i36 = 16;
                    }
                } else if (i21 == 4 || i21 == 5) {
                    org.telegram.ui.Cells.k5 k5Var = new org.telegram.ui.Cells.k5(context);
                    this.X = k5Var;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, k5Var, getResourceProvider());
                    MessageObject messageObject = this.N0;
                    if (messageObject != null) {
                        this.X.b((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.p0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.D0;
                        if (paymentReceipt != null) {
                            this.X.c(paymentReceipt, this.p0);
                        } else if (this.O0 != null || this.b1 != null) {
                            org.telegram.ui.Cells.k5 k5Var2 = this.X;
                            TLRPC.PaymentForm paymentForm4 = this.C0;
                            k5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.p0, paymentForm4);
                        }
                    }
                    this.Q.addView(this.X, w7.z5.n(-1, -2));
                    this.K[0] = new org.telegram.ui.Cells.b7(context, (Object) null);
                    this.Q.addView(this.K[0], w7.z5.n(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.C0.invoice.prices);
                    this.t0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.G0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.R0 = new String[1];
                    for (int i53 = 0; i53 < this.t0.size(); i53++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.t0.get(i53);
                        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, f9Var, getResourceProvider());
                        f9Var.a(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.C0.invoice.currency), false);
                        this.Q.addView(f9Var);
                    }
                    int i54 = 5;
                    if (this.u0 == 5 && this.H0 != null) {
                        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, f9Var2, getResourceProvider());
                        f9Var2.a(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.H0.longValue(), this.C0.invoice.currency), false);
                        this.Q.addView(f9Var2);
                    }
                    org.telegram.ui.Cells.f9 f9Var3 = new org.telegram.ui.Cells.f9(context);
                    this.R = f9Var3;
                    int i55 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.r6.i(i55, f9Var3, getResourceProvider());
                    this.R0[0] = s0(this.t0);
                    this.R.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.R0[0], true);
                    float f7 = 14.0f;
                    if (this.u0 != 4 || (this.C0.invoice.flags & 256) == 0) {
                        i10 = -2;
                        str = "";
                    } else {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        frameLayout5.setClipChildren(false);
                        org.telegram.ui.ActionBar.r6.i(i55, frameLayout5, getResourceProvider());
                        this.Q.addView(frameLayout5, w7.z5.n(-1, this.C0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout5.setOnClickListener(new cn0(this, 14));
                        org.telegram.ui.Cells.f9 f9Var4 = new org.telegram.ui.Cells.f9(context);
                        org.telegram.ui.ActionBar.r6.i(i55, f9Var4, getResourceProvider());
                        f9Var4.a(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                        frameLayout5.addView(f9Var4);
                        this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f[0].setTag(0);
                        this.f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                        int i56 = org.telegram.ui.ActionBar.k6.z6;
                        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor7, i56, getResourceProvider());
                        org.telegram.ui.ActionBar.r6.W(this.f[0], i56, getResourceProvider());
                        this.f[0].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.x(this.f[0], org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
                        this.f[0].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[0].setCursorWidth(1.5f);
                        this.f[0].setInputType(3);
                        this.f[0].setImeOptions(268435462);
                        str = "";
                        this.f[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.C0.invoice.currency));
                        this.f[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[0].setGravity(LocaleController.isRTL ? 3 : 5);
                        frameLayout5.addView(this.f[0], w7.z5.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f[0].addTextChangedListener(new kn0(this));
                        this.f[0].setOnEditorActionListener(new org.telegram.ui.Components.s2(3));
                        this.f[0].requestFocus();
                        if (!this.C0.invoice.suggested_tip_amounts.isEmpty()) {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout5.addView(horizontalScrollView, w7.z5.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.C0.invoice.suggested_tip_amounts.size();
                            ln0 ln0Var = new ln0(context, size2, iArr, iArr2);
                            this.s0 = ln0Var;
                            ln0Var.setOrientation(0);
                            horizontalScrollView.addView(this.s0, w7.z5.x(-1, 30, 51));
                            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.ei);
                            int i57 = 0;
                            while (i57 < size2) {
                                long longValue = LocaleController.isRTL ? this.C0.invoice.suggested_tip_amounts.get((size2 - i57) - 1).longValue() : this.C0.invoice.suggested_tip_amounts.get(i57).longValue();
                                String formatCurrencyString = LocaleController.getInstance().formatCurrencyString(longValue, this.C0.invoice.currency);
                                TextView g10 = org.telegram.messenger.v0.g(context, 1, f7);
                                g10.setTypeface(AndroidUtilities.bold());
                                g10.setLines(1);
                                g10.setTag(Long.valueOf(longValue));
                                g10.setMaxLines(1);
                                g10.setText(formatCurrencyString);
                                g10.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                                org.telegram.ui.ActionBar.r6.W(g10, org.telegram.ui.ActionBar.k6.Z8, getResourceProvider());
                                g10.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(15.0f), themedColor & 536870911));
                                g10.setSingleLine(true);
                                g10.setGravity(17);
                                this.s0.addView(g10, w7.z5.t(-2, -1, 19, 0, 0, i57 != size2 + (-1) ? 9 : 0, 0));
                                g10.setOnClickListener(new ai.t3(this, g10, longValue, 6));
                                int dp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(g10.getPaint().measureText(formatCurrencyString)));
                                g10.setTag(R.id.width_tag, Integer.valueOf(dp));
                                iArr[0] = Math.max(iArr[0], dp);
                                iArr2[0] = iArr2[0] + dp;
                                i57++;
                                i20 = -2;
                                size2 = size2;
                                i54 = 5;
                                f7 = 14.0f;
                            }
                        }
                        i10 = i20;
                    }
                    int i58 = i54;
                    this.Q.addView(this.R);
                    this.K[2] = new org.telegram.ui.Cells.b7(context, (Object) null);
                    org.telegram.ui.ActionBar.r6.c0(this.K[2], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    this.Q.addView(this.K[2], w7.z5.n(-1, i10));
                    this.Y[0] = new mn0(context);
                    org.telegram.ui.ActionBar.r6.T(this.Y[0], org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                    org.telegram.ui.Cells.d9 d9Var = this.Y[0];
                    String str13 = this.x0;
                    d9Var.b(R.drawable.msg_payment_card, (str13 == null || str13.length() <= 1) ? this.x0 : this.x0.substring(0, 1).toUpperCase() + this.x0.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), true);
                    int i59 = ((this.V0 || this.W0) && ((str2 = this.x0) == null || str2.length() <= 1)) ? 8 : 0;
                    int i60 = 0;
                    this.Y[0].setVisibility(i59);
                    this.Q.addView(this.Y[0]);
                    if (this.u0 == 4) {
                        this.Y[0].setOnClickListener(new cn0(this, i60));
                    }
                    TLRPC.User user3 = null;
                    for (int i61 = 0; i61 < this.C0.users.size(); i61++) {
                        TLRPC.User user4 = this.C0.users.get(i61);
                        if (user4.id == this.C0.provider_id) {
                            user3 = user4;
                        }
                    }
                    char c11 = 1;
                    this.Y[1] = new org.telegram.ui.Cells.d9(context);
                    org.telegram.ui.Cells.d9 d9Var2 = this.Y[1];
                    org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
                    int i62 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i62);
                    int i63 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.T(d9Var2, M0, O, org.telegram.ui.ActionBar.r6.O(i63));
                    if (user3 != null) {
                        org.telegram.ui.Cells.d9 d9Var3 = this.Y[1];
                        str3 = ContactsController.formatName(user3.first_name, user3.last_name);
                        String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                        int i64 = R.drawable.msg_payment_provider;
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.I0;
                        d9Var3.b(i64, str3, string, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.G0 == null)) && ((tL_paymentRequestedInfo = this.C0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                        c11 = 1;
                        this.Q.addView(this.Y[1]);
                    } else {
                        str3 = str;
                    }
                    this.Y[c11].setVisibility(user3 != null ? i59 : 8);
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.I0;
                    if (tL_payments_validateRequestedInfo2 != null || (this.V0 && (paymentForm2 = this.C0) != null && paymentForm2.saved_info != null)) {
                        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.C0.saved_info;
                        this.Y[2] = new org.telegram.ui.Cells.d9(context);
                        this.Y[2].setVisibility(8);
                        this.Q.addView(this.Y[2]);
                        if (tL_paymentRequestedInfo12.shipping_address != null) {
                            this.Y[2].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.r6.T(this.Y[2], org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i62), org.telegram.ui.ActionBar.r6.O(i63));
                                this.Y[2].setOnClickListener(new cn0(this, 1));
                            } else {
                                org.telegram.ui.ActionBar.r6.i(i62, this.Y[2], getResourceProvider());
                            }
                        }
                        this.Y[3] = new org.telegram.ui.Cells.d9(context);
                        this.Y[3].setVisibility(8);
                        this.Q.addView(this.Y[3]);
                        if (tL_paymentRequestedInfo12.name != null) {
                            this.Y[3].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.r6.T(this.Y[3], org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i62), org.telegram.ui.ActionBar.r6.O(i63));
                                this.Y[3].setOnClickListener(new cn0(this, 2));
                            } else {
                                org.telegram.ui.ActionBar.r6.i(i62, this.Y[3], getResourceProvider());
                            }
                        }
                        this.Y[4] = new org.telegram.ui.Cells.d9(context);
                        this.Y[4].setVisibility(8);
                        this.Q.addView(this.Y[4]);
                        if (tL_paymentRequestedInfo12.phone != null) {
                            this.Y[4].setVisibility(0);
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.r6.T(this.Y[4], org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i62), org.telegram.ui.ActionBar.r6.O(i63));
                                this.Y[4].setOnClickListener(new cn0(this, 3));
                            } else {
                                org.telegram.ui.ActionBar.r6.i(i62, this.Y[4], getResourceProvider());
                            }
                        }
                        this.Y[i58] = new org.telegram.ui.Cells.d9(context);
                        this.Y[i58].setVisibility(8);
                        this.Q.addView(this.Y[i58]);
                        if (tL_paymentRequestedInfo12.email != null) {
                            this.Y[i58].setVisibility(0);
                            int i65 = 4;
                            if (this.u0 == 4) {
                                org.telegram.ui.ActionBar.r6.T(this.Y[i58], org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i62), org.telegram.ui.ActionBar.r6.O(i63));
                                this.Y[i58].setOnClickListener(new cn0(this, i65));
                            } else {
                                org.telegram.ui.ActionBar.r6.i(i62, this.Y[i58], getResourceProvider());
                            }
                        }
                        if (this.G0 != null) {
                            this.Y[6] = new org.telegram.ui.Cells.d9(context);
                            org.telegram.ui.ActionBar.r6.i(i62, this.Y[6], getResourceProvider());
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
                        this.W = new eo0(this, context);
                        View view = new View(context);
                        org.telegram.ui.ActionBar.r6.S(view, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i63), 2, -1), null, org.telegram.ui.ActionBar.r6.O(i63), this.Y0);
                        this.W.addView(view, w7.z5.c(-1.0f, -1));
                        frameLayout2.addView(this.W, w7.z5.e(-1, 48, 80));
                        this.W.setOnClickListener(new ae0(i58, this, str3));
                        TextView textView2 = new TextView(context);
                        this.U = textView2;
                        int i66 = org.telegram.ui.ActionBar.k6.fi;
                        org.telegram.ui.ActionBar.r6.W(textView2, i66, getResourceProvider());
                        this.U.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.R0[0]));
                        this.U.setTextSize(1, 14.0f);
                        this.U.setGravity(17);
                        this.U.setTypeface(AndroidUtilities.bold());
                        this.W.addView(this.U, w7.z5.c(-1.0f, -1));
                        org.telegram.ui.Components.cr crVar2 = new org.telegram.ui.Components.cr(context, 0);
                        this.s = crVar2;
                        crVar2.setVisibility(4);
                        int themedColor2 = getThemedColor(i66);
                        this.s.a(805306367 & themedColor2, themedColor2);
                        this.W.addView(this.s, w7.z5.c(-1.0f, -1));
                        this.W.a(this.F, false);
                        this.U.setAlpha(!this.F ? 0.8f : 1.0f);
                        this.n.setEnabled(false);
                        this.n.getContentView().setVisibility(4);
                        AndroidUtilities.checkAndroidTheme(context, true);
                        try {
                            rn0 rn0Var = new rn0(context);
                            this.w = rn0Var;
                            rn0Var.setBackgroundColor(-1);
                            this.w.getSettings().setJavaScriptEnabled(true);
                            this.w.getSettings().setDomStorageEnabled(true);
                            this.w.getSettings().setSupportZoom(true);
                            this.w.getSettings().setBuiltInZoomControls(true);
                            this.w.getSettings().setDisplayZoomControls(false);
                            this.w.getSettings().setUseWideViewPort(true);
                            this.w.getSettings().setMixedContentMode(0);
                            CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                            this.w.setWebViewClient(new sn0(this, context));
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
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
                                int indexOf = string2.indexOf(42);
                                int lastIndexOf = string2.lastIndexOf(42);
                                spannableStringBuilder = spannableStringBuilder2;
                                spannableStringBuilder = spannableStringBuilder2;
                                if (indexOf != -1 && lastIndexOf != -1) {
                                    SpannableString spannableString = new SpannableString(string2.substring(indexOf + 1, lastIndexOf));
                                    spannableString.setSpan(new org.telegram.ui.Components.q61(this.C0.invoice.terms_url), 0, spannableString.length(), 33);
                                    int i67 = lastIndexOf + 1;
                                    spannableStringBuilder2.replace(indexOf, i67, (CharSequence) spannableString);
                                    string2.substring(0, indexOf);
                                    spannableString.toString();
                                    string2.substring(i67);
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                            } else {
                                String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string3);
                                int indexOf2 = string3.indexOf(42);
                                int lastIndexOf2 = string3.lastIndexOf(42);
                                if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                    SpannableString spannableString2 = new SpannableString(string3.substring(indexOf2 + 1, lastIndexOf2));
                                    spannableString2.setSpan(new org.telegram.ui.Components.q61(this.C0.invoice.terms_url), 0, spannableString2.length(), 33);
                                    int i68 = lastIndexOf2 + 1;
                                    spannableStringBuilder3.replace(indexOf2, i68, (CharSequence) spannableString2);
                                    string3 = string3.substring(0, indexOf2) + ((Object) spannableString2) + string3.substring(i68);
                                }
                                int indexOf3 = string3.indexOf("%1$s");
                                spannableStringBuilder = spannableStringBuilder3;
                                if (indexOf3 != -1) {
                                    spannableStringBuilder3.replace(indexOf3, indexOf3 + 4, (CharSequence) this.p0);
                                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.j61(AndroidUtilities.bold()), indexOf3, this.p0.length() + indexOf3, 33);
                                    spannableStringBuilder = spannableStringBuilder3;
                                }
                            }
                            this.V.setText(spannableStringBuilder);
                            org.telegram.ui.Cells.p6 p6Var2 = this.V;
                            int i69 = org.telegram.ui.ActionBar.k6.d6;
                            int themedColor3 = getThemedColor(i69);
                            int i70 = org.telegram.ui.ActionBar.k6.i6;
                            org.telegram.ui.ActionBar.r6.S(p6Var2, org.telegram.ui.ActionBar.k6.h0(themedColor3, getThemedColor(i70)), org.telegram.ui.ActionBar.r6.O(i69), org.telegram.ui.ActionBar.r6.O(i70), getResourceProvider());
                            this.V.setOnClickListener(new cn0(this, 5));
                            frameLayout2.addView(this.V, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                        WebView webView = this.w;
                        if (webView != null) {
                            frameLayout2.addView(webView, w7.z5.c(-1.0f, -1));
                            this.w.setVisibility(8);
                        }
                    }
                    this.K[1] = new org.telegram.ui.Cells.b7(context, (Object) null);
                    org.telegram.ui.ActionBar.r6.c0(this.K[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    if (i59 != 0 && this.u0 == 4 && this.I0 == null && ((paymentForm = this.C0) == null || paymentForm.saved_info == null)) {
                        c10 = 1;
                        this.K[1].setVisibility(i59);
                    } else {
                        c10 = 1;
                    }
                    this.Q.addView(this.K[c10], w7.z5.n(-1, -2));
                } else if (i21 == 6) {
                    org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context);
                    this.S = i3Var;
                    String string4 = LocaleController.getString(R.string.PasswordCode);
                    EditTextBoldCursor editTextBoldCursor8 = i3Var.a;
                    editTextBoldCursor8.setText("");
                    editTextBoldCursor8.setHint(string4);
                    final int i71 = 0;
                    i3Var.b = false;
                    i3Var.setWillNotDraw(true);
                    org.telegram.ui.Cells.i3 i3Var2 = this.S;
                    int i72 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.r6.i(i72, i3Var2, getResourceProvider());
                    EditTextBoldCursor textView3 = this.S.getTextView();
                    textView3.setInputType(3);
                    textView3.setImeOptions(6);
                    textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.en0
                        public final /* synthetic */ io0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i302, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i71) {
                                case 0:
                                    io0 io0Var = this.b;
                                    if (i302 != 6) {
                                        io0Var.getClass();
                                        break;
                                    } else {
                                        io0Var.A0(false);
                                        break;
                                    }
                                case 1:
                                    io0 io0Var2 = this.b;
                                    if (i302 != 6) {
                                        io0Var2.getClass();
                                        if (i302 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    io0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                io0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        io0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    io0 io0Var3 = this.b;
                                    io0Var3.getClass();
                                    if (i302 != 5) {
                                        if (i302 == 6) {
                                            io0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = io0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                io0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    io0 io0Var4 = this.b;
                                    io0Var4.getClass();
                                    if (i302 != 5) {
                                        if (i302 == 6) {
                                            io0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i312 = intValue3 + 1;
                                            editTextBoldCursorArr = io0Var4.f;
                                            if (i312 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i312 == 4 ? intValue3 + 2 : i312;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        io0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    io0 io0Var5 = this.b;
                                    if (i302 != 6) {
                                        io0Var5.getClass();
                                        break;
                                    } else {
                                        io0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    textView3.addTextChangedListener(new n0(this, i44));
                    this.Q.addView(this.S, w7.z5.n(-1, -2));
                    this.M[2] = new org.telegram.ui.Cells.e9(context, this.Y0);
                    org.telegram.ui.ActionBar.r6.c0(this.M[2], context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                    this.Q.addView(this.M[2], w7.z5.n(-1, -2));
                    this.N[1] = new org.telegram.ui.Cells.ca(context, this.Y0);
                    org.telegram.ui.Cells.ca caVar = this.N[1];
                    org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.k6.M0(true);
                    org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i72);
                    int i73 = org.telegram.ui.ActionBar.k6.i6;
                    org.telegram.ui.ActionBar.r6.T(caVar, M02, O2, org.telegram.ui.ActionBar.r6.O(i73));
                    org.telegram.ui.Cells.ca caVar2 = this.N[1];
                    int i74 = org.telegram.ui.ActionBar.k6.G6;
                    caVar2.setTag(Integer.valueOf(i74));
                    org.telegram.ui.ActionBar.r6.W(this.N[1].getTextView(), i74, getResourceProvider());
                    this.N[1].b(LocaleController.getString(R.string.ResendCode), true);
                    this.Q.addView(this.N[1], w7.z5.n(-1, -2));
                    this.N[1].setOnClickListener(new cn0(this, 6));
                    this.N[0] = new org.telegram.ui.Cells.ca(context, this.Y0);
                    org.telegram.ui.ActionBar.r6.T(this.N[0], org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i72), org.telegram.ui.ActionBar.r6.O(i73));
                    org.telegram.ui.Cells.ca caVar3 = this.N[0];
                    int i75 = org.telegram.ui.ActionBar.k6.p7;
                    caVar3.setTag(Integer.valueOf(i75));
                    org.telegram.ui.ActionBar.r6.W(this.N[0].getTextView(), i75, getResourceProvider());
                    this.N[0].b(LocaleController.getString(R.string.AbortPassword), false);
                    this.Q.addView(this.N[0], w7.z5.n(-1, -2));
                    this.N[0].setOnClickListener(new cn0(this, 7));
                    this.f = new EditTextBoldCursor[3];
                    int i76 = 0;
                    for (int i77 = 3; i76 < i77; i77 = 3) {
                        if (i76 == 0) {
                            this.I[0] = new org.telegram.ui.Cells.l4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[0], getResourceProvider());
                            this.I[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                            this.Q.addView(this.I[0], w7.z5.n(-1, -2));
                        } else if (i76 == 2) {
                            this.I[1] = new org.telegram.ui.Cells.l4(context, this.Y0);
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.I[1], getResourceProvider());
                            this.I[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                            this.Q.addView(this.I[1], w7.z5.n(-1, -2));
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(false);
                        this.Q.addView(frameLayout6, w7.z5.n(-1, 50));
                        int i78 = org.telegram.ui.ActionBar.k6.d6;
                        org.telegram.ui.ActionBar.r6.i(i78, frameLayout6, getResourceProvider());
                        if (i76 == 0) {
                            org.telegram.ui.Components.un unVar4 = new org.telegram.ui.Components.un(context, 17);
                            org.telegram.ui.ActionBar.r6.i(i78, unVar4, getResourceProvider());
                            this.J.add(unVar4);
                            frameLayout6.addView(unVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i76] = new EditTextBoldCursor(context);
                        this.f[i76].setTag(Integer.valueOf(i76));
                        this.f[i76].setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.F(this.f[i76], org.telegram.ui.ActionBar.k6.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor9 = this.f[i76];
                        int i79 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor9, i79, getResourceProvider());
                        this.f[i76].setBackgroundDrawable(null);
                        org.telegram.ui.ActionBar.r6.x(this.f[i76], i79, getResourceProvider());
                        this.f[i76].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i76].setCursorWidth(1.5f);
                        if (i76 == 0 || i76 == 1) {
                            this.f[i76].setInputType(129);
                            this.f[i76].setTypeface(Typeface.DEFAULT);
                            this.f[i76].setImeOptions(268435461);
                        } else {
                            this.f[i76].setInputType(33);
                            this.f[i76].setImeOptions(268435462);
                        }
                        if (i76 == 0) {
                            this.f[i76].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                            this.f[i76].requestFocus();
                        } else if (i76 == 1) {
                            this.f[i76].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                        } else if (i76 == 2) {
                            this.f[i76].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                        }
                        this.f[i76].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i76].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout6.addView(this.f[i76], w7.z5.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i80 = 1;
                        this.f[i76].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.en0
                            public final /* synthetic */ io0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i302, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i80) {
                                    case 0:
                                        io0 io0Var = this.b;
                                        if (i302 != 6) {
                                            io0Var.getClass();
                                            break;
                                        } else {
                                            io0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        io0 io0Var2 = this.b;
                                        if (i302 != 6) {
                                            io0Var2.getClass();
                                            if (i302 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        io0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    io0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            io0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        io0 io0Var3 = this.b;
                                        io0Var3.getClass();
                                        if (i302 != 5) {
                                            if (i302 == 6) {
                                                io0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = io0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    io0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        io0 io0Var4 = this.b;
                                        io0Var4.getClass();
                                        if (i302 != 5) {
                                            if (i302 == 6) {
                                                io0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            do {
                                                int i312 = intValue3 + 1;
                                                editTextBoldCursorArr = io0Var4.f;
                                                if (i312 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i312 == 4 ? intValue3 + 2 : i312;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            io0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        io0 io0Var5 = this.b;
                                        if (i302 != 6) {
                                            io0Var5.getClass();
                                            break;
                                        } else {
                                            io0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i76 == 1) {
                            this.M[0] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            this.M[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                            org.telegram.ui.ActionBar.r6.c0(this.M[0], context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                            this.Q.addView(this.M[0], w7.z5.n(-1, -2));
                        } else if (i76 == 2) {
                            this.M[1] = new org.telegram.ui.Cells.e9(context, this.Y0);
                            this.M[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                            org.telegram.ui.ActionBar.r6.c0(this.M[1], context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            this.Q.addView(this.M[1], w7.z5.n(-1, -2));
                        }
                        i76++;
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

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.Y0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i10].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        if (this.h != null) {
            for (int i11 = 0; i11 < this.h.length; i11++) {
            }
        }
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.l4[] l4VarArr = this.I;
            if (i12 >= l4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(l4VarArr[i12], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            i12++;
        }
        for (int i13 = 0; i13 < this.K.length; i13++) {
        }
        for (int i14 = 0; i14 < this.M.length; i14++) {
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList2 = this.J;
            if (i15 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i15), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            i15++;
        }
        int i16 = 1;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        for (int i17 = 0; i17 < this.N.length; i17++) {
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s6));
        while (true) {
            org.telegram.ui.Cells.d9[] d9VarArr = this.Y;
            if (i16 >= d9VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i6));
                return arrayList;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(d9VarArr[i16], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
            i16++;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.G;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.d6);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6);
        frameLayout.setBackground(M0);
        org.telegram.ui.ActionBar.r6.k(frameLayout, M0, O, O2, null);
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
        this.O.addView(this.P, w7.z5.c(48.0f, -1));
        this.P.setOnClickListener(new cn0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.P.addView(linearLayout, w7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, w7.z5.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.P.addView(imageView2, w7.z5.c(-1.0f, -1));
    }

    public final void o0(String str) {
        boolean z10;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            boolean z11 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (str != null || z11) {
                if (str == null) {
                    str = jf.b.d(telephonyManager.getLine1Number(), false);
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
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
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c41(this, i11, intent, 7));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.u0 == 4 && this.X0) {
            this.X0 = false;
            this.W.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.u0 != 4 || this.V0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r0 != 6) goto L56;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        go0 go0Var = this.T;
        if (go0Var != null) {
            go0Var.b();
        }
        int i10 = 0;
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        if (!this.a1) {
            this.f1 = 2;
            if (this.Z0 != null) {
                org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
                if (h5Var != null && h5Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i10 >= this.parentLayout.getFragmentStack().size()) {
                            i10 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(i10)) instanceof io0) {
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
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            if (SharedConfig.allowScreenCapture) {
            }
            super.onFragmentDestroy();
            this.Q0 = true;
        }
        getParentActivity().getWindow().clearFlags(8192);
        AndroidUtilities.logFlagSecure();
        super.onFragmentDestroy();
        this.Q0 = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        try {
            int i10 = this.u0;
            if ((i10 == 2 || i10 == 6) && !this.C0.invoice.test) {
                getParentActivity().getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
                return;
            }
            if (SharedConfig.passcodeHash.length() != 0 && !SharedConfig.allowScreenCapture) {
                return;
            }
            getParentActivity().getWindow().clearFlags(8192);
            AndroidUtilities.logFlagSecure();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.E;
            if (scrollView != null) {
                AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, getThemedColor(org.telegram.ui.ActionBar.k6.s8));
            }
            if (this.f == null) {
                return;
            }
            getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i10 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, this.Y0);
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            AndroidUtilities.runOnUIThread(new fn0(this, 0), 100L);
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        y0(o2Var);
        return super.presentFragment(o2Var);
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
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l4 = this.H0;
        if (l4 != null) {
            j10 += l4.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j10, this.C0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.u0;
        if (i12 == 0) {
            go0 go0Var = this.T;
            if (go0Var != null) {
                go0Var.d(this.I0);
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
                G0(new fn0(this, 1));
                return;
            }
            io0 io0Var = new io0(this.b1, this.C0, this.N0, this.O0, i10, this.E0, null, null, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            io0Var.c1 = this.c1;
            io0Var.d1 = this.d1;
            presentFragment(io0Var, this.S0);
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
                    G0(new fn0(this, 1));
                    return;
                }
                io0 io0Var2 = new io0(this.b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                io0Var2.c1 = this.c1;
                io0Var2.d1 = this.d1;
                presentFragment(io0Var2, this.S0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            io0 io0Var22 = new io0(this.b1, this.C0, this.N0, this.O0, i11, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            io0Var22.c1 = this.c1;
            io0Var22.d1 = this.d1;
            presentFragment(io0Var22, this.S0);
            return;
        }
        if (i12 == 2) {
            TLRPC.PaymentForm paymentForm = this.C0;
            if (paymentForm.password_missing && (z10 = this.U0)) {
                io0 io0Var3 = new io0(this.b1, paymentForm, this.N0, this.O0, 6, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, z10, this.J0, this.r0, this.W0);
                this.f0 = io0Var3;
                io0Var3.c1 = this.c1;
                io0Var3.d1 = this.d1;
                io0Var3.C0(this.a0);
                io0 io0Var4 = this.f0;
                io0Var4.T = new wn0(this);
                presentFragment(io0Var4, this.S0);
                return;
            }
            go0 go0Var2 = this.T;
            if (go0Var2 != null) {
                go0Var2.c(this.w0, this.x0, this.U0, this.J0, null);
                finishFragment();
                return;
            } else {
                io0 io0Var5 = new io0(this.b1, paymentForm, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
                io0Var5.c1 = this.c1;
                io0Var5.d1 = this.d1;
                presentFragment(io0Var5, this.S0);
                return;
            }
        }
        if (i12 == 3) {
            io0 io0Var6 = new io0(this.b1, this.C0, this.N0, this.O0, this.v0 ? 4 : 2, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, this.W0);
            io0Var6.c1 = this.c1;
            io0Var6.d1 = this.d1;
            presentFragment(io0Var6, true);
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
            io0 io0Var7 = new io0(this.b1, this.C0, this.N0, this.O0, 4, this.E0, this.G0, this.H0, this.w0, this.x0, this.I0, this.U0, this.J0, this.r0, false);
            io0Var7.c1 = this.c1;
            io0Var7.d1 = this.d1;
            presentFragment(io0Var7, true);
            return;
        }
        if (this.V0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback != null) {
            AndroidUtilities.runOnUIThread(new fn0(this, 2), 500L);
        } else {
            if (x0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l4, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        if (o2Var != null) {
            this.currentAccount = o2Var.getCurrentAccount();
        }
        this.u0 = i10;
        this.r0 = o2Var;
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
            throw new IllegalArgumentException(i2.o1.k(i10, "Invalid environment value "));
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
            com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
            b10.a = 23705;
            b10.c = new le.b(eVar, 26);
            v0Var.e(0, b10.a()).addOnCompleteListener(getParentActivity(), new gn0(this, 0));
        }
    }

    public final void w0() {
        if (this.e0) {
            return;
        }
        this.e0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new in0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.h5 h5Var, Activity activity) {
        int i10 = 0;
        if (this.b1 != null) {
            if (h5Var != null) {
                ArrayList arrayList = new ArrayList(h5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                    if (o2Var instanceof io0) {
                        o2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.l0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.O0 == null) || (this.O0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.O0, getMessagesController().premiumInvoiceSlug))) && h5Var != null) {
            ArrayList arrayList2 = new ArrayList(h5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                if ((o2Var2 instanceof sn) || (o2Var2 instanceof PremiumPreviewFragment)) {
                    o2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.p0 = true;
            ((ActionBarLayout) h5Var).R(premiumPreviewFragment, !isFinishing());
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

    public final void y0(org.telegram.ui.ActionBar.o2 o2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (o2Var instanceof io0) {
            io0 io0Var = (io0) o2Var;
            io0Var.Z0 = this.Z0;
            io0Var.Y0 = this.Y0;
            io0Var.X0 = this.X0;
            io0Var.y0 = this.y0;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new a50(17, this, tL_payments_sendPaymentForm), (this.W0 ? 8 : 0) | 2);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        y0(o2Var);
        return super.presentFragment(o2Var, z10);
    }

    public io0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.l4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ca[2];
        this.Y = new org.telegram.ui.Cells.d9[7];
        this.Z = -4.5f;
        this.c0 = 6;
        this.V0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, o2Var, false);
    }

    public io0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.G = true;
        this.I = new org.telegram.ui.Cells.l4[3];
        this.J = new ArrayList();
        this.K = new org.telegram.ui.Cells.b7[3];
        this.M = new org.telegram.ui.Cells.e9[3];
        this.N = new org.telegram.ui.Cells.ca[2];
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
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.H0 = Long.valueOf(j10);
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

    public io0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.o2 o2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, o2Var, false);
        this.V0 = true;
    }
}
