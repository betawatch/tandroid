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
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p extends org.telegram.ui.ActionBar.d implements jm7 {
    public static final List h1 = Arrays.asList("http", "https");
    public static final List i1 = Collections.singletonList("tg");
    public boolean A0;
    public wy2 B0;
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
    public final jf5[] J;
    public TLRPC.TL_payments_validateRequestedInfo J0;
    public final ArrayList K;
    public TLRPC.TL_inputPaymentCredentialsGooglePay K0;
    public final bba[] L;
    public String L0;
    public bjb M;
    public String M0;
    public final njb[] N;
    public JSONObject N0;
    public final vkb[] O;
    public k47 O0;
    public FrameLayout P;
    public String P0;
    public FrameLayout Q;
    public boolean Q0;
    public LinearLayout R;
    public boolean R0;
    public zjb S;
    public String[] S0;
    public ev3 T;
    public boolean T0;
    public v18 U;
    public boolean U0;
    public TextView V;
    public boolean V0;
    public p49 W;
    public boolean W0;
    public t18 X;
    public boolean X0;
    public x18 Y;
    public boolean Y0;
    public final ijb[] Z;
    public ylb Z0;
    public final ArrayList a;
    public float a0;
    public w18 a1;
    public final HashMap b;
    public TL_account.Password b0;
    public boolean b1;
    public final HashMap c;
    public boolean c0;
    public TLRPC.InputInvoice c1;
    public final HashMap d;
    public int d0;
    public qac d1;
    public ua4 e;
    public x08 e0;
    public qac e1;
    public EditTextBoldCursor[] f;
    public boolean f0;
    public k22 f1;
    public p g0;
    public int g1;
    public w09[] h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public boolean l0;
    public TLRPC.User m0;
    public r7 n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public mx2 r;
    public String r0;
    public mx2 s;
    public org.telegram.ui.ActionBar.d s0;
    public c18 t0;
    public ArrayList u0;
    public byte v0;
    public AnimatorSet w;
    public boolean w0;
    public WebView x;
    public String x0;
    public String y;
    public String y0;
    public TLRPC.TL_paymentSavedCredentialsCard z0;

    public p(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo;
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new jf5[3];
        this.K = new ArrayList();
        this.L = new bba[3];
        this.N = new njb[3];
        this.O = new vkb[2];
        this.Z = new ijb[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        this.v0 = (byte) 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.D0 = paymentForm;
        this.E0 = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.H0 = paymentReceipt.shipping;
        long j = paymentReceipt.tip_amount;
        if (j != 0) {
            this.I0 = Long.valueOf(j);
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(paymentReceipt.bot_id));
        this.m0 = W1;
        if (W1 != null) {
            this.q0 = W1.first_name;
        } else {
            this.q0 = "";
        }
        this.r0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.J0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().i1(paymentReceipt.bot_id);
                tL_payments_validateRequestedInfo = this.J0;
                tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.P0;
                tL_payments_validateRequestedInfo = this.J0;
                tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceSlug;
            }
            tL_payments_validateRequestedInfo.info = paymentReceipt.info;
        }
        this.y0 = paymentReceipt.credentials_title;
    }

    public static JSONObject d0() {
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

    public final void A0() {
        if (this.f0) {
            return;
        }
        this.f0 = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new s08(this, (byte) 3), 10);
    }

    public final boolean B0(tk5 tk5Var, Activity activity) {
        int i = 0;
        if (this.c1 != null) {
            if (tk5Var != null) {
                ArrayList arrayList = new ArrayList(tk5Var.getFragmentStack());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    org.telegram.ui.ActionBar.d dVar = (org.telegram.ui.ActionBar.d) obj;
                    if (dVar instanceof p) {
                        dVar.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.m0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().l4.E0.f) && this.P0 == null) || (this.P0 != null && getMessagesController().l4.G0.f != null && Objects.equals(this.P0, getMessagesController().l4.G0.f))) && tk5Var != null) {
            ArrayList arrayList2 = new ArrayList(tk5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                org.telegram.ui.ActionBar.d dVar2 = (org.telegram.ui.ActionBar.d) obj2;
                if ((dVar2 instanceof yv1) || (dVar2 instanceof PremiumPreviewFragment)) {
                    dVar2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.q0 = true;
            ((ActionBarLayout) tk5Var).T(premiumPreviewFragment, !isFinishing());
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

    public final void C0(org.telegram.ui.ActionBar.d dVar) {
        gm.t1(this.fragmentView);
        if (dVar instanceof p) {
            p pVar = (p) dVar;
            pVar.a1 = this.a1;
            pVar.Z0 = this.Z0;
            pVar.Y0 = this.Y0;
            pVar.z0 = this.z0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0232, code lost:
    
        if (r5 == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        Integer num;
        Integer num2;
        int i;
        boolean z;
        Integer num3;
        boolean z2;
        String[] split = this.f[1].getText().toString().split("/");
        if (split.length == 2) {
            Integer z3 = Utilities.z(split[0]);
            num2 = Utilities.z(split[1]);
            num = z3;
        } else {
            num = null;
            num2 = null;
        }
        zd1 zd1Var = new zd1(this.f[0].getText().toString(), num, num2, this.f[3].getText().toString(), this.f[2].getText().toString(), null, null, null, null, this.f[5].getText().toString(), this.f[4].getText().toString(), null, null, null, null, null, null);
        this.y0 = zd1Var.c() + " *" + zd1Var.d();
        boolean z4 = num != null && num2 != null && z8c.h(this.currentAccount).d().startsWith("7") && "smartglocal".equals(this.D0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = (String) zd1Var.a;
        if (!uwe.d(str)) {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!uwe.d(replaceAll) && replaceAll != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        boolean z5 = true;
                        int i3 = 0;
                        while (true) {
                            if (length >= 0) {
                                char charAt = replaceAll.charAt(length);
                                if (!Character.isDigit(charAt)) {
                                    break;
                                }
                                int parseInt = Integer.parseInt(String.valueOf(charAt));
                                boolean z6 = !z5;
                                if (!z5) {
                                    parseInt <<= 1;
                                }
                                if (parseInt > 9) {
                                    parseInt -= 9;
                                }
                                i3 += parseInt;
                                length--;
                                z5 = z6;
                            } else if (i3 % 10 == 0) {
                                String c = zd1Var.c();
                                byte b = 16;
                                byte b2 = 15;
                                if (!"American Express".equals(c) ? !(!"Diners Club".equals(c) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    if (!z4) {
                                        Object obj = zd1Var.m;
                                        Integer num4 = (Integer) obj;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12) {
                                            Object obj2 = zd1Var.n;
                                            Integer num5 = (Integer) obj2;
                                            if (num5 != null) {
                                                int a = vee.a(num5.intValue());
                                                if (k1f.G == null) {
                                                    k1f.G = new k1f(b2);
                                                }
                                                if (a >= Calendar.getInstance().get(1)) {
                                                    Integer num6 = (Integer) obj;
                                                    if (num6 != null && num6.intValue() >= 1 && num6.intValue() <= 12 && (num3 = (Integer) obj2) != null) {
                                                        int a2 = vee.a(num3.intValue());
                                                        if (k1f.G == null) {
                                                            k1f.G = new k1f(b2);
                                                        }
                                                        if (a2 >= Calendar.getInstance().get(1)) {
                                                            int intValue = ((Integer) obj2).intValue();
                                                            int intValue2 = ((Integer) obj).intValue();
                                                            int a3 = vee.a(intValue);
                                                            if (k1f.G == null) {
                                                                k1f.G = new k1f(b2);
                                                            }
                                                            if (a3 >= Calendar.getInstance().get(1)) {
                                                                if (k1f.G == null) {
                                                                    k1f.G = new k1f(b2);
                                                                }
                                                                Calendar calendar = Calendar.getInstance();
                                                                if (vee.a(intValue) != calendar.get(1) || intValue2 >= calendar.get(2) + 1) {
                                                                    z2 = false;
                                                                    z = !z2;
                                                                }
                                                            }
                                                            z2 = true;
                                                            z = !z2;
                                                        }
                                                    }
                                                    z = false;
                                                }
                                            }
                                        }
                                        K0(1);
                                        return;
                                    }
                                    if (this.j0 && this.f[2].length() == 0) {
                                        K0(2);
                                        return;
                                    }
                                    String str2 = (String) zd1Var.b;
                                    if (!uwe.d(str2)) {
                                        String trim = str2.trim();
                                        String c2 = zd1Var.c();
                                        boolean z7 = (c2 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(c2) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            int i4 = 0;
                                            while (true) {
                                                if (i4 < trim.length()) {
                                                    if (!Character.isDigit(trim.charAt(i4))) {
                                                        break;
                                                    } else {
                                                        i4++;
                                                    }
                                                } else if (z7) {
                                                    if (this.h0 && this.f[4].length() == 0) {
                                                        K0(4);
                                                        return;
                                                    }
                                                    if (this.i0 && this.f[5].length() == 0) {
                                                        K0(5);
                                                        return;
                                                    }
                                                    N0(true, true);
                                                    try {
                                                        if ("stripe".equals(this.D0.native_provider)) {
                                                            String str3 = this.k0;
                                                            et8 et8Var = new et8(new fgf((byte) 26), b);
                                                            fgf.Q3(str3);
                                                            ai4 ai4Var = new ai4((Object) this, (byte) 19);
                                                            try {
                                                                fgf.Q3(str3);
                                                                new qbb(et8Var, str3, zd1Var, ai4Var).execute(new Void[0]);
                                                            } catch (v50 e) {
                                                                ai4Var.H(e);
                                                            }
                                                        } else if ("smartglocal".equals(this.D0.native_provider)) {
                                                            new o18(this, zd1Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                        }
                                                        return;
                                                    } catch (Exception e2) {
                                                        fc4.g(e2, true);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    K0(3);
                                    return;
                                }
                            }
                        }
                    } else if (!Character.isDigit(replaceAll.charAt(i2))) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i = 0;
            K0(i);
        }
        i = 0;
        K0(i);
    }

    public final void E0() {
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
            tL_inputInvoiceMessage.peer = getMessagesController().l1(this.O0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.O0.e1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.P0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.D0.form_id;
        if (z8c.h(this.currentAccount).y == null || this.z0 == null) {
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
            tL_inputPaymentCredentialsSaved.tmp_password = z8c.h(this.currentAccount).y.tmp_password;
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.F0;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags |= 1;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.H0;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        byte b = 4;
        if ((this.D0.invoice.flags & 256) != 0) {
            Long l = this.I0;
            tL_payments_sendPaymentForm.tip_amount = l != null ? l.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new jl7(this, tL_payments_sendPaymentForm, b), (this.X0 ? 8 : 0) | 2);
    }

    public final void F0() {
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo;
        if (this.R0) {
            return;
        }
        N0(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = new TLRPC.TL_payments_validateRequestedInfo();
        this.J0 = tL_payments_validateRequestedInfo2;
        TLRPC.InputInvoice inputInvoice = this.c1;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo2.invoice = inputInvoice;
        } else {
            if (this.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().l1(this.O0.k.peer_id);
                tL_inputInvoiceMessage.msg_id = this.O0.e1();
                tL_payments_validateRequestedInfo = this.J0;
                tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.P0;
                tL_payments_validateRequestedInfo = this.J0;
                tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceSlug;
            }
            tL_payments_validateRequestedInfo2 = tL_payments_validateRequestedInfo;
        }
        tL_payments_validateRequestedInfo2.save = this.U0;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (this.D0.invoice.name_requested) {
            this.J0.info.name = this.f[6].getText().toString();
            this.J0.info.flags |= 1;
        }
        if (this.D0.invoice.phone_requested) {
            this.J0.info.phone = "+" + this.f[8].getText().toString() + this.f[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = this.J0.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (this.D0.invoice.email_requested) {
            this.J0.info.email = this.f[7].getText().toString().trim();
            this.J0.info.flags |= 4;
        }
        byte b = 3;
        if (this.D0.invoice.shipping_address_requested) {
            this.J0.info.shipping_address = new TLRPC.TL_postAddress();
            this.J0.info.shipping_address.street_line1 = this.f[0].getText().toString();
            this.J0.info.shipping_address.street_line2 = this.f[1].getText().toString();
            this.J0.info.shipping_address.city = this.f[2].getText().toString();
            this.J0.info.shipping_address.state = this.f[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = this.J0.info.shipping_address;
            String str = this.C0;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = this.f[5].getText().toString();
            this.J0.info.flags |= 8;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(this.J0, new jl7(this, this.J0, b), (this.X0 ? 8 : 0) | 2);
    }

    public final void G0(boolean z) {
        String obj;
        String str;
        byte b = 1;
        if (!z && this.T.getVisibility() == 0) {
            String text = this.T.getText();
            if (text.length() == 0) {
                ev3 ev3Var = this.T;
                try {
                    ev3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                gm.A3(2.5f, ev3Var, null);
                return;
            } else {
                N0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new s08(this, b), 10);
                return;
            }
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z) {
            this.n.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            obj = null;
        } else {
            obj = this.f[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                K0(0);
                return;
            }
            if (!obj.equals(this.f[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), jb6.M0(2131747179, null), 0).show();
                } catch (Exception e) {
                    fc4.g(e, true);
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
            int i = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.b0.new_algo;
            passwordinputsettings2.flags = i | 3;
            passwordinputsettings2.email = obj2.trim();
            str = obj2;
        }
        N0(true, true);
        Utilities.e.c(new aa7((Object) this, z, (Object) str, (Object) obj, (Object) updatepasswordsettings, (byte) 15));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        ijb[] ijbVarArr = this.Z;
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
            kt6.v(sb, ", ", str4, ", ", str5);
            ijbVarArr[2].b(R.drawable.msg_payment_address, b10.j(sb, ", ", str6), jb6.M0(2131747114, null), true);
        }
        ijbVarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            ijbVarArr[3].b(R.drawable.msg_contacts, str7, jb6.M0(2131747145, null), true);
        }
        ijbVarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            ijbVarArr[4].b(R.drawable.msg_calls, r58.f().e(tL_paymentRequestedInfo.phone), jb6.M0(2131747143, null), (tL_paymentRequestedInfo.email == null && this.H0 == null) ? false : true);
        }
        ijbVarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            ijbVarArr[5].b(R.drawable.msg_mention, str8, jb6.M0(2131747148, null), this.H0 != null);
        }
        ijbVarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
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
            i0();
        }
    }

    public final void J0(boolean z) {
        this.Q0 = z;
        this.H = !z;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.Q0);
        }
        ijb ijbVar = this.Z[0];
        if (ijbVar != null) {
            ijbVar.setEnabled(!this.Q0);
        }
    }

    public final void K0(int i) {
        EditTextBoldCursor editTextBoldCursor = this.f[i];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        gm.A3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        showDialog(heVar);
    }

    public final void M0(Runnable runnable) {
        Integer valueOf = Integer.valueOf(R.drawable.msg_payment_card);
        my0 i = wi8.i(getParentActivity(), false, 1, null);
        i.P = jb6.M0(2131747147, null);
        i.Q = true;
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
        int i2 = 0;
        while (i2 < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i2);
            i2++;
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
        int i3 = 0;
        while (i3 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i3);
            i3++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(jb6.M0(2131747146, null));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            iArr[i4] = ((Integer) arrayList2.get(i4)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        zh zhVar = new zh(this, runnable, arrayList3, arrayList, (byte) 1);
        i.M = charSequenceArr;
        i.N = iArr;
        i.L = zhVar;
        showDialog(i);
    }

    public final void N0(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        byte b = 1;
        byte b2 = 0;
        if (!z || this.n == null) {
            if (this.V != null) {
                this.w = new AnimatorSet();
                if (z2) {
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
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<mx2, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<mx2, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<mx2, Float>) property3, 1.0f));
                } else {
                    this.V.setVisibility(0);
                    this.X.setEnabled(true);
                    AnimatorSet animatorSet3 = this.w;
                    mx2 mx2Var = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(mx2Var, (Property<mx2, Float>) property4, 0.1f);
                    mx2 mx2Var2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(mx2Var2, (Property<mx2, Float>) property5, 0.1f);
                    mx2 mx2Var3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(mx2Var3, (Property<mx2, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property6, 1.0f));
                }
                this.w.addListener(new p18(this, z2, b));
                this.w.setDuration(150L);
                this.w.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.w = animatorSet4;
        if (z2) {
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
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<mx2, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<mx2, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<mx2, Float>) property9, 1.0f));
        } else if (this.x != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<mx2, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<mx2, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<mx2, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.w;
            mx2 mx2Var4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(mx2Var4, (Property<mx2, Float>) property10, 0.1f);
            mx2 mx2Var5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(mx2Var5, (Property<mx2, Float>) property11, 0.1f);
            mx2 mx2Var6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(mx2Var6, (Property<mx2, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.w.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.w.addListener(new p18(this, z2, b2));
        this.w.setDuration(150L);
        this.w.start();
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131747087, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.a0("PaymentTransactionMessage2", null, 2131747088, str, this.q0, this.r0));
        alertDialog$Builder.j(jb6.M0(2131751708, null), new y08(this, (byte) 5));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        showDialog(heVar);
    }

    public final void P0() {
        if (this.v0 == 6) {
            njb[] njbVarArr = this.N;
            if (njbVarArr[2] != null) {
                int i = 0;
                this.n.setVisibility(0);
                TL_account.Password password = this.b0;
                ArrayList arrayList = this.K;
                jf5[] jf5VarArr = this.J;
                vkb[] vkbVarArr = this.O;
                if (password == null) {
                    N0(true, true);
                    njbVarArr[2].setVisibility(8);
                    vkbVarArr[0].setVisibility(8);
                    vkbVarArr[1].setVisibility(8);
                    this.T.setVisibility(8);
                    jf5VarArr[0].setVisibility(8);
                    jf5VarArr[1].setVisibility(8);
                    njbVarArr[0].setVisibility(8);
                    for (int i2 = 0; i2 < 3; i2++) {
                        ((View) this.f[i2].getParent()).setVisibility(8);
                    }
                    while (i < arrayList.size()) {
                        ((View) arrayList.get(i)).setVisibility(8);
                        i++;
                    }
                    return;
                }
                N0(true, false);
                if (!this.c0) {
                    njbVarArr[2].setVisibility(8);
                    vkbVarArr[0].setVisibility(8);
                    vkbVarArr[1].setVisibility(8);
                    njbVarArr[1].setText(jb6.M0(2131747124, null));
                    this.T.setVisibility(8);
                    jf5VarArr[0].setVisibility(0);
                    jf5VarArr[1].setVisibility(0);
                    njbVarArr[0].setVisibility(0);
                    for (int i3 = 0; i3 < 3; i3++) {
                        ((View) this.f[i3].getParent()).setVisibility(0);
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        ((View) arrayList.get(i4)).setVisibility(0);
                    }
                    return;
                }
                njb njbVar = njbVarArr[2];
                String str = this.b0.email_unconfirmed_pattern;
                if (str == null) {
                    str = "";
                }
                njbVar.setText(jb6.a0("EmailPasswordConfirmText2", null, 2131751136, str));
                njbVarArr[2].setVisibility(0);
                vkbVarArr[0].setVisibility(0);
                vkbVarArr[1].setVisibility(0);
                this.T.setVisibility(0);
                njbVarArr[1].setText("");
                jf5VarArr[0].setVisibility(8);
                jf5VarArr[1].setVisibility(8);
                njbVarArr[0].setVisibility(8);
                for (int i5 = 0; i5 < 3; i5++) {
                    ((View) this.f[i5].getParent()).setVisibility(8);
                }
                while (i < arrayList.size()) {
                    ((View) arrayList.get(i)).setVisibility(8);
                    i++;
                }
            }
        }
    }

    public final void Q0() {
        njb[] njbVarArr = this.N;
        if (njbVarArr[0] != null) {
            bba[] bbaVarArr = this.L;
            if (bbaVarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.D0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.x != null && this.A0)) {
                    this.M.setVisibility(8);
                    njbVarArr[0].setVisibility(8);
                    bba bbaVar = bbaVarArr[2];
                    anb.Z(bbaVar, bbaVar.getContext(), R.drawable.greydivider_bottom, cmb.a7);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131747154, null));
                if (this.D0.password_missing) {
                    A0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String M0 = jb6.M0(2131747153, null);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) M0);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i = indexOf + length;
                        int i2 = lastIndexOf + length;
                        njbVarArr[0].getTextView().setMovementMethod(new cm((byte) 0));
                        spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i, i + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new u18(this), i, i2 - 1, 33);
                    }
                }
                this.M.setEnabled(true);
                njbVarArr[0].setText(spannableStringBuilder);
                this.M.setVisibility(0);
                njbVarArr[0].setVisibility(0);
                bba bbaVar2 = bbaVarArr[2];
                anb.Z(bbaVar2, bbaVar2.getContext(), R.drawable.greydivider, cmb.a7);
            }
        }
    }

    public final void R0() {
        this.S0[0] = h0(this.u0);
        this.S.a(jb6.M0(2131747086, null), this.S0[0], true);
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(jb6.a0("PaymentCheckoutPay", null, 2131747144, this.S0[0]));
        }
        if (this.t0 != null) {
            int themedColor = getThemedColor(cmb.Ui);
            int childCount = this.t0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView textView2 = (TextView) this.t0.getChildAt(i);
                if (textView2.getTag().equals(this.I0)) {
                    cmb.A1(themedColor, textView2.getBackground());
                    anb.X(textView2, cmb.Vi, this.Z0);
                } else {
                    cmb.A1(536870911 & themedColor, textView2.getBackground());
                    anb.X(textView2, cmb.Y8, this.Z0);
                }
                textView2.invalidate();
            }
        }
    }

    public final void a0() {
        if (z8c.h(this.currentAccount).y != null && z8c.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            z8c.h(this.currentAccount).y = null;
            z8c.h(this.currentAccount).u(false);
        }
        if (z8c.h(this.currentAccount).y != null) {
            E0();
            return;
        }
        if (this.f[1].length() == 0) {
            try {
                this.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            gm.A3(2.5f, this.f[1], null);
            return;
        }
        String obj = this.f[1].getText().toString();
        N0(true, true);
        J0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpassword, new i65(this, obj, getpassword, (byte) 25), (this.X0 ? 8 : 0) | 2);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.g7));
        hashSet.add(Integer.valueOf(cmb.f7));
        hashSet.add(Integer.valueOf(cmb.D7));
        hashSet.add(Integer.valueOf(cmb.C7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void b0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        fg0 L0 = cmb.L0(true);
        wmb M = anb.M(cmb.c6);
        wmb M2 = anb.M(cmb.h6);
        frameLayout.setBackground(L0);
        anb.j(frameLayout, L0, M, M2, null);
        this.P.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.setClickable(true);
        this.Q.setFocusable(true);
        this.Q.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        String str = this.L0;
        FrameLayout frameLayout3 = this.Q;
        if (str == null) {
            frameLayout3.setPadding(gm.L(10.0f), gm.L(2.0f), gm.L(10.0f), gm.L(2.0f));
        } else {
            frameLayout3.setPadding(gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), gm.L(2.0f));
        }
        this.P.addView(this.Q, qoe.c(48.0f, -1));
        this.Q.setOnClickListener(new t08(this, (byte) 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.Q.addView(linearLayout, qoe.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, qoe.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.Q.addView(imageView2, qoe.c(-1.0f, -1));
    }

    public final void c0(String str) {
        boolean z;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.a.b.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            boolean z2 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (str == null) {
                if (!z2) {
                    return;
                } else {
                    str = r58.h(telephonyManager.getLine1Number(), false);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i = 4;
            String str2 = null;
            if (str.length() > 4) {
                while (true) {
                    if (i < 1) {
                        z = false;
                        break;
                    }
                    String substring = str.substring(0, i);
                    if (((String) this.c.get(substring)) != null) {
                        str2 = str.substring(i);
                        this.f[8].setText(substring);
                        z = true;
                        break;
                    }
                    i--;
                }
                if (!z) {
                    str2 = str.substring(1);
                    this.f[8].setText(str.substring(0, 1));
                }
            }
            if (str2 != null) {
                this.f[9].setText(str2);
                EditTextBoldCursor editTextBoldCursor = this.f[9];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x02fe, code lost:
    
        if (r15.email_requested == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0fe2, code lost:
    
        if (r14.email_requested == false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x1a57, code lost:
    
        if (r0 != null) goto L635;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x1bff  */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, p49, wmb] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r3v150, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v154, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v155, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v191, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v232, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v233, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v98, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r15;
        int i;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        char c;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        TLRPC.TL_invoice tL_invoice;
        bba bbaVar;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4;
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ?? frameLayout;
        int i6;
        int i7;
        byte b;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str3;
        String str4;
        BufferedReader bufferedReader;
        switch (this.v0) {
            case 0:
                this.actionBar.setTitle(jb6.L0(2131747108));
                break;
            case 1:
                this.actionBar.setTitle(jb6.L0(2131747107));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.G0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.G0.title);
                    break;
                } else {
                    this.actionBar.setTitle(jb6.L0(2131747158));
                    break;
                }
                break;
            case 4:
                boolean z2 = this.D0.invoice.test;
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (z2) {
                    aVar.setTitle("Test ".concat(jb6.L0(2131747151)));
                    break;
                } else {
                    aVar.setTitle(jb6.L0(2131747151));
                    break;
                }
            case 5:
                boolean z3 = this.D0.invoice.test;
                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                if (z3) {
                    aVar2.setTitle("Test ".concat(jb6.L0(2131747115)));
                    break;
                } else {
                    aVar2.setTitle(jb6.L0(2131747115));
                    break;
                }
            case 6:
                this.actionBar.setTitle(jb6.L0(2131747126));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new k18(this));
        r6 t = this.actionBar.t();
        byte b2 = this.v0;
        int i8 = 6;
        int i9 = 3;
        if (b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 6) {
            this.n = t.h(1, R.drawable.ic_ab_done, gm.L(56.0f), jb6.L0(2131751291));
            mx2 mx2Var = new mx2(context, 1);
            this.r = mx2Var;
            mx2Var.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, qoe.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        anb.h(cmb.Z6, getResourceProvider(), frameLayout2);
        ScrollView scrollView = new ScrollView(context);
        this.F = scrollView;
        scrollView.setFillViewport(true);
        gm.u3(this.F, getThemedColor(cmb.r8));
        frameLayout2.addView(this.F, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.v0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R = linearLayout;
        linearLayout.setOrientation(1);
        int i10 = 0;
        this.R.setClipChildren(false);
        this.F.addView(this.R, new FrameLayout.LayoutParams(-1, -2));
        byte b3 = this.v0;
        int i11 = 10;
        byte b4 = 2;
        int i12 = 1;
        String str5 = "";
        byte b5 = 9;
        if (b3 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e) {
                e = e;
                i3 = i10;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i10, split[2]);
                    i3 = i10;
                    try {
                        this.b.put(split[2], split[i3]);
                        this.c.put(split[i3], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[i3], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i10 = i3;
                    } catch (Exception e2) {
                        e = e2;
                    }
                } else {
                    i3 = i10;
                    bufferedReader.close();
                    Collections.sort(this.a, new sa((byte) 9));
                    this.f = new EditTextBoldCursor[10];
                    i4 = i3;
                    while (i4 < i11) {
                        if (i4 == 0) {
                            this.J[i3] = new jf5(context, this.Z0);
                            anb.h(cmb.c6, getResourceProvider(), this.J[i3]);
                            this.J[i3].setText(jb6.L0(2131747114));
                            this.R.addView(this.J[i3], qoe.o(-1, -2));
                        } else if (i4 == i8) {
                            this.L[i3] = new bba(context, (Object) null);
                            this.R.addView(this.L[i3], qoe.o(-1, -2));
                            this.J[i12] = new jf5(context, this.Z0);
                            anb.h(cmb.c6, getResourceProvider(), this.J[i12]);
                            this.J[i12].setText(jb6.L0(2131747104));
                            this.R.addView(this.J[i12], qoe.o(-1, -2));
                        }
                        if (i4 == 8) {
                            frameLayout = new LinearLayout(context);
                            ?? r4 = i3;
                            frameLayout.setClipChildren(r4);
                            frameLayout.setOrientation(r4 == true ? 1 : 0);
                            this.R.addView(frameLayout, qoe.o(-1, 50));
                            anb.h(cmb.c6, getResourceProvider(), frameLayout);
                        } else if (i4 == b5) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.R.addView(frameLayout, qoe.o(-1, 50));
                            int i13 = cmb.c6;
                            anb.h(i13, getResourceProvider(), frameLayout);
                            int i14 = i4 != 5 ? i12 : 0;
                            if (i14 != 0) {
                                if (i4 != 7 || this.D0.invoice.phone_requested) {
                                    if (i4 == i8) {
                                        TLRPC.TL_invoice tL_invoice2 = this.D0.invoice;
                                        if (!tL_invoice2.phone_requested) {
                                        }
                                    }
                                }
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                o72 o72Var = new o72(context, (byte) 16);
                                anb.h(i13, getResourceProvider(), o72Var);
                                this.K.add(o72Var);
                                frameLayout.addView(o72Var, new FrameLayout.LayoutParams(-1, i12, 83));
                            }
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                        if (i4 == b5) {
                            editTextBoldCursorArr[i4] = new dg5(context);
                        } else {
                            editTextBoldCursorArr[i4] = new EditTextBoldCursor(context);
                        }
                        this.f[i4].setTag(Integer.valueOf(i4));
                        this.f[i4].setTextSize(1, 16.0f);
                        anb.D(this.f[i4], cmb.G6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor = this.f[i4];
                        int i15 = cmb.F6;
                        anb.X(editTextBoldCursor, i15, getResourceProvider());
                        this.f[i4].setBackgroundDrawable(null);
                        anb.v(this.f[i4], i15, getResourceProvider());
                        this.f[i4].setCursorSize(gm.L(20.0f));
                        this.f[i4].setCursorWidth(1.5f);
                        if (i4 == 4) {
                            final byte b6 = 0;
                            this.f[i4].setOnTouchListener(new View.OnTouchListener(this) { // from class: u08
                                public final /* synthetic */ p b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    byte b7 = b6;
                                    p pVar = this.b;
                                    switch (b7) {
                                        case 0:
                                            if (pVar.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    az2 az2Var = new az2(null, false);
                                                    az2Var.n = true;
                                                    az2Var.r = new y08(pVar, (byte) 4);
                                                    pVar.presentFragment(az2Var);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                            break;
                                        default:
                                            if (pVar.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    az2 az2Var2 = new az2(null, false);
                                                    az2Var2.n = true;
                                                    az2Var2.r = new y08(pVar, (byte) 2);
                                                    pVar.presentFragment(az2Var2);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i4].setInputType(0);
                        }
                        if (i4 == b5 || i4 == 8) {
                            this.f[i4].setInputType(i9);
                        } else {
                            EditTextBoldCursor[] editTextBoldCursorArr2 = this.f;
                            if (i4 == 7) {
                                editTextBoldCursorArr2[i4].setInputType(1);
                            } else {
                                editTextBoldCursorArr2[i4].setInputType(16385);
                            }
                        }
                        this.f[i4].setImeOptions(268435461);
                        switch (i4) {
                            case 0:
                                this.f[i4].setHint(jb6.L0(2131747113));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.f[i4].setText(tL_postAddress.street_line1);
                                    break;
                                }
                                break;
                            case 1:
                                this.f[i4].setHint(jb6.L0(2131747112));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress2 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.f[i4].setText(tL_postAddress2.street_line2);
                                    break;
                                }
                                break;
                            case 2:
                                this.f[i4].setHint(jb6.L0(2131747111));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress3 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    this.f[i4].setText(tL_postAddress3.city);
                                    break;
                                }
                                break;
                            case 3:
                                this.f[i4].setHint(jb6.L0(2131747101));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress4 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    this.f[i4].setText(tL_postAddress4.state);
                                    break;
                                }
                                break;
                            case 4:
                                this.f[i4].setHint(jb6.L0(2131747110));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (tL_postAddress5 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                    String str6 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                    String str7 = this.D0.saved_info.shipping_address.country_iso2;
                                    this.C0 = str7;
                                    EditTextBoldCursor editTextBoldCursor2 = this.f[i4];
                                    if (str6 == null) {
                                        str6 = str7;
                                    }
                                    editTextBoldCursor2.setText(str6);
                                    break;
                                }
                                break;
                            case 5:
                                this.f[i4].setHint(jb6.L0(2131747100));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (tL_postAddress6 = tL_paymentRequestedInfo10.shipping_address) != null) {
                                    this.f[i4].setText(tL_postAddress6.post_code);
                                    break;
                                }
                                break;
                            case 6:
                                this.f[i4].setHint(jb6.L0(2131747106));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo11 != null && (str3 = tL_paymentRequestedInfo11.name) != null) {
                                    this.f[i4].setText(str3);
                                    break;
                                }
                                break;
                            case 7:
                                this.f[i4].setHint(jb6.L0(2131747109));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = this.D0.saved_info;
                                if (tL_paymentRequestedInfo12 != null && (str4 = tL_paymentRequestedInfo12.email) != null) {
                                    this.f[i4].setText(str4);
                                    break;
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.f[i4];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i4 == 8) {
                            TextView textView = new TextView(context);
                            this.I = textView;
                            textView.setText("+");
                            anb.X(this.I, i15, getResourceProvider());
                            this.I.setTextSize(1, 16.0f);
                            frameLayout.addView(this.I, qoe.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                            this.f[i4].setPadding(gm.L(10.0f), 0, 0, 0);
                            this.f[i4].setGravity(19);
                            this.f[i4].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            frameLayout.addView(this.f[i4], qoe.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                            this.f[i4].addTextChangedListener(new l18(this, (byte) 1));
                        } else {
                            EditTextBoldCursor[] editTextBoldCursorArr3 = this.f;
                            if (i4 == b5) {
                                editTextBoldCursorArr3[i4].setPadding(0, 0, 0, 0);
                                this.f[i4].setGravity(19);
                                frameLayout.addView(this.f[i4], qoe.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                                this.f[i4].addTextChangedListener(new sk2(this, (byte) 4));
                            } else {
                                editTextBoldCursorArr3[i4].setPadding(0, 0, 0, gm.L(6.0f));
                                this.f[i4].setGravity(jb6.a0 ? 5 : i9);
                                frameLayout.addView(this.f[i4], qoe.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            }
                        }
                        final byte b7 = b4;
                        this.f[i4].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: w08
                            public final /* synthetic */ p b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i16, KeyEvent keyEvent) {
                                byte b8 = b7;
                                p pVar = this.b;
                                switch (b8) {
                                    case 0:
                                        if (i16 == 6) {
                                            pVar.G0(false);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (i16 != 6) {
                                            if (i16 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        pVar.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    pVar.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (i16 == 5) {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr4 = pVar.f;
                                                if (intValue2 < editTextBoldCursorArr4.length) {
                                                    if (intValue2 != 4 && ((View) editTextBoldCursorArr4[intValue2].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue2].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i16 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    case 3:
                                        if (i16 == 5) {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                int i17 = intValue3 + 1;
                                                EditTextBoldCursor[] editTextBoldCursorArr5 = pVar.f;
                                                if (i17 < editTextBoldCursorArr5.length) {
                                                    intValue3 = i17 == 4 ? intValue3 + 2 : i17;
                                                    if (((View) editTextBoldCursorArr5[intValue3].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue3].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i16 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    default:
                                        if (i16 == 6) {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                        if (i4 == b5) {
                            TLRPC.TL_invoice tL_invoice3 = this.D0.invoice;
                            if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                TLRPC.User user = null;
                                int i16 = 0;
                                while (i16 < this.D0.users.size()) {
                                    TLRPC.User user2 = this.D0.users.get(i16);
                                    int i17 = i9;
                                    byte b8 = b5;
                                    int i18 = i8;
                                    if (user2.id == this.D0.provider_id) {
                                        user = user2;
                                    }
                                    i16++;
                                    b5 = b8;
                                    i9 = i17;
                                    i8 = i18;
                                }
                                i6 = i8;
                                i7 = i9;
                                b = b5;
                                String n = user != null ? bw2.n(user.first_name, user.last_name) : "";
                                this.N[1] = new njb(context, this.Z0);
                                anb.Z(this.N[1], context, R.drawable.greydivider_bottom, cmb.a7);
                                this.R.addView(this.N[1], qoe.o(-1, -2));
                                TLRPC.TL_invoice tL_invoice4 = this.D0.invoice;
                                boolean z4 = tL_invoice4.email_to_provider;
                                if (z4 && tL_invoice4.phone_to_provider) {
                                    this.N[1].setText(jb6.Y(2131747118, "PaymentPhoneEmailToProvider", n));
                                } else {
                                    njb[] njbVarArr = this.N;
                                    if (z4) {
                                        njbVarArr[1].setText(jb6.Y(2131747136, "PaymentEmailToProvider", n));
                                    } else {
                                        njbVarArr[1].setText(jb6.Y(2131747117, "PaymentPhoneToProvider", n));
                                    }
                                }
                            } else {
                                this.L[1] = new bba(context, (Object) null);
                                this.R.addView(this.L[1], qoe.o(-1, -2));
                                i6 = i8;
                                i7 = i9;
                                b = b5;
                            }
                            bjb bjbVar = new bjb(context, this.Z0);
                            this.M = bjbVar;
                            anb.Q(bjbVar, cmb.L0(true), anb.M(cmb.c6), anb.M(cmb.h6));
                            this.M.f(jb6.L0(2131747103), this.U0, false);
                            this.R.addView(this.M, qoe.o(-1, -2));
                            this.M.setOnClickListener(new t08(this, (byte) 8));
                            this.N[0] = new njb(context, this.Z0);
                            anb.Z(this.N[0], context, R.drawable.greydivider_bottom, cmb.a7);
                            this.N[0].setText(jb6.L0(2131747102));
                            this.R.addView(this.N[0], qoe.o(-1, -2));
                        } else {
                            i6 = i8;
                            i7 = i9;
                            b = b5;
                        }
                        i4++;
                        b5 = b;
                        i9 = i7;
                        i8 = i6;
                        i11 = 10;
                        b4 = 2;
                        i12 = 1;
                        i3 = 0;
                    }
                    int i19 = i8;
                    int i20 = i9;
                    byte b9 = b5;
                    if (this.D0.invoice.name_requested) {
                        i5 = 8;
                        ((ViewGroup) this.f[i19].getParent()).setVisibility(8);
                    } else {
                        i5 = 8;
                    }
                    if (!this.D0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i5].getParent()).setVisibility(i5);
                    }
                    if (!this.D0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i5);
                    }
                    tL_invoice = this.D0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[b9].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else {
                        boolean z5 = tL_invoice.name_requested;
                        EditTextBoldCursor[] editTextBoldCursorArr4 = this.f;
                        if (z5) {
                            editTextBoldCursorArr4[i19].setImeOptions(268435462);
                        } else {
                            editTextBoldCursorArr4[5].setImeOptions(268435462);
                        }
                    }
                    bbaVar = this.L[1];
                    if (bbaVar == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.D0.invoice;
                        bbaVar.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        njb njbVar = this.N[1];
                        if (njbVar != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.D0.invoice;
                            njbVar.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    jf5 jf5Var = this.J[1];
                    TLRPC.TL_invoice tL_invoice7 = this.D0.invoice;
                    jf5Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.D0.invoice.shipping_address_requested) {
                        this.J[0].setVisibility(8);
                        this.L[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[i20].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo3 = this.D0.saved_info;
                    if (tL_paymentRequestedInfo3 != null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone)) {
                        c0(null);
                    } else {
                        c0(this.D0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm2 = this.D0;
                        if (paymentForm2.invoice.phone_requested && ((tL_paymentRequestedInfo4 = paymentForm2.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo4.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) org.telegram.messenger.a.b.getSystemService("phone");
                            } catch (Exception e3) {
                                fc4.f(e3);
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
                e = e2;
                fc4.f(e);
                Collections.sort(this.a, new sa((byte) 9));
                this.f = new EditTextBoldCursor[10];
                i4 = i3;
                while (i4 < i11) {
                }
                int i192 = i8;
                int i202 = i9;
                byte b92 = b5;
                if (this.D0.invoice.name_requested) {
                }
                if (!this.D0.invoice.phone_requested) {
                }
                if (!this.D0.invoice.email_requested) {
                }
                tL_invoice = this.D0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                bbaVar = this.L[1];
                if (bbaVar == null) {
                }
                jf5 jf5Var2 = this.J[1];
                TLRPC.TL_invoice tL_invoice72 = this.D0.invoice;
                jf5Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.D0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo3 = this.D0.saved_info;
                if (tL_paymentRequestedInfo3 != null) {
                }
                c0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            int i21 = 3;
            byte b10 = 17;
            int i22 = 2131747152;
            if (b3 == 2) {
                if (this.D0.native_params != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.D0.native_params.data);
                        String optString = jSONObject.optString("google_pay_public_key");
                        if (!TextUtils.isEmpty(optString)) {
                            this.L0 = optString;
                        }
                        this.M0 = jSONObject.optString("acquirer_bank_country");
                        this.N0 = jSONObject.optJSONObject("gpay_parameters");
                    } catch (Exception e4) {
                        fc4.f(e4);
                    }
                }
                if (this.T0 || this.G0 != null) {
                    if (this.L0 != null || this.N0 != null) {
                        k0(context);
                    }
                    b0(context);
                    this.R.addView(this.P, qoe.o(-1, 50));
                    this.A0 = true;
                    N0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    gm.u(context, true);
                    q18 q18Var = new q18(this, context);
                    this.x = q18Var;
                    q18Var.getSettings().setJavaScriptEnabled(true);
                    this.x.getSettings().setDomStorageEnabled(true);
                    this.x.getSettings().setSupportZoom(true);
                    this.x.getSettings().setBuiltInZoomControls(true);
                    this.x.getSettings().setDisplayZoomControls(false);
                    this.x.getSettings().setUseWideViewPort(true);
                    this.x.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                    this.x.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.x.setWebViewClient(new j18(this, context, (byte) 1));
                    this.R.addView(this.x, qoe.c(-2.0f, -1));
                    this.L[2] = new bba(context, (Object) null);
                    this.R.addView(this.L[2], qoe.o(-1, -2));
                    bjb bjbVar2 = new bjb(context, this.Z0);
                    this.M = bjbVar2;
                    anb.Q(bjbVar2, cmb.L0(true), anb.M(cmb.c6), anb.M(cmb.h6));
                    this.M.f(jb6.L0(2131747155), this.V0, false);
                    this.R.addView(this.M, qoe.o(-1, -2));
                    this.M.setOnClickListener(new t08(this, b5));
                    this.N[0] = new njb(context, this.Z0);
                    anb.Z(this.N[0], context, R.drawable.greydivider_bottom, cmb.a7);
                    Q0();
                    this.R.addView(this.N[0], qoe.o(-1, -2));
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
                        } catch (Exception e5) {
                            fc4.f(e5);
                        }
                    }
                    if (this.l0 && ((!TextUtils.isEmpty(this.k0) && "stripe".equals(this.D0.native_provider)) || this.N0 != null)) {
                        k0(context);
                    }
                    int i23 = 6;
                    this.f = new EditTextBoldCursor[6];
                    int i24 = 0;
                    while (i24 < i23) {
                        if (i24 == 0) {
                            this.J[0] = new jf5(context, this.Z0);
                            anb.h(cmb.c6, getResourceProvider(), this.J[0]);
                            this.J[0].setText(jb6.L0(i22));
                            this.R.addView(this.J[0], qoe.o(-1, -2));
                        } else if (i24 == 4) {
                            this.J[1] = new jf5(context, this.Z0);
                            anb.h(cmb.c6, getResourceProvider(), this.J[1]);
                            this.J[1].setText(jb6.L0(2131747161));
                            this.R.addView(this.J[1], qoe.o(-1, -2));
                        }
                        boolean z6 = (i24 == i21 || i24 == 5 || (i24 == 4 && !this.i0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i25 = cmb.c6;
                        anb.h(i25, getResourceProvider(), frameLayout3);
                        this.R.addView(frameLayout3, qoe.o(-1, 50));
                        this.f[i24] = new EditTextBoldCursor(context);
                        this.f[i24].setTag(Integer.valueOf(i24));
                        this.f[i24].setTextSize(1, 16.0f);
                        anb.D(this.f[i24], cmb.G6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor4 = this.f[i24];
                        int i26 = cmb.F6;
                        anb.X(editTextBoldCursor4, i26, getResourceProvider());
                        this.f[i24].setBackgroundDrawable(null);
                        anb.v(this.f[i24], i26, getResourceProvider());
                        this.f[i24].setCursorSize(gm.L(20.0f));
                        this.f[i24].setCursorWidth(1.5f);
                        if (i24 == 3) {
                            this.f[i24].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i24].setInputType(nm7.N1);
                            this.f[i24].setTypeface(Typeface.DEFAULT);
                            this.f[i24].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i24 == 0) {
                            this.f[i24].setInputType(3);
                        } else if (i24 == 4) {
                            final byte b11 = 1;
                            this.f[i24].setOnTouchListener(new View.OnTouchListener(this) { // from class: u08
                                public final /* synthetic */ p b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    byte b72 = b11;
                                    p pVar = this.b;
                                    switch (b72) {
                                        case 0:
                                            if (pVar.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    az2 az2Var = new az2(null, false);
                                                    az2Var.n = true;
                                                    az2Var.r = new y08(pVar, (byte) 4);
                                                    pVar.presentFragment(az2Var);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                            break;
                                        default:
                                            if (pVar.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    az2 az2Var2 = new az2(null, false);
                                                    az2Var2.n = true;
                                                    az2Var2.r = new y08(pVar, (byte) 2);
                                                    pVar.presentFragment(az2Var2);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            this.f[i24].setInputType(0);
                        } else {
                            EditTextBoldCursor[] editTextBoldCursorArr5 = this.f;
                            if (i24 == 1) {
                                editTextBoldCursorArr5[i24].setInputType(16386);
                            } else if (i24 == 2) {
                                editTextBoldCursorArr5[i24].setInputType(4097);
                            } else {
                                editTextBoldCursorArr5[i24].setInputType(16385);
                            }
                        }
                        this.f[i24].setImeOptions(268435461);
                        if (i24 == 0) {
                            this.f[i24].setHint(jb6.L0(2131747156));
                        } else if (i24 == 1) {
                            this.f[i24].setHint(jb6.L0(2131747159));
                        } else if (i24 == 2) {
                            this.f[i24].setHint(jb6.L0(2131747157));
                        } else if (i24 == 3) {
                            this.f[i24].setHint(jb6.L0(2131747160));
                        } else if (i24 == 4) {
                            this.f[i24].setHint(jb6.L0(2131747110));
                        } else if (i24 == 5) {
                            this.f[i24].setHint(jb6.L0(2131747100));
                        }
                        if (i24 == 0) {
                            this.f[i24].addTextChangedListener(new r18(this));
                        } else if (i24 == 1) {
                            this.f[i24].addTextChangedListener(new s18(this));
                        }
                        this.f[i24].setPadding(0, 0, 0, gm.L(6.0f));
                        this.f[i24].setGravity(jb6.a0 ? 5 : 3);
                        frameLayout3.addView(this.f[i24], qoe.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final byte b12 = 3;
                        this.f[i24].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: w08
                            public final /* synthetic */ p b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i162, KeyEvent keyEvent) {
                                byte b82 = b12;
                                p pVar = this.b;
                                switch (b82) {
                                    case 0:
                                        if (i162 == 6) {
                                            pVar.G0(false);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (i162 != 6) {
                                            if (i162 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        pVar.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    pVar.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (i162 == 5) {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr42 = pVar.f;
                                                if (intValue2 < editTextBoldCursorArr42.length) {
                                                    if (intValue2 != 4 && ((View) editTextBoldCursorArr42[intValue2].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue2].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i162 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    case 3:
                                        if (i162 == 5) {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                int i172 = intValue3 + 1;
                                                EditTextBoldCursor[] editTextBoldCursorArr52 = pVar.f;
                                                if (i172 < editTextBoldCursorArr52.length) {
                                                    intValue3 = i172 == 4 ? intValue3 + 2 : i172;
                                                    if (((View) editTextBoldCursorArr52[intValue3].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue3].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i162 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    default:
                                        if (i162 == 6) {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                        if (i24 == 3) {
                            this.L[0] = new bba(context, (Object) null);
                            i2 = i22;
                            this.R.addView(this.L[0], qoe.o(-1, -2));
                        } else {
                            i2 = i22;
                            if (i24 == 5) {
                                this.L[2] = new bba(context, (Object) null);
                                this.R.addView(this.L[2], qoe.o(-1, -2));
                                bjb bjbVar3 = new bjb(context, this.Z0);
                                this.M = bjbVar3;
                                anb.Q(bjbVar3, cmb.L0(true), anb.M(i25), anb.M(cmb.h6));
                                this.M.f(jb6.L0(2131747155), this.V0, false);
                                this.R.addView(this.M, qoe.o(-1, -2));
                                this.M.setOnClickListener(new t08(this, (byte) 10));
                                this.N[0] = new njb(context, this.Z0);
                                anb.Z(this.N[0], context, R.drawable.greydivider_bottom, cmb.a7);
                                Q0();
                                this.R.addView(this.N[0], qoe.o(-1, -2));
                            } else if (i24 == 0) {
                                b0(context);
                                frameLayout3.addView(this.P, qoe.d(-2, -2.0f, (jb6.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                            }
                        }
                        if (z6) {
                            o72 o72Var2 = new o72(context, b10);
                            anb.h(i25, getResourceProvider(), o72Var2);
                            this.K.add(o72Var2);
                            frameLayout3.addView(o72Var2, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if ((i24 == 4 && !this.h0) || ((i24 == 5 && !this.i0) || (i24 == 2 && !this.j0))) {
                            frameLayout3.setVisibility(8);
                        }
                        i24++;
                        i22 = i2;
                        i23 = 6;
                        i21 = 3;
                    }
                    if (!this.h0 && !this.i0) {
                        this.J[1].setVisibility(8);
                        this.L[0].setVisibility(8);
                    }
                    boolean z7 = this.i0;
                    EditTextBoldCursor[] editTextBoldCursorArr6 = this.f;
                    if (z7) {
                        editTextBoldCursorArr6[5].setImeOptions(268435462);
                    } else {
                        editTextBoldCursorArr6[3].setImeOptions(268435462);
                    }
                }
            } else if (b3 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.F0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new w09[size];
                int i27 = 0;
                while (i27 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.F0.shipping_options.get(i27);
                    this.h[i27] = new w09(context);
                    this.h[i27].setTag(Integer.valueOf(i27));
                    anb.Q(this.h[i27], cmb.L0(true), anb.M(cmb.c6), anb.M(cmb.h6));
                    this.h[i27].c(kt6.o(h0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i27 == 0, i27 != size + (-1));
                    this.h[i27].setOnClickListener(new t08(this, (byte) 11));
                    this.R.addView(this.h[i27]);
                    i27++;
                }
                this.N[0] = new njb(context, this.Z0);
                anb.Z(this.N[0], context, R.drawable.greydivider_bottom, cmb.a7);
                this.R.addView(this.N[0], qoe.o(-1, -2));
            } else {
                byte b13 = 13;
                byte b14 = 14;
                if (b3 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i28 = 0;
                    for (int i29 = 2; i28 < i29; i29 = 2) {
                        if (i28 == 0) {
                            z = false;
                            this.J[0] = new jf5(context, this.Z0);
                            anb.h(cmb.c6, getResourceProvider(), this.J[0]);
                            this.J[0].setText(jb6.L0(2131747152));
                            this.R.addView(this.J[0], qoe.o(-1, -2));
                        } else {
                            z = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z);
                        this.R.addView(frameLayout4, qoe.o(-1, 50));
                        int i30 = cmb.c6;
                        anb.h(i30, getResourceProvider(), frameLayout4);
                        boolean z8 = i28 != 1;
                        if (z8) {
                            if (i28 != 7 || this.D0.invoice.phone_requested) {
                                if (i28 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.D0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z8 = false;
                        }
                        if (z8) {
                            o72 o72Var3 = new o72(context, b14);
                            anb.h(i30, getResourceProvider(), o72Var3);
                            this.K.add(o72Var3);
                            frameLayout4.addView(o72Var3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i28] = new EditTextBoldCursor(context);
                        this.f[i28].setTag(Integer.valueOf(i28));
                        this.f[i28].setTextSize(1, 16.0f);
                        anb.D(this.f[i28], cmb.G6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i28];
                        int i31 = cmb.F6;
                        anb.X(editTextBoldCursor5, i31, getResourceProvider());
                        this.f[i28].setBackgroundDrawable(null);
                        anb.v(this.f[i28], i31, getResourceProvider());
                        this.f[i28].setCursorSize(gm.L(20.0f));
                        this.f[i28].setCursorWidth(1.5f);
                        EditTextBoldCursor[] editTextBoldCursorArr7 = this.f;
                        if (i28 == 0) {
                            editTextBoldCursorArr7[i28].setOnTouchListener(new w02((byte) 16));
                            this.f[i28].setInputType(0);
                        } else {
                            editTextBoldCursorArr7[i28].setInputType(nm7.M1);
                            this.f[i28].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i28].setImeOptions(268435462);
                        if (i28 == 0) {
                            EditTextBoldCursor editTextBoldCursor6 = this.f[i28];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.z0;
                            editTextBoldCursor6.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i28 == 1) {
                            this.f[i28].setHint(jb6.L0(2131748483));
                            this.f[i28].requestFocus();
                        }
                        this.f[i28].setPadding(0, 0, 0, gm.L(6.0f));
                        this.f[i28].setGravity(jb6.a0 ? 5 : 3);
                        frameLayout4.addView(this.f[i28], qoe.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final byte b15 = 4;
                        this.f[i28].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: w08
                            public final /* synthetic */ p b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i162, KeyEvent keyEvent) {
                                byte b82 = b15;
                                p pVar = this.b;
                                switch (b82) {
                                    case 0:
                                        if (i162 == 6) {
                                            pVar.G0(false);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (i162 != 6) {
                                            if (i162 == 5) {
                                                int intValue = ((Integer) textView2.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        pVar.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    pVar.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (i162 == 5) {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr42 = pVar.f;
                                                if (intValue2 < editTextBoldCursorArr42.length) {
                                                    if (intValue2 != 4 && ((View) editTextBoldCursorArr42[intValue2].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue2].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i162 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    case 3:
                                        if (i162 == 5) {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                int i172 = intValue3 + 1;
                                                EditTextBoldCursor[] editTextBoldCursorArr52 = pVar.f;
                                                if (i172 < editTextBoldCursorArr52.length) {
                                                    intValue3 = i172 == 4 ? intValue3 + 2 : i172;
                                                    if (((View) editTextBoldCursorArr52[intValue3].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue3].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i162 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    default:
                                        if (i162 == 6) {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                        if (i28 == 1) {
                            this.N[0] = new njb(context, this.Z0);
                            njb njbVar2 = this.N[0];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.z0;
                            njbVar2.setText(jb6.Y(2131747139, "PaymentConfirmationMessage", tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            njb njbVar3 = this.N[0];
                            int i32 = cmb.a7;
                            anb.Z(njbVar3, context, R.drawable.greydivider, i32);
                            this.R.addView(this.N[0], qoe.o(-1, -2));
                            this.O[0] = new vkb(context, this.Z0);
                            anb.Q(this.O[0], cmb.L0(true), anb.M(i30), anb.M(cmb.h6));
                            this.O[0].b(jb6.L0(2131747138), false);
                            this.R.addView(this.O[0], qoe.o(-1, -2));
                            this.O[0].setOnClickListener(new t08(this, b13));
                            this.N[1] = new njb(context, this.Z0);
                            anb.Z(this.N[1], context, R.drawable.greydivider_bottom, i32);
                            this.R.addView(this.N[1], qoe.o(-1, -2));
                        }
                        i28++;
                    }
                } else if (b3 == 4 || b3 == 5) {
                    x18 x18Var = new x18(context);
                    this.Y = x18Var;
                    anb.h(cmb.c6, getResourceProvider(), x18Var);
                    k47 k47Var = this.O0;
                    if (k47Var != null) {
                        this.Y.b((TLRPC.TL_messageMediaInvoice) k47Var.k.media, this.q0);
                    } else {
                        TLRPC.PaymentReceipt paymentReceipt = this.E0;
                        if (paymentReceipt != null) {
                            this.Y.c(paymentReceipt, this.q0);
                        } else if (this.P0 != null || this.c1 != null) {
                            x18 x18Var2 = this.Y;
                            TLRPC.PaymentForm paymentForm3 = this.D0;
                            x18Var2.a(paymentForm3.title, paymentForm3.description, paymentForm3.photo, this.q0, paymentForm3);
                        }
                    }
                    this.R.addView(this.Y, qoe.o(-1, -2));
                    this.L[0] = new bba(context, (Object) null);
                    this.R.addView(this.L[0], qoe.o(-1, -2));
                    ArrayList arrayList2 = new ArrayList(this.D0.invoice.prices);
                    this.u0 = arrayList2;
                    TLRPC.TL_shippingOption tL_shippingOption2 = this.H0;
                    if (tL_shippingOption2 != null) {
                        arrayList2.addAll(tL_shippingOption2.prices);
                    }
                    this.S0 = new String[1];
                    for (int i33 = 0; i33 < this.u0.size(); i33++) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.u0.get(i33);
                        zjb zjbVar = new zjb(context);
                        anb.h(cmb.c6, getResourceProvider(), zjbVar);
                        zjbVar.a(tL_labeledPrice.label, jb6.D0().p(tL_labeledPrice.amount, this.D0.invoice.currency), false);
                        this.R.addView(zjbVar);
                    }
                    if (this.v0 == 5 && this.I0 != null) {
                        zjb zjbVar2 = new zjb(context);
                        anb.h(cmb.c6, getResourceProvider(), zjbVar2);
                        zjbVar2.a(jb6.L0(2131747090), jb6.D0().p(this.I0.longValue(), this.D0.invoice.currency), false);
                        this.R.addView(zjbVar2);
                    }
                    zjb zjbVar3 = new zjb(context);
                    this.S = zjbVar3;
                    int i34 = cmb.c6;
                    anb.h(i34, getResourceProvider(), zjbVar3);
                    this.S0[0] = h0(this.u0);
                    this.S.a(jb6.L0(2131747086), this.S0[0], true);
                    float f = 14.0f;
                    if (this.v0 != 4 || (this.D0.invoice.flags & 256) == 0) {
                        r15 = 0;
                    } else {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        frameLayout5.setClipChildren(false);
                        anb.h(i34, getResourceProvider(), frameLayout5);
                        this.R.addView(frameLayout5, qoe.o(-1, this.D0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                        frameLayout5.setOnClickListener(new t08(this, b14));
                        zjb zjbVar4 = new zjb(context);
                        anb.h(i34, getResourceProvider(), zjbVar4);
                        zjbVar4.a(jb6.L0(2131747089), "", false);
                        frameLayout5.addView(zjbVar4);
                        this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                        this.f[0].setTag(0);
                        this.f[0].setTextSize(1, 16.0f);
                        EditTextBoldCursor editTextBoldCursor7 = this.f[0];
                        int i35 = cmb.y6;
                        anb.D(editTextBoldCursor7, i35, getResourceProvider());
                        anb.X(this.f[0], i35, getResourceProvider());
                        Object obj = null;
                        this.f[0].setBackgroundDrawable(null);
                        anb.v(this.f[0], cmb.F6, getResourceProvider());
                        this.f[0].setCursorSize(gm.L(20.0f));
                        this.f[0].setCursorWidth(1.5f);
                        this.f[0].setInputType(3);
                        this.f[0].setImeOptions(268435462);
                        this.f[0].setHint(jb6.D0().p(0L, this.D0.invoice.currency));
                        this.f[0].setPadding(0, 0, 0, gm.L(6.0f));
                        this.f[0].setGravity(jb6.a0 ? 3 : 5);
                        frameLayout5.addView(this.f[0], qoe.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                        this.f[0].addTextChangedListener(new b18(this));
                        this.f[0].setOnEditorActionListener(new nh((byte) 4));
                        this.f[0].requestFocus();
                        if (!this.D0.invoice.suggested_tip_amounts.isEmpty()) {
                            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                            horizontalScrollView.setHorizontalScrollBarEnabled(false);
                            horizontalScrollView.setVerticalScrollBarEnabled(false);
                            horizontalScrollView.setClipToPadding(false);
                            horizontalScrollView.setPadding(gm.L(21.0f), 0, gm.L(21.0f), 0);
                            horizontalScrollView.setFillViewport(true);
                            frameLayout5.addView(horizontalScrollView, qoe.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int size2 = this.D0.invoice.suggested_tip_amounts.size();
                            c18 c18Var = new c18(context, size2, iArr, iArr2);
                            this.t0 = c18Var;
                            c18Var.setOrientation(0);
                            horizontalScrollView.addView(this.t0, qoe.x(-1, 30, 51));
                            int themedColor = getThemedColor(cmb.Ui);
                            int i36 = 0;
                            while (i36 < size2) {
                                boolean z9 = jb6.a0;
                                TLRPC.PaymentForm paymentForm4 = this.D0;
                                long longValue = z9 ? paymentForm4.invoice.suggested_tip_amounts.get((size2 - i36) - 1).longValue() : paymentForm4.invoice.suggested_tip_amounts.get(i36).longValue();
                                String p = jb6.D0().p(longValue, this.D0.invoice.currency);
                                TextView textView2 = new TextView(context);
                                textView2.setTextSize(1, f);
                                textView2.setTypeface(gm.o());
                                textView2.setLines(1);
                                textView2.setTag(Long.valueOf(longValue));
                                textView2.setMaxLines(1);
                                textView2.setText(p);
                                textView2.setPadding(gm.L(15.0f), 0, gm.L(15.0f), 0);
                                anb.X(textView2, cmb.Y8, getResourceProvider());
                                textView2.setBackground(cmb.b0(gm.L(15.0f), 536870911 & themedColor));
                                textView2.setSingleLine(true);
                                textView2.setGravity(17);
                                this.t0.addView(textView2, qoe.t(-2, -1, 19, 0, 0, i36 != size2 + (-1) ? 9 : 0, 0));
                                textView2.setOnClickListener(new fh(this, textView2, longValue, (byte) 5));
                                int L = gm.L(30.0f) + ((int) Math.ceil(textView2.getPaint().measureText(p)));
                                textView2.setTag(R.id.width_tag, Integer.valueOf(L));
                                iArr[0] = Math.max(iArr[0], L);
                                iArr2[0] = iArr2[0] + L;
                                i36++;
                                obj = null;
                                f = 14.0f;
                            }
                        }
                        r15 = obj;
                    }
                    this.R.addView(this.S);
                    this.L[2] = new bba(context, (Object) r15);
                    anb.Z(this.L[2], context, R.drawable.greydivider_bottom, cmb.a7);
                    this.R.addView(this.L[2], qoe.o(-1, -2));
                    this.Z[0] = new d18(context);
                    anb.Q(this.Z[0], cmb.L0(true), anb.M(cmb.c6), anb.M(cmb.h6));
                    ijb ijbVar = this.Z[0];
                    String str8 = this.y0;
                    ijbVar.b(R.drawable.msg_payment_card, (str8 == null || str8.length() <= 1) ? this.y0 : this.y0.substring(0, 1).toUpperCase() + this.y0.substring(1), jb6.L0(2131747147), true);
                    if (this.W0 || this.X0) {
                        String str9 = this.y0;
                        i = (str9 == null || str9.length() <= 1) ? 8 : 0;
                    } else {
                        i = 0;
                    }
                    byte b16 = 0;
                    this.Z[0].setVisibility(i);
                    this.R.addView(this.Z[0]);
                    if (this.v0 == 4) {
                        this.Z[0].setOnClickListener(new t08(this, b16));
                    }
                    TLRPC.User user3 = r15;
                    for (int i37 = 0; i37 < this.D0.users.size(); i37++) {
                        TLRPC.User user4 = this.D0.users.get(i37);
                        if (user4.id == this.D0.provider_id) {
                            user3 = user4;
                        }
                    }
                    char c2 = 1;
                    this.Z[1] = new ijb(context);
                    ijb ijbVar2 = this.Z[1];
                    fg0 L0 = cmb.L0(true);
                    int i38 = cmb.c6;
                    wmb M = anb.M(i38);
                    int i39 = cmb.h6;
                    anb.Q(ijbVar2, L0, M, anb.M(i39));
                    if (user3 != null) {
                        ijb ijbVar3 = this.Z[1];
                        str5 = bw2.n(user3.first_name, user3.last_name);
                        String L02 = jb6.L0(2131747142);
                        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.J0;
                        ijbVar3.b(R.drawable.msg_payment_provider, str5, L02, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.H0 == null)) && ((tL_paymentRequestedInfo2 = this.D0.saved_info) == null || tL_paymentRequestedInfo2.shipping_address == null)) ? false : true);
                        c2 = 1;
                        this.R.addView(this.Z[1]);
                    }
                    this.Z[c2].setVisibility(user3 != null ? i : 8);
                    TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.J0;
                    if (tL_payments_validateRequestedInfo2 == null) {
                        if (this.W0) {
                            TLRPC.PaymentForm paymentForm5 = this.D0;
                            if (paymentForm5 != null) {
                                tL_paymentRequestedInfo = paymentForm5.saved_info;
                            }
                        }
                        if (this.v0 == 4) {
                            this.G = !this.W0;
                            if (this.c1 instanceof TLRPC.TL_inputInvoiceStars) {
                                this.G = true;
                            }
                            this.X = new t18(this, context);
                            View view = new View(context);
                            anb.R(view, cmb.f0(getThemedColor(i39), 2, -1), r15, anb.M(i39), this.Z0);
                            this.X.addView(view, qoe.c(-1.0f, -1));
                            frameLayout2.addView(this.X, qoe.e(-1, 48, 80));
                            this.X.setOnClickListener(new n06(this, str5, (byte) 13));
                            TextView textView3 = new TextView(context);
                            this.V = textView3;
                            int i40 = cmb.Vi;
                            anb.X(textView3, i40, getResourceProvider());
                            this.V.setText(jb6.Z(2131747144, this.S0[0]));
                            this.V.setTextSize(1, 14.0f);
                            this.V.setGravity(17);
                            this.V.setTypeface(gm.o());
                            this.X.addView(this.V, qoe.c(-1.0f, -1));
                            mx2 mx2Var2 = new mx2(context, 0);
                            this.s = mx2Var2;
                            mx2Var2.setVisibility(4);
                            int themedColor2 = getThemedColor(i40);
                            this.s.a(805306367 & themedColor2, themedColor2);
                            this.X.addView(this.s, qoe.c(-1.0f, -1));
                            this.X.a(this.G, false);
                            this.V.setAlpha(!this.G ? 0.8f : 1.0f);
                            this.n.setEnabled(false);
                            this.n.getContentView().setVisibility(4);
                            gm.u(context, true);
                            try {
                                i18 i18Var = new i18(context);
                                this.x = i18Var;
                                i18Var.setBackgroundColor(-1);
                                this.x.getSettings().setJavaScriptEnabled(true);
                                this.x.getSettings().setDomStorageEnabled(true);
                                this.x.getSettings().setSupportZoom(true);
                                this.x.getSettings().setBuiltInZoomControls(true);
                                this.x.getSettings().setDisplayZoomControls(false);
                                this.x.getSettings().setUseWideViewPort(true);
                                this.x.getSettings().setMixedContentMode(0);
                                CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                                this.x.setWebViewClient(new j18(this, context, (byte) 0));
                            } catch (Exception e6) {
                                fc4.f(e6);
                            }
                            this.W = r15;
                            if (this.D0.invoice.terms_url != null) {
                                p49 p49Var = new p49(context, getResourceProvider());
                                this.W = p49Var;
                                p49Var.setChecked(this.G);
                                if (TextUtils.isEmpty(this.q0)) {
                                    String L03 = jb6.L0(2131747149);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L03);
                                    int indexOf = L03.indexOf(42);
                                    int lastIndexOf = L03.lastIndexOf(42);
                                    spannableStringBuilder = spannableStringBuilder2;
                                    spannableStringBuilder = spannableStringBuilder2;
                                    if (indexOf != -1 && lastIndexOf != -1) {
                                        SpannableString spannableString = new SpannableString(L03.substring(indexOf + 1, lastIndexOf));
                                        spannableString.setSpan(new g6c(this.D0.invoice.terms_url), 0, spannableString.length(), 33);
                                        int i41 = lastIndexOf + 1;
                                        spannableStringBuilder2.replace(indexOf, i41, (CharSequence) spannableString);
                                        L03.substring(0, indexOf);
                                        spannableString.toString();
                                        L03.substring(i41);
                                        spannableStringBuilder = spannableStringBuilder2;
                                    }
                                } else {
                                    String L04 = jb6.L0(2131747150);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L04);
                                    int indexOf2 = L04.indexOf(42);
                                    int lastIndexOf2 = L04.lastIndexOf(42);
                                    if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                        SpannableString spannableString2 = new SpannableString(L04.substring(indexOf2 + 1, lastIndexOf2));
                                        spannableString2.setSpan(new g6c(this.D0.invoice.terms_url), 0, spannableString2.length(), 33);
                                        int i42 = lastIndexOf2 + 1;
                                        spannableStringBuilder3.replace(indexOf2, i42, (CharSequence) spannableString2);
                                        L04 = L04.substring(0, indexOf2) + ((Object) spannableString2) + L04.substring(i42);
                                    }
                                    int indexOf3 = L04.indexOf("%1$s");
                                    spannableStringBuilder = spannableStringBuilder3;
                                    if (indexOf3 != -1) {
                                        spannableStringBuilder3.replace(indexOf3, indexOf3 + 4, (CharSequence) this.q0);
                                        spannableStringBuilder3.setSpan(new z5c(gm.o()), indexOf3, this.q0.length() + indexOf3, 33);
                                        spannableStringBuilder = spannableStringBuilder3;
                                    }
                                }
                                this.W.setText(spannableStringBuilder);
                                p49 p49Var2 = this.W;
                                int i43 = cmb.c6;
                                int themedColor3 = getThemedColor(i43);
                                int i44 = cmb.h6;
                                anb.R(p49Var2, cmb.g0(themedColor3, getThemedColor(i44)), anb.M(i43), anb.M(i44), getResourceProvider());
                                this.W.setOnClickListener(new t08(this, (byte) 5));
                                frameLayout2.addView(this.W, qoe.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                            }
                            WebView webView = this.x;
                            if (webView != null) {
                                frameLayout2.addView(webView, qoe.c(-1.0f, -1));
                                this.x.setVisibility(8);
                            }
                        }
                        this.L[1] = new bba(context, (Object) r15);
                        anb.Z(this.L[1], context, R.drawable.greydivider_bottom, cmb.a7);
                        if (i == 0 && this.v0 == 4 && this.J0 == null && ((paymentForm = this.D0) == null || paymentForm.saved_info == null)) {
                            c = 1;
                            this.L[1].setVisibility(i);
                        } else {
                            c = 1;
                        }
                        this.R.addView(this.L[c], qoe.o(-1, -2));
                    } else {
                        tL_paymentRequestedInfo = tL_payments_validateRequestedInfo2.info;
                    }
                    this.Z[2] = new ijb(context);
                    this.Z[2].setVisibility(8);
                    this.R.addView(this.Z[2]);
                    if (tL_paymentRequestedInfo.shipping_address != null) {
                        this.Z[2].setVisibility(0);
                        byte b17 = this.v0;
                        ijb[] ijbVarArr = this.Z;
                        if (b17 == 4) {
                            anb.Q(ijbVarArr[2], cmb.L0(true), anb.M(i38), anb.M(i39));
                            this.Z[2].setOnClickListener(new t08(this, (byte) 1));
                        } else {
                            anb.h(i38, getResourceProvider(), ijbVarArr[2]);
                        }
                    }
                    this.Z[3] = new ijb(context);
                    this.Z[3].setVisibility(8);
                    this.R.addView(this.Z[3]);
                    if (tL_paymentRequestedInfo.name != null) {
                        this.Z[3].setVisibility(0);
                        byte b18 = this.v0;
                        ijb[] ijbVarArr2 = this.Z;
                        if (b18 == 4) {
                            anb.Q(ijbVarArr2[3], cmb.L0(true), anb.M(i38), anb.M(i39));
                            this.Z[3].setOnClickListener(new t08(this, (byte) 2));
                        } else {
                            anb.h(i38, getResourceProvider(), ijbVarArr2[3]);
                        }
                    }
                    this.Z[4] = new ijb(context);
                    this.Z[4].setVisibility(8);
                    this.R.addView(this.Z[4]);
                    if (tL_paymentRequestedInfo.phone != null) {
                        this.Z[4].setVisibility(0);
                        byte b19 = this.v0;
                        ijb[] ijbVarArr3 = this.Z;
                        if (b19 == 4) {
                            anb.Q(ijbVarArr3[4], cmb.L0(true), anb.M(i38), anb.M(i39));
                            this.Z[4].setOnClickListener(new t08(this, (byte) 3));
                        } else {
                            anb.h(i38, getResourceProvider(), ijbVarArr3[4]);
                        }
                    }
                    this.Z[5] = new ijb(context);
                    this.Z[5].setVisibility(8);
                    this.R.addView(this.Z[5]);
                    if (tL_paymentRequestedInfo.email != null) {
                        this.Z[5].setVisibility(0);
                        byte b20 = this.v0;
                        ijb[] ijbVarArr4 = this.Z;
                        byte b21 = 4;
                        if (b20 == 4) {
                            anb.Q(ijbVarArr4[5], cmb.L0(true), anb.M(i38), anb.M(i39));
                            this.Z[5].setOnClickListener(new t08(this, b21));
                        } else {
                            anb.h(i38, getResourceProvider(), ijbVarArr4[5]);
                        }
                    }
                    if (this.H0 != null) {
                        this.Z[6] = new ijb(context);
                        anb.h(i38, getResourceProvider(), this.Z[6]);
                        this.Z[6].b(R.drawable.msg_payment_delivery, this.H0.title, jb6.L0(2131747141), false);
                        this.R.addView(this.Z[6]);
                    }
                    H0(tL_paymentRequestedInfo);
                    if (this.v0 == 4) {
                    }
                    this.L[1] = new bba(context, (Object) r15);
                    anb.Z(this.L[1], context, R.drawable.greydivider_bottom, cmb.a7);
                    if (i == 0) {
                    }
                    c = 1;
                    this.R.addView(this.L[c], qoe.o(-1, -2));
                } else if (b3 == 6) {
                    ev3 ev3Var = new ev3(context);
                    this.T = ev3Var;
                    ev3Var.a(jb6.L0(2131747180));
                    ev3 ev3Var2 = this.T;
                    int i45 = cmb.c6;
                    anb.h(i45, getResourceProvider(), ev3Var2);
                    EditTextBoldCursor textView4 = this.T.getTextView();
                    textView4.setInputType(3);
                    textView4.setImeOptions(6);
                    final byte b22 = 0;
                    textView4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: w08
                        public final /* synthetic */ p b;

                        {
                            this.b = this;
                        }

                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView22, int i162, KeyEvent keyEvent) {
                            byte b82 = b22;
                            p pVar = this.b;
                            switch (b82) {
                                case 0:
                                    if (i162 == 6) {
                                        pVar.G0(false);
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (i162 != 6) {
                                        if (i162 == 5) {
                                            int intValue = ((Integer) textView22.getTag()).intValue();
                                            if (intValue != 0) {
                                                if (intValue == 1) {
                                                    pVar.f[2].requestFocus();
                                                    break;
                                                }
                                            } else {
                                                pVar.f[1].requestFocus();
                                                break;
                                            }
                                        }
                                    } else {
                                        pVar.n.performClick();
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (i162 == 5) {
                                        int intValue2 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            intValue2++;
                                            EditTextBoldCursor[] editTextBoldCursorArr42 = pVar.f;
                                            if (intValue2 < editTextBoldCursorArr42.length) {
                                                if (intValue2 != 4 && ((View) editTextBoldCursorArr42[intValue2].getParent()).getVisibility() == 0) {
                                                    pVar.f[intValue2].requestFocus();
                                                }
                                            }
                                        }
                                    } else if (i162 == 6) {
                                        pVar.n.performClick();
                                    }
                                    break;
                                case 3:
                                    if (i162 == 5) {
                                        int intValue3 = ((Integer) textView22.getTag()).intValue();
                                        while (true) {
                                            int i172 = intValue3 + 1;
                                            EditTextBoldCursor[] editTextBoldCursorArr52 = pVar.f;
                                            if (i172 < editTextBoldCursorArr52.length) {
                                                intValue3 = i172 == 4 ? intValue3 + 2 : i172;
                                                if (((View) editTextBoldCursorArr52[intValue3].getParent()).getVisibility() == 0) {
                                                    pVar.f[intValue3].requestFocus();
                                                }
                                            }
                                        }
                                    } else if (i162 == 6) {
                                        pVar.n.performClick();
                                    }
                                    break;
                                default:
                                    if (i162 == 6) {
                                        pVar.n.performClick();
                                        break;
                                    }
                                    break;
                            }
                            return true;
                        }
                    });
                    textView4.addTextChangedListener(new l18(this, b22));
                    this.R.addView(this.T, qoe.o(-1, -2));
                    this.N[2] = new njb(context, this.Z0);
                    anb.Z(this.N[2], context, R.drawable.greydivider, cmb.a7);
                    this.R.addView(this.N[2], qoe.o(-1, -2));
                    this.O[1] = new vkb(context, this.Z0);
                    vkb vkbVar = this.O[1];
                    fg0 L05 = cmb.L0(true);
                    wmb M2 = anb.M(i45);
                    int i46 = cmb.h6;
                    anb.Q(vkbVar, L05, M2, anb.M(i46));
                    vkb vkbVar2 = this.O[1];
                    int i47 = cmb.F6;
                    vkbVar2.setTag(Integer.valueOf(i47));
                    anb.X(this.O[1].getTextView(), i47, getResourceProvider());
                    this.O[1].b(jb6.L0(2131745854), true);
                    this.R.addView(this.O[1], qoe.o(-1, -2));
                    this.O[1].setOnClickListener(new t08(this, (byte) 6));
                    this.O[0] = new vkb(context, this.Z0);
                    anb.Q(this.O[0], cmb.L0(true), anb.M(i45), anb.M(i46));
                    vkb vkbVar3 = this.O[0];
                    int i48 = cmb.o7;
                    vkbVar3.setTag(Integer.valueOf(i48));
                    anb.X(this.O[0].getTextView(), i48, getResourceProvider());
                    this.O[0].b(jb6.L0(2131754948), false);
                    this.R.addView(this.O[0], qoe.o(-1, -2));
                    this.O[0].setOnClickListener(new t08(this, (byte) 7));
                    this.f = new EditTextBoldCursor[3];
                    int i49 = 0;
                    for (int i50 = 3; i49 < i50; i50 = 3) {
                        if (i49 == 0) {
                            this.J[0] = new jf5(context, this.Z0);
                            anb.h(cmb.c6, getResourceProvider(), this.J[0]);
                            this.J[0].setText(jb6.L0(2131747119));
                            this.R.addView(this.J[0], qoe.o(-1, -2));
                        } else if (i49 == 2) {
                            this.J[1] = new jf5(context, this.Z0);
                            anb.h(cmb.c6, getResourceProvider(), this.J[1]);
                            this.J[1].setText(jb6.L0(2131747123));
                            this.R.addView(this.J[1], qoe.o(-1, -2));
                        }
                        FrameLayout frameLayout6 = new FrameLayout(context);
                        frameLayout6.setClipChildren(false);
                        this.R.addView(frameLayout6, qoe.o(-1, 50));
                        int i51 = cmb.c6;
                        anb.h(i51, getResourceProvider(), frameLayout6);
                        if (i49 == 0) {
                            o72 o72Var4 = new o72(context, (byte) 15);
                            anb.h(i51, getResourceProvider(), o72Var4);
                            this.K.add(o72Var4);
                            frameLayout6.addView(o72Var4, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i49] = new EditTextBoldCursor(context);
                        this.f[i49].setTag(Integer.valueOf(i49));
                        this.f[i49].setTextSize(1, 16.0f);
                        anb.D(this.f[i49], cmb.G6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor8 = this.f[i49];
                        int i52 = cmb.F6;
                        anb.X(editTextBoldCursor8, i52, getResourceProvider());
                        this.f[i49].setBackgroundDrawable(null);
                        anb.v(this.f[i49], i52, getResourceProvider());
                        this.f[i49].setCursorSize(gm.L(20.0f));
                        this.f[i49].setCursorWidth(1.5f);
                        if (i49 == 0 || i49 == 1) {
                            this.f[i49].setInputType(nm7.M1);
                            this.f[i49].setTypeface(Typeface.DEFAULT);
                            this.f[i49].setImeOptions(268435461);
                        } else {
                            this.f[i49].setInputType(33);
                            this.f[i49].setImeOptions(268435462);
                        }
                        if (i49 == 0) {
                            this.f[i49].setHint(jb6.L0(2131747122));
                            this.f[i49].requestFocus();
                        } else if (i49 == 1) {
                            this.f[i49].setHint(jb6.L0(2131747120));
                        } else if (i49 == 2) {
                            this.f[i49].setHint(jb6.L0(2131747125));
                        }
                        this.f[i49].setPadding(0, 0, 0, gm.L(6.0f));
                        this.f[i49].setGravity(jb6.a0 ? 5 : 3);
                        frameLayout6.addView(this.f[i49], qoe.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final byte b23 = 1;
                        this.f[i49].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: w08
                            public final /* synthetic */ p b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i162, KeyEvent keyEvent) {
                                byte b82 = b23;
                                p pVar = this.b;
                                switch (b82) {
                                    case 0:
                                        if (i162 == 6) {
                                            pVar.G0(false);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (i162 != 6) {
                                            if (i162 == 5) {
                                                int intValue = ((Integer) textView22.getTag()).intValue();
                                                if (intValue != 0) {
                                                    if (intValue == 1) {
                                                        pVar.f[2].requestFocus();
                                                        break;
                                                    }
                                                } else {
                                                    pVar.f[1].requestFocus();
                                                    break;
                                                }
                                            }
                                        } else {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (i162 == 5) {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr42 = pVar.f;
                                                if (intValue2 < editTextBoldCursorArr42.length) {
                                                    if (intValue2 != 4 && ((View) editTextBoldCursorArr42[intValue2].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue2].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i162 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    case 3:
                                        if (i162 == 5) {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                int i172 = intValue3 + 1;
                                                EditTextBoldCursor[] editTextBoldCursorArr52 = pVar.f;
                                                if (i172 < editTextBoldCursorArr52.length) {
                                                    intValue3 = i172 == 4 ? intValue3 + 2 : i172;
                                                    if (((View) editTextBoldCursorArr52[intValue3].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue3].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i162 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    default:
                                        if (i162 == 6) {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                        if (i49 == 1) {
                            this.N[0] = new njb(context, this.Z0);
                            this.N[0].setText(jb6.L0(2131747121));
                            anb.Z(this.N[0], context, R.drawable.greydivider, cmb.a7);
                            this.R.addView(this.N[0], qoe.o(-1, -2));
                        } else if (i49 == 2) {
                            this.N[1] = new njb(context, this.Z0);
                            this.N[1].setText(jb6.L0(2131747124));
                            anb.Z(this.N[1], context, R.drawable.greydivider_bottom, cmb.a7);
                            this.R.addView(this.N[1], qoe.o(-1, -2));
                        }
                        i49++;
                    }
                    P0();
                }
            }
        }
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.p0) {
            TLRPC.PaymentForm paymentForm = this.D0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
            return;
        }
        if (i == nm7.r0) {
            TLRPC.PaymentForm paymentForm2 = this.D0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
            return;
        }
        if (i == nm7.a1) {
            this.b1 = true;
            removeSelfFromStack();
        }
    }

    public final long e0() {
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

    public final long f0() {
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
        return pg3.m(inputPeer);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String g0(ArrayList arrayList) {
        String str;
        double d;
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        jb6.D0();
        String upperCase = this.D0.invoice.currency.toUpperCase();
        long abs = Math.abs(j);
        upperCase.getClass();
        char c = 65535;
        switch (upperCase.hashCode()) {
            case 65726:
                if (upperCase.equals("BHD")) {
                    c = 0;
                    break;
                }
                break;
            case 65759:
                if (upperCase.equals("BIF")) {
                    c = 1;
                    break;
                }
                break;
            case 66267:
                if (upperCase.equals("BYR")) {
                    c = 2;
                    break;
                }
                break;
            case 66813:
                if (upperCase.equals("CLF")) {
                    c = 3;
                    break;
                }
                break;
            case 66823:
                if (upperCase.equals("CLP")) {
                    c = 4;
                    break;
                }
                break;
            case 67122:
                if (upperCase.equals("CVE")) {
                    c = 5;
                    break;
                }
                break;
            case 67712:
                if (upperCase.equals("DJF")) {
                    c = 6;
                    break;
                }
                break;
            case 70719:
                if (upperCase.equals("GNF")) {
                    c = 7;
                    break;
                }
                break;
            case 72732:
                if (upperCase.equals("IQD")) {
                    c = '\b';
                    break;
                }
                break;
            case 72777:
                if (upperCase.equals("IRR")) {
                    c = '\t';
                    break;
                }
                break;
            case 72801:
                if (upperCase.equals("ISK")) {
                    c = '\n';
                    break;
                }
                break;
            case 73631:
                if (upperCase.equals("JOD")) {
                    c = 11;
                    break;
                }
                break;
            case 73683:
                if (upperCase.equals("JPY")) {
                    c = '\f';
                    break;
                }
                break;
            case 74532:
                if (upperCase.equals("KMF")) {
                    c = '\r';
                    break;
                }
                break;
            case 74704:
                if (upperCase.equals("KRW")) {
                    c = 14;
                    break;
                }
                break;
            case 74840:
                if (upperCase.equals("KWD")) {
                    c = 15;
                    break;
                }
                break;
            case 75863:
                if (upperCase.equals("LYD")) {
                    c = 16;
                    break;
                }
                break;
            case 76263:
                if (upperCase.equals("MGA")) {
                    c = 17;
                    break;
                }
                break;
            case 76618:
                if (upperCase.equals("MRO")) {
                    c = 18;
                    break;
                }
                break;
            case 78388:
                if (upperCase.equals("OMR")) {
                    c = 19;
                    break;
                }
                break;
            case 79710:
                if (upperCase.equals("PYG")) {
                    c = 20;
                    break;
                }
                break;
            case 81569:
                if (upperCase.equals("RWF")) {
                    c = 21;
                    break;
                }
                break;
            case 83210:
                if (upperCase.equals("TND")) {
                    c = 22;
                    break;
                }
                break;
            case 83974:
                if (upperCase.equals("UGX")) {
                    c = 23;
                    break;
                }
                break;
            case 84517:
                if (upperCase.equals("UYI")) {
                    c = 24;
                    break;
                }
                break;
            case 85132:
                if (upperCase.equals("VND")) {
                    c = 25;
                    break;
                }
                break;
            case 85367:
                if (upperCase.equals("VUV")) {
                    c = 26;
                    break;
                }
                break;
            case 86653:
                if (upperCase.equals("XAF")) {
                    c = 27;
                    break;
                }
                break;
            case 87087:
                if (upperCase.equals("XOF")) {
                    c = 28;
                    break;
                }
                break;
            case 87118:
                if (upperCase.equals("XPF")) {
                    c = 29;
                    break;
                }
                break;
        }
        str = " %.0f";
        switch (c) {
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

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.Z0;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.F, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B8));
        arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C8));
        if (this.f != null) {
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new cnb((View) editTextBoldCursorArr[i].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
                i++;
            }
        } else {
            arrayList.add(new cnb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
            arrayList.add(new cnb((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G6));
        }
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.length; i2++) {
            }
        }
        int i3 = 0;
        while (true) {
            jf5[] jf5VarArr = this.J;
            if (i3 >= jf5VarArr.length) {
                break;
            }
            arrayList.add(new cnb(jf5VarArr[i3], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
            i3++;
        }
        for (int i4 = 0; i4 < this.L.length; i4++) {
        }
        for (int i5 = 0; i5 < this.N.length; i5++) {
        }
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = this.K;
            if (i6 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new cnb((View) arrayList2.get(i6), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
            i6++;
        }
        int i7 = 1;
        arrayList.add(new cnb(this.M, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.M, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        for (int i8 = 0; i8 < this.O.length; i8++) {
        }
        arrayList.add(new cnb(this.V, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r6));
        while (true) {
            ijb[] ijbVarArr = this.Z;
            if (i7 >= ijbVarArr.length) {
                arrayList.add(new cnb(this.X, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
                arrayList.add(new cnb(this.X, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h6));
                return arrayList;
            }
            arrayList.add(new cnb(ijbVarArr[i7], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
            i7++;
        }
    }

    public final String h0(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        Long l = this.I0;
        if (l != null) {
            j += l.longValue();
        }
        return jb6.D0().p(j, this.D0.invoice.currency);
    }

    public final void i0() {
        int i;
        int i2;
        boolean z;
        byte b = this.v0;
        byte b2 = 0;
        byte b3 = 1;
        if (b == 0) {
            v18 v18Var = this.U;
            if (v18Var != null) {
                v18Var.d(this.J0);
                finishFragment();
                return;
            }
            if (this.D0.invoice.flexible) {
                i = 1;
            } else if (this.z0 == null && this.x0 == null) {
                i = 2;
            } else {
                if (z8c.h(this.currentAccount).y != null && z8c.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    z8c.h(this.currentAccount).y = null;
                    z8c.h(this.currentAccount).u(false);
                }
                i = z8c.h(this.currentAccount).y != null ? 4 : 3;
            }
            if (i == 2 && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                M0(new x08(this, b2));
                return;
            }
            p pVar = new p(this.c1, this.D0, this.O0, this.P0, i, this.F0, null, null, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            pVar.d1 = this.d1;
            pVar.e1 = this.e1;
            presentFragment(pVar, this.T0);
            return;
        }
        if (b == 1) {
            if (this.x0 == null && this.y0 == null) {
                if (this.z0 != null) {
                    if (z8c.h(this.currentAccount).y != null && z8c.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        z8c.h(this.currentAccount).y = null;
                        z8c.h(this.currentAccount).u(false);
                    }
                    if (z8c.h(this.currentAccount).y == null) {
                        i2 = 3;
                    }
                } else {
                    i2 = 2;
                }
                if (i2 != 2 && this.y0 == null && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                    M0(new x08(this, b2));
                    return;
                }
                p pVar2 = new p(this.c1, this.D0, this.O0, this.P0, i2, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                pVar2.d1 = this.d1;
                pVar2.e1 = this.e1;
                presentFragment(pVar2, this.T0);
                return;
            }
            i2 = 4;
            if (i2 != 2) {
            }
            p pVar22 = new p(this.c1, this.D0, this.O0, this.P0, i2, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            pVar22.d1 = this.d1;
            pVar22.e1 = this.e1;
            presentFragment(pVar22, this.T0);
            return;
        }
        if (b == 2) {
            TLRPC.PaymentForm paymentForm = this.D0;
            if (paymentForm.password_missing && (z = this.V0)) {
                p pVar3 = new p(this.c1, paymentForm, this.O0, this.P0, 6, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, z, this.K0, this.s0, this.X0);
                this.g0 = pVar3;
                pVar3.d1 = this.d1;
                pVar3.e1 = this.e1;
                pVar3.I0(this.b0);
                p pVar4 = this.g0;
                pVar4.U = new n18(this);
                presentFragment(pVar4, this.T0);
                return;
            }
            v18 v18Var2 = this.U;
            if (v18Var2 != null) {
                v18Var2.c(this.x0, this.y0, this.V0, this.K0, null);
                finishFragment();
                return;
            } else {
                p pVar5 = new p(this.c1, paymentForm, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
                pVar5.d1 = this.d1;
                pVar5.e1 = this.e1;
                presentFragment(pVar5, this.T0);
                return;
            }
        }
        if (b == 3) {
            p pVar6 = new p(this.c1, this.D0, this.O0, this.P0, this.w0 ? 4 : 2, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, this.X0);
            pVar6.d1 = this.d1;
            pVar6.e1 = this.e1;
            presentFragment(pVar6, true);
            return;
        }
        if (b != 4) {
            if (b == 6) {
                if (this.U.c(this.x0, this.y0, this.V0, this.K0, this.z0)) {
                    finishFragment();
                    return;
                }
                p pVar7 = new p(this.c1, this.D0, this.O0, this.P0, 4, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, this.K0, this.s0, false);
                pVar7.d1 = this.d1;
                pVar7.e1 = this.e1;
                presentFragment(pVar7, true);
                return;
            }
            return;
        }
        boolean z2 = this.W0;
        int i3 = nm7.a1;
        if (z2) {
            nm7.f(this.currentAccount).n(this, i3);
        }
        nm7.f(this.currentAccount).k(i3, new Object[0]);
        if (getMessagesController().b4 != null) {
            gm.d3(new x08(this, b3), 500L);
        } else {
            if (B0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, k47 k47Var, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.d dVar, boolean z2) {
        if (dVar != null) {
            this.currentAccount = dVar.getCurrentAccount();
        }
        this.v0 = i;
        this.s0 = dVar;
        this.x0 = str2;
        this.K0 = tL_inputPaymentCredentialsGooglePay;
        this.F0 = tL_payments_validatedRequestedInfo;
        this.D0 = paymentForm;
        this.H0 = tL_shippingOption;
        this.I0 = l;
        this.O0 = k47Var;
        this.P0 = str;
        this.c1 = inputInvoice;
        this.V0 = z;
        this.X0 = z2;
        this.T0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.D0.native_provider)) ? false : true;
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(paymentForm.bot_id));
        this.m0 = W1;
        if (W1 != null) {
            this.q0 = W1.first_name;
        } else {
            this.q0 = "";
        }
        this.r0 = paymentForm.title;
        this.J0 = tL_payments_validateRequestedInfo;
        this.U0 = true;
        if (z || this.v0 == 4) {
            this.V0 = z;
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

    public final void k0(Context context) {
        Optional empty;
        if (getParentActivity() != null) {
            d10 d10Var = new d10();
            byte b = this.D0.invoice.test ? (byte) 3 : (byte) 1;
            if (b != 2 && b != 1 && b != 3) {
                Locale locale = Locale.US;
                u36.j(hg9.j(b, "Invalid environment value "));
                return;
            }
            d10Var.a = b;
            this.e = new ua4(context, fmc.a, new emc(d10Var), b05.c);
            byte b2 = 0;
            try {
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                put.put("allowedPaymentMethods", new JSONArray().put(d0()));
                empty = Optional.of(put);
            } catch (JSONException unused) {
                empty = Optional.empty();
            }
            if (empty.isPresent()) {
                String jSONObject = ((JSONObject) empty.get()).toString();
                mt5 mt5Var = new mt5();
                ite.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
                mt5Var.f = jSONObject;
                ua4 ua4Var = this.e;
                ua4Var.getClass();
                bib b3 = cib.b();
                b3.d = (char) 23705;
                b3.a = new x59(mt5Var, (byte) 27);
                ua4Var.e(0, b3.a()).addOnCompleteListener(getParentActivity(), new y08(this, b2));
            }
        }
    }

    public final void l0(TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        N0(true, false);
        J0(false);
        if (tLObject != null) {
            this.w0 = true;
            z8c.h(this.currentAccount).y = (TL_account.tmpPassword) tLObject;
            z8c.h(this.currentAccount).u(false);
            i0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            ik.c0(this.currentAccount, tL_error, this, gettmppassword, new Object[0]);
            return;
        }
        try {
            this.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        gm.A3(3.25f, this.f[1], null);
        this.f[1].setText("");
    }

    public final /* synthetic */ void m0(TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] c = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? nq9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        jl7 jl7Var = new jl7(this, gettmppassword, (byte) 5);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            jl7Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = nq9.d(c, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, jl7Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        jl7Var.run(null, tL_error2);
    }

    public final void n0(TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            ik.c0(this.currentAccount, tL_error, this, getpassword, new Object[0]);
            N0(true, false);
            J0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.b0(password, false)) {
            ik.u0(getParentActivity(), jb6.M0(2131743507, null), true);
        } else if (password.has_password) {
            Utilities.e.c(new ud7((Object) this, (Object) password, (Object) gm.g1(str), (byte) 16));
        } else {
            this.w0 = false;
            i0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (r8.phone_requested == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d5, code lost:
    
        if (r23.K0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00df, code lost:
    
        if (r2.invoice.flexible != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(View view, String str) {
        int i;
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo;
        p49 p49Var = this.W;
        if (p49Var != null && !this.G) {
            this.a0 = -this.a0;
            gm.A3(this.a0, p49Var.getTextView(), null);
            gm.A3(this.a0, this.W.getCheckBox(), null);
            try {
                this.W.performHapticFeedback(3, 2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        boolean z = this.W0;
        byte b = 1;
        if (z && this.D0.saved_info != null && this.J0 == null) {
            J0(true);
            byte b2 = 26;
            bl7 bl7Var = new bl7(this, view, b2);
            if (this.R0) {
                return;
            }
            N0(true, true);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = new TLRPC.TL_payments_validateRequestedInfo();
            this.J0 = tL_payments_validateRequestedInfo2;
            TLRPC.InputInvoice inputInvoice = this.c1;
            if (inputInvoice != null) {
                tL_payments_validateRequestedInfo2.invoice = inputInvoice;
            } else {
                if (this.O0 != null) {
                    TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                    tL_inputInvoiceMessage.peer = getMessagesController().l1(this.O0.k.peer_id);
                    tL_inputInvoiceMessage.msg_id = this.O0.e1();
                    tL_payments_validateRequestedInfo = this.J0;
                    tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceMessage;
                } else {
                    TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                    tL_inputInvoiceSlug.slug = this.P0;
                    tL_payments_validateRequestedInfo = this.J0;
                    tL_payments_validateRequestedInfo.invoice = tL_inputInvoiceSlug;
                }
                tL_payments_validateRequestedInfo2 = tL_payments_validateRequestedInfo;
            }
            tL_payments_validateRequestedInfo2.save = true;
            tL_payments_validateRequestedInfo2.info = this.D0.saved_info;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new i65(this, bl7Var, tL_payments_validateRequestedInfo2, b2), (this.X0 ? 8 : 0) | 2);
            return;
        }
        if (z) {
            TLRPC.PaymentForm paymentForm = this.D0;
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
                        i = 0;
                        if (i != 2 && !paymentForm.additional_methods.isEmpty()) {
                            Objects.requireNonNull(view);
                            M0(new ud(view, (byte) 4));
                            return;
                        } else {
                            p pVar = new p(this.c1, this.D0, this.O0, this.P0, i, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, null, this.s0, this.X0);
                            pVar.d1 = this.d1;
                            pVar.e1 = this.e1;
                            presentFragment(pVar);
                            return;
                        }
                    }
                }
                i = (this.z0 == null && this.x0 == null && this.K0 == null) ? 2 : 1;
                if (i != 2) {
                }
                p pVar2 = new p(this.c1, this.D0, this.O0, this.P0, i, this.F0, this.H0, this.I0, this.x0, this.y0, this.J0, this.V0, null, this.s0, this.X0);
                pVar2.d1 = this.d1;
                pVar2.e1 = this.e1;
                presentFragment(pVar2);
                return;
            }
            if (this.z0 == null) {
                if (this.x0 == null) {
                }
            }
            if (this.H0 == null) {
            }
        }
        if (!this.D0.password_missing && this.z0 != null) {
            if (z8c.h(this.currentAccount).y != null && z8c.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                z8c.h(this.currentAccount).y = null;
                z8c.h(this.currentAccount).u(false);
            }
            if (z8c.h(this.currentAccount).y == null) {
                this.Y0 = true;
                p pVar3 = new p(this.c1, this.D0, this.O0, this.P0, 3, this.F0, this.H0, this.I0, null, this.y0, this.J0, this.V0, null, this.s0, this.X0);
                pVar3.d1 = this.d1;
                pVar3.e1 = this.e1;
                presentFragment(pVar3);
                this.Y0 = false;
                return;
            }
            if (this.W0) {
                this.W0 = false;
                nm7.f(this.currentAccount).n(this, nm7.a1);
            }
        }
        TLRPC.User user = this.m0;
        if (user == null || user.verified) {
            O0(this.S0[0]);
            return;
        }
        String str2 = "payment_warning_" + this.m0.id;
        SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
        if (sharedPreferences.getBoolean(str2, false)) {
            O0(this.S0[0]);
            return;
        }
        sharedPreferences.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131747085, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.a0("PaymentWarningText", null, 2131747084, this.q0, str);
        alertDialog$Builder.j(jb6.M0(2131751708, null), new y08(this, b));
        showDialog(heVar);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i == 991) {
            gm.c3(new h65((Object) this, i2, (Object) intent, (byte) 21));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        WebView webView = this.x;
        if (webView == null || !this.E) {
            return !this.Q0;
        }
        if (z) {
            webView.loadUrl(this.y);
            this.E = false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.v0 == 4 && this.Y0) {
            this.Y0 = false;
            this.X.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.p0);
        nm7.f(this.currentAccount).b(this, nm7.r0);
        if (this.v0 != 4 || this.W0) {
            nm7.f(this.currentAccount).a(this, nm7.a1);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        v18 v18Var = this.U;
        if (v18Var != null) {
            v18Var.b();
        }
        int i = 0;
        gm.u(getParentActivity(), false);
        if (!this.b1) {
            this.g1 = 2;
            if (this.a1 != null) {
                tk5 tk5Var = this.parentLayout;
                if (tk5Var != null && tk5Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i >= this.parentLayout.getFragmentStack().size()) {
                            i = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.d) this.parentLayout.getFragmentStack().get(i)) instanceof p) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    i -= indexOf;
                }
                if (i == 0) {
                    this.a1.c(this.g1);
                }
            }
        }
        nm7.f(this.currentAccount).n(this, nm7.p0);
        nm7.f(this.currentAccount).n(this, nm7.r0);
        if (this.v0 != 4 || this.W0) {
            nm7.f(this.currentAccount).n(this, nm7.a1);
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
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        try {
            byte b = this.v0;
            if ((b == 2 || b == 6) && (gda.r.length() == 0 || gda.z)) {
                getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
                gm.f2();
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        super.onFragmentDestroy();
        this.R0 = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
        try {
            byte b = this.v0;
            if ((b == 2 || b == 6) && !this.D0.invoice.test) {
                getParentActivity().getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                gm.f2();
            } else if (gda.r.length() == 0 || gda.z) {
                getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
                gm.f2();
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.F;
            if (scrollView != null) {
                gm.u3(scrollView, getThemedColor(cmb.r8));
            }
            if (this.f == null) {
                return;
            }
            getThemedColor(cmb.F6);
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                if (editTextBoldCursor != null) {
                    anb.l(editTextBoldCursor, 30, cmb.F6, this.Z0);
                }
                i++;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        WebView webView = this.x;
        byte b = this.v0;
        if (webView != null) {
            if (b != 4) {
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
        byte b2 = 3;
        if (b == 2) {
            gm.d3(new x08(this, b2), 100L);
            return;
        }
        if (b == 3) {
            this.f[1].requestFocus();
            gm.E3(this.f[1]);
            return;
        }
        if (b == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (b != 6 || this.c0) {
            return;
        }
        this.f[0].requestFocus();
        gm.E3(this.f[0]);
    }

    public final void p0() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new nf2((byte) 0), this.X0 ? (byte) 8 : (byte) 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131745853, null);
        he heVar = alertDialog$Builder.a;
        heVar.U = M0;
        heVar.S = jb6.M0(R.string.AppName, null);
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        showDialog(heVar);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean presentFragment(org.telegram.ui.ActionBar.d dVar) {
        C0(dVar);
        return super.presentFragment(dVar);
    }

    public final void q0(TLObject tLObject) {
        org.telegram.ui.ActionBar.d Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            nxa.n1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.Z0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        bh0 bh0Var = new bh0();
        bh0Var.a = true;
        p pVar = new p((TLRPC.PaymentReceipt) tLObject);
        pVar.d1 = this.d1;
        pVar.e1 = this.e1;
        Q.showAsSheet(pVar, bh0Var);
    }

    public final /* synthetic */ void r0(u31 u31Var, boolean z, TLRPC.Message[] messageArr) {
        u31Var.b();
        if (!z) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = oc7.r1(this.currentAccount).l1(messageArr[0].peer_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new s08(this, (byte) 2), 2);
            return;
        }
        org.telegram.ui.ActionBar.d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(yv1.fa(messageArr[0].id, k47.B0(messageArr[0])));
        }
    }

    public final void s0(TLObject tLObject) {
        org.telegram.ui.ActionBar.d Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            nxa.n1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.Z0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        bh0 bh0Var = new bh0();
        bh0Var.a = true;
        p pVar = new p((TLRPC.PaymentReceipt) tLObject);
        pVar.d1 = this.d1;
        pVar.e1 = this.e1;
        Q.showAsSheet(pVar, bh0Var);
    }

    public final /* synthetic */ void t0(u31 u31Var, boolean z, TLRPC.Message message) {
        u31Var.b();
        if (!z) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = oc7.r1(this.currentAccount).l1(message.peer_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new s08(this, (byte) 0), 2);
            return;
        }
        org.telegram.ui.ActionBar.d S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(yv1.fa(message.id, k47.B0(message)));
        }
    }

    public final /* synthetic */ void u0(TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        ik.c0(this.currentAccount, tL_error, this, tL_payments_sendPaymentForm, new Object[0]);
        J0(false);
        N0(false, false);
        this.b1 = true;
        this.g1 = 4;
        w18 w18Var = this.a1;
        if (w18Var != null) {
            w18Var.c(4);
        }
    }

    public final /* synthetic */ void v0(TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        this.F0 = tL_payments_validatedRequestedInfo;
        byte b = 0;
        if (this.D0.saved_info != null && !this.U0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_clearSavedInfo, new nf2(b), this.X0 ? 8 : 0);
        }
        i0();
        J0(false);
        N0(true, false);
    }

    public final /* synthetic */ void w0(TLObject tLObject, TLRPC.TL_error tL_error) {
        J0(false);
        N0(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    K0(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    K0(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    K0(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    K0(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    K0(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    K0(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    K0(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    K0(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    K0(7);
                    break;
                default:
                    ik.c0(this.currentAccount, tL_error, this, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public final void x0(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new r91((byte) 8, this, z), 8);
            return;
        }
        N0(true, false);
        if (z) {
            TL_account.Password password = this.b0;
            password.has_password = false;
            password.current_algo = null;
            this.U.a(password);
            finishFragment();
            return;
        }
        if (tL_error == null) {
            if (!(tLObject instanceof TLRPC.TL_boolTrue) || getParentActivity() == null) {
                return;
            }
            i0();
            return;
        }
        if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
            if (tL_error.text.equals("EMAIL_INVALID")) {
                L0(jb6.M0(R.string.AppName, null), jb6.M0(2131747178, null));
                return;
            } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                L0(jb6.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                L0(jb6.M0(R.string.AppName, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        this.d0 = Utilities.z(tL_error.text).intValue();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(jb6.M0(2131747564, null), new cz6((Object) this, (Object) str, (byte) 12));
        String M0 = jb6.M0(2131742484, null);
        he heVar = alertDialog$Builder.a;
        heVar.U = M0;
        heVar.S = jb6.M0(2131742485, null);
        Dialog showDialog = showDialog(heVar);
        if (showDialog != null) {
            showDialog.setCanceledOnTouchOutside(false);
            showDialog.setCancelable(false);
        }
    }

    public final /* synthetic */ void y0(boolean z, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        vj1 vj1Var = new vj1((Object) this, z, (Object) str, (byte) 10);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, vj1Var, 10);
            return;
        }
        byte[] g1 = gm.g1(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.b0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            vj1Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = nq9.b(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            vj1Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, vj1Var, 10);
    }

    public final /* synthetic */ void z0(TLObject tLObject, TLRPC.TL_error tL_error) {
        J0(false);
        N0(true, false);
        if (tL_error != null) {
            ik.c0(this.currentAccount, tL_error, this, tLObject, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean presentFragment(org.telegram.ui.ActionBar.d dVar, boolean z) {
        C0(dVar);
        return super.presentFragment(dVar, z);
    }

    public p(TLRPC.PaymentForm paymentForm, k47 k47Var, String str, org.telegram.ui.ActionBar.d dVar) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new jf5[3];
        this.K = new ArrayList();
        this.L = new bba[3];
        this.N = new njb[3];
        this.O = new vkb[2];
        this.Z = new ijb[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        this.W0 = true;
        j0(null, paymentForm, k47Var, str, 4, null, null, null, null, null, null, false, null, dVar, false);
    }

    public p(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, k47 k47Var, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.d dVar, boolean z2) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new jf5[3];
        this.K = new ArrayList();
        this.L = new bba[3];
        this.N = new njb[3];
        this.O = new vkb[2];
        this.Z = new ijb[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        j0(inputInvoice, paymentForm, k47Var, str, i, tL_payments_validatedRequestedInfo, tL_shippingOption, l, str2, str3, tL_payments_validateRequestedInfo, z, tL_inputPaymentCredentialsGooglePay, dVar, z2);
    }

    public p(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.d dVar) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, dVar, false);
        this.W0 = true;
    }
}
