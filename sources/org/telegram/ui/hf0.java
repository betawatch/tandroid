package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hf0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public static final int y0;
    public boolean D;
    public boolean E;
    public int F;
    public String G;
    public Bundle H;
    public TLRPC.TL_auth_sentCode I;
    public int J;
    public final AnimatorSet[] K;
    public AnimatorSet L;
    public org.telegram.ui.Components.v21 M;
    public org.telegram.ui.Components.f10 N;
    public li.k O;
    public int P;
    public final boolean[] Q;
    public org.telegram.ui.ActionBar.x1 R;
    public w8 S;
    public xe0 T;
    public ImageView U;
    public RadialProgressView V;
    public ImageView W;
    public org.telegram.ui.Components.kh0 X;
    public LinearLayout Y;
    public l0 Z;
    public int a;
    public boolean a0;
    public final org.telegram.ui.Components.zu0[] b;
    public we0 b0;
    public org.telegram.ui.Components.lr c;
    public boolean c0;
    public ValueAnimator d;
    public Runnable d0;
    public boolean e;
    public fv e0;
    public boolean f;
    public TextView f0;
    public boolean g0;
    public Dialog h;
    public boolean h0;
    public final boolean[] i0;
    public final Runnable[] j0;
    public final boolean[] k0;
    public boolean l0;
    public View m0;
    public Dialog n;
    public boolean n0;
    public qq o0;
    public boolean p0;
    public TLRPC.TL_help_termsOfService q0;
    public final ArrayList r;
    public int r0;
    public final ArrayList s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public zb0 x0;
    public boolean y;

    static {
        y0 = org.telegram.messenger.tz.o() <= 1 ? org.telegram.messenger.zs.g2 : 100;
    }

    public hf0() {
        super(null);
        this.b = new org.telegram.ui.Components.zu0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.D = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.a0 = false;
        this.i0 = new boolean[2];
        this.j0 = new Runnable[2];
        this.k0 = new boolean[2];
    }

    public static void Y(hf0 hf0Var, String str, String str2, String str3) {
        hf0Var.v1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(hf0Var.currentAccount).sendRequest(deleteaccount, new mb(hf0Var, str, str2, str3, 4), 10);
    }

    public static /* synthetic */ void Z(hf0 hf0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            org.telegram.messenger.f8.b("Resend firebase sms because integrity token = null");
            hf0Var.A1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(hf0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new fc0(1, bundle, auth_sentcode, hf0Var, z10), 10);
    }

    public static boolean Z0(hf0 hf0Var, View view) {
        if (hf0Var.p1()) {
            return true;
        }
        return org.telegram.messenger.i0.J3(view);
    }

    public static void a0(hf0 hf0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        hf0Var.s1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                hf0Var.C1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            hf0Var.C1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131746132, "ResetAccountCancelledAlert"));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(hf0Var.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        hf0Var.C1(8, true, bundle2, false);
    }

    public static void a1(hf0 hf0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.i0.F3(3.5f, view, null);
        if (z10 && (view instanceof org.telegram.ui.Components.ec0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.ec0 ec0Var = (org.telegram.ui.Components.ec0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = ec0Var.getAttachedEditText();
            ag.u2 u2Var = new ag.u2(5, attachedEditText, atomicReference);
            ec0Var.a(1.0f);
            w50 w50Var = new w50(ec0Var, view, attachedEditText, u2Var, 6);
            atomicReference.set(w50Var);
            view.postDelayed(w50Var, 2000L);
            view.setTag(R.id.timeout_callback, w50Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(u2Var);
            }
        }
    }

    public static void b0(hf0 hf0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, m8.d dVar) {
        m8.e eVar = ((b8.f) ((com.google.android.gms.common.api.q) dVar.a)).b;
        String str2 = eVar == null ? null : eVar.a;
        if (str2 == null) {
            org.telegram.messenger.f8.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            hf0Var.A1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] split = str2.split("\\.");
        if (split.length <= 0) {
            org.telegram.messenger.f8.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            hf0Var.A1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (optBoolean && optBoolean2) {
                    ConnectionsManager.getInstance(hf0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new fc0(0, bundle, auth_sentcode, hf0Var, z10), 10);
                    return;
                }
                if (!optBoolean && !optBoolean2) {
                    org.telegram.messenger.f8.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    hf0Var.A1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                } else if (!optBoolean) {
                    org.telegram.messenger.f8.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    hf0Var.A1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                } else {
                    if (optBoolean2) {
                        return;
                    }
                    org.telegram.messenger.f8.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    hf0Var.A1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                }
            } catch (JSONException e) {
                e = e;
                org.telegram.messenger.f8.g(e, true);
                org.telegram.messenger.f8.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                hf0Var.A1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
            }
        } catch (JSONException e7) {
            e = e7;
        }
    }

    public static HashSet b1(hf0 hf0Var) {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) org.telegram.messenger.w0.b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            SubscriptionManager from = SubscriptionManager.from(hf0Var.getParentActivity());
            List<SubscriptionInfo> completeActiveSubscriptionInfoList = i10 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
            if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i10 >= 28) {
                completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList != null) {
                for (int i11 = 0; i11 < completeActiveSubscriptionInfoList.size(); i11++) {
                    String number = completeActiveSubscriptionInfoList.get(i11).getNumber();
                    if (!TextUtils.isEmpty(number)) {
                        hashSet.add(number);
                    }
                }
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        return hashSet;
    }

    public static void k1(ImageView imageView, int i10, int i11, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i10 != i11 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i10, mode));
            }
        }
    }

    public static void l1(ImageView imageView, int i10, int i11) {
        if (imageView == null) {
            return;
        }
        Drawable background = imageView.getBackground();
        if (background == null) {
            imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(i10, 1, -1));
        } else if (i10 != i11) {
            org.telegram.ui.ActionBar.t6.H1(background, i10, true);
        }
    }

    public static String n1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder t10 = a1.g.t(simpleName);
            t10.append(exc.getMessage());
            simpleName = t10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static void r0(hf0 hf0Var, String str, String str2, String str3) {
        if (hf0Var.V.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131746114, "ResetMyAccountWarningText");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.cd.L0(2131746116, "ResetMyAccountWarning");
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746115, "ResetMyAccountWarningReset"), new a1.d(hf0Var, str, str2, str3, 12));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
        hf0Var.showDialog(x1Var);
    }

    public static Bundle r1(int i10, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            Context context = org.telegram.messenger.w0.b;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            sb2.append(z10 ? "_" + i10 : "");
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb2.toString(), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] split = key.split("_\\|_");
                if (split.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (split.length == 2) {
                    Bundle bundle2 = bundle.getBundle(split[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(split[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(split[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(split[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(split[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return null;
        }
    }

    public static void u1(org.telegram.ui.ActionBar.k2 k2Var, String str, li.k kVar, boolean z10) {
        List list;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getParentActivity());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (z10) {
            x1Var.R = org.telegram.messenger.cd.L0(2131746088, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131753725, "BannedPhoneNumber");
        } else if (kVar == null || (list = (List) kVar.c) == null || list.isEmpty() || ((nt) kVar.b) == null) {
            x1Var.R = org.telegram.messenger.cd.L0(2131746088, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131749189, null);
        } else {
            Iterator it = ((List) kVar.c).iterator();
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i10) {
                    i10 = length;
                }
            }
            if (af.b.d(str, false).length() - ((nt) kVar.b).c.length() < i10) {
                x1Var.R = org.telegram.messenger.cd.L0(2131742882, null);
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("ShortNumberInfo", null, 2131745374, ((nt) kVar.b).a, (String) kVar.d));
            } else {
                x1Var.R = org.telegram.messenger.cd.L0(2131746088, null);
                x1Var.T = org.telegram.messenger.cd.L0(2131749189, null);
            }
        }
        alertDialog$Builder.i(org.telegram.messenger.cd.L0(2131753061, "BotHelp"), new ag.v0(str, k2Var, z10));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), null);
        k2Var.showDialog(x1Var);
    }

    public static void z1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a1.g.C(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a1.g.C(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a1.g.C(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                z1((Bundle) obj, editor, str2);
            }
        }
    }

    public final void A1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.p0) {
            s1(false, true);
            this.p0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new org.telegram.ui.Components.t20(21, this, bundle), 10);
        }
    }

    public final void B1(boolean z10, boolean z11) {
        if (this.a0 == z10 && z11) {
            return;
        }
        this.a0 = z10;
        int i10 = 0;
        if (org.telegram.messenger.i0.C1()) {
            z10 = false;
        }
        int i11 = 2;
        if (!z10) {
            org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
            if (!z11) {
                this.c.setVisibility(8);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(org.telegram.ui.Components.vs.e);
            this.d.addUpdateListener(new ac0(this, i10));
            this.d.addListener(new lc0(this, 1));
            this.d.start();
            return;
        }
        org.telegram.messenger.i0.v1(this.fragmentView);
        org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
        if (!z11) {
            this.c.setVisibility(0);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(org.telegram.ui.Components.gr.f);
        this.d.addUpdateListener(new ac0(this, i11));
        this.d.addListener(new lc0(this, i10));
        this.d.start();
    }

    public final void C1(int i10, boolean z10, Bundle bundle, boolean z11) {
        boolean z12 = i10 == 0 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 10 || i10 == 12 || i10 == 17 || i10 == 16;
        if (i10 == this.a) {
            z10 = false;
        }
        int i11 = 8;
        if (z12) {
            if (i10 == 0) {
                this.w = true;
                this.x = true;
            }
            this.J = 1;
            D1(false, z10);
            E1(false, z10, false);
            this.J = 0;
            E1(false, z10, false);
            if (!z10) {
                D1(true, false);
            }
        } else {
            this.J = 0;
            D1(false, z10);
            E1(false, z10, false);
            if (i10 != 8) {
                this.J = 1;
            }
        }
        org.telegram.ui.Components.zu0[] zu0VarArr = this.b;
        if (!z10) {
            this.U.setVisibility((zu0VarArr[i10].b() || this.y) ? 0 : 8);
            zu0VarArr[this.a].setVisibility(8);
            zu0VarArr[this.a].g();
            this.a = i10;
            zu0VarArr[i10].m(bundle, false);
            zu0VarArr[i10].setVisibility(0);
            setParentActivityTitle(zu0VarArr[i10].getHeaderName());
            zu0VarArr[i10].j();
            B1(zu0VarArr[i10].a(), false);
            return;
        }
        org.telegram.ui.Components.zu0 zu0Var = zu0VarArr[this.a];
        org.telegram.ui.Components.zu0 zu0Var2 = zu0VarArr[i10];
        this.a = i10;
        this.U.setVisibility((zu0Var2.b() || this.y) ? 0 : 8);
        zu0Var2.m(bundle, false);
        setParentActivityTitle(zu0Var2.getHeaderName());
        zu0Var2.j();
        int i12 = org.telegram.messenger.i0.q.x;
        if (z11) {
            i12 = -i12;
        }
        zu0Var2.setX(i12);
        zu0Var2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new androidx.fragment.app.g(this, z12, zu0Var, i11));
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(zu0Var, (Property<org.telegram.ui.Components.zu0, Float>) property, z11 ? org.telegram.messenger.i0.q.x : -org.telegram.messenger.i0.q.x), ObjectAnimator.ofFloat(zu0Var2, (Property<org.telegram.ui.Components.zu0, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        B1(zu0Var2.a(), true);
    }

    public final void D1(boolean z10, boolean z11) {
        TimeInterpolator timeInterpolator;
        int i10 = this.J;
        boolean z12 = i10 == 0;
        boolean[] zArr = this.Q;
        if (zArr[i10] == z10) {
            return;
        }
        AnimatorSet[] animatorSetArr = this.K;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            if (z11) {
                animatorSet.removeAllListeners();
            }
            animatorSetArr[this.J].cancel();
        }
        int i11 = this.J;
        zArr[i11] = z10;
        if (!z11) {
            if (z12) {
                this.N.e(z10, z11);
                return;
            }
            return;
        }
        animatorSetArr[i11] = new AnimatorSet();
        if (z12) {
            this.N.e(z10, z11);
        }
        animatorSetArr[this.J].addListener(new org.telegram.ui.ActionBar.g(this, z12, z10, 4));
        int i12 = org.telegram.messenger.zs.g2;
        if (!z12) {
            timeInterpolator = null;
        } else if (z10) {
            timeInterpolator = org.telegram.messenger.i0.F;
            i12 = org.telegram.messenger.zs.e3;
        } else {
            timeInterpolator = org.telegram.messenger.i0.G;
        }
        animatorSetArr[this.J].setDuration(i12);
        animatorSetArr[this.J].setInterpolator(timeInterpolator);
        animatorSetArr[this.J].start();
    }

    public final void E1(final boolean z10, final boolean z11, boolean z12) {
        boolean[] zArr = this.i0;
        if (z11 && zArr[this.J] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.ez(this, z10, z11, z12, 1));
            return;
        }
        final int i10 = this.J;
        int i11 = 1;
        boolean z13 = i10 == 0;
        boolean[] zArr2 = this.k0;
        if (z12 || z13) {
            zArr2[i10] = false;
            zArr[i10] = z10;
        } else {
            zArr[i10] = z10;
            if (z11) {
                boolean z14 = zArr2[i10];
                Runnable[] runnableArr = this.j0;
                if (z14) {
                    org.telegram.messenger.i0.r(runnableArr[i10]);
                    zArr2[this.J] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.bc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            hf0 hf0Var = hf0.this;
                            int i12 = hf0Var.J;
                            hf0Var.J = i10;
                            hf0Var.E1(z10, z11, true);
                            hf0Var.J = i12;
                        }
                    };
                    runnableArr[i10] = runnable;
                    org.telegram.messenger.i0.h3(runnable, 2000L);
                    zArr2[this.J] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.N.f(z10, z11);
            return;
        }
        if (z11) {
            this.L = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            ofFloat.addListener(new org.telegram.ui.Components.ha0(17, this, z10));
            ofFloat.addUpdateListener(new ac0(this, i11));
            this.L.playTogether(ofFloat);
            this.L.setDuration(150L);
            this.L.start();
            return;
        }
        if (z10) {
            this.V.setVisibility(0);
            this.V.setScaleX(1.0f);
            this.V.setScaleY(1.0f);
            this.V.setAlpha(1.0f);
            return;
        }
        this.V.setTag(null);
        this.V.setVisibility(4);
        this.V.setScaleX(0.1f);
        this.V.setScaleY(0.1f);
        this.V.setAlpha(0.0f);
    }

    public final void F1(boolean z10, boolean z11) {
        if (z10 == this.w0) {
            return;
        }
        zb0 zb0Var = this.x0;
        if (zb0Var != null) {
            org.telegram.messenger.i0.r(zb0Var);
            this.x0 = null;
        }
        this.w0 = z10;
        this.W.clearAnimation();
        if (z11) {
            this.W.setVisibility(0);
            this.W.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new k2.v(28, this, z10)).start();
        } else {
            this.W.setVisibility(z10 ? 0 : 8);
            this.W.setAlpha(z10 ? 1.0f : 0.0f);
        }
    }

    public final void G1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        ImageView imageView = this.U;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        k1(imageView, x02, this.r0, PorterDuff.Mode.SRC_ATOP);
        this.r0 = x02;
        ImageView imageView2 = this.U;
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        l1(imageView2, x03, this.s0);
        this.s0 = x03;
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        if (x04 != this.t0 || this.X.getColorFilter() == null) {
            this.X.setColorFilter(new PorterDuffColorFilter(x04, PorterDuff.Mode.SRC_IN));
            this.t0 = x04;
        }
        ImageView imageView3 = this.W;
        int x05 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        l1(imageView3, x05, this.u0);
        this.u0 = x05;
        RadialProgressView radialProgressView = this.V;
        int i12 = org.telegram.ui.ActionBar.t6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        this.N.updateColors();
        this.M.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
        this.M.setBackgroundColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        for (org.telegram.ui.Components.zu0 zu0Var : this.b) {
            zu0Var.updateColors();
        }
        org.telegram.ui.Components.lr lrVar = this.c;
        org.telegram.ui.Components.ir irVar = lrVar.a;
        int x06 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
        if (x06 != lrVar.s || irVar.getColorFilter() == null) {
            lrVar.s = x06;
            irVar.setColorFilter(x06, PorterDuff.Mode.SRC_ATOP);
        }
        int x07 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false);
        int o10 = i0.b.o(x07, 30);
        boolean z10 = x07 != lrVar.w;
        lrVar.w = x07;
        int i13 = 0;
        while (true) {
            View[] viewArr = lrVar.c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                if (view.getBackground() == null) {
                    org.telegram.ui.Components.lr.a(i13, view);
                } else if (z10) {
                    org.telegram.ui.ActionBar.t6.H1(view.getBackground(), x07, false);
                    org.telegram.ui.ActionBar.t6.H1(view.getBackground(), o10, true);
                }
                if (view instanceof org.telegram.ui.Components.kr) {
                    ((org.telegram.ui.Components.kr) view).updateColors();
                }
            }
            i13++;
        }
        we0 we0Var = this.b0;
        if (we0Var != null) {
            int i14 = we0.F;
            we0Var.b();
        }
    }

    public final void H1(boolean z10, boolean z11) {
        if (this.X == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.v0 != connectionState || z11) {
            this.v0 = connectionState;
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0);
            boolean z12 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i10 = this.v0;
            boolean z13 = i10 == 3 || i10 == 5;
            boolean z14 = i10 == 1 || i10 == 2 || i10 == 4;
            if (z12) {
                this.X.b(true, z13, z10);
                F1(true, z10);
                return;
            }
            if ((!getMessagesController().y3 || org.telegram.messenger.tz.z1.isEmpty()) && !z14) {
                F1(false, z10);
                return;
            }
            this.X.b(true, z13, z10);
            if (this.w0) {
                return;
            }
            zb0 zb0Var = this.x0;
            if (zb0Var != null) {
                org.telegram.messenger.i0.r(zb0Var);
            }
            this.w0 = true;
            zb0 zb0Var2 = new zb0(this, 1);
            this.x0 = zb0Var2;
            org.telegram.messenger.i0.h3(zb0Var2, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            if (this.n0) {
                this.m0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && !this.n0) {
            ViewGroup viewGroup2 = (ViewGroup) lVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0448, code lost:
    
        if (r1 != 4) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0442 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03df  */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v25 */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        Bundle bundle;
        Bundle bundle2;
        int i10;
        qq qqVar;
        boolean z10;
        int i11;
        View view = this.m0;
        if (view != null) {
            this.fragmentView = view;
            this.m0 = null;
            return view;
        }
        final int i12 = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, 4));
        this.J = 0;
        boolean[] zArr = this.Q;
        ?? r52 = 1;
        ?? r53 = 1;
        zArr[0] = true;
        zArr[1] = false;
        w8 w8Var = new w8(this, context, 7);
        this.S = w8Var;
        w8Var.setDelegate(new hc0(i12, this));
        this.fragmentView = this.S;
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(this, context, 3);
        p1Var.setFillViewport(true);
        this.S.addView(p1Var, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        p1Var.addView(this.Y, w7.b6.x(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(org.telegram.messenger.i0.Q1() ? 0 : org.telegram.messenger.i0.m);
        this.Y.addView(space);
        l0 l0Var = new l0(this, context, 14);
        this.Z = l0Var;
        this.Y.addView(l0Var, w7.b6.l(1.0f, -1, 0));
        org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(context);
        this.c = lrVar;
        lrVar.setViewToFindFocus(this.Z);
        this.Y.addView(this.c, w7.b6.o(-1, org.telegram.messenger.zs.G3));
        gf0 gf0Var = new gf0(this, context);
        org.telegram.ui.Components.zu0[] zu0VarArr = this.b;
        zu0VarArr[0] = gf0Var;
        zu0VarArr[1] = new me0(this, context, 1);
        final int i13 = 2;
        zu0VarArr[2] = new me0(this, context, 2);
        zu0VarArr[3] = new me0(this, context, 3);
        zu0VarArr[4] = new me0(this, context, 4);
        zu0VarArr[5] = new wd0(this, context);
        zu0VarArr[6] = new ed0(this, context);
        zu0VarArr[7] = new od0(this, context);
        zu0VarArr[8] = new xd0(this, context);
        zu0VarArr[9] = new bd0(this, context, 0);
        zu0VarArr[10] = new bd0(this, context, 1);
        zu0VarArr[11] = new me0(this, context, 11);
        zu0VarArr[12] = new zd0(this, context);
        zu0VarArr[13] = new wc0(this, context, true);
        zu0VarArr[14] = new wc0(this, context, false);
        zu0VarArr[15] = new me0(this, context, 15);
        zu0VarArr[16] = new ld0(this, context, 16);
        zu0VarArr[17] = new ld0(this, context, 17);
        int i14 = 18;
        zu0VarArr[18] = new se0(this, context);
        int i15 = 0;
        while (i15 < zu0VarArr.length) {
            zu0VarArr[i15].setVisibility(i15 == 0 ? 0 : 8);
            this.Z.addView(zu0VarArr[i15], w7.b6.d(-1, -1.0f, 17, org.telegram.messenger.i0.Q1() ? 26.0f : 18.0f, (i15 != i14) != false ? 30.0f : 0.0f, org.telegram.messenger.i0.Q1() ? 26.0f : 18.0f, 0.0f));
            i15++;
            i14 = 18;
        }
        Bundle r12 = this.F == 0 ? r1(this.currentAccount, this.y) : null;
        if (r12 != null && ((i11 = r12.getInt("currentViewNum", 0)) < 0 || i11 >= zu0VarArr.length)) {
            r12 = null;
        }
        if (r12 != null) {
            this.a = r12.getInt("currentViewNum", 0);
            this.D = r12.getInt("syncContacts", 1) == 1;
            int i16 = this.a;
            if (i16 < 1 || i16 > 4) {
                bundle = r12;
                if (i16 == 6) {
                    if (((ed0) zu0VarArr[6]).n == null) {
                        this.a = 0;
                        m1();
                        bundle2 = null;
                    }
                    bundle2 = bundle;
                } else {
                    if (i16 == 7 && ((od0) zu0VarArr[7]).h == null) {
                        this.a = 0;
                        m1();
                        bundle2 = null;
                    }
                    bundle2 = bundle;
                }
            } else {
                int i17 = r12.getInt("open");
                if (i17 != 0) {
                    bundle = r12;
                    if (Math.abs((System.currentTimeMillis() / 1000) - i17) >= 86400) {
                        this.a = 0;
                        m1();
                        bundle2 = null;
                    }
                    bundle2 = bundle;
                }
            }
            org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
            this.N = f10Var;
            f10Var.e(zArr[0], false);
            this.O = new li.k(this.N);
            this.S.addView(this.N, w7.b6.d(56, 56.0f, (!org.telegram.messenger.cd.X ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
                public final /* synthetic */ hf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            this.b.x1();
                            break;
                        case 1:
                            hf0 hf0Var = this.b;
                            if (hf0Var.onBackPressed(true)) {
                                hf0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            hf0 hf0Var2 = this.b;
                            fv fvVar = hf0Var2.e0;
                            if (fvVar != null) {
                                fvVar.run();
                            }
                            hf0Var2.finishFragment();
                            break;
                        default:
                            hf0 hf0Var3 = this.b;
                            hf0Var3.getClass();
                            hf0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
            ((o1.j) this.O.c).b(new jc0(this, i12));
            ImageView imageView = new ImageView(context);
            this.U = imageView;
            imageView.setImageResource(R.drawable.ic_ab_back);
            ImageView imageView2 = this.U;
            final ?? r54 = r53 == true ? 1 : 0;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
                public final /* synthetic */ hf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (r54) {
                        case 0:
                            this.b.x1();
                            break;
                        case 1:
                            hf0 hf0Var = this.b;
                            if (hf0Var.onBackPressed(true)) {
                                hf0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            hf0 hf0Var2 = this.b;
                            fv fvVar = hf0Var2.e0;
                            if (fvVar != null) {
                                fvVar.run();
                            }
                            hf0Var2.finishFragment();
                            break;
                        default:
                            hf0 hf0Var3 = this.b;
                            hf0Var3.getClass();
                            hf0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
            this.U.setContentDescription(org.telegram.messenger.cd.L0(2131754878, null));
            int L = org.telegram.messenger.i0.L(4.0f);
            this.U.setPadding(L, L, L, L);
            this.S.addView(this.U, w7.b6.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
            if (this.e0 != null && !this.g0 && this.h0) {
                TextView textView = new TextView(context);
                this.f0 = textView;
                textView.setGravity(19);
                this.f0.setTextSize(1, 15.0f);
                this.f0.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                this.f0.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                this.f0.setText(org.telegram.messenger.cd.L0(2131742842, null));
                org.telegram.ui.ActionBar.a7.V(this.f0, org.telegram.ui.ActionBar.t6.q6, null);
                this.S.addView(this.f0, w7.b6.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
                    public final /* synthetic */ hf0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                this.b.x1();
                                break;
                            case 1:
                                hf0 hf0Var = this.b;
                                if (hf0Var.onBackPressed(true)) {
                                    hf0Var.finishFragment();
                                    break;
                                }
                                break;
                            case 2:
                                hf0 hf0Var2 = this.b;
                                fv fvVar = hf0Var2.e0;
                                if (fvVar != null) {
                                    fvVar.run();
                                }
                                hf0Var2.finishFragment();
                                break;
                            default:
                                hf0 hf0Var3 = this.b;
                                hf0Var3.getClass();
                                hf0Var3.presentFragment(new ProxyListActivity());
                                break;
                        }
                    }
                });
            }
            ?? imageView3 = new ImageView(context);
            this.W = imageView3;
            org.telegram.ui.Components.kh0 kh0Var = new org.telegram.ui.Components.kh0(context);
            this.X = kh0Var;
            imageView3.setImageDrawable(kh0Var);
            final int i18 = 3;
            this.W.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
                public final /* synthetic */ hf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            this.b.x1();
                            break;
                        case 1:
                            hf0 hf0Var = this.b;
                            if (hf0Var.onBackPressed(true)) {
                                hf0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            hf0 hf0Var2 = this.b;
                            fv fvVar = hf0Var2.e0;
                            if (fvVar != null) {
                                fvVar.run();
                            }
                            hf0Var2.finishFragment();
                            break;
                        default:
                            hf0 hf0Var3 = this.b;
                            hf0Var3.getClass();
                            hf0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
            this.W.setAlpha(0.0f);
            this.W.setVisibility(8);
            this.S.addView(this.W, w7.b6.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
            H1(false, true);
            RadialProgressView radialProgressView = new RadialProgressView(context, null);
            this.V = radialProgressView;
            radialProgressView.setSize(org.telegram.messenger.i0.L(20.0f));
            this.V.setAlpha(0.0f);
            this.V.setScaleX(0.1f);
            this.V.setScaleY(0.1f);
            this.S.addView(this.V, w7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            org.telegram.ui.Components.v21 v21Var = new org.telegram.ui.Components.v21(context);
            this.M = v21Var;
            v21Var.setTransformType(0);
            this.M.setProgress(1.0f);
            this.M.setDrawBackground(false);
            this.N.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
            this.N.addView(this.M, w7.b6.e(56, 56, 17));
            this.N.a(this.M);
            if (bundle2 != null) {
                this.f = true;
            }
            i10 = 0;
            while (i10 < zu0VarArr.length) {
                org.telegram.ui.Components.zu0 zu0Var = zu0VarArr[i10];
                if (bundle2 != null) {
                    if (i10 < r52 || i10 > 4) {
                        zu0Var.k(bundle2);
                    } else if (i10 == this.a) {
                        zu0Var.k(bundle2);
                    }
                }
                if (this.a == i10) {
                    this.U.setVisibility((zu0Var.b() || this.y || this.F == 2) ? 0 : 8);
                    zu0Var.setVisibility(0);
                    zu0Var.j();
                    B1(zu0Var.a(), false);
                    this.J = 0;
                    if (i10 != 0 && i10 != 5 && i10 != 6) {
                        if (i10 != 9) {
                            if (i10 != 10 && i10 != 12) {
                                z10 = false;
                                D1(z10, false);
                                if (i10 == r52 && i10 != 2) {
                                    if (i10 != 3) {
                                    }
                                }
                                this.J = r52;
                            }
                            z10 = r52;
                            D1(z10, false);
                            if (i10 == r52) {
                            }
                            this.J = r52;
                        }
                    }
                    z10 = r52;
                    D1(z10, false);
                    if (i10 == r52) {
                    }
                    this.J = r52;
                } else if (zu0Var.getVisibility() != 8) {
                    zu0Var.setVisibility(8);
                    zu0Var.g();
                }
                i10++;
                r52 = 1;
            }
            this.f = false;
            G1();
            if (q1()) {
                o1(this.H, this.I, false);
            }
            qqVar = this.o0;
            if (qqVar != null) {
                this.o0 = null;
                qqVar.run();
            }
            return this.fragmentView;
        }
        bundle = r12;
        bundle2 = bundle;
        org.telegram.ui.Components.f10 f10Var2 = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.N = f10Var2;
        f10Var2.e(zArr[0], false);
        this.O = new li.k(this.N);
        this.S.addView(this.N, w7.b6.d(56, 56.0f, (!org.telegram.messenger.cd.X ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ hf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.x1();
                        break;
                    case 1:
                        hf0 hf0Var = this.b;
                        if (hf0Var.onBackPressed(true)) {
                            hf0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        hf0 hf0Var2 = this.b;
                        fv fvVar = hf0Var2.e0;
                        if (fvVar != null) {
                            fvVar.run();
                        }
                        hf0Var2.finishFragment();
                        break;
                    default:
                        hf0 hf0Var3 = this.b;
                        hf0Var3.getClass();
                        hf0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((o1.j) this.O.c).b(new jc0(this, i12));
        ImageView imageView4 = new ImageView(context);
        this.U = imageView4;
        imageView4.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView22 = this.U;
        final int r542 = r53 == true ? 1 : 0;
        imageView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ hf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (r542) {
                    case 0:
                        this.b.x1();
                        break;
                    case 1:
                        hf0 hf0Var = this.b;
                        if (hf0Var.onBackPressed(true)) {
                            hf0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        hf0 hf0Var2 = this.b;
                        fv fvVar = hf0Var2.e0;
                        if (fvVar != null) {
                            fvVar.run();
                        }
                        hf0Var2.finishFragment();
                        break;
                    default:
                        hf0 hf0Var3 = this.b;
                        hf0Var3.getClass();
                        hf0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.U.setContentDescription(org.telegram.messenger.cd.L0(2131754878, null));
        int L2 = org.telegram.messenger.i0.L(4.0f);
        this.U.setPadding(L2, L2, L2, L2);
        this.S.addView(this.U, w7.b6.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.e0 != null) {
            TextView textView2 = new TextView(context);
            this.f0 = textView2;
            textView2.setGravity(19);
            this.f0.setTextSize(1, 15.0f);
            this.f0.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
            this.f0.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
            this.f0.setText(org.telegram.messenger.cd.L0(2131742842, null));
            org.telegram.ui.ActionBar.a7.V(this.f0, org.telegram.ui.ActionBar.t6.q6, null);
            this.S.addView(this.f0, w7.b6.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
                public final /* synthetic */ hf0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            this.b.x1();
                            break;
                        case 1:
                            hf0 hf0Var = this.b;
                            if (hf0Var.onBackPressed(true)) {
                                hf0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            hf0 hf0Var2 = this.b;
                            fv fvVar = hf0Var2.e0;
                            if (fvVar != null) {
                                fvVar.run();
                            }
                            hf0Var2.finishFragment();
                            break;
                        default:
                            hf0 hf0Var3 = this.b;
                            hf0Var3.getClass();
                            hf0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
        }
        ?? imageView32 = new ImageView(context);
        this.W = imageView32;
        org.telegram.ui.Components.kh0 kh0Var2 = new org.telegram.ui.Components.kh0(context);
        this.X = kh0Var2;
        imageView32.setImageDrawable(kh0Var2);
        final int i182 = 3;
        this.W.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ic0
            public final /* synthetic */ hf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i182) {
                    case 0:
                        this.b.x1();
                        break;
                    case 1:
                        hf0 hf0Var = this.b;
                        if (hf0Var.onBackPressed(true)) {
                            hf0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        hf0 hf0Var2 = this.b;
                        fv fvVar = hf0Var2.e0;
                        if (fvVar != null) {
                            fvVar.run();
                        }
                        hf0Var2.finishFragment();
                        break;
                    default:
                        hf0 hf0Var3 = this.b;
                        hf0Var3.getClass();
                        hf0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.W.setAlpha(0.0f);
        this.W.setVisibility(8);
        this.S.addView(this.W, w7.b6.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        H1(false, true);
        RadialProgressView radialProgressView2 = new RadialProgressView(context, null);
        this.V = radialProgressView2;
        radialProgressView2.setSize(org.telegram.messenger.i0.L(20.0f));
        this.V.setAlpha(0.0f);
        this.V.setScaleX(0.1f);
        this.V.setScaleY(0.1f);
        this.S.addView(this.V, w7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.v21 v21Var2 = new org.telegram.ui.Components.v21(context);
        this.M = v21Var2;
        v21Var2.setTransformType(0);
        this.M.setProgress(1.0f);
        this.M.setDrawBackground(false);
        this.N.setContentDescription(org.telegram.messenger.cd.L0(2131751355, null));
        this.N.addView(this.M, w7.b6.e(56, 56, 17));
        this.N.a(this.M);
        if (bundle2 != null) {
        }
        i10 = 0;
        while (i10 < zu0VarArr.length) {
        }
        this.f = false;
        G1();
        if (q1()) {
        }
        qqVar = this.o0;
        if (qqVar != null) {
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T1) {
            H1(true, false);
            return;
        }
        if (i10 == org.telegram.messenger.zs.s1 && this.h0) {
            org.telegram.messenger.vp messagesController = getMessagesController();
            if (messagesController.U3.contains("SETUP_LOGIN_EMAIL") || messagesController.U3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(11, this), org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.D6, org.telegram.ui.ActionBar.t6.H6, org.telegram.ui.ActionBar.t6.i6, org.telegram.ui.ActionBar.t6.P9, org.telegram.ui.ActionBar.t6.O9, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.I6, org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.y6, org.telegram.ui.ActionBar.t6.i7, org.telegram.ui.ActionBar.t6.q6, org.telegram.ui.ActionBar.t6.Ki, org.telegram.ui.ActionBar.t6.Q9, org.telegram.ui.ActionBar.t6.p7, org.telegram.ui.ActionBar.t6.J6, org.telegram.ui.ActionBar.t6.Y6, org.telegram.ui.ActionBar.t6.W6, org.telegram.ui.ActionBar.t6.X6, org.telegram.ui.ActionBar.t6.h5, org.telegram.ui.ActionBar.t6.q5, org.telegram.ui.ActionBar.t6.j5);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.h0;
    }

    public final void m1() {
        String str;
        Context context = org.telegram.messenger.w0.b;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.y) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void o1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
        final int i10 = 1;
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            C1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        final int i11 = 0;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.p0) {
            if (!org.telegram.messenger.eu.b.hasServices()) {
                org.telegram.messenger.f8.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                A1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            v1(0, true);
            this.p0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                org.telegram.messenger.f8.b("getting classic integrity with nonce = ".concat(str));
                create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new dc0(this, bundle, auth_sentcode, string, z10)).addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.ec0
                    public final /* synthetic */ hf0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        switch (i11) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + hf0.n1(exc);
                                org.telegram.messenger.f8.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                this.b.A1(bundle, auth_sentcode, str2);
                                break;
                            default:
                                org.telegram.messenger.f8.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + hf0.n1(exc);
                                org.telegram.messenger.f8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.b.A1(bundle, auth_sentcode, str3);
                                break;
                        }
                    }
                });
                return;
            }
            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(org.telegram.messenger.w0.b, m8.c.a, null, new com.google.android.gms.common.api.internal.a());
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = org.telegram.messenger.v2.f;
            com.google.android.gms.common.api.internal.u0 u0Var = v0Var.h;
            b8.e eVar = new b8.e(u0Var, bArr, str2);
            u0Var.b.d(0, eVar);
            n6.l.m(eVar, new n6.m(new m8.d())).addOnSuccessListener(new dc0(this, string, auth_sentcode, bundle, z10)).addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.ec0
                public final /* synthetic */ hf0 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    switch (i10) {
                        case 0:
                            String str22 = "PLAYINTEGRITY_EXCEPTION_" + hf0.n1(exc);
                            org.telegram.messenger.f8.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                            this.b.A1(bundle, auth_sentcode, str22);
                            break;
                        default:
                            org.telegram.messenger.f8.g(exc, true);
                            String str3 = "SAFETYNET_EXCEPTION_" + hf0.n1(exc);
                            org.telegram.messenger.f8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                            this.b.A1(bundle, auth_sentcode, str3);
                            break;
                    }
                }
            });
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
            bundle.putInt("length", auth_sentcode.type.length);
            C1(1, z10, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            boolean z11 = org.telegram.messenger.v2.a;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", auth_sentcode.type.length);
            C1(4, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            C1(3, z10, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            C1(2, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            C1(15, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            C1(11, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            C1(12, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            C1(14, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            C1(16, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            C1(17, z10, bundle, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        wd0 wd0Var = (wd0) this.b[5];
        if (wd0Var != null) {
            wd0Var.L.h(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!this.h0 || this.a != 12) {
            int i10 = this.a;
            org.telegram.ui.Components.zu0[] zu0VarArr = this.b;
            if (i10 == 0 || (this.F == 3 && i10 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.zu0 zu0Var : zu0VarArr) {
                        if (zu0Var != null) {
                            zu0Var.f();
                        }
                    }
                    m1();
                }
                return true;
            }
            if (i10 == 6) {
                if (z10) {
                    zu0VarArr[i10].c(true);
                    C1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 7 || i10 == 8) {
                if (z10) {
                    zu0VarArr[i10].c(true);
                    C1(6, true, null, true);
                }
            } else if ((i10 >= 1 && i10 <= 4) || i10 == 11 || i10 == 15) {
                if (z10 && zu0VarArr[i10].c(false)) {
                    C1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 5) {
                if (z10) {
                    ((wd0) zu0VarArr[i10]).x.callOnClick();
                    return false;
                }
            } else if (i10 == 9) {
                if (z10) {
                    zu0VarArr[i10].c(true);
                    C1(7, true, null, true);
                    return false;
                }
            } else if (i10 == 10) {
                if (z10) {
                    zu0VarArr[i10].c(true);
                    C1(9, true, null, true);
                    return false;
                }
            } else if (i10 == 13) {
                if (z10) {
                    zu0VarArr[i10].c(true);
                    C1(12, true, null, true);
                    return false;
                }
            } else if (z10 && zu0VarArr[i10].c(true)) {
                C1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onConfigurationChanged(Configuration configuration) {
        B1(this.b[this.a].a(), false);
        we0 we0Var = this.b0;
        if (we0Var != null) {
            int i10 = we0.F;
            we0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onDialogDismiss(Dialog dialog) {
        try {
            if (dialog == this.h) {
                ArrayList arrayList = this.r;
                if (!arrayList.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                    return;
                }
            }
            if (dialog == this.n) {
                ArrayList arrayList2 = this.s;
                if (arrayList2.isEmpty() || getParentActivity() == null) {
                    return;
                }
                org.telegram.messenger.i0.h3(new zb0(this, 0), 200L);
                getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.T1);
        getNotificationCenter().c(this, org.telegram.messenger.zs.s1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.zu0[] zu0VarArr = this.b;
            if (i10 >= zu0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.zu0 zu0Var = zu0VarArr[i10];
            if (zu0Var != null) {
                zu0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.R;
        if (x1Var != null) {
            x1Var.dismiss();
            this.R = null;
        }
        for (Runnable runnable : this.j0) {
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.zs.T1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.s1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z10 = iArr[0] == 0;
        org.telegram.ui.Components.zu0[] zu0VarArr = this.b;
        if (i10 == 6) {
            this.w = false;
            int i11 = this.a;
            if (i11 == 0) {
                org.telegram.ui.Components.zu0 zu0Var = zu0VarArr[i11];
                ((gf0) zu0Var).N = true;
                zu0Var.h(null);
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.x = false;
            int i12 = this.a;
            if (i12 == 0) {
                ((gf0) zu0VarArr[i12]).o();
                return;
            }
            return;
        }
        if (i10 == 20) {
            if (z10) {
                ((wd0) zu0VarArr[5]).L.l();
            }
        } else if (i10 == 151 && z10) {
            wd0 wd0Var = (wd0) zu0VarArr[5];
            wd0Var.post(new kc0(wd0Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        org.telegram.ui.Components.zu0 zu0Var;
        int i10;
        org.telegram.ui.Components.zu0[] zu0VarArr = this.b;
        super.onResume();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.zu0 zu0Var2 = zu0VarArr[i11];
                if ((zu0Var2 instanceof me0) && (i10 = ((me0) zu0Var2).V) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    zu0VarArr[this.a].c(true);
                    C1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        int i12 = this.a;
        if (i12 == 0 && !this.c0 && (zu0Var = zu0VarArr[i12]) != null) {
            zu0Var.j();
        }
        if (p1()) {
            org.telegram.messenger.i0.v1(this.fragmentView);
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
        }
        int i13 = this.a;
        if (i13 < 0 || i13 >= zu0VarArr.length) {
            return;
        }
        zu0VarArr[i13].i();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.U != null && this.X != null && this.W != null && this.V != null && this.N != null && this.M != null && this.c != null) {
                for (org.telegram.ui.Components.zu0 zu0Var : this.b) {
                    if (zu0Var == null) {
                        return;
                    }
                }
                G1();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final boolean p1() {
        return this.b[this.a].a() && !org.telegram.messenger.i0.C1();
    }

    public final boolean q1() {
        return this.F == 1;
    }

    public final void s1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.x1 x1Var;
        if (this.P != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.P, true);
            }
            this.P = 0;
        }
        if (q1() && (x1Var = this.R) != null) {
            x1Var.dismiss();
            this.R = null;
        }
        E1(false, z11, false);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.D ? 1 : 0);
            for (int i10 = 0; i10 <= this.a; i10++) {
                org.telegram.ui.Components.zu0 zu0Var = this.b[i10];
                if (zu0Var != null) {
                    zu0Var.l(bundle2);
                }
            }
            Context context = org.telegram.messenger.w0.b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            sb2.append(this.y ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            z1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void t1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = str;
        x1Var.T = str2;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), null);
        showDialog(x1Var);
    }

    public final void v1(int i10, boolean z10) {
        if (!q1() || i10 != 0) {
            this.P = i10;
            E1(true, z10, false);
        } else {
            if (this.R != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            this.R = x1Var;
            x1Var.i0 = false;
            x1Var.show();
        }
    }

    public final void w1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        org.telegram.messenger.vp.r1(this.currentAccount).Q();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        org.telegram.messenger.d20.i(this.currentAccount).b();
        org.telegram.messenger.vp.r1(this.currentAccount).Q();
        org.telegram.messenger.d20.i(this.currentAccount).U = this.D;
        org.telegram.messenger.d20.i(this.currentAccount).w(tL_auth_authorization.user);
        org.telegram.messenger.d20.i(this.currentAccount).v(true);
        org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(this.currentAccount);
        a02.a.c(new org.telegram.messenger.kr(a02, true, 1 == true ? 1 : 0));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        org.telegram.messenger.hs.a0(this.currentAccount).m1(arrayList, null, true, true);
        org.telegram.messenger.vp.r1(this.currentAccount).U3(tL_auth_authorization.user, false, false);
        org.telegram.messenger.i5 r10 = org.telegram.messenger.i5.r(this.currentAccount);
        r10.a = null;
        Utilities.e.c(new org.telegram.messenger.a5(r10, 0));
        Utilities.d.c(new org.telegram.messenger.zj(org.telegram.messenger.vp.r1(this.currentAccount), 25));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        org.telegram.messenger.vp.r1(this.currentAccount).P2(true);
        org.telegram.messenger.vp.r1(this.currentAccount).f3();
        org.telegram.messenger.vp.r1(this.currentAccount).M(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z11 = org.telegram.messenger.v2.a;
            org.telegram.messenger.f8.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b10 = org.telegram.messenger.y0.b();
            if (b10 == null) {
                b10 = new ArrayList();
            }
            b10.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("saved_tokens_login", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences.edit().clear().apply();
            for (int i10 = 0; i10 < Math.min(20, b10.size()); i10++) {
                arrayList2.add((TLRPC.TL_auth_authorization) b10.get(i10));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("count", arrayList2.size());
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i11)).getObjectSize());
                    ((TLRPC.TL_auth_authorization) arrayList2.get(i11)).serializeToStream(serializedData);
                    edit.putString("log_in_token_" + i11, Utilities.f(serializedData.toByteArray()));
                }
                edit.apply();
                BackupAgent.a();
            }
        } else {
            org.telegram.messenger.f8.b("onAuthSuccess future_auth_token is empty");
        }
        if (z10) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(this.currentAccount);
            r12.b2.put(0, true);
            r12.c2.put(0, true);
        }
        org.telegram.messenger.ui.b0(this.currentAccount).c1("tg_placeholders_android", false, true);
        boolean z12 = tL_auth_authorization.setup_password_required;
        int i12 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            org.telegram.messenger.i0.o3(getParentActivity(), false);
        }
        m1();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
                externalActionActivity.c.Z();
                ActionBarLayout actionBarLayout = externalActionActivity.d;
                if (actionBarLayout != null) {
                    actionBarLayout.Z();
                }
                org.telegram.ui.Components.uu0 uu0Var = externalActionActivity.e;
                if (uu0Var != null) {
                    uu0Var.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        int i13 = 6;
        if (this.y) {
            this.y = false;
            this.n0 = true;
            ((LaunchActivity) getParentActivity()).P0(this.currentAccount, new i2.y(i13, z10));
            this.n0 = false;
            finishFragment();
            return;
        }
        if (z10 && z12) {
            tc1 tc1Var = new tc1(6, null);
            tc1Var.G = i12;
            tc1Var.H = true;
            presentFragment(tc1Var, true);
        } else {
            Bundle g10 = a1.g.g("afterSignup", z10);
            pf0 pf0Var = new pf0();
            pf0Var.q0(g10);
            presentFragment(pf0Var, true);
        }
        org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.j0, new Object[0]);
        org.telegram.messenger.cd.D0().S0(this.currentAccount, true);
        e01.Z(true);
    }

    public final void x1() {
        if (this.Q[this.J]) {
            if (this.V.getTag() == null) {
                this.b[this.a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131744850, "StopLoadingTitle");
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131744851, "StopLoading");
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743239, "WaitMore"), null);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131744859, "Stop"), new cc0(this, 0));
            showDialog(x1Var);
        }
    }

    public final void y1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.o0 = new qq(this, str, auth_sentcode, 26);
            return;
        }
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        o1(bundle, auth_sentcode, true);
    }

    public hf0(int i10) {
        super(null);
        this.b = new org.telegram.ui.Components.zu0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.D = true;
        this.E = false;
        this.F = 0;
        this.K = new AnimatorSet[2];
        this.Q = new boolean[]{true, false};
        this.a0 = false;
        this.i0 = new boolean[2];
        this.j0 = new Runnable[2];
        this.k0 = new boolean[2];
        this.currentAccount = i10;
        this.y = true;
    }
}
