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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class og0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static final int q0;
    public boolean B;
    public int C;
    public String D;
    public Bundle E;
    public TLRPC.TL_auth_sentCode F;
    public int G;
    public final AnimatorSet[] H;
    public AnimatorSet I;
    public org.telegram.ui.Components.f31 J;
    public org.telegram.ui.Components.a20 K;
    public n7.qa L;
    public int M;
    public final boolean[] N;
    public org.telegram.ui.ActionBar.d2 O;
    public lh.j4 P;
    public dg0 Q;
    public ImageView R;
    public RadialProgressView S;
    public ImageView T;
    public org.telegram.ui.Components.oi0 U;
    public LinearLayout V;
    public l0 W;
    public boolean X;
    public cg0 Y;
    public boolean Z;
    public int a;
    public Runnable a0;
    public final org.telegram.ui.Components.wv0[] b;
    public ew b0;
    public org.telegram.ui.Components.ur c;
    public TextView c0;
    public ValueAnimator d;
    public boolean d0;
    public boolean e;
    public boolean e0;
    public boolean f;
    public final boolean[] f0;
    public final Runnable[] g0;
    public Dialog h;
    public final boolean[] h0;
    public boolean i0;
    public View j0;
    public boolean k0;
    public boolean l0;
    public TLRPC.TL_help_termsOfService m0;
    public Dialog n;
    public int n0;
    public boolean o0;
    public dd0 p0;
    public final ArrayList r;
    public final ArrayList s;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        q0 = SharedConfig.getDevicePerformanceClass() <= 1 ? ImageReceiver.DEFAULT_CROSSFADE_DURATION : 100;
    }

    public og0() {
        super(null);
        this.b = new org.telegram.ui.Components.wv0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = true;
        this.w = true;
        this.y = true;
        this.B = false;
        this.C = 0;
        this.H = new AnimatorSet[2];
        this.N = new boolean[]{true, false};
        this.X = false;
        this.f0 = new boolean[2];
        this.g0 = new Runnable[2];
        this.h0 = new boolean[2];
    }

    public static boolean T0(og0 og0Var, View view) {
        if (og0Var.h1()) {
            return true;
        }
        return AndroidUtilities.showKeyboard(view);
    }

    public static void U(og0 og0Var, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        og0Var.k1(false, true);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                og0Var.u1(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            og0Var.u1(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(og0Var.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        og0Var.u1(8, true, bundle2, false);
    }

    public static void U0(og0 og0Var, View view, boolean z4) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z4 && (view instanceof org.telegram.ui.Components.cd0)) {
            Runnable runnable = (Runnable) view.getTag(R.id.timeout_callback);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            org.telegram.ui.Components.cd0 cd0Var = (org.telegram.ui.Components.cd0) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = cd0Var.getAttachedEditText();
            dg.b0 b0Var = new dg.b0(9, attachedEditText, atomicReference);
            cd0Var.a(1.0f);
            b30 b30Var = new b30(cd0Var, view, attachedEditText, b0Var, 8);
            atomicReference.set(b30Var);
            view.postDelayed(b30Var, 2000L);
            view.setTag(R.id.timeout_callback, b30Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(b0Var);
            }
        }
    }

    public static void V(og0 og0Var, String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z4, a8.d dVar) {
        a8.f fVar = ((p7.d) ((com.google.android.gms.common.api.q) dVar.a)).b;
        String str2 = fVar == null ? null : fVar.a;
        if (str2 == null) {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            og0Var.s1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
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
            og0Var.s1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (optBoolean && optBoolean2) {
                    ConnectionsManager.getInstance(og0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new hd0(1, bundle, auth_sentcode, og0Var, z4), 10);
                    return;
                }
                if (!optBoolean && !optBoolean2) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    og0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                } else if (!optBoolean) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    og0Var.s1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                } else {
                    if (optBoolean2) {
                        return;
                    }
                    FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    og0Var.s1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                }
            } catch (JSONException e6) {
                e = e6;
                FileLog.e(e);
                FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                og0Var.s1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
            }
        } catch (JSONException e10) {
            e = e10;
        }
    }

    public static HashSet V0(og0 og0Var) {
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22) {
                SubscriptionManager from = SubscriptionManager.from(og0Var.getParentActivity());
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return hashSet;
    }

    public static void W(og0 og0Var, String str, String str2, String str3) {
        og0Var.n1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(og0Var.currentAccount).sendRequest(deleteaccount, new lh.b1(og0Var, str, str2, str3, 11), 10);
    }

    public static /* synthetic */ void X(og0 og0Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z4, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            og0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(og0Var.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new hd0(0, bundle, auth_sentcode, og0Var, z4), 10);
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
            StringBuilder l10 = e2.c.l(simpleName);
            l10.append(exc.getMessage());
            simpleName = l10.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle j1(int i10, boolean z4) {
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder("logininfo2");
            sb.append(z4 ? "_" + i10 : "");
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb.toString(), 0).getAll().entrySet()) {
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
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static void m1(org.telegram.ui.ActionBar.p2 p2Var, String str, l7.w0 w0Var, boolean z4) {
        List list;
        if (p2Var == null || p2Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        if (z4) {
            d2Var.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            d2Var.Q = LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber);
        } else if (w0Var == null || (list = (List) w0Var.c) == null || list.isEmpty() || ((tt) w0Var.b) == null) {
            d2Var.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
            d2Var.Q = LocaleController.getString(R.string.InvalidPhoneNumber);
        } else {
            Iterator it = ((List) w0Var.c).iterator();
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i10) {
                    i10 = length;
                }
            }
            if (se.b.d(str, false).length() - ((tt) w0Var.b).c.length() < i10) {
                d2Var.O = LocaleController.getString(R.string.WrongNumberFormat);
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, ((tt) w0Var.b).a, (String) w0Var.d));
            } else {
                d2Var.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                d2Var.Q = LocaleController.getString(R.string.InvalidPhoneNumber);
            }
        }
        alertDialog$Builder.i(LocaleController.getString("BotHelp", R.string.BotHelp), new com.google.firebase.messaging.i(str, p2Var, z4));
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        p2Var.showDialog(d2Var);
    }

    public static void n0(og0 og0Var, String str, String str2, String str3) {
        if (og0Var.S.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
        alertDialog$Builder.a.Q = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
        alertDialog$Builder.a.O = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
        alertDialog$Builder.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new a1.d(og0Var, str, str2, str3, 14));
        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
        og0Var.showDialog(alertDialog$Builder.a);
    }

    public static void r1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(android.support.v4.media.a.z(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(android.support.v4.media.a.z(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(android.support.v4.media.a.z(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                r1((Bundle) obj, editor, str2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            if (this.k0) {
                this.j0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && !this.k0) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e10) {
                    FileLog.e(e10);
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
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        boolean z4;
        int i10;
        View view = this.j0;
        if (view != null) {
            this.fragmentView = view;
            this.j0 = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 22));
        this.G = 0;
        boolean[] zArr = this.N;
        zArr[0] = true;
        zArr[1] = false;
        lh.j4 j4Var = new lh.j4(this, context, 6);
        this.P = j4Var;
        j4Var.setDelegate(new kd0(0, this));
        this.fragmentView = this.P;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context, 4);
        x1Var.setFillViewport(true);
        this.P.addView(x1Var, k7.c6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        x1Var.addView(this.V, k7.c6.x(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
        this.V.addView(space);
        l0 l0Var = new l0(this, context, 12);
        this.W = l0Var;
        this.V.addView(l0Var, k7.c6.l(1.0f, -1, 0));
        org.telegram.ui.Components.ur urVar = new org.telegram.ui.Components.ur(context);
        this.c = urVar;
        urVar.setViewToFindFocus(this.W);
        this.V.addView(this.c, k7.c6.n(-1, 230));
        ng0 ng0Var = new ng0(this, context);
        org.telegram.ui.Components.wv0[] wv0VarArr = this.b;
        wv0VarArr[0] = ng0Var;
        wv0VarArr[1] = new sf0(this, context, 1);
        wv0VarArr[2] = new sf0(this, context, 2);
        wv0VarArr[3] = new sf0(this, context, 3);
        wv0VarArr[4] = new sf0(this, context, 4);
        wv0VarArr[5] = new af0(this, context);
        wv0VarArr[6] = new ie0(this, context);
        wv0VarArr[7] = new te0(this, context);
        int i11 = 8;
        wv0VarArr[8] = new bf0(this, context);
        wv0VarArr[9] = new ee0(this, context, 0);
        wv0VarArr[10] = new ee0(this, context, 1);
        wv0VarArr[11] = new sf0(this, context, 11);
        wv0VarArr[12] = new ef0(this, context);
        wv0VarArr[13] = new zd0(this, context, true);
        wv0VarArr[14] = new zd0(this, context, false);
        wv0VarArr[15] = new sf0(this, context, 15);
        wv0VarArr[16] = new qe0(this, context, 16);
        wv0VarArr[17] = new qe0(this, context, 17);
        int i12 = 18;
        wv0VarArr[18] = new xf0(this, context);
        int i13 = 0;
        while (i13 < wv0VarArr.length) {
            org.telegram.ui.Components.wv0 wv0Var = wv0VarArr[i13];
            if (i13 == 0) {
                i11 = 0;
            }
            wv0Var.setVisibility(i11);
            this.W.addView(wv0VarArr[i13], k7.c6.d(-1, -1.0f, 17, AndroidUtilities.isTablet() ? 26.0f : 18.0f, i13 != i12 ? 30.0f : 0.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
            i13++;
            i12 = 18;
            i11 = 8;
        }
        Bundle j12 = this.C == 0 ? j1(this.currentAccount, this.x) : null;
        if (j12 != null && ((i10 = j12.getInt("currentViewNum", 0)) < 0 || i10 >= wv0VarArr.length)) {
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
                if (((ie0) wv0VarArr[6]).n == null) {
                    this.a = 0;
                    e1();
                    j12 = null;
                }
            } else if (i14 == 7 && ((te0) wv0VarArr[7]).h == null) {
                this.a = 0;
                e1();
                j12 = null;
            }
        }
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.K = a20Var;
        a20Var.e(zArr[0], false);
        this.L = new n7.qa(this.K);
        this.P.addView(this.K, k7.c6.d(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        final int i16 = 0;
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ld0
            public final /* synthetic */ og0 b;

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
                        og0 og0Var = this.b;
                        if (og0Var.onBackPressed(true)) {
                            og0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        og0 og0Var2 = this.b;
                        ew ewVar = og0Var2.b0;
                        if (ewVar != null) {
                            ewVar.run();
                        }
                        og0Var2.finishFragment();
                        break;
                    default:
                        og0 og0Var3 = this.b;
                        og0Var3.getClass();
                        og0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        ((o1.j) this.L.c).b(new md0(this, i16));
        ImageView imageView = new ImageView(context);
        this.R = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        final int i17 = 1;
        this.R.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ld0
            public final /* synthetic */ og0 b;

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
                        og0 og0Var = this.b;
                        if (og0Var.onBackPressed(true)) {
                            og0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        og0 og0Var2 = this.b;
                        ew ewVar = og0Var2.b0;
                        if (ewVar != null) {
                            ewVar.run();
                        }
                        og0Var2.finishFragment();
                        break;
                    default:
                        og0 og0Var3 = this.b;
                        og0Var3.getClass();
                        og0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.R.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        int dp = AndroidUtilities.dp(4.0f);
        this.R.setPadding(dp, dp, dp, dp);
        this.P.addView(this.R, k7.c6.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.b0 != null && !this.d0 && this.e0) {
            TextView textView = new TextView(context);
            this.c0 = textView;
            textView.setGravity(19);
            this.c0.setTextSize(1, 15.0f);
            this.c0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.c0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.c0.setText(LocaleController.getString(R.string.YourEmailSkip));
            this.c0.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false));
            this.P.addView(this.c0, k7.c6.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            final int i18 = 2;
            this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ld0
                public final /* synthetic */ og0 b;

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
                            og0 og0Var = this.b;
                            if (og0Var.onBackPressed(true)) {
                                og0Var.finishFragment();
                                break;
                            }
                            break;
                        case 2:
                            og0 og0Var2 = this.b;
                            ew ewVar = og0Var2.b0;
                            if (ewVar != null) {
                                ewVar.run();
                            }
                            og0Var2.finishFragment();
                            break;
                        default:
                            og0 og0Var3 = this.b;
                            og0Var3.getClass();
                            og0Var3.presentFragment(new ProxyListActivity());
                            break;
                    }
                }
            });
        }
        ImageView imageView2 = new ImageView(context);
        this.T = imageView2;
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(context);
        this.U = oi0Var;
        imageView2.setImageDrawable(oi0Var);
        final int i19 = 3;
        this.T.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ld0
            public final /* synthetic */ og0 b;

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
                        og0 og0Var = this.b;
                        if (og0Var.onBackPressed(true)) {
                            og0Var.finishFragment();
                            break;
                        }
                        break;
                    case 2:
                        og0 og0Var2 = this.b;
                        ew ewVar = og0Var2.b0;
                        if (ewVar != null) {
                            ewVar.run();
                        }
                        og0Var2.finishFragment();
                        break;
                    default:
                        og0 og0Var3 = this.b;
                        og0Var3.getClass();
                        og0Var3.presentFragment(new ProxyListActivity());
                        break;
                }
            }
        });
        this.T.setAlpha(0.0f);
        this.T.setVisibility(8);
        this.P.addView(this.T, k7.c6.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        z1(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.S = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.S.setAlpha(0.0f);
        this.S.setScaleX(0.1f);
        this.S.setScaleY(0.1f);
        this.P.addView(this.S, k7.c6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        org.telegram.ui.Components.f31 f31Var = new org.telegram.ui.Components.f31(context);
        this.J = f31Var;
        f31Var.setTransformType(0);
        this.J.setProgress(1.0f);
        this.J.setDrawBackground(false);
        this.K.setContentDescription(LocaleController.getString(R.string.Done));
        this.K.addView(this.J, k7.c6.e(56, 56, 17));
        this.K.a(this.J);
        if (j12 != null) {
            this.f = true;
        }
        int i20 = 0;
        while (i20 < wv0VarArr.length) {
            org.telegram.ui.Components.wv0 wv0Var2 = wv0VarArr[i20];
            if (j12 != null) {
                if (i20 < 1 || i20 > 4) {
                    wv0Var2.k(j12);
                } else if (i20 == this.a) {
                    wv0Var2.k(j12);
                }
            }
            if (this.a == i20) {
                this.R.setVisibility((wv0Var2.b() || this.x || this.C == 2) ? 0 : 8);
                wv0Var2.setVisibility(0);
                wv0Var2.j();
                t1(wv0Var2.a(), false);
                this.G = 0;
                if (i20 != 0 && i20 != 5 && i20 != 6) {
                    if (i20 != 9) {
                        if (i20 != 10 && i20 != 12) {
                            z4 = false;
                            v1(z4, false);
                            if (i20 == 1 && i20 != 2) {
                                if (i20 != 3) {
                                }
                            }
                            this.G = 1;
                        }
                        z4 = true;
                        v1(z4, false);
                        if (i20 == 1) {
                        }
                        this.G = 1;
                    }
                }
                z4 = true;
                v1(z4, false);
                if (i20 == 1) {
                }
                this.G = 1;
            } else if (wv0Var2.getVisibility() != 8) {
                wv0Var2.setVisibility(8);
                wv0Var2.g();
            }
            i20++;
        }
        this.f = false;
        y1();
        if (i1()) {
            g1(this.E, this.F, false);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            z1(true, false);
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && this.e0 && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public final void e1() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb = new StringBuilder("logininfo2");
        if (this.x) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb.append(str);
        SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
        edit.clear();
        edit.commit();
    }

    public final void g1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z4) {
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
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.l0) {
            if (!PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
                s1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
                return;
            }
            TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
            n1(0, true);
            this.l0 = true;
            String string = bundle.getString("phoneFormated");
            if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                FileLog.d("getting classic integrity with nonce = ".concat(str));
                Task<IntegrityTokenResponse> addOnSuccessListener = create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new ed0(this, bundle, auth_sentcode, string, z4));
                final int i10 = 0;
                addOnSuccessListener.addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.fd0
                    public final /* synthetic */ og0 b;

                    {
                        this.b = this;
                    }

                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        switch (i10) {
                            case 0:
                                String str2 = "PLAYINTEGRITY_EXCEPTION_" + og0.f1(exc);
                                FileLog.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                this.b.s1(bundle, auth_sentcode, str2);
                                break;
                            default:
                                FileLog.e(exc);
                                String str3 = "SAFETYNET_EXCEPTION_" + og0.f1(exc);
                                FileLog.d("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                this.b.s1(bundle, auth_sentcode, str3);
                                break;
                        }
                    }
                });
                return;
            }
            a8.e eVar = new a8.e(ApplicationLoader.applicationContext, a8.c.a, null, new com.google.android.gms.common.api.internal.a());
            byte[] bArr = auth_sentcode.type.nonce;
            String str2 = BuildVars.SAFETYNET_KEY;
            com.google.android.gms.common.api.internal.t0 t0Var = eVar.h;
            m8.i0 i0Var = new m8.i0(t0Var, bArr, str2);
            t0Var.b.d(0, i0Var);
            Task addOnSuccessListener2 = b6.m.n(i0Var, new b6.n(new a8.d())).addOnSuccessListener(new ed0(this, string, auth_sentcode, bundle, z4));
            final int i11 = 1;
            addOnSuccessListener2.addOnFailureListener(new OnFailureListener(this) { // from class: org.telegram.ui.fd0
                public final /* synthetic */ og0 b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    switch (i11) {
                        case 0:
                            String str22 = "PLAYINTEGRITY_EXCEPTION_" + og0.f1(exc);
                            FileLog.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                            this.b.s1(bundle, auth_sentcode, str22);
                            break;
                        default:
                            FileLog.e(exc);
                            String str3 = "SAFETYNET_EXCEPTION_" + og0.f1(exc);
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
            u1(1, z4, bundle, false);
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
            u1(4, z4, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            u1(3, z4, bundle, false);
            return;
        }
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            u1(2, z4, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 15);
            bundle.putString("url", auth_sentcode.type.url);
            bundle.putInt("length", auth_sentcode.type.length);
            u1(15, z4, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 11);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putString("prefix", auth_sentcode.type.prefix);
            u1(11, z4, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            u1(12, z4, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
            bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
            bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
            bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
            bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
            u1(14, z4, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            u1(16, z4, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str4 = auth_sentcodetype2.beginning;
            if (str4 != null) {
                bundle.putString("beginning", str4);
            }
            u1(17, z4, bundle, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 22), org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.D6, org.telegram.ui.ActionBar.k6.H6, org.telegram.ui.ActionBar.k6.i6, org.telegram.ui.ActionBar.k6.P9, org.telegram.ui.ActionBar.k6.O9, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.I6, org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.y6, org.telegram.ui.ActionBar.k6.i7, org.telegram.ui.ActionBar.k6.q6, org.telegram.ui.ActionBar.k6.Wh, org.telegram.ui.ActionBar.k6.Q9, org.telegram.ui.ActionBar.k6.p7, org.telegram.ui.ActionBar.k6.J6, org.telegram.ui.ActionBar.k6.Y6, org.telegram.ui.ActionBar.k6.W6, org.telegram.ui.ActionBar.k6.X6, org.telegram.ui.ActionBar.k6.h5, org.telegram.ui.ActionBar.k6.q5, org.telegram.ui.ActionBar.k6.j5);
    }

    public final boolean h1() {
        return this.b[this.a].a() && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final boolean i1() {
        return this.C == 1;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.e0;
    }

    public final void k1(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (this.M != 0) {
            if (z4) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.M, true);
            }
            this.M = 0;
        }
        if (i1() && (d2Var = this.O) != null) {
            d2Var.dismiss();
            this.O = null;
        }
        w1(false, z10, false);
    }

    public final void l1(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = str;
        d2Var.Q = str2;
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void n1(int i10, boolean z4) {
        if (!i1() || i10 != 0) {
            this.M = i10;
            w1(true, z4, false);
        } else {
            if (this.O != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.O = d2Var;
            d2Var.d0 = false;
            d2Var.show();
        }
    }

    public final void o1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z4) {
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
        if (z4) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, true);
        boolean z10 = tL_auth_authorization.setup_password_required;
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
                org.telegram.ui.Components.qv0 qv0Var = externalActionActivity.e;
                if (qv0Var != null) {
                    qv0Var.setVisibility(0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.x) {
            this.x = false;
            this.k0 = true;
            ((LaunchActivity) getParentActivity()).L0(this.currentAccount, new j3.x(3, z4));
            this.k0 = false;
            finishFragment();
            return;
        }
        if (z4 && z10) {
            qg1 qg1Var = new qg1(6, null);
            qg1Var.D = i10;
            qg1Var.E = true;
            presentFragment(qg1Var, true);
        } else {
            Bundle i11 = android.support.v4.media.a.i("afterSignup", z4);
            wg0 wg0Var = new wg0();
            wg0Var.l0(i11);
            presentFragment(wg0Var, true);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        p31.V(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        af0 af0Var = (af0) this.b[5];
        if (af0Var != null) {
            af0Var.I.i(i10, i11, intent);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!this.e0 || this.a != 12) {
            int i10 = this.a;
            org.telegram.ui.Components.wv0[] wv0VarArr = this.b;
            if (i10 == 0 || (this.C == 3 && i10 == 12)) {
                if (z4) {
                    for (org.telegram.ui.Components.wv0 wv0Var : wv0VarArr) {
                        if (wv0Var != null) {
                            wv0Var.f();
                        }
                    }
                    e1();
                }
                return true;
            }
            if (i10 == 6) {
                if (z4) {
                    wv0VarArr[i10].c(true);
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 7 || i10 == 8) {
                if (z4) {
                    wv0VarArr[i10].c(true);
                    u1(6, true, null, true);
                }
            } else if ((i10 >= 1 && i10 <= 4) || i10 == 11 || i10 == 15) {
                if (z4 && wv0VarArr[i10].c(false)) {
                    u1(0, true, null, true);
                    return false;
                }
            } else if (i10 == 5) {
                if (z4) {
                    ((af0) wv0VarArr[i10]).w.callOnClick();
                    return false;
                }
            } else if (i10 == 9) {
                if (z4) {
                    wv0VarArr[i10].c(true);
                    u1(7, true, null, true);
                    return false;
                }
            } else if (i10 == 10) {
                if (z4) {
                    wv0VarArr[i10].c(true);
                    u1(9, true, null, true);
                    return false;
                }
            } else if (i10 == 13) {
                if (z4) {
                    wv0VarArr[i10].c(true);
                    u1(12, true, null, true);
                    return false;
                }
            } else if (z4 && wv0VarArr[i10].c(true)) {
                u1(0, true, null, true);
                return false;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        t1(this.b[this.a].a(), false);
        cg0 cg0Var = this.Y;
        if (cg0Var != null) {
            int i10 = cg0.B;
            cg0Var.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final AnimatorSet onCustomTransitionAnimation(boolean z4, Runnable runnable) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
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
                    AndroidUtilities.runOnUIThread(new dd0(this, 1), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.wv0[] wv0VarArr = this.b;
            if (i10 >= wv0VarArr.length) {
                break;
            }
            org.telegram.ui.Components.wv0 wv0Var = wv0VarArr[i10];
            if (wv0Var != null) {
                wv0Var.f();
            }
            i10++;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.O;
        if (d2Var != null) {
            d2Var.dismiss();
            this.O = null;
        }
        for (Runnable runnable : this.g0) {
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        if (this.x) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z4 = iArr[0] == 0;
        org.telegram.ui.Components.wv0[] wv0VarArr = this.b;
        if (i10 == 6) {
            this.v = false;
            int i11 = this.a;
            if (i11 == 0) {
                org.telegram.ui.Components.wv0 wv0Var = wv0VarArr[i11];
                ((ng0) wv0Var).I = true;
                wv0Var.h(null);
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.w = false;
            int i12 = this.a;
            if (i12 == 0) {
                ((ng0) wv0VarArr[i12]).q();
                return;
            }
            return;
        }
        if (i10 == 20) {
            if (z4) {
                ((af0) wv0VarArr[5]).I.m();
            }
        } else if (i10 == 151 && z4) {
            af0 af0Var = (af0) wv0VarArr[5];
            af0Var.post(new nd0(af0Var, 0));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        org.telegram.ui.Components.wv0 wv0Var;
        int i10;
        org.telegram.ui.Components.wv0[] wv0VarArr = this.b;
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
                org.telegram.ui.Components.wv0 wv0Var2 = wv0VarArr[i11];
                if ((wv0Var2 instanceof sf0) && (i10 = ((sf0) wv0Var2).Q) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                    wv0VarArr[this.a].c(true);
                    u1(0, false, null, true);
                }
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        int i12 = this.a;
        if (i12 == 0 && !this.Z && (wv0Var = wv0VarArr[i12]) != null) {
            wv0Var.j();
        }
        if (h1()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i13 = this.a;
        if (i13 < 0 || i13 >= wv0VarArr.length) {
            return;
        }
        wv0VarArr[i13].i();
    }

    public final void p1() {
        if (this.N[this.G]) {
            if (this.S.getTag() == null) {
                this.b[this.a].h(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle);
            alertDialog$Builder.a.Q = LocaleController.getString("StopLoading", R.string.StopLoading);
            alertDialog$Builder.k(LocaleController.getString("WaitMore", R.string.WaitMore), null);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new id0(this, 0));
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
        if (this.l0) {
            k1(false, true);
            this.l0 = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new tb0(1, this, bundle), 10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.y ? 1 : 0);
            for (int i10 = 0; i10 <= this.a; i10++) {
                org.telegram.ui.Components.wv0 wv0Var = this.b[i10];
                if (wv0Var != null) {
                    wv0Var.l(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            sb.append(this.x ? "_" + this.currentAccount : "");
            SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
            edit.clear();
            r1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void t1(boolean z4, boolean z10) {
        if (this.X == z4 && z10) {
            return;
        }
        this.X = z4;
        int i10 = 0;
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            z4 = false;
        }
        if (z4) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (!z10) {
                this.c.setVisibility(0);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.d = duration;
            duration.setInterpolator(org.telegram.ui.Components.pr.f);
            this.d.addUpdateListener(new cd0(this, i10));
            this.d.addListener(new od0(this, i10));
            this.d.start();
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (!z10) {
            this.c.setVisibility(8);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
        this.d = duration2;
        duration2.setInterpolator(org.telegram.ui.Components.jt.e);
        int i11 = 1;
        this.d.addUpdateListener(new cd0(this, i11));
        this.d.addListener(new od0(this, i11));
        this.d.start();
    }

    public final void u1(int i10, boolean z4, Bundle bundle, boolean z10) {
        int i11 = 9;
        boolean z11 = i10 == 0 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 10 || i10 == 12 || i10 == 17 || i10 == 16;
        if (i10 == this.a) {
            z4 = false;
        }
        if (z11) {
            if (i10 == 0) {
                this.v = true;
                this.w = true;
            }
            this.G = 1;
            v1(false, z4);
            w1(false, z4, false);
            this.G = 0;
            w1(false, z4, false);
            if (!z4) {
                v1(true, false);
            }
        } else {
            this.G = 0;
            v1(false, z4);
            w1(false, z4, false);
            if (i10 != 8) {
                this.G = 1;
            }
        }
        org.telegram.ui.Components.wv0[] wv0VarArr = this.b;
        if (!z4) {
            this.R.setVisibility((wv0VarArr[i10].b() || this.x) ? 0 : 8);
            wv0VarArr[this.a].setVisibility(8);
            wv0VarArr[this.a].g();
            this.a = i10;
            wv0VarArr[i10].m(bundle, false);
            wv0VarArr[i10].setVisibility(0);
            setParentActivityTitle(wv0VarArr[i10].getHeaderName());
            wv0VarArr[i10].j();
            t1(wv0VarArr[i10].a(), false);
            return;
        }
        org.telegram.ui.Components.wv0 wv0Var = wv0VarArr[this.a];
        org.telegram.ui.Components.wv0 wv0Var2 = wv0VarArr[i10];
        this.a = i10;
        this.R.setVisibility((wv0Var2.b() || this.x) ? 0 : 8);
        wv0Var2.m(bundle, false);
        setParentActivityTitle(wv0Var2.getHeaderName());
        wv0Var2.j();
        int i12 = AndroidUtilities.displaySize.x;
        if (z10) {
            i12 = -i12;
        }
        wv0Var2.setX(i12);
        wv0Var2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new androidx.fragment.app.g(this, z11, wv0Var, i11));
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(wv0Var, (Property<org.telegram.ui.Components.wv0, Float>) property, z10 ? AndroidUtilities.displaySize.x : -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(wv0Var2, (Property<org.telegram.ui.Components.wv0, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        t1(wv0Var2.a(), true);
    }

    public final void v1(boolean z4, boolean z10) {
        TimeInterpolator timeInterpolator;
        int i10 = this.G;
        boolean z11 = i10 == 0;
        boolean[] zArr = this.N;
        if (zArr[i10] == z4) {
            return;
        }
        AnimatorSet[] animatorSetArr = this.H;
        AnimatorSet animatorSet = animatorSetArr[i10];
        if (animatorSet != null) {
            if (z10) {
                animatorSet.removeAllListeners();
            }
            animatorSetArr[this.G].cancel();
        }
        int i11 = this.G;
        zArr[i11] = z4;
        if (!z10) {
            if (z11) {
                this.K.e(z4, z10);
                return;
            }
            return;
        }
        animatorSetArr[i11] = new AnimatorSet();
        if (z11) {
            this.K.e(z4, z10);
        }
        animatorSetArr[this.G].addListener(new org.telegram.ui.ActionBar.g(this, z11, z4, 5));
        int i12 = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        if (!z11) {
            timeInterpolator = null;
        } else if (z4) {
            timeInterpolator = AndroidUtilities.decelerateInterpolator;
            i12 = 200;
        } else {
            timeInterpolator = AndroidUtilities.accelerateInterpolator;
        }
        animatorSetArr[this.G].setDuration(i12);
        animatorSetArr[this.G].setInterpolator(timeInterpolator);
        animatorSetArr[this.G].start();
    }

    public final void w1(final boolean z4, final boolean z10, boolean z11) {
        boolean[] zArr = this.f0;
        if (z10 && zArr[this.G] == z4 && !z11) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vz(this, z4, z10, z11, 1));
            return;
        }
        final int i10 = this.G;
        boolean z12 = i10 == 0;
        boolean[] zArr2 = this.h0;
        if (z11 || z12) {
            zArr2[i10] = false;
            zArr[i10] = z4;
        } else {
            zArr[i10] = z4;
            if (z10) {
                boolean z13 = zArr2[i10];
                Runnable[] runnableArr = this.g0;
                if (z13) {
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[i10]);
                    zArr2[this.G] = false;
                    return;
                } else if (z4) {
                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.gd0
                        @Override // java.lang.Runnable
                        public final void run() {
                            og0 og0Var = og0.this;
                            int i11 = og0Var.G;
                            og0Var.G = i10;
                            og0Var.w1(z4, z10, true);
                            og0Var.G = i11;
                        }
                    };
                    runnableArr[i10] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    zArr2[this.G] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z12) {
            this.K.f(z4, z10);
            return;
        }
        if (z10) {
            this.I = new AnimatorSet();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f);
            ofFloat.addListener(new org.telegram.ui.Components.x20(21, this, z4));
            ofFloat.addUpdateListener(new cd0(this, 2));
            this.I.playTogether(ofFloat);
            this.I.setDuration(150L);
            this.I.start();
            return;
        }
        if (z4) {
            this.S.setVisibility(0);
            this.S.setScaleX(1.0f);
            this.S.setScaleY(1.0f);
            this.S.setAlpha(1.0f);
            return;
        }
        this.S.setTag(null);
        this.S.setVisibility(4);
        this.S.setScaleX(0.1f);
        this.S.setScaleY(0.1f);
        this.S.setAlpha(0.0f);
    }

    public final void x1(boolean z4, boolean z10) {
        if (z4 == this.o0) {
            return;
        }
        dd0 dd0Var = this.p0;
        if (dd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(dd0Var);
            this.p0 = null;
        }
        this.o0 = z4;
        this.T.clearAnimation();
        if (z10) {
            this.T.setVisibility(0);
            this.T.animate().alpha(z4 ? 1.0f : 0.0f).withEndAction(new org.telegram.ui.Components.rv0(4, this, z4)).start();
        } else {
            this.T.setVisibility(z4 ? 0 : 8);
            this.T.setAlpha(z4 ? 1.0f : 0.0f);
        }
    }

    public final void y1() {
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        ImageView imageView = this.R;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        imageView.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        ImageView imageView2 = this.R;
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i11, false), 1, -1));
        this.U.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.T.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, i11, false), 1, -1));
        RadialProgressView radialProgressView = this.S;
        int i12 = org.telegram.ui.ActionBar.k6.P9;
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.K.g();
        this.J.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.J.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        for (org.telegram.ui.Components.wv0 wv0Var : this.b) {
            wv0Var.n();
        }
        org.telegram.ui.Components.ur urVar = this.c;
        urVar.a.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i13 = 0;
        while (true) {
            View[] viewArr = urVar.c;
            if (i13 >= viewArr.length) {
                break;
            }
            View view = viewArr[i13];
            if (view != null) {
                view.setBackground(org.telegram.ui.Components.ur.a(i13));
                if (view instanceof org.telegram.ui.Components.tr) {
                    org.telegram.ui.Components.tr trVar = (org.telegram.ui.Components.tr) view;
                    trVar.a.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                    trVar.b.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
                }
            }
            i13++;
        }
        cg0 cg0Var = this.Y;
        if (cg0Var != null) {
            int i14 = cg0.B;
            cg0Var.b();
        }
    }

    public final void z1(boolean z4, boolean z10) {
        if (this.U == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.n0 != connectionState || z10) {
            this.n0 = connectionState;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            boolean z11 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i10 = this.n0;
            boolean z12 = i10 == 3 || i10 == 5;
            boolean z13 = i10 == 1 || i10 == 2 || i10 == 4;
            if (z11) {
                this.U.b(true, z12, z4);
                x1(true, z4);
                return;
            }
            if ((!getMessagesController().blockedCountry || SharedConfig.proxyList.isEmpty()) && !z13) {
                x1(false, z4);
                return;
            }
            this.U.b(true, z12, z4);
            if (this.o0) {
                return;
            }
            dd0 dd0Var = this.p0;
            if (dd0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(dd0Var);
            }
            this.o0 = true;
            dd0 dd0Var2 = new dd0(this, 0);
            this.p0 = dd0Var2;
            AndroidUtilities.runOnUIThread(dd0Var2, 5000L);
        }
    }

    public og0(int i10) {
        super(null);
        this.b = new org.telegram.ui.Components.wv0[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = true;
        this.w = true;
        this.y = true;
        this.B = false;
        this.C = 0;
        this.H = new AnimatorSet[2];
        this.N = new boolean[]{true, false};
        this.X = false;
        this.f0 = new boolean[2];
        this.g0 = new Runnable[2];
        this.h0 = new boolean[2];
        this.currentAccount = i10;
        this.x = true;
    }
}
