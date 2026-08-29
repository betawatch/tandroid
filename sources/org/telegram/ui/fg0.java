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
import com.google.android.gms.tasks.Task;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fg0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int p0;
    public boolean A;
    public int B;
    public String C;
    public Bundle D;
    public TLRPC.TL_auth_sentCode E;
    public int F;
    public final AnimatorSet[] G;
    public AnimatorSet H;
    public org.telegram.ui.Components.u21 I;
    public org.telegram.ui.Components.u10 J;
    public oc.i K;
    public int L;
    public final boolean[] M;
    public org.telegram.ui.ActionBar.c2 N;
    public ih.j4 O;
    public uf0 P;
    public ImageView Q;
    public RadialProgressView R;
    public ImageView S;
    public org.telegram.ui.Components.bi0 T;
    public LinearLayout U;
    public n0 V;
    public boolean W;
    public tf0 X;
    public boolean Y;
    public Runnable Z;
    public int a;
    public vv a0;
    public final org.telegram.ui.Components.mv0[] b;
    public TextView b0;
    public org.telegram.ui.Components.or c;
    public boolean c0;
    public ValueAnimator d;
    public boolean d0;
    public boolean e;
    public final boolean[] e0;
    public boolean f;
    public final Runnable[] f0;
    public final boolean[] g0;
    public Dialog h;
    public boolean h0;
    public View i0;
    public boolean j0;
    public boolean k0;
    public TLRPC.TL_help_termsOfService l0;
    public int m0;
    public Dialog n;
    public boolean n0;
    public tc0 o0;
    public final ArrayList r;
    public final ArrayList s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        p0 = SharedConfig.getDevicePerformanceClass() <= 1 ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : 100;
    }

    public fg0() {
        super(null);
        this.b = new org.telegram.ui.Components.mv0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = true;
        this.w = true;
        this.y = true;
        this.A = false;
        this.B = 0;
        this.G = new AnimatorSet[2];
        this.M = new boolean[]{true, false};
        this.W = false;
        this.e0 = new boolean[2];
        this.f0 = new Runnable[2];
        this.g0 = new boolean[2];
    }

    public static boolean T0(fg0 fg0Var, View view) {
        if (fg0Var.h1()) {
            return true;
        }
        return AndroidUtilities.showKeyboard(view);
    }

    public static void U(fg0 fg0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        fg0Var.k1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                fg0Var.u1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            fg0Var.u1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(fg0Var.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        fg0Var.u1(8, true, bundle2, false);
    }

    public static void U0(fg0 fg0Var, View view, boolean z10) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z10 && (view instanceof org.telegram.ui.Components.uc0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.uc0 uc0Var = (org.telegram.ui.Components.uc0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = uc0Var.getAttachedEditText();
            ag.c0 c0Var = new ag.c0(9, attachedEditText, atomicReference);
            uc0Var.a(1.0f);
            n20 n20Var = new n20(uc0Var, view, attachedEditText, c0Var, 10);
            atomicReference.set(n20Var);
            view.postDelayed(n20Var, 2000L);
            view.setTag(R.id.timeout_callback, n20Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(c0Var);
            }
        }
    }

    public static void V(fg0 fg0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z10, y7.d dVar) {
        y7.e eVar = ((n7.d) ((com.google.android.gms.common.api.q) dVar.a)).b;
        String str2 = eVar == null ? null : eVar.a;
        if (str2 == null) {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] split = str2.split("\\.");
        if (split.length <= 0) {
            FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (optBoolean && optBoolean2) {
                    ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new xc0(1, bundle, auth_sentcode, fg0Var, z10), 10);
                    return;
                }
                if (!optBoolean && !optBoolean2) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                } else if (!optBoolean) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                } else {
                    if (optBoolean2) {
                        return;
                    }
                    FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                }
            } catch (JSONException e10) {
                e = e10;
                FileLog.e(e);
                FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                fg0Var.s1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    public static HashSet V0(fg0 fg0Var) {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22) {
                SubscriptionManager from = SubscriptionManager.from(fg0Var.getParentActivity());
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
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        return hashSet;
    }

    public static void W(fg0 fg0Var, String str, String str2, String str3) {
        fg0Var.n1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(deleteaccount, new ih.c1(fg0Var, str, str2, str3, 12), 10);
    }

    public static /* synthetic */ void X(fg0 fg0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z10, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            fg0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(fg0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new xc0(0, bundle, auth_sentcode, fg0Var, z10), 10);
    }

    public static String f1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n(simpleName);
            n10.append(exc.getMessage());
            simpleName = n10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle j1(int i10, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
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
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static void m1(org.telegram.ui.ActionBar.o2 o2Var, String str, l3.g0 g0Var, boolean z10) {
        List list;
        if (o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        if (z10) {
            c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            c2Var.P = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
        } else if (g0Var == null || (list = (List) g0Var.c) == null || list.isEmpty() || ((lt) g0Var.b) == null) {
            c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            c2Var.P = LocaleController.getString(R.string.InvalidPhoneNumber);
        } else {
            Iterator it = ((List) g0Var.c).iterator();
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i10) {
                    i10 = length;
                }
            }
            if (qe.b.d(str, false).length() - ((lt) g0Var.b).c.length() < i10) {
                c2Var.N = LocaleController.getString(R.string.WrongNumberFormat);
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((lt) g0Var.b).a, (String) g0Var.d));
            } else {
                c2Var.N = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                c2Var.P = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
        }
        alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new com.google.firebase.messaging.i(str, o2Var, z10));
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        o2Var.showDialog(c2Var);
    }

    public static void n0(fg0 fg0Var, String str, String str2, String str3) {
        if (fg0Var.R.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
        alertDialog$Builder.a.P = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.a.N = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(fg0Var, str, str2, str3, 14));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        fg0Var.showDialog(alertDialog$Builder.a);
    }

    public static void r1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(a4.w.y(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(a4.w.y(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(a4.w.y(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                r1((Bundle) obj, editor, str2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (this.j0) {
                this.i0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && !this.j0) {
            ViewGroup viewGroup2 = (ViewGroup) lVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0442, code lost:
    
        if (r1 != 4) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x043d A[ADDED_TO_REGION] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z10;
        int i10;
        View view = this.i0;
        if (view != null) {
            this.fragmentView = view;
            this.i0 = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 22));
        this.F = 0;
        boolean[] zArr = this.M;
        zArr[0] = true;
        zArr[1] = false;
        ih.j4 j4Var = new ih.j4(this, context, 6);
        this.O = j4Var;
        j4Var.setDelegate(new ad0(0, this));
        this.fragmentView = this.O;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context, 4);
        w1Var.setFillViewport(true);
        this.O.addView(w1Var, i7.f6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        w1Var.addView(this.U, i7.f6.x(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
        this.U.addView(space);
        n0 n0Var = new n0(this, context, 12);
        this.V = n0Var;
        this.U.addView(n0Var, i7.f6.l(1.0f, -1, 0));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(context);
        this.c = orVar;
        orVar.setViewToFindFocus(this.V);
        this.U.addView(this.c, i7.f6.n(-1, 230));
        eg0 eg0Var = new eg0(this, context);
        org.telegram.ui.Components.mv0[] mv0VarArr = this.b;
        mv0VarArr[0] = eg0Var;
        mv0VarArr[1] = new if0(this, context, 1);
        mv0VarArr[2] = new if0(this, context, 2);
        mv0VarArr[3] = new if0(this, context, 3);
        mv0VarArr[4] = new if0(this, context, 4);
        mv0VarArr[5] = new pe0(this, context);
        mv0VarArr[6] = new xd0(this, context);
        mv0VarArr[7] = new ie0(this, context);
        int i11 = 8;
        mv0VarArr[8] = new qe0(this, context);
        mv0VarArr[9] = new ud0(this, context, 0);
        mv0VarArr[10] = new ud0(this, context, 1);
        mv0VarArr[11] = new if0(this, context, 11);
        mv0VarArr[12] = new te0(this, context);
        mv0VarArr[13] = new pd0(this, context, true);
        mv0VarArr[14] = new pd0(this, context, false);
        mv0VarArr[15] = new if0(this, context, 15);
        mv0VarArr[16] = new fe0(this, context, 16);
        mv0VarArr[17] = new fe0(this, context, 17);
        int i12 = 18;
        mv0VarArr[18] = new of0(this, context);
        int i13 = 0;
        while (i13 < mv0VarArr.length) {
            org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[i13];
            if (i13 == 0) {
                i11 = 0;
            }
            mv0Var.setVisibility(i11);
            this.V.addView(mv0VarArr[i13], i7.f6.d(-1, -1.0f, 17, AndroidUtilities.isTablet() ? 26.0f : 18.0f, i13 != i12 ? 30.0f : 0.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
            i13++;
            i12 = 18;
            i11 = 8;
        }
        Bundle j12 = this.B == 0 ? j1(this.currentAccount, this.x) : null;
        if (j12 != null && ((i10 = j12.getInt("currentViewNum", 0)) < 0 || i10 >= mv0VarArr.length)) {
            j12 = null;
        }
        if (j12 != null) {
            this.a = j12.getInt("currentViewNum", 0);
            this.y = j12.getInt("syncContacts", 1) == 1;
            int i14 = this.a;
            if (i14 >= 1 && i14 <= 4) {
                int i15 = j12.getInt("open");
                if (i15 != 0 && Math.abs((System.currentTimeMillis() / 1000) - i15) >= 86400) {
                    this.a = 0;
                    e1();
                    j12 = null;
                }
            } else if (i14 == 6) {
                if (((xd0) mv0VarArr[6]).n == null) {
                    this.a = 0;
                    e1();
                    j12 = null;
                }
            } else if (i14 == 7 && ((ie0) mv0VarArr[7]).h == null) {
                this.a = 0;
                e1();
                j12 = null;
            }
        }
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.J = u10Var;
        u10Var.e(zArr[0], false);
        this.K = new oc.i(this.J);
        this.O.addView(this.J, i7.f6.d(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        final int i16 = 0;
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bd0
            public final /* synthetic */ fg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.b.p1();
                        break;
                    case 1:
                        fg0 fg0Var = this.b;
                        if (fg0Var.onBackPressed(true)) {
                            fg0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        fg0 fg0Var2 = this.b;
                        vv vvVar = fg0Var2.a0;
                        if (vvVar != null) {
                            vvVar.run();
                        }
                        fg0Var2.finishFragment();
                        break;
                    default:
                        fg0 fg0Var3 = this.b;
                        fg0Var3.getClass();
                        fg0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((o1.k) this.K.c).b(new cd0(this, i16));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        final int i17 = 1;
        this.Q.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bd0
            public final /* synthetic */ fg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.b.p1();
                        break;
                    case 1:
                        fg0 fg0Var = this.b;
                        if (fg0Var.onBackPressed(true)) {
                            fg0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        fg0 fg0Var2 = this.b;
                        vv vvVar = fg0Var2.a0;
                        if (vvVar != null) {
                            vvVar.run();
                        }
                        fg0Var2.finishFragment();
                        break;
                    default:
                        fg0 fg0Var3 = this.b;
                        fg0Var3.getClass();
                        fg0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.Q.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        int dp = AndroidUtilities.dp(4.0f);
        this.Q.setPadding(dp, dp, dp, dp);
        this.O.addView(this.Q, i7.f6.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.a0 != null && !this.c0 && this.d0) {
            TextView textView = new TextView(context);
            this.b0 = textView;
            textView.setGravity(19);
            this.b0.setTextSize(1, 15.0f);
            this.b0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.b0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.b0.setText(LocaleController.getString(R.string.YourEmailSkip));
            this.b0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
            this.O.addView(this.b0, i7.f6.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            final int i18 = 2;
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bd0
                public final /* synthetic */ fg0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            this.b.p1();
                            break;
                        case 1:
                            fg0 fg0Var = this.b;
                            if (fg0Var.onBackPressed(true)) {
                                fg0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            fg0 fg0Var2 = this.b;
                            vv vvVar = fg0Var2.a0;
                            if (vvVar != null) {
                                vvVar.run();
                            }
                            fg0Var2.finishFragment();
                            break;
                        default:
                            fg0 fg0Var3 = this.b;
                            fg0Var3.getClass();
                            fg0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
        }
        ImageView imageView2 = new ImageView(context);
        this.S = imageView2;
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(context);
        this.T = bi0Var;
        imageView2.setImageDrawable(bi0Var);
        final int i19 = 3;
        this.S.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bd0
            public final /* synthetic */ fg0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        this.b.p1();
                        break;
                    case 1:
                        fg0 fg0Var = this.b;
                        if (fg0Var.onBackPressed(true)) {
                            fg0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        fg0 fg0Var2 = this.b;
                        vv vvVar = fg0Var2.a0;
                        if (vvVar != null) {
                            vvVar.run();
                        }
                        fg0Var2.finishFragment();
                        break;
                    default:
                        fg0 fg0Var3 = this.b;
                        fg0Var3.getClass();
                        fg0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.S.setAlpha(0.0f);
        this.S.setVisibility(8);
        this.O.addView(this.S, i7.f6.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        z1(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.R = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.R.setAlpha(0.0f);
        this.R.setScaleX(0.1f);
        this.R.setScaleY(0.1f);
        this.O.addView(this.R, i7.f6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.u21 u21Var = new org.telegram.ui.Components.u21(context);
        this.I = u21Var;
        u21Var.setTransformType(0);
        this.I.setProgress(1.0f);
        this.I.setDrawBackground(false);
        this.J.setContentDescription(LocaleController.getString(R.string.Done));
        this.J.addView(this.I, i7.f6.e(56, 56, 17));
        this.J.a(this.I);
        if (j12 != null) {
            this.f = true;
        }
        int i20 = 0;
        while (i20 < mv0VarArr.length) {
            org.telegram.ui.Components.mv0 mv0Var2 = mv0VarArr[i20];
            if (j12 != null) {
                if (i20 < 1 || i20 > 4) {
                    mv0Var2.k(j12);
                } else if (i20 == this.a) {
                    mv0Var2.k(j12);
                }
            }
            if (this.a == i20) {
                this.Q.setVisibility((mv0Var2.b() || this.x || this.B == 2) ? 0 : 8);
                mv0Var2.setVisibility(0);
                mv0Var2.j();
                t1(mv0Var2.a(), false);
                this.F = 0;
                if (i20 != 0 && i20 != 5 && i20 != 6) {
                    if (i20 != 9) {
                        if (i20 != 10 && i20 != 12) {
                            z10 = false;
                            v1(z10, false);
                            if (i20 == 1 && i20 != 2) {
                                if (i20 != 3) {
                                }
                            }
                            this.F = 1;
                        }
                        z10 = true;
                        v1(z10, false);
                        if (i20 == 1) {
                        }
                        this.F = 1;
                    }
                }
                z10 = true;
                v1(z10, false);
                if (i20 == 1) {
                }
                this.F = 1;
            } else if (mv0Var2.getVisibility() != 8) {
                mv0Var2.setVisibility(8);
                mv0Var2.g();
            }
            i20++;
        }
        this.f = false;
        y1();
        if (i1()) {
            g1(this.D, this.E, false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            z1(true, false);
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && this.d0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void e1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb2 = new StringBuilder("logininfo2");
        if (this.x) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb2.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void g1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z10) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            u1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.k0) {
            if (!PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                s1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            n1(0, true);
            this.k0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                FileLog.d("getting classic integrity with nonce = ".concat(str));
                Task<IntegrityTokenResponse> addOnSuccessListener = create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new uc0(this, bundle, auth_sentcode, string, z10));
                final int i10 = 0;
                addOnSuccessListener.addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.vc0
                    public final /* synthetic */ fg0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        switch (i10) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + fg0.f1(exc);
                                FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                this.b.s1(bundle, auth_sentcode, str2);
                                break;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + fg0.f1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.b.s1(bundle, auth_sentcode, str3);
                                break;
                        }
                    }
                });
                return;
            }
            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(ApplicationLoader.applicationContext, y7.c.a, null, new com.google.android.gms.common.api.internal.a());
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = BuildVars.SAFETYNET_KEY;
            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
            k8.j0 j0Var = new k8.j0(t0Var, bArr, str2);
            t0Var.b.d(0, j0Var);
            Task addOnSuccessListener2 = z5.l.n(j0Var, new z5.m(new y7.d())).addOnSuccessListener(new uc0(this, string, auth_sentcode, bundle, z10));
            final int i11 = 1;
            addOnSuccessListener2.addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.vc0
                public final /* synthetic */ fg0 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    switch (i11) {
                        case 0:
                            String str22 = "PLAYINTEGRITY_EXCEPTION_" + fg0.f1(exc);
                            FileLog.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                            this.b.s1(bundle, auth_sentcode, str22);
                            break;
                        default:
                            FileLog.e(exc);
                            String str3 = "SAFETYNET_EXCEPTION_" + fg0.f1(exc);
                            FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                            this.b.s1(bundle, auth_sentcode, str3);
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
            u1(1, z10, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            auth_sentcode.timeout = BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * MediaDataController.MAX_STYLE_RUNS_COUNT);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(4, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            u1(3, z10, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            u1(2, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(15, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            u1(11, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            u1(12, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            u1(14, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            u1(16, z10, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            u1(17, z10, bundle, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 22), org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.D6, org.telegram.ui.ActionBar.g6.H6, org.telegram.ui.ActionBar.g6.i6, org.telegram.ui.ActionBar.g6.P9, org.telegram.ui.ActionBar.g6.O9, org.telegram.ui.ActionBar.g6.k6, org.telegram.ui.ActionBar.g6.l6, org.telegram.ui.ActionBar.g6.I6, org.telegram.ui.ActionBar.g6.q7, org.telegram.ui.ActionBar.g6.y6, org.telegram.ui.ActionBar.g6.i7, org.telegram.ui.ActionBar.g6.q6, org.telegram.ui.ActionBar.g6.Wh, org.telegram.ui.ActionBar.g6.Q9, org.telegram.ui.ActionBar.g6.p7, org.telegram.ui.ActionBar.g6.J6, org.telegram.ui.ActionBar.g6.Y6, org.telegram.ui.ActionBar.g6.W6, org.telegram.ui.ActionBar.g6.X6, org.telegram.ui.ActionBar.g6.h5, org.telegram.ui.ActionBar.g6.q5, org.telegram.ui.ActionBar.g6.j5);
    }

    public final boolean h1() {
        return this.b[this.a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final boolean i1() {
        return this.B == 1;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.d0;
    }

    public final void k1(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.c2 c2Var;
        if (this.L != 0) {
            if (z10) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.L, true);
            }
            this.L = 0;
        }
        if (i1() && (c2Var = this.N) != null) {
            c2Var.dismiss();
            this.N = null;
        }
        w1(false, z11, false);
    }

    public final void l1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = str;
        c2Var.P = str2;
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void n1(int i10, boolean z10) {
        if (!i1() || i10 != 0) {
            this.L = i10;
            w1(true, z10, false);
        } else {
            if (this.N != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.N = c2Var;
            c2Var.c0 = false;
            c2Var.show();
        }
    }

    public final void o1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z10) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.y;
        UserConfig.getInstance(this.currentAccount).setCurrentUser(tL_auth_authorization.user);
        UserConfig.getInstance(this.currentAccount).saveConfig(true);
        MessagesStorage.getInstance(this.currentAccount).cleanup(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(this.currentAccount).putUser(tL_auth_authorization.user, false);
        ContactsController.getInstance(this.currentAccount).checkAppAccount();
        MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        MessagesController.getInstance(this.currentAccount).loadAppConfig();
        MessagesController.getInstance(this.currentAccount).lambda$removeWebBrowserException$514();
        MessagesController.getInstance(this.currentAccount).checkPeerColors(false);
        if (tL_auth_authorization.future_auth_token != null) {
            AuthTokensHelper.saveLogInToken(tL_auth_authorization);
        } else {
            FileLog.d("onAuthSuccess future_auth_token is empty");
        }
        if (z10) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, true);
        boolean z11 = tL_auth_authorization.setup_password_required;
        int i10 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        e1();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
                externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.v, true, externalActionActivity.r, externalActionActivity.s);
                externalActionActivity.c.X();
                ActionBarLayout actionBarLayout = externalActionActivity.d;
                if (actionBarLayout != null) {
                    actionBarLayout.X();
                }
                org.telegram.ui.Components.hv0 hv0Var = externalActionActivity.e;
                if (hv0Var != null) {
                    hv0Var.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.x) {
            this.x = false;
            this.j0 = true;
            ((LaunchActivity) getParentActivity()).L0(this.currentAccount, new j3.t(3, z10));
            this.j0 = false;
            finishFragment();
            return;
        }
        if (z10 && z11) {
            cg1 cg1Var = new cg1(6, null);
            cg1Var.C = i10;
            cg1Var.D = true;
            presentFragment(cg1Var, true);
        } else {
            Bundle i11 = a4.w.i("afterSignup", z10);
            ng0 ng0Var = new ng0();
            ng0Var.l0(i11);
            presentFragment(ng0Var, true);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        b31.V(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        pe0 pe0Var = (pe0) this.b[5];
        if (pe0Var != null) {
            pe0Var.H.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (!this.d0 || this.a != 12) {
            int i10 = this.a;
            org.telegram.ui.Components.mv0[] mv0VarArr = this.b;
            if (i10 == 0 || (this.B == 3 && i10 == 12)) {
                if (z10) {
                    for (org.telegram.ui.Components.mv0 mv0Var : mv0VarArr) {
                        if (mv0Var != null) {
                            mv0Var.f();
                        }
                    }
                    e1();
                }
                return true;
            }
            if (i10 == 6) {
                if (z10) {
                    mv0VarArr[i10].c(true);
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 7 || i10 == 8) {
                if (z10) {
                    mv0VarArr[i10].c(true);
                    u1(6, true, null, true);
                }
            } else if ((i10 >= 1 && i10 <= 4) || i10 == 11 || i10 == 15) {
                if (z10 && mv0VarArr[i10].c(false)) {
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 5) {
                if (z10) {
                    ((pe0) mv0VarArr[i10]).w.callOnClick();
                    return false;
                }
            } else if (i10 == 9) {
                if (z10) {
                    mv0VarArr[i10].c(true);
                    u1(7, true, null, true);
                    return false;
                }
            } else if (i10 == 10) {
                if (z10) {
                    mv0VarArr[i10].c(true);
                    u1(9, true, null, true);
                    return false;
                }
            } else if (i10 == 13) {
                if (z10) {
                    mv0VarArr[i10].c(true);
                    u1(12, true, null, true);
                    return false;
                }
            } else if (z10 && mv0VarArr[i10].c(true)) {
                u1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onConfigurationChanged(Configuration configuration) {
        t1(this.b[this.a].a(), false);
        tf0 tf0Var = this.X;
        if (tf0Var != null) {
            int i10 = tf0.A;
            tf0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 23) {
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
                    AndroidUtilities.runOnUIThread(new tc0(this, 1), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.mv0[] mv0VarArr = this.b;
            if (i10 >= mv0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[i10];
            if (mv0Var != null) {
                mv0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.N;
        if (c2Var != null) {
            c2Var.dismiss();
            this.N = null;
        }
        for (Runnable runnable : this.f0) {
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        if (this.x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z10 = iArr[0] == 0;
        org.telegram.ui.Components.mv0[] mv0VarArr = this.b;
        if (i10 == 6) {
            this.v = false;
            int i11 = this.a;
            if (i11 == 0) {
                org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[i11];
                ((eg0) mv0Var).H = true;
                mv0Var.h(null);
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.w = false;
            int i12 = this.a;
            if (i12 == 0) {
                ((eg0) mv0VarArr[i12]).q();
                return;
            }
            return;
        }
        if (i10 == 20) {
            if (z10) {
                ((pe0) mv0VarArr[5]).H.m();
            }
        } else if (i10 == 151 && z10) {
            pe0 pe0Var = (pe0) mv0VarArr[5];
            pe0Var.post(new dd0(pe0Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        org.telegram.ui.Components.mv0 mv0Var;
        int i10;
        org.telegram.ui.Components.mv0[] mv0VarArr = this.b;
        super.onResume();
        if (this.x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i11 = this.a;
            if (i11 >= 1 && i11 <= 4) {
                org.telegram.ui.Components.mv0 mv0Var2 = mv0VarArr[i11];
                if ((mv0Var2 instanceof if0) && (i10 = ((if0) mv0Var2).P) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    mv0VarArr[this.a].c(true);
                    u1(0, false, null, true);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        int i12 = this.a;
        if (i12 == 0 && !this.Y && (mv0Var = mv0VarArr[i12]) != null) {
            mv0Var.j();
        }
        if (h1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i13 = this.a;
        if (i13 < 0 || i13 >= mv0VarArr.length) {
            return;
        }
        mv0VarArr[i13].i();
    }

    public final void p1() {
        if (this.M[this.F]) {
            if (this.R.getTag() == null) {
                this.b[this.a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
            alertDialog$Builder.a.P = LocaleController.getString("StopLoading", R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new yc0(this, 0));
            showDialog(alertDialog$Builder.a);
        }
    }

    public final void q1(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        g1(bundle, auth_sentcode, true);
    }

    public final void s1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.k0) {
            k1(false, true);
            this.k0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new u80(4, this, bundle), 10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.y ? 1 : 0);
            for (int i10 = 0; i10 <= this.a; i10++) {
                org.telegram.ui.Components.mv0 mv0Var = this.b[i10];
                if (mv0Var != null) {
                    mv0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("logininfo2");
            sb2.append(this.x ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb2.toString(), 0).edit();
            edit.clear();
            r1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void t1(boolean z10, boolean z11) {
        if (this.W == z10 && z11) {
            return;
        }
        this.W = z10;
        int i10 = 0;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z10 = false;
        }
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (!z11) {
                this.c.setVisibility(0);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(org.telegram.ui.Components.jr.f);
            this.d.addUpdateListener(new sc0(this, i10));
            this.d.addListener(new ed0(this, i10));
            this.d.start();
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (!z11) {
            this.c.setVisibility(8);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(org.telegram.ui.Components.ct.e);
        int i11 = 1;
        this.d.addUpdateListener(new sc0(this, i11));
        this.d.addListener(new ed0(this, i11));
        this.d.start();
    }

    public final void u1(int i10, boolean z10, Bundle bundle, boolean z11) {
        int i11 = 10;
        boolean z12 = i10 == 0 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 10 || i10 == 12 || i10 == 17 || i10 == 16;
        if (i10 == this.a) {
            z10 = false;
        }
        if (z12) {
            if (i10 == 0) {
                this.v = true;
                this.w = true;
            }
            this.F = 1;
            v1(false, z10);
            w1(false, z10, false);
            this.F = 0;
            w1(false, z10, false);
            if (!z10) {
                v1(true, false);
            }
        } else {
            this.F = 0;
            v1(false, z10);
            w1(false, z10, false);
            if (i10 != 8) {
                this.F = 1;
            }
        }
        org.telegram.ui.Components.mv0[] mv0VarArr = this.b;
        if (!z10) {
            this.Q.setVisibility((mv0VarArr[i10].b() || this.x) ? 0 : 8);
            mv0VarArr[this.a].setVisibility(8);
            mv0VarArr[this.a].g();
            this.a = i10;
            mv0VarArr[i10].m(bundle, false);
            mv0VarArr[i10].setVisibility(0);
            setParentActivityTitle(mv0VarArr[i10].getHeaderName());
            mv0VarArr[i10].j();
            t1(mv0VarArr[i10].a(), false);
            return;
        }
        org.telegram.ui.Components.mv0 mv0Var = mv0VarArr[this.a];
        org.telegram.ui.Components.mv0 mv0Var2 = mv0VarArr[i10];
        this.a = i10;
        this.Q.setVisibility((mv0Var2.b() || this.x) ? 0 : 8);
        mv0Var2.m(bundle, false);
        setParentActivityTitle(mv0Var2.getHeaderName());
        mv0Var2.j();
        int i12 = AndroidUtilities.displaySize.x;
        if (z11) {
            i12 = -i12;
        }
        mv0Var2.setX(i12);
        mv0Var2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new androidx.fragment.app.g(this, z12, mv0Var, i11));
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(mv0Var, (Property<org.telegram.ui.Components.mv0, Float>) property, z11 ? AndroidUtilities.displaySize.x : -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(mv0Var2, (Property<org.telegram.ui.Components.mv0, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        t1(mv0Var2.a(), true);
    }

    public final void v1(boolean z10, boolean z11) {
        TimeInterpolator timeInterpolator;
        int i10 = this.F;
        boolean z12 = i10 == 0;
        boolean[] zArr = this.M;
        if (zArr[i10] == z10) {
            return;
        }
        AnimatorSet[] animatorSetArr = this.G;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            if (z11) {
                animatorSet.removeAllListeners();
            }
            animatorSetArr[this.F].cancel();
        }
        int i11 = this.F;
        zArr[i11] = z10;
        if (!z11) {
            if (z12) {
                this.J.e(z10, z11);
                return;
            }
            return;
        }
        animatorSetArr[i11] = new AnimatorSet();
        if (z12) {
            this.J.e(z10, z11);
        }
        animatorSetArr[this.F].addListener(new org.telegram.ui.ActionBar.h(this, z12, z10, 5));
        int i12 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        if (!z12) {
            timeInterpolator = null;
        } else if (z10) {
            timeInterpolator = AndroidUtilities.decelerateInterpolator;
            i12 = 200;
        } else {
            timeInterpolator = AndroidUtilities.accelerateInterpolator;
        }
        animatorSetArr[this.F].setDuration(i12);
        animatorSetArr[this.F].setInterpolator(timeInterpolator);
        animatorSetArr[this.F].start();
    }

    public final void w1(final boolean z10, final boolean z11, boolean z12) {
        boolean[] zArr = this.e0;
        if (z11 && zArr[this.F] == z10 && !z12) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oz(this, z10, z11, z12, 1));
            return;
        }
        final int i10 = this.F;
        int i11 = 1;
        boolean z13 = i10 == 0;
        boolean[] zArr2 = this.g0;
        if (z12 || z13) {
            zArr2[i10] = false;
            zArr[i10] = z10;
        } else {
            zArr[i10] = z10;
            if (z11) {
                boolean z14 = zArr2[i10];
                Runnable[] runnableArr = this.f0;
                if (z14) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i10]);
                    zArr2[this.F] = false;
                    return;
                } else if (z10) {
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.wc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            fg0 fg0Var = fg0.this;
                            int i12 = fg0Var.F;
                            fg0Var.F = i10;
                            fg0Var.w1(z10, z11, true);
                            fg0Var.F = i12;
                        }
                    };
                    runnableArr[i10] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.F] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z13) {
            this.J.f(z10, z11);
            return;
        }
        if (z11) {
            this.H = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            ofFloat.addListener(new p60(i11, this, z10));
            ofFloat.addUpdateListener(new sc0(this, 2));
            this.H.playTogether(ofFloat);
            this.H.setDuration(150L);
            this.H.start();
            return;
        }
        if (z10) {
            this.R.setVisibility(0);
            this.R.setScaleX(1.0f);
            this.R.setScaleY(1.0f);
            this.R.setAlpha(1.0f);
            return;
        }
        this.R.setTag(null);
        this.R.setVisibility(4);
        this.R.setScaleX(0.1f);
        this.R.setScaleY(0.1f);
        this.R.setAlpha(0.0f);
    }

    public final void x1(boolean z10, boolean z11) {
        if (z10 == this.n0) {
            return;
        }
        tc0 tc0Var = this.o0;
        if (tc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(tc0Var);
            this.o0 = null;
        }
        this.n0 = z10;
        this.S.clearAnimation();
        if (z11) {
            this.S.setVisibility(0);
            this.S.animate().alpha(z10 ? 1.0f : 0.0f).withEndAction(new org.telegram.ui.Components.p90(10, this, z10)).start();
        } else {
            this.S.setVisibility(z10 ? 0 : 8);
            this.S.setAlpha(z10 ? 1.0f : 0.0f);
        }
    }

    public final void y1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        ImageView imageView = this.Q;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        ImageView imageView2 = this.Q;
        int i11 = org.telegram.ui.ActionBar.g6.i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, -1));
        this.T.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.S.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, -1));
        RadialProgressView radialProgressView = this.R;
        int i12 = org.telegram.ui.ActionBar.g6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.J.g();
        this.I.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
        this.I.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        for (org.telegram.ui.Components.mv0 mv0Var : this.b) {
            mv0Var.n();
        }
        org.telegram.ui.Components.or orVar = this.c;
        orVar.a.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int i13 = 0;
        while (true) {
            View[] viewArr = orVar.c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                view.setBackground(org.telegram.ui.Components.or.a(i13));
                if (view instanceof org.telegram.ui.Components.nr) {
                    org.telegram.ui.Components.nr nrVar = (org.telegram.ui.Components.nr) view;
                    nrVar.a.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                    nrVar.b.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
                }
            }
            i13++;
        }
        tf0 tf0Var = this.X;
        if (tf0Var != null) {
            int i14 = tf0.A;
            tf0Var.b();
        }
    }

    public final void z1(boolean z10, boolean z11) {
        if (this.T == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.m0 != connectionState || z11) {
            this.m0 = connectionState;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            boolean z12 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i10 = this.m0;
            boolean z13 = i10 == 3 || i10 == 5;
            boolean z14 = i10 == 1 || i10 == 2 || i10 == 4;
            if (z12) {
                this.T.b(true, z13, z10);
                x1(true, z10);
                return;
            }
            if ((!getMessagesController().blockedCountry || SharedConfig.proxyList.isEmpty()) && !z14) {
                x1(false, z10);
                return;
            }
            this.T.b(true, z13, z10);
            if (this.n0) {
                return;
            }
            tc0 tc0Var = this.o0;
            if (tc0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(tc0Var);
            }
            this.n0 = true;
            tc0 tc0Var2 = new tc0(this, 0);
            this.o0 = tc0Var2;
            AndroidUtilities.runOnUIThread(tc0Var2, 5000L);
        }
    }

    public fg0(int i10) {
        super(null);
        this.b = new org.telegram.ui.Components.mv0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = true;
        this.w = true;
        this.y = true;
        this.A = false;
        this.B = 0;
        this.G = new AnimatorSet[2];
        this.M = new boolean[]{true, false};
        this.W = false;
        this.e0 = new boolean[2];
        this.f0 = new Runnable[2];
        this.g0 = new boolean[2];
        this.currentAccount = i10;
        this.x = true;
    }
}
