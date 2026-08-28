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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class co0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final List c1 = Arrays.asList("http", "https");
    public static final List d1 = Collections.singletonList("tg");
    public ScrollView A;
    public TLRPC.TL_payments_validatedRequestedInfo A0;
    public boolean B;
    public TLRPC.TL_paymentFormMethod B0;
    public boolean C;
    public TLRPC.TL_shippingOption C0;
    public TextView D;
    public Long D0;
    public final org.telegram.ui.Cells.m4[] E;
    public TLRPC.TL_payments_validateRequestedInfo E0;
    public final ArrayList F;
    public TLRPC.TL_inputPaymentCredentialsGooglePay F0;
    public final org.telegram.ui.Cells.z6[] G;
    public String G0;
    public org.telegram.ui.Cells.t8 H;
    public String H0;
    public final org.telegram.ui.Cells.b9[] I;
    public JSONObject I0;
    public final org.telegram.ui.Cells.ba[] J;
    public MessageObject J0;
    public FrameLayout K;
    public String K0;
    public FrameLayout L;
    public boolean L0;
    public LinearLayout M;
    public boolean M0;
    public org.telegram.ui.Cells.c9 N;
    public String[] N0;
    public org.telegram.ui.Cells.k3 O;
    public boolean O0;
    public ao0 P;
    public boolean P0;
    public TextView Q;
    public boolean Q0;
    public org.telegram.ui.Cells.o6 R;
    public boolean R0;
    public yn0 S;
    public boolean S0;
    public org.telegram.ui.Cells.l5 T;
    public boolean T0;
    public final org.telegram.ui.Cells.a9[] U;
    public org.telegram.ui.ActionBar.b6 U0;
    public float V;
    public bo0 V0;
    public TL_account.Password W;
    public boolean W0;
    public boolean X;
    public TLRPC.InputInvoice X0;
    public int Y;
    public Utilities.Callback Y0;
    public bn0 Z;
    public Utilities.Callback Z0;
    public final ArrayList a;
    public boolean a0;
    public t10 a1;
    public final HashMap b;
    public co0 b0;
    public int b1;
    public final HashMap c;
    public boolean c0;
    public final HashMap d;
    public boolean d0;
    public com.google.android.gms.internal.clearcut.v0 e;
    public boolean e0;
    public EditTextBoldCursor[] f;
    public String f0;
    public boolean g0;
    public org.telegram.ui.Cells.j6[] h;
    public TLRPC.User h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public String m0;
    public org.telegram.ui.ActionBar.w0 n;
    public org.telegram.ui.ActionBar.o2 n0;
    public gn0 o0;
    public ArrayList p0;
    public int q0;
    public org.telegram.ui.Components.jq r;
    public boolean r0;
    public org.telegram.ui.Components.jq s;
    public String s0;
    public String t0;
    public TLRPC.TL_paymentSavedCredentialsCard u0;
    public AnimatorSet v;
    public boolean v0;
    public WebView w;
    public lt w0;
    public String x;
    public String x0;
    public boolean y;
    public TLRPC.PaymentForm y0;
    public final TLRPC.PaymentReceipt z0;

    public co0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i9, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.m4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.z6[3];
        this.I = new org.telegram.ui.Cells.b9[3];
        this.J = new org.telegram.ui.Cells.ba[2];
        this.U = new org.telegram.ui.Cells.a9[7];
        this.V = -4.5f;
        this.Y = 6;
        t0(inputInvoice, paymentForm, messageObject, str, i9, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, o2Var, z11);
    }

    public static /* synthetic */ void T(co0 co0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        v40 v40Var = new v40(18, co0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            v40Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(gettmppassword, v40Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        v40Var.run(null, tL_error2);
    }

    public static /* synthetic */ void U(co0 co0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        co0Var.C0(false);
        co0Var.G0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    co0Var.D0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    co0Var.D0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    co0Var.D0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    co0Var.D0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    co0Var.D0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    co0Var.D0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    co0Var.D0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    co0Var.D0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    co0Var.D0(7);
                    break;
                default:
                    org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void V(co0 co0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        co0Var.A0 = tL_payments_validatedRequestedInfo;
        if (co0Var.y0.saved_info != null && !co0Var.P0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new ih.q5(17), co0Var.S0 ? 8 : 0);
        }
        co0Var.s0();
        co0Var.C0(false);
        co0Var.G0(true, false);
    }

    public static /* synthetic */ void W(co0 co0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        co0Var.C0(false);
        co0Var.G0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void X(co0 co0Var, org.telegram.ui.Components.gc gcVar, boolean z10, TLRPC.Message message) {
        gcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(co0Var.currentAccount).getInputPeer(message.peer_id);
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new en0(co0Var, 3), 2);
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(qn.Q9(message.id, MessageObject.getDialogId(message)));
        }
    }

    public static void Y(co0 co0Var) {
        ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ih.q5(17), co0Var.S0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(co0Var.getParentActivity());
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        co0Var.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void Z(co0 co0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        gh.m7 m7Var = new gh.m7(co0Var, z10, str, 8);
        if (z10) {
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(updatepasswordsettings, m7Var, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = co0Var.W.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            m7Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            m7Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(updatepasswordsettings, m7Var, 10);
    }

    public static /* synthetic */ void a0(co0 co0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, tL_payments_sendPaymentForm, new Object[0]);
        co0Var.C0(false);
        co0Var.G0(false, false);
        co0Var.W0 = true;
        co0Var.b1 = 4;
        bo0 bo0Var = co0Var.V0;
        if (bo0Var != null) {
            bo0Var.b(4);
        }
    }

    public static void b0(co0 co0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            gh.oa.j1(co0Var.getParentActivity(), co0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, co0Var.U0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        co0 co0Var2 = new co0((TLRPC.PaymentReceipt) tLObject);
        co0Var2.Y0 = co0Var.Y0;
        co0Var2.Z0 = co0Var.Z0;
        R.showAsSheet(co0Var2, m2Var);
    }

    public static /* synthetic */ void c0(co0 co0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        co0Var.G0(true, false);
        co0Var.C0(false);
        if (tLObject != null) {
            co0Var.r0 = true;
            UserConfig.getInstance(co0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(co0Var.currentAccount).saveConfig(false);
            co0Var.s0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            co0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(co0Var.f[1], 3.25f);
        co0Var.f[1].setText("");
    }

    public static void d0(co0 co0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            gh.oa.j1(co0Var.getParentActivity(), co0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, co0Var.U0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        co0 co0Var2 = new co0((TLRPC.PaymentReceipt) tLObject);
        co0Var2.Y0 = co0Var.Y0;
        co0Var2.Z0 = co0Var.Z0;
        R.showAsSheet(co0Var2, m2Var);
    }

    public static /* synthetic */ void e0(co0 co0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.y4.f0(co0Var.currentAccount, tL_error, co0Var, getpassword, new Object[0]);
            co0Var.G0(true, false);
            co0Var.C0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.h0(password, false)) {
            org.telegram.ui.Components.y4.x0(co0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new ye0(co0Var, password, AndroidUtilities.getStringBytes(str), 14));
        } else {
            co0Var.r0 = false;
            co0Var.s0();
        }
    }

    public static /* synthetic */ void f0(co0 co0Var, org.telegram.ui.Components.gc gcVar, boolean z10, TLRPC.Message[] messageArr) {
        gcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(co0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new en0(co0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(qn.Q9(messageArr[0].id, MessageObject.getDialogId(messageArr[0])));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cb, code lost:
    
        if (r7.phone_requested == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d7, code lost:
    
        if (r23.F0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e1, code lost:
    
        if (r2.invoice.flexible != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g0(co0 co0Var, String str, View view) {
        int i9;
        org.telegram.ui.Cells.o6 o6Var = co0Var.R;
        if (o6Var != null && !co0Var.B) {
            co0Var.V = -co0Var.V;
            AndroidUtilities.shakeViewSpring(o6Var.getTextView(), co0Var.V);
            AndroidUtilities.shakeViewSpring(co0Var.R.getCheckBox(), co0Var.V);
            try {
                co0Var.R.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z10 = co0Var.R0;
        int i10 = 1;
        if (z10 && co0Var.y0.saved_info != null && co0Var.E0 == null) {
            co0Var.C0(true);
            cf0 cf0Var = new cf0(18, co0Var, view);
            if (co0Var.M0) {
                return;
            }
            co0Var.G0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            co0Var.E0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = co0Var.X0;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (co0Var.J0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = co0Var.getMessagesController().getInputPeer(co0Var.J0.messageOwner.peer_id);
                tL_inputInvoiceMessage.msg_id = co0Var.J0.getId();
                co0Var.E0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = co0Var.K0;
                co0Var.E0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = co0Var.E0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = co0Var.y0.saved_info;
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new y9(co0Var, cf0Var, tL_payments_validateRequestedInfo2, 29), (co0Var.S0 ? 8 : 0) | 2);
            return;
        }
        if (z10) {
            TLRPC.PaymentForm paymentForm = co0Var.y0;
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
                        i9 = 0;
                        if (i9 != 2 && !paymentForm.additional_methods.isEmpty()) {
                            Objects.requireNonNull(view);
                            co0Var.F0(new org.telegram.ui.Components.yt(0, view));
                            return;
                        } else {
                            co0 co0Var2 = new co0(co0Var.X0, co0Var.y0, co0Var.J0, co0Var.K0, i9, co0Var.A0, co0Var.C0, co0Var.D0, co0Var.s0, co0Var.t0, co0Var.E0, co0Var.Q0, null, co0Var.n0, co0Var.S0);
                            co0Var2.Y0 = co0Var.Y0;
                            co0Var2.Z0 = co0Var.Z0;
                            co0Var.presentFragment(co0Var2);
                            return;
                        }
                    }
                }
                i9 = (co0Var.u0 == null && co0Var.s0 == null && co0Var.F0 == null) ? 2 : 1;
                if (i9 != 2) {
                }
                co0 co0Var22 = new co0(co0Var.X0, co0Var.y0, co0Var.J0, co0Var.K0, i9, co0Var.A0, co0Var.C0, co0Var.D0, co0Var.s0, co0Var.t0, co0Var.E0, co0Var.Q0, null, co0Var.n0, co0Var.S0);
                co0Var22.Y0 = co0Var.Y0;
                co0Var22.Z0 = co0Var.Z0;
                co0Var.presentFragment(co0Var22);
                return;
            }
            if (co0Var.u0 == null) {
                if (co0Var.s0 == null) {
                }
            }
            if (co0Var.C0 == null) {
            }
        }
        if (!co0Var.y0.password_missing && co0Var.u0 != null) {
            if (UserConfig.getInstance(co0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(co0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(co0Var.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(co0Var.currentAccount).tmpPassword = null;
                UserConfig.getInstance(co0Var.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(co0Var.currentAccount).tmpPassword == null) {
                co0Var.T0 = true;
                co0 co0Var3 = new co0(co0Var.X0, co0Var.y0, co0Var.J0, co0Var.K0, 3, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.t0, co0Var.E0, co0Var.Q0, null, co0Var.n0, co0Var.S0);
                co0Var3.Y0 = co0Var.Y0;
                co0Var3.Z0 = co0Var.Z0;
                co0Var.presentFragment(co0Var3);
                co0Var.T0 = false;
                return;
            }
            if (co0Var.R0) {
                co0Var.R0 = false;
                NotificationCenter.getInstance(co0Var.currentAccount).removeObserver(co0Var, NotificationCenter.paymentFinished);
            }
        }
        TLRPC.User user = co0Var.h0;
        if (user == null || user.verified) {
            co0Var.H0(co0Var.N0[0]);
            return;
        }
        String str2 = "payment_warning_" + co0Var.h0.id;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(co0Var.currentAccount);
        if (notificationsSettings.getBoolean(str2, false)) {
            co0Var.H0(co0Var.N0[0]);
            return;
        }
        notificationsSettings.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(co0Var.getParentActivity());
        String string = LocaleController.getString(R.string.PaymentWarning);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = LocaleController.formatString("PaymentWarningText", R.string.PaymentWarningText, co0Var.l0, str);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new cn0(co0Var, i10));
        co0Var.showDialog(c2Var);
    }

    public static void h0(co0 co0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(new TL_account.getPassword(), new kh.o3(10, co0Var, z10), 8);
            return;
        }
        co0Var.G0(true, false);
        if (z10) {
            TL_account.Password password = co0Var.W;
            password.has_password = false;
            password.current_algo = null;
            co0Var.P.a(password);
            co0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (co0Var.getParentActivity() == null) {
                return;
            }
            co0Var.s0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    co0Var.E0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    co0Var.E0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    co0Var.E0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            }
            co0Var.Y = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(co0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(4, co0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.P = string;
            c2Var.N = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = co0Var.showDialog(c2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0205, code lost:
    
        if (r5 == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i0(co0 co0Var) {
        Integer num;
        Integer num2;
        boolean z10;
        boolean z11;
        Integer num3;
        boolean z12;
        boolean z13;
        int i9 = 1;
        String[] split = co0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer parseInt = Utilities.parseInt((CharSequence) split[0]);
            num2 = Utilities.parseInt((CharSequence) split[1]);
            num = parseInt;
        } else {
            num = null;
            num2 = null;
        }
        cc.a aVar = new cc.a(co0Var.f[0].getText().toString(), num, num2, co0Var.f[3].getText().toString(), co0Var.f[2].getText().toString(), null, null, null, null, co0Var.f[5].getText().toString(), co0Var.f[4].getText().toString(), null, null, null, null, null, null);
        co0Var.t0 = aVar.a() + " *" + aVar.b();
        boolean z14 = num != null && num2 != null && UserConfig.getInstance(co0Var.currentAccount).getClientPhone().startsWith("7") && "smartglocal".equals(co0Var.y0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (!f7.l7.d(str)) {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!f7.l7.d(replaceAll) && replaceAll != null) {
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
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && f7.h7.a(num3.intValue()) >= za.a.p3().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || f7.h7.a(num3.intValue()) < za.a.p3().get(1)) {
                                                z12 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (f7.h7.a(intValue) >= za.a.p3().get(1)) {
                                                    Calendar p32 = za.a.p3();
                                                    if (f7.h7.a(intValue) != p32.get(1) || intValue2 >= p32.get(2) + 1) {
                                                        z13 = false;
                                                        z12 = !z13;
                                                    }
                                                }
                                                z13 = true;
                                                z12 = !z13;
                                            }
                                        }
                                        co0Var.D0(1);
                                        return;
                                    }
                                    if (co0Var.e0 && co0Var.f[2].length() == 0) {
                                        co0Var.D0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!f7.l7.d(str2)) {
                                        String trim = str2.trim();
                                        String a3 = aVar.a();
                                        boolean z17 = (a3 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(a3) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            for (int i12 = 0; i12 < trim.length(); i12++) {
                                                if (Character.isDigit(trim.charAt(i12))) {
                                                }
                                            }
                                            z10 = true;
                                            if (z10 && z17) {
                                                z11 = true;
                                                if (!z11) {
                                                    co0Var.D0(3);
                                                    return;
                                                }
                                                if (co0Var.c0 && co0Var.f[4].length() == 0) {
                                                    co0Var.D0(4);
                                                    return;
                                                }
                                                if (co0Var.d0 && co0Var.f[5].length() == 0) {
                                                    co0Var.D0(5);
                                                    return;
                                                }
                                                co0Var.G0(true, true);
                                                try {
                                                    if ("stripe".equals(co0Var.y0.native_provider)) {
                                                        String str3 = co0Var.f0;
                                                        k5.i iVar = new k5.i(new v9.d(i9), i9);
                                                        v9.d.z3(str3);
                                                        rn0 rn0Var = new rn0(co0Var);
                                                        try {
                                                            v9.d.z3(str3);
                                                            new ac.a(iVar, str3, aVar, rn0Var).execute(new Void[0]);
                                                        } catch (bc.c e10) {
                                                            rn0Var.a(e10);
                                                        }
                                                    } else if ("smartglocal".equals(co0Var.y0.native_provider)) {
                                                        new sn0(co0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                    }
                                                    return;
                                                } catch (Exception e11) {
                                                    FileLog.e(e11);
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
        co0Var.D0(0);
    }

    public static void j0(co0 co0Var) {
        if (UserConfig.getInstance(co0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(co0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(co0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(co0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(co0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(co0Var.currentAccount).tmpPassword != null) {
            co0Var.y0();
            return;
        }
        if (co0Var.f[1].length() == 0) {
            try {
                co0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(co0Var.f[1], 2.5f);
            return;
        }
        String obj = co0Var.f[1].getText().toString();
        co0Var.G0(true, true);
        co0Var.C0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(getpassword, new y9(co0Var, obj, getpassword, 28), (co0Var.S0 ? 8 : 0) | 2);
    }

    public static void l0(co0 co0Var) {
        if (co0Var.M0) {
            return;
        }
        co0Var.G0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        co0Var.E0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = co0Var.X0;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (co0Var.J0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = co0Var.getMessagesController().getInputPeer(co0Var.J0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = co0Var.J0.getId();
            co0Var.E0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = co0Var.K0;
            co0Var.E0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = co0Var.E0;
        tL_payments_validateRequestedInfo2.save = co0Var.P0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (co0Var.y0.invoice.name_requested) {
            co0Var.E0.info.name = co0Var.f[6].getText().toString();
            co0Var.E0.info.flags |= 1;
        }
        if (co0Var.y0.invoice.phone_requested) {
            co0Var.E0.info.phone = "+" + co0Var.f[8].getText().toString() + co0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = co0Var.E0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (co0Var.y0.invoice.email_requested) {
            co0Var.E0.info.email = co0Var.f[7].getText().toString().trim();
            co0Var.E0.info.flags |= 4;
        }
        if (co0Var.y0.invoice.shipping_address_requested) {
            co0Var.E0.info.shipping_address = new TLRPC.TL_postAddress();
            co0Var.E0.info.shipping_address.street_line1 = co0Var.f[0].getText().toString();
            co0Var.E0.info.shipping_address.street_line2 = co0Var.f[1].getText().toString();
            co0Var.E0.info.shipping_address.city = co0Var.f[2].getText().toString();
            co0Var.E0.info.shipping_address.state = co0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = co0Var.E0.info.shipping_address;
            String str = co0Var.x0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = co0Var.f[5].getText().toString();
            co0Var.E0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(co0Var.currentAccount).sendRequest(co0Var.E0, new v40(16, co0Var, co0Var.E0), (co0Var.S0 ? 8 : 0) | 2);
    }

    public static JSONObject o0() {
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

    public final void A0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.a9[] a9VarArr = this.U;
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
            j3.r0.A(sb2, ", ", str4, ", ", str5);
            a9VarArr[2].b(R.drawable.msg_payment_address, aa.d.r(sb2, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        a9VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            a9VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        a9VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            a9VarArr[4].b(R.drawable.msg_calls, ne.b.c().b(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), (tL_paymentRequestedInfo.email == null && this.C0 == null) ? false : true);
        }
        a9VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            a9VarArr[5].b(R.drawable.msg_mention, str8, LocaleController.getString(R.string.PaymentCheckoutEmail), this.C0 != null);
        }
        a9VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void B0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.W = password;
            this.X = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            I0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            s0();
        }
    }

    public final void C0(boolean z10) {
        this.L0 = z10;
        this.C = !z10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.L0);
        }
        org.telegram.ui.Cells.a9 a9Var = this.U[0];
        if (a9Var != null) {
            a9Var.setEnabled(!this.L0);
        }
    }

    public final void D0(int i9) {
        EditTextBoldCursor editTextBoldCursor = this.f[i9];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(editTextBoldCursor, 2.5f);
    }

    public final void E0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = str;
        c2Var.P = str2;
        showDialog(c2Var);
    }

    public final void F0(Runnable runnable) {
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(getParentActivity(), null, false, false);
        f3Var.fixNavigationBar();
        f3Var.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        f3Var.bigTitle = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.u0;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.t0;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.y0.saved_credentials;
        int size = arrayList4.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i9);
            i9++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.u0;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.id, tL_paymentSavedCredentialsCard4.id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.y0.additional_methods;
        int size2 = arrayList5.size();
        int i10 = 0;
        while (i10 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i10);
            i10++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(LocaleController.getString(R.string.PaymentCheckoutMethodNewCard));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        org.telegram.ui.Components.w2 w2Var = new org.telegram.ui.Components.w2(this, runnable, arrayList3, arrayList, 1);
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = w2Var;
        showDialog(f3Var);
    }

    public final void G0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i9 = 1;
        int i10 = 0;
        if (!z10 || this.n == null) {
            if (this.Q != null) {
                this.v = new AnimatorSet();
                if (z11) {
                    this.s.setVisibility(0);
                    this.S.setEnabled(false);
                    AnimatorSet animatorSet2 = this.v;
                    TextView textView = this.Q;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.Q;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.Q;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.jq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.jq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.jq, Float>) property3, 1.0f));
                } else {
                    this.Q.setVisibility(0);
                    this.S.setEnabled(true);
                    AnimatorSet animatorSet3 = this.v;
                    org.telegram.ui.Components.jq jqVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jqVar, (Property<org.telegram.ui.Components.jq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.jq jqVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(jqVar2, (Property<org.telegram.ui.Components.jq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.jq jqVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(jqVar3, (Property<org.telegram.ui.Components.jq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property6, 1.0f));
                }
                this.v.addListener(new tn0(this, z11, i9));
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
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.jq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.jq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.jq, Float>) property9, 1.0f));
        } else if (this.w != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.jq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.jq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.jq, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.v;
            org.telegram.ui.Components.jq jqVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(jqVar4, (Property<org.telegram.ui.Components.jq, Float>) property10, 0.1f);
            org.telegram.ui.Components.jq jqVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(jqVar5, (Property<org.telegram.ui.Components.jq, Float>) property11, 0.1f);
            org.telegram.ui.Components.jq jqVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(jqVar6, (Property<org.telegram.ui.Components.jq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.v.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.v.addListener(new tn0(this, z11, i10));
        this.v.setDuration(150L);
        this.v.start();
    }

    public final void H0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.l0, this.m0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new cn0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void I0() {
        if (this.q0 == 6) {
            org.telegram.ui.Cells.b9[] b9VarArr = this.I;
            if (b9VarArr[2] == null) {
                return;
            }
            int i9 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.W;
            ArrayList arrayList = this.F;
            org.telegram.ui.Cells.m4[] m4VarArr = this.E;
            org.telegram.ui.Cells.ba[] baVarArr = this.J;
            if (password == null) {
                G0(true, true);
                b9VarArr[2].setVisibility(8);
                baVarArr[0].setVisibility(8);
                baVarArr[1].setVisibility(8);
                this.O.setVisibility(8);
                m4VarArr[0].setVisibility(8);
                m4VarArr[1].setVisibility(8);
                b9VarArr[0].setVisibility(8);
                for (int i10 = 0; i10 < 3; i10++) {
                    ((View) this.f[i10].getParent()).setVisibility(8);
                }
                while (i9 < arrayList.size()) {
                    ((View) arrayList.get(i9)).setVisibility(8);
                    i9++;
                }
                return;
            }
            G0(true, false);
            if (!this.X) {
                b9VarArr[2].setVisibility(8);
                baVarArr[0].setVisibility(8);
                baVarArr[1].setVisibility(8);
                b9VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.O.setVisibility(8);
                m4VarArr[0].setVisibility(0);
                m4VarArr[1].setVisibility(0);
                b9VarArr[0].setVisibility(0);
                for (int i11 = 0; i11 < 3; i11++) {
                    ((View) this.f[i11].getParent()).setVisibility(0);
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((View) arrayList.get(i12)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = b9VarArr[2];
            int i13 = R.string.EmailPasswordConfirmText2;
            String str = this.W.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            b9Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i13, str));
            b9VarArr[2].setVisibility(0);
            baVarArr[0].setVisibility(0);
            baVarArr[1].setVisibility(0);
            this.O.setVisibility(0);
            b9VarArr[1].setText("");
            m4VarArr[0].setVisibility(8);
            m4VarArr[1].setVisibility(8);
            b9VarArr[0].setVisibility(8);
            for (int i14 = 0; i14 < 3; i14++) {
                ((View) this.f[i14].getParent()).setVisibility(8);
            }
            while (i9 < arrayList.size()) {
                ((View) arrayList.get(i9)).setVisibility(8);
                i9++;
            }
        }
    }

    public final void K0() {
        org.telegram.ui.Cells.b9[] b9VarArr = this.I;
        if (b9VarArr[0] != null) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.G;
            if (z6VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.y0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.w != null && this.v0)) {
                this.H.setVisibility(8);
                b9VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.z6 z6Var = z6VarArr[2];
                z6Var.setBackground(org.telegram.ui.ActionBar.f6.V0(z6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
            if (this.y0.password_missing) {
                v0();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) string);
                if (indexOf != -1 && lastIndexOf != -1) {
                    int i9 = indexOf + length;
                    int i10 = lastIndexOf + length;
                    b9VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i9, i9 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new zn0(this), i9, i10 - 1, 33);
                }
            }
            this.H.setEnabled(true);
            b9VarArr[0].setText(spannableStringBuilder);
            this.H.setVisibility(0);
            b9VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.z6 z6Var2 = z6VarArr[2];
            z6Var2.setBackground(org.telegram.ui.ActionBar.f6.V0(z6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
        }
    }

    public final void L0() {
        this.N0[0] = r0(this.p0);
        this.N.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.N0[0], true);
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.N0[0]));
        }
        if (this.o0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.ei);
            int childCount = this.o0.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                TextView textView2 = (TextView) this.o0.getChildAt(i9);
                if (textView2.getTag().equals(this.D0)) {
                    org.telegram.ui.ActionBar.f6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.fi));
                } else {
                    org.telegram.ui.ActionBar.f6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x030f, code lost:
    
        if (r15.email_requested == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0fcd, code lost:
    
        if (r14.email_requested == false) goto L466;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0bcc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0216  */
    /* JADX WARN: Type inference failed for: r10v61, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r10v89, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v141, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r4v145, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v146, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v184, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i9;
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
        org.telegram.ui.Cells.z6 z6Var;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ?? frameLayout;
        boolean z11;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str3;
        String str4;
        BufferedReader bufferedReader;
        switch (this.q0) {
            case 0:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingInfo));
                break;
            case 1:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingMethod));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.B0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.B0.title);
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCardInfo));
                    break;
                }
                break;
            case 4:
                if (this.y0.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentCheckout));
                    break;
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCheckout));
                    break;
                }
            case 5:
                if (this.y0.invoice.test) {
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
        this.actionBar.setActionBarMenuOnItemClick(new on0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i12 = this.q0;
        int i13 = 6;
        int i14 = 3;
        if (i12 == 0 || i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4 || i12 == 6) {
            this.n = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(context, 1);
            this.r = jqVar;
            jqVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, g7.e6.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        ScrollView scrollView = new ScrollView(context);
        this.A = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.A, getThemedColor(org.telegram.ui.ActionBar.f6.s8));
        frameLayout2.addView(this.A, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.q0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        int i15 = 0;
        this.M.setClipChildren(false);
        this.A.addView(this.M, new FrameLayout.LayoutParams(-1, -2));
        int i16 = this.q0;
        int i17 = 11;
        int i18 = 10;
        char c12 = 1;
        String str5 = "";
        if (i16 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e10) {
                e = e10;
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
                    } catch (Exception e11) {
                        e = e11;
                    }
                } else {
                    c11 = 0;
                    bufferedReader.close();
                    Collections.sort(this.a, new org.telegram.ui.Components.jn0(11));
                    this.f = new EditTextBoldCursor[10];
                    i10 = 0;
                    while (i10 < i18) {
                        if (i10 == 0) {
                            this.E[c11] = new org.telegram.ui.Cells.m4(context, this.U0);
                            this.E[c11].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                            this.E[c11].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.M.addView(this.E[c11], g7.e6.n(-1, -2));
                        } else if (i10 == 6) {
                            this.G[c11] = new org.telegram.ui.Cells.z6(context, (Object) null);
                            this.M.addView(this.G[c11], g7.e6.n(-1, -2));
                            this.E[c12] = new org.telegram.ui.Cells.m4(context, this.U0);
                            this.E[c12].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                            this.E[c12].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.M.addView(this.E[c12], g7.e6.n(-1, -2));
                        }
                        if (i10 == 8) {
                            frameLayout = new LinearLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setOrientation(0);
                            this.M.addView(frameLayout, g7.e6.n(-1, 50));
                            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        } else if (i10 == 9) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.M.addView(frameLayout, g7.e6.n(-1, 50));
                            int i19 = org.telegram.ui.ActionBar.f6.d6;
                            frameLayout.setBackgroundColor(getThemedColor(i19));
                            boolean z12 = i10 != 5;
                            if (z12) {
                                if (i10 != 7 || this.y0.invoice.phone_requested) {
                                    if (i10 == 6) {
                                        TLRPC.TL_invoice tL_invoice2 = this.y0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                z12 = false;
                            }
                            if (z12) {
                                org.telegram.ui.Components.an anVar = new org.telegram.ui.Components.an(context, 19);
                                anVar.setBackgroundColor(getThemedColor(i19));
                                this.F.add(anVar);
                                frameLayout.addView(anVar, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                        }
                        if (i10 == 9) {
                            this.f[i10] = new org.telegram.ui.Components.p30(context);
                        } else {
                            this.f[i10] = new EditTextBoldCursor(context);
                        }
                        this.f[i10].setTag(Integer.valueOf(i10));
                        this.f[i10].setTextSize(1, 16.0f);
                        this.f[i10].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.H6));
                        EditTextBoldCursor editTextBoldCursor = this.f[i10];
                        int i20 = org.telegram.ui.ActionBar.f6.G6;
                        editTextBoldCursor.setTextColor(getThemedColor(i20));
                        this.f[i10].setBackgroundDrawable(null);
                        this.f[i10].setCursorColor(getThemedColor(i20));
                        this.f[i10].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i10].setCursorWidth(1.5f);
                        if (i10 == 4) {
                            final int i21 = 0;
                            this.f[i10].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.zm0
                                public final /* synthetic */ co0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i21) {
                                        case 0:
                                            co0 co0Var = this.b;
                                            if (co0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    qt qtVar = new qt(null, false);
                                                    qtVar.n = true;
                                                    qtVar.r = new cn0(co0Var, 4);
                                                    co0Var.presentFragment(qtVar);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            co0 co0Var2 = this.b;
                                            if (co0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    qt qtVar2 = new qt(null, false);
                                                    qtVar2.n = true;
                                                    qtVar2.r = new cn0(co0Var2, 2);
                                                    co0Var2.presentFragment(qtVar2);
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
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str6 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str7 = this.y0.saved_info.shipping_address.country_iso2;
                                    this.x0 = str7;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i10];
                                    if (str6 == null) {
                                        str6 = str7;
                                    }
                                    editTextBoldCursor2.setText(str6);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i10].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str3 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i10].setText(str3);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i10].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str4 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i10].setText(str4);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i10];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i10 == 8) {
                            TextView textView = new TextView(context);
                            this.D = textView;
                            textView.setText("+");
                            this.D.setTextColor(getThemedColor(i20));
                            this.D.setTextSize(1, 16.0f);
                            frameLayout.addView(this.D, g7.e6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i10].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                            this.f[i10].setGravity(19);
                            this.f[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i10], g7.e6.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i10].addTextChangedListener(new un0(this));
                        } else if (i10 == 9) {
                            this.f[i10].setPadding(0, 0, 0, 0);
                            this.f[i10].setGravity(19);
                            frameLayout.addView(this.f[i10], g7.e6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i10].addTextChangedListener(new rr(this, 4));
                        } else {
                            this.f[i10].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout.addView(this.f[i10], g7.e6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i22 = 2;
                        this.f[i10].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.an0
                            public final /* synthetic */ co0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i23, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i22) {
                                    case 0:
                                        co0 co0Var = this.b;
                                        if (i23 != 6) {
                                            co0Var.getClass();
                                            break;
                                        } else {
                                            co0Var.z0(false);
                                            break;
                                        }
                                    case 1:
                                        co0 co0Var2 = this.b;
                                        if (i23 != 6) {
                                            co0Var2.getClass();
                                            if (i23 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        co0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    co0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            co0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        co0 co0Var3 = this.b;
                                        co0Var3.getClass();
                                        if (i23 != 5) {
                                            if (i23 == 6) {
                                                co0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = co0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    co0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        co0 co0Var4 = this.b;
                                        co0Var4.getClass();
                                        if (i23 != 5) {
                                            if (i23 == 6) {
                                                co0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i24 = intValue3 + 1;
                                                editTextBoldCursorArr = co0Var4.f;
                                                if (i24 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i24 == 4 ? intValue3 + 2 : i24;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            co0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        co0 co0Var5 = this.b;
                                        if (i23 != 6) {
                                            co0Var5.getClass();
                                            break;
                                        } else {
                                            co0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i10 == 9) {
                            TLRPC.TL_invoice tL_invoice3 = this.y0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user = null;
                                for (int i23 = 0; i23 < this.y0.users.size(); i23++) {
                                    TLRPC.User user2 = this.y0.users.get(i23);
                                    if (user2.id == this.y0.provider_id) {
                                        user = user2;
                                    }
                                }
                                String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
                                z11 = true;
                                this.I[1] = new org.telegram.ui.Cells.b9(context, this.U0);
                                this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                                this.M.addView(this.I[1], g7.e6.n(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.y0.invoice;
                                boolean z13 = tL_invoice4.email_to_provider;
                                if (z13 && tL_invoice4.phone_to_provider) {
                                    this.I[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, formatName));
                                } else if (z13) {
                                    this.I[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, formatName));
                                } else {
                                    this.I[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, formatName));
                                }
                            } else {
                                this.G[1] = new org.telegram.ui.Cells.z6(context, (Object) null);
                                this.M.addView(this.G[1], g7.e6.n(-1, -2));
                                z11 = true;
                            }
                            org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context, this.U0);
                            this.H = t8Var;
                            t8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(z11));
                            this.H.f(LocaleController.getString(R.string.PaymentShippingSave), this.P0, false);
                            this.M.addView(this.H, g7.e6.n(-1, -2));
                            this.H.setOnClickListener(new ym0(this, 8));
                            this.I[0] = new org.telegram.ui.Cells.b9(context, this.U0);
                            this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                            this.I[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.M.addView(this.I[0], g7.e6.n(-1, -2));
                        }
                        i10++;
                        i18 = 10;
                        i14 = 3;
                        c12 = 1;
                        c11 = 0;
                    }
                    if (this.y0.invoice.name_requested) {
                        i11 = 8;
                        ((ViewGroup) this.f[6].getParent()).setVisibility(8);
                    } else {
                        i11 = 8;
                    }
                    if (!this.y0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i11].getParent()).setVisibility(i11);
                    }
                    if (!this.y0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i11);
                    }
                    tL_invoice = this.y0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else if (tL_invoice.name_requested) {
                        this.f[6].setImeOptions(268435462);
                    } else {
                        this.f[5].setImeOptions(268435462);
                    }
                    z6Var = this.G[1];
                    if (z6Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.y0.invoice;
                        z6Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.b9 b9Var = this.I[1];
                        if (b9Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.y0.invoice;
                            b9Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.m4 m4Var = this.E[1];
                    TLRPC.TL_invoice tL_invoice7 = this.y0.invoice;
                    m4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.y0.invoice.shipping_address_requested) {
                        this.E[0].setVisibility(8);
                        this.G[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[3].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo2 = this.y0.saved_info;
                    if (tL_paymentRequestedInfo2 != null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone)) {
                        n0(null);
                    } else {
                        n0(this.y0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm3 = this.y0;
                        if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo3 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                            if (telephonyManager != null) {
                                str = telephonyManager.getSimCountryIso().toUpperCase();
                                if (str != null && (str2 = (String) hashMap.get(str)) != null && this.a.indexOf(str2) != -1) {
                                    this.f[8].setText((CharSequence) this.b.get(str2));
                                }
                            }
                            str = null;
                            if (str != null) {
                                this.f[8].setText((CharSequence) this.b.get(str2));
                            }
                        }
                    }
                }
                e = e11;
                FileLog.e(e);
                Collections.sort(this.a, new org.telegram.ui.Components.jn0(11));
                this.f = new EditTextBoldCursor[10];
                i10 = 0;
                while (i10 < i18) {
                }
                if (this.y0.invoice.name_requested) {
                }
                if (!this.y0.invoice.phone_requested) {
                }
                if (!this.y0.invoice.email_requested) {
                }
                tL_invoice = this.y0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                z6Var = this.G[1];
                if (z6Var == null) {
                }
                org.telegram.ui.Cells.m4 m4Var2 = this.E[1];
                TLRPC.TL_invoice tL_invoice72 = this.y0.invoice;
                m4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.y0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo2 = this.y0.saved_info;
                if (tL_paymentRequestedInfo2 != null) {
                }
                n0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else if (i16 == 2) {
            if (this.y0.native_params != null) {
                try {
                    JSONObject jSONObject = new JSONObject(this.y0.native_params.data);
                    String optString = jSONObject.optString("google_pay_public_key");
                    if (!TextUtils.isEmpty(optString)) {
                        this.G0 = optString;
                    }
                    this.H0 = jSONObject.optString("acquirer_bank_country");
                    this.I0 = jSONObject.optJSONObject("gpay_parameters");
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
            if (this.O0 || this.B0 != null) {
                if (this.G0 != null || this.I0 != null) {
                    u0(context);
                }
                m0(context);
                this.M.addView(this.K, g7.e6.n(-1, 50));
                this.v0 = true;
                G0(true, true);
                this.r.setVisibility(0);
                this.n.setEnabled(false);
                this.n.getContentView().setVisibility(4);
                AndroidUtilities.checkAndroidTheme(context, true);
                org.telegram.ui.Components.z71 z71Var = new org.telegram.ui.Components.z71(this, context);
                this.w = z71Var;
                z71Var.getSettings().setJavaScriptEnabled(true);
                this.w.getSettings().setDomStorageEnabled(true);
                this.w.getSettings().setSupportZoom(true);
                this.w.getSettings().setBuiltInZoomControls(true);
                this.w.getSettings().setDisplayZoomControls(false);
                this.w.getSettings().setUseWideViewPort(true);
                this.w.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                this.w.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                this.w.setWebViewClient(new vn0(this, context));
                this.M.addView(this.w, g7.e6.c(-2.0f, -1));
                this.G[2] = new org.telegram.ui.Cells.z6(context, (Object) null);
                this.M.addView(this.G[2], g7.e6.n(-1, -2));
                org.telegram.ui.Cells.t8 t8Var2 = new org.telegram.ui.Cells.t8(context, this.U0);
                this.H = t8Var2;
                t8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                this.H.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.Q0, false);
                this.M.addView(this.H, g7.e6.n(-1, -2));
                this.H.setOnClickListener(new ym0(this, 9));
                this.I[0] = new org.telegram.ui.Cells.b9(context, this.U0);
                this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                K0();
                this.M.addView(this.I[0], g7.e6.n(-1, -2));
            } else {
                if (this.y0.native_params != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(this.y0.native_params.data);
                        try {
                            this.c0 = jSONObject2.getBoolean("need_country");
                        } catch (Exception unused) {
                            this.c0 = false;
                        }
                        try {
                            this.d0 = jSONObject2.getBoolean("need_zip");
                        } catch (Exception unused2) {
                            this.d0 = false;
                        }
                        try {
                            this.e0 = jSONObject2.getBoolean("need_cardholder_name");
                        } catch (Exception unused3) {
                            this.e0 = false;
                        }
                        if (jSONObject2.has("public_token")) {
                            this.f0 = jSONObject2.getString("public_token");
                        } else {
                            try {
                                this.f0 = jSONObject2.getString("publishable_key");
                            } catch (Exception unused4) {
                                this.f0 = "";
                            }
                        }
                        this.g0 = !jSONObject2.optBoolean("google_pay_hidden", false);
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                }
                if (this.g0 && ((!TextUtils.isEmpty(this.f0) && "stripe".equals(this.y0.native_provider)) || this.I0 != null)) {
                    u0(context);
                }
                this.f = new EditTextBoldCursor[6];
                int i24 = 0;
                while (i24 < 6) {
                    if (i24 == 0) {
                        this.E[0] = new org.telegram.ui.Cells.m4(context, this.U0);
                        this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        this.E[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                        this.M.addView(this.E[0], g7.e6.n(-1, -2));
                    } else if (i24 == 4) {
                        this.E[1] = new org.telegram.ui.Cells.m4(context, this.U0);
                        this.E[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        this.E[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                        this.M.addView(this.E[1], g7.e6.n(-1, -2));
                    }
                    boolean z14 = (i24 == 3 || i24 == 5 || (i24 == 4 && !this.d0)) ? false : true;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    frameLayout3.setClipChildren(false);
                    int i25 = org.telegram.ui.ActionBar.f6.d6;
                    frameLayout3.setBackgroundColor(getThemedColor(i25));
                    this.M.addView(frameLayout3, g7.e6.n(-1, 50));
                    this.f[i24] = new EditTextBoldCursor(context);
                    this.f[i24].setTag(Integer.valueOf(i24));
                    this.f[i24].setTextSize(1, 16.0f);
                    this.f[i24].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.H6));
                    EditTextBoldCursor editTextBoldCursor4 = this.f[i24];
                    int i26 = org.telegram.ui.ActionBar.f6.G6;
                    editTextBoldCursor4.setTextColor(getThemedColor(i26));
                    this.f[i24].setBackgroundDrawable(null);
                    this.f[i24].setCursorColor(getThemedColor(i26));
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
                        final int i27 = 1;
                        this.f[i24].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.zm0
                            public final /* synthetic */ co0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                switch (i27) {
                                    case 0:
                                        co0 co0Var = this.b;
                                        if (co0Var.getParentActivity() != null) {
                                            if (motionEvent.getAction() == 1) {
                                                qt qtVar = new qt(null, false);
                                                qtVar.n = true;
                                                qtVar.r = new cn0(co0Var, 4);
                                                co0Var.presentFragment(qtVar);
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        co0 co0Var2 = this.b;
                                        if (co0Var2.getParentActivity() != null) {
                                            if (motionEvent.getAction() == 1) {
                                                qt qtVar2 = new qt(null, false);
                                                qtVar2.n = true;
                                                qtVar2.r = new cn0(co0Var2, 2);
                                                co0Var2.presentFragment(qtVar2);
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
                            this.f[i24].addTextChangedListener(new wn0(this));
                        } else if (i24 == 1) {
                            this.f[i24].addTextChangedListener(new xn0(this));
                        }
                        this.f[i24].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i24].setGravity(!LocaleController.isRTL ? 5 : 3);
                        frameLayout3.addView(this.f[i24], g7.e6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i28 = 3;
                        this.f[i24].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.an0
                            public final /* synthetic */ co0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i232, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i28) {
                                    case 0:
                                        co0 co0Var = this.b;
                                        if (i232 != 6) {
                                            co0Var.getClass();
                                            break;
                                        } else {
                                            co0Var.z0(false);
                                            break;
                                        }
                                    case 1:
                                        co0 co0Var2 = this.b;
                                        if (i232 != 6) {
                                            co0Var2.getClass();
                                            if (i232 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        co0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    co0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            co0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        co0 co0Var3 = this.b;
                                        co0Var3.getClass();
                                        if (i232 != 5) {
                                            if (i232 == 6) {
                                                co0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = co0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    co0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        co0 co0Var4 = this.b;
                                        co0Var4.getClass();
                                        if (i232 != 5) {
                                            if (i232 == 6) {
                                                co0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i242 = intValue3 + 1;
                                                editTextBoldCursorArr = co0Var4.f;
                                                if (i242 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            co0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        co0 co0Var5 = this.b;
                                        if (i232 != 6) {
                                            co0Var5.getClass();
                                            break;
                                        } else {
                                            co0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i24 != 3) {
                            this.G[0] = new org.telegram.ui.Cells.z6(context, (Object) null);
                            this.M.addView(this.G[0], g7.e6.n(-1, -2));
                        } else if (i24 == 5) {
                            this.G[2] = new org.telegram.ui.Cells.z6(context, (Object) null);
                            this.M.addView(this.G[2], g7.e6.n(-1, -2));
                            org.telegram.ui.Cells.t8 t8Var3 = new org.telegram.ui.Cells.t8(context, this.U0);
                            this.H = t8Var3;
                            t8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                            this.H.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.Q0, false);
                            this.M.addView(this.H, g7.e6.n(-1, -2));
                            this.H.setOnClickListener(new ym0(this, 10));
                            this.I[0] = new org.telegram.ui.Cells.b9(context, this.U0);
                            this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                            K0();
                            this.M.addView(this.I[0], g7.e6.n(-1, -2));
                        } else if (i24 == 0) {
                            m0(context);
                            frameLayout3.addView(this.K, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                        }
                        if (z14) {
                            org.telegram.ui.Components.an anVar2 = new org.telegram.ui.Components.an(context, 20);
                            anVar2.setBackgroundColor(getThemedColor(i25));
                            this.F.add(anVar2);
                            frameLayout3.addView(anVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if ((i24 == 4 && !this.c0) || ((i24 == 5 && !this.d0) || (i24 == 2 && !this.e0))) {
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
                    frameLayout3.addView(this.f[i24], g7.e6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i282 = 3;
                    this.f[i24].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.an0
                        public final /* synthetic */ co0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView2, int i232, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i282) {
                                case 0:
                                    co0 co0Var = this.b;
                                    if (i232 != 6) {
                                        co0Var.getClass();
                                        break;
                                    } else {
                                        co0Var.z0(false);
                                        break;
                                    }
                                case 1:
                                    co0 co0Var2 = this.b;
                                    if (i232 != 6) {
                                        co0Var2.getClass();
                                        if (i232 == 5) {
                                            int intValue = ((Integer) textView2.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    co0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                co0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        co0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    co0 co0Var3 = this.b;
                                    co0Var3.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            co0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView2.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = co0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                co0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    co0 co0Var4 = this.b;
                                    co0Var4.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            co0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView2.getTag()).intValue();
                                        do {
                                            int i242 = intValue3 + 1;
                                            editTextBoldCursorArr = co0Var4.f;
                                            if (i242 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        co0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    co0 co0Var5 = this.b;
                                    if (i232 != 6) {
                                        co0Var5.getClass();
                                        break;
                                    } else {
                                        co0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    if (i24 != 3) {
                    }
                    if (z14) {
                    }
                    if (i24 == 4) {
                        frameLayout3.setVisibility(8);
                        i24++;
                    }
                    frameLayout3.setVisibility(8);
                    i24++;
                }
                if (!this.c0 && !this.d0) {
                    this.E[1].setVisibility(8);
                    this.G[0].setVisibility(8);
                }
                if (this.d0) {
                    this.f[5].setImeOptions(268435462);
                } else {
                    this.f[3].setImeOptions(268435462);
                }
            }
        } else if (i16 == 1) {
            ArrayList<TLRPC.TL_shippingOption> arrayList = this.A0.shipping_options;
            int size = arrayList == null ? 0 : arrayList.size();
            this.h = new org.telegram.ui.Cells.j6[size];
            int i29 = 0;
            while (i29 < size) {
                TLRPC.TL_shippingOption tL_shippingOption = this.A0.shipping_options.get(i29);
                this.h[i29] = new org.telegram.ui.Cells.j6(context);
                this.h[i29].setTag(Integer.valueOf(i29));
                this.h[i29].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                this.h[i29].c(aa.d.z(r0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i29 == 0, i29 != size + (-1));
                this.h[i29].setOnClickListener(new ym0(this, i17));
                this.M.addView(this.h[i29]);
                i29++;
            }
            this.I[0] = new org.telegram.ui.Cells.b9(context, this.U0);
            this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
            this.M.addView(this.I[0], g7.e6.n(-1, -2));
        } else {
            int i30 = 13;
            if (i16 == 3) {
                this.f = new EditTextBoldCursor[2];
                int i31 = 0;
                for (int i32 = 2; i31 < i32; i32 = 2) {
                    if (i31 == 0) {
                        z10 = false;
                        this.E[0] = new org.telegram.ui.Cells.m4(context, this.U0);
                        this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        this.E[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                        this.M.addView(this.E[0], g7.e6.n(-1, -2));
                    } else {
                        z10 = false;
                    }
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    frameLayout4.setClipChildren(z10);
                    this.M.addView(frameLayout4, g7.e6.n(-1, 50));
                    int i33 = org.telegram.ui.ActionBar.f6.d6;
                    frameLayout4.setBackgroundColor(getThemedColor(i33));
                    boolean z15 = i31 != 1;
                    if (z15) {
                        if (i31 != 7 || this.y0.invoice.phone_requested) {
                            if (i31 == 6) {
                                TLRPC.TL_invoice tL_invoice8 = this.y0.invoice;
                                if (!tL_invoice8.phone_requested) {
                                }
                            }
                        }
                        z15 = false;
                    }
                    if (z15) {
                        org.telegram.ui.Components.an anVar3 = new org.telegram.ui.Components.an(context, 17);
                        anVar3.setBackgroundColor(getThemedColor(i33));
                        this.F.add(anVar3);
                        frameLayout4.addView(anVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                    }
                    this.f[i31] = new EditTextBoldCursor(context);
                    this.f[i31].setTag(Integer.valueOf(i31));
                    this.f[i31].setTextSize(1, 16.0f);
                    this.f[i31].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.H6));
                    EditTextBoldCursor editTextBoldCursor5 = this.f[i31];
                    int i34 = org.telegram.ui.ActionBar.f6.G6;
                    editTextBoldCursor5.setTextColor(getThemedColor(i34));
                    this.f[i31].setBackgroundDrawable(null);
                    this.f[i31].setCursorColor(getThemedColor(i34));
                    this.f[i31].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f[i31].setCursorWidth(1.5f);
                    if (i31 == 0) {
                        this.f[i31].setOnTouchListener(new jh.d(28));
                        this.f[i31].setInputType(0);
                    } else {
                        this.f[i31].setInputType(129);
                        this.f[i31].setTypeface(Typeface.DEFAULT);
                    }
                    this.f[i31].setImeOptions(268435462);
                    if (i31 == 0) {
                        EditTextBoldCursor editTextBoldCursor6 = this.f[i31];
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.u0;
                        editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                    } else if (i31 == 1) {
                        this.f[i31].setHint(LocaleController.getString(R.string.LoginPassword));
                        this.f[i31].requestFocus();
                    }
                    this.f[i31].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.f[i31].setGravity(LocaleController.isRTL ? 5 : 3);
                    frameLayout4.addView(this.f[i31], g7.e6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i35 = 4;
                    this.f[i31].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.an0
                        public final /* synthetic */ co0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView2, int i232, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i35) {
                                case 0:
                                    co0 co0Var = this.b;
                                    if (i232 != 6) {
                                        co0Var.getClass();
                                        break;
                                    } else {
                                        co0Var.z0(false);
                                        break;
                                    }
                                case 1:
                                    co0 co0Var2 = this.b;
                                    if (i232 != 6) {
                                        co0Var2.getClass();
                                        if (i232 == 5) {
                                            int intValue = ((Integer) textView2.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    co0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                co0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        co0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    co0 co0Var3 = this.b;
                                    co0Var3.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            co0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView2.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = co0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                co0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    co0 co0Var4 = this.b;
                                    co0Var4.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            co0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView2.getTag()).intValue();
                                        do {
                                            int i242 = intValue3 + 1;
                                            editTextBoldCursorArr = co0Var4.f;
                                            if (i242 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        co0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    co0 co0Var5 = this.b;
                                    if (i232 != 6) {
                                        co0Var5.getClass();
                                        break;
                                    } else {
                                        co0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    if (i31 == 1) {
                        this.I[0] = new org.telegram.ui.Cells.b9(context, this.U0);
                        org.telegram.ui.Cells.b9 b9Var2 = this.I[0];
                        int i36 = R.string.PaymentConfirmationMessage;
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.u0;
                        b9Var2.setText(LocaleController.formatString("PaymentConfirmationMessage", i36, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                        org.telegram.ui.Cells.b9 b9Var3 = this.I[0];
                        int i37 = R.drawable.greydivider;
                        int i38 = org.telegram.ui.ActionBar.f6.b7;
                        b9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i37, i38));
                        this.M.addView(this.I[0], g7.e6.n(-1, -2));
                        this.J[0] = new org.telegram.ui.Cells.ba(context, this.U0);
                        this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                        this.J[0].b(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                        this.M.addView(this.J[0], g7.e6.n(-1, -2));
                        this.J[0].setOnClickListener(new ym0(this, i30));
                        this.I[1] = new org.telegram.ui.Cells.b9(context, this.U0);
                        this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i38));
                        this.M.addView(this.I[1], g7.e6.n(-1, -2));
                    }
                    i31++;
                }
            } else if (i16 == 4 || i16 == 5) {
                org.telegram.ui.Cells.l5 l5Var = new org.telegram.ui.Cells.l5(context);
                this.T = l5Var;
                l5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                MessageObject messageObject = this.J0;
                if (messageObject != null) {
                    this.T.b((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.l0);
                } else {
                    TLRPC.PaymentReceipt paymentReceipt = this.z0;
                    if (paymentReceipt != null) {
                        this.T.c(paymentReceipt, this.l0);
                    } else if (this.K0 != null || this.X0 != null) {
                        org.telegram.ui.Cells.l5 l5Var2 = this.T;
                        TLRPC.PaymentForm paymentForm4 = this.y0;
                        l5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.l0, paymentForm4);
                    }
                }
                this.M.addView(this.T, g7.e6.n(-1, -2));
                this.G[0] = new org.telegram.ui.Cells.z6(context, (Object) null);
                this.M.addView(this.G[0], g7.e6.n(-1, -2));
                ArrayList arrayList2 = new ArrayList(this.y0.invoice.prices);
                this.p0 = arrayList2;
                TLRPC.TL_shippingOption tL_shippingOption2 = this.C0;
                if (tL_shippingOption2 != null) {
                    arrayList2.addAll(tL_shippingOption2.prices);
                }
                this.N0 = new String[1];
                for (int i39 = 0; i39 < this.p0.size(); i39++) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.p0.get(i39);
                    org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context);
                    c9Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                    c9Var.a(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.y0.invoice.currency), false);
                    this.M.addView(c9Var);
                }
                if (this.q0 == 5 && this.D0 != null) {
                    org.telegram.ui.Cells.c9 c9Var2 = new org.telegram.ui.Cells.c9(context);
                    c9Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                    c9Var2.a(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.D0.longValue(), this.y0.invoice.currency), false);
                    this.M.addView(c9Var2);
                }
                org.telegram.ui.Cells.c9 c9Var3 = new org.telegram.ui.Cells.c9(context);
                this.N = c9Var3;
                int i40 = org.telegram.ui.ActionBar.f6.d6;
                c9Var3.setBackgroundColor(getThemedColor(i40));
                this.N0[0] = r0(this.p0);
                this.N.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.N0[0], true);
                float f10 = 14.0f;
                if (this.q0 == 4 && (this.y0.invoice.flags & 256) != 0) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    frameLayout5.setClipChildren(false);
                    frameLayout5.setBackgroundColor(getThemedColor(i40));
                    this.M.addView(frameLayout5, g7.e6.n(-1, this.y0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                    frameLayout5.setOnClickListener(new ym0(this, 14));
                    org.telegram.ui.Cells.c9 c9Var4 = new org.telegram.ui.Cells.c9(context);
                    c9Var4.setBackgroundColor(getThemedColor(i40));
                    c9Var4.a(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                    frameLayout5.addView(c9Var4);
                    this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                    this.f[0].setTag(0);
                    this.f[0].setTextSize(1, 16.0f);
                    EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                    int i41 = org.telegram.ui.ActionBar.f6.z6;
                    editTextBoldCursor7.setHintTextColor(getThemedColor(i41));
                    this.f[0].setTextColor(getThemedColor(i41));
                    this.f[0].setBackgroundDrawable(null);
                    this.f[0].setCursorColor(getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                    this.f[0].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f[0].setCursorWidth(1.5f);
                    this.f[0].setInputType(3);
                    this.f[0].setImeOptions(268435462);
                    this.f[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.y0.invoice.currency));
                    this.f[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.f[0].setGravity(LocaleController.isRTL ? 3 : 5);
                    frameLayout5.addView(this.f[0], g7.e6.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                    this.f[0].addTextChangedListener(new fn0(this));
                    this.f[0].setOnEditorActionListener(new org.telegram.ui.Components.o2(3));
                    this.f[0].requestFocus();
                    if (!this.y0.invoice.suggested_tip_amounts.isEmpty()) {
                        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                        horizontalScrollView.setHorizontalScrollBarEnabled(false);
                        horizontalScrollView.setVerticalScrollBarEnabled(false);
                        horizontalScrollView.setClipToPadding(false);
                        horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                        horizontalScrollView.setFillViewport(true);
                        frameLayout5.addView(horizontalScrollView, g7.e6.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                        int[] iArr = new int[1];
                        int[] iArr2 = new int[1];
                        int size2 = this.y0.invoice.suggested_tip_amounts.size();
                        gn0 gn0Var = new gn0(context, size2, iArr, iArr2);
                        this.o0 = gn0Var;
                        gn0Var.setOrientation(0);
                        horizontalScrollView.addView(this.o0, g7.e6.x(-1, 30, 51));
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.ei);
                        int i42 = 0;
                        while (i42 < size2) {
                            long longValue = LocaleController.isRTL ? this.y0.invoice.suggested_tip_amounts.get((size2 - i42) - 1).longValue() : this.y0.invoice.suggested_tip_amounts.get(i42).longValue();
                            String formatCurrencyString = LocaleController.getInstance().formatCurrencyString(longValue, this.y0.invoice.currency);
                            TextView g10 = org.telegram.messenger.l0.g(context, 1, f10);
                            g10.setTypeface(AndroidUtilities.bold());
                            g10.setLines(1);
                            g10.setTag(Long.valueOf(longValue));
                            g10.setMaxLines(1);
                            g10.setText(formatCurrencyString);
                            g10.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                            g10.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Z8));
                            g10.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(15.0f), themedColor & 536870911));
                            g10.setSingleLine(true);
                            g10.setGravity(17);
                            this.o0.addView(g10, g7.e6.t(-2, -1, 19, 0, 0, i42 != size2 + (-1) ? 9 : 0, 0));
                            g10.setOnClickListener(new gh.s2(this, g10, longValue, 6));
                            int dp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(g10.getPaint().measureText(formatCurrencyString)));
                            g10.setTag(R.id.width_tag, Integer.valueOf(dp));
                            iArr[0] = Math.max(iArr[0], dp);
                            iArr2[0] = iArr2[0] + dp;
                            i42++;
                            size2 = size2;
                            f10 = 14.0f;
                        }
                    }
                }
                this.M.addView(this.N);
                this.G[2] = new org.telegram.ui.Cells.z6(context, (Object) null);
                this.G[2].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                this.M.addView(this.G[2], g7.e6.n(-1, -2));
                this.U[0] = new hn0(context);
                this.U[0].setBackground(org.telegram.ui.ActionBar.f6.K0(true));
                org.telegram.ui.Cells.a9 a9Var = this.U[0];
                String str8 = this.t0;
                a9Var.b(R.drawable.msg_payment_card, (str8 == null || str8.length() <= 1) ? this.t0 : this.t0.substring(0, 1).toUpperCase() + this.t0.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), true);
                if (this.R0 || this.S0) {
                    String str9 = this.t0;
                    i9 = (str9 == null || str9.length() <= 1) ? 8 : 0;
                } else {
                    i9 = 0;
                }
                int i43 = 0;
                this.U[0].setVisibility(i9);
                this.M.addView(this.U[0]);
                if (this.q0 == 4) {
                    this.U[0].setOnClickListener(new ym0(this, i43));
                }
                TLRPC.User user3 = null;
                for (int i44 = 0; i44 < this.y0.users.size(); i44++) {
                    TLRPC.User user4 = this.y0.users.get(i44);
                    if (user4.id == this.y0.provider_id) {
                        user3 = user4;
                    }
                }
                char c13 = 1;
                this.U[1] = new org.telegram.ui.Cells.a9(context);
                this.U[1].setBackground(org.telegram.ui.ActionBar.f6.K0(true));
                if (user3 != null) {
                    org.telegram.ui.Cells.a9 a9Var2 = this.U[1];
                    str5 = ContactsController.formatName(user3.first_name, user3.last_name);
                    String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                    int i45 = R.drawable.msg_payment_provider;
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.E0;
                    a9Var2.b(i45, str5, string, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.C0 == null)) && ((tL_paymentRequestedInfo = this.y0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                    c13 = 1;
                    this.M.addView(this.U[1]);
                }
                this.U[c13].setVisibility(user3 != null ? i9 : 8);
                TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.E0;
                if (tL_payments_validateRequestedInfo2 != null || (this.R0 && (paymentForm2 = this.y0) != null && paymentForm2.saved_info != null)) {
                    TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.y0.saved_info;
                    this.U[2] = new org.telegram.ui.Cells.a9(context);
                    this.U[2].setVisibility(8);
                    this.M.addView(this.U[2]);
                    if (tL_paymentRequestedInfo12.shipping_address != null) {
                        this.U[2].setVisibility(0);
                        if (this.q0 == 4) {
                            this.U[2].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                            this.U[2].setOnClickListener(new ym0(this, 1));
                        } else {
                            this.U[2].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        }
                    }
                    this.U[3] = new org.telegram.ui.Cells.a9(context);
                    this.U[3].setVisibility(8);
                    this.M.addView(this.U[3]);
                    if (tL_paymentRequestedInfo12.name != null) {
                        this.U[3].setVisibility(0);
                        if (this.q0 == 4) {
                            this.U[3].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                            this.U[3].setOnClickListener(new ym0(this, 2));
                        } else {
                            this.U[3].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        }
                    }
                    this.U[4] = new org.telegram.ui.Cells.a9(context);
                    this.U[4].setVisibility(8);
                    this.M.addView(this.U[4]);
                    if (tL_paymentRequestedInfo12.phone != null) {
                        this.U[4].setVisibility(0);
                        if (this.q0 == 4) {
                            this.U[4].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                            this.U[4].setOnClickListener(new ym0(this, 3));
                        } else {
                            this.U[4].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        }
                    }
                    this.U[5] = new org.telegram.ui.Cells.a9(context);
                    this.U[5].setVisibility(8);
                    this.M.addView(this.U[5]);
                    if (tL_paymentRequestedInfo12.email != null) {
                        this.U[5].setVisibility(0);
                        int i46 = 4;
                        if (this.q0 == 4) {
                            this.U[5].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                            this.U[5].setOnClickListener(new ym0(this, i46));
                        } else {
                            this.U[5].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        }
                    }
                    if (this.C0 != null) {
                        this.U[6] = new org.telegram.ui.Cells.a9(context);
                        this.U[6].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        this.U[6].b(R.drawable.msg_payment_delivery, this.C0.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), false);
                        this.M.addView(this.U[6]);
                    }
                    A0(tL_paymentRequestedInfo12);
                }
                if (this.q0 == 4) {
                    this.B = !this.R0;
                    if (this.X0 instanceof TLRPC.TL_inputInvoiceStars) {
                        this.B = true;
                    }
                    this.S = new yn0(this, context);
                    View view = new View(context);
                    view.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.i6), 2, -1));
                    this.S.addView(view, g7.e6.c(-1.0f, -1));
                    frameLayout2.addView(this.S, g7.e6.e(-1, 48, 80));
                    this.S.setOnClickListener(new v80(11, this, str5));
                    TextView textView2 = new TextView(context);
                    this.Q = textView2;
                    int i47 = org.telegram.ui.ActionBar.f6.fi;
                    textView2.setTextColor(getThemedColor(i47));
                    this.Q.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.N0[0]));
                    this.Q.setTextSize(1, 14.0f);
                    this.Q.setGravity(17);
                    this.Q.setTypeface(AndroidUtilities.bold());
                    this.S.addView(this.Q, g7.e6.c(-1.0f, -1));
                    org.telegram.ui.Components.jq jqVar2 = new org.telegram.ui.Components.jq(context, 0);
                    this.s = jqVar2;
                    jqVar2.setVisibility(4);
                    int themedColor2 = getThemedColor(i47);
                    this.s.a(805306367 & themedColor2, themedColor2);
                    this.S.addView(this.s, g7.e6.c(-1.0f, -1));
                    this.S.a(this.B, false);
                    this.Q.setAlpha(!this.B ? 0.8f : 1.0f);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    AndroidUtilities.checkAndroidTheme(context, true);
                    try {
                        mn0 mn0Var = new mn0(context);
                        this.w = mn0Var;
                        mn0Var.setBackgroundColor(-1);
                        this.w.getSettings().setJavaScriptEnabled(true);
                        this.w.getSettings().setDomStorageEnabled(true);
                        this.w.getSettings().setSupportZoom(true);
                        this.w.getSettings().setBuiltInZoomControls(true);
                        this.w.getSettings().setDisplayZoomControls(false);
                        this.w.getSettings().setUseWideViewPort(true);
                        this.w.getSettings().setMixedContentMode(0);
                        CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                        this.w.setWebViewClient(new nn0(this, context));
                    } catch (Exception e15) {
                        FileLog.e(e15);
                    }
                    this.R = null;
                    if (this.y0.invoice.terms_url != null) {
                        org.telegram.ui.Cells.o6 o6Var = new org.telegram.ui.Cells.o6(context, getResourceProvider());
                        this.R = o6Var;
                        o6Var.setChecked(this.B);
                        if (TextUtils.isEmpty(this.l0)) {
                            String string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrentFee);
                            spannableStringBuilder = new SpannableStringBuilder(string2);
                            int indexOf = string2.indexOf(42);
                            int lastIndexOf = string2.lastIndexOf(42);
                            if (indexOf != -1 && lastIndexOf != -1) {
                                SpannableString spannableString = new SpannableString(string2.substring(indexOf + 1, lastIndexOf));
                                spannableString.setSpan(new org.telegram.ui.Components.p41(this.y0.invoice.terms_url), 0, spannableString.length(), 33);
                                int i48 = lastIndexOf + 1;
                                spannableStringBuilder.replace(indexOf, i48, (CharSequence) spannableString);
                                string2.substring(0, indexOf);
                                spannableString.toString();
                                string2.substring(i48);
                            }
                        } else {
                            String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                            spannableStringBuilder = new SpannableStringBuilder(string3);
                            int indexOf2 = string3.indexOf(42);
                            int lastIndexOf2 = string3.lastIndexOf(42);
                            if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                SpannableString spannableString2 = new SpannableString(string3.substring(indexOf2 + 1, lastIndexOf2));
                                spannableString2.setSpan(new org.telegram.ui.Components.p41(this.y0.invoice.terms_url), 0, spannableString2.length(), 33);
                                int i49 = lastIndexOf2 + 1;
                                spannableStringBuilder.replace(indexOf2, i49, (CharSequence) spannableString2);
                                string3 = string3.substring(0, indexOf2) + ((Object) spannableString2) + string3.substring(i49);
                            }
                            int indexOf3 = string3.indexOf("%1$s");
                            if (indexOf3 != -1) {
                                spannableStringBuilder.replace(indexOf3, indexOf3 + 4, (CharSequence) this.l0);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), indexOf3, this.l0.length() + indexOf3, 33);
                            }
                        }
                        this.R.setText(spannableStringBuilder);
                        this.R.setBackground(org.telegram.ui.ActionBar.f6.g0(getThemedColor(org.telegram.ui.ActionBar.f6.d6), getThemedColor(org.telegram.ui.ActionBar.f6.i6)));
                        this.R.setOnClickListener(new ym0(this, 5));
                        frameLayout2.addView(this.R, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                    }
                    WebView webView = this.w;
                    if (webView != null) {
                        frameLayout2.addView(webView, g7.e6.c(-1.0f, -1));
                        this.w.setVisibility(8);
                    }
                }
                this.G[1] = new org.telegram.ui.Cells.z6(context, (Object) null);
                this.G[1].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                if (i9 != 0 && this.q0 == 4 && this.E0 == null && ((paymentForm = this.y0) == null || paymentForm.saved_info == null)) {
                    c10 = 1;
                    this.G[1].setVisibility(i9);
                } else {
                    c10 = 1;
                }
                this.M.addView(this.G[c10], g7.e6.n(-1, -2));
            } else if (i16 == 6) {
                org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context);
                this.O = k3Var;
                String string4 = LocaleController.getString(R.string.PasswordCode);
                EditTextBoldCursor editTextBoldCursor8 = k3Var.a;
                editTextBoldCursor8.setText("");
                editTextBoldCursor8.setHint(string4);
                final int i50 = 0;
                k3Var.b = false;
                k3Var.setWillNotDraw(true);
                this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                EditTextBoldCursor textView3 = this.O.getTextView();
                textView3.setInputType(3);
                textView3.setImeOptions(6);
                textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.an0
                    public final /* synthetic */ co0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView22, int i232, KeyEvent keyEvent) {
                        EditTextBoldCursor[] editTextBoldCursorArr;
                        switch (i50) {
                            case 0:
                                co0 co0Var = this.b;
                                if (i232 != 6) {
                                    co0Var.getClass();
                                    break;
                                } else {
                                    co0Var.z0(false);
                                    break;
                                }
                            case 1:
                                co0 co0Var2 = this.b;
                                if (i232 != 6) {
                                    co0Var2.getClass();
                                    if (i232 == 5) {
                                        int intValue = ((Integer) textView22.getTag()).intValue();
                                        if (intValue != 0) {
                                            if (intValue == 1) {
                                                co0Var2.f[2].requestFocus();
                                                break;
                                            }
                                        } else {
                                            co0Var2.f[1].requestFocus();
                                            break;
                                        }
                                    }
                                } else {
                                    co0Var2.n.performClick();
                                    break;
                                }
                                break;
                            case 2:
                                co0 co0Var3 = this.b;
                                co0Var3.getClass();
                                if (i232 != 5) {
                                    if (i232 == 6) {
                                        co0Var3.n.performClick();
                                        break;
                                    }
                                } else {
                                    int intValue2 = ((Integer) textView22.getTag()).intValue();
                                    while (true) {
                                        intValue2++;
                                        EditTextBoldCursor[] editTextBoldCursorArr2 = co0Var3.f;
                                        if (intValue2 >= editTextBoldCursorArr2.length) {
                                            break;
                                        } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                            co0Var3.f[intValue2].requestFocus();
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                co0 co0Var4 = this.b;
                                co0Var4.getClass();
                                if (i232 != 5) {
                                    if (i232 == 6) {
                                        co0Var4.n.performClick();
                                        break;
                                    }
                                } else {
                                    int intValue3 = ((Integer) textView22.getTag()).intValue();
                                    do {
                                        int i242 = intValue3 + 1;
                                        editTextBoldCursorArr = co0Var4.f;
                                        if (i242 >= editTextBoldCursorArr.length) {
                                            break;
                                        } else {
                                            intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                        }
                                    } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                    co0Var4.f[intValue3].requestFocus();
                                    break;
                                }
                                break;
                            default:
                                co0 co0Var5 = this.b;
                                if (i232 != 6) {
                                    co0Var5.getClass();
                                    break;
                                } else {
                                    co0Var5.n.performClick();
                                    break;
                                }
                        }
                        return false;
                    }
                });
                textView3.addTextChangedListener(new o0(this, i30));
                this.M.addView(this.O, g7.e6.n(-1, -2));
                this.I[2] = new org.telegram.ui.Cells.b9(context, this.U0);
                this.I[2].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
                this.M.addView(this.I[2], g7.e6.n(-1, -2));
                this.J[1] = new org.telegram.ui.Cells.ba(context, this.U0);
                this.J[1].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                org.telegram.ui.Cells.ba baVar = this.J[1];
                int i51 = org.telegram.ui.ActionBar.f6.G6;
                baVar.setTag(Integer.valueOf(i51));
                this.J[1].setTextColor(getThemedColor(i51));
                this.J[1].b(LocaleController.getString(R.string.ResendCode), true);
                this.M.addView(this.J[1], g7.e6.n(-1, -2));
                this.J[1].setOnClickListener(new ym0(this, i13));
                this.J[0] = new org.telegram.ui.Cells.ba(context, this.U0);
                this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                org.telegram.ui.Cells.ba baVar2 = this.J[0];
                int i52 = org.telegram.ui.ActionBar.f6.p7;
                baVar2.setTag(Integer.valueOf(i52));
                this.J[0].setTextColor(getThemedColor(i52));
                this.J[0].b(LocaleController.getString(R.string.AbortPassword), false);
                this.M.addView(this.J[0], g7.e6.n(-1, -2));
                this.J[0].setOnClickListener(new ym0(this, 7));
                this.f = new EditTextBoldCursor[3];
                int i53 = 0;
                for (int i54 = 3; i53 < i54; i54 = 3) {
                    if (i53 == 0) {
                        this.E[0] = new org.telegram.ui.Cells.m4(context, this.U0);
                        this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        this.E[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                        this.M.addView(this.E[0], g7.e6.n(-1, -2));
                    } else if (i53 == 2) {
                        this.E[1] = new org.telegram.ui.Cells.m4(context, this.U0);
                        this.E[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        this.E[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                        this.M.addView(this.E[1], g7.e6.n(-1, -2));
                    }
                    FrameLayout frameLayout6 = new FrameLayout(context);
                    frameLayout6.setClipChildren(false);
                    this.M.addView(frameLayout6, g7.e6.n(-1, 50));
                    int i55 = org.telegram.ui.ActionBar.f6.d6;
                    frameLayout6.setBackgroundColor(getThemedColor(i55));
                    if (i53 == 0) {
                        org.telegram.ui.Components.an anVar4 = new org.telegram.ui.Components.an(context, 18);
                        anVar4.setBackgroundColor(getThemedColor(i55));
                        this.F.add(anVar4);
                        frameLayout6.addView(anVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                    }
                    this.f[i53] = new EditTextBoldCursor(context);
                    this.f[i53].setTag(Integer.valueOf(i53));
                    this.f[i53].setTextSize(1, 16.0f);
                    this.f[i53].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.H6));
                    EditTextBoldCursor editTextBoldCursor9 = this.f[i53];
                    int i56 = org.telegram.ui.ActionBar.f6.G6;
                    editTextBoldCursor9.setTextColor(getThemedColor(i56));
                    this.f[i53].setBackgroundDrawable(null);
                    this.f[i53].setCursorColor(getThemedColor(i56));
                    this.f[i53].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.f[i53].setCursorWidth(1.5f);
                    if (i53 == 0 || i53 == 1) {
                        this.f[i53].setInputType(129);
                        this.f[i53].setTypeface(Typeface.DEFAULT);
                        this.f[i53].setImeOptions(268435461);
                    } else {
                        this.f[i53].setInputType(33);
                        this.f[i53].setImeOptions(268435462);
                    }
                    if (i53 == 0) {
                        this.f[i53].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                        this.f[i53].requestFocus();
                    } else if (i53 == 1) {
                        this.f[i53].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                    } else if (i53 == 2) {
                        this.f[i53].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                    }
                    this.f[i53].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.f[i53].setGravity(LocaleController.isRTL ? 5 : 3);
                    frameLayout6.addView(this.f[i53], g7.e6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i57 = 1;
                    this.f[i53].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.an0
                        public final /* synthetic */ co0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i232, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i57) {
                                case 0:
                                    co0 co0Var = this.b;
                                    if (i232 != 6) {
                                        co0Var.getClass();
                                        break;
                                    } else {
                                        co0Var.z0(false);
                                        break;
                                    }
                                case 1:
                                    co0 co0Var2 = this.b;
                                    if (i232 != 6) {
                                        co0Var2.getClass();
                                        if (i232 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    co0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                co0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        co0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    co0 co0Var3 = this.b;
                                    co0Var3.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            co0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = co0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                co0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    co0 co0Var4 = this.b;
                                    co0Var4.getClass();
                                    if (i232 != 5) {
                                        if (i232 == 6) {
                                            co0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i242 = intValue3 + 1;
                                            editTextBoldCursorArr = co0Var4.f;
                                            if (i242 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i242 == 4 ? intValue3 + 2 : i242;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        co0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    co0 co0Var5 = this.b;
                                    if (i232 != 6) {
                                        co0Var5.getClass();
                                        break;
                                    } else {
                                        co0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    if (i53 == 1) {
                        this.I[0] = new org.telegram.ui.Cells.b9(context, this.U0);
                        this.I[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                        this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
                        this.M.addView(this.I[0], g7.e6.n(-1, -2));
                    } else if (i53 == 2) {
                        this.I[1] = new org.telegram.ui.Cells.b9(context, this.U0);
                        this.I[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                        this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                        this.M.addView(this.I[1], g7.e6.n(-1, -2));
                    }
                    i53++;
                }
                I0();
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.y0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
            return;
        }
        if (i9 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.y0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
            return;
        }
        if (i9 == NotificationCenter.paymentFinished) {
            this.W0 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.U0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        org.telegram.ui.Components.jq jqVar = this.r;
        int i10 = org.telegram.ui.ActionBar.f6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(jqVar, 0, null, null, null, null, i10));
        org.telegram.ui.Components.jq jqVar2 = this.r;
        int i11 = org.telegram.ui.ActionBar.f6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(jqVar2, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 0, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 0, null, null, null, null, i11));
        if (this.f != null) {
            int i12 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6((View) editTextBoldCursorArr[i12].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.f[i12], 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.f[i12], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
                i12++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.f6.H6));
        }
        if (this.h != null) {
            int i13 = 0;
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = this.h;
                if (i13 >= j6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h6(j6VarArr[i13], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.h[i13], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.h[i13], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.h[i13], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.g7));
                arrayList.add(new org.telegram.ui.ActionBar.h6(this.h[i13], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h7));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.h7));
        }
        int i14 = 0;
        while (true) {
            org.telegram.ui.Cells.m4[] m4VarArr = this.E;
            if (i14 >= m4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(m4VarArr[i14], 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(m4VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
            i14++;
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.G;
            if (i15 >= z6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(z6VarArr[i15], 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.b9[] b9VarArr = this.I;
            if (i16 >= b9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i16], 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(b9VarArr[i16], 2, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.J6));
            i16++;
        }
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = this.F;
            if (i17 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6((View) arrayList2.get(i17), 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
            i17++;
        }
        org.telegram.ui.Cells.k3 k3Var = this.O;
        int i18 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(k3Var, 1, null, null, null, null, i18));
        int i19 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, 4, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.O, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.k3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, TLObject.FLAG_28, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        int i20 = 0;
        while (true) {
            org.telegram.ui.Cells.ba[] baVarArr = this.J;
            if (i20 >= baVarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(baVarArr[i20], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(baVarArr[i20], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(baVarArr[i20], 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            i20++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.s6));
        int i21 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 16, new Class[]{org.telegram.ui.Cells.c9.class}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 262144, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 262144, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        int i23 = org.telegram.ui.ActionBar.f6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 262144, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M, 262144, new Class[]{org.telegram.ui.Cells.c9.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        org.telegram.ui.Cells.a9[] a9VarArr = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[0], TLObject.FLAG_28, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[0], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        for (int i24 = 1; i24 < a9VarArr.length; i24++) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[i24], 1, null, null, null, null, org.telegram.ui.ActionBar.f6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[i24], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(a9VarArr[i24], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        }
        org.telegram.ui.Cells.l5 l5Var = this.T;
        int i25 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(l5Var, 1, null, null, null, null, i25));
        int i26 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"nameTextView"}, null, null, -1, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailTextView"}, null, null, -1, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 0, new Class[]{org.telegram.ui.Cells.l5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, TLObject.FLAG_28, null, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.C;
    }

    public final void m0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
        this.K.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setClickable(true);
        this.L.setFocusable(true);
        this.L.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.G0 == null) {
            this.L.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.L.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.K.addView(this.L, g7.e6.c(48.0f, -1));
        this.L.setOnClickListener(new ym0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.L.addView(linearLayout, g7.e6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, g7.e6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.L.addView(imageView2, g7.e6.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:29:0x0054, B:33:0x0062, B:35:0x0075, B:31:0x006f, B:39:0x0086), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0013, B:12:0x001d, B:14:0x0024, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:29:0x0054, B:33:0x0062, B:35:0x0075, B:31:0x006f, B:39:0x0086), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(String str) {
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
                        str = ne.b.d(telephonyManager.getLine1Number(), false);
                    }
                    if (TextUtils.isEmpty(str)) {
                        int i9 = 4;
                        String str2 = null;
                        if (str.length() > 4) {
                            while (true) {
                                if (i9 < 1) {
                                    z11 = false;
                                    break;
                                }
                                String substring = str.substring(0, i9);
                                if (((String) this.c.get(substring)) != null) {
                                    str2 = str.substring(i9);
                                    this.f[8].setText(substring);
                                    z11 = true;
                                    break;
                                }
                                i9--;
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        if (i9 == 991) {
            AndroidUtilities.runOnUIThread(new jh0(this, i10, intent, 2));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        WebView webView = this.w;
        if (webView == null || !this.y) {
            return !this.L0;
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
        if (this.q0 == 4 && this.T0) {
            this.T0 = false;
            this.S.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.q0 != 4 || this.R0) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (r0 != 6) goto L58;
     */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFragmentDestroy() {
        ao0 ao0Var = this.P;
        if (ao0Var != null) {
            ao0Var.b();
        }
        int i9 = 0;
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        if (!this.W0) {
            this.b1 = 2;
            if (this.V0 != null) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var != null && b5Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i9 >= this.parentLayout.getFragmentStack().size()) {
                            i9 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(i9)) instanceof co0) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    i9 -= indexOf;
                }
                if (i9 == 0) {
                    this.V0.b(this.b1);
                }
            }
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.q0 != 4 || this.R0) {
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        try {
            int i10 = this.q0;
            if (i10 != 2) {
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (SharedConfig.passcodeHash.length() != 0) {
                    if (SharedConfig.allowScreenCapture) {
                    }
                }
                getParentActivity().getWindow().clearFlags(8192);
                AndroidUtilities.logFlagSecure();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.onFragmentDestroy();
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i9 = this.q0;
                if ((i9 == 2 || i9 == 6) && !this.y0.invoice.test) {
                    getParentActivity().getWindow().setFlags(8192, 8192);
                    AndroidUtilities.logFlagSecure();
                } else if (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture) {
                    getParentActivity().getWindow().clearFlags(8192);
                    AndroidUtilities.logFlagSecure();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || z11) {
            return;
        }
        WebView webView = this.w;
        if (webView != null) {
            if (this.q0 != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.B0;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.x = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.y0.url;
                    this.x = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i9 = this.q0;
        if (i9 == 2) {
            AndroidUtilities.runOnUIThread(new bn0(this, 0), 100L);
            return;
        }
        if (i9 == 3) {
            this.f[1].requestFocus();
            AndroidUtilities.showKeyboard(this.f[1]);
            return;
        }
        if (i9 == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (i9 != 6 || this.X) {
            return;
        }
        this.f[0].requestFocus();
        AndroidUtilities.showKeyboard(this.f[0]);
    }

    public final long p0() {
        TLRPC.InputInvoice inputInvoice = this.X0;
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        x0(o2Var);
        return super.presentFragment(o2Var);
    }

    public final long q0() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.X0;
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

    public final String r0(ArrayList arrayList) {
        long j10 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i9)).amount;
        }
        Long l10 = this.D0;
        if (l10 != null) {
            j10 += l10.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j10, this.y0.invoice.currency);
    }

    public final void s0() {
        int i9;
        int i10;
        boolean z10;
        int i11 = this.q0;
        if (i11 == 0) {
            ao0 ao0Var = this.P;
            if (ao0Var != null) {
                ao0Var.d(this.E0);
                finishFragment();
                return;
            }
            if (this.y0.invoice.flexible) {
                i9 = 1;
            } else if (this.u0 == null && this.s0 == null) {
                i9 = 2;
            } else {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                i9 = UserConfig.getInstance(this.currentAccount).tmpPassword != null ? 4 : 3;
            }
            if (i9 == 2 && this.u0 == null && this.s0 == null && !this.y0.additional_methods.isEmpty()) {
                F0(new bn0(this, 1));
                return;
            }
            co0 co0Var = new co0(this.X0, this.y0, this.J0, this.K0, i9, this.A0, null, null, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
            co0Var.Y0 = this.Y0;
            co0Var.Z0 = this.Z0;
            presentFragment(co0Var, this.O0);
            return;
        }
        if (i11 == 1) {
            if (this.s0 == null && this.t0 == null) {
                if (this.u0 != null) {
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                        UserConfig.getInstance(this.currentAccount).saveConfig(false);
                    }
                    if (UserConfig.getInstance(this.currentAccount).tmpPassword == null) {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 2 && this.t0 == null && this.u0 == null && this.s0 == null && !this.y0.additional_methods.isEmpty()) {
                    F0(new bn0(this, 1));
                    return;
                }
                co0 co0Var2 = new co0(this.X0, this.y0, this.J0, this.K0, i10, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
                co0Var2.Y0 = this.Y0;
                co0Var2.Z0 = this.Z0;
                presentFragment(co0Var2, this.O0);
                return;
            }
            i10 = 4;
            if (i10 != 2) {
            }
            co0 co0Var22 = new co0(this.X0, this.y0, this.J0, this.K0, i10, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
            co0Var22.Y0 = this.Y0;
            co0Var22.Z0 = this.Z0;
            presentFragment(co0Var22, this.O0);
            return;
        }
        if (i11 == 2) {
            TLRPC.PaymentForm paymentForm = this.y0;
            if (paymentForm.password_missing && (z10 = this.Q0)) {
                co0 co0Var3 = new co0(this.X0, paymentForm, this.J0, this.K0, 6, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, z10, this.F0, this.n0, this.S0);
                this.b0 = co0Var3;
                co0Var3.Y0 = this.Y0;
                co0Var3.Z0 = this.Z0;
                co0Var3.B0(this.W);
                co0 co0Var4 = this.b0;
                co0Var4.P = new qn0(this);
                presentFragment(co0Var4, this.O0);
                return;
            }
            ao0 ao0Var2 = this.P;
            if (ao0Var2 != null) {
                ao0Var2.c(this.s0, this.t0, this.Q0, this.F0, null);
                finishFragment();
                return;
            } else {
                co0 co0Var5 = new co0(this.X0, paymentForm, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
                co0Var5.Y0 = this.Y0;
                co0Var5.Z0 = this.Z0;
                presentFragment(co0Var5, this.O0);
                return;
            }
        }
        if (i11 == 3) {
            co0 co0Var6 = new co0(this.X0, this.y0, this.J0, this.K0, this.r0 ? 4 : 2, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
            co0Var6.Y0 = this.Y0;
            co0Var6.Z0 = this.Z0;
            presentFragment(co0Var6, true);
            return;
        }
        if (i11 != 4) {
            if (i11 != 6) {
                return;
            }
            if (this.P.c(this.s0, this.t0, this.Q0, this.F0, this.u0)) {
                finishFragment();
                return;
            }
            co0 co0Var7 = new co0(this.X0, this.y0, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, false);
            co0Var7.Y0 = this.Y0;
            co0Var7.Z0 = this.Z0;
            presentFragment(co0Var7, true);
            return;
        }
        if (this.R0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback != null) {
            AndroidUtilities.runOnUIThread(new bn0(this, 2), 500L);
        } else {
            if (w0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    public final void t0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i9, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        if (o2Var != null) {
            this.currentAccount = o2Var.getCurrentAccount();
        }
        this.q0 = i9;
        this.n0 = o2Var;
        this.s0 = str2;
        this.F0 = tL_inputPaymentCredentialsGooglePay;
        this.A0 = tL_payments_validatedRequestedInfo;
        this.y0 = paymentForm;
        this.C0 = tL_shippingOption;
        this.D0 = l10;
        this.J0 = messageObject;
        this.K0 = str;
        this.X0 = inputInvoice;
        this.Q0 = z10;
        this.S0 = z11;
        this.O0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.y0.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.h0 = user;
        if (user != null) {
            this.l0 = user.first_name;
        } else {
            this.l0 = "";
        }
        this.m0 = paymentForm.title;
        this.E0 = tL_payments_validateRequestedInfo;
        this.P0 = true;
        if (z10 || this.q0 == 4) {
            this.Q0 = z10;
        } else {
            this.Q0 = !this.y0.saved_credentials.isEmpty();
        }
        if (str3 != null) {
            this.t0 = str3;
        } else {
            if (this.y0.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.y0.saved_credentials.get(0);
            this.u0 = tL_paymentSavedCredentialsCard;
            this.t0 = tL_paymentSavedCredentialsCard.title;
        }
    }

    public final void u0(Context context) {
        Optional empty;
        if (getParentActivity() == null) {
            return;
        }
        com.google.android.gms.internal.cast.a aVar = new com.google.android.gms.internal.cast.a();
        int i9 = this.y0.invoice.test ? 3 : 1;
        if (i9 != 2 && i9 != 1 && i9 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(j3.r0.l(i9, "Invalid environment value "));
        }
        aVar.a = i9;
        this.e = new com.google.android.gms.internal.clearcut.v0(context, f8.p.a, new f8.o(aVar), com.google.android.gms.common.api.i.c);
        try {
            JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            put.put("allowedPaymentMethods", new JSONArray().put(o0()));
            empty = Optional.of(put);
        } catch (JSONException unused) {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            String jSONObject = ((JSONObject) empty.get()).toString();
            f8.e eVar = new f8.e();
            x5.l.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.a = 23705;
            b10.c = new k5.i(eVar, 14);
            v0Var.e(0, b10.b()).addOnCompleteListener(getParentActivity(), new cn0(this, 0));
        }
    }

    public final void v0() {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new en0(this, 1), 10);
    }

    public final boolean w0(org.telegram.ui.ActionBar.b5 b5Var, Activity activity) {
        int i9 = 0;
        if (this.X0 != null) {
            if (b5Var != null) {
                ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                    if (o2Var instanceof co0) {
                        o2Var.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.h0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.K0 == null) || (this.K0 != null && getMessagesController().premiumInvoiceSlug != null && Objects.equals(this.K0, getMessagesController().premiumInvoiceSlug))) && b5Var != null) {
            ArrayList arrayList2 = new ArrayList(b5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                if ((o2Var2 instanceof qn) || (o2Var2 instanceof PremiumPreviewFragment)) {
                    o2Var2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.l0 = true;
            ((ActionBarLayout) b5Var).Q(premiumPreviewFragment, !isFinishing());
            if (activity instanceof LaunchActivity) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                ((LaunchActivity) activity).t0.c(false);
            }
            return true;
        }
        return false;
    }

    public final void x0(org.telegram.ui.ActionBar.o2 o2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (o2Var instanceof co0) {
            co0 co0Var = (co0) o2Var;
            co0Var.V0 = this.V0;
            co0Var.U0 = this.U0;
            co0Var.T0 = this.T0;
            co0Var.u0 = this.u0;
        }
    }

    public final void y0() {
        String str;
        if (this.M0) {
            return;
        }
        G0(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.X0;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.J0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.J0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.J0.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.K0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.y0.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword == null || this.u0 == null) {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.F0;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.Q0;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.s0;
            }
        } else {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.u0.id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.A0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.C0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.y0.invoice.flags & 256) != 0) {
            Long l10 = this.D0;
            tL_payments_sendPaymentForm.tip_amount = l10 != null ? l10.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new v40(17, this, tL_payments_sendPaymentForm), (this.S0 ? 8 : 0) | 2);
    }

    public final void z0(boolean z10) {
        String str;
        String str2;
        if (!z10 && this.O.getVisibility() == 0) {
            String text = this.O.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.k3 k3Var = this.O;
                try {
                    k3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                return;
            } else {
                G0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new en0(this, 0), 10);
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
                D0(0);
                return;
            }
            if (!obj.equals(this.f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                D0(1);
                return;
            }
            String obj2 = this.f[2].getText().toString();
            if (obj2.length() < 3) {
                D0(2);
                return;
            }
            int lastIndexOf = obj2.lastIndexOf(46);
            int lastIndexOf2 = obj2.lastIndexOf(64);
            if (lastIndexOf2 < 0 || lastIndexOf < lastIndexOf2) {
                D0(2);
                return;
            }
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings2;
            int i9 = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i9 | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.W.new_algo;
            passwordinputsettings2.flags = 3 | i9;
            passwordinputsettings2.email = obj2.trim();
            str = obj2;
            str2 = obj;
        }
        G0(true, true);
        Utilities.globalQueue.postRunnable(new bg.m(this, z10, str, str2, updatepasswordsettings));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        x0(o2Var);
        return super.presentFragment(o2Var, z10);
    }

    public co0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.m4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.z6[3];
        this.I = new org.telegram.ui.Cells.b9[3];
        this.J = new org.telegram.ui.Cells.ba[2];
        this.U = new org.telegram.ui.Cells.a9[7];
        this.V = -4.5f;
        this.Y = 6;
        this.R0 = true;
        t0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, o2Var, false);
    }

    public co0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.m4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.z6[3];
        this.I = new org.telegram.ui.Cells.b9[3];
        this.J = new org.telegram.ui.Cells.ba[2];
        this.U = new org.telegram.ui.Cells.a9[7];
        this.V = -4.5f;
        this.Y = 6;
        this.q0 = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.y0 = paymentForm;
        this.z0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.C0 = paymentReceipt.shipping;
        long j10 = paymentReceipt.tip_amount;
        if (j10 != 0) {
            this.D0 = Long.valueOf(j10);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.h0 = user;
        if (user != null) {
            this.l0 = user.first_name;
        } else {
            this.l0 = "";
        }
        this.m0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.E0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.J0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
                this.E0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.K0;
                this.E0.invoice = tL_inputInvoiceSlug;
            }
            this.E0.info = paymentReceipt.info;
        }
        this.t0 = paymentReceipt.credentials_title;
    }

    public co0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.o2 o2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, o2Var, false);
        this.R0 = true;
    }
}
