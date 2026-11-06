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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ce0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public org.telegram.ui.Components.t11 M;
    public org.telegram.ui.Components.p00 N;
    public h6.m O;
    public int P;
    public final boolean[] Q;
    public org.telegram.ui.ActionBar.u1 R;
    public v8 S;
    public qd0 T;
    public ImageView U;
    public RadialProgressView V;
    public ImageView W;
    public org.telegram.ui.Components.ig0 X;
    public LinearLayout Y;
    public k0 Z;
    public int a;
    public boolean a0;
    public final org.telegram.ui.Components.wt0[] b;
    public pd0 b0;
    public org.telegram.ui.Components.br c;
    public boolean c0;
    public ValueAnimator d;
    public Runnable d0;
    public boolean e;
    public cu e0;
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
    public rp o0;
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
    public qa0 x0;
    public boolean y;

    static {
        y0 = org.telegram.messenger.iz.o() <= 1 ? org.telegram.messenger.qs.g2 : 100;
    }

    public ce0() {
        super(null);
        this.b = new org.telegram.ui.Components.wt0[19];
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

    public static Bundle B1(int i7, boolean z9) {
        try {
            Bundle bundle = new Bundle();
            Context context = org.telegram.messenger.t0.b;
            StringBuilder sb2 = new StringBuilder("logininfo2");
            sb2.append(z9 ? "_" + i7 : "");
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return null;
        }
    }

    public static void E1(org.telegram.ui.ActionBar.f2 f2Var, String str, h6.m mVar, boolean z9) {
        List list;
        if (f2Var == null || f2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f2Var.getParentActivity());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z9) {
            u1Var.R = org.telegram.messenger.hd.M0(2131746072, null);
            u1Var.T = org.telegram.messenger.hd.M0(2131753725, "BannedPhoneNumber");
        } else if (mVar == null || (list = (List) mVar.c) == null || list.isEmpty() || ((ms) mVar.b) == null) {
            u1Var.R = org.telegram.messenger.hd.M0(2131746072, null);
            u1Var.T = org.telegram.messenger.hd.M0(2131749178, null);
        } else {
            Iterator it = ((List) mVar.c).iterator();
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i7) {
                    i7 = length;
                }
            }
            if (pf.b.d(str, false).length() - ((ms) mVar.b).c.length() < i7) {
                u1Var.R = org.telegram.messenger.hd.M0(2131742858, null);
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("ShortNumberInfo", null, 2131745357, ((ms) mVar.b).a, (String) mVar.d));
            } else {
                u1Var.R = org.telegram.messenger.hd.M0(2131746072, null);
                u1Var.T = org.telegram.messenger.hd.M0(2131749178, null);
            }
        }
        alertDialog$Builder.i(org.telegram.messenger.hd.M0(2131753061, "BotHelp"), new ab.j(str, f2Var, z9));
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, "OK"), null);
        f2Var.showDialog(u1Var);
    }

    public static void J1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a8.p0.D(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a8.p0.D(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a8.p0.D(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                J1((Bundle) obj, editor, str2);
            }
        }
    }

    public static void Z(ce0 ce0Var, String str, String str2, String str3) {
        ce0Var.F1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(ce0Var.currentAccount).sendRequest(deleteaccount, new bi.g2(ce0Var, str, str2, str3, 13), 10);
    }

    public static /* synthetic */ void a0(ce0 ce0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z9, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            org.telegram.messenger.a8.b("Resend firebase sms because integrity token = null");
            ce0Var.K1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(ce0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new wa0(1, bundle, auth_sentcode, ce0Var, z9), 10);
    }

    public static void b0(ce0 ce0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        ce0Var.C1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                ce0Var.M1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            ce0Var.M1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131746116, "ResetAccountCancelledAlert"));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(ce0Var.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        ce0Var.M1(8, true, bundle2, false);
    }

    public static boolean b1(ce0 ce0Var, View view) {
        if (ce0Var.z1()) {
            return true;
        }
        return org.telegram.messenger.g0.K3(view);
    }

    public static void c0(ce0 ce0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z9, p8.d dVar) {
        p8.e eVar = ((e8.d) ((com.google.android.gms.common.api.q) dVar.a)).b;
        String str2 = eVar == null ? null : eVar.a;
        if (str2 == null) {
            org.telegram.messenger.a8.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] split = str2.split("\\.");
        if (split.length <= 0) {
            org.telegram.messenger.a8.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (optBoolean && optBoolean2) {
                    ConnectionsManager.getInstance(ce0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new wa0(0, bundle, auth_sentcode, ce0Var, z9), 10);
                    return;
                }
                if (!optBoolean && !optBoolean2) {
                    org.telegram.messenger.a8.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                } else if (!optBoolean) {
                    org.telegram.messenger.a8.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                } else {
                    if (optBoolean2) {
                        return;
                    }
                    org.telegram.messenger.a8.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                }
            } catch (JSONException e10) {
                e = e10;
                org.telegram.messenger.a8.g(e, true);
                org.telegram.messenger.a8.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                ce0Var.K1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    public static void c1(ce0 ce0Var, View view, boolean z9) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        org.telegram.messenger.g0.G3(3.5f, view, null);
        if (z9 && (view instanceof org.telegram.ui.Components.lb0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.lb0 lb0Var = (org.telegram.ui.Components.lb0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = lb0Var.getAttachedEditText();
            fi.h7 h7Var = new fi.h7(attachedEditText, atomicReference, false, 5);
            lb0Var.a(1.0f);
            org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(lb0Var, view, attachedEditText, h7Var, 16);
            atomicReference.set(kn0Var);
            view.postDelayed(kn0Var, 2000L);
            view.setTag(R.id.timeout_callback, kn0Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(h7Var);
            }
        }
    }

    public static HashSet d1(ce0 ce0Var) {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int i7 = Build.VERSION.SDK_INT;
            SubscriptionManager from = SubscriptionManager.from(ce0Var.getParentActivity());
            List<SubscriptionInfo> completeActiveSubscriptionInfoList = i7 >= 30 ? from.getCompleteActiveSubscriptionInfoList() : null;
            if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i7 >= 28) {
                completeActiveSubscriptionInfoList = from.getAccessibleSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                completeActiveSubscriptionInfoList = from.getActiveSubscriptionInfoList();
            }
            if (completeActiveSubscriptionInfoList != null) {
                for (int i10 = 0; i10 < completeActiveSubscriptionInfoList.size(); i10++) {
                    String number = completeActiveSubscriptionInfoList.get(i10).getNumber();
                    if (!TextUtils.isEmpty(number)) {
                        hashSet.add(number);
                    }
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        return hashSet;
    }

    public static void t0(ce0 ce0Var, String str, String str2, String str3) {
        if (ce0Var.V.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131746098, "ResetMyAccountWarningText");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.hd.M0(2131746100, "ResetMyAccountWarning");
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746099, "ResetMyAccountWarningReset"), new a1.d(ce0Var, str, str2, str3, 16));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
        ce0Var.showDialog(u1Var);
    }

    public static void u1(ImageView imageView, int i7, int i10, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i7 != i10 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i7, mode));
            }
        }
    }

    public static void v1(ImageView imageView, int i7, int i10) {
        if (imageView == null) {
            return;
        }
        Drawable background = imageView.getBackground();
        if (background == null) {
            imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(i7, 1, -1));
        } else if (i7 != i10) {
            org.telegram.ui.ActionBar.k6.H1(background, i7, true);
        }
    }

    public static String x1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(simpleName);
            m10.append(exc.getMessage());
            simpleName = m10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public final boolean A1() {
        return this.F == 1;
    }

    public final void C1(boolean z9, boolean z10) {
        org.telegram.ui.ActionBar.u1 u1Var;
        if (this.P != 0) {
            if (z9) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.P, true);
            }
            this.P = 0;
        }
        if (A1() && (u1Var = this.R) != null) {
            u1Var.dismiss();
            this.R = null;
        }
        O1(false, z10, false);
    }

    public final void D1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = str2;
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, "OK"), null);
        showDialog(u1Var);
    }

    public final void F1(int i7, boolean z9) {
        if (!A1() || i7 != 0) {
            this.P = i7;
            O1(true, z9, false);
        } else {
            if (this.R != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
            this.R = u1Var;
            u1Var.i0 = false;
            u1Var.show();
        }
    }

    public final void G1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z9) {
        org.telegram.messenger.qp.s1(this.currentAccount).Q();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        org.telegram.messenger.p10.i(this.currentAccount).b();
        org.telegram.messenger.qp.s1(this.currentAccount).Q();
        org.telegram.messenger.p10.i(this.currentAccount).U = this.D;
        org.telegram.messenger.p10.i(this.currentAccount).w(tL_auth_authorization.user);
        org.telegram.messenger.p10.i(this.currentAccount).v(true);
        org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(this.currentAccount);
        a02.a.c(new org.telegram.messenger.dr(a02, true, 1 == true ? 1 : 0));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        org.telegram.messenger.yr.a0(this.currentAccount).m1(arrayList, null, true, true);
        org.telegram.messenger.qp.s1(this.currentAccount).X3(tL_auth_authorization.user, false, false);
        org.telegram.messenger.g5 r10 = org.telegram.messenger.g5.r(this.currentAccount);
        r10.a = null;
        Utilities.e.c(new org.telegram.messenger.x4(r10, 0));
        Utilities.d.c(new org.telegram.messenger.wj(org.telegram.messenger.qp.s1(this.currentAccount), 26));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        org.telegram.messenger.qp.s1(this.currentAccount).R2(true);
        org.telegram.messenger.qp.s1(this.currentAccount).h3();
        org.telegram.messenger.qp.s1(this.currentAccount).M(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z10 = org.telegram.messenger.r2.a;
            org.telegram.messenger.a8.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b10 = org.telegram.messenger.v0.b();
            if (b10 == null) {
                b10 = new ArrayList();
            }
            b10.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("saved_tokens_login", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences.edit().clear().apply();
            for (int i7 = 0; i7 < Math.min(20, b10.size()); i7++) {
                arrayList2.add((TLRPC.TL_auth_authorization) b10.get(i7));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("count", arrayList2.size());
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i10)).getObjectSize());
                    ((TLRPC.TL_auth_authorization) arrayList2.get(i10)).serializeToStream(serializedData);
                    edit.putString("log_in_token_" + i10, Utilities.f(serializedData.toByteArray()));
                }
                edit.apply();
                BackupAgent.a();
            }
        } else {
            org.telegram.messenger.a8.b("onAuthSuccess future_auth_token is empty");
        }
        if (z9) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.currentAccount);
            s12.b2.put(0, true);
            s12.c2.put(0, true);
        }
        org.telegram.messenger.ui.b0(this.currentAccount).c1("tg_placeholders_android", false, true);
        boolean z11 = tL_auth_authorization.setup_password_required;
        int i11 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            org.telegram.messenger.g0.p3(getParentActivity(), false);
        }
        w1();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
                externalActionActivity.c.a0();
                ActionBarLayout actionBarLayout = externalActionActivity.d;
                if (actionBarLayout != null) {
                    actionBarLayout.a0();
                }
                org.telegram.ui.Components.rt0 rt0Var = externalActionActivity.e;
                if (rt0Var != null) {
                    rt0Var.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.y) {
            this.y = false;
            this.n0 = true;
            ((LaunchActivity) getParentActivity()).P0(this.currentAccount, new l2.x(3, z9));
            this.n0 = false;
            finishFragment();
            return;
        }
        if (z9 && z11) {
            ya1 ya1Var = new ya1(6, null);
            ya1Var.G = i11;
            ya1Var.H = true;
            presentFragment(ya1Var, true);
        } else {
            Bundle k10 = a8.p0.k("afterSignup", z9);
            je0 je0Var = new je0();
            je0Var.r0(k10);
            presentFragment(je0Var, true);
        }
        org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.j0, new Object[0]);
        org.telegram.messenger.hd.E0().V0(this.currentAccount, true);
        qy0.a0(true);
    }

    public final void H1() {
        if (this.Q[this.J]) {
            if (this.V.getTag() == null) {
                this.b[this.a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131744833, "StopLoadingTitle");
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131744834, "StopLoading");
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743214, "WaitMore"), null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131744842, "Stop"), new ta0(this, 0));
            showDialog(u1Var);
        }
    }

    public final void I1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.o0 = new rp(this, str, auth_sentcode, 26);
            return;
        }
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        y1(bundle, auth_sentcode, true);
    }

    public final void K1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.p0) {
            C1(false, true);
            this.p0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new h50(7, this, bundle), 10);
        }
    }

    public final void L1(boolean z9, boolean z10) {
        if (this.a0 == z9 && z10) {
            return;
        }
        this.a0 = z9;
        int i7 = 0;
        if (org.telegram.messenger.g0.C1()) {
            z9 = false;
        }
        int i10 = 2;
        if (!z9) {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
            if (!z10) {
                this.c.setVisibility(8);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(org.telegram.ui.Components.ks.e);
            this.d.addUpdateListener(new ra0(this, i7));
            this.d.addListener(new cb0(this, 1));
            this.d.start();
            return;
        }
        org.telegram.messenger.g0.v1(this.fragmentView);
        org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        if (!z10) {
            this.c.setVisibility(0);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(org.telegram.ui.Components.xq.f);
        this.d.addUpdateListener(new ra0(this, i10));
        this.d.addListener(new cb0(this, i7));
        this.d.start();
    }

    public final void M1(int i7, boolean z9, Bundle bundle, boolean z10) {
        boolean z11 = i7 == 0 || i7 == 5 || i7 == 6 || i7 == 9 || i7 == 10 || i7 == 12 || i7 == 17 || i7 == 16;
        if (i7 == this.a) {
            z9 = false;
        }
        if (z11) {
            if (i7 == 0) {
                this.w = true;
                this.x = true;
            }
            this.J = 1;
            N1(false, z9);
            O1(false, z9, false);
            this.J = 0;
            O1(false, z9, false);
            if (!z9) {
                N1(true, false);
            }
        } else {
            this.J = 0;
            N1(false, z9);
            O1(false, z9, false);
            if (i7 != 8) {
                this.J = 1;
            }
        }
        org.telegram.ui.Components.wt0[] wt0VarArr = this.b;
        if (!z9) {
            this.U.setVisibility((wt0VarArr[i7].b() || this.y) ? 0 : 8);
            wt0VarArr[this.a].setVisibility(8);
            wt0VarArr[this.a].g();
            this.a = i7;
            wt0VarArr[i7].m(bundle, false);
            wt0VarArr[i7].setVisibility(0);
            setParentActivityTitle(wt0VarArr[i7].getHeaderName());
            wt0VarArr[i7].j();
            L1(wt0VarArr[i7].a(), false);
            return;
        }
        org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[this.a];
        org.telegram.ui.Components.wt0 wt0Var2 = wt0VarArr[i7];
        this.a = i7;
        this.U.setVisibility((wt0Var2.b() || this.y) ? 0 : 8);
        wt0Var2.m(bundle, false);
        setParentActivityTitle(wt0Var2.getHeaderName());
        wt0Var2.j();
        int i10 = org.telegram.messenger.g0.q.x;
        if (z10) {
            i10 = -i10;
        }
        wt0Var2.setX(i10);
        wt0Var2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new ai.g0(this, z11, wt0Var, 11));
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(wt0Var, (Property<org.telegram.ui.Components.wt0, Float>) property, z10 ? org.telegram.messenger.g0.q.x : -org.telegram.messenger.g0.q.x), ObjectAnimator.ofFloat(wt0Var2, (Property<org.telegram.ui.Components.wt0, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        L1(wt0Var2.a(), true);
    }

    public final void N1(boolean z9, boolean z10) {
        TimeInterpolator timeInterpolator;
        int i7 = this.J;
        boolean z11 = i7 == 0;
        boolean[] zArr = this.Q;
        if (zArr[i7] == z9) {
            return;
        }
        AnimatorSet[] animatorSetArr = this.K;
        AnimatorSet animatorSet = animatorSetArr[i7];
        if (animatorSet != null) {
            if (z10) {
                animatorSet.removeAllListeners();
            }
            animatorSetArr[this.J].cancel();
        }
        int i10 = this.J;
        zArr[i10] = z9;
        if (!z10) {
            if (z11) {
                this.N.e(z9, z10);
                return;
            }
            return;
        }
        animatorSetArr[i10] = new AnimatorSet();
        if (z11) {
            this.N.e(z9, z10);
        }
        animatorSetArr[this.J].addListener(new org.telegram.ui.ActionBar.g(this, z11, z9, 4));
        int i11 = org.telegram.messenger.qs.g2;
        if (!z11) {
            timeInterpolator = null;
        } else if (z9) {
            timeInterpolator = org.telegram.messenger.g0.F;
            i11 = org.telegram.messenger.qs.e3;
        } else {
            timeInterpolator = org.telegram.messenger.g0.G;
        }
        animatorSetArr[this.J].setDuration(i11);
        animatorSetArr[this.J].setInterpolator(timeInterpolator);
        animatorSetArr[this.J].start();
    }

    public final void O1(final boolean z9, final boolean z10, boolean z11) {
        boolean[] zArr = this.i0;
        if (z10 && zArr[this.J] == z9 && !z11) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.py(this, z9, z10, z11, 1));
            return;
        }
        final int i7 = this.J;
        int i10 = 1;
        boolean z12 = i7 == 0;
        boolean[] zArr2 = this.k0;
        if (z11 || z12) {
            zArr2[i7] = false;
            zArr[i7] = z9;
        } else {
            zArr[i7] = z9;
            if (z10) {
                boolean z13 = zArr2[i7];
                Runnable[] runnableArr = this.j0;
                if (z13) {
                    org.telegram.messenger.g0.r(runnableArr[i7]);
                    zArr2[this.J] = false;
                    return;
                } else if (z9) {
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.sa0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ce0 ce0Var = ce0.this;
                            int i11 = ce0Var.J;
                            ce0Var.J = i7;
                            ce0Var.O1(z9, z10, true);
                            ce0Var.J = i11;
                        }
                    };
                    runnableArr[i7] = runnable;
                    org.telegram.messenger.g0.i3(runnable, 2000L);
                    zArr2[this.J] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.L;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z12) {
            this.N.f(z9, z10);
            return;
        }
        if (z10) {
            this.L = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
            ofFloat.addListener(new z40(i10, this, z9));
            ofFloat.addUpdateListener(new ra0(this, i10));
            this.L.playTogether(ofFloat);
            this.L.setDuration(150L);
            this.L.start();
            return;
        }
        if (z9) {
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

    public final void P1(boolean z9, boolean z10) {
        if (z9 == this.w0) {
            return;
        }
        qa0 qa0Var = this.x0;
        if (qa0Var != null) {
            org.telegram.messenger.g0.r(qa0Var);
            this.x0 = null;
        }
        this.w0 = z9;
        this.W.clearAnimation();
        if (z10) {
            this.W.setVisibility(0);
            this.W.animate().alpha(z9 ? 1.0f : 0.0f).withEndAction(new org.telegram.ui.Components.tp0(9, this, z9)).start();
        } else {
            this.W.setVisibility(z9 ? 0 : 8);
            this.W.setAlpha(z9 ? 1.0f : 0.0f);
        }
    }

    public final void Q1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        ImageView imageView = this.U;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        u1(imageView, x02, this.r0, PorterDuff.Mode.SRC_ATOP);
        this.r0 = x02;
        ImageView imageView2 = this.U;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        v1(imageView2, x03, this.s0);
        this.s0 = x03;
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        if (x04 != this.t0 || this.X.getColorFilter() == null) {
            this.X.setColorFilter(new PorterDuffColorFilter(x04, PorterDuff.Mode.SRC_IN));
            this.t0 = x04;
        }
        ImageView imageView3 = this.W;
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        v1(imageView3, x05, this.u0);
        this.u0 = x05;
        RadialProgressView radialProgressView = this.V;
        int i11 = org.telegram.ui.ActionBar.k6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.N.updateColors();
        this.M.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.M.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        for (org.telegram.ui.Components.wt0 wt0Var : this.b) {
            wt0Var.updateColors();
        }
        org.telegram.ui.Components.br brVar = this.c;
        org.telegram.ui.Components.zq zqVar = brVar.a;
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        if (x06 != brVar.s || zqVar.getColorFilter() == null) {
            brVar.s = x06;
            zqVar.setColorFilter(x06, PorterDuff.Mode.SRC_ATOP);
        }
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
        int o4 = i0.a.o(x07, 30);
        boolean z9 = x07 != brVar.w;
        brVar.w = x07;
        int i12 = 0;
        while (true) {
            View[] viewArr = brVar.c;
            if (i12 >= viewArr.length) {
                break;
            }
            View view = viewArr[i12];
            if (view != null) {
                if (view.getBackground() == null) {
                    org.telegram.ui.Components.br.a(i12, view);
                } else if (z9) {
                    org.telegram.ui.ActionBar.k6.H1(view.getBackground(), x07, false);
                    org.telegram.ui.ActionBar.k6.H1(view.getBackground(), o4, true);
                }
                if (view instanceof org.telegram.ui.Components.ar) {
                    ((org.telegram.ui.Components.ar) view).updateColors();
                }
            }
            i12++;
        }
        pd0 pd0Var = this.b0;
        if (pd0Var != null) {
            int i13 = pd0.F;
            pd0Var.b();
        }
    }

    public final void R1(boolean z9, boolean z10) {
        if (this.X == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.v0 != connectionState || z10) {
            this.v0 = connectionState;
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
            boolean z11 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i7 = this.v0;
            boolean z12 = i7 == 3 || i7 == 5;
            boolean z13 = i7 == 1 || i7 == 2 || i7 == 4;
            if (z11) {
                this.X.b(true, z12, z9);
                P1(true, z9);
                return;
            }
            if ((!getMessagesController().y3 || org.telegram.messenger.iz.z1.isEmpty()) && !z13) {
                P1(false, z9);
                return;
            }
            this.X.b(true, z12, z9);
            if (this.w0) {
                return;
            }
            qa0 qa0Var = this.x0;
            if (qa0Var != null) {
                org.telegram.messenger.g0.r(qa0Var);
            }
            this.w0 = true;
            qa0 qa0Var2 = new qa0(this, 1);
            this.x0 = qa0Var2;
            org.telegram.messenger.g0.i3(qa0Var2, 5000L);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.n0) {
                this.m0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.n0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0439, code lost:
    
        if (r1 != 4) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z9;
        int i7;
        View view = this.m0;
        if (view != null) {
            this.fragmentView = view;
            this.m0 = null;
            return view;
        }
        final int i10 = 0;
        this.actionBar.setAddToContainer(false);
        int i11 = 13;
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, i11));
        this.J = 0;
        boolean[] zArr = this.Q;
        ?? r52 = 1;
        ?? r53 = 1;
        zArr[0] = true;
        zArr[1] = false;
        v8 v8Var = new v8(7, context, this);
        this.S = v8Var;
        v8Var.setDelegate(new ya0(i10, this));
        this.fragmentView = this.S;
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context, 3);
        m1Var.setFillViewport(true);
        this.S.addView(m1Var, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        m1Var.addView(this.Y, c8.ha.x(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(org.telegram.messenger.g0.Q1() ? 0 : org.telegram.messenger.g0.m);
        this.Y.addView(space);
        k0 k0Var = new k0(i11, context, this);
        this.Z = k0Var;
        this.Y.addView(k0Var, c8.ha.l(1.0f, -1, 0));
        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(context);
        this.c = brVar;
        brVar.setViewToFindFocus(this.Z);
        this.Y.addView(this.c, c8.ha.o(-1, org.telegram.messenger.qs.G3));
        be0 be0Var = new be0(this, context);
        org.telegram.ui.Components.wt0[] wt0VarArr = this.b;
        wt0VarArr[0] = be0Var;
        wt0VarArr[1] = new gd0(this, context, 1);
        final int i12 = 2;
        wt0VarArr[2] = new gd0(this, context, 2);
        wt0VarArr[3] = new gd0(this, context, 3);
        wt0VarArr[4] = new gd0(this, context, 4);
        wt0VarArr[5] = new pc0(this, context);
        wt0VarArr[6] = new xb0(this, context);
        wt0VarArr[7] = new hc0(this, context);
        wt0VarArr[8] = new qc0(this, context);
        wt0VarArr[9] = new ub0(this, context, 0);
        wt0VarArr[10] = new ub0(this, context, 1);
        wt0VarArr[11] = new gd0(this, context, 11);
        wt0VarArr[12] = new sc0(this, context);
        wt0VarArr[13] = new ob0(this, context, true);
        wt0VarArr[14] = new ob0(this, context, false);
        wt0VarArr[15] = new gd0(this, context, 15);
        wt0VarArr[16] = new ec0(this, context, 16);
        wt0VarArr[17] = new ec0(this, context, 17);
        int i13 = 18;
        wt0VarArr[18] = new ld0(this, context);
        int i14 = 0;
        while (i14 < wt0VarArr.length) {
            wt0VarArr[i14].setVisibility(i14 == 0 ? 0 : 8);
            this.Z.addView(wt0VarArr[i14], c8.ha.d(-1, -1.0f, 17, org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f, (i14 != i13) != false ? 30.0f : 0.0f, org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f, 0.0f));
            i14++;
            i13 = 18;
        }
        Bundle B1 = this.F == 0 ? B1(this.currentAccount, this.y) : null;
        if (B1 != null && ((i7 = B1.getInt("currentViewNum", 0)) < 0 || i7 >= wt0VarArr.length)) {
            B1 = null;
        }
        if (B1 != null) {
            this.a = B1.getInt("currentViewNum", 0);
            this.D = B1.getInt("syncContacts", 1) == 1;
            int i15 = this.a;
            if (i15 >= 1 && i15 <= 4) {
                int i16 = B1.getInt("open");
                if (i16 != 0 && Math.abs((System.currentTimeMillis() / 1000) - i16) >= 86400) {
                    this.a = 0;
                    w1();
                    B1 = null;
                }
            } else if (i15 == 6) {
                if (((xb0) wt0VarArr[6]).n == null) {
                    this.a = 0;
                    w1();
                    B1 = null;
                }
            } else if (i15 == 7 && ((hc0) wt0VarArr[7]).h == null) {
                this.a = 0;
                w1();
                B1 = null;
            }
        }
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.N = p00Var;
        p00Var.e(zArr[0], false);
        this.O = new h6.m(this.N);
        this.S.addView(this.N, c8.ha.d(56, 56.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.za0
            public final /* synthetic */ ce0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.H1();
                        break;
                    case 1:
                        ce0 ce0Var = this.b;
                        if (ce0Var.onBackPressed(true)) {
                            ce0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        ce0 ce0Var2 = this.b;
                        cu cuVar = ce0Var2.e0;
                        if (cuVar != null) {
                            cuVar.run();
                        }
                        ce0Var2.finishFragment();
                        break;
                    default:
                        ce0 ce0Var3 = this.b;
                        ce0Var3.getClass();
                        ce0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((r1.g) this.O.c).b(new ab0(this, i10));
        ImageView imageView = new ImageView(context);
        this.U = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.U;
        final ?? r54 = r53 == true ? 1 : 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.za0
            public final /* synthetic */ ce0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (r54) {
                    case 0:
                        this.b.H1();
                        break;
                    case 1:
                        ce0 ce0Var = this.b;
                        if (ce0Var.onBackPressed(true)) {
                            ce0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        ce0 ce0Var2 = this.b;
                        cu cuVar = ce0Var2.e0;
                        if (cuVar != null) {
                            cuVar.run();
                        }
                        ce0Var2.finishFragment();
                        break;
                    default:
                        ce0 ce0Var3 = this.b;
                        ce0Var3.getClass();
                        ce0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.U.setContentDescription(org.telegram.messenger.hd.M0(2131754878, null));
        int L = org.telegram.messenger.g0.L(4.0f);
        this.U.setPadding(L, L, L, L);
        this.S.addView(this.U, c8.ha.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.e0 != null && !this.g0 && this.h0) {
            TextView textView = new TextView(context);
            this.f0 = textView;
            textView.setGravity(19);
            this.f0.setTextSize(1, 15.0f);
            this.f0.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
            this.f0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            this.f0.setText(org.telegram.messenger.hd.M0(2131742818, null));
            org.telegram.ui.ActionBar.r6.V(this.f0, org.telegram.ui.ActionBar.k6.q6, null);
            this.S.addView(this.f0, c8.ha.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            this.f0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.za0
                public final /* synthetic */ ce0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            this.b.H1();
                            break;
                        case 1:
                            ce0 ce0Var = this.b;
                            if (ce0Var.onBackPressed(true)) {
                                ce0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            ce0 ce0Var2 = this.b;
                            cu cuVar = ce0Var2.e0;
                            if (cuVar != null) {
                                cuVar.run();
                            }
                            ce0Var2.finishFragment();
                            break;
                        default:
                            ce0 ce0Var3 = this.b;
                            ce0Var3.getClass();
                            ce0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
        }
        ?? imageView3 = new ImageView(context);
        this.W = imageView3;
        org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(context);
        this.X = ig0Var;
        imageView3.setImageDrawable(ig0Var);
        final int i17 = 3;
        this.W.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.za0
            public final /* synthetic */ ce0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.b.H1();
                        break;
                    case 1:
                        ce0 ce0Var = this.b;
                        if (ce0Var.onBackPressed(true)) {
                            ce0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        ce0 ce0Var2 = this.b;
                        cu cuVar = ce0Var2.e0;
                        if (cuVar != null) {
                            cuVar.run();
                        }
                        ce0Var2.finishFragment();
                        break;
                    default:
                        ce0 ce0Var3 = this.b;
                        ce0Var3.getClass();
                        ce0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.W.setAlpha(0.0f);
        this.W.setVisibility(8);
        this.S.addView(this.W, c8.ha.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        R1(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.V = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
        this.V.setAlpha(0.0f);
        this.V.setScaleX(0.1f);
        this.V.setScaleY(0.1f);
        this.S.addView(this.V, c8.ha.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.t11 t11Var = new org.telegram.ui.Components.t11(context);
        this.M = t11Var;
        t11Var.setTransformType(0);
        this.M.setProgress(1.0f);
        this.M.setDrawBackground(false);
        this.N.setContentDescription(org.telegram.messenger.hd.M0(2131751355, null));
        this.N.addView(this.M, c8.ha.e(56, 56, 17));
        this.N.a(this.M);
        if (B1 != null) {
            this.f = true;
        }
        int i18 = 0;
        while (i18 < wt0VarArr.length) {
            org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i18];
            if (B1 != null) {
                if (i18 < r52 || i18 > 4) {
                    wt0Var.k(B1);
                } else if (i18 == this.a) {
                    wt0Var.k(B1);
                }
            }
            if (this.a == i18) {
                this.U.setVisibility((wt0Var.b() || this.y || this.F == 2) ? 0 : 8);
                wt0Var.setVisibility(0);
                wt0Var.j();
                L1(wt0Var.a(), false);
                this.J = 0;
                if (i18 != 0 && i18 != 5 && i18 != 6) {
                    if (i18 != 9) {
                        if (i18 != 10 && i18 != 12) {
                            z9 = false;
                            N1(z9, false);
                            if (i18 == r52 && i18 != 2) {
                                if (i18 != 3) {
                                }
                            }
                            this.J = r52;
                        }
                        z9 = r52;
                        N1(z9, false);
                        if (i18 == r52) {
                        }
                        this.J = r52;
                    }
                }
                z9 = r52;
                N1(z9, false);
                if (i18 == r52) {
                }
                this.J = r52;
            } else if (wt0Var.getVisibility() != 8) {
                wt0Var.setVisibility(8);
                wt0Var.g();
            }
            i18++;
            r52 = 1;
        }
        this.f = false;
        Q1();
        if (A1()) {
            y1(this.H, this.I, false);
        }
        rp rpVar = this.o0;
        if (rpVar != null) {
            this.o0 = null;
            rpVar.run();
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T1) {
            R1(true, false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.s1 && this.h0) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            if (messagesController.S3.contains("SETUP_LOGIN_EMAIL") || messagesController.S3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                return;
            }
            finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(11, this), org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.D6, org.telegram.ui.ActionBar.k6.H6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.O9, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.i7, org.telegram.ui.ActionBar.k6.q6, org.telegram.ui.ActionBar.k6.Ki, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.J6, org.telegram.ui.ActionBar.k6.Y6, org.telegram.ui.ActionBar.k6.W6, org.telegram.ui.ActionBar.k6.X6, org.telegram.ui.ActionBar.k6.h5, org.telegram.ui.ActionBar.k6.q5, org.telegram.ui.ActionBar.k6.j5);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.h0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        pc0 pc0Var = (pc0) this.b[5];
        if (pc0Var != null) {
            pc0Var.M.h(i7, i10, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!this.h0 || this.a != 12) {
            int i7 = this.a;
            org.telegram.ui.Components.wt0[] wt0VarArr = this.b;
            if (i7 == 0 || (this.F == 3 && i7 == 12)) {
                if (z9) {
                    for (org.telegram.ui.Components.wt0 wt0Var : wt0VarArr) {
                        if (wt0Var != null) {
                            wt0Var.f();
                        }
                    }
                    w1();
                }
                return true;
            }
            if (i7 == 6) {
                if (z9) {
                    wt0VarArr[i7].c(true);
                    M1(0, true, null, true);
                    return false;
                }
            } else if (i7 == 7 || i7 == 8) {
                if (z9) {
                    wt0VarArr[i7].c(true);
                    M1(6, true, null, true);
                }
            } else if ((i7 >= 1 && i7 <= 4) || i7 == 11 || i7 == 15) {
                if (z9 && wt0VarArr[i7].c(false)) {
                    M1(0, true, null, true);
                    return false;
                }
            } else if (i7 == 5) {
                if (z9) {
                    ((pc0) wt0VarArr[i7]).x.callOnClick();
                    return false;
                }
            } else if (i7 == 9) {
                if (z9) {
                    wt0VarArr[i7].c(true);
                    M1(7, true, null, true);
                    return false;
                }
            } else if (i7 == 10) {
                if (z9) {
                    wt0VarArr[i7].c(true);
                    M1(9, true, null, true);
                    return false;
                }
            } else if (i7 == 13) {
                if (z9) {
                    wt0VarArr[i7].c(true);
                    M1(12, true, null, true);
                    return false;
                }
            } else if (z9 && wt0VarArr[i7].c(true)) {
                M1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onConfigurationChanged(Configuration configuration) {
        L1(this.b[this.a].a(), false);
        pd0 pd0Var = this.b0;
        if (pd0Var != null) {
            int i7 = pd0.F;
            pd0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f2
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
                org.telegram.messenger.g0.i3(new qa0(this, 0), 200L);
                getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
            }
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.T1);
        getNotificationCenter().c(this, org.telegram.messenger.qs.s1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.wt0[] wt0VarArr = this.b;
            if (i7 >= wt0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i7];
            if (wt0Var != null) {
                wt0Var.f();
            }
            i7++;
        }
        org.telegram.ui.ActionBar.u1 u1Var = this.R;
        if (u1Var != null) {
            u1Var.dismiss();
            this.R = null;
        }
        for (Runnable runnable : this.j0) {
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.qs.T1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.s1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z9 = iArr[0] == 0;
        org.telegram.ui.Components.wt0[] wt0VarArr = this.b;
        if (i7 == 6) {
            this.w = false;
            int i10 = this.a;
            if (i10 == 0) {
                org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i10];
                ((be0) wt0Var).N = true;
                wt0Var.h(null);
                return;
            }
            return;
        }
        if (i7 == 7) {
            this.x = false;
            int i11 = this.a;
            if (i11 == 0) {
                ((be0) wt0VarArr[i11]).p();
                return;
            }
            return;
        }
        if (i7 == 20) {
            if (z9) {
                ((pc0) wt0VarArr[5]).M.l();
            }
        } else if (i7 == 151 && z9) {
            pc0 pc0Var = (pc0) wt0VarArr[5];
            pc0Var.post(new bb0(pc0Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        org.telegram.ui.Components.wt0 wt0Var;
        int i7;
        org.telegram.ui.Components.wt0[] wt0VarArr = this.b;
        super.onResume();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i10 = this.a;
            if (i10 >= 1 && i10 <= 4) {
                org.telegram.ui.Components.wt0 wt0Var2 = wt0VarArr[i10];
                if ((wt0Var2 instanceof gd0) && (i7 = ((gd0) wt0Var2).V) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                    wt0VarArr[this.a].c(true);
                    M1(0, false, null, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int i11 = this.a;
        if (i11 == 0 && !this.c0 && (wt0Var = wt0VarArr[i11]) != null) {
            wt0Var.j();
        }
        if (z1()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        }
        int i12 = this.a;
        if (i12 < 0 || i12 >= wt0VarArr.length) {
            return;
        }
        wt0VarArr[i12].i();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.U != null && this.X != null && this.W != null && this.V != null && this.N != null && this.M != null && this.c != null) {
                for (org.telegram.ui.Components.wt0 wt0Var : this.b) {
                    if (wt0Var == null) {
                        return;
                    }
                }
                Q1();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.D ? 1 : 0);
            for (int i7 = 0; i7 <= this.a; i7++) {
                org.telegram.ui.Components.wt0 wt0Var = this.b[i7];
                if (wt0Var != null) {
                    wt0Var.l(bundle2);
                }
            }
            Context context = org.telegram.messenger.t0.b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            sb2.append(this.y ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            J1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void w1() {
        String str;
        Context context = org.telegram.messenger.t0.b;
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

    public final void y1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z9) {
        final int i7 = 1;
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            M1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        final int i10 = 0;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.p0) {
            if (!org.telegram.messenger.tt.b.hasServices()) {
                org.telegram.messenger.a8.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                K1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            F1(0, true);
            this.p0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                org.telegram.messenger.a8.b("getting classic integrity with nonce = ".concat(str));
                create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new ua0(this, bundle, auth_sentcode, string, z9)).addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.va0
                    public final /* synthetic */ ce0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        switch (i10) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + ce0.x1(exc);
                                org.telegram.messenger.a8.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                this.b.K1(bundle, auth_sentcode, str2);
                                break;
                            default:
                                org.telegram.messenger.a8.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + ce0.x1(exc);
                                org.telegram.messenger.a8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.b.K1(bundle, auth_sentcode, str3);
                                break;
                        }
                    }
                });
                return;
            }
            b9.j0 j0Var = new b9.j0(org.telegram.messenger.t0.b, p8.c.a, null, new sa.d(6));
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = org.telegram.messenger.r2.f;
            com.google.android.gms.common.api.internal.n0 n0Var = j0Var.i;
            b9.g0 g0Var = new b9.g0(n0Var, bArr, str2);
            n0Var.b.d(0, g0Var);
            q6.m.m(g0Var, new q6.n(new p8.d())).addOnSuccessListener(new ua0(this, string, auth_sentcode, bundle, z9)).addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.va0
                public final /* synthetic */ ce0 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    switch (i7) {
                        case 0:
                            String str22 = "PLAYINTEGRITY_EXCEPTION_" + ce0.x1(exc);
                            org.telegram.messenger.a8.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                            this.b.K1(bundle, auth_sentcode, str22);
                            break;
                        default:
                            org.telegram.messenger.a8.g(exc, true);
                            String str3 = "SAFETYNET_EXCEPTION_" + ce0.x1(exc);
                            org.telegram.messenger.a8.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                            this.b.K1(bundle, auth_sentcode, str3);
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
            M1(1, z9, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            boolean z10 = org.telegram.messenger.r2.a;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", auth_sentcode.type.length);
            M1(4, z9, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            M1(3, z9, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            M1(2, z9, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            M1(15, z9, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            M1(11, z9, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            M1(12, z9, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            M1(14, z9, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            M1(16, z9, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            M1(17, z9, bundle, false);
        }
    }

    public final boolean z1() {
        return this.b[this.a].a() && !org.telegram.messenger.g0.C1();
    }

    public ce0(int i7) {
        super(null);
        this.b = new org.telegram.ui.Components.wt0[19];
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
        this.currentAccount = i7;
        this.y = true;
    }
}
