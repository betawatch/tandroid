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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class p extends org.telegram.ui.ActionBar.e implements fn7 {
    public static final List h1 = Arrays.asList("http", "https");
    public static final List i1 = Collections.singletonList("tg");
    public boolean A0;
    public gy2 B0;
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
    public final mf5[] J;
    public TLRPC.TL_payments_validateRequestedInfo J0;
    public final ArrayList K;
    public TLRPC.TL_inputPaymentCredentialsGooglePay K0;
    public final sca[] L;
    public String L0;
    public wkb M;
    public String M0;
    public final ilb[] N;
    public JSONObject N0;
    public final qmb[] O;
    public r47 O0;
    public FrameLayout P;
    public String P0;
    public FrameLayout Q;
    public boolean Q0;
    public LinearLayout R;
    public boolean R0;
    public tlb S;
    public String[] S0;
    public ku3 T;
    public boolean T0;
    public y28 U;
    public boolean U0;
    public TextView V;
    public boolean V0;
    public b69 W;
    public boolean W0;
    public w28 X;
    public boolean X0;
    public a38 Y;
    public boolean Y0;
    public final dlb[] Z;
    public vnb Z0;
    public final ArrayList a;
    public float a0;
    public z28 a1;
    public final HashMap b;
    public TL_account.Password b0;
    public boolean b1;
    public final HashMap c;
    public boolean c0;
    public TLRPC.InputInvoice c1;
    public final HashMap d;
    public int d0;
    public pcc d1;
    public qa4 e;
    public x18 e0;
    public pcc e1;
    public EditTextBoldCursor[] f;
    public boolean f0;
    public p12 f1;
    public p g0;
    public int g1;
    public i29[] h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public boolean l0;
    public TLRPC.User m0;
    public s7 n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public ww2 r;
    public String r0;
    public ww2 s;
    public org.telegram.ui.ActionBar.e s0;
    public f28 t0;
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
        this.J = new mf5[3];
        this.K = new ArrayList();
        this.L = new sca[3];
        this.N = new ilb[3];
        this.O = new qmb[2];
        this.Z = new dlb[7];
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
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(paymentReceipt.bot_id));
        this.m0 = X1;
        if (X1 != null) {
            this.q0 = X1.first_name;
        } else {
            this.q0 = "";
        }
        this.r0 = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.J0 = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.O0 != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().j1(paymentReceipt.bot_id);
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

    public static JSONObject c0() {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new w18(this, (byte) 1), 10);
    }

    public final boolean B0(wk5 wk5Var, Activity activity) {
        int i = 0;
        if (this.c1 != null) {
            if (wk5Var != null) {
                ArrayList arrayList = new ArrayList(wk5Var.getFragmentStack());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    org.telegram.ui.ActionBar.e eVar = (org.telegram.ui.ActionBar.e) obj;
                    if (eVar instanceof p) {
                        eVar.removeSelfFromStack();
                    }
                }
                return true;
            }
            return false;
        }
        String str = this.m0.username;
        if (((str != null && str.equalsIgnoreCase(getMessagesController().l4.M0.f) && this.P0 == null) || (this.P0 != null && getMessagesController().l4.O0.f != null && Objects.equals(this.P0, getMessagesController().l4.O0.f))) && wk5Var != null) {
            ArrayList arrayList2 = new ArrayList(wk5Var.getFragmentStack());
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                org.telegram.ui.ActionBar.e eVar2 = (org.telegram.ui.ActionBar.e) obj2;
                if ((eVar2 instanceof zu1) || (eVar2 instanceof PremiumPreviewFragment)) {
                    eVar2.removeSelfFromStack();
                }
            }
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
            premiumPreviewFragment.q0 = true;
            ((ActionBarLayout) wk5Var).T(premiumPreviewFragment, !isFinishing());
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

    public final void C0(org.telegram.ui.ActionBar.e eVar) {
        hl.t1(this.fragmentView);
        if (eVar instanceof p) {
            p pVar = (p) eVar;
            pVar.a1 = this.a1;
            pVar.Z0 = this.Z0;
            pVar.Y0 = this.Y0;
            pVar.z0 = this.z0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0232, code lost:
    
        if (r9 == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        Integer num;
        Integer num2;
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
        zc1 zc1Var = new zc1(this.f[0].getText().toString(), num, num2, this.f[3].getText().toString(), this.f[2].getText().toString(), null, null, null, null, this.f[5].getText().toString(), this.f[4].getText().toString(), null, null, null, null, null, null);
        this.y0 = zc1Var.c() + " *" + zc1Var.d();
        boolean z4 = num != null && num2 != null && yac.h(this.currentAccount).d().startsWith("7") && "smartglocal".equals(this.D0.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        String str = (String) zc1Var.a;
        if (!lze.d(str)) {
            String replaceAll = str.trim().replaceAll("\\s+|-", "");
            if (!lze.d(replaceAll) && replaceAll != null) {
                int i = 0;
                while (true) {
                    if (i >= replaceAll.length()) {
                        int length = replaceAll.length() - 1;
                        boolean z5 = true;
                        int i2 = 0;
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
                                i2 += parseInt;
                                length--;
                                z5 = z6;
                            } else if (i2 % 10 == 0) {
                                String c = zc1Var.c();
                                byte b = 15;
                                if (!"American Express".equals(c) ? !(!"Diners Club".equals(c) ? replaceAll.length() != 16 : replaceAll.length() != 14) : replaceAll.length() == 15) {
                                    if (!z4) {
                                        Object obj = zc1Var.m;
                                        Integer num4 = (Integer) obj;
                                        if (num4 != null && num4.intValue() >= 1 && num4.intValue() <= 12) {
                                            Object obj2 = zc1Var.n;
                                            Integer num5 = (Integer) obj2;
                                            if (num5 != null) {
                                                int a = lhe.a(num5.intValue());
                                                if (z3f.G == null) {
                                                    z3f.G = new z3f(b);
                                                }
                                                if (a >= Calendar.getInstance().get(1)) {
                                                    Integer num6 = (Integer) obj;
                                                    if (num6 != null && num6.intValue() >= 1 && num6.intValue() <= 12 && (num3 = (Integer) obj2) != null) {
                                                        int a2 = lhe.a(num3.intValue());
                                                        if (z3f.G == null) {
                                                            z3f.G = new z3f(b);
                                                        }
                                                        if (a2 >= Calendar.getInstance().get(1)) {
                                                            int intValue = ((Integer) obj2).intValue();
                                                            int intValue2 = ((Integer) obj).intValue();
                                                            int a3 = lhe.a(intValue);
                                                            if (z3f.G == null) {
                                                                z3f.G = new z3f(b);
                                                            }
                                                            if (a3 >= Calendar.getInstance().get(1)) {
                                                                if (z3f.G == null) {
                                                                    z3f.G = new z3f(b);
                                                                }
                                                                Calendar calendar = Calendar.getInstance();
                                                                if (lhe.a(intValue) != calendar.get(1) || intValue2 >= calendar.get(2) + 1) {
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
                                    String str2 = (String) zc1Var.b;
                                    if (!lze.d(str2)) {
                                        String trim = str2.trim();
                                        String c2 = zc1Var.c();
                                        boolean z7 = (c2 == null && trim.length() >= 3 && trim.length() <= 4) || ("American Express".equals(c2) && trim.length() == 4) || trim.length() == 3;
                                        if (trim != null) {
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 < trim.length()) {
                                                    if (!Character.isDigit(trim.charAt(i3))) {
                                                        break;
                                                    } else {
                                                        i3++;
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
                                                            pq8 pq8Var = new pq8((Object) new uif((byte) 26), (byte) 19);
                                                            uif.R3(str3);
                                                            aj3 aj3Var = new aj3((Object) this, (byte) 24);
                                                            try {
                                                                uif.R3(str3);
                                                                new mdb(pq8Var, str3, zc1Var, aj3Var).execute(new Void[0]);
                                                            } catch (x40 e) {
                                                                aj3Var.Y(e);
                                                            }
                                                        } else if ("smartglocal".equals(this.D0.native_provider)) {
                                                            new r28(this, zc1Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                                        }
                                                        return;
                                                    } catch (Exception e2) {
                                                        cc4.g(e2, true);
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
                    } else if (!Character.isDigit(replaceAll.charAt(i))) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        K0(0);
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
            tL_inputInvoiceMessage.peer = getMessagesController().m1(this.O0.k.peer_id);
            tL_inputInvoiceMessage.msg_id = this.O0.e1();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.P0;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.D0.form_id;
        if (yac.h(this.currentAccount).y == null || this.z0 == null) {
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
            tL_inputPaymentCredentialsSaved.tmp_password = yac.h(this.currentAccount).y.tmp_password;
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
        if ((this.D0.invoice.flags & 256) != 0) {
            Long l = this.I0;
            tL_payments_sendPaymentForm.tip_amount = l != null ? l.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new pl7(this, tL_payments_sendPaymentForm, (byte) 5), (this.X0 ? 8 : 0) | 2);
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
                tL_inputInvoiceMessage.peer = getMessagesController().m1(this.O0.k.peer_id);
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
        byte b = 4;
        if (this.D0.invoice.email_requested) {
            this.J0.info.email = this.f[7].getText().toString().trim();
            this.J0.info.flags |= 4;
        }
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(this.J0, new pl7(this, this.J0, b), (this.X0 ? 8 : 0) | 2);
    }

    public final void G0(boolean z) {
        String obj;
        String str;
        byte b = 2;
        if (!z && this.T.getVisibility() == 0) {
            String text = this.T.getText();
            if (text.length() == 0) {
                ku3 ku3Var = this.T;
                try {
                    ku3Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                hl.A3(2.5f, ku3Var, null);
                return;
            } else {
                N0(true, true);
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = text;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new w18(this, b), 10);
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
                    Toast.makeText(getParentActivity(), ob6.M0(2131747173, null), 0).show();
                } catch (Exception e) {
                    cc4.g(e, true);
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
        Utilities.e.c(new va7((Object) this, z, (Object) str, (Object) obj, (Object) updatepasswordsettings, (byte) 15));
    }

    public final void H0(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        dlb[] dlbVarArr = this.Z;
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
            qu6.u(sb, ", ", str4, ", ", str5);
            dlbVarArr[2].b(R.drawable.msg_payment_address, c00.k(sb, ", ", str6), ob6.M0(2131747108, null), true);
        }
        dlbVarArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            dlbVarArr[3].b(R.drawable.msg_contacts, str7, ob6.M0(2131747139, null), true);
        }
        dlbVarArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            dlbVarArr[4].b(R.drawable.msg_calls, f78.f().e(tL_paymentRequestedInfo.phone), ob6.M0(2131747137, null), (tL_paymentRequestedInfo.email == null && this.H0 == null) ? false : true);
        }
        dlbVarArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            dlbVarArr[5].b(R.drawable.msg_mention, str8, ob6.M0(2131747142, null), this.H0 != null);
        }
        dlbVarArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
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
            h0();
        }
    }

    public final void J0(boolean z) {
        this.Q0 = z;
        this.H = !z;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && aVar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.Q0);
        }
        dlb dlbVar = this.Z[0];
        if (dlbVar != null) {
            dlbVar.setEnabled(!this.Q0);
        }
    }

    public final void K0(int i) {
        EditTextBoldCursor editTextBoldCursor = this.f[i];
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        hl.A3(2.5f, editTextBoldCursor, null);
    }

    public final void L0(String str, String str2) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        id idVar = alertDialog$Builder.a;
        idVar.S = str;
        idVar.U = str2;
        showDialog(idVar);
    }

    public final void M0(Runnable runnable) {
        Integer valueOf = Integer.valueOf(R.drawable.msg_payment_card);
        nx0 i = ik8.i(getParentActivity(), false, 1, null);
        i.P = ob6.M0(2131747141, null);
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
        arrayList.add(ob6.M0(2131747140, null));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            iArr[i4] = ((Integer) arrayList2.get(i4)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        og ogVar = new og(this, runnable, arrayList3, arrayList, (byte) 1);
        i.M = charSequenceArr;
        i.N = iArr;
        i.L = ogVar;
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
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.s, (Property<ww2, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<ww2, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.s, (Property<ww2, Float>) property3, 1.0f));
                } else {
                    this.V.setVisibility(0);
                    this.X.setEnabled(true);
                    AnimatorSet animatorSet3 = this.w;
                    ww2 ww2Var = this.s;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ww2Var, (Property<ww2, Float>) property4, 0.1f);
                    ww2 ww2Var2 = this.s;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ww2Var2, (Property<ww2, Float>) property5, 0.1f);
                    ww2 ww2Var3 = this.s;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(ww2Var3, (Property<ww2, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<TextView, Float>) property6, 1.0f));
                }
                this.w.addListener(new s28(this, z2, b));
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
            animatorSet5.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.r, (Property<ww2, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<ww2, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.r, (Property<ww2, Float>) property9, 1.0f));
        } else if (this.x != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.r, (Property<ww2, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<ww2, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.r, (Property<ww2, Float>) View.ALPHA, 0.0f));
        } else {
            this.n.getContentView().setVisibility(0);
            this.n.setEnabled(true);
            AnimatorSet animatorSet6 = this.w;
            ww2 ww2Var4 = this.r;
            Property property10 = View.SCALE_X;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(ww2Var4, (Property<ww2, Float>) property10, 0.1f);
            ww2 ww2Var5 = this.r;
            Property property11 = View.SCALE_Y;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(ww2Var5, (Property<ww2, Float>) property11, 0.1f);
            ww2 ww2Var6 = this.r;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(ww2Var6, (Property<ww2, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.w.playTogether(ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.n.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.w.addListener(new s28(this, z2, b2));
        this.w.setDuration(150L);
        this.w.start();
    }

    public final void O0(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131747081, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.a0("PaymentTransactionMessage2", null, 2131747082, str, this.q0, this.r0));
        alertDialog$Builder.j(ob6.M0(2131751736, null), new b28(this, (byte) 5));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        showDialog(idVar);
    }

    public final void P0() {
        if (this.v0 == 6) {
            ilb[] ilbVarArr = this.N;
            if (ilbVarArr[2] != null) {
                int i = 0;
                this.n.setVisibility(0);
                TL_account.Password password = this.b0;
                ArrayList arrayList = this.K;
                mf5[] mf5VarArr = this.J;
                qmb[] qmbVarArr = this.O;
                if (password == null) {
                    N0(true, true);
                    ilbVarArr[2].setVisibility(8);
                    qmbVarArr[0].setVisibility(8);
                    qmbVarArr[1].setVisibility(8);
                    this.T.setVisibility(8);
                    mf5VarArr[0].setVisibility(8);
                    mf5VarArr[1].setVisibility(8);
                    ilbVarArr[0].setVisibility(8);
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
                    ilbVarArr[2].setVisibility(8);
                    qmbVarArr[0].setVisibility(8);
                    qmbVarArr[1].setVisibility(8);
                    ilbVarArr[1].setText(ob6.M0(2131747118, null));
                    this.T.setVisibility(8);
                    mf5VarArr[0].setVisibility(0);
                    mf5VarArr[1].setVisibility(0);
                    ilbVarArr[0].setVisibility(0);
                    for (int i3 = 0; i3 < 3; i3++) {
                        ((View) this.f[i3].getParent()).setVisibility(0);
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        ((View) arrayList.get(i4)).setVisibility(0);
                    }
                    return;
                }
                ilb ilbVar = ilbVarArr[2];
                String str = this.b0.email_unconfirmed_pattern;
                if (str == null) {
                    str = "";
                }
                ilbVar.setText(ob6.a0("EmailPasswordConfirmText2", null, 2131751164, str));
                ilbVarArr[2].setVisibility(0);
                qmbVarArr[0].setVisibility(0);
                qmbVarArr[1].setVisibility(0);
                this.T.setVisibility(0);
                ilbVarArr[1].setText("");
                mf5VarArr[0].setVisibility(8);
                mf5VarArr[1].setVisibility(8);
                ilbVarArr[0].setVisibility(8);
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
        ilb[] ilbVarArr = this.N;
        if (ilbVarArr[0] != null) {
            sca[] scaVarArr = this.L;
            if (scaVarArr[2] != null) {
                TLRPC.PaymentForm paymentForm = this.D0;
                if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.x != null && this.A0)) {
                    this.M.setVisibility(8);
                    ilbVarArr[0].setVisibility(8);
                    sca scaVar = scaVarArr[2];
                    yob.Z(scaVar, scaVar.getContext(), R.drawable.greydivider_bottom, aob.b7);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131747148, null));
                if (this.D0.password_missing) {
                    A0();
                    spannableStringBuilder.append((CharSequence) "\n");
                    int length = spannableStringBuilder.length();
                    String M0 = ob6.M0(2131747147, null);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    spannableStringBuilder.append((CharSequence) M0);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        int i = indexOf + length;
                        int i2 = lastIndexOf + length;
                        ilbVarArr[0].getTextView().setMovementMethod(new dl((byte) 0));
                        spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) "");
                        spannableStringBuilder.replace(i, i + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new x28(this), i, i2 - 1, 33);
                    }
                }
                this.M.setEnabled(true);
                ilbVarArr[0].setText(spannableStringBuilder);
                this.M.setVisibility(0);
                ilbVarArr[0].setVisibility(0);
                sca scaVar2 = scaVarArr[2];
                yob.Z(scaVar2, scaVar2.getContext(), R.drawable.greydivider, aob.b7);
            }
        }
    }

    public final void R0() {
        this.S0[0] = g0(this.u0);
        this.S.a(ob6.M0(2131747080, null), this.S0[0], true);
        TextView textView = this.V;
        if (textView != null) {
            textView.setText(ob6.a0("PaymentCheckoutPay", null, 2131747138, this.S0[0]));
        }
        if (this.t0 != null) {
            int themedColor = getThemedColor(aob.Vi);
            int childCount = this.t0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView textView2 = (TextView) this.t0.getChildAt(i);
                if (textView2.getTag().equals(this.I0)) {
                    aob.A1(themedColor, textView2.getBackground());
                    yob.X(textView2, aob.Wi, this.Z0);
                } else {
                    aob.A1(536870911 & themedColor, textView2.getBackground());
                    yob.X(textView2, aob.Z8, this.Z0);
                }
                textView2.invalidate();
            }
        }
    }

    public final void Z() {
        if (yac.h(this.currentAccount).y != null && yac.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            yac.h(this.currentAccount).y = null;
            yac.h(this.currentAccount).u(false);
        }
        if (yac.h(this.currentAccount).y != null) {
            E0();
            return;
        }
        if (this.f[1].length() == 0) {
            try {
                this.f[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            hl.A3(2.5f, this.f[1], null);
            return;
        }
        String obj = this.f[1].getText().toString();
        N0(true, true);
        J0(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpassword, new m65(this, obj, getpassword, (byte) 26), (this.X0 ? 8 : 0) | 2);
    }

    public final void a0(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        hf0 L0 = aob.L0(true);
        uob M = yob.M(aob.d6);
        uob M2 = yob.M(aob.i6);
        frameLayout.setBackground(L0);
        yob.j(frameLayout, L0, M, M2, null);
        this.P.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Q = frameLayout2;
        frameLayout2.setClickable(true);
        this.Q.setFocusable(true);
        this.Q.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        String str = this.L0;
        FrameLayout frameLayout3 = this.Q;
        if (str == null) {
            frameLayout3.setPadding(hl.L(10.0f), hl.L(2.0f), hl.L(10.0f), hl.L(2.0f));
        } else {
            frameLayout3.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        }
        this.P.addView(this.Q, tre.c(48.0f, -1));
        this.Q.setOnClickListener(new z18(this, (byte) 14));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.Q.addView(linearLayout, tre.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, tre.l(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.Q.addView(imageView2, tre.c(-1.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.h7));
        hashSet.add(Integer.valueOf(aob.g7));
        hashSet.add(Integer.valueOf(aob.E7));
        hashSet.add(Integer.valueOf(aob.D7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0(String str) {
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
                    str = f78.h(telephonyManager.getLine1Number(), false);
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
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0307, code lost:
    
        if (r15.email_requested == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0fe9, code lost:
    
        if (r12.email_requested == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x1a6f, code lost:
    
        if (r0 != null) goto L639;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x1c19  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0493  */
    /* JADX WARN: Type inference failed for: r4v162, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v167 */
    /* JADX WARN: Type inference failed for: r4v168, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r4v182 */
    /* JADX WARN: Type inference failed for: r4v183 */
    /* JADX WARN: Type inference failed for: r4v201, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v223 */
    /* JADX WARN: Type inference failed for: r8v170, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v171, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        String str;
        String str2;
        String str3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        char c;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        byte b;
        byte b2;
        byte b3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        boolean z;
        int i2;
        byte b4;
        int i3;
        int i4;
        TLRPC.TL_invoice tL_invoice;
        sca scaVar;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4;
        String str4;
        String str5;
        TelephonyManager telephonyManager;
        FrameLayout frameLayout;
        int i5;
        byte b5;
        byte b6;
        byte b7;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str6;
        String str7;
        BufferedReader bufferedReader;
        switch (this.v0) {
            case 0:
                this.actionBar.setTitle(ob6.L0(2131747102));
                break;
            case 1:
                this.actionBar.setTitle(ob6.L0(2131747101));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.G0;
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.G0.title);
                    break;
                } else {
                    this.actionBar.setTitle(ob6.L0(2131747152));
                    break;
                }
                break;
            case 4:
                boolean z2 = this.D0.invoice.test;
                org.telegram.ui.ActionBar.a aVar = this.actionBar;
                if (z2) {
                    aVar.setTitle("Test ".concat(ob6.L0(2131747145)));
                    break;
                } else {
                    aVar.setTitle(ob6.L0(2131747145));
                    break;
                }
            case 5:
                boolean z3 = this.D0.invoice.test;
                org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
                if (z3) {
                    aVar2.setTitle("Test ".concat(ob6.L0(2131747109)));
                    break;
                } else {
                    aVar2.setTitle(ob6.L0(2131747109));
                    break;
                }
            case 6:
                this.actionBar.setTitle(ob6.L0(2131747120));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new n28(this));
        s6 u = this.actionBar.u();
        byte b8 = this.v0;
        int i6 = 6;
        final byte b9 = 3;
        if (b8 == 0 || b8 == 1 || b8 == 2 || b8 == 3 || b8 == 4 || b8 == 6) {
            this.n = u.h(1, R.drawable.ic_ab_done, hl.L(56.0f), ob6.L0(2131751319));
            ww2 ww2Var = new ww2(context, 1);
            this.r = ww2Var;
            ww2Var.setAlpha(0.0f);
            this.r.setScaleX(0.1f);
            this.r.setScaleY(0.1f);
            this.r.setVisibility(4);
            this.n.addView(this.r, tre.c(-1.0f, -1));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        yob.h(aob.a7, getResourceProvider(), frameLayout2);
        ScrollView scrollView = new ScrollView(context);
        this.F = scrollView;
        scrollView.setFillViewport(true);
        hl.u3(this.F, getThemedColor(aob.s8));
        frameLayout2.addView(this.F, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.v0 == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R = linearLayout;
        linearLayout.setOrientation(1);
        int i7 = 0;
        this.R.setClipChildren(false);
        int i8 = -2;
        this.F.addView(this.R, new FrameLayout.LayoutParams(-1, -2));
        byte b10 = this.v0;
        int i9 = 1;
        byte b11 = 9;
        Drawable drawable = null;
        if (b10 == 0) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            } catch (Exception e) {
                e = e;
                i2 = i7;
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(";");
                    this.a.add(i7, split[2]);
                    i2 = i7;
                    try {
                        this.b.put(split[2], split[i2]);
                        this.c.put(split[i2], split[2]);
                        hashMap2.put(split[1], split[2]);
                        if (split.length > 3) {
                            this.d.put(split[i2], split[3]);
                        }
                        hashMap.put(split[1], split[2]);
                        i7 = i2;
                    } catch (Exception e2) {
                        e = e2;
                    }
                } else {
                    i2 = i7;
                    bufferedReader.close();
                    Collections.sort(this.a, new ta((byte) 9));
                    b4 = 10;
                    this.f = new EditTextBoldCursor[10];
                    i3 = i2;
                    while (i3 < b4) {
                        if (i3 == 0) {
                            this.J[i2] = new mf5(context, this.Z0);
                            yob.h(aob.d6, getResourceProvider(), this.J[i2]);
                            this.J[i2].setText(ob6.L0(2131747108));
                            this.R.addView(this.J[i2], tre.o(-1, -2));
                        } else if (i3 == i6) {
                            this.L[i2] = new sca(context, drawable);
                            this.R.addView(this.L[i2], tre.o(-1, -2));
                            this.J[i9] = new mf5(context, this.Z0);
                            yob.h(aob.d6, getResourceProvider(), this.J[i9]);
                            this.J[i9].setText(ob6.L0(2131747098));
                            this.R.addView(this.J[i9], tre.o(-1, -2));
                        }
                        if (i3 == 8) {
                            ?? linearLayout2 = new LinearLayout(context);
                            ?? r8 = i2;
                            linearLayout2.setClipChildren(r8);
                            linearLayout2.setOrientation(r8 == true ? 1 : 0);
                            this.R.addView(linearLayout2, tre.o(-1, 50));
                            yob.h(aob.d6, getResourceProvider(), linearLayout2);
                            frameLayout = linearLayout2;
                        } else if (i3 == b11) {
                            frameLayout = (ViewGroup) this.f[8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(false);
                            this.R.addView(frameLayout, tre.o(-1, 50));
                            int i10 = aob.d6;
                            yob.h(i10, getResourceProvider(), frameLayout);
                            int i11 = i3 != 5 ? i9 : 0;
                            if (i11 != 0) {
                                if (i3 == 7 && !this.D0.invoice.phone_requested) {
                                    i5 = i6;
                                } else if (i3 == i6) {
                                    TLRPC.TL_invoice tL_invoice2 = this.D0.invoice;
                                    i5 = i6;
                                    if (!tL_invoice2.phone_requested) {
                                    }
                                    if (i11 != 0) {
                                        t62 t62Var = new t62(context, (byte) 16);
                                        yob.h(i10, getResourceProvider(), t62Var);
                                        this.K.add(t62Var);
                                        frameLayout.addView(t62Var, new FrameLayout.LayoutParams(-1, i9, 83));
                                    }
                                    EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                                    if (i3 != b11) {
                                        editTextBoldCursorArr[i3] = new gg5(context);
                                    } else {
                                        editTextBoldCursorArr[i3] = new EditTextBoldCursor(context);
                                    }
                                    this.f[i3].setTag(Integer.valueOf(i3));
                                    this.f[i3].setTextSize(1, 16.0f);
                                    yob.D(this.f[i3], aob.H6, getResourceProvider());
                                    EditTextBoldCursor editTextBoldCursor = this.f[i3];
                                    int i12 = aob.G6;
                                    yob.X(editTextBoldCursor, i12, getResourceProvider());
                                    this.f[i3].setBackgroundDrawable(drawable);
                                    yob.v(this.f[i3], i12, getResourceProvider());
                                    this.f[i3].setCursorSize(hl.L(20.0f));
                                    this.f[i3].setCursorWidth(1.5f);
                                    if (i3 == 4) {
                                        final byte b12 = 0;
                                        this.f[i3].setOnTouchListener(new View.OnTouchListener(this) { // from class: a28
                                            public final /* synthetic */ p b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // android.view.View.OnTouchListener
                                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                byte b13 = b12;
                                                p pVar = this.b;
                                                switch (b13) {
                                                    case 0:
                                                        if (pVar.getParentActivity() != null) {
                                                            if (motionEvent.getAction() == 1) {
                                                                ky2 ky2Var = new ky2(null, false);
                                                                ky2Var.n = true;
                                                                ky2Var.r = new b28(pVar, (byte) 4);
                                                                pVar.presentFragment(ky2Var);
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        if (pVar.getParentActivity() != null) {
                                                            if (motionEvent.getAction() == 1) {
                                                                ky2 ky2Var2 = new ky2(null, false);
                                                                ky2Var2.n = true;
                                                                ky2Var2.r = new b28(pVar, (byte) 2);
                                                                pVar.presentFragment(ky2Var2);
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
                                        this.f[i3].setInputType(0);
                                    }
                                    if (i3 != b11 || i3 == 8) {
                                        this.f[i3].setInputType(b9);
                                    } else {
                                        EditTextBoldCursor[] editTextBoldCursorArr2 = this.f;
                                        if (i3 == 7) {
                                            editTextBoldCursorArr2[i3].setInputType(1);
                                        } else {
                                            editTextBoldCursorArr2[i3].setInputType(16385);
                                        }
                                    }
                                    this.f[i3].setImeOptions(268435461);
                                    switch (i3) {
                                        case 0:
                                            this.f[i3].setHint(ob6.L0(2131747107));
                                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.D0.saved_info;
                                            if (tL_paymentRequestedInfo5 != null && (tL_postAddress = tL_paymentRequestedInfo5.shipping_address) != null) {
                                                this.f[i3].setText(tL_postAddress.street_line1);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            this.f[i3].setHint(ob6.L0(2131747106));
                                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.D0.saved_info;
                                            if (tL_paymentRequestedInfo6 != null && (tL_postAddress2 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                                this.f[i3].setText(tL_postAddress2.street_line2);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            this.f[i3].setHint(ob6.L0(2131747105));
                                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.D0.saved_info;
                                            if (tL_paymentRequestedInfo7 != null && (tL_postAddress3 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                                this.f[i3].setText(tL_postAddress3.city);
                                                break;
                                            }
                                            break;
                                        case 3:
                                            this.f[i3].setHint(ob6.L0(2131747095));
                                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.D0.saved_info;
                                            if (tL_paymentRequestedInfo8 != null && (tL_postAddress4 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                                this.f[i3].setText(tL_postAddress4.state);
                                                break;
                                            }
                                            break;
                                        case 4:
                                            this.f[i3].setHint(ob6.L0(2131747104));
                                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.D0.saved_info;
                                            if (tL_paymentRequestedInfo9 != null && (tL_postAddress5 = tL_paymentRequestedInfo9.shipping_address) != null) {
                                                String str8 = (String) hashMap2.get(tL_postAddress5.country_iso2);
                                                String str9 = this.D0.saved_info.shipping_address.country_iso2;
                                                this.C0 = str9;
                                                EditTextBoldCursor editTextBoldCursor2 = this.f[i3];
                                                if (str8 == null) {
                                                    str8 = str9;
                                                }
                                                editTextBoldCursor2.setText(str8);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            this.f[i3].setHint(ob6.L0(2131747094));
                                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.D0.saved_info;
                                            if (tL_paymentRequestedInfo10 != null && (tL_postAddress6 = tL_paymentRequestedInfo10.shipping_address) != null) {
                                                this.f[i3].setText(tL_postAddress6.post_code);
                                                break;
                                            }
                                            break;
                                        case 6:
                                            this.f[i3].setHint(ob6.L0(2131747100));
                                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.D0.saved_info;
                                            if (tL_paymentRequestedInfo11 != null && (str6 = tL_paymentRequestedInfo11.name) != null) {
                                                this.f[i3].setText(str6);
                                                break;
                                            }
                                            break;
                                        case 7:
                                            this.f[i3].setHint(ob6.L0(2131747103));
                                            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = this.D0.saved_info;
                                            if (tL_paymentRequestedInfo12 != null && (str7 = tL_paymentRequestedInfo12.email) != null) {
                                                this.f[i3].setText(str7);
                                                break;
                                            }
                                            break;
                                    }
                                    EditTextBoldCursor editTextBoldCursor3 = this.f[i3];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    if (i3 != 8) {
                                        TextView textView = new TextView(context);
                                        this.I = textView;
                                        textView.setText("+");
                                        yob.X(this.I, i12, getResourceProvider());
                                        this.I.setTextSize(1, 16.0f);
                                        frameLayout.addView(this.I, tre.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                                        this.f[i3].setPadding(hl.L(10.0f), 0, 0, 0);
                                        this.f[i3].setGravity(19);
                                        this.f[i3].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                                        frameLayout.addView(this.f[i3], tre.k(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                                        this.f[i3].addTextChangedListener(new o28(this, (byte) 1));
                                    } else {
                                        EditTextBoldCursor[] editTextBoldCursorArr3 = this.f;
                                        if (i3 == b11) {
                                            editTextBoldCursorArr3[i3].setPadding(0, 0, 0, 0);
                                            this.f[i3].setGravity(19);
                                            frameLayout.addView(this.f[i3], tre.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                                            this.f[i3].addTextChangedListener(new ak2(this, (byte) 4));
                                        } else {
                                            editTextBoldCursorArr3[i3].setPadding(0, 0, 0, hl.L(6.0f));
                                            this.f[i3].setGravity(ob6.a0 ? (byte) 5 : b9);
                                            frameLayout.addView(this.f[i3], tre.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                                        }
                                    }
                                    this.f[i3].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: y18
                                        public final /* synthetic */ p b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.widget.TextView.OnEditorActionListener
                                        public final boolean onEditorAction(TextView textView2, int i13, KeyEvent keyEvent) {
                                            byte b13 = b9;
                                            p pVar = this.b;
                                            switch (b13) {
                                                case 0:
                                                    if (i13 == 6) {
                                                        pVar.n.performClick();
                                                        break;
                                                    }
                                                    break;
                                                case 1:
                                                    if (i13 == 6) {
                                                        pVar.G0(false);
                                                        break;
                                                    }
                                                    break;
                                                case 2:
                                                    if (i13 != 6) {
                                                        if (i13 == 5) {
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
                                                case 3:
                                                    if (i13 == 5) {
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
                                                    } else if (i13 == 6) {
                                                        pVar.n.performClick();
                                                    }
                                                    break;
                                                default:
                                                    if (i13 == 5) {
                                                        int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                        while (true) {
                                                            int i14 = intValue3 + 1;
                                                            EditTextBoldCursor[] editTextBoldCursorArr5 = pVar.f;
                                                            if (i14 < editTextBoldCursorArr5.length) {
                                                                intValue3 = i14 == 4 ? intValue3 + 2 : i14;
                                                                if (((View) editTextBoldCursorArr5[intValue3].getParent()).getVisibility() == 0) {
                                                                    pVar.f[intValue3].requestFocus();
                                                                }
                                                            }
                                                        }
                                                    } else if (i13 == 6) {
                                                        pVar.n.performClick();
                                                    }
                                                    break;
                                            }
                                            return true;
                                        }
                                    });
                                    if (i3 != b11) {
                                        TLRPC.TL_invoice tL_invoice3 = this.D0.invoice;
                                        if (tL_invoice3.email_to_provider || tL_invoice3.phone_to_provider) {
                                            ?? r4 = drawable;
                                            int i13 = 0;
                                            while (i13 < this.D0.users.size()) {
                                                TLRPC.User user = this.D0.users.get(i13);
                                                byte b13 = b9;
                                                byte b14 = b11;
                                                if (user.id == this.D0.provider_id) {
                                                    r4 = user;
                                                }
                                                i13++;
                                                b9 = b13;
                                                b11 = b14;
                                                r4 = r4;
                                            }
                                            b5 = b11;
                                            b6 = b9;
                                            String n = r4 != 0 ? lv2.n(r4.first_name, r4.last_name) : "";
                                            this.N[1] = new ilb(context, this.Z0);
                                            yob.Z(this.N[1], context, R.drawable.greydivider_bottom, aob.b7);
                                            this.R.addView(this.N[1], tre.o(-1, -2));
                                            TLRPC.TL_invoice tL_invoice4 = this.D0.invoice;
                                            boolean z4 = tL_invoice4.email_to_provider;
                                            if (z4 && tL_invoice4.phone_to_provider) {
                                                this.N[1].setText(ob6.Y(2131747112, "PaymentPhoneEmailToProvider", n));
                                            } else {
                                                ilb[] ilbVarArr = this.N;
                                                if (z4) {
                                                    ilbVarArr[1].setText(ob6.Y(2131747130, "PaymentEmailToProvider", n));
                                                } else {
                                                    ilbVarArr[1].setText(ob6.Y(2131747111, "PaymentPhoneToProvider", n));
                                                }
                                            }
                                        } else {
                                            this.L[1] = new sca(context, drawable);
                                            this.R.addView(this.L[1], tre.o(-1, -2));
                                            b5 = b11;
                                            b6 = b9;
                                        }
                                        wkb wkbVar = new wkb(context, this.Z0);
                                        this.M = wkbVar;
                                        yob.Q(wkbVar, aob.L0(true), yob.M(aob.d6), yob.M(aob.i6));
                                        this.M.f(ob6.L0(2131747097), this.U0, false);
                                        this.R.addView(this.M, tre.o(-1, -2));
                                        b7 = 10;
                                        this.M.setOnClickListener(new z18(this, b7));
                                        this.N[0] = new ilb(context, this.Z0);
                                        yob.Z(this.N[0], context, R.drawable.greydivider_bottom, aob.b7);
                                        this.N[0].setText(ob6.L0(2131747096));
                                        this.R.addView(this.N[0], tre.o(-1, -2));
                                    } else {
                                        b5 = b11;
                                        b6 = b9;
                                        b7 = 10;
                                    }
                                    i3++;
                                    b4 = b7;
                                    i6 = i5;
                                    b9 = b6;
                                    b11 = b5;
                                    drawable = null;
                                    i9 = 1;
                                    i2 = 0;
                                }
                                i11 = 0;
                                if (i11 != 0) {
                                }
                                EditTextBoldCursor[] editTextBoldCursorArr4 = this.f;
                                if (i3 != b11) {
                                }
                                this.f[i3].setTag(Integer.valueOf(i3));
                                this.f[i3].setTextSize(1, 16.0f);
                                yob.D(this.f[i3], aob.H6, getResourceProvider());
                                EditTextBoldCursor editTextBoldCursor4 = this.f[i3];
                                int i122 = aob.G6;
                                yob.X(editTextBoldCursor4, i122, getResourceProvider());
                                this.f[i3].setBackgroundDrawable(drawable);
                                yob.v(this.f[i3], i122, getResourceProvider());
                                this.f[i3].setCursorSize(hl.L(20.0f));
                                this.f[i3].setCursorWidth(1.5f);
                                if (i3 == 4) {
                                }
                                if (i3 != b11) {
                                }
                                this.f[i3].setInputType(b9);
                                this.f[i3].setImeOptions(268435461);
                                switch (i3) {
                                }
                                EditTextBoldCursor editTextBoldCursor32 = this.f[i3];
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                if (i3 != 8) {
                                }
                                this.f[i3].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: y18
                                    public final /* synthetic */ p b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.widget.TextView.OnEditorActionListener
                                    public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                                        byte b132 = b9;
                                        p pVar = this.b;
                                        switch (b132) {
                                            case 0:
                                                if (i132 == 6) {
                                                    pVar.n.performClick();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                if (i132 == 6) {
                                                    pVar.G0(false);
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                if (i132 != 6) {
                                                    if (i132 == 5) {
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
                                            case 3:
                                                if (i132 == 5) {
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
                                                } else if (i132 == 6) {
                                                    pVar.n.performClick();
                                                }
                                                break;
                                            default:
                                                if (i132 == 5) {
                                                    int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                    while (true) {
                                                        int i14 = intValue3 + 1;
                                                        EditTextBoldCursor[] editTextBoldCursorArr5 = pVar.f;
                                                        if (i14 < editTextBoldCursorArr5.length) {
                                                            intValue3 = i14 == 4 ? intValue3 + 2 : i14;
                                                            if (((View) editTextBoldCursorArr5[intValue3].getParent()).getVisibility() == 0) {
                                                                pVar.f[intValue3].requestFocus();
                                                            }
                                                        }
                                                    }
                                                } else if (i132 == 6) {
                                                    pVar.n.performClick();
                                                }
                                                break;
                                        }
                                        return true;
                                    }
                                });
                                if (i3 != b11) {
                                }
                                i3++;
                                b4 = b7;
                                i6 = i5;
                                b9 = b6;
                                b11 = b5;
                                drawable = null;
                                i9 = 1;
                                i2 = 0;
                            }
                            i5 = i6;
                            if (i11 != 0) {
                            }
                            EditTextBoldCursor[] editTextBoldCursorArr42 = this.f;
                            if (i3 != b11) {
                            }
                            this.f[i3].setTag(Integer.valueOf(i3));
                            this.f[i3].setTextSize(1, 16.0f);
                            yob.D(this.f[i3], aob.H6, getResourceProvider());
                            EditTextBoldCursor editTextBoldCursor42 = this.f[i3];
                            int i1222 = aob.G6;
                            yob.X(editTextBoldCursor42, i1222, getResourceProvider());
                            this.f[i3].setBackgroundDrawable(drawable);
                            yob.v(this.f[i3], i1222, getResourceProvider());
                            this.f[i3].setCursorSize(hl.L(20.0f));
                            this.f[i3].setCursorWidth(1.5f);
                            if (i3 == 4) {
                            }
                            if (i3 != b11) {
                            }
                            this.f[i3].setInputType(b9);
                            this.f[i3].setImeOptions(268435461);
                            switch (i3) {
                            }
                            EditTextBoldCursor editTextBoldCursor322 = this.f[i3];
                            editTextBoldCursor322.setSelection(editTextBoldCursor322.length());
                            if (i3 != 8) {
                            }
                            this.f[i3].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: y18
                                public final /* synthetic */ p b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                                    byte b132 = b9;
                                    p pVar = this.b;
                                    switch (b132) {
                                        case 0:
                                            if (i132 == 6) {
                                                pVar.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 1:
                                            if (i132 == 6) {
                                                pVar.G0(false);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (i132 != 6) {
                                                if (i132 == 5) {
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
                                        case 3:
                                            if (i132 == 5) {
                                                int intValue2 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr422 = pVar.f;
                                                    if (intValue2 < editTextBoldCursorArr422.length) {
                                                        if (intValue2 != 4 && ((View) editTextBoldCursorArr422[intValue2].getParent()).getVisibility() == 0) {
                                                            pVar.f[intValue2].requestFocus();
                                                        }
                                                    }
                                                }
                                            } else if (i132 == 6) {
                                                pVar.n.performClick();
                                            }
                                            break;
                                        default:
                                            if (i132 == 5) {
                                                int intValue3 = ((Integer) textView2.getTag()).intValue();
                                                while (true) {
                                                    int i14 = intValue3 + 1;
                                                    EditTextBoldCursor[] editTextBoldCursorArr5 = pVar.f;
                                                    if (i14 < editTextBoldCursorArr5.length) {
                                                        intValue3 = i14 == 4 ? intValue3 + 2 : i14;
                                                        if (((View) editTextBoldCursorArr5[intValue3].getParent()).getVisibility() == 0) {
                                                            pVar.f[intValue3].requestFocus();
                                                        }
                                                    }
                                                }
                                            } else if (i132 == 6) {
                                                pVar.n.performClick();
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            if (i3 != b11) {
                            }
                            i3++;
                            b4 = b7;
                            i6 = i5;
                            b9 = b6;
                            b11 = b5;
                            drawable = null;
                            i9 = 1;
                            i2 = 0;
                        }
                        i5 = i6;
                        EditTextBoldCursor[] editTextBoldCursorArr422 = this.f;
                        if (i3 != b11) {
                        }
                        this.f[i3].setTag(Integer.valueOf(i3));
                        this.f[i3].setTextSize(1, 16.0f);
                        yob.D(this.f[i3], aob.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor422 = this.f[i3];
                        int i12222 = aob.G6;
                        yob.X(editTextBoldCursor422, i12222, getResourceProvider());
                        this.f[i3].setBackgroundDrawable(drawable);
                        yob.v(this.f[i3], i12222, getResourceProvider());
                        this.f[i3].setCursorSize(hl.L(20.0f));
                        this.f[i3].setCursorWidth(1.5f);
                        if (i3 == 4) {
                        }
                        if (i3 != b11) {
                        }
                        this.f[i3].setInputType(b9);
                        this.f[i3].setImeOptions(268435461);
                        switch (i3) {
                        }
                        EditTextBoldCursor editTextBoldCursor3222 = this.f[i3];
                        editTextBoldCursor3222.setSelection(editTextBoldCursor3222.length());
                        if (i3 != 8) {
                        }
                        this.f[i3].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: y18
                            public final /* synthetic */ p b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                                byte b132 = b9;
                                p pVar = this.b;
                                switch (b132) {
                                    case 0:
                                        if (i132 == 6) {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (i132 == 6) {
                                            pVar.G0(false);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (i132 != 6) {
                                            if (i132 == 5) {
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
                                    case 3:
                                        if (i132 == 5) {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr4222 = pVar.f;
                                                if (intValue2 < editTextBoldCursorArr4222.length) {
                                                    if (intValue2 != 4 && ((View) editTextBoldCursorArr4222[intValue2].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue2].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i132 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    default:
                                        if (i132 == 5) {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                int i14 = intValue3 + 1;
                                                EditTextBoldCursor[] editTextBoldCursorArr5 = pVar.f;
                                                if (i14 < editTextBoldCursorArr5.length) {
                                                    intValue3 = i14 == 4 ? intValue3 + 2 : i14;
                                                    if (((View) editTextBoldCursorArr5[intValue3].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue3].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i132 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                        if (i3 != b11) {
                        }
                        i3++;
                        b4 = b7;
                        i6 = i5;
                        b9 = b6;
                        b11 = b5;
                        drawable = null;
                        i9 = 1;
                        i2 = 0;
                    }
                    byte b15 = b11;
                    int i14 = i6;
                    byte b16 = b9;
                    if (this.D0.invoice.name_requested) {
                        i4 = 8;
                        ((ViewGroup) this.f[i14].getParent()).setVisibility(8);
                    } else {
                        i4 = 8;
                    }
                    if (!this.D0.invoice.phone_requested) {
                        ((ViewGroup) this.f[i4].getParent()).setVisibility(i4);
                    }
                    if (!this.D0.invoice.email_requested) {
                        ((ViewGroup) this.f[7].getParent()).setVisibility(i4);
                    }
                    tL_invoice = this.D0.invoice;
                    if (!tL_invoice.phone_requested) {
                        this.f[b15].setImeOptions(268435462);
                    } else if (tL_invoice.email_requested) {
                        this.f[7].setImeOptions(268435462);
                    } else {
                        boolean z5 = tL_invoice.name_requested;
                        EditTextBoldCursor[] editTextBoldCursorArr5 = this.f;
                        if (z5) {
                            editTextBoldCursorArr5[i14].setImeOptions(268435462);
                        } else {
                            editTextBoldCursorArr5[5].setImeOptions(268435462);
                        }
                    }
                    scaVar = this.L[1];
                    if (scaVar == null) {
                        TLRPC.TL_invoice tL_invoice5 = this.D0.invoice;
                        scaVar.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        ilb ilbVar = this.N[1];
                        if (ilbVar != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.D0.invoice;
                            ilbVar.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    mf5 mf5Var = this.J[1];
                    TLRPC.TL_invoice tL_invoice7 = this.D0.invoice;
                    mf5Var.setVisibility((!tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                    if (!this.D0.invoice.shipping_address_requested) {
                        this.J[0].setVisibility(8);
                        this.L[0].setVisibility(8);
                        ((ViewGroup) this.f[0].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[1].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[2].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[b16].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[4].getParent()).setVisibility(8);
                        ((ViewGroup) this.f[5].getParent()).setVisibility(8);
                    }
                    tL_paymentRequestedInfo3 = this.D0.saved_info;
                    if (tL_paymentRequestedInfo3 != null || TextUtils.isEmpty(tL_paymentRequestedInfo3.phone)) {
                        b0(null);
                    } else {
                        b0(this.D0.saved_info.phone);
                    }
                    if (this.f[8].length() == 0) {
                        TLRPC.PaymentForm paymentForm2 = this.D0;
                        if (paymentForm2.invoice.phone_requested && ((tL_paymentRequestedInfo4 = paymentForm2.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo4.phone))) {
                            try {
                                telephonyManager = (TelephonyManager) org.telegram.messenger.a.b.getSystemService("phone");
                            } catch (Exception e3) {
                                cc4.f(e3);
                            }
                            if (telephonyManager != null) {
                                str4 = telephonyManager.getSimCountryIso().toUpperCase();
                                if (str4 != null && (str5 = (String) hashMap.get(str4)) != null && this.a.indexOf(str5) != -1) {
                                    this.f[8].setText((CharSequence) this.b.get(str5));
                                }
                            }
                            str4 = null;
                            if (str4 != null) {
                                this.f[8].setText((CharSequence) this.b.get(str5));
                            }
                        }
                    }
                }
                e = e2;
                cc4.f(e);
                Collections.sort(this.a, new ta((byte) 9));
                b4 = 10;
                this.f = new EditTextBoldCursor[10];
                i3 = i2;
                while (i3 < b4) {
                }
                byte b152 = b11;
                int i142 = i6;
                byte b162 = b9;
                if (this.D0.invoice.name_requested) {
                }
                if (!this.D0.invoice.phone_requested) {
                }
                if (!this.D0.invoice.email_requested) {
                }
                tL_invoice = this.D0.invoice;
                if (!tL_invoice.phone_requested) {
                }
                scaVar = this.L[1];
                if (scaVar == null) {
                }
                mf5 mf5Var2 = this.J[1];
                TLRPC.TL_invoice tL_invoice72 = this.D0.invoice;
                mf5Var2.setVisibility((!tL_invoice72.name_requested || tL_invoice72.phone_requested || tL_invoice72.email_requested) ? 0 : 8);
                if (!this.D0.invoice.shipping_address_requested) {
                }
                tL_paymentRequestedInfo3 = this.D0.saved_info;
                if (tL_paymentRequestedInfo3 != null) {
                }
                b0(null);
                if (this.f[8].length() == 0) {
                }
            }
        } else {
            int i15 = 3;
            byte b17 = 17;
            int i16 = 2131747146;
            if (b10 == 2) {
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
                        cc4.f(e4);
                    }
                }
                if (this.T0 || this.G0 != null) {
                    if (this.L0 != null || this.N0 != null) {
                        j0(context);
                    }
                    a0(context);
                    this.R.addView(this.P, tre.o(-1, 50));
                    this.A0 = true;
                    N0(true, true);
                    this.r.setVisibility(0);
                    this.n.setEnabled(false);
                    this.n.getContentView().setVisibility(4);
                    hl.u(context, true);
                    t28 t28Var = new t28(this, context);
                    this.x = t28Var;
                    t28Var.getSettings().setJavaScriptEnabled(true);
                    this.x.getSettings().setDomStorageEnabled(true);
                    this.x.getSettings().setSupportZoom(true);
                    this.x.getSettings().setBuiltInZoomControls(true);
                    this.x.getSettings().setDisplayZoomControls(false);
                    this.x.getSettings().setUseWideViewPort(true);
                    this.x.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                    this.x.addJavascriptInterface(new PaymentFormActivity$TelegramWebviewProxy(this), "TelegramWebviewProxy");
                    this.x.setWebViewClient(new m28(this, context, (byte) 1));
                    this.R.addView(this.x, tre.c(-2.0f, -1));
                    this.L[2] = new sca(context, (Object) null);
                    this.R.addView(this.L[2], tre.o(-1, -2));
                    wkb wkbVar2 = new wkb(context, this.Z0);
                    this.M = wkbVar2;
                    yob.Q(wkbVar2, aob.L0(true), yob.M(aob.d6), yob.M(aob.i6));
                    this.M.f(ob6.L0(2131747149), this.V0, false);
                    this.R.addView(this.M, tre.o(-1, -2));
                    this.M.setOnClickListener(new z18(this, (byte) 11));
                    this.N[0] = new ilb(context, this.Z0);
                    yob.Z(this.N[0], context, R.drawable.greydivider_bottom, aob.b7);
                    Q0();
                    this.R.addView(this.N[0], tre.o(-1, -2));
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
                            cc4.f(e5);
                        }
                    }
                    if (this.l0 && ((!TextUtils.isEmpty(this.k0) && "stripe".equals(this.D0.native_provider)) || this.N0 != null)) {
                        j0(context);
                    }
                    int i17 = 6;
                    this.f = new EditTextBoldCursor[6];
                    int i18 = 0;
                    while (i18 < i17) {
                        if (i18 == 0) {
                            this.J[0] = new mf5(context, this.Z0);
                            yob.h(aob.d6, getResourceProvider(), this.J[0]);
                            this.J[0].setText(ob6.L0(i16));
                            this.R.addView(this.J[0], tre.o(-1, -2));
                        } else if (i18 == 4) {
                            this.J[1] = new mf5(context, this.Z0);
                            yob.h(aob.d6, getResourceProvider(), this.J[1]);
                            this.J[1].setText(ob6.L0(2131747155));
                            this.R.addView(this.J[1], tre.o(-1, -2));
                        }
                        boolean z6 = (i18 == i15 || i18 == 5 || (i18 == 4 && !this.i0)) ? false : true;
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        frameLayout3.setClipChildren(false);
                        int i19 = aob.d6;
                        yob.h(i19, getResourceProvider(), frameLayout3);
                        this.R.addView(frameLayout3, tre.o(-1, 50));
                        this.f[i18] = new EditTextBoldCursor(context);
                        this.f[i18].setTag(Integer.valueOf(i18));
                        this.f[i18].setTextSize(1, 16.0f);
                        yob.D(this.f[i18], aob.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor5 = this.f[i18];
                        int i20 = aob.G6;
                        yob.X(editTextBoldCursor5, i20, getResourceProvider());
                        this.f[i18].setBackgroundDrawable(null);
                        yob.v(this.f[i18], i20, getResourceProvider());
                        this.f[i18].setCursorSize(hl.L(20.0f));
                        this.f[i18].setCursorWidth(1.5f);
                        if (i18 == 3) {
                            this.f[i18].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                            this.f[i18].setInputType(jn7.N1);
                            this.f[i18].setTypeface(Typeface.DEFAULT);
                            this.f[i18].setTransformationMethod(PasswordTransformationMethod.getInstance());
                        } else if (i18 == 0) {
                            this.f[i18].setInputType(3);
                        } else if (i18 == 4) {
                            final byte b18 = 1;
                            this.f[i18].setOnTouchListener(new View.OnTouchListener(this) { // from class: a28
                                public final /* synthetic */ p b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    byte b132 = b18;
                                    p pVar = this.b;
                                    switch (b132) {
                                        case 0:
                                            if (pVar.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    ky2 ky2Var = new ky2(null, false);
                                                    ky2Var.n = true;
                                                    ky2Var.r = new b28(pVar, (byte) 4);
                                                    pVar.presentFragment(ky2Var);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                            break;
                                        default:
                                            if (pVar.getParentActivity() != null) {
                                                if (motionEvent.getAction() == 1) {
                                                    ky2 ky2Var2 = new ky2(null, false);
                                                    ky2Var2.n = true;
                                                    ky2Var2.r = new b28(pVar, (byte) 2);
                                                    pVar.presentFragment(ky2Var2);
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
                            this.f[i18].setInputType(0);
                        } else {
                            EditTextBoldCursor[] editTextBoldCursorArr6 = this.f;
                            if (i18 == 1) {
                                editTextBoldCursorArr6[i18].setInputType(16386);
                            } else if (i18 == 2) {
                                editTextBoldCursorArr6[i18].setInputType(4097);
                            } else {
                                editTextBoldCursorArr6[i18].setInputType(16385);
                            }
                        }
                        this.f[i18].setImeOptions(268435461);
                        if (i18 == 0) {
                            this.f[i18].setHint(ob6.L0(2131747150));
                        } else if (i18 == 1) {
                            this.f[i18].setHint(ob6.L0(2131747153));
                        } else if (i18 == 2) {
                            this.f[i18].setHint(ob6.L0(2131747151));
                        } else if (i18 == 3) {
                            this.f[i18].setHint(ob6.L0(2131747154));
                        } else if (i18 == 4) {
                            this.f[i18].setHint(ob6.L0(2131747104));
                        } else if (i18 == 5) {
                            this.f[i18].setHint(ob6.L0(2131747094));
                        }
                        if (i18 == 0) {
                            this.f[i18].addTextChangedListener(new u28(this));
                        } else if (i18 == 1) {
                            this.f[i18].addTextChangedListener(new v28(this));
                        }
                        int i21 = i16;
                        this.f[i18].setPadding(0, 0, 0, hl.L(6.0f));
                        this.f[i18].setGravity(ob6.a0 ? 5 : 3);
                        frameLayout3.addView(this.f[i18], tre.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final byte b19 = 4;
                        this.f[i18].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: y18
                            public final /* synthetic */ p b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                                byte b132 = b19;
                                p pVar = this.b;
                                switch (b132) {
                                    case 0:
                                        if (i132 == 6) {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (i132 == 6) {
                                            pVar.G0(false);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (i132 != 6) {
                                            if (i132 == 5) {
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
                                    case 3:
                                        if (i132 == 5) {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr4222 = pVar.f;
                                                if (intValue2 < editTextBoldCursorArr4222.length) {
                                                    if (intValue2 != 4 && ((View) editTextBoldCursorArr4222[intValue2].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue2].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i132 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    default:
                                        if (i132 == 5) {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                int i143 = intValue3 + 1;
                                                EditTextBoldCursor[] editTextBoldCursorArr52 = pVar.f;
                                                if (i143 < editTextBoldCursorArr52.length) {
                                                    intValue3 = i143 == 4 ? intValue3 + 2 : i143;
                                                    if (((View) editTextBoldCursorArr52[intValue3].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue3].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i132 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                        if (i18 == 3) {
                            this.L[0] = new sca(context, (Object) null);
                            this.R.addView(this.L[0], tre.o(-1, -2));
                        } else if (i18 == 5) {
                            this.L[2] = new sca(context, (Object) null);
                            this.R.addView(this.L[2], tre.o(-1, -2));
                            wkb wkbVar3 = new wkb(context, this.Z0);
                            this.M = wkbVar3;
                            yob.Q(wkbVar3, aob.L0(true), yob.M(i19), yob.M(aob.i6));
                            this.M.f(ob6.L0(2131747149), this.V0, false);
                            this.R.addView(this.M, tre.o(-1, -2));
                            this.M.setOnClickListener(new z18(this, (byte) 12));
                            this.N[0] = new ilb(context, this.Z0);
                            yob.Z(this.N[0], context, R.drawable.greydivider_bottom, aob.b7);
                            Q0();
                            this.R.addView(this.N[0], tre.o(-1, -2));
                        } else if (i18 == 0) {
                            a0(context);
                            frameLayout3.addView(this.P, tre.d(-2, -2.0f, (ob6.a0 ? 3 : 5) | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                        }
                        if (z6) {
                            t62 t62Var2 = new t62(context, b17);
                            yob.h(i19, getResourceProvider(), t62Var2);
                            this.K.add(t62Var2);
                            frameLayout3.addView(t62Var2, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if ((i18 == 4 && !this.h0) || ((i18 == 5 && !this.i0) || (i18 == 2 && !this.j0))) {
                            frameLayout3.setVisibility(8);
                        }
                        i18++;
                        i16 = i21;
                        i17 = 6;
                        i15 = 3;
                    }
                    if (!this.h0 && !this.i0) {
                        this.J[1].setVisibility(8);
                        this.L[0].setVisibility(8);
                    }
                    boolean z7 = this.i0;
                    EditTextBoldCursor[] editTextBoldCursorArr7 = this.f;
                    if (z7) {
                        editTextBoldCursorArr7[5].setImeOptions(268435462);
                    } else {
                        editTextBoldCursorArr7[3].setImeOptions(268435462);
                    }
                }
            } else if (b10 == 1) {
                ArrayList<TLRPC.TL_shippingOption> arrayList = this.F0.shipping_options;
                int size = arrayList == null ? 0 : arrayList.size();
                this.h = new i29[size];
                int i22 = 0;
                while (i22 < size) {
                    TLRPC.TL_shippingOption tL_shippingOption = this.F0.shipping_options.get(i22);
                    this.h[i22] = new i29(context);
                    this.h[i22].setTag(Integer.valueOf(i22));
                    yob.Q(this.h[i22], aob.L0(true), yob.M(aob.d6), yob.M(aob.i6));
                    this.h[i22].c(qd4.y(g0(tL_shippingOption.prices), " - ", tL_shippingOption.title), i22 == 0, i22 != size + (-1));
                    this.h[i22].setOnClickListener(new z18(this, (byte) 13));
                    this.R.addView(this.h[i22]);
                    i22++;
                }
                this.N[0] = new ilb(context, this.Z0);
                yob.Z(this.N[0], context, R.drawable.greydivider_bottom, aob.b7);
                this.R.addView(this.N[0], tre.o(-1, -2));
            } else {
                int i23 = jn7.M1;
                if (b10 == 3) {
                    this.f = new EditTextBoldCursor[2];
                    int i24 = 0;
                    for (int i25 = 2; i24 < i25; i25 = 2) {
                        if (i24 == 0) {
                            z = false;
                            this.J[0] = new mf5(context, this.Z0);
                            yob.h(aob.d6, getResourceProvider(), this.J[0]);
                            this.J[0].setText(ob6.L0(2131747146));
                            this.R.addView(this.J[0], tre.o(-1, -2));
                        } else {
                            z = false;
                        }
                        FrameLayout frameLayout4 = new FrameLayout(context);
                        frameLayout4.setClipChildren(z);
                        this.R.addView(frameLayout4, tre.o(-1, 50));
                        int i26 = aob.d6;
                        yob.h(i26, getResourceProvider(), frameLayout4);
                        boolean z8 = i24 != 1;
                        if (z8) {
                            if (i24 != 7 || this.D0.invoice.phone_requested) {
                                if (i24 == 6) {
                                    TLRPC.TL_invoice tL_invoice8 = this.D0.invoice;
                                    if (!tL_invoice8.phone_requested) {
                                    }
                                }
                            }
                            z8 = false;
                        }
                        if (z8) {
                            t62 t62Var3 = new t62(context, (byte) 14);
                            yob.h(i26, getResourceProvider(), t62Var3);
                            this.K.add(t62Var3);
                            frameLayout4.addView(t62Var3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        this.f[i24] = new EditTextBoldCursor(context);
                        this.f[i24].setTag(Integer.valueOf(i24));
                        this.f[i24].setTextSize(1, 16.0f);
                        yob.D(this.f[i24], aob.H6, getResourceProvider());
                        EditTextBoldCursor editTextBoldCursor6 = this.f[i24];
                        int i27 = aob.G6;
                        yob.X(editTextBoldCursor6, i27, getResourceProvider());
                        this.f[i24].setBackgroundDrawable(null);
                        yob.v(this.f[i24], i27, getResourceProvider());
                        this.f[i24].setCursorSize(hl.L(20.0f));
                        this.f[i24].setCursorWidth(1.5f);
                        EditTextBoldCursor[] editTextBoldCursorArr8 = this.f;
                        if (i24 == 0) {
                            editTextBoldCursorArr8[i24].setOnTouchListener(new b02((byte) 16));
                            this.f[i24].setInputType(0);
                        } else {
                            editTextBoldCursorArr8[i24].setInputType(jn7.M1);
                            this.f[i24].setTypeface(Typeface.DEFAULT);
                        }
                        this.f[i24].setImeOptions(268435462);
                        if (i24 == 0) {
                            EditTextBoldCursor editTextBoldCursor7 = this.f[i24];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.z0;
                            editTextBoldCursor7.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                        } else if (i24 == 1) {
                            this.f[i24].setHint(ob6.L0(2131748480));
                            this.f[i24].requestFocus();
                        }
                        this.f[i24].setPadding(0, 0, 0, hl.L(6.0f));
                        this.f[i24].setGravity(ob6.a0 ? 5 : 3);
                        frameLayout4.addView(this.f[i24], tre.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final byte b20 = 0;
                        this.f[i24].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: y18
                            public final /* synthetic */ p b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView2, int i132, KeyEvent keyEvent) {
                                byte b132 = b20;
                                p pVar = this.b;
                                switch (b132) {
                                    case 0:
                                        if (i132 == 6) {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (i132 == 6) {
                                            pVar.G0(false);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (i132 != 6) {
                                            if (i132 == 5) {
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
                                    case 3:
                                        if (i132 == 5) {
                                            int intValue2 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr4222 = pVar.f;
                                                if (intValue2 < editTextBoldCursorArr4222.length) {
                                                    if (intValue2 != 4 && ((View) editTextBoldCursorArr4222[intValue2].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue2].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i132 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    default:
                                        if (i132 == 5) {
                                            int intValue3 = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                int i143 = intValue3 + 1;
                                                EditTextBoldCursor[] editTextBoldCursorArr52 = pVar.f;
                                                if (i143 < editTextBoldCursorArr52.length) {
                                                    intValue3 = i143 == 4 ? intValue3 + 2 : i143;
                                                    if (((View) editTextBoldCursorArr52[intValue3].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue3].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i132 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                        if (i24 == 1) {
                            this.N[0] = new ilb(context, this.Z0);
                            ilb ilbVar2 = this.N[0];
                            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.z0;
                            ilbVar2.setText(ob6.Y(2131747133, "PaymentConfirmationMessage", tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                            ilb ilbVar3 = this.N[0];
                            int i28 = aob.b7;
                            yob.Z(ilbVar3, context, R.drawable.greydivider, i28);
                            this.R.addView(this.N[0], tre.o(-1, -2));
                            this.O[0] = new qmb(context, this.Z0);
                            yob.Q(this.O[0], aob.L0(true), yob.M(i26), yob.M(aob.i6));
                            this.O[0].b(ob6.L0(2131747132), false);
                            this.R.addView(this.O[0], tre.o(-1, -2));
                            this.O[0].setOnClickListener(new z18(this, b20));
                            this.N[1] = new ilb(context, this.Z0);
                            yob.Z(this.N[1], context, R.drawable.greydivider_bottom, i28);
                            this.R.addView(this.N[1], tre.o(-1, -2));
                        }
                        i24++;
                    }
                } else {
                    byte b21 = 15;
                    if (b10 == 4 || b10 == 5) {
                        a38 a38Var = new a38(context);
                        this.Y = a38Var;
                        yob.h(aob.d6, getResourceProvider(), a38Var);
                        r47 r47Var = this.O0;
                        if (r47Var != null) {
                            this.Y.b((TLRPC.TL_messageMediaInvoice) r47Var.k.media, this.q0);
                        } else {
                            TLRPC.PaymentReceipt paymentReceipt = this.E0;
                            if (paymentReceipt != null) {
                                this.Y.c(paymentReceipt, this.q0);
                            } else if (this.P0 != null || this.c1 != null) {
                                a38 a38Var2 = this.Y;
                                TLRPC.PaymentForm paymentForm3 = this.D0;
                                a38Var2.a(paymentForm3.title, paymentForm3.description, paymentForm3.photo, this.q0, paymentForm3);
                            }
                        }
                        this.R.addView(this.Y, tre.o(-1, -2));
                        this.L[0] = new sca(context, (Object) null);
                        this.R.addView(this.L[0], tre.o(-1, -2));
                        ArrayList arrayList2 = new ArrayList(this.D0.invoice.prices);
                        this.u0 = arrayList2;
                        TLRPC.TL_shippingOption tL_shippingOption2 = this.H0;
                        if (tL_shippingOption2 != null) {
                            arrayList2.addAll(tL_shippingOption2.prices);
                        }
                        this.S0 = new String[1];
                        for (int i29 = 0; i29 < this.u0.size(); i29++) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.u0.get(i29);
                            tlb tlbVar = new tlb(context);
                            yob.h(aob.d6, getResourceProvider(), tlbVar);
                            tlbVar.a(tL_labeledPrice.label, ob6.D0().p(tL_labeledPrice.amount, this.D0.invoice.currency), false);
                            this.R.addView(tlbVar);
                        }
                        if (this.v0 == 5 && this.I0 != null) {
                            tlb tlbVar2 = new tlb(context);
                            yob.h(aob.d6, getResourceProvider(), tlbVar2);
                            tlbVar2.a(ob6.L0(2131747084), ob6.D0().p(this.I0.longValue(), this.D0.invoice.currency), false);
                            this.R.addView(tlbVar2);
                        }
                        tlb tlbVar3 = new tlb(context);
                        this.S = tlbVar3;
                        int i30 = aob.d6;
                        yob.h(i30, getResourceProvider(), tlbVar3);
                        this.S0[0] = g0(this.u0);
                        this.S.a(ob6.L0(2131747080), this.S0[0], true);
                        float f = 14.0f;
                        if (this.v0 != 4 || (this.D0.invoice.flags & 256) == 0) {
                            i = -2;
                            str = "";
                        } else {
                            FrameLayout frameLayout5 = new FrameLayout(context);
                            frameLayout5.setClipChildren(false);
                            yob.h(i30, getResourceProvider(), frameLayout5);
                            this.R.addView(frameLayout5, tre.o(-1, this.D0.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                            frameLayout5.setOnClickListener(new z18(this, (byte) 1));
                            tlb tlbVar4 = new tlb(context);
                            yob.h(i30, getResourceProvider(), tlbVar4);
                            tlbVar4.a(ob6.L0(2131747083), "", false);
                            frameLayout5.addView(tlbVar4);
                            this.f = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                            this.f[0].setTag(0);
                            this.f[0].setTextSize(1, 16.0f);
                            EditTextBoldCursor editTextBoldCursor8 = this.f[0];
                            int i31 = aob.z6;
                            yob.D(editTextBoldCursor8, i31, getResourceProvider());
                            yob.X(this.f[0], i31, getResourceProvider());
                            this.f[0].setBackgroundDrawable(null);
                            yob.v(this.f[0], aob.G6, getResourceProvider());
                            this.f[0].setCursorSize(hl.L(20.0f));
                            this.f[0].setCursorWidth(1.5f);
                            this.f[0].setInputType(3);
                            this.f[0].setImeOptions(268435462);
                            str = "";
                            this.f[0].setHint(ob6.D0().p(0L, this.D0.invoice.currency));
                            this.f[0].setPadding(0, 0, 0, hl.L(6.0f));
                            this.f[0].setGravity(ob6.a0 ? 3 : 5);
                            frameLayout5.addView(this.f[0], tre.d(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                            this.f[0].addTextChangedListener(new e28(this));
                            this.f[0].setOnEditorActionListener(new mh((byte) 4));
                            this.f[0].requestFocus();
                            if (!this.D0.invoice.suggested_tip_amounts.isEmpty()) {
                                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                                horizontalScrollView.setVerticalScrollBarEnabled(false);
                                horizontalScrollView.setClipToPadding(false);
                                horizontalScrollView.setPadding(hl.L(21.0f), 0, hl.L(21.0f), 0);
                                horizontalScrollView.setFillViewport(true);
                                frameLayout5.addView(horizontalScrollView, tre.d(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                                int[] iArr = new int[1];
                                int[] iArr2 = new int[1];
                                int size2 = this.D0.invoice.suggested_tip_amounts.size();
                                f28 f28Var = new f28(context, size2, iArr, iArr2);
                                this.t0 = f28Var;
                                f28Var.setOrientation(0);
                                horizontalScrollView.addView(this.t0, tre.x(-1, 30, 51));
                                int themedColor = getThemedColor(aob.Vi);
                                int i32 = 0;
                                while (i32 < size2) {
                                    boolean z9 = ob6.a0;
                                    TLRPC.PaymentForm paymentForm4 = this.D0;
                                    long longValue = z9 ? paymentForm4.invoice.suggested_tip_amounts.get((size2 - i32) - 1).longValue() : paymentForm4.invoice.suggested_tip_amounts.get(i32).longValue();
                                    String p = ob6.D0().p(longValue, this.D0.invoice.currency);
                                    TextView textView2 = new TextView(context);
                                    textView2.setTextSize(1, f);
                                    textView2.setTypeface(hl.o());
                                    textView2.setLines(1);
                                    textView2.setTag(Long.valueOf(longValue));
                                    textView2.setMaxLines(1);
                                    textView2.setText(p);
                                    textView2.setPadding(hl.L(15.0f), 0, hl.L(15.0f), 0);
                                    yob.X(textView2, aob.Z8, getResourceProvider());
                                    textView2.setBackground(aob.b0(hl.L(15.0f), themedColor & 536870911));
                                    textView2.setSingleLine(true);
                                    textView2.setGravity(b17);
                                    this.t0.addView(textView2, tre.t(-2, -1, 19, 0, 0, i32 != size2 + (-1) ? 9 : 0, 0));
                                    textView2.setOnClickListener(new dg(this, textView2, longValue, (byte) 5));
                                    int L = hl.L(30.0f) + ((int) Math.ceil(textView2.getPaint().measureText(p)));
                                    textView2.setTag(R.id.width_tag, Integer.valueOf(L));
                                    iArr[0] = Math.max(iArr[0], L);
                                    iArr2[0] = iArr2[0] + L;
                                    i32++;
                                    i8 = -2;
                                    b17 = 17;
                                    f = 14.0f;
                                }
                            }
                            i = i8;
                        }
                        this.R.addView(this.S);
                        this.L[2] = new sca(context, (Object) null);
                        yob.Z(this.L[2], context, R.drawable.greydivider_bottom, aob.b7);
                        this.R.addView(this.L[2], tre.o(-1, i));
                        this.Z[0] = new g28(context);
                        yob.Q(this.Z[0], aob.L0(true), yob.M(aob.d6), yob.M(aob.i6));
                        dlb dlbVar = this.Z[0];
                        String str10 = this.y0;
                        dlbVar.b(R.drawable.msg_payment_card, (str10 == null || str10.length() <= 1) ? this.y0 : this.y0.substring(0, 1).toUpperCase() + this.y0.substring(1), ob6.L0(2131747141), true);
                        int i33 = ((this.W0 || this.X0) && ((str2 = this.y0) == null || str2.length() <= 1)) ? 8 : 0;
                        this.Z[0].setVisibility(i33);
                        this.R.addView(this.Z[0]);
                        if (this.v0 == 4) {
                            this.Z[0].setOnClickListener(new z18(this, (byte) 2));
                        }
                        TLRPC.User user2 = null;
                        for (int i34 = 0; i34 < this.D0.users.size(); i34++) {
                            TLRPC.User user3 = this.D0.users.get(i34);
                            if (user3.id == this.D0.provider_id) {
                                user2 = user3;
                            }
                        }
                        char c2 = 1;
                        this.Z[1] = new dlb(context);
                        dlb dlbVar2 = this.Z[1];
                        hf0 L0 = aob.L0(true);
                        int i35 = aob.d6;
                        uob M = yob.M(i35);
                        int i36 = aob.i6;
                        yob.Q(dlbVar2, L0, M, yob.M(i36));
                        if (user2 != null) {
                            dlb dlbVar3 = this.Z[1];
                            str3 = lv2.n(user2.first_name, user2.last_name);
                            String L02 = ob6.L0(2131747136);
                            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.J0;
                            dlbVar3.b(R.drawable.msg_payment_provider, str3, L02, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.H0 == null)) && ((tL_paymentRequestedInfo2 = this.D0.saved_info) == null || tL_paymentRequestedInfo2.shipping_address == null)) ? false : true);
                            c2 = 1;
                            this.R.addView(this.Z[1]);
                        } else {
                            str3 = str;
                        }
                        this.Z[c2].setVisibility(user2 != null ? i33 : 8);
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
                                this.X = new w28(this, context);
                                View view = new View(context);
                                yob.R(view, aob.f0(getThemedColor(i36), 2, -1), null, yob.M(i36), this.Z0);
                                this.X.addView(view, tre.c(-1.0f, -1));
                                frameLayout2.addView(this.X, tre.e(-1, 48, 80));
                                this.X.setOnClickListener(new uv5(this, str3, (byte) 15));
                                TextView textView3 = new TextView(context);
                                this.V = textView3;
                                int i37 = aob.Wi;
                                yob.X(textView3, i37, getResourceProvider());
                                this.V.setText(ob6.Z(2131747138, this.S0[0]));
                                this.V.setTextSize(1, 14.0f);
                                this.V.setGravity(17);
                                this.V.setTypeface(hl.o());
                                this.X.addView(this.V, tre.c(-1.0f, -1));
                                ww2 ww2Var2 = new ww2(context, 0);
                                this.s = ww2Var2;
                                ww2Var2.setVisibility(4);
                                int themedColor2 = getThemedColor(i37);
                                this.s.a(805306367 & themedColor2, themedColor2);
                                this.X.addView(this.s, tre.c(-1.0f, -1));
                                this.X.a(this.G, false);
                                this.V.setAlpha(!this.G ? 0.8f : 1.0f);
                                this.n.setEnabled(false);
                                this.n.getContentView().setVisibility(4);
                                hl.u(context, true);
                                try {
                                    l28 l28Var = new l28(context);
                                    this.x = l28Var;
                                    l28Var.setBackgroundColor(-1);
                                    this.x.getSettings().setJavaScriptEnabled(true);
                                    this.x.getSettings().setDomStorageEnabled(true);
                                    this.x.getSettings().setSupportZoom(true);
                                    this.x.getSettings().setBuiltInZoomControls(true);
                                    this.x.getSettings().setDisplayZoomControls(false);
                                    this.x.getSettings().setUseWideViewPort(true);
                                    this.x.getSettings().setMixedContentMode(0);
                                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.x, true);
                                    this.x.setWebViewClient(new m28(this, context, (byte) 0));
                                } catch (Exception e6) {
                                    cc4.f(e6);
                                }
                                this.W = null;
                                if (this.D0.invoice.terms_url != null) {
                                    b69 b69Var = new b69(context, getResourceProvider());
                                    this.W = b69Var;
                                    b69Var.setChecked(this.G);
                                    if (TextUtils.isEmpty(this.q0)) {
                                        String L03 = ob6.L0(2131747143);
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L03);
                                        int indexOf = L03.indexOf(42);
                                        int lastIndexOf = L03.lastIndexOf(42);
                                        spannableStringBuilder = spannableStringBuilder2;
                                        spannableStringBuilder = spannableStringBuilder2;
                                        if (indexOf != -1 && lastIndexOf != -1) {
                                            SpannableString spannableString = new SpannableString(L03.substring(indexOf + 1, lastIndexOf));
                                            spannableString.setSpan(new f8c(this.D0.invoice.terms_url), 0, spannableString.length(), 33);
                                            int i38 = lastIndexOf + 1;
                                            spannableStringBuilder2.replace(indexOf, i38, (CharSequence) spannableString);
                                            L03.substring(0, indexOf);
                                            spannableString.toString();
                                            L03.substring(i38);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                    } else {
                                        String L04 = ob6.L0(2131747144);
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(L04);
                                        int indexOf2 = L04.indexOf(42);
                                        int lastIndexOf2 = L04.lastIndexOf(42);
                                        if (indexOf2 != -1 && lastIndexOf2 != -1) {
                                            SpannableString spannableString2 = new SpannableString(L04.substring(indexOf2 + 1, lastIndexOf2));
                                            spannableString2.setSpan(new f8c(this.D0.invoice.terms_url), 0, spannableString2.length(), 33);
                                            int i39 = lastIndexOf2 + 1;
                                            spannableStringBuilder3.replace(indexOf2, i39, (CharSequence) spannableString2);
                                            L04 = L04.substring(0, indexOf2) + ((Object) spannableString2) + L04.substring(i39);
                                        }
                                        int indexOf3 = L04.indexOf("%1$s");
                                        spannableStringBuilder = spannableStringBuilder3;
                                        if (indexOf3 != -1) {
                                            spannableStringBuilder3.replace(indexOf3, indexOf3 + 4, (CharSequence) this.q0);
                                            spannableStringBuilder3.setSpan(new y7c(hl.o()), indexOf3, this.q0.length() + indexOf3, 33);
                                            spannableStringBuilder = spannableStringBuilder3;
                                        }
                                    }
                                    this.W.setText(spannableStringBuilder);
                                    b69 b69Var2 = this.W;
                                    int i40 = aob.d6;
                                    int themedColor3 = getThemedColor(i40);
                                    int i41 = aob.i6;
                                    yob.R(b69Var2, aob.g0(themedColor3, getThemedColor(i41)), yob.M(i40), yob.M(i41), getResourceProvider());
                                    this.W.setOnClickListener(new z18(this, (byte) 7));
                                    frameLayout2.addView(this.W, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                                }
                                WebView webView = this.x;
                                if (webView != null) {
                                    frameLayout2.addView(webView, tre.c(-1.0f, -1));
                                    this.x.setVisibility(8);
                                }
                            }
                            this.L[1] = new sca(context, (Object) null);
                            yob.Z(this.L[1], context, R.drawable.greydivider_bottom, aob.b7);
                            if (i33 == 0 && this.v0 == 4 && this.J0 == null && ((paymentForm = this.D0) == null || paymentForm.saved_info == null)) {
                                c = 1;
                                this.L[1].setVisibility(i33);
                            } else {
                                c = 1;
                            }
                            this.R.addView(this.L[c], tre.o(-1, i));
                        } else {
                            tL_paymentRequestedInfo = tL_payments_validateRequestedInfo2.info;
                        }
                        this.Z[2] = new dlb(context);
                        this.Z[2].setVisibility(8);
                        this.R.addView(this.Z[2]);
                        if (tL_paymentRequestedInfo.shipping_address != null) {
                            this.Z[2].setVisibility(0);
                            byte b22 = this.v0;
                            dlb[] dlbVarArr = this.Z;
                            if (b22 == 4) {
                                yob.Q(dlbVarArr[2], aob.L0(true), yob.M(i35), yob.M(i36));
                                b = 3;
                                this.Z[2].setOnClickListener(new z18(this, b));
                            } else {
                                b = 3;
                                yob.h(i35, getResourceProvider(), dlbVarArr[2]);
                            }
                        } else {
                            b = 3;
                        }
                        this.Z[b] = new dlb(context);
                        this.Z[b].setVisibility(8);
                        this.R.addView(this.Z[b]);
                        if (tL_paymentRequestedInfo.name != null) {
                            this.Z[b].setVisibility(0);
                            byte b23 = this.v0;
                            dlb[] dlbVarArr2 = this.Z;
                            b2 = 4;
                            if (b23 == 4) {
                                yob.Q(dlbVarArr2[b], aob.L0(true), yob.M(i35), yob.M(i36));
                                this.Z[b].setOnClickListener(new z18(this, b2));
                            } else {
                                yob.h(i35, getResourceProvider(), dlbVarArr2[b]);
                            }
                        } else {
                            b2 = 4;
                        }
                        this.Z[b2] = new dlb(context);
                        this.Z[b2].setVisibility(8);
                        this.R.addView(this.Z[b2]);
                        if (tL_paymentRequestedInfo.phone != null) {
                            this.Z[b2].setVisibility(0);
                            byte b24 = this.v0;
                            dlb[] dlbVarArr3 = this.Z;
                            if (b24 == b2) {
                                yob.Q(dlbVarArr3[b2], aob.L0(true), yob.M(i35), yob.M(i36));
                                b3 = 5;
                                this.Z[b2].setOnClickListener(new z18(this, b3));
                            } else {
                                b3 = 5;
                                yob.h(i35, getResourceProvider(), dlbVarArr3[b2]);
                            }
                        } else {
                            b3 = 5;
                        }
                        this.Z[b3] = new dlb(context);
                        this.Z[b3].setVisibility(8);
                        this.R.addView(this.Z[b3]);
                        if (tL_paymentRequestedInfo.email != null) {
                            this.Z[b3].setVisibility(0);
                            byte b25 = this.v0;
                            dlb[] dlbVarArr4 = this.Z;
                            if (b25 == 4) {
                                yob.Q(dlbVarArr4[b3], aob.L0(true), yob.M(i35), yob.M(i36));
                                this.Z[b3].setOnClickListener(new z18(this, (byte) 6));
                            } else {
                                yob.h(i35, getResourceProvider(), dlbVarArr4[b3]);
                            }
                        }
                        if (this.H0 != null) {
                            this.Z[6] = new dlb(context);
                            yob.h(i35, getResourceProvider(), this.Z[6]);
                            this.Z[6].b(R.drawable.msg_payment_delivery, this.H0.title, ob6.L0(2131747135), false);
                            this.R.addView(this.Z[6]);
                        }
                        H0(tL_paymentRequestedInfo);
                        if (this.v0 == 4) {
                        }
                        this.L[1] = new sca(context, (Object) null);
                        yob.Z(this.L[1], context, R.drawable.greydivider_bottom, aob.b7);
                        if (i33 == 0) {
                        }
                        c = 1;
                        this.R.addView(this.L[c], tre.o(-1, i));
                    } else if (b10 == 6) {
                        ku3 ku3Var = new ku3(context);
                        this.T = ku3Var;
                        ku3Var.a(ob6.L0(2131747174));
                        ku3 ku3Var2 = this.T;
                        int i42 = aob.d6;
                        yob.h(i42, getResourceProvider(), ku3Var2);
                        EditTextBoldCursor textView4 = this.T.getTextView();
                        textView4.setInputType(3);
                        textView4.setImeOptions(6);
                        final byte b26 = 1;
                        textView4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: y18
                            public final /* synthetic */ p b;

                            {
                                this.b = this;
                            }

                            @Override // android.widget.TextView.OnEditorActionListener
                            public final boolean onEditorAction(TextView textView22, int i132, KeyEvent keyEvent) {
                                byte b132 = b26;
                                p pVar = this.b;
                                switch (b132) {
                                    case 0:
                                        if (i132 == 6) {
                                            pVar.n.performClick();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (i132 == 6) {
                                            pVar.G0(false);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        if (i132 != 6) {
                                            if (i132 == 5) {
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
                                    case 3:
                                        if (i132 == 5) {
                                            int intValue2 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                intValue2++;
                                                EditTextBoldCursor[] editTextBoldCursorArr4222 = pVar.f;
                                                if (intValue2 < editTextBoldCursorArr4222.length) {
                                                    if (intValue2 != 4 && ((View) editTextBoldCursorArr4222[intValue2].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue2].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i132 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                    default:
                                        if (i132 == 5) {
                                            int intValue3 = ((Integer) textView22.getTag()).intValue();
                                            while (true) {
                                                int i143 = intValue3 + 1;
                                                EditTextBoldCursor[] editTextBoldCursorArr52 = pVar.f;
                                                if (i143 < editTextBoldCursorArr52.length) {
                                                    intValue3 = i143 == 4 ? intValue3 + 2 : i143;
                                                    if (((View) editTextBoldCursorArr52[intValue3].getParent()).getVisibility() == 0) {
                                                        pVar.f[intValue3].requestFocus();
                                                    }
                                                }
                                            }
                                        } else if (i132 == 6) {
                                            pVar.n.performClick();
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                        textView4.addTextChangedListener(new o28(this, (byte) 0));
                        this.R.addView(this.T, tre.o(-1, -2));
                        this.N[2] = new ilb(context, this.Z0);
                        yob.Z(this.N[2], context, R.drawable.greydivider, aob.b7);
                        this.R.addView(this.N[2], tre.o(-1, -2));
                        this.O[1] = new qmb(context, this.Z0);
                        qmb qmbVar = this.O[1];
                        hf0 L05 = aob.L0(true);
                        uob M2 = yob.M(i42);
                        int i43 = aob.i6;
                        yob.Q(qmbVar, L05, M2, yob.M(i43));
                        qmb qmbVar2 = this.O[1];
                        int i44 = aob.G6;
                        qmbVar2.setTag(Integer.valueOf(i44));
                        yob.X(this.O[1].getTextView(), i44, getResourceProvider());
                        this.O[1].b(ob6.L0(2131745848), true);
                        this.R.addView(this.O[1], tre.o(-1, -2));
                        this.O[1].setOnClickListener(new z18(this, (byte) 8));
                        this.O[0] = new qmb(context, this.Z0);
                        yob.Q(this.O[0], aob.L0(true), yob.M(i42), yob.M(i43));
                        qmb qmbVar3 = this.O[0];
                        int i45 = aob.p7;
                        qmbVar3.setTag(Integer.valueOf(i45));
                        yob.X(this.O[0].getTextView(), i45, getResourceProvider());
                        this.O[0].b(ob6.L0(2131754944), false);
                        this.R.addView(this.O[0], tre.o(-1, -2));
                        this.O[0].setOnClickListener(new z18(this, b11));
                        this.f = new EditTextBoldCursor[3];
                        int i46 = 0;
                        for (int i47 = 3; i46 < i47; i47 = 3) {
                            if (i46 == 0) {
                                this.J[0] = new mf5(context, this.Z0);
                                yob.h(aob.d6, getResourceProvider(), this.J[0]);
                                this.J[0].setText(ob6.L0(2131747113));
                                this.R.addView(this.J[0], tre.o(-1, -2));
                            } else if (i46 == 2) {
                                this.J[1] = new mf5(context, this.Z0);
                                yob.h(aob.d6, getResourceProvider(), this.J[1]);
                                this.J[1].setText(ob6.L0(2131747117));
                                this.R.addView(this.J[1], tre.o(-1, -2));
                            }
                            FrameLayout frameLayout6 = new FrameLayout(context);
                            frameLayout6.setClipChildren(false);
                            this.R.addView(frameLayout6, tre.o(-1, 50));
                            int i48 = aob.d6;
                            yob.h(i48, getResourceProvider(), frameLayout6);
                            if (i46 == 0) {
                                t62 t62Var4 = new t62(context, b21);
                                yob.h(i48, getResourceProvider(), t62Var4);
                                this.K.add(t62Var4);
                                frameLayout6.addView(t62Var4, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                            this.f[i46] = new EditTextBoldCursor(context);
                            this.f[i46].setTag(Integer.valueOf(i46));
                            this.f[i46].setTextSize(1, 16.0f);
                            yob.D(this.f[i46], aob.H6, getResourceProvider());
                            EditTextBoldCursor editTextBoldCursor9 = this.f[i46];
                            int i49 = aob.G6;
                            yob.X(editTextBoldCursor9, i49, getResourceProvider());
                            this.f[i46].setBackgroundDrawable(null);
                            yob.v(this.f[i46], i49, getResourceProvider());
                            this.f[i46].setCursorSize(hl.L(20.0f));
                            this.f[i46].setCursorWidth(1.5f);
                            if (i46 == 0 || i46 == 1) {
                                this.f[i46].setInputType(i23);
                                this.f[i46].setTypeface(Typeface.DEFAULT);
                                this.f[i46].setImeOptions(268435461);
                            } else {
                                this.f[i46].setInputType(33);
                                this.f[i46].setImeOptions(268435462);
                            }
                            if (i46 == 0) {
                                this.f[i46].setHint(ob6.L0(2131747116));
                                this.f[i46].requestFocus();
                            } else if (i46 == 1) {
                                this.f[i46].setHint(ob6.L0(2131747114));
                            } else if (i46 == 2) {
                                this.f[i46].setHint(ob6.L0(2131747119));
                            }
                            this.f[i46].setPadding(0, 0, 0, hl.L(6.0f));
                            this.f[i46].setGravity(ob6.a0 ? 5 : 3);
                            frameLayout6.addView(this.f[i46], tre.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            final byte b27 = 2;
                            this.f[i46].setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: y18
                                public final /* synthetic */ p b;

                                {
                                    this.b = this;
                                }

                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView22, int i132, KeyEvent keyEvent) {
                                    byte b132 = b27;
                                    p pVar = this.b;
                                    switch (b132) {
                                        case 0:
                                            if (i132 == 6) {
                                                pVar.n.performClick();
                                                break;
                                            }
                                            break;
                                        case 1:
                                            if (i132 == 6) {
                                                pVar.G0(false);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (i132 != 6) {
                                                if (i132 == 5) {
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
                                        case 3:
                                            if (i132 == 5) {
                                                int intValue2 = ((Integer) textView22.getTag()).intValue();
                                                while (true) {
                                                    intValue2++;
                                                    EditTextBoldCursor[] editTextBoldCursorArr4222 = pVar.f;
                                                    if (intValue2 < editTextBoldCursorArr4222.length) {
                                                        if (intValue2 != 4 && ((View) editTextBoldCursorArr4222[intValue2].getParent()).getVisibility() == 0) {
                                                            pVar.f[intValue2].requestFocus();
                                                        }
                                                    }
                                                }
                                            } else if (i132 == 6) {
                                                pVar.n.performClick();
                                            }
                                            break;
                                        default:
                                            if (i132 == 5) {
                                                int intValue3 = ((Integer) textView22.getTag()).intValue();
                                                while (true) {
                                                    int i143 = intValue3 + 1;
                                                    EditTextBoldCursor[] editTextBoldCursorArr52 = pVar.f;
                                                    if (i143 < editTextBoldCursorArr52.length) {
                                                        intValue3 = i143 == 4 ? intValue3 + 2 : i143;
                                                        if (((View) editTextBoldCursorArr52[intValue3].getParent()).getVisibility() == 0) {
                                                            pVar.f[intValue3].requestFocus();
                                                        }
                                                    }
                                                }
                                            } else if (i132 == 6) {
                                                pVar.n.performClick();
                                            }
                                            break;
                                    }
                                    return true;
                                }
                            });
                            if (i46 == 1) {
                                this.N[0] = new ilb(context, this.Z0);
                                this.N[0].setText(ob6.L0(2131747115));
                                yob.Z(this.N[0], context, R.drawable.greydivider, aob.b7);
                                this.R.addView(this.N[0], tre.o(-1, -2));
                            } else if (i46 == 2) {
                                this.N[1] = new ilb(context, this.Z0);
                                this.N[1].setText(ob6.L0(2131747118));
                                yob.Z(this.N[1], context, R.drawable.greydivider_bottom, aob.b7);
                                this.R.addView(this.N[1], tre.o(-1, -2));
                            }
                            i46++;
                            i23 = jn7.M1;
                        }
                        P0();
                    }
                }
            }
        }
        return this.fragmentView;
    }

    public final long d0() {
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

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.p0) {
            TLRPC.PaymentForm paymentForm = this.D0;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            Q0();
            return;
        }
        if (i == jn7.r0) {
            TLRPC.PaymentForm paymentForm2 = this.D0;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            Q0();
            return;
        }
        if (i == jn7.a1) {
            this.b1 = true;
            removeSelfFromStack();
        }
    }

    public final long e0() {
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
        return wf3.m(inputPeer);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String f0(ArrayList arrayList) {
        String str;
        double d;
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        ob6.D0();
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

    public final String g0(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        Long l = this.I0;
        if (l != null) {
            j += l.longValue();
        }
        return ob6.D0().p(j, this.D0.invoice.currency);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        return this.Z0;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.F, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.C8));
        arrayList.add(new apb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D8));
        if (this.f != null) {
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new apb((View) editTextBoldCursorArr[i].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
                i++;
            }
        } else {
            arrayList.add(new apb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
            arrayList.add(new apb((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
        }
        if (this.h != null) {
            for (int i2 = 0; i2 < this.h.length; i2++) {
            }
        }
        int i3 = 0;
        while (true) {
            mf5[] mf5VarArr = this.J;
            if (i3 >= mf5VarArr.length) {
                break;
            }
            arrayList.add(new apb(mf5VarArr[i3], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
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
            arrayList.add(new apb((View) arrayList2.get(i6), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
            i6++;
        }
        int i7 = 1;
        arrayList.add(new apb(this.M, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.M, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        for (int i8 = 0; i8 < this.O.length; i8++) {
        }
        arrayList.add(new apb(this.V, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s6));
        while (true) {
            dlb[] dlbVarArr = this.Z;
            if (i7 >= dlbVarArr.length) {
                arrayList.add(new apb(this.X, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
                arrayList.add(new apb(this.X, TLObject.FLAG_28, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i6));
                return arrayList;
            }
            arrayList.add(new apb(dlbVarArr[i7], 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
            i7++;
        }
    }

    public final void h0() {
        int i;
        int i2;
        boolean z;
        byte b = this.v0;
        byte b2 = 3;
        byte b3 = 2;
        if (b == 0) {
            y28 y28Var = this.U;
            if (y28Var != null) {
                y28Var.d(this.J0);
                finishFragment();
                return;
            }
            if (this.D0.invoice.flexible) {
                i = 1;
            } else if (this.z0 == null && this.x0 == null) {
                i = 2;
            } else {
                if (yac.h(this.currentAccount).y != null && yac.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    yac.h(this.currentAccount).y = null;
                    yac.h(this.currentAccount).u(false);
                }
                i = yac.h(this.currentAccount).y != null ? 4 : 3;
            }
            if (i == 2 && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                M0(new x18(this, b3));
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
                    if (yac.h(this.currentAccount).y != null && yac.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                        yac.h(this.currentAccount).y = null;
                        yac.h(this.currentAccount).u(false);
                    }
                    if (yac.h(this.currentAccount).y == null) {
                        i2 = 3;
                    }
                } else {
                    i2 = 2;
                }
                if (i2 != 2 && this.y0 == null && this.z0 == null && this.x0 == null && !this.D0.additional_methods.isEmpty()) {
                    M0(new x18(this, b3));
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
                pVar4.U = new q28(this);
                presentFragment(pVar4, this.T0);
                return;
            }
            y28 y28Var2 = this.U;
            if (y28Var2 != null) {
                y28Var2.c(this.x0, this.y0, this.V0, this.K0, null);
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
        int i3 = jn7.a1;
        if (z2) {
            jn7.f(this.currentAccount).n(this, i3);
        }
        jn7.f(this.currentAccount).k(i3, new Object[0]);
        if (getMessagesController().c4 != null) {
            hl.d3(new x18(this, b2), 500L);
        } else {
            if (B0(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, r47 r47Var, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.e eVar, boolean z2) {
        if (eVar != null) {
            this.currentAccount = eVar.getCurrentAccount();
        }
        this.v0 = i;
        this.s0 = eVar;
        this.x0 = str2;
        this.K0 = tL_inputPaymentCredentialsGooglePay;
        this.F0 = tL_payments_validatedRequestedInfo;
        this.D0 = paymentForm;
        this.H0 = tL_shippingOption;
        this.I0 = l;
        this.O0 = r47Var;
        this.P0 = str;
        this.c1 = inputInvoice;
        this.V0 = z;
        this.X0 = z2;
        this.T0 = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.D0.native_provider)) ? false : true;
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(paymentForm.bot_id));
        this.m0 = X1;
        if (X1 != null) {
            this.q0 = X1.first_name;
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.H;
    }

    public final void j0(Context context) {
        Optional empty;
        if (getParentActivity() != null) {
            e00 e00Var = new e00();
            byte b = this.D0.invoice.test ? (byte) 3 : (byte) 1;
            if (b != 2 && b != 1 && b != 3) {
                Locale locale = Locale.US;
                lq5.j(uh9.k(b, "Invalid environment value "));
                return;
            }
            e00Var.a = b;
            this.e = new qa4(context, soc.a, new roc(e00Var), g05.c);
            byte b2 = 0;
            try {
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                put.put("allowedPaymentMethods", new JSONArray().put(c0()));
                empty = Optional.of(put);
            } catch (JSONException unused) {
                empty = Optional.empty();
            }
            if (empty.isPresent()) {
                String jSONObject = ((JSONObject) empty.get()).toString();
                pt5 pt5Var = new pt5();
                xve.i(jSONObject, "isReadyToPayRequestJson cannot be null!");
                pt5Var.f = jSONObject;
                qa4 qa4Var = this.e;
                qa4Var.getClass();
                wjb b3 = xjb.b();
                b3.d = (char) 23705;
                b3.a = new ve9((Object) pt5Var, (byte) 24);
                qa4Var.e(0, b3.a()).addOnCompleteListener(getParentActivity(), new b28(this, b2));
            }
        }
    }

    public final void k0(TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        N0(true, false);
        J0(false);
        if (tLObject != null) {
            this.w0 = true;
            yac.h(this.currentAccount).y = (TL_account.tmpPassword) tLObject;
            yac.h(this.currentAccount).u(false);
            h0();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            jj.c0(this.currentAccount, tL_error, this, gettmppassword, new Object[0]);
            return;
        }
        try {
            this.f[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        hl.A3(3.25f, this.f[1], null);
        this.f[1].setText("");
    }

    public final /* synthetic */ void l0(TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] c = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? es9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        pl7 pl7Var = new pl7(this, gettmppassword, (byte) 6);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            pl7Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP d = es9.d(c, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = d;
        if (d != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, pl7Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        pl7Var.run(null, tL_error2);
    }

    public final void m0(TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            jj.c0(this.currentAccount, tL_error, this, getpassword, new Object[0]);
            N0(true, false);
            J0(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.a0(password, false)) {
            jj.u0(getParentActivity(), ob6.M0(2131743475, null), true);
        } else if (password.has_password) {
            Utilities.e.c(new gd7((Object) this, (Object) password, (Object) hl.g1(str), (byte) 22));
        } else {
            this.w0 = false;
            h0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r8.phone_requested == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d7, code lost:
    
        if (r23.K0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e1, code lost:
    
        if (r2.invoice.flexible != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(View view, String str) {
        int i;
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo;
        b69 b69Var = this.W;
        if (b69Var != null && !this.G) {
            this.a0 = -this.a0;
            hl.A3(this.a0, b69Var.getTextView(), null);
            hl.A3(this.a0, this.W.getCheckBox(), null);
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
            ql7 ql7Var = new ql7(this, view, (byte) 24);
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
                    tL_inputInvoiceMessage.peer = getMessagesController().m1(this.O0.k.peer_id);
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new m65(this, ql7Var, tL_payments_validateRequestedInfo2, (byte) 25), (this.X0 ? 8 : 0) | 2);
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
                            M0(new vc(view, (byte) 4));
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
            if (yac.h(this.currentAccount).y != null && yac.h(this.currentAccount).y.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                yac.h(this.currentAccount).y = null;
                yac.h(this.currentAccount).u(false);
            }
            if (yac.h(this.currentAccount).y == null) {
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
                jn7.f(this.currentAccount).n(this, jn7.a1);
            }
        }
        TLRPC.User user = this.m0;
        if (user == null || user.verified) {
            O0(this.S0[0]);
            return;
        }
        String str2 = "payment_warning_" + this.m0.id;
        SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).X3;
        if (sharedPreferences.getBoolean(str2, false)) {
            O0(this.S0[0]);
            return;
        }
        sharedPreferences.edit().putBoolean(str2, true).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131747079, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.a0("PaymentWarningText", null, 2131747078, this.q0, str);
        alertDialog$Builder.j(ob6.M0(2131751736, null), new b28(this, b));
        showDialog(idVar);
    }

    public final void o0() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new xe2((byte) 0), this.X0 ? (byte) 8 : (byte) 0);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131745847, null);
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(R.string.AppName, null);
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        showDialog(idVar);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i == 991) {
            hl.c3(new l65((Object) this, i2, (Object) intent, (byte) 22));
        }
    }

    @Override // org.telegram.ui.ActionBar.e
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

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.v0 == 4 && this.Y0) {
            this.Y0 = false;
            this.X.callOnClick();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.p0);
        jn7.f(this.currentAccount).b(this, jn7.r0);
        if (this.v0 != 4 || this.W0) {
            jn7.f(this.currentAccount).a(this, jn7.a1);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        y28 y28Var = this.U;
        if (y28Var != null) {
            y28Var.b();
        }
        int i = 0;
        hl.u(getParentActivity(), false);
        if (!this.b1) {
            this.g1 = 2;
            if (this.a1 != null) {
                wk5 wk5Var = this.parentLayout;
                if (wk5Var != null && wk5Var.getFragmentStack() != null) {
                    int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
                    if (indexOf == -1) {
                        indexOf = this.parentLayout.getFragmentStack().size();
                    }
                    while (true) {
                        if (i >= this.parentLayout.getFragmentStack().size()) {
                            i = indexOf;
                            break;
                        } else if (((org.telegram.ui.ActionBar.e) this.parentLayout.getFragmentStack().get(i)) instanceof p) {
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
        jn7.f(this.currentAccount).n(this, jn7.p0);
        jn7.f(this.currentAccount).n(this, jn7.r0);
        if (this.v0 != 4 || this.W0) {
            jn7.f(this.currentAccount).n(this, jn7.a1);
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
                cc4.g(e, true);
            }
        }
        try {
            byte b = this.v0;
            if ((b == 2 || b == 6) && (xea.r.length() == 0 || xea.z)) {
                getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
                hl.f2();
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        super.onFragmentDestroy();
        this.R0 = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        try {
            byte b = this.v0;
            if ((b == 2 || b == 6) && !this.D0.invoice.test) {
                getParentActivity().getWindow().setFlags(TLObject.FLAG_13, TLObject.FLAG_13);
                hl.f2();
            } else if (xea.r.length() == 0 || xea.z) {
                getParentActivity().getWindow().clearFlags(TLObject.FLAG_13);
                hl.f2();
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            ScrollView scrollView = this.F;
            if (scrollView != null) {
                hl.u3(scrollView, getThemedColor(aob.s8));
            }
            if (this.f == null) {
                return;
            }
            getThemedColor(aob.G6);
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f;
                if (i >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                if (editTextBoldCursor != null) {
                    yob.l(editTextBoldCursor, 30, aob.G6, this.Z0);
                }
                i++;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
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
        byte b2 = 0;
        if (b == 2) {
            hl.d3(new x18(this, b2), 100L);
            return;
        }
        if (b == 3) {
            this.f[1].requestFocus();
            hl.E3(this.f[1]);
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
        hl.E3(this.f[0]);
    }

    public final void p0(TLObject tLObject) {
        org.telegram.ui.ActionBar.e Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            nza.n1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.Z0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        bg0 bg0Var = new bg0();
        bg0Var.a = true;
        p pVar = new p((TLRPC.PaymentReceipt) tLObject);
        pVar.d1 = this.d1;
        pVar.e1 = this.e1;
        Q.showAsSheet(pVar, bg0Var);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean presentFragment(org.telegram.ui.ActionBar.e eVar) {
        C0(eVar);
        return super.presentFragment(eVar);
    }

    public final /* synthetic */ void q0(v21 v21Var, boolean z, TLRPC.Message[] messageArr) {
        v21Var.b();
        byte b = 0;
        if (!z) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = uc7.s1(this.currentAccount).m1(messageArr[0].peer_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new w18(this, b), 2);
            return;
        }
        org.telegram.ui.ActionBar.e S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(zu1.ga(messageArr[0].id, r47.B0(messageArr[0])));
        }
    }

    public final void r0(TLObject tLObject) {
        org.telegram.ui.ActionBar.e Q;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            nza.n1(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.Z0);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        bg0 bg0Var = new bg0();
        bg0Var.a = true;
        p pVar = new p((TLRPC.PaymentReceipt) tLObject);
        pVar.d1 = this.d1;
        pVar.e1 = this.e1;
        Q.showAsSheet(pVar, bg0Var);
    }

    public final /* synthetic */ void s0(v21 v21Var, boolean z, TLRPC.Message message) {
        v21Var.b();
        if (!z) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = uc7.s1(this.currentAccount).m1(message.peer_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new w18(this, (byte) 3), 2);
            return;
        }
        org.telegram.ui.ActionBar.e S = LaunchActivity.S();
        if (S != null) {
            S.presentFragment(zu1.ga(message.id, r47.B0(message)));
        }
    }

    public final /* synthetic */ void t0(TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        jj.c0(this.currentAccount, tL_error, this, tL_payments_sendPaymentForm, new Object[0]);
        J0(false);
        N0(false, false);
        this.b1 = true;
        this.g1 = 4;
        z28 z28Var = this.a1;
        if (z28Var != null) {
            z28Var.c(4);
        }
    }

    public final /* synthetic */ void u0(TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        this.F0 = tL_payments_validatedRequestedInfo;
        byte b = 0;
        if (this.D0.saved_info != null && !this.U0) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_clearSavedInfo, new xe2(b), this.X0 ? 8 : 0);
        }
        h0();
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
                    jj.c0(this.currentAccount, tL_error, this, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public final void x0(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new q81((byte) 8, this, z), 8);
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
            h0();
            return;
        }
        if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
            if (tL_error.text.equals("EMAIL_INVALID")) {
                L0(ob6.M0(R.string.AppName, null), ob6.M0(2131747172, null));
                return;
            } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                L0(ob6.M0(R.string.AppName, null), tL_error.text);
                return;
            } else {
                int intValue = Utilities.z(tL_error.text).intValue();
                L0(ob6.M0(R.string.AppName, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                return;
            }
        }
        this.d0 = Utilities.z(tL_error.text).intValue();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(ob6.M0(2131747558, null), new rm6(this, str, (byte) 16));
        String M0 = ob6.M0(2131742452, null);
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(2131742453, null);
        Dialog showDialog = showDialog(idVar);
        if (showDialog != null) {
            showDialog.setCanceledOnTouchOutside(false);
            showDialog.setCancelable(false);
        }
    }

    public final /* synthetic */ void y0(boolean z, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        vi1 vi1Var = new vi1((Object) this, z, (Object) str, (byte) 10);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, vi1Var, 10);
            return;
        }
        byte[] g1 = hl.g1(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.b0.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            vi1Var.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = es9.b(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            vi1Var.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, vi1Var, 10);
    }

    public final /* synthetic */ void z0(TLObject tLObject, TLRPC.TL_error tL_error) {
        J0(false);
        N0(true, false);
        if (tL_error != null) {
            jj.c0(this.currentAccount, tL_error, this, tLObject, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean presentFragment(org.telegram.ui.ActionBar.e eVar, boolean z) {
        C0(eVar);
        return super.presentFragment(eVar, z);
    }

    public p(TLRPC.PaymentForm paymentForm, r47 r47Var, String str, org.telegram.ui.ActionBar.e eVar) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new mf5[3];
        this.K = new ArrayList();
        this.L = new sca[3];
        this.N = new ilb[3];
        this.O = new qmb[2];
        this.Z = new dlb[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        this.W0 = true;
        i0(null, paymentForm, r47Var, str, 4, null, null, null, null, null, null, false, null, eVar, false);
    }

    public p(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, r47 r47Var, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, org.telegram.ui.ActionBar.e eVar, boolean z2) {
        super(null);
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.H = true;
        this.J = new mf5[3];
        this.K = new ArrayList();
        this.L = new sca[3];
        this.N = new ilb[3];
        this.O = new qmb[2];
        this.Z = new dlb[7];
        this.a0 = -4.5f;
        this.d0 = 6;
        i0(inputInvoice, paymentForm, r47Var, str, i, tL_payments_validatedRequestedInfo, tL_shippingOption, l, str2, str3, tL_payments_validateRequestedInfo, z, tL_inputPaymentCredentialsGooglePay, eVar, z2);
    }

    public p(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, org.telegram.ui.ActionBar.e eVar) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, eVar, false);
        this.W0 = true;
    }
}
