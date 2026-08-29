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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bo0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public final org.telegram.ui.Cells.k4[] E;
    public TLRPC.TL_payments_validateRequestedInfo E0;
    public final ArrayList F;
    public TLRPC.TL_inputPaymentCredentialsGooglePay F0;
    public final org.telegram.ui.Cells.x6[] G;
    public String G0;
    public org.telegram.ui.Cells.q8 H;
    public String H0;
    public final org.telegram.ui.Cells.y8[] I;
    public JSONObject I0;
    public final org.telegram.ui.Cells.y9[] J;
    public MessageObject J0;
    public FrameLayout K;
    public String K0;
    public FrameLayout L;
    public boolean L0;
    public LinearLayout M;
    public boolean M0;
    public org.telegram.ui.Cells.z8 N;
    public String[] N0;
    public org.telegram.ui.Cells.h3 O;
    public boolean O0;
    public zn0 P;
    public boolean P0;
    public TextView Q;
    public boolean Q0;
    public org.telegram.ui.Cells.m6 R;
    public boolean R0;
    public xn0 S;
    public boolean S0;
    public org.telegram.ui.Cells.j5 T;
    public boolean T0;
    public final org.telegram.ui.Cells.x8[] U;
    public org.telegram.ui.ActionBar.c6 U0;
    public float V;
    public ao0 V0;
    public TL_account.Password W;
    public boolean W0;
    public boolean X;
    public TLRPC.InputInvoice X0;
    public int Y;
    public Utilities.Callback Y0;
    public an0 Z;
    public Utilities.Callback Z0;
    public final ArrayList a;
    public boolean a0;
    public v10 a1;
    public final HashMap b;
    public bo0 b0;
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
    public org.telegram.ui.Cells.h6[] h;
    public TLRPC.User h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public String m0;
    public org.telegram.ui.ActionBar.w0 n;
    public org.telegram.ui.ActionBar.o2 n0;
    public fn0 o0;
    public ArrayList p0;
    public int q0;
    public org.telegram.ui.Components.nq r;
    public boolean r0;
    public org.telegram.ui.Components.nq s;
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

    public bo0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.k4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.x6[3];
        this.I = new org.telegram.ui.Cells.y8[3];
        this.J = new org.telegram.ui.Cells.y9[2];
        this.U = new org.telegram.ui.Cells.x8[7];
        this.V = -4.5f;
        this.Y = 6;
        u0(inputInvoice, paymentForm, messageObject, str, i10, tL_payments_validatedRequestedInfo, tL_shippingOption, l10, str2, str3, tL_payments_validateRequestedInfo, z10, tL_inputPaymentCredentialsGooglePay, o2Var, z11);
    }

    public static /* synthetic */ void U(bo0 bo0Var, TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x4 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        u80 u80Var = new u80(14, bo0Var, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            u80Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x4, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = startCheck;
        if (startCheck != null) {
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(gettmppassword, u80Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        u80Var.run(null, tL_error2);
    }

    public static /* synthetic */ void V(bo0 bo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        bo0Var.D0(false);
        bo0Var.H0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    bo0Var.E0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    bo0Var.E0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    bo0Var.E0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    bo0Var.E0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    bo0Var.E0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    bo0Var.E0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    bo0Var.E0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    bo0Var.E0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    bo0Var.E0(7);
                    break;
                default:
                    org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public static /* synthetic */ void W(bo0 bo0Var, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        bo0Var.A0 = tL_payments_validatedRequestedInfo;
        if (bo0Var.y0.saved_info != null && !bo0Var.P0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(tL_payments_clearSavedInfo, new lh.o5(17), bo0Var.S0 ? 8 : 0);
        }
        bo0Var.t0();
        bo0Var.D0(false);
        bo0Var.H0(true, false);
    }

    public static /* synthetic */ void X(bo0 bo0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        bo0Var.D0(false);
        bo0Var.H0(true, false);
        if (tL_error != null) {
            org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, tLObject, new Object[0]);
        }
    }

    public static /* synthetic */ void Y(bo0 bo0Var, org.telegram.ui.Components.mc mcVar, boolean z10, TLRPC.Message message) {
        mcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(bo0Var.currentAccount).getInputPeer(message.peer_id);
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new dn0(bo0Var, 3), 2);
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(tn.Q9(message.id, MessageObject.getDialogId(message)));
        }
    }

    public static void Z(bo0 bo0Var) {
        ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new lh.o5(17), bo0Var.S0 ? 8 : 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bo0Var.getParentActivity());
        alertDialog$Builder.a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        bo0Var.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(bo0 bo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        jh.j7 j7Var = new jh.j7(bo0Var, z10, str, 7);
        if (z10) {
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(updatepasswordsettings, j7Var, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = bo0Var.W.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            j7Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            j7Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(updatepasswordsettings, j7Var, 10);
    }

    public static /* synthetic */ void b0(bo0 bo0Var, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, tL_payments_sendPaymentForm, new Object[0]);
        bo0Var.D0(false);
        bo0Var.H0(false, false);
        bo0Var.W0 = true;
        bo0Var.b1 = 4;
        ao0 ao0Var = bo0Var.V0;
        if (ao0Var != null) {
            ao0Var.a(4);
        }
    }

    public static void c0(bo0 bo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            jh.ia.j1(bo0Var.getParentActivity(), bo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, bo0Var.U0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        bo0 bo0Var2 = new bo0((TLRPC.PaymentReceipt) tLObject);
        bo0Var2.Y0 = bo0Var.Y0;
        bo0Var2.Z0 = bo0Var.Z0;
        R.showAsSheet(bo0Var2, m2Var);
    }

    public static /* synthetic */ void d0(bo0 bo0Var, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        bo0Var.H0(true, false);
        bo0Var.D0(false);
        if (tLObject != null) {
            bo0Var.r0 = true;
            UserConfig.getInstance(bo0Var.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(bo0Var.currentAccount).saveConfig(false);
            bo0Var.t0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, gettmppassword, new Object[0]);
            return;
        }
        try {
            bo0Var.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(bo0Var.f[1], 3.25f);
        bo0Var.f[1].setText("");
    }

    public static void e0(bo0 bo0Var, TLObject tLObject) {
        org.telegram.ui.ActionBar.o2 R;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            jh.ia.j1(bo0Var.getParentActivity(), bo0Var.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, bo0Var.U0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (R = LaunchActivity.R()) == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
        m2Var.a = true;
        bo0 bo0Var2 = new bo0((TLRPC.PaymentReceipt) tLObject);
        bo0Var2.Y0 = bo0Var.Y0;
        bo0Var2.Z0 = bo0Var.Z0;
        R.showAsSheet(bo0Var2, m2Var);
    }

    public static /* synthetic */ void f0(bo0 bo0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            org.telegram.ui.Components.c5.f0(bo0Var.currentAccount, tL_error, bo0Var, getpassword, new Object[0]);
            bo0Var.H0(true, false);
            bo0Var.D0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.i0(password, false)) {
            org.telegram.ui.Components.c5.x0(bo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new xe0(bo0Var, password, AndroidUtilities.getStringBytes(str), 14));
        } else {
            bo0Var.r0 = false;
            bo0Var.t0();
        }
    }

    public static /* synthetic */ void g0(bo0 bo0Var, org.telegram.ui.Components.mc mcVar, boolean z10, TLRPC.Message[] messageArr) {
        mcVar.b();
        if (!z10) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(bo0Var.currentAccount).getInputPeer(messageArr[0].peer_id);
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new dn0(bo0Var, 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(tn.Q9(messageArr[0].id, MessageObject.getDialogId(messageArr[0])));
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
    public static void h0(bo0 bo0Var, String str, View view) {
        int i10;
        org.telegram.ui.Cells.m6 m6Var = bo0Var.R;
        if (m6Var != null && !bo0Var.B) {
            bo0Var.V = -bo0Var.V;
            AndroidUtilities.shakeViewSpring(m6Var.getTextView(), bo0Var.V);
            AndroidUtilities.shakeViewSpring(bo0Var.R.getCheckBox(), bo0Var.V);
            try {
                bo0Var.R.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z10 = bo0Var.R0;
        int i11 = 1;
        if (z10 && bo0Var.y0.saved_info != null && bo0Var.E0 == null) {
            bo0Var.D0(true);
            lf0 lf0Var = new lf0(15, bo0Var, view);
            if (bo0Var.M0) {
                return;
            }
            bo0Var.H0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
            bo0Var.E0 = tL_payments_validateRequestedInfo;
            TLRPC.InputInvoice inputInvoice = bo0Var.X0;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo.invoice = inputInvoice;
            } else if (bo0Var.J0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = bo0Var.getMessagesController().getInputPeer(bo0Var.J0.messageOwner.peer_id);
                tL_inputInvoiceMessage.msg_id = bo0Var.J0.getId();
                bo0Var.E0.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = bo0Var.K0;
                bo0Var.E0.invoice = tL_inputInvoiceSlug;
            }
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = bo0Var.E0;
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = bo0Var.y0.saved_info;
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new x9(bo0Var, lf0Var, tL_payments_validateRequestedInfo2, 29), (bo0Var.S0 ? 8 : 0) | 2);
            return;
        }
        if (z10) {
            TLRPC.PaymentForm paymentForm = bo0Var.y0;
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
                            bo0Var.G0(new org.telegram.ui.Components.eu(0, view));
                            return;
                        } else {
                            bo0 bo0Var2 = new bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, i10, bo0Var.A0, bo0Var.C0, bo0Var.D0, bo0Var.s0, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                            bo0Var2.Y0 = bo0Var.Y0;
                            bo0Var2.Z0 = bo0Var.Z0;
                            bo0Var.presentFragment(bo0Var2);
                            return;
                        }
                    }
                }
                i10 = (bo0Var.u0 == null && bo0Var.s0 == null && bo0Var.F0 == null) ? 2 : 1;
                if (i10 != 2) {
                }
                bo0 bo0Var22 = new bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, i10, bo0Var.A0, bo0Var.C0, bo0Var.D0, bo0Var.s0, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                bo0Var22.Y0 = bo0Var.Y0;
                bo0Var22.Z0 = bo0Var.Z0;
                bo0Var.presentFragment(bo0Var22);
                return;
            }
            if (bo0Var.u0 == null) {
                if (bo0Var.s0 == null) {
                }
            }
            if (bo0Var.C0 == null) {
            }
        }
        if (!bo0Var.y0.password_missing && bo0Var.u0 != null) {
            if (UserConfig.getInstance(bo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(bo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(bo0Var.currentAccount).getCurrentTime() + 60) {
                UserConfig.getInstance(bo0Var.currentAccount).tmpPassword = null;
                UserConfig.getInstance(bo0Var.currentAccount).saveConfig(false);
            }
            if (UserConfig.getInstance(bo0Var.currentAccount).tmpPassword == null) {
                bo0Var.T0 = true;
                bo0 bo0Var3 = new bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, 3, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                bo0Var3.Y0 = bo0Var.Y0;
                bo0Var3.Z0 = bo0Var.Z0;
                bo0Var.presentFragment(bo0Var3);
                bo0Var.T0 = false;
                return;
            }
            if (bo0Var.R0) {
                bo0Var.R0 = false;
                NotificationCenter.getInstance(bo0Var.currentAccount).removeObserver(bo0Var, NotificationCenter.paymentFinished);
            }
        }
        TLRPC.User user = bo0Var.h0;
        if (user == null || user.verified) {
            bo0Var.I0(bo0Var.N0[0]);
            return;
        }
        String str2 = "payment_warning_" + bo0Var.h0.id;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(bo0Var.currentAccount);
        if (notificationsSettings.getBoolean(str2, false)) {
            bo0Var.I0(bo0Var.N0[0]);
            return;
        }
        notificationsSettings.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bo0Var.getParentActivity());
        String string = LocaleController.getString(R.string.PaymentWarning);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string;
        c2Var.P = LocaleController.formatString("PaymentWarningText", R.string.PaymentWarningText, bo0Var.l0, str);
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new bn0(bo0Var, i11));
        bo0Var.showDialog(c2Var);
    }

    public static void i0(bo0 bo0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(new TL_account.getPassword(), new nh.l3(10, bo0Var, z10), 8);
            return;
        }
        bo0Var.H0(true, false);
        if (z10) {
            TL_account.Password password = bo0Var.W;
            password.has_password = false;
            password.current_algo = null;
            bo0Var.P.a(password);
            bo0Var.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (bo0Var.getParentActivity() == null) {
                return;
            }
            bo0Var.t0();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    bo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    bo0Var.F0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    bo0Var.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                    return;
                }
            }
            bo0Var.Y = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bo0Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new kl0(4, bo0Var, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.P = string;
            c2Var.N = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog showDialog = bo0Var.showDialog(c2Var);
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
    public static void j0(bo0 bo0Var) {
        Integer num;
        Integer num2;
        boolean z10;
        boolean z11;
        Integer num3;
        boolean z12;
        boolean z13;
        String[] split = bo0Var.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer parseInt = Utilities.parseInt((CharSequence) split[0]);
            num2 = Utilities.parseInt((CharSequence) split[1]);
            num = parseInt;
        } else {
            num = null;
            num2 = null;
        }
        int i10 = 4;
        ec.a aVar = new ec.a(bo0Var.f[0].getText().toString(), num, num2, bo0Var.f[3].getText().toString(), bo0Var.f[2].getText().toString(), null, null, null, null, bo0Var.f[5].getText().toString(), bo0Var.f[4].getText().toString(), null, null, null, null, null, null);
        bo0Var.t0 = aVar.a() + " *" + aVar.b();
        boolean z14 = num != null && num2 != null && UserConfig.getInstance(bo0Var.currentAccount).getClientPhone().startsWith("7") && "smartglocal".equals(bo0Var.y0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = aVar.a;
        if (!h7.z7.d(str)) {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!h7.z7.d(replaceAll) && replaceAll != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        int i12 = 0;
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
                                i12 += parseInt2;
                                length--;
                                z15 = z16;
                            } else if (i12 % 10 == 0) {
                                String a2 = aVar.a();
                                if (!"American Express".equals(a2) ? !(!"Diners Club".equals(a2) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    if (!z14) {
                                        Integer num4 = aVar.c;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12 && (num3 = aVar.d) != null && h7.w7.a(num3.intValue()) >= ab.b.A3().get(1)) {
                                            if (num4 == null || num4.intValue() < 1 || num4.intValue() > 12 || num3 == null || h7.w7.a(num3.intValue()) < ab.b.A3().get(1)) {
                                                z12 = false;
                                            } else {
                                                int intValue = num3.intValue();
                                                int intValue2 = num4.intValue();
                                                if (h7.w7.a(intValue) >= ab.b.A3().get(1)) {
                                                    Calendar A3 = ab.b.A3();
                                                    if (h7.w7.a(intValue) != A3.get(1) || intValue2 >= A3.get(2) + 1) {
                                                        z13 = false;
                                                        z12 = !z13;
                                                    }
                                                }
                                                z13 = true;
                                                z12 = !z13;
                                            }
                                        }
                                        bo0Var.E0(1);
                                        return;
                                    }
                                    if (bo0Var.e0 && bo0Var.f[2].length() == 0) {
                                        bo0Var.E0(2);
                                        return;
                                    }
                                    String str2 = aVar.b;
                                    if (!h7.z7.d(str2)) {
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
                                                    bo0Var.E0(3);
                                                    return;
                                                }
                                                if (bo0Var.c0 && bo0Var.f[4].length() == 0) {
                                                    bo0Var.E0(4);
                                                    return;
                                                }
                                                if (bo0Var.d0 && bo0Var.f[5].length() == 0) {
                                                    bo0Var.E0(5);
                                                    return;
                                                }
                                                bo0Var.H0(true, true);
                                                try {
                                                    if ("stripe".equals(bo0Var.y0.native_provider)) {
                                                        String str3 = bo0Var.f0;
                                                        m5.i iVar = new m5.i(new bb.a(i10), 8);
                                                        bb.a.E3(str3);
                                                        qn0 qn0Var = new qn0(bo0Var);
                                                        try {
                                                            bb.a.E3(str3);
                                                            new cc.a(iVar, str3, aVar, qn0Var).execute(new Void[0]);
                                                        } catch (dc.c e10) {
                                                            qn0Var.a(e10);
                                                        }
                                                    } else if ("smartglocal".equals(bo0Var.y0.native_provider)) {
                                                        new rn0(bo0Var, aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
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
                    } else if (!Character.isDigit(replaceAll.charAt(i11))) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        bo0Var.E0(0);
    }

    public static void k0(bo0 bo0Var) {
        if (UserConfig.getInstance(bo0Var.currentAccount).tmpPassword != null && UserConfig.getInstance(bo0Var.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(bo0Var.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(bo0Var.currentAccount).tmpPassword = null;
            UserConfig.getInstance(bo0Var.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(bo0Var.currentAccount).tmpPassword != null) {
            bo0Var.z0();
            return;
        }
        if (bo0Var.f[1].length() == 0) {
            try {
                bo0Var.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(bo0Var.f[1], 2.5f);
            return;
        }
        String obj = bo0Var.f[1].getText().toString();
        bo0Var.H0(true, true);
        bo0Var.D0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(getpassword, new x9(bo0Var, obj, getpassword, 28), (bo0Var.S0 ? 8 : 0) | 2);
    }

    public static void m0(bo0 bo0Var) {
        if (bo0Var.M0) {
            return;
        }
        bo0Var.H0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        bo0Var.E0 = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = bo0Var.X0;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (bo0Var.J0 != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = bo0Var.getMessagesController().getInputPeer(bo0Var.J0.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = bo0Var.J0.getId();
            bo0Var.E0.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = bo0Var.K0;
            bo0Var.E0.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = bo0Var.E0;
        tL_payments_validateRequestedInfo2.save = bo0Var.P0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (bo0Var.y0.invoice.name_requested) {
            bo0Var.E0.info.name = bo0Var.f[6].getText().toString();
            bo0Var.E0.info.flags |= 1;
        }
        if (bo0Var.y0.invoice.phone_requested) {
            bo0Var.E0.info.phone = "+" + bo0Var.f[8].getText().toString() + bo0Var.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = bo0Var.E0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (bo0Var.y0.invoice.email_requested) {
            bo0Var.E0.info.email = bo0Var.f[7].getText().toString().trim();
            bo0Var.E0.info.flags |= 4;
        }
        if (bo0Var.y0.invoice.shipping_address_requested) {
            bo0Var.E0.info.shipping_address = new TLRPC.TL_postAddress();
            bo0Var.E0.info.shipping_address.street_line1 = bo0Var.f[0].getText().toString();
            bo0Var.E0.info.shipping_address.street_line2 = bo0Var.f[1].getText().toString();
            bo0Var.E0.info.shipping_address.city = bo0Var.f[2].getText().toString();
            bo0Var.E0.info.shipping_address.state = bo0Var.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = bo0Var.E0.info.shipping_address;
            String str = bo0Var.x0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = bo0Var.f[5].getText().toString();
            bo0Var.E0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(bo0Var.currentAccount).sendRequest(bo0Var.E0, new u80(12, bo0Var, bo0Var.E0), (bo0Var.S0 ? 8 : 0) | 2);
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
        if (!z10 && this.O.getVisibility() == 0) {
            String text = this.O.getText();
            if (text.length() == 0) {
                org.telegram.ui.Cells.h3 h3Var = this.O;
                try {
                    h3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.shakeViewSpring(h3Var, 2.5f);
                return;
            } else {
                H0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new dn0(this, 0), 10);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            passwordinputsettings2.new_algo = this.W.new_algo;
            passwordinputsettings2.flags = 3 | i10;
            passwordinputsettings2.email = obj2.trim();
            str = obj2;
            str2 = obj;
        }
        H0(true, true);
        Utilities.globalQueue.postRunnable(new eg.j(this, z10, str, str2, updatepasswordsettings));
    }

    public final void B0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        org.telegram.ui.Cells.x8[] x8VarArr = this.U;
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
            th.w(sb2, ", ", str4, ", ", str5);
            x8VarArr[2].b(R.drawable.msg_payment_address, a4.w.q(sb2, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        x8VarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            x8VarArr[3].b(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        x8VarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            x8VarArr[4].b(R.drawable.msg_calls, qe.b.c().b(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), (tL_paymentRequestedInfo.email == null && this.C0 == null) ? false : true);
        }
        x8VarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            x8VarArr[5].b(R.drawable.msg_mention, str8, LocaleController.getString(R.string.PaymentCheckoutEmail), this.C0 != null);
        }
        x8VarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void C0(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.W = password;
            this.X = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            J0();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            t0();
        }
    }

    public final void D0(boolean z10) {
        this.L0 = z10;
        this.C = !z10;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.L0);
        }
        org.telegram.ui.Cells.x8 x8Var = this.U[0];
        if (x8Var != null) {
            x8Var.setEnabled(!this.L0);
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
        c2Var.N = str;
        c2Var.P = str2;
        showDialog(c2Var);
    }

    public final void G0(Runnable runnable) {
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
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i10);
            i10++;
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
        f3Var.items = charSequenceArr;
        f3Var.itemIcons = iArr;
        f3Var.onClickListener = a3Var;
        showDialog(f3Var);
    }

    public final void H0(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
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
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.nq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.nq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Components.nq, Float>) property3, 1.0f));
                } else {
                    this.Q.setVisibility(0);
                    this.S.setEnabled(true);
                    AnimatorSet animatorSet3 = this.v;
                    org.telegram.ui.Components.nq nqVar = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(nqVar, (Property<org.telegram.ui.Components.nq, Float>) property4, 0.1f);
                    org.telegram.ui.Components.nq nqVar2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(nqVar2, (Property<org.telegram.ui.Components.nq, Float>) property5, 0.1f);
                    org.telegram.ui.Components.nq nqVar3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(nqVar3, (Property<org.telegram.ui.Components.nq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.Q, (Property<TextView, Float>) property6, 1.0f));
                }
                this.v.addListener(new sn0(this, z11, i10));
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
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.nq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.nq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.nq, Float>) property9, 1.0f));
        } else if (this.w != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.nq, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.nq, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Components.nq, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.v;
            org.telegram.ui.Components.nq nqVar4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(nqVar4, (Property<org.telegram.ui.Components.nq, Float>) property10, 0.1f);
            org.telegram.ui.Components.nq nqVar5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(nqVar5, (Property<org.telegram.ui.Components.nq, Float>) property11, 0.1f);
            org.telegram.ui.Components.nq nqVar6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(nqVar6, (Property<org.telegram.ui.Components.nq, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.v.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.v.addListener(new sn0(this, z11, i11));
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
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.l0, this.m0));
        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new bn0(this, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void J0() {
        if (this.q0 == 6) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.I;
            if (y8VarArr[2] == null) {
                return;
            }
            int i10 = 0;
            this.n.setVisibility(0);
            TL_account.Password password = this.W;
            ArrayList arrayList = this.F;
            org.telegram.ui.Cells.k4[] k4VarArr = this.E;
            org.telegram.ui.Cells.y9[] y9VarArr = this.J;
            if (password == null) {
                H0(true, true);
                y8VarArr[2].setVisibility(8);
                y9VarArr[0].setVisibility(8);
                y9VarArr[1].setVisibility(8);
                this.O.setVisibility(8);
                k4VarArr[0].setVisibility(8);
                k4VarArr[1].setVisibility(8);
                y8VarArr[0].setVisibility(8);
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
            if (!this.X) {
                y8VarArr[2].setVisibility(8);
                y9VarArr[0].setVisibility(8);
                y9VarArr[1].setVisibility(8);
                y8VarArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.O.setVisibility(8);
                k4VarArr[0].setVisibility(0);
                k4VarArr[1].setVisibility(0);
                y8VarArr[0].setVisibility(0);
                for (int i12 = 0; i12 < 3; i12++) {
                    ((View) this.f[i12].getParent()).setVisibility(0);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = y8VarArr[2];
            int i14 = R.string.EmailPasswordConfirmText2;
            String str = this.W.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            y8Var.setText(LocaleController.formatString("EmailPasswordConfirmText2", i14, str));
            y8VarArr[2].setVisibility(0);
            y9VarArr[0].setVisibility(0);
            y9VarArr[1].setVisibility(0);
            this.O.setVisibility(0);
            y8VarArr[1].setText("");
            k4VarArr[0].setVisibility(8);
            k4VarArr[1].setVisibility(8);
            y8VarArr[0].setVisibility(8);
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
        org.telegram.ui.Cells.y8[] y8VarArr = this.I;
        if (y8VarArr[0] != null) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.G;
            if (x6VarArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.y0;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.w != null && this.v0)) {
                this.H.setVisibility(8);
                y8VarArr[0].setVisibility(8);
                org.telegram.ui.Cells.x6 x6Var = x6VarArr[2];
                x6Var.setBackground(org.telegram.ui.ActionBar.g6.V0(x6Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
            if (this.y0.password_missing) {
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
                    y8VarArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(i11, i11 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i10, i10 + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new yn0(this), i10, i11 - 1, 33);
                }
            }
            this.H.setEnabled(true);
            y8VarArr[0].setText(spannableStringBuilder);
            this.H.setVisibility(0);
            y8VarArr[0].setVisibility(0);
            org.telegram.ui.Cells.x6 x6Var2 = x6VarArr[2];
            x6Var2.setBackground(org.telegram.ui.ActionBar.g6.V0(x6Var2.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
        }
    }

    public final void L0() {
        this.N0[0] = s0(this.p0);
        this.N.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.N0[0], true);
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.N0[0]));
        }
        if (this.o0 != null) {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.ei);
            int childCount = this.o0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TextView textView2 = (TextView) this.o0.getChildAt(i10);
                if (textView2.getTag().equals(this.D0)) {
                    org.telegram.ui.ActionBar.g6.w1(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.fi));
                } else {
                    org.telegram.ui.ActionBar.g6.w1(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Z8));
                }
                textView2.invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x030a, code lost:
    
        if (r15.email_requested == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0fe6, code lost:
    
        if (r12.email_requested == false) goto L464;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0c22  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0be1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0216  */
    /* JADX WARN: Type inference failed for: r3v236, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v240, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v241, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v277, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v223, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v82, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        char c3;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z10;
        char c6;
        int i11;
        int i12;
        TLRPC.TL_invoice tL_invoice;
        org.telegram.ui.Cells.x6 x6Var;
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
        this.actionBar.setActionBarMenuOnItemClick(new nn0(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        int i13 = this.q0;
        int i14 = 6;
        int i15 = 3;
        if (i13 == 0 || i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 6) {
            this.n = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(context, 1);
            this.r = nqVar;
            nqVar.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, i7.f6.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.a7));
        ScrollView scrollView = new ScrollView(context);
        this.A = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.A, getThemedColor(org.telegram.ui.ActionBar.g6.s8));
        frameLayout2.addView(this.A, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.q0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.M = linearLayout;
        linearLayout.setOrientation(1);
        int i16 = 0;
        this.M.setClipChildren(false);
        this.A.addView(this.M, new FrameLayout.LayoutParams(-1, -2));
        int i17 = this.q0;
        int i18 = 10;
        char c10 = 1;
        String str5 = "";
        int i19 = 9;
        if (i17 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e10) {
                e = e10;
                c6 = 0;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i16, split[2]);
                    c6 = 0;
                    try {
                        this.b.put(split[2], split[0]);
                        this.c.put(split[0], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[0], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i16 = 0;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } else {
                    c6 = 0;
                    bufferedReader.close();
                    Collections.sort(this.a, new org.telegram.ui.Components.wp0(9));
                    this.f = new EditTextBoldCursor[10];
                    i11 = 0;
                    while (i11 < i18) {
                        if (i11 == 0) {
                            this.E[c6] = new org.telegram.ui.Cells.k4(context, this.U0);
                            this.E[c6].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            this.E[c6].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.M.addView(this.E[c6], i7.f6.n(-1, -2));
                        } else if (i11 == i14) {
                            this.G[c6] = new org.telegram.ui.Cells.x6(context, (Object) null);
                            this.M.addView(this.G[c6], i7.f6.n(-1, -2));
                            this.E[c10] = new org.telegram.ui.Cells.k4(context, this.U0);
                            this.E[c10].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            this.E[c10].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.M.addView(this.E[c10], i7.f6.n(-1, -2));
                        }
                        if (i11 == 8) {
                            frameLayout = new LinearLayout(context);
                            frameLayout.setClipChildren(false);
                            frameLayout.setOrientation(0);
                            this.M.addView(frameLayout, i7.f6.n(-1, 50));
                            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        } else if (i11 == i19) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.M.addView(frameLayout, i7.f6.n(-1, 50));
                            int i20 = org.telegram.ui.ActionBar.g6.d6;
                            frameLayout.setBackgroundColor(getThemedColor(i20));
                            boolean z12 = i11 != 5;
                            if (z12) {
                                if (i11 != 7 || this.y0.invoice.phone_requested) {
                                    if (i11 == i14) {
                                        TLRPC.TL_invoice tL_invoice2 = this.y0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                z12 = false;
                            }
                            if (z12) {
                                org.telegram.ui.Components.fn fnVar = new org.telegram.ui.Components.fn(context, 16);
                                fnVar.setBackgroundColor(getThemedColor(i20));
                                this.F.add(fnVar);
                                frameLayout.addView(fnVar, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                        }
                        if (i11 == i19) {
                            this.f[i11] = new org.telegram.ui.Components.d40(context);
                        } else {
                            this.f[i11] = new EditTextBoldCursor(context);
                        }
                        this.f[i11].setTag(Integer.valueOf(i11));
                        this.f[i11].setTextSize(1, 16.0f);
                        this.f[i11].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                        EditTextBoldCursor editTextBoldCursor = this.f[i11];
                        int i21 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor.setTextColor(getThemedColor(i21));
                        this.f[i11].setBackgroundDrawable(null);
                        this.f[i11].setCursorColor(getThemedColor(i21));
                        this.f[i11].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i11].setCursorWidth(1.5f);
                        if (i11 == 4) {
                            final int i22 = 0;
                            this.f[i11].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.ym0
                                public final /* synthetic */ bo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i22) {
                                        case 0:
                                            bo0 bo0Var = this.b;
                                            if (bo0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar = new rt(null, false);
                                                    rtVar.n = true;
                                                    rtVar.r = new bn0(bo0Var, 4);
                                                    bo0Var.presentFragment(rtVar);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            bo0 bo0Var2 = this.b;
                                            if (bo0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar2 = new rt(null, false);
                                                    rtVar2.n = true;
                                                    rtVar2.r = new bn0(bo0Var2, 2);
                                                    bo0Var2.presentFragment(rtVar2);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    return false;
                                }
                            });
                            this.f[i11].setInputType(0);
                        }
                        if (i11 == i19 || i11 == 8) {
                            this.f[i11].setInputType(i15);
                        } else if (i11 == 7) {
                            this.f[i11].setInputType(1);
                        } else {
                            this.f[i11].setInputType(16385);
                        }
                        this.f[i11].setImeOptions(268435461);
                        switch (i11) {
                            case 0:
                                this.f[i11].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i11].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress2 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i11].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress3 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i11].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress4 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i11].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress5 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    String str6 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str7 = this.y0.saved_info.shipping_address.country_iso2;
                                    this.x0 = str7;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i11];
                                    if (str6 == null) {
                                        str6 = str7;
                                    }
                                    editTextBoldCursor2.setText(str6);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i11].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress6 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    this.f[i11].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i11].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str3 = tL_paymentRequestedInfo10.name) != null) {
                                    this.f[i11].setText(str3);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i11].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.y0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str4 = tL_paymentRequestedInfo11.email) != null) {
                                    this.f[i11].setText(str4);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i11];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i11 == 8) {
                            TextView textView = new TextView(context);
                            this.D = textView;
                            textView.setText("+");
                            this.D.setTextColor(getThemedColor(i21));
                            this.D.setTextSize(1, 16.0f);
                            frameLayout.addView(this.D, i7.f6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i11].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                            this.f[i11].setGravity(19);
                            this.f[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i11], i7.f6.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i11].addTextChangedListener(new tn0(this));
                        } else if (i11 == i19) {
                            this.f[i11].setPadding(0, 0, 0, 0);
                            this.f[i11].setGravity(19);
                            frameLayout.addView(this.f[i11], i7.f6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                            this.f[i11].addTextChangedListener(new rr(this, 4));
                        } else {
                            this.f[i11].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i11].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout.addView(this.f[i11], i7.f6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        final int i23 = 2;
                        this.f[i11].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zm0
                            public final /* synthetic */ bo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i24, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i23) {
                                    case 0:
                                        bo0 bo0Var = this.b;
                                        if (i24 != 6) {
                                            bo0Var.getClass();
                                            break;
                                        } else {
                                            bo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        bo0 bo0Var2 = this.b;
                                        if (i24 != 6) {
                                            bo0Var2.getClass();
                                            if (i24 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        bo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    bo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            bo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        bo0 bo0Var3 = this.b;
                                        bo0Var3.getClass();
                                        if (i24 != 5) {
                                            if (i24 == 6) {
                                                bo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = bo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    bo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        bo0 bo0Var4 = this.b;
                                        bo0Var4.getClass();
                                        if (i24 != 5) {
                                            if (i24 == 6) {
                                                bo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i25 = intValue3 + 1;
                                                editTextBoldCursorArr = bo0Var4.f;
                                                if (i25 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i25 == 4 ? intValue3 + 2 : i25;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            bo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        bo0 bo0Var5 = this.b;
                                        if (i24 != 6) {
                                            bo0Var5.getClass();
                                            break;
                                        } else {
                                            bo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i11 == i19) {
                            TLRPC.TL_invoice tL_invoice3 = this.y0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user = null;
                                for (int i24 = 0; i24 < this.y0.users.size(); i24++) {
                                    TLRPC.User user2 = this.y0.users.get(i24);
                                    if (user2.id == this.y0.provider_id) {
                                        user = user2;
                                    }
                                }
                                String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
                                z11 = true;
                                this.I[1] = new org.telegram.ui.Cells.y8(context, this.U0);
                                this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                                this.M.addView(this.I[1], i7.f6.n(-1, -2));
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
                                this.G[1] = new org.telegram.ui.Cells.x6(context, (Object) null);
                                this.M.addView(this.G[1], i7.f6.n(-1, -2));
                                z11 = true;
                            }
                            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context, this.U0);
                            this.H = q8Var;
                            q8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(z11));
                            this.H.f(LocaleController.getString(R.string.PaymentShippingSave), this.P0, false);
                            this.M.addView(this.H, i7.f6.n(-1, -2));
                            this.H.setOnClickListener(new xm0(this, 8));
                            this.I[0] = new org.telegram.ui.Cells.y8(context, this.U0);
                            this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                            this.I[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.M.addView(this.I[0], i7.f6.n(-1, -2));
                        }
                        i11++;
                        i18 = 10;
                        i14 = 6;
                        i15 = 3;
                        i19 = 9;
                        c10 = 1;
                        c6 = 0;
                    }
                    if (this.y0.invoice.name_requested) {
                        i12 = 8;
                        ((ViewGroup) this.f[6].getParent()).setVisibility(8);
                    } else {
                        i12 = 8;
                    }
                    if (!this.y0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i12].getParent()).setVisibility(i12);
                    }
                    if (!this.y0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i12);
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
                    x6Var = this.G[1];
                    if (x6Var == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.y0.invoice;
                        x6Var.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        org.telegram.ui.Cells.y8 y8Var = this.I[1];
                        if (y8Var != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.y0.invoice;
                            y8Var.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    org.telegram.ui.Cells.k4 k4Var = this.E[1];
                    TLRPC.TL_invoice tL_invoice7 = this.y0.invoice;
                    k4Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
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
                        o0(null);
                    } else {
                        o0(this.y0.saved_info.phone);
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
                Collections.sort(this.a, new org.telegram.ui.Components.wp0(9));
                this.f = new EditTextBoldCursor[10];
                i11 = 0;
                while (i11 < i18) {
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
                x6Var = this.G[1];
                if (x6Var == null) {
                }
                org.telegram.ui.Cells.k4 k4Var2 = this.E[1];
                TLRPC.TL_invoice tL_invoice72 = this.y0.invoice;
                k4Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.y0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo2 = this.y0.saved_info;
                if (tL_paymentRequestedInfo2 != null) {
                }
                o0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            int i25 = 9;
            if (i17 == 2) {
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
                        v0(context);
                    }
                    n0(context);
                    this.M.addView(this.K, i7.f6.n(-1, 50));
                    this.v0 = true;
                    H0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    AndroidUtilities.checkAndroidTheme(context, true);
                    org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(this, context);
                    this.w = l81Var;
                    l81Var.getSettings().setJavaScriptEnabled(true);
                    this.w.getSettings().setDomStorageEnabled(true);
                    this.w.getSettings().setSupportZoom(true);
                    this.w.getSettings().setBuiltInZoomControls(true);
                    this.w.getSettings().setDisplayZoomControls(false);
                    this.w.getSettings().setUseWideViewPort(true);
                    this.w.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                    this.w.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.w.setWebViewClient(new un0(this, context));
                    this.M.addView(this.w, i7.f6.c(-2.0f, -1));
                    this.G[2] = new org.telegram.ui.Cells.x6(context, (Object) null);
                    this.M.addView(this.G[2], i7.f6.n(-1, -2));
                    org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, this.U0);
                    this.H = q8Var2;
                    q8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    this.H.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.Q0, false);
                    this.M.addView(this.H, i7.f6.n(-1, -2));
                    this.H.setOnClickListener(new xm0(this, i25));
                    this.I[0] = new org.telegram.ui.Cells.y8(context, this.U0);
                    this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                    K0();
                    this.M.addView(this.I[0], i7.f6.n(-1, -2));
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
                        v0(context);
                    }
                    this.f = new EditTextBoldCursor[6];
                    int i26 = 0;
                    for (int i27 = 6; i26 < i27; i27 = 6) {
                        if (i26 == 0) {
                            this.E[0] = new org.telegram.ui.Cells.k4(context, this.U0);
                            this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            this.E[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.M.addView(this.E[0], i7.f6.n(-1, -2));
                        } else if (i26 == 4) {
                            this.E[1] = new org.telegram.ui.Cells.k4(context, this.U0);
                            this.E[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            this.E[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                            this.M.addView(this.E[1], i7.f6.n(-1, -2));
                        }
                        boolean z14 = (i26 == 3 || i26 == 5 || (i26 == 4 && !this.d0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i28 = org.telegram.ui.ActionBar.g6.d6;
                        frameLayout3.setBackgroundColor(getThemedColor(i28));
                        this.M.addView(frameLayout3, i7.f6.n(-1, 50));
                        this.f[i26] = new EditTextBoldCursor(context);
                        this.f[i26].setTag(Integer.valueOf(i26));
                        this.f[i26].setTextSize(1, 16.0f);
                        this.f[i26].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i26];
                        int i29 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor4.setTextColor(getThemedColor(i29));
                        this.f[i26].setBackgroundDrawable(null);
                        this.f[i26].setCursorColor(getThemedColor(i29));
                        this.f[i26].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i26].setCursorWidth(1.5f);
                        if (i26 == 3) {
                            this.f[i26].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i26].setInputType(130);
                            this.f[i26].setTypeface(Typeface.DEFAULT);
                            this.f[i26].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i26 == 0) {
                            this.f[i26].setInputType(3);
                        } else if (i26 == 4) {
                            final int i30 = 1;
                            this.f[i26].setOnTouchListener(new View.OnTouchListener(this) { // from class: org.telegram.ui.ym0
                                public final /* synthetic */ bo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    switch (i30) {
                                        case 0:
                                            bo0 bo0Var = this.b;
                                            if (bo0Var.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar = new rt(null, false);
                                                    rtVar.n = true;
                                                    rtVar.r = new bn0(bo0Var, 4);
                                                    bo0Var.presentFragment(rtVar);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            bo0 bo0Var2 = this.b;
                                            if (bo0Var2.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    rt rtVar2 = new rt(null, false);
                                                    rtVar2.n = true;
                                                    rtVar2.r = new bn0(bo0Var2, 2);
                                                    bo0Var2.presentFragment(rtVar2);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    return false;
                                }
                            });
                            this.f[i26].setInputType(0);
                        } else if (i26 == 1) {
                            this.f[i26].setInputType(16386);
                        } else if (i26 == 2) {
                            this.f[i26].setInputType(4097);
                        } else {
                            this.f[i26].setInputType(16385);
                            this.f[i26].setImeOptions(268435461);
                            if (i26 != 0) {
                                this.f[i26].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                            } else if (i26 == 1) {
                                this.f[i26].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                            } else if (i26 == 2) {
                                this.f[i26].setHint(LocaleController.getString(R.string.PaymentCardName));
                            } else if (i26 == 3) {
                                this.f[i26].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                            } else if (i26 == 4) {
                                this.f[i26].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                            } else if (i26 == 5) {
                                this.f[i26].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                            }
                            if (i26 != 0) {
                                this.f[i26].addTextChangedListener(new vn0(this));
                            } else if (i26 == 1) {
                                this.f[i26].addTextChangedListener(new wn0(this));
                            }
                            this.f[i26].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                            this.f[i26].setGravity(!LocaleController.isRTL ? 5 : 3);
                            frameLayout3.addView(this.f[i26], i7.f6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final int i31 = 3;
                            this.f[i26].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zm0
                                public final /* synthetic */ bo0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i242, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i31) {
                                        case 0:
                                            bo0 bo0Var = this.b;
                                            if (i242 != 6) {
                                                bo0Var.getClass();
                                                break;
                                            } else {
                                                bo0Var.A0(false);
                                                break;
                                            }
                                        case 1:
                                            bo0 bo0Var2 = this.b;
                                            if (i242 != 6) {
                                                bo0Var2.getClass();
                                                if (i242 == 5) {
                                                    int intValue = ((Integer) textView2.getTag()).intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            bo0Var2.f[2].requestFocus();
                                                            break;
                                                        }
                                                    } else {
                                                        bo0Var2.f[1].requestFocus();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                bo0Var2.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 2:
                                            bo0 bo0Var3 = this.b;
                                            bo0Var3.getClass();
                                            if (i242 != 5) {
                                                if (i242 == 6) {
                                                    bo0Var3.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr2 = bo0Var3.f;
                                                    if (intValue2 >= editTextBoldCursorArr2.length) {
                                                        break;
                                                    } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                        bo0Var3.f[intValue2].requestFocus();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            bo0 bo0Var4 = this.b;
                                            bo0Var4.getClass();
                                            if (i242 != 5) {
                                                if (i242 == 6) {
                                                    bo0Var4.n.performClick();
                                                    break;
                                                }
                                            } else {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                do {
                                                    int i252 = intValue3 + 1;
                                                    editTextBoldCursorArr = bo0Var4.f;
                                                    if (i252 >= editTextBoldCursorArr.length) {
                                                        break;
                                                    } else {
                                                        intValue3 = i252 == 4 ? intValue3 + 2 : i252;
                                                    }
                                                } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                                bo0Var4.f[intValue3].requestFocus();
                                                break;
                                            }
                                            break;
                                        default:
                                            bo0 bo0Var5 = this.b;
                                            if (i242 != 6) {
                                                bo0Var5.getClass();
                                                break;
                                            } else {
                                                bo0Var5.n.performClick();
                                                break;
                                            }
                                    }
                                    return false;
                                }
                            });
                            if (i26 != 3) {
                                this.G[0] = new org.telegram.ui.Cells.x6(context, (Object) null);
                                this.M.addView(this.G[0], i7.f6.n(-1, -2));
                            } else if (i26 == 5) {
                                this.G[2] = new org.telegram.ui.Cells.x6(context, (Object) null);
                                this.M.addView(this.G[2], i7.f6.n(-1, -2));
                                org.telegram.ui.Cells.q8 q8Var3 = new org.telegram.ui.Cells.q8(context, this.U0);
                                this.H = q8Var3;
                                q8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.H.f(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.Q0, false);
                                this.M.addView(this.H, i7.f6.n(-1, -2));
                                this.H.setOnClickListener(new xm0(this, 10));
                                this.I[0] = new org.telegram.ui.Cells.y8(context, this.U0);
                                this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                                K0();
                                this.M.addView(this.I[0], i7.f6.n(-1, -2));
                            } else if (i26 == 0) {
                                n0(context);
                                frameLayout3.addView(this.K, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                                if (z14) {
                                    org.telegram.ui.Components.fn fnVar2 = new org.telegram.ui.Components.fn(context, 17);
                                    fnVar2.setBackgroundColor(getThemedColor(i28));
                                    this.F.add(fnVar2);
                                    frameLayout3.addView(fnVar2, new FrameLayout.LayoutParams(-1, 1, 83));
                                }
                                if ((i26 == 4 && !this.c0) || ((i26 == 5 && !this.d0) || (i26 == 2 && !this.e0))) {
                                    frameLayout3.setVisibility(8);
                                }
                                i26++;
                            }
                            if (z14) {
                            }
                            if (i26 == 4) {
                                frameLayout3.setVisibility(8);
                                i26++;
                            }
                            frameLayout3.setVisibility(8);
                            i26++;
                        }
                        this.f[i26].setImeOptions(268435461);
                        if (i26 != 0) {
                        }
                        if (i26 != 0) {
                        }
                        this.f[i26].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i26].setGravity(!LocaleController.isRTL ? 5 : 3);
                        frameLayout3.addView(this.f[i26], i7.f6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i312 = 3;
                        this.f[i26].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zm0
                            public final /* synthetic */ bo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i242, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i312) {
                                    case 0:
                                        bo0 bo0Var = this.b;
                                        if (i242 != 6) {
                                            bo0Var.getClass();
                                            break;
                                        } else {
                                            bo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        bo0 bo0Var2 = this.b;
                                        if (i242 != 6) {
                                            bo0Var2.getClass();
                                            if (i242 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        bo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    bo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            bo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        bo0 bo0Var3 = this.b;
                                        bo0Var3.getClass();
                                        if (i242 != 5) {
                                            if (i242 == 6) {
                                                bo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = bo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    bo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        bo0 bo0Var4 = this.b;
                                        bo0Var4.getClass();
                                        if (i242 != 5) {
                                            if (i242 == 6) {
                                                bo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i252 = intValue3 + 1;
                                                editTextBoldCursorArr = bo0Var4.f;
                                                if (i252 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i252 == 4 ? intValue3 + 2 : i252;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            bo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        bo0 bo0Var5 = this.b;
                                        if (i242 != 6) {
                                            bo0Var5.getClass();
                                            break;
                                        } else {
                                            bo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i26 != 3) {
                        }
                        if (z14) {
                        }
                        if (i26 == 4) {
                        }
                        frameLayout3.setVisibility(8);
                        i26++;
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
            } else if (i17 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.A0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new org.telegram.ui.Cells.h6[size];
                int i32 = 0;
                while (i32 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.A0.shipping_options.get(i32);
                    this.h[i32] = new org.telegram.ui.Cells.h6(context);
                    this.h[i32].setTag(Integer.valueOf(i32));
                    this.h[i32].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    this.h[i32].c(a4.w.y(s0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i32 == 0, i32 != size + (-1));
                    this.h[i32].setOnClickListener(new xm0(this, 11));
                    this.M.addView(this.h[i32]);
                    i32++;
                }
                this.I[0] = new org.telegram.ui.Cells.y8(context, this.U0);
                this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                this.M.addView(this.I[0], i7.f6.n(-1, -2));
            } else {
                int i33 = 13;
                int i34 = 14;
                if (i17 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i35 = 0;
                    for (int i36 = 2; i35 < i36; i36 = 2) {
                        if (i35 == 0) {
                            z10 = false;
                            this.E[0] = new org.telegram.ui.Cells.k4(context, this.U0);
                            this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            this.E[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                            this.M.addView(this.E[0], i7.f6.n(-1, -2));
                        } else {
                            z10 = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z10);
                        this.M.addView(frameLayout4, i7.f6.n(-1, 50));
                        int i37 = org.telegram.ui.ActionBar.g6.d6;
                        frameLayout4.setBackgroundColor(getThemedColor(i37));
                        boolean z15 = i35 != 1;
                        if (z15) {
                            if (i35 != 7 || this.y0.invoice.phone_requested) {
                                if (i35 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.y0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z15 = false;
                        }
                        if (z15) {
                            org.telegram.ui.Components.fn fnVar3 = new org.telegram.ui.Components.fn(context, 14);
                            fnVar3.setBackgroundColor(getThemedColor(i37));
                            this.F.add(fnVar3);
                            frameLayout4.addView(fnVar3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i35] = new EditTextBoldCursor(context);
                        this.f[i35].setTag(Integer.valueOf(i35));
                        this.f[i35].setTextSize(1, 16.0f);
                        this.f[i35].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i35];
                        int i38 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor5.setTextColor(getThemedColor(i38));
                        this.f[i35].setBackgroundDrawable(null);
                        this.f[i35].setCursorColor(getThemedColor(i38));
                        this.f[i35].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i35].setCursorWidth(1.5f);
                        if (i35 == 0) {
                            this.f[i35].setOnTouchListener(new mh.d(28));
                            this.f[i35].setInputType(0);
                        } else {
                            this.f[i35].setInputType(129);
                            this.f[i35].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i35].setImeOptions(268435462);
                        if (i35 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i35];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.u0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i35 == 1) {
                            this.f[i35].setHint(LocaleController.getString(R.string.LoginPassword));
                            this.f[i35].requestFocus();
                        }
                        this.f[i35].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i35].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout4.addView(this.f[i35], i7.f6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i39 = 4;
                        this.f[i35].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zm0
                            public final /* synthetic */ bo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i242, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i39) {
                                    case 0:
                                        bo0 bo0Var = this.b;
                                        if (i242 != 6) {
                                            bo0Var.getClass();
                                            break;
                                        } else {
                                            bo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        bo0 bo0Var2 = this.b;
                                        if (i242 != 6) {
                                            bo0Var2.getClass();
                                            if (i242 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        bo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    bo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            bo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        bo0 bo0Var3 = this.b;
                                        bo0Var3.getClass();
                                        if (i242 != 5) {
                                            if (i242 == 6) {
                                                bo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = bo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    bo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        bo0 bo0Var4 = this.b;
                                        bo0Var4.getClass();
                                        if (i242 != 5) {
                                            if (i242 == 6) {
                                                bo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i252 = intValue3 + 1;
                                                editTextBoldCursorArr = bo0Var4.f;
                                                if (i252 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i252 == 4 ? intValue3 + 2 : i252;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            bo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        bo0 bo0Var5 = this.b;
                                        if (i242 != 6) {
                                            bo0Var5.getClass();
                                            break;
                                        } else {
                                            bo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i35 == 1) {
                            this.I[0] = new org.telegram.ui.Cells.y8(context, this.U0);
                            org.telegram.ui.Cells.y8 y8Var2 = this.I[0];
                            int i40 = R.string.PaymentConfirmationMessage;
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.u0;
                            y8Var2.setText(LocaleController.formatString("PaymentConfirmationMessage", i40, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            org.telegram.ui.Cells.y8 y8Var3 = this.I[0];
                            int i41 = R.drawable.greydivider;
                            int i42 = org.telegram.ui.ActionBar.g6.b7;
                            y8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i41, i42));
                            this.M.addView(this.I[0], i7.f6.n(-1, -2));
                            this.J[0] = new org.telegram.ui.Cells.y9(context, this.U0);
                            this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                            this.J[0].b(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                            this.M.addView(this.J[0], i7.f6.n(-1, -2));
                            this.J[0].setOnClickListener(new xm0(this, i33));
                            this.I[1] = new org.telegram.ui.Cells.y8(context, this.U0);
                            this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i42));
                            this.M.addView(this.I[1], i7.f6.n(-1, -2));
                        }
                        i35++;
                    }
                } else if (i17 == 4 || i17 == 5) {
                    org.telegram.ui.Cells.j5 j5Var = new org.telegram.ui.Cells.j5(context);
                    this.T = j5Var;
                    j5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                    MessageObject messageObject = this.J0;
                    if (messageObject != null) {
                        this.T.b((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.l0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.z0;
                        if (paymentReceipt != null) {
                            this.T.c(paymentReceipt, this.l0);
                        } else if (this.K0 != null || this.X0 != null) {
                            org.telegram.ui.Cells.j5 j5Var2 = this.T;
                            TLRPC.PaymentForm paymentForm4 = this.y0;
                            j5Var2.a(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.l0, paymentForm4);
                        }
                    }
                    this.M.addView(this.T, i7.f6.n(-1, -2));
                    this.G[0] = new org.telegram.ui.Cells.x6(context, (Object) null);
                    this.M.addView(this.G[0], i7.f6.n(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.y0.invoice.prices);
                    this.p0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.C0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.N0 = new String[1];
                    for (int i43 = 0; i43 < this.p0.size(); i43++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.p0.get(i43);
                        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
                        z8Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        z8Var.a(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.y0.invoice.currency), false);
                        this.M.addView(z8Var);
                    }
                    if (this.q0 == 5 && this.D0 != null) {
                        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
                        z8Var2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        z8Var2.a(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.D0.longValue(), this.y0.invoice.currency), false);
                        this.M.addView(z8Var2);
                    }
                    org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                    this.N = z8Var3;
                    int i44 = org.telegram.ui.ActionBar.g6.d6;
                    z8Var3.setBackgroundColor(getThemedColor(i44));
                    this.N0[0] = s0(this.p0);
                    this.N.a(LocaleController.getString(R.string.PaymentTransactionTotal), this.N0[0], true);
                    float f9 = 14.0f;
                    if (this.q0 == 4 && (this.y0.invoice.flags & 256) != 0) {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        frameLayout5.setClipChildren(false);
                        frameLayout5.setBackgroundColor(getThemedColor(i44));
                        this.M.addView(frameLayout5, i7.f6.n(-1, this.y0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout5.setOnClickListener(new xm0(this, i34));
                        org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
                        z8Var4.setBackgroundColor(getThemedColor(i44));
                        z8Var4.a(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                        frameLayout5.addView(z8Var4);
                        this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f[0].setTag(0);
                        this.f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                        int i45 = org.telegram.ui.ActionBar.g6.z6;
                        editTextBoldCursor7.setHintTextColor(getThemedColor(i45));
                        this.f[0].setTextColor(getThemedColor(i45));
                        this.f[0].setBackgroundDrawable(null);
                        this.f[0].setCursorColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                        this.f[0].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[0].setCursorWidth(1.5f);
                        this.f[0].setInputType(3);
                        this.f[0].setImeOptions(268435462);
                        this.f[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.y0.invoice.currency));
                        this.f[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[0].setGravity(LocaleController.isRTL ? 3 : 5);
                        frameLayout5.addView(this.f[0], i7.f6.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f[0].addTextChangedListener(new en0(this));
                        this.f[0].setOnEditorActionListener(new ag.b0(5));
                        this.f[0].requestFocus();
                        if (!this.y0.invoice.suggested_tip_amounts.isEmpty()) {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout5.addView(horizontalScrollView, i7.f6.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.y0.invoice.suggested_tip_amounts.size();
                            fn0 fn0Var = new fn0(context, size2, iArr, iArr2);
                            this.o0 = fn0Var;
                            fn0Var.setOrientation(0);
                            horizontalScrollView.addView(this.o0, i7.f6.x(-1, 30, 51));
                            int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.ei);
                            int i46 = 0;
                            while (i46 < size2) {
                                long longValue = LocaleController.isRTL ? this.y0.invoice.suggested_tip_amounts.get((size2 - i46) - 1).longValue() : this.y0.invoice.suggested_tip_amounts.get(i46).longValue();
                                String formatCurrencyString = LocaleController.getInstance().formatCurrencyString(longValue, this.y0.invoice.currency);
                                TextView h = org.telegram.messenger.x3.h(context, 1, f9);
                                h.setTypeface(AndroidUtilities.bold());
                                h.setLines(1);
                                h.setTag(Long.valueOf(longValue));
                                h.setMaxLines(1);
                                h.setText(formatCurrencyString);
                                h.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                                h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Z8));
                                h.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(15.0f), themedColor & 536870911));
                                h.setSingleLine(true);
                                h.setGravity(17);
                                this.o0.addView(h, i7.f6.t(-2, -1, 19, 0, 0, i46 != size2 + (-1) ? 9 : 0, 0));
                                h.setOnClickListener(new jh.q2(this, h, longValue, 6));
                                int dp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(h.getPaint().measureText(formatCurrencyString)));
                                h.setTag(R.id.width_tag, Integer.valueOf(dp));
                                iArr[0] = Math.max(iArr[0], dp);
                                iArr2[0] = iArr2[0] + dp;
                                i46++;
                                f9 = 14.0f;
                            }
                        }
                    }
                    this.M.addView(this.N);
                    this.G[2] = new org.telegram.ui.Cells.x6(context, (Object) null);
                    this.G[2].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                    this.M.addView(this.G[2], i7.f6.n(-1, -2));
                    this.U[0] = new gn0(context);
                    this.U[0].setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                    org.telegram.ui.Cells.x8 x8Var = this.U[0];
                    String str8 = this.t0;
                    x8Var.b(R.drawable.msg_payment_card, (str8 == null || str8.length() <= 1) ? this.t0 : this.t0.substring(0, 1).toUpperCase() + this.t0.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), true);
                    if (this.R0 || this.S0) {
                        String str9 = this.t0;
                        i10 = (str9 == null || str9.length() <= 1) ? 8 : 0;
                    } else {
                        i10 = 0;
                    }
                    int i47 = 0;
                    this.U[0].setVisibility(i10);
                    this.M.addView(this.U[0]);
                    if (this.q0 == 4) {
                        this.U[0].setOnClickListener(new xm0(this, i47));
                    }
                    TLRPC.User user3 = null;
                    for (int i48 = 0; i48 < this.y0.users.size(); i48++) {
                        TLRPC.User user4 = this.y0.users.get(i48);
                        if (user4.id == this.y0.provider_id) {
                            user3 = user4;
                        }
                    }
                    char c11 = 1;
                    this.U[1] = new org.telegram.ui.Cells.x8(context);
                    this.U[1].setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                    if (user3 != null) {
                        org.telegram.ui.Cells.x8 x8Var2 = this.U[1];
                        str5 = ContactsController.formatName(user3.first_name, user3.last_name);
                        String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                        int i49 = R.drawable.msg_payment_provider;
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.E0;
                        x8Var2.b(i49, str5, string, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.C0 == null)) && ((tL_paymentRequestedInfo = this.y0.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                        c11 = 1;
                        this.M.addView(this.U[1]);
                    }
                    this.U[c11].setVisibility(user3 != null ? i10 : 8);
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.E0;
                    if (tL_payments_validateRequestedInfo2 != null || (this.R0 && (paymentForm2 = this.y0) != null && paymentForm2.saved_info != null)) {
                        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.y0.saved_info;
                        this.U[2] = new org.telegram.ui.Cells.x8(context);
                        this.U[2].setVisibility(8);
                        this.M.addView(this.U[2]);
                        if (tL_paymentRequestedInfo12.shipping_address != null) {
                            this.U[2].setVisibility(0);
                            if (this.q0 == 4) {
                                this.U[2].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.U[2].setOnClickListener(new xm0(this, 1));
                            } else {
                                this.U[2].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            }
                        }
                        this.U[3] = new org.telegram.ui.Cells.x8(context);
                        this.U[3].setVisibility(8);
                        this.M.addView(this.U[3]);
                        if (tL_paymentRequestedInfo12.name != null) {
                            this.U[3].setVisibility(0);
                            if (this.q0 == 4) {
                                this.U[3].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.U[3].setOnClickListener(new xm0(this, 2));
                            } else {
                                this.U[3].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            }
                        }
                        this.U[4] = new org.telegram.ui.Cells.x8(context);
                        this.U[4].setVisibility(8);
                        this.M.addView(this.U[4]);
                        if (tL_paymentRequestedInfo12.phone != null) {
                            this.U[4].setVisibility(0);
                            if (this.q0 == 4) {
                                this.U[4].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.U[4].setOnClickListener(new xm0(this, 3));
                            } else {
                                this.U[4].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            }
                        }
                        this.U[5] = new org.telegram.ui.Cells.x8(context);
                        this.U[5].setVisibility(8);
                        this.M.addView(this.U[5]);
                        if (tL_paymentRequestedInfo12.email != null) {
                            this.U[5].setVisibility(0);
                            int i50 = 4;
                            if (this.q0 == 4) {
                                this.U[5].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                                this.U[5].setOnClickListener(new xm0(this, i50));
                            } else {
                                this.U[5].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            }
                        }
                        if (this.C0 != null) {
                            this.U[6] = new org.telegram.ui.Cells.x8(context);
                            this.U[6].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            this.U[6].b(R.drawable.msg_payment_delivery, this.C0.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), false);
                            this.M.addView(this.U[6]);
                        }
                        B0(tL_paymentRequestedInfo12);
                    }
                    if (this.q0 == 4) {
                        this.B = !this.R0;
                        if (this.X0 instanceof TLRPC.TL_inputInvoiceStars) {
                            this.B = true;
                        }
                        this.S = new xn0(this, context);
                        View view = new View(context);
                        view.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.i6), 2, -1));
                        this.S.addView(view, i7.f6.c(-1.0f, -1));
                        frameLayout2.addView(this.S, i7.f6.e(-1, 48, 80));
                        this.S.setOnClickListener(new t70(12, this, str5));
                        TextView textView2 = new TextView(context);
                        this.Q = textView2;
                        int i51 = org.telegram.ui.ActionBar.g6.fi;
                        textView2.setTextColor(getThemedColor(i51));
                        this.Q.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.N0[0]));
                        this.Q.setTextSize(1, 14.0f);
                        this.Q.setGravity(17);
                        this.Q.setTypeface(AndroidUtilities.bold());
                        this.S.addView(this.Q, i7.f6.c(-1.0f, -1));
                        org.telegram.ui.Components.nq nqVar2 = new org.telegram.ui.Components.nq(context, 0);
                        this.s = nqVar2;
                        nqVar2.setVisibility(4);
                        int themedColor2 = getThemedColor(i51);
                        this.s.a(805306367 & themedColor2, themedColor2);
                        this.S.addView(this.s, i7.f6.c(-1.0f, -1));
                        this.S.a(this.B, false);
                        this.Q.setAlpha(!this.B ? 0.8f : 1.0f);
                        this.n.setEnabled(false);
                        this.n.getContentView().setVisibility(4);
                        AndroidUtilities.checkAndroidTheme(context, true);
                        try {
                            ln0 ln0Var = new ln0(context);
                            this.w = ln0Var;
                            ln0Var.setBackgroundColor(-1);
                            this.w.getSettings().setJavaScriptEnabled(true);
                            this.w.getSettings().setDomStorageEnabled(true);
                            this.w.getSettings().setSupportZoom(true);
                            this.w.getSettings().setBuiltInZoomControls(true);
                            this.w.getSettings().setDisplayZoomControls(false);
                            this.w.getSettings().setUseWideViewPort(true);
                            this.w.getSettings().setMixedContentMode(0);
                            CookieManager.getInstance().setAcceptThirdPartyCookies(this.w, true);
                            this.w.setWebViewClient(new mn0(this, context));
                        } catch (Exception e15) {
                            FileLog.e(e15);
                        }
                        this.R = null;
                        if (this.y0.invoice.terms_url != null) {
                            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, getResourceProvider());
                            this.R = m6Var;
                            m6Var.setChecked(this.B);
                            if (TextUtils.isEmpty(this.l0)) {
                                String string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrentFee);
                                spannableStringBuilder = new SpannableStringBuilder(string2);
                                int indexOf = string2.indexOf(42);
                                int lastIndexOf = string2.lastIndexOf(42);
                                if (indexOf != -1 && lastIndexOf != -1) {
                                    SpannableString spannableString = new SpannableString(string2.substring(indexOf + 1, lastIndexOf));
                                    spannableString.setSpan(new org.telegram.ui.Components.a51(this.y0.invoice.terms_url), 0, spannableString.length(), 33);
                                    int i52 = lastIndexOf + 1;
                                    spannableStringBuilder.replace(indexOf, i52, (CharSequence) spannableString);
                                    string2.substring(0, indexOf);
                                    spannableString.toString();
                                    string2.substring(i52);
                                }
                            } else {
                                String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                                spannableStringBuilder = new SpannableStringBuilder(string3);
                                int indexOf2 = string3.indexOf(42);
                                int lastIndexOf2 = string3.lastIndexOf(42);
                                if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                    SpannableString spannableString2 = new SpannableString(string3.substring(indexOf2 + 1, lastIndexOf2));
                                    spannableString2.setSpan(new org.telegram.ui.Components.a51(this.y0.invoice.terms_url), 0, spannableString2.length(), 33);
                                    int i53 = lastIndexOf2 + 1;
                                    spannableStringBuilder.replace(indexOf2, i53, (CharSequence) spannableString2);
                                    string3 = string3.substring(0, indexOf2) + ((Object) spannableString2) + string3.substring(i53);
                                }
                                int indexOf3 = string3.indexOf("%1$s");
                                if (indexOf3 != -1) {
                                    spannableStringBuilder.replace(indexOf3, indexOf3 + 4, (CharSequence) this.l0);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), indexOf3, this.l0.length() + indexOf3, 33);
                                }
                            }
                            this.R.setText(spannableStringBuilder);
                            this.R.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.d6), getThemedColor(org.telegram.ui.ActionBar.g6.i6)));
                            this.R.setOnClickListener(new xm0(this, 5));
                            frameLayout2.addView(this.R, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                        }
                        WebView webView = this.w;
                        if (webView != null) {
                            frameLayout2.addView(webView, i7.f6.c(-1.0f, -1));
                            this.w.setVisibility(8);
                        }
                    }
                    this.G[1] = new org.telegram.ui.Cells.x6(context, (Object) null);
                    this.G[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                    if (i10 != 0 && this.q0 == 4 && this.E0 == null && ((paymentForm = this.y0) == null || paymentForm.saved_info == null)) {
                        c3 = 1;
                        this.G[1].setVisibility(i10);
                    } else {
                        c3 = 1;
                    }
                    this.M.addView(this.G[c3], i7.f6.n(-1, -2));
                } else if (i17 == 6) {
                    org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context);
                    this.O = h3Var;
                    String string4 = LocaleController.getString(R.string.PasswordCode);
                    EditTextBoldCursor editTextBoldCursor8 = h3Var.a;
                    editTextBoldCursor8.setText("");
                    editTextBoldCursor8.setHint(string4);
                    final int i54 = 0;
                    h3Var.b = false;
                    h3Var.setWillNotDraw(true);
                    this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                    EditTextBoldCursor textView3 = this.O.getTextView();
                    textView3.setInputType(3);
                    textView3.setImeOptions(6);
                    textView3.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zm0
                        public final /* synthetic */ bo0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i242, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i54) {
                                case 0:
                                    bo0 bo0Var = this.b;
                                    if (i242 != 6) {
                                        bo0Var.getClass();
                                        break;
                                    } else {
                                        bo0Var.A0(false);
                                        break;
                                    }
                                case 1:
                                    bo0 bo0Var2 = this.b;
                                    if (i242 != 6) {
                                        bo0Var2.getClass();
                                        if (i242 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    bo0Var2.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                bo0Var2.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        bo0Var2.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    bo0 bo0Var3 = this.b;
                                    bo0Var3.getClass();
                                    if (i242 != 5) {
                                        if (i242 == 6) {
                                            bo0Var3.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = bo0Var3.f;
                                            if (intValue2 >= editTextBoldCursorArr2.length) {
                                                break;
                                            } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                bo0Var3.f[intValue2].requestFocus();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    bo0 bo0Var4 = this.b;
                                    bo0Var4.getClass();
                                    if (i242 != 5) {
                                        if (i242 == 6) {
                                            bo0Var4.n.performClick();
                                            break;
                                        }
                                    } else {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        do {
                                            int i252 = intValue3 + 1;
                                            editTextBoldCursorArr = bo0Var4.f;
                                            if (i252 >= editTextBoldCursorArr.length) {
                                                break;
                                            } else {
                                                intValue3 = i252 == 4 ? intValue3 + 2 : i252;
                                            }
                                        } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                        bo0Var4.f[intValue3].requestFocus();
                                        break;
                                    }
                                    break;
                                default:
                                    bo0 bo0Var5 = this.b;
                                    if (i242 != 6) {
                                        bo0Var5.getClass();
                                        break;
                                    } else {
                                        bo0Var5.n.performClick();
                                        break;
                                    }
                            }
                            return false;
                        }
                    });
                    textView3.addTextChangedListener(new p0(this, i33));
                    this.M.addView(this.O, i7.f6.n(-1, -2));
                    this.I[2] = new org.telegram.ui.Cells.y8(context, this.U0);
                    this.I[2].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                    this.M.addView(this.I[2], i7.f6.n(-1, -2));
                    this.J[1] = new org.telegram.ui.Cells.y9(context, this.U0);
                    this.J[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    org.telegram.ui.Cells.y9 y9Var = this.J[1];
                    int i55 = org.telegram.ui.ActionBar.g6.G6;
                    y9Var.setTag(Integer.valueOf(i55));
                    this.J[1].setTextColor(getThemedColor(i55));
                    this.J[1].b(LocaleController.getString(R.string.ResendCode), true);
                    this.M.addView(this.J[1], i7.f6.n(-1, -2));
                    this.J[1].setOnClickListener(new xm0(this, 6));
                    this.J[0] = new org.telegram.ui.Cells.y9(context, this.U0);
                    this.J[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                    org.telegram.ui.Cells.y9 y9Var2 = this.J[0];
                    int i56 = org.telegram.ui.ActionBar.g6.p7;
                    y9Var2.setTag(Integer.valueOf(i56));
                    this.J[0].setTextColor(getThemedColor(i56));
                    this.J[0].b(LocaleController.getString(R.string.AbortPassword), false);
                    this.M.addView(this.J[0], i7.f6.n(-1, -2));
                    this.J[0].setOnClickListener(new xm0(this, 7));
                    this.f = new EditTextBoldCursor[3];
                    int i57 = 0;
                    for (int i58 = 3; i57 < i58; i58 = 3) {
                        if (i57 == 0) {
                            this.E[0] = new org.telegram.ui.Cells.k4(context, this.U0);
                            this.E[0].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            this.E[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                            this.M.addView(this.E[0], i7.f6.n(-1, -2));
                        } else if (i57 == 2) {
                            this.E[1] = new org.telegram.ui.Cells.k4(context, this.U0);
                            this.E[1].setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                            this.E[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                            this.M.addView(this.E[1], i7.f6.n(-1, -2));
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(false);
                        this.M.addView(frameLayout6, i7.f6.n(-1, 50));
                        int i59 = org.telegram.ui.ActionBar.g6.d6;
                        frameLayout6.setBackgroundColor(getThemedColor(i59));
                        if (i57 == 0) {
                            org.telegram.ui.Components.fn fnVar4 = new org.telegram.ui.Components.fn(context, 15);
                            fnVar4.setBackgroundColor(getThemedColor(i59));
                            this.F.add(fnVar4);
                            frameLayout6.addView(fnVar4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i57] = new EditTextBoldCursor(context);
                        this.f[i57].setTag(Integer.valueOf(i57));
                        this.f[i57].setTextSize(1, 16.0f);
                        this.f[i57].setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.H6));
                        EditTextBoldCursor editTextBoldCursor9 = this.f[i57];
                        int i60 = org.telegram.ui.ActionBar.g6.G6;
                        editTextBoldCursor9.setTextColor(getThemedColor(i60));
                        this.f[i57].setBackgroundDrawable(null);
                        this.f[i57].setCursorColor(getThemedColor(i60));
                        this.f[i57].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.f[i57].setCursorWidth(1.5f);
                        if (i57 == 0 || i57 == 1) {
                            this.f[i57].setInputType(129);
                            this.f[i57].setTypeface(Typeface.DEFAULT);
                            this.f[i57].setImeOptions(268435461);
                        } else {
                            this.f[i57].setInputType(33);
                            this.f[i57].setImeOptions(268435462);
                        }
                        if (i57 == 0) {
                            this.f[i57].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                            this.f[i57].requestFocus();
                        } else if (i57 == 1) {
                            this.f[i57].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                        } else if (i57 == 2) {
                            this.f[i57].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                        }
                        this.f[i57].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        this.f[i57].setGravity(LocaleController.isRTL ? 5 : 3);
                        frameLayout6.addView(this.f[i57], i7.f6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i61 = 1;
                        this.f[i57].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: org.telegram.ui.zm0
                            public final /* synthetic */ bo0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i242, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i61) {
                                    case 0:
                                        bo0 bo0Var = this.b;
                                        if (i242 != 6) {
                                            bo0Var.getClass();
                                            break;
                                        } else {
                                            bo0Var.A0(false);
                                            break;
                                        }
                                    case 1:
                                        bo0 bo0Var2 = this.b;
                                        if (i242 != 6) {
                                            bo0Var2.getClass();
                                            if (i242 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        bo0Var2.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    bo0Var2.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            bo0Var2.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        bo0 bo0Var3 = this.b;
                                        bo0Var3.getClass();
                                        if (i242 != 5) {
                                            if (i242 == 6) {
                                                bo0Var3.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = bo0Var3.f;
                                                if (intValue2 >= editTextBoldCursorArr2.length) {
                                                    break;
                                                } else if (intValue2 != 4 && ((View) editTextBoldCursorArr2[intValue2].getParent()).getVisibility() == 0) {
                                                    bo0Var3.f[intValue2].requestFocus();
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 3:
                                        bo0 bo0Var4 = this.b;
                                        bo0Var4.getClass();
                                        if (i242 != 5) {
                                            if (i242 == 6) {
                                                bo0Var4.n.performClick();
                                                break;
                                            }
                                        } else {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            do {
                                                int i252 = intValue3 + 1;
                                                editTextBoldCursorArr = bo0Var4.f;
                                                if (i252 >= editTextBoldCursorArr.length) {
                                                    break;
                                                } else {
                                                    intValue3 = i252 == 4 ? intValue3 + 2 : i252;
                                                }
                                            } while (((View) editTextBoldCursorArr[intValue3].getParent()).getVisibility() != 0);
                                            bo0Var4.f[intValue3].requestFocus();
                                            break;
                                        }
                                        break;
                                    default:
                                        bo0 bo0Var5 = this.b;
                                        if (i242 != 6) {
                                            bo0Var5.getClass();
                                            break;
                                        } else {
                                            bo0Var5.n.performClick();
                                            break;
                                        }
                                }
                                return false;
                            }
                        });
                        if (i57 == 1) {
                            this.I[0] = new org.telegram.ui.Cells.y8(context, this.U0);
                            this.I[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                            this.I[0].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                            this.M.addView(this.I[0], i7.f6.n(-1, -2));
                        } else if (i57 == 2) {
                            this.I[1] = new org.telegram.ui.Cells.y8(context, this.U0);
                            this.I[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                            this.I[1].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                            this.M.addView(this.I[1], i7.f6.n(-1, -2));
                        }
                        i57++;
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
            TLRPC.PaymentForm paymentForm = this.y0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            K0();
            return;
        }
        if (i10 == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.y0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            K0();
            return;
        }
        if (i10 == NotificationCenter.paymentFinished) {
            this.W0 = true;
            removeSelfFromStack();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.U0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        org.telegram.ui.Components.nq nqVar = this.r;
        int i11 = org.telegram.ui.ActionBar.g6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(nqVar, 0, null, null, null, null, i11));
        org.telegram.ui.Components.nq nqVar2 = this.r;
        int i12 = org.telegram.ui.ActionBar.g6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(nqVar2, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.s, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.s, 0, null, null, null, null, i12));
        if (this.f != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6((View) editTextBoldCursorArr[i13].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f[i13], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f[i13], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        }
        if (this.h != null) {
            int i14 = 0;
            while (true) {
                org.telegram.ui.Cells.h6[] h6VarArr = this.h;
                if (i14 >= h6VarArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(h6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.g7));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.h[i14], 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h7));
                i14++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.h7));
        }
        int i15 = 0;
        while (true) {
            org.telegram.ui.Cells.k4[] k4VarArr = this.E;
            if (i15 >= k4VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(k4VarArr[i15], 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(k4VarArr[i15], 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
            i15++;
        }
        int i16 = 0;
        while (true) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.G;
            if (i16 >= x6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(x6VarArr[i16], 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
            i16++;
        }
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.y8[] y8VarArr = this.I;
            if (i17 >= y8VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i17], 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, org.telegram.ui.ActionBar.g6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i17], 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y8VarArr[i17], 2, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
            i17++;
        }
        int i18 = 0;
        while (true) {
            ArrayList arrayList2 = this.F;
            if (i18 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6((View) arrayList2.get(i18), 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
            i18++;
        }
        org.telegram.ui.Cells.h3 h3Var = this.O;
        int i19 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(h3Var, 1, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 4, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.h3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, TLObject.FLAG_28, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        int i21 = 0;
        while (true) {
            org.telegram.ui.Cells.y9[] y9VarArr = this.J;
            if (i21 >= y9VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(y9VarArr[i21], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y9VarArr[i21], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(y9VarArr[i21], 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            i21++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.s6));
        int i22 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 16, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i22));
        int i23 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i23));
        int i24 = org.telegram.ui.ActionBar.g6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i24));
        org.telegram.ui.Cells.x8[] x8VarArr = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[0], TLObject.FLAG_28, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[0], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        for (int i25 = 1; i25 < x8VarArr.length; i25++) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i25], 1, null, null, null, null, org.telegram.ui.ActionBar.g6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(x8VarArr[i25], 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        }
        org.telegram.ui.Cells.j5 j5Var = this.T;
        int i26 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(j5Var, 1, null, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"nameTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"detailTextView"}, null, null, -1, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.j5.class}, new String[]{"detailExTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, TLObject.FLAG_28, null, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.C;
    }

    public final void n0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        frameLayout.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
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
        this.K.addView(this.L, i7.f6.c(48.0f, -1));
        this.L.setOnClickListener(new xm0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.L.addView(linearLayout, i7.f6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, i7.f6.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.L.addView(imageView2, i7.f6.c(-1.0f, -1));
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
                        str = qe.b.d(telephonyManager.getLine1Number(), false);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 == 991) {
            AndroidUtilities.runOnUIThread(new ll0(this, i11, intent, 1));
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
        zn0 zn0Var = this.P;
        if (zn0Var != null) {
            zn0Var.b();
        }
        int i10 = 0;
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
                        if (i10 >= this.parentLayout.getFragmentStack().size()) {
                            i10 = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(i10)) instanceof bo0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    i10 -= indexOf;
                }
                if (i10 == 0) {
                    this.V0.a(this.b1);
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
            int i11 = this.q0;
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
        this.M0 = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i10 = this.q0;
                if ((i10 == 2 || i10 == 6) && !this.y0.invoice.test) {
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
        int i10 = this.q0;
        if (i10 == 2) {
            AndroidUtilities.runOnUIThread(new an0(this, 0), 100L);
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
        if (i10 != 6 || this.X) {
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

    public final long r0() {
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

    public final String s0(ArrayList arrayList) {
        long j10 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i10)).amount;
        }
        Long l10 = this.D0;
        if (l10 != null) {
            j10 += l10.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(j10, this.y0.invoice.currency);
    }

    public final void t0() {
        int i10;
        int i11;
        boolean z10;
        int i12 = this.q0;
        if (i12 == 0) {
            zn0 zn0Var = this.P;
            if (zn0Var != null) {
                zn0Var.d(this.E0);
                finishFragment();
                return;
            }
            if (this.y0.invoice.flexible) {
                i10 = 1;
            } else if (this.u0 == null && this.s0 == null) {
                i10 = 2;
            } else {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                i10 = UserConfig.getInstance(this.currentAccount).tmpPassword != null ? 4 : 3;
            }
            if (i10 == 2 && this.u0 == null && this.s0 == null && !this.y0.additional_methods.isEmpty()) {
                G0(new an0(this, 1));
                return;
            }
            bo0 bo0Var = new bo0(this.X0, this.y0, this.J0, this.K0, i10, this.A0, null, null, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
            bo0Var.Y0 = this.Y0;
            bo0Var.Z0 = this.Z0;
            presentFragment(bo0Var, this.O0);
            return;
        }
        if (i12 == 1) {
            if (this.s0 == null && this.t0 == null) {
                if (this.u0 != null) {
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
                if (i11 != 2 && this.t0 == null && this.u0 == null && this.s0 == null && !this.y0.additional_methods.isEmpty()) {
                    G0(new an0(this, 1));
                    return;
                }
                bo0 bo0Var2 = new bo0(this.X0, this.y0, this.J0, this.K0, i11, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
                bo0Var2.Y0 = this.Y0;
                bo0Var2.Z0 = this.Z0;
                presentFragment(bo0Var2, this.O0);
                return;
            }
            i11 = 4;
            if (i11 != 2) {
            }
            bo0 bo0Var22 = new bo0(this.X0, this.y0, this.J0, this.K0, i11, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
            bo0Var22.Y0 = this.Y0;
            bo0Var22.Z0 = this.Z0;
            presentFragment(bo0Var22, this.O0);
            return;
        }
        if (i12 == 2) {
            TLRPC.PaymentForm paymentForm = this.y0;
            if (paymentForm.password_missing && (z10 = this.Q0)) {
                bo0 bo0Var3 = new bo0(this.X0, paymentForm, this.J0, this.K0, 6, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, z10, this.F0, this.n0, this.S0);
                this.b0 = bo0Var3;
                bo0Var3.Y0 = this.Y0;
                bo0Var3.Z0 = this.Z0;
                bo0Var3.C0(this.W);
                bo0 bo0Var4 = this.b0;
                bo0Var4.P = new pn0(this);
                presentFragment(bo0Var4, this.O0);
                return;
            }
            zn0 zn0Var2 = this.P;
            if (zn0Var2 != null) {
                zn0Var2.c(this.s0, this.t0, this.Q0, this.F0, null);
                finishFragment();
                return;
            } else {
                bo0 bo0Var5 = new bo0(this.X0, paymentForm, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
                bo0Var5.Y0 = this.Y0;
                bo0Var5.Z0 = this.Z0;
                presentFragment(bo0Var5, this.O0);
                return;
            }
        }
        if (i12 == 3) {
            bo0 bo0Var6 = new bo0(this.X0, this.y0, this.J0, this.K0, this.r0 ? 4 : 2, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, this.S0);
            bo0Var6.Y0 = this.Y0;
            bo0Var6.Z0 = this.Z0;
            presentFragment(bo0Var6, true);
            return;
        }
        if (i12 != 4) {
            if (i12 != 6) {
                return;
            }
            if (this.P.c(this.s0, this.t0, this.Q0, this.F0, this.u0)) {
                finishFragment();
                return;
            }
            bo0 bo0Var7 = new bo0(this.X0, this.y0, this.J0, this.K0, 4, this.A0, this.C0, this.D0, this.s0, this.t0, this.E0, this.Q0, this.F0, this.n0, false);
            bo0Var7.Y0 = this.Y0;
            bo0Var7.Z0 = this.Z0;
            presentFragment(bo0Var7, true);
            return;
        }
        if (this.R0) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback != null) {
            AndroidUtilities.runOnUIThread(new an0(this, 2), 500L);
        } else {
            if (x0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    public final void u0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i10, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l10, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.o2 o2Var, boolean z11) {
        if (o2Var != null) {
            this.currentAccount = o2Var.getCurrentAccount();
        }
        this.q0 = i10;
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

    public final void v0(Context context) {
        Optional empty;
        if (getParentActivity() == null) {
            return;
        }
        a5.c cVar = new a5.c();
        int i10 = this.y0.invoice.test ? 3 : 1;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(j7.l1.k(i10, "Invalid environment value "));
        }
        cVar.a = i10;
        this.e = new com.google.android.gms.internal.clearcut.v0(context, h8.p.a, new h8.o(cVar), com.google.android.gms.common.api.i.c);
        try {
            JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            put.put("allowedPaymentMethods", new JSONArray().put(p0()));
            empty = Optional.of(put);
        } catch (JSONException unused) {
            empty = Optional.empty();
        }
        if (empty.isPresent()) {
            String jSONObject = ((JSONObject) empty.get()).toString();
            h8.e eVar = new h8.e();
            z5.l.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
            eVar.f = jSONObject;
            com.google.android.gms.internal.clearcut.v0 v0Var = this.e;
            v0Var.getClass();
            com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
            b10.a = 23705;
            b10.c = new ha.c(eVar, 19);
            v0Var.e(0, b10.b()).addOnCompleteListener(getParentActivity(), new bn0(this, 0));
        }
    }

    public final void w0() {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new dn0(this, 1), 10);
    }

    public final boolean x0(org.telegram.ui.ActionBar.b5 b5Var, Activity activity) {
        int i10 = 0;
        if (this.X0 != null) {
            if (b5Var != null) {
                ArrayList arrayList = new ArrayList(b5Var.getFragmentStack());
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                    if (o2Var instanceof bo0) {
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
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                if ((o2Var2 instanceof tn) || (o2Var2 instanceof PremiumPreviewFragment)) {
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

    public final void y0(org.telegram.ui.ActionBar.o2 o2Var) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (o2Var instanceof bo0) {
            bo0 bo0Var = (bo0) o2Var;
            bo0Var.V0 = this.V0;
            bo0Var.U0 = this.U0;
            bo0Var.T0 = this.T0;
            bo0Var.u0 = this.u0;
        }
    }

    public final void z0() {
        String str;
        if (this.M0) {
            return;
        }
        H0(false, true);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new u80(13, this, tL_payments_sendPaymentForm), (this.S0 ? 8 : 0) | 2);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        y0(o2Var);
        return super.presentFragment(o2Var, z10);
    }

    public bo0(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.k4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.x6[3];
        this.I = new org.telegram.ui.Cells.y8[3];
        this.J = new org.telegram.ui.Cells.y9[2];
        this.U = new org.telegram.ui.Cells.x8[7];
        this.V = -4.5f;
        this.Y = 6;
        this.R0 = true;
        u0(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, o2Var, false);
    }

    public bo0(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.C = true;
        this.E = new org.telegram.ui.Cells.k4[3];
        this.F = new ArrayList();
        this.G = new org.telegram.ui.Cells.x6[3];
        this.I = new org.telegram.ui.Cells.y8[3];
        this.J = new org.telegram.ui.Cells.y9[2];
        this.U = new org.telegram.ui.Cells.x8[7];
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

    public bo0(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.o2 o2Var) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, o2Var, false);
        this.R0 = true;
    }
}
