package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fn0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public TextView A0;
    public final em0 A1;
    public final TLRPC.TL_secureRequiredType B;
    public TextView B0;
    public String B1;
    public TLRPC.TL_secureRequiredType C;
    public org.telegram.ui.Components.oz C0;
    public Runnable C1;
    public ArrayList D;
    public org.telegram.ui.Cells.a9 D0;
    public tm0 D1;
    public final TLRPC.TL_secureValue E;
    public org.telegram.ui.Cells.a9 E0;
    public vm0 E1;
    public final TLRPC.TL_secureValue F;
    public ImageView F0;
    public int F1;
    public TL_account.Password G;
    public TextView G0;
    public final org.telegram.ui.Components.wv0[] G1;
    public TLRPC.TL_auth_sentCode H;
    public TextView H0;
    public org.telegram.ui.ActionBar.d2 H1;
    public org.telegram.ui.ActionBar.w0 I;
    public FrameLayout I0;
    public Dialog I1;
    public AnimatorSet J;
    public TextView J0;
    public final ArrayList J1;
    public org.telegram.ui.Components.tq K;
    public int K0;
    public TextView L;
    public final byte[] L0;
    public org.telegram.ui.Components.tq M;
    public final byte[] M0;
    public FrameLayout N;
    public String N0;
    public org.telegram.ui.Cells.aa O;
    public org.telegram.ui.Components.mi O0;
    public View P;
    public int P0;
    public View Q;
    public int Q0;
    public org.telegram.ui.Cells.z8 R;
    public final ArrayList R0;
    public org.telegram.ui.Cells.z8 S;
    public final HashMap S0;
    public org.telegram.ui.Cells.z8 T;
    public final HashMap T0;
    public org.telegram.ui.Cells.aa U;
    public final HashMap U0;
    public EditTextBoldCursor[] V;
    public HashMap V0;
    public ViewGroup[] W;
    public boolean W0;
    public EditTextBoldCursor[] X;
    public boolean X0;
    public ScrollView Y;
    public long Y0;
    public LinearLayout Z;
    public byte[] Z0;
    public String a;
    public LinearLayout a0;
    public String a1;
    public final int b;
    public LinearLayout b0;
    public byte[] b1;
    public long c;
    public LinearLayout c0;
    public boolean c1;
    public final String d;
    public LinearLayout d0;
    public boolean d1;
    public final String e;
    public LinearLayout e0;
    public fn0 e1;
    public boolean f;
    public LinearLayout f0;
    public final ArrayList f1;
    public org.telegram.ui.Cells.m4 g0;
    public SecureDocument g1;
    public final String h;
    public final ArrayList h0;
    public final ArrayList h1;
    public org.telegram.ui.Cells.z6 i0;
    public SecureDocument i1;
    public org.telegram.ui.Cells.z6 j0;
    public SecureDocument j1;
    public org.telegram.ui.Cells.a9 k0;
    public final HashMap k1;
    public org.telegram.ui.Cells.a9 l0;
    public final HashMap l1;
    public org.telegram.ui.Cells.a9 m0;
    public final HashMap m1;
    public final String n;
    public org.telegram.ui.Cells.a9 n0;
    public final HashMap n1;
    public org.telegram.ui.Cells.aa o0;
    public final HashMap o1;
    public int p0;
    public final HashMap p1;
    public final boolean[] q0;
    public final HashMap q1;
    public final String r;
    public boolean r0;
    public final HashMap r1;
    public String s;
    public boolean s0;
    public final HashMap s1;
    public TextView t0;
    public HashMap t1;
    public org.telegram.ui.Cells.aa u0;
    public HashMap u1;
    public String v;
    public org.telegram.ui.Cells.aa v0;
    public final HashMap v1;
    public String w;
    public org.telegram.ui.Cells.z6 w0;
    public String w1;
    public final int[] x;
    public LinearLayout x0;
    public String x1;
    public TL_account.authorizationForm y;
    public ImageView y0;
    public vm0 y1;
    public TextView z0;
    public boolean z1;

    public fn0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.s = "";
        this.v = "";
        this.x = new int[3];
        this.h0 = new ArrayList();
        this.q0 = new boolean[3];
        this.r0 = true;
        this.R0 = new ArrayList();
        this.S0 = new HashMap();
        this.T0 = new HashMap();
        this.U0 = new HashMap();
        this.f1 = new ArrayList();
        this.h1 = new ArrayList();
        this.k1 = new HashMap();
        this.l1 = new HashMap();
        this.m1 = new HashMap();
        this.n1 = new HashMap();
        this.o1 = new HashMap();
        this.r1 = new HashMap();
        this.s1 = new HashMap();
        this.v1 = new HashMap();
        this.A1 = new em0(this);
        this.b = i10;
        this.y = authorizationform;
        this.B = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.r0 = tL_secureRequiredType.native_names;
        }
        this.E = tL_secureValue;
        this.C = tL_secureRequiredType2;
        this.F = tL_secureValue2;
        this.G = password;
        this.p1 = hashMap;
        this.q1 = hashMap2;
        if (i10 == 3) {
            this.J1 = new ArrayList();
        } else if (i10 == 7) {
            this.G1 = new org.telegram.ui.Components.wv0[3];
        }
        if (hashMap == null) {
            this.p1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.q1 = new HashMap();
        }
        if (i10 == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.K0 = 1;
                this.L0 = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.M0 = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.G;
            if (password2 == null) {
                w1();
            } else {
                TwoStepVerificationActivity.m0(password2);
                if (this.K0 == 1) {
                    B1(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new oh.p5(14));
        }
    }

    public static int C0(fn0 fn0Var, String str) {
        fn0Var.getClass();
        str.getClass();
        switch (str) {
            case "residence_country_code":
                return 26;
            case "last_name_native":
            case "last_name":
                return 22;
            case "gender":
                return 24;
            case "street_line1":
                return 29;
            case "street_line2":
                return 30;
            case "first_name":
            case "first_name_native":
                return 20;
            case "city":
                return 32;
            case "state":
                return 33;
            case "middle_name":
            case "middle_name_native":
                return 21;
            case "expiry_date":
                return 28;
            case "document_no":
                return 27;
            case "birth_date":
                return 23;
            case "country_code":
                return 25;
            case "post_code":
                return 31;
            default:
                return 100;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ea, code lost:
    
        if (r7 != 5) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x025e, code lost:
    
        if (r9 > 24) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0269, code lost:
    
        if (r9 < 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0278, code lost:
    
        if (r9 < 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0281, code lost:
    
        if (r9 > 10) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0286 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean D0(fn0 fn0Var) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        boolean z4;
        View view;
        ArrayList arrayList = fn0Var.h1;
        ArrayList arrayList2 = fn0Var.f1;
        HashMap hashMap = fn0Var.k1;
        HashMap hashMap2 = fn0Var.v1;
        if (fn0Var.C != null) {
            if (hashMap2.containsKey("error_all") || hashMap2.containsKey("error_document_all")) {
                fn0Var.z1(fn0Var.m0);
                return true;
            }
            if (fn0Var.O != null) {
                if (arrayList2.isEmpty()) {
                    fn0Var.z1(fn0Var.O);
                    return true;
                }
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SecureDocument secureDocument = (SecureDocument) arrayList2.get(i10);
                    String str = "files" + n1(secureDocument);
                    if (str != null && hashMap2.containsKey(str)) {
                        fn0Var.z1((View) hashMap.get(secureDocument));
                        return true;
                    }
                }
            }
            if (hashMap2.containsKey("files_all") || hashMap2.containsKey("translation_all")) {
                fn0Var.z1(fn0Var.k0);
                return true;
            }
            View view2 = fn0Var.R;
            if (view2 != null) {
                if (fn0Var.i1 == null) {
                    fn0Var.z1(view2);
                    return true;
                }
                if (hashMap2.containsKey("front" + n1(fn0Var.i1))) {
                    fn0Var.z1((View) hashMap.get(fn0Var.i1));
                    return true;
                }
            }
            TLRPC.SecureValueType secureValueType = fn0Var.C.type;
            if (((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) && (view = fn0Var.S) != null) {
                if (fn0Var.j1 == null) {
                    fn0Var.z1(view);
                    return true;
                }
                if (hashMap2.containsKey("reverse" + n1(fn0Var.j1))) {
                    fn0Var.z1((View) hashMap.get(fn0Var.j1));
                    return true;
                }
            }
            View view3 = fn0Var.T;
            if (view3 != null && fn0Var.c != 0) {
                if (fn0Var.g1 == null) {
                    fn0Var.z1(view3);
                    return true;
                }
                if (hashMap2.containsKey("selfie" + n1(fn0Var.g1))) {
                    fn0Var.z1((View) hashMap.get(fn0Var.g1));
                    return true;
                }
            }
            if (fn0Var.U != null && fn0Var.c != 0) {
                if (arrayList.isEmpty()) {
                    fn0Var.z1(fn0Var.U);
                    return true;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    SecureDocument secureDocument2 = (SecureDocument) arrayList.get(i11);
                    if (hashMap2.containsKey("translation" + n1(secureDocument2))) {
                        fn0Var.z1((View) hashMap.get(secureDocument2));
                        return true;
                    }
                }
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                editTextBoldCursorArr = fn0Var.V;
            } else {
                org.telegram.ui.Cells.a9 a9Var = fn0Var.n0;
                editTextBoldCursorArr = (a9Var == null || a9Var.getVisibility() != 0) ? null : fn0Var.X;
            }
            if (editTextBoldCursorArr != null) {
                int i13 = 0;
                while (i13 < editTextBoldCursorArr.length) {
                    boolean hasErrorText = editTextBoldCursorArr[i13].hasErrorText();
                    if (!hashMap2.isEmpty()) {
                        TLRPC.SecureValueType secureValueType2 = fn0Var.B.type;
                        String str2 = "country_code";
                        if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (i13 == 0) {
                                    str2 = "street_line1";
                                } else if (i13 == 1) {
                                    str2 = "street_line2";
                                } else if (i13 == 2) {
                                    str2 = "post_code";
                                } else if (i13 == 3) {
                                    str2 = "city";
                                } else if (i13 == 4) {
                                    str2 = "state";
                                }
                                if (str2 != null) {
                                }
                            }
                            str2 = null;
                            if (str2 != null) {
                            }
                        } else if (i12 == 0) {
                            switch (i13) {
                                case 0:
                                    str2 = "first_name";
                                    break;
                                case 1:
                                    str2 = "middle_name";
                                    break;
                                case 2:
                                    str2 = "last_name";
                                    break;
                                case 3:
                                    str2 = "birth_date";
                                    break;
                                case 4:
                                    str2 = "gender";
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    str2 = "residence_country_code";
                                    break;
                                case 7:
                                    str2 = "document_no";
                                    break;
                                case 8:
                                    str2 = "expiry_date";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                String str3 = (String) hashMap2.get(str2);
                                if (!TextUtils.isEmpty(str3) && str3.equals(editTextBoldCursorArr[i13].getText().toString())) {
                                    hasErrorText = true;
                                }
                            }
                        } else {
                            if (i13 == 0) {
                                str2 = "first_name_native";
                            } else if (i13 != 1) {
                                if (i13 == 2) {
                                    str2 = "last_name_native";
                                }
                                str2 = null;
                            } else {
                                str2 = "middle_name_native";
                            }
                            if (str2 != null) {
                            }
                        }
                    }
                    if (!fn0Var.s0 || fn0Var.C == null || i13 >= 7) {
                        if (!hasErrorText) {
                            int length = editTextBoldCursorArr[i13].length();
                            int i14 = fn0Var.b;
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    if (i13 == 1) {
                                        continue;
                                    } else if (i13 != 3) {
                                        if (i13 == 4) {
                                            if (!"US".equals(fn0Var.s)) {
                                                continue;
                                            }
                                        } else if (i13 == 2) {
                                            if (length >= 2) {
                                            }
                                            hasErrorText = true;
                                        }
                                    }
                                }
                                z4 = false;
                                if (!hasErrorText) {
                                }
                            } else if (i13 != 8) {
                                if ((i12 == 0 && (i13 == 0 || i13 == 2 || i13 == 1)) || (i12 == 1 && (i13 == 0 || i13 == 1 || i13 == 2))) {
                                    if (length > 255) {
                                        hasErrorText = true;
                                    }
                                    if ((i12 == 0 && i13 == 1) || (i12 == 1 && i13 == 1)) {
                                        z4 = true;
                                        if (!hasErrorText && !z4 && length == 0) {
                                            hasErrorText = true;
                                        }
                                    }
                                } else if (i13 == 7) {
                                }
                                z4 = false;
                                if (!hasErrorText) {
                                    hasErrorText = true;
                                }
                            } else {
                                continue;
                            }
                        }
                        if (hasErrorText) {
                            fn0Var.z1(editTextBoldCursorArr[i13]);
                            return true;
                        }
                    }
                    i13++;
                }
            }
        }
        return false;
    }

    public static void J0(fn0 fn0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z4) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = fn0Var.v1;
        if (hashMap == null || (str2 = (String) hashMap.get(str)) == null) {
            editTextBoldCursor.setErrorText(null);
        } else if (TextUtils.equals(str2, editable)) {
            HashMap hashMap2 = fn0Var.t1;
            if (hashMap2 == null || (str4 = (String) hashMap2.get(str)) == null) {
                HashMap hashMap3 = fn0Var.u1;
                if (hashMap3 != null && (str3 = (String) hashMap3.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        String str5 = z4 ? "error_document_all" : "error_all";
        if (hashMap == null || !hashMap.containsKey(str5)) {
            return;
        }
        hashMap.remove(str5);
        fn0Var.a1(false);
    }

    public static /* synthetic */ void U(fn0 fn0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = fn0Var.G;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        fn0Var.presentFragment(new qg1(fn0Var.currentAccount, 4, password));
    }

    public static void V(fn0 fn0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = fn0Var.o1;
        HashMap hashMap2 = fn0Var.n1;
        String str = fn0Var.r;
        ArrayList arrayList2 = new ArrayList();
        int size = fn0Var.y.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = fn0Var.y.required_types.get(i12);
            if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) secureRequiredType;
            } else {
                if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                    TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                    if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                        TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                        if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                            int size2 = tL_secureRequiredTypeOneOf.types.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                                TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i13);
                                if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                    if (fn0Var.r1(tL_secureRequiredType5, true) != null) {
                                        tL_secureRequiredType = tL_secureRequiredType5;
                                        break;
                                    }
                                }
                                i13++;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            TLRPC.TL_secureValue r12 = fn0Var.r1(tL_secureRequiredType, true);
            if (r12 == null) {
                Vibrator vibrator = (Vibrator) fn0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                en0 en0Var = (en0) hashMap2.get(tL_secureRequiredType);
                if (en0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    en0Var = (en0) hashMap2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(en0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) fn0Var.r1.get(o1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) fn0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                en0 en0Var2 = (en0) hashMap2.get(tL_secureRequiredType);
                if (en0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    en0Var2 = (en0) hashMap2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(en0Var2);
                return;
            }
            boolean z4 = tL_secureRequiredType.selfie_required;
            boolean z10 = tL_secureRequiredType.translation_required;
            fm0 fm0Var = new fm0();
            fm0Var.a = r12;
            fm0Var.b = z4;
            fm0Var.c = z10;
            arrayList2.add(fm0Var);
        }
        fn0Var.N1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = fn0Var.c;
        acceptauthorization.scope = fn0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            fm0 fm0Var2 = (fm0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = fm0Var2.a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData == null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] i15 = fn0Var.i1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(i15, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (tL_secureValue.files.isEmpty()) {
                        i10 = size3;
                        i11 = i14;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        int i16 = 0;
                        for (int size4 = tL_secureValue.files.size(); i16 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i16);
                            i10 = size3;
                            try {
                                i11 = i14;
                                try {
                                    byte[] i17 = fn0Var.i1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(i17, 2));
                                    jSONArray.put(jSONObject4);
                                    i16++;
                                    size3 = i10;
                                    i14 = i11;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i10 = size3;
                        i11 = i14;
                        jSONObject3.put("files", jSONArray);
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] i18 = fn0Var.i1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(i18, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] i19 = fn0Var.i1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(i19, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (fm0Var2.b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] i110 = fn0Var.i1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(i110, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (fm0Var2.c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i20 = 0; i20 < size5; i20++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i20);
                            byte[] i111 = fn0Var.i1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(i111, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(o1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i14 = i11 + 1;
                arrayList2 = arrayList;
                size3 = i10;
            } else if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
            }
            arrayList = arrayList2;
            i10 = size3;
            i11 = i14;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i14 = i11 + 1;
            arrayList2 = arrayList;
            size3 = i10;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj = fn0Var.d;
        if (obj != null) {
            try {
                jSONObject9.put("payload", obj);
            } catch (Exception unused6) {
            }
        }
        Object obj2 = fn0Var.e;
        if (obj2 != null) {
            try {
                jSONObject9.put("nonce", obj2);
            } catch (Exception unused7) {
            }
        }
        c5.j k12 = fn0Var.k1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) k12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) k12.c;
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) k12.b);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        ConnectionsManager.getInstance(fn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(fn0Var.currentAccount).sendRequest(acceptauthorization, new tl0(fn0Var, 1)), fn0Var.classGuid);
    }

    public static /* synthetic */ void W(fn0 fn0Var, TLRPC.TL_error tL_error, String str, vm0 vm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error != null) {
            org.telegram.ui.Components.z4.f0(fn0Var.currentAccount, tL_error, fn0Var, sendverifyphonecode, str);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("phone", str);
        fn0 fn0Var2 = new fn0(7, fn0Var.y, fn0Var.G, fn0Var.B, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
        fn0Var2.currentAccount = fn0Var.currentAccount;
        fn0Var2.b1 = fn0Var.b1;
        fn0Var2.Z0 = fn0Var.Z0;
        fn0Var2.y1 = vm0Var;
        fn0Var2.H = (TLRPC.TL_auth_sentCode) tLObject;
        fn0Var.presentFragment(fn0Var2, true);
    }

    public static /* synthetic */ void X(fn0 fn0Var, SecureDocument secureDocument, int i10) {
        HashMap hashMap = fn0Var.k1;
        int i11 = fn0Var.P0;
        if (i11 == 1) {
            SecureDocument secureDocument2 = fn0Var.g1;
            if (secureDocument2 != null) {
                dn0 dn0Var = (dn0) hashMap.remove(secureDocument2);
                if (dn0Var != null) {
                    fn0Var.d0.removeView(dn0Var);
                }
                fn0Var.g1 = null;
            }
        } else if (i11 == 4) {
            if (fn0Var.h1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            SecureDocument secureDocument3 = fn0Var.i1;
            if (secureDocument3 != null) {
                dn0 dn0Var2 = (dn0) hashMap.remove(secureDocument3);
                if (dn0Var2 != null) {
                    fn0Var.b0.removeView(dn0Var2);
                }
                fn0Var.i1 = null;
            }
        } else if (i11 == 3) {
            SecureDocument secureDocument4 = fn0Var.j1;
            if (secureDocument4 != null) {
                dn0 dn0Var3 = (dn0) hashMap.remove(secureDocument4);
                if (dn0Var3 != null) {
                    fn0Var.c0.removeView(dn0Var3);
                }
                fn0Var.j1 = null;
            }
        } else if (i11 == 0 && fn0Var.f1.size() >= 20) {
            return;
        }
        fn0Var.l1.put(secureDocument.path, secureDocument);
        fn0Var.I.setEnabled(false);
        fn0Var.I.setAlpha(0.5f);
        FileLoader.getInstance(fn0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        fn0Var.R0(secureDocument, i10);
        fn0Var.S1(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void Y(fn0 fn0Var, boolean z4, String str) {
        byte[] bArr;
        byte[] x10;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        if (z4) {
            x10 = fn0Var.L0;
        } else {
            if (!(fn0Var.G.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
                bArr = null;
                rm0 rm0Var = new rm0(fn0Var, z4, bArr, getpasswordsettings, str);
                TL_account.Password password = fn0Var.G;
                passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "PASSWORD_HASH_INVALID";
                    rm0Var.run(null, tL_error);
                    return;
                }
                TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                getpasswordsettings.password = startCheck;
                if (startCheck != null) {
                    ConnectionsManager.getInstance(fn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(fn0Var.currentAccount).sendRequest(getpasswordsettings, rm0Var, 10), fn0Var.classGuid);
                    return;
                } else {
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "ALGO_INVALID";
                    rm0Var.run(null, tL_error2);
                    return;
                }
            }
            x10 = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) fn0Var.G.current_algo);
        }
        bArr = x10;
        rm0 rm0Var2 = new rm0(fn0Var, z4, bArr, getpasswordsettings, str);
        TL_account.Password password2 = fn0Var.G;
        passwordKdfAlgo = password2.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        }
    }

    public static /* synthetic */ void Z(int i10, String str, SecureDocument secureDocument, dn0 dn0Var, fn0 fn0Var) {
        HashMap hashMap = fn0Var.l1;
        fn0Var.k1.remove(secureDocument);
        if (i10 == 1) {
            fn0Var.g1 = null;
            fn0Var.d0.removeView(dn0Var);
        } else if (i10 == 4) {
            fn0Var.h1.remove(secureDocument);
            fn0Var.e0.removeView(dn0Var);
        } else if (i10 == 2) {
            fn0Var.i1 = null;
            fn0Var.b0.removeView(dn0Var);
        } else if (i10 == 3) {
            fn0Var.j1 = null;
            fn0Var.c0.removeView(dn0Var);
        } else {
            fn0Var.f1.remove(secureDocument);
            fn0Var.a0.removeView(dn0Var);
        }
        if (str != null) {
            HashMap hashMap2 = fn0Var.u1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = fn0Var.v1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        fn0Var.S1(i10);
        String str2 = secureDocument.path;
        if (str2 == null || hashMap.remove(str2) == null) {
            return;
        }
        if (hashMap.isEmpty()) {
            fn0Var.I.setEnabled(true);
            fn0Var.I.setAlpha(1.0f);
        }
        FileLoader.getInstance(fn0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
    }

    public static boolean Z0(byte[] bArr, Long l10) {
        if (bArr == null || bArr.length != 32) {
            return false;
        }
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 += b10 & 255;
        }
        if (i10 % 255 != 239) {
            return false;
        }
        return l10 == null || Utilities.bytesToLong(Utilities.computeSHA256(bArr)) == l10.longValue();
    }

    public static /* synthetic */ void a0(fn0 fn0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < fn0Var.y.values.size(); i10++) {
            deletesecurevalue.types.add(fn0Var.y.values.get(i10).type);
        }
        fn0Var.y1();
        ConnectionsManager.getInstance(fn0Var.currentAccount).sendRequest(deletesecurevalue, new tl0(fn0Var, 2));
    }

    public static void b0(fn0 fn0Var) {
        qg1 qg1Var = new qg1(fn0Var.currentAccount, 0, fn0Var.G);
        qg1Var.V = true;
        fn0Var.presentFragment(qg1Var);
    }

    public static void c0(fn0 fn0Var) {
        if (fn0Var.G.has_recovery) {
            fn0Var.y1();
            ConnectionsManager.getInstance(fn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(fn0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new tl0(fn0Var, 0), 10), fn0Var.classGuid);
            return;
        }
        if (fn0Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new sl0(fn0Var, 4));
        alertDialog$Builder.a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
        String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.Q = string;
        fn0Var.showDialog(d2Var);
    }

    public static void e0(fn0 fn0Var) {
        if (Build.VERSION.SDK_INT >= 23 && fn0Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            fn0Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 22);
            return;
        }
        v9 v9Var = new v9(0);
        v9Var.I = new cm0(fn0Var);
        fn0Var.presentFragment(v9Var);
    }

    public static String h1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length != 32 || bArr3 == null || bArr3.length != 32) {
            return null;
        }
        byte[] computeSHA512 = Utilities.computeSHA512(bArr2, bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
        int length = bArr.length;
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, length, 0, 0);
        if (!Arrays.equals(Utilities.computeSHA256(bArr6), bArr3)) {
            return null;
        }
        int i10 = bArr6[0] & 255;
        return new String(bArr6, i10, length - i10);
    }

    public static String n1(SecureDocument secureDocument) {
        byte[] bArr;
        if (secureDocument == null) {
            return "";
        }
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
            return Base64.encodeToString(bArr, 2);
        }
        byte[] bArr2 = secureDocument.fileHash;
        return bArr2 != null ? Base64.encodeToString(bArr2, 2) : "";
    }

    public static String o1(TLRPC.SecureValueType secureValueType) {
        return secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? "personal_details" : secureValueType instanceof TLRPC.TL_secureValueTypePassport ? "passport" : secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport ? "internal_passport" : secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense ? "driver_license" : secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard ? "identity_card" : secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill ? "utility_bill" : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? "address" : secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement ? "bank_statement" : secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement ? "rental_agreement" : secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration ? "temporary_registration" : secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration ? "passport_registration" : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? "email" : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? "phone" : "";
    }

    public static byte[] p1() {
        byte[] bArr = new byte[32];
        Utilities.random.nextBytes(bArr);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            i10 += 255 & bArr[i11];
        }
        int i12 = i10 % 255;
        if (i12 != 239) {
            int nextInt = Utilities.random.nextInt(32);
            int i13 = (bArr[nextInt] & 255) + (239 - i12);
            if (i13 < 255) {
                i13 += 255;
            }
            bArr[nextInt] = (byte) (i13 % 255);
        }
        return bArr;
    }

    public static String q1(TLRPC.SecureValueType secureValueType) {
        return secureValueType instanceof TLRPC.TL_secureValueTypePassport ? LocaleController.getString(R.string.ActionBotDocumentPassport) : secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense ? LocaleController.getString(R.string.ActionBotDocumentDriverLicence) : secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard ? LocaleController.getString(R.string.ActionBotDocumentIdentityCard) : secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill ? LocaleController.getString(R.string.ActionBotDocumentUtilityBill) : secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement ? LocaleController.getString(R.string.ActionBotDocumentBankStatement) : secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement ? LocaleController.getString(R.string.ActionBotDocumentRentalAgreement) : secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport ? LocaleController.getString(R.string.ActionBotDocumentInternalPassport) : secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration ? LocaleController.getString(R.string.ActionBotDocumentPassportRegistration) : secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration ? LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration) : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? LocaleController.getString(R.string.ActionBotDocumentPhone) : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? LocaleController.getString(R.string.ActionBotDocumentEmail) : "";
    }

    public static boolean t1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) || (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) || (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement);
    }

    public static boolean v1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard);
    }

    public final void A1(boolean z4) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z4) {
            this.V[0].setText("");
        }
        AndroidUtilities.shakeView(this.V[0]);
    }

    public final void B1(boolean z4) {
        String obj;
        if (z4) {
            obj = null;
        } else {
            obj = this.V[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                A1(false);
                return;
            }
            N1(true, true);
        }
        Utilities.globalQueue.postRunnable(new mh.r5(this, z4, obj, 26));
    }

    public final void C1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (s1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPhone));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (s1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentEmail));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (s1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentity));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (s1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassport));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (s1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentInternalPassport));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (s1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (s1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentIdentityCard));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (s1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentDriverLicence));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (s1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentAddress));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (s1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (s1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() == null || arrayList.isEmpty()) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.a.O = LocaleController.getString(R.string.PassportNoDocumentsAdd);
        alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new dg.t1(9, this, arrayList2));
        showDialog(alertDialog$Builder.a);
    }

    public final void D1() {
        int size;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        int i11 = this.P0;
        ArrayList arrayList = this.f1;
        int i12 = 1;
        if (i11 == 0 && arrayList.size() >= 20) {
            M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        c1();
        org.telegram.ui.Components.mi miVar = this.O0;
        int i13 = this.P0;
        miVar.R1 = i13 == 1;
        if (i13 != 0) {
            if (i13 == 4) {
                size = this.h1.size();
            }
            miVar.J1(i12, false);
            this.O0.g0.f0();
            i10 = Build.VERSION.SDK_INT;
            if (i10 != 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            }
            this.O0.r1();
            showDialog(this.O0);
        }
        size = arrayList.size();
        i12 = 20 - size;
        miVar.J1(i12, false);
        this.O0.g0.f0();
        i10 = Build.VERSION.SDK_INT;
        if (i10 != 21) {
        }
        AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
        this.O0.r1();
        showDialog(this.O0);
    }

    public final void E1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z4) {
        HashMap hashMap;
        HashMap hashMap2;
        int size = arrayList != null ? arrayList.size() : 0;
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2 != null ? tL_secureRequiredType2.type : null;
        int i10 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? 1 : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? 2 : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? 3 : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? 4 : -1;
        if (i10 != -1) {
            HashMap hashMap3 = this.r1;
            HashMap hashMap4 = !z4 ? (HashMap) hashMap3.get(o1(secureValueType)) : null;
            HashMap hashMap5 = (HashMap) hashMap3.get(o1(secureValueType2));
            TLRPC.TL_secureValue r12 = r1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue r13 = r1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap4;
            TL_account.authorizationForm authorizationform = this.y;
            int i11 = i10;
            TL_account.Password password = this.G;
            HashMap hashMap7 = this.m1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap = hashMap5;
                hashMap2 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap = hashMap5;
                hashMap2 = null;
            }
            fn0 fn0Var = new fn0(i11, authorizationform, password, tL_secureRequiredType, r12, tL_secureRequiredType2, r13, hashMap8, hashMap2);
            fn0Var.y1 = new im0(this, secureValueType, z4, size);
            fn0Var.currentAccount = this.currentAccount;
            fn0Var.b1 = this.b1;
            fn0Var.Z0 = this.Z0;
            fn0Var.c = this.c;
            fn0Var.t1 = hashMap6;
            fn0Var.s0 = z4;
            fn0Var.u1 = hashMap;
            fn0Var.D = arrayList;
            if (i11 == 4) {
                fn0Var.a1 = this.a1;
            }
            presentFragment(fn0Var);
        }
    }

    public final void F1(int i10) {
        if (i10 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i11 >= 24) {
                        intent.putExtra("output", FileProvider.d(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.N0 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void G1(ArrayList arrayList) {
        boolean z4;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = this.P0;
        boolean z10 = true;
        if (i10 == 1 || i10 == 4 || !(this.B.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            z4 = false;
        } else {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.V;
                if (i11 < editTextBoldCursorArr.length) {
                    if (i11 != 5 && i11 != 8 && i11 != 4 && i11 != 6 && editTextBoldCursorArr[i11].length() > 0) {
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            z4 = z10;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.l0(this.P0, 7, this, arrayList, z4));
    }

    public final TLRPC.TL_secureValue H1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (tL_secureRequiredType.type.getClass() == this.y.values.get(i10).type.getClass()) {
                return this.y.values.remove(i10);
            }
        }
        return null;
    }

    public final void I1(View view) {
        while (view != null && this.Z.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.Y.smoothScrollTo(0, view.getTop() - ((this.Y.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void J1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            switch (str) {
                case "residence_country_code":
                    this.v = str2;
                    CharSequence charSequence3 = (String) this.V0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case "gender":
                    if (!"male".equals(str2)) {
                        if ("female".equals(str2)) {
                            this.w = str2;
                            editTextBoldCursor.setText(LocaleController.getString(R.string.PassportFemale));
                            break;
                        }
                    } else {
                        this.w = str2;
                        editTextBoldCursor.setText(LocaleController.getString(R.string.PassportMale));
                        break;
                    }
                    break;
                case "expiry_date":
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.x;
                    if (!isEmpty) {
                        String[] split = str2.split("\\.");
                        if (split.length == 3) {
                            iArr[0] = Utilities.parseInt((CharSequence) split[2]).intValue();
                            iArr[1] = Utilities.parseInt((CharSequence) split[1]).intValue();
                            iArr[2] = Utilities.parseInt((CharSequence) split[0]).intValue();
                            editTextBoldCursor.setText(str2);
                            break;
                        }
                    }
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    editTextBoldCursor.setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                case "country_code":
                    this.s = str2;
                    CharSequence charSequence4 = (String) this.V0.get(str2);
                    if (charSequence4 != null) {
                        editTextBoldCursor.setText(charSequence4);
                        break;
                    }
                    break;
                default:
                    editTextBoldCursor.setText(str2);
                    break;
            }
        }
        HashMap hashMap2 = this.t1;
        HashMap hashMap3 = this.v1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.u1;
        if (hashMap4 == null || (charSequence = (String) hashMap4.get(str)) == null) {
            return;
        }
        editTextBoldCursor.setErrorText(charSequence);
        hashMap3.put(str, editTextBoldCursor.getText().toString());
    }

    public final void K1(Bundle bundle, int i10, boolean z4) {
        if (i10 == 3) {
            this.I.setVisibility(8);
        }
        int i11 = this.F1;
        org.telegram.ui.Components.wv0[] wv0VarArr = this.G1;
        org.telegram.ui.Components.wv0 wv0Var = wv0VarArr[i11];
        org.telegram.ui.Components.wv0 wv0Var2 = wv0VarArr[i10];
        this.F1 = i10;
        wv0Var2.m(bundle, false);
        wv0Var2.j();
        if (!z4) {
            wv0Var2.setTranslationX(0.0f);
            wv0Var2.setVisibility(0);
            if (wv0Var != wv0Var2) {
                wv0Var.setVisibility(8);
                return;
            }
            return;
        }
        wv0Var2.setTranslationX(AndroidUtilities.displaySize.x);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(wv0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(wv0Var2, "translationX", 0.0f));
        animatorSet.addListener(new org.telegram.ui.Components.fx0(wv0Var2, wv0Var, 5));
        animatorSet.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x0324, code lost:
    
        if (r4.equals("residence_country_code") != false) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0234 A[Catch: all -> 0x0248, TryCatch #3 {all -> 0x0248, blocks: (B:183:0x022a, B:184:0x022e, B:186:0x0234, B:188:0x0240, B:191:0x024a), top: B:182:0x022a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025d A[Catch: Exception -> 0x01fe, TryCatch #0 {Exception -> 0x01fe, blocks: (B:276:0x01f3, B:195:0x025a, B:197:0x025d, B:200:0x0267, B:269:0x0256, B:282:0x0213, B:183:0x022a, B:184:0x022e, B:186:0x0234, B:188:0x0240, B:191:0x024a), top: B:275:0x01f3, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L1(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, boolean z4, int i10) {
        char c3;
        StringBuilder sb;
        TLRPC.TL_secureValue tL_secureValue;
        en0 en0Var;
        String[] strArr;
        String[] strArr2;
        int i11;
        int i12;
        JSONObject jSONObject;
        int i13;
        String[] strArr3;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        String[] strArr4;
        StringBuilder sb2;
        int i14;
        String[] strArr5;
        HashMap hashMap3;
        HashMap hashMap4;
        JSONObject jSONObject3;
        Iterator<String> keys;
        String sb3;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap5;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4;
        HashMap hashMap6;
        TLRPC.SecureValueType secureValueType;
        en0 en0Var2;
        boolean z10;
        String str4 = str2;
        en0 en0Var3 = (en0) this.n1.get(tL_secureRequiredType);
        if (en0Var3 == null) {
            if (this.b != 8) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (tL_secureRequiredType2 != null) {
                arrayList.add(tL_secureRequiredType2);
            }
            LinearLayout linearLayout = this.Z;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
            if (childAt instanceof en0) {
                ((en0) childAt).setNeedDivider(true);
            }
            en0Var3 = U0(getParentActivity(), tL_secureRequiredType, arrayList, true, true);
            Q1();
        }
        en0 en0Var4 = en0Var3;
        HashMap hashMap7 = (HashMap) this.m1.get(tL_secureRequiredType);
        HashMap hashMap8 = tL_secureRequiredType2 != null ? (HashMap) this.m1.get(tL_secureRequiredType2) : null;
        TLRPC.TL_secureValue r12 = r1(tL_secureRequiredType, true);
        TLRPC.TL_secureValue r13 = r1(tL_secureRequiredType2, true);
        if (str4 == null || this.V0 != null) {
            c3 = 2;
            this.V0 = null;
        } else {
            this.V0 = new HashMap();
            try {
                c3 = 2;
            } catch (Exception e6) {
                e = e6;
                c3 = 2;
            }
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split(";");
                        this.V0.put(split[1], split[2]);
                    }
                    bufferedReader.close();
                } catch (Exception e10) {
                    e = e10;
                    FileLog.e(e);
                    if (str != null) {
                    }
                    if (z4) {
                    }
                    if (tL_secureRequiredType2 != null) {
                    }
                    if (hashMap5 != null) {
                    }
                    secureValueType = tL_secureRequiredType3.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    }
                    en0Var2.setValue(sb3);
                    en0Var2.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, z10 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.z6, false));
                    en0Var2.setChecked(z10 && this.b != 8 && ((z4 && tL_secureRequiredType4 != null) || !(z4 || tL_secureValue == null)) && (tL_secureRequiredType4 == null || r13 != null));
                }
            } catch (Exception e11) {
                e = e11;
                FileLog.e(e);
                if (str != null) {
                }
                if (z4) {
                }
                if (tL_secureRequiredType2 != null) {
                }
                if (hashMap5 != null) {
                }
                secureValueType = tL_secureRequiredType3.type;
                if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                }
                en0Var2.setValue(sb3);
                en0Var2.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, z10 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.z6, false));
                en0Var2.setChecked(z10 && this.b != 8 && ((z4 && tL_secureRequiredType4 != null) || !(z4 || tL_secureValue == null)) && (tL_secureRequiredType4 == null || r13 != null));
            }
        }
        if (str != null) {
            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                sb3 = se.b.c().b("+".concat(str));
                en0Var = en0Var4;
            } else {
                en0Var = en0Var4;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
                    sb3 = str;
                } else {
                    tL_secureValue = r12;
                    sb3 = null;
                }
            }
            tL_secureValue = r12;
        } else {
            if (this.b == 8 || tL_secureRequiredType2 == null || (TextUtils.isEmpty(str3) && r13 == null)) {
                sb = null;
            } else {
                sb = new StringBuilder();
                if (i10 > 1) {
                    sb.append(q1(tL_secureRequiredType2.type));
                } else if (TextUtils.isEmpty(str3)) {
                    sb.append(LocaleController.getString(R.string.PassportDocuments));
                }
            }
            if (str4 == null && str3 == null) {
                en0Var = en0Var4;
                tL_secureValue = r12;
            } else {
                if (hashMap7 == null) {
                    return;
                }
                hashMap7.clear();
                TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
                tL_secureValue = r12;
                en0Var = en0Var4;
                if (secureValueType3 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    int i15 = this.b;
                    if (i15 != 0 || z4) {
                        int i16 = i15 == 8 ? tL_secureRequiredType2 != null ? 8 : 8 : 8;
                        strArr2 = null;
                        if (i15 != 0 || (i15 == i16 && tL_secureRequiredType2 != null)) {
                            strArr = new String[]{"document_no", "expiry_date"};
                            if (strArr2 == null || strArr != null) {
                                StringBuilder sb4 = sb;
                                String[] strArr6 = strArr;
                                JSONObject jSONObject4 = null;
                                i12 = 0;
                                String[] strArr7 = null;
                                while (i12 < 2) {
                                    if (i12 == 0) {
                                        if (str4 != null) {
                                            try {
                                                jSONObject = new JSONObject(str4);
                                                i13 = i12;
                                                strArr3 = strArr2;
                                                if (strArr3 != null && jSONObject != null) {
                                                    try {
                                                        keys = jSONObject.keys();
                                                        while (keys.hasNext()) {
                                                            Iterator<String> it = keys;
                                                            String next = keys.next();
                                                            if (i13 == 0) {
                                                                hashMap7.put(next, jSONObject.getString(next));
                                                            } else {
                                                                hashMap8.put(next, jSONObject.getString(next));
                                                            }
                                                            keys = it;
                                                        }
                                                    } catch (Throwable th2) {
                                                        FileLog.e(th2);
                                                    }
                                                    i14 = 0;
                                                    while (i14 < strArr3.length) {
                                                        if (jSONObject.has(strArr3[i14])) {
                                                            sb = sb4 == null ? new StringBuilder() : sb4;
                                                            strArr5 = strArr3;
                                                            try {
                                                                String string = jSONObject.getString(strArr5[i14]);
                                                                if (string == null || TextUtils.isEmpty(string)) {
                                                                    hashMap3 = hashMap7;
                                                                } else {
                                                                    hashMap3 = hashMap7;
                                                                    if (!"first_name_native".equals(strArr5[i14]) && !"middle_name_native".equals(strArr5[i14]) && !"last_name_native".equals(strArr5[i14])) {
                                                                        if (sb.length() > 0) {
                                                                            if (!"last_name".equals(strArr5[i14]) && !"last_name_native".equals(strArr5[i14]) && !"middle_name".equals(strArr5[i14]) && !"middle_name_native".equals(strArr5[i14])) {
                                                                                sb.append(", ");
                                                                            }
                                                                            sb.append(" ");
                                                                        }
                                                                        String str5 = strArr5[i14];
                                                                        hashMap4 = hashMap8;
                                                                        int hashCode = str5.hashCode();
                                                                        jSONObject3 = jSONObject;
                                                                        if (hashCode != -2006252145) {
                                                                            if (hashCode != -1249512767) {
                                                                                if (hashCode == 1481071862 && str5.equals("country_code")) {
                                                                                    String str6 = (String) this.V0.get(string);
                                                                                    if (str6 != null) {
                                                                                        sb.append(str6);
                                                                                    }
                                                                                }
                                                                            } else if (str5.equals("gender")) {
                                                                                if ("male".equals(string)) {
                                                                                    sb.append(LocaleController.getString(R.string.PassportMale));
                                                                                } else if ("female".equals(string)) {
                                                                                    sb.append(LocaleController.getString(R.string.PassportFemale));
                                                                                }
                                                                            }
                                                                            sb.append(string);
                                                                        }
                                                                    }
                                                                }
                                                                hashMap4 = hashMap8;
                                                                jSONObject3 = jSONObject;
                                                            } catch (Exception unused) {
                                                            }
                                                        } else {
                                                            strArr5 = strArr3;
                                                            hashMap3 = hashMap7;
                                                            hashMap4 = hashMap8;
                                                            jSONObject3 = jSONObject;
                                                            sb = sb4;
                                                        }
                                                        i14++;
                                                        sb4 = sb;
                                                        strArr3 = strArr5;
                                                        hashMap7 = hashMap3;
                                                        hashMap8 = hashMap4;
                                                        jSONObject = jSONObject3;
                                                    }
                                                }
                                                strArr4 = strArr3;
                                                hashMap = hashMap7;
                                                hashMap2 = hashMap8;
                                                jSONObject2 = jSONObject;
                                                sb2 = sb4;
                                                i12 = i13 + 1;
                                                str4 = str2;
                                                sb4 = sb2;
                                                strArr7 = strArr4;
                                                hashMap7 = hashMap;
                                                hashMap8 = hashMap2;
                                                jSONObject4 = jSONObject2;
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        String[] strArr8 = strArr7;
                                        i13 = i12;
                                        strArr3 = strArr8;
                                        jSONObject = jSONObject4;
                                        if (strArr3 != null) {
                                            keys = jSONObject.keys();
                                            while (keys.hasNext()) {
                                            }
                                            i14 = 0;
                                            while (i14 < strArr3.length) {
                                            }
                                        }
                                        strArr4 = strArr3;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        jSONObject2 = jSONObject;
                                        sb2 = sb4;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb4 = sb2;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                    } else if (hashMap8 == null) {
                                        jSONObject2 = jSONObject4;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        strArr4 = strArr7;
                                        sb2 = sb4;
                                        i13 = i12;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb4 = sb2;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                    } else {
                                        if (str3 != null) {
                                            jSONObject = new JSONObject(str3);
                                            i13 = i12;
                                            strArr3 = strArr6;
                                            if (strArr3 != null) {
                                            }
                                            strArr4 = strArr3;
                                            hashMap = hashMap7;
                                            hashMap2 = hashMap8;
                                            jSONObject2 = jSONObject;
                                            sb2 = sb4;
                                            i12 = i13 + 1;
                                            str4 = str2;
                                            sb4 = sb2;
                                            strArr7 = strArr4;
                                            hashMap7 = hashMap;
                                            hashMap8 = hashMap2;
                                            jSONObject4 = jSONObject2;
                                        }
                                        String[] strArr82 = strArr7;
                                        i13 = i12;
                                        strArr3 = strArr82;
                                        jSONObject = jSONObject4;
                                        if (strArr3 != null) {
                                        }
                                        strArr4 = strArr3;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        jSONObject2 = jSONObject;
                                        sb2 = sb4;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb4 = sb2;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                    }
                                }
                                sb = sb4;
                            }
                        }
                        strArr = null;
                        if (strArr2 == null) {
                        }
                        StringBuilder sb42 = sb;
                        String[] strArr62 = strArr;
                        JSONObject jSONObject42 = null;
                        i12 = 0;
                        String[] strArr72 = null;
                        while (i12 < 2) {
                        }
                        sb = sb42;
                    }
                    String[] strArr9 = new String[10];
                    strArr9[0] = "first_name";
                    strArr9[1] = "middle_name";
                    strArr9[c3] = "last_name";
                    strArr9[3] = "first_name_native";
                    strArr9[4] = "middle_name_native";
                    strArr9[5] = "last_name_native";
                    strArr9[6] = "birth_date";
                    strArr9[7] = "gender";
                    strArr2 = strArr9;
                    strArr2[8] = "country_code";
                    strArr2[9] = "residence_country_code";
                    if (i15 != 0) {
                    }
                    strArr = new String[]{"document_no", "expiry_date"};
                    if (strArr2 == null) {
                    }
                    StringBuilder sb422 = sb;
                    String[] strArr622 = strArr;
                    JSONObject jSONObject422 = null;
                    i12 = 0;
                    String[] strArr722 = null;
                    while (i12 < 2) {
                    }
                    sb = sb422;
                } else if (!(secureValueType3 instanceof TLRPC.TL_secureValueTypeAddress) || (((i11 = this.b) != 0 || z4) && !(i11 == 8 && tL_secureRequiredType2 == null))) {
                    strArr = null;
                    strArr2 = null;
                    if (strArr2 == null) {
                    }
                    StringBuilder sb4222 = sb;
                    String[] strArr6222 = strArr;
                    JSONObject jSONObject4222 = null;
                    i12 = 0;
                    String[] strArr7222 = null;
                    while (i12 < 2) {
                    }
                    sb = sb4222;
                } else {
                    strArr2 = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                    strArr = null;
                    if (strArr2 == null) {
                    }
                    StringBuilder sb42222 = sb;
                    String[] strArr62222 = strArr;
                    JSONObject jSONObject42222 = null;
                    i12 = 0;
                    String[] strArr72222 = null;
                    while (i12 < 2) {
                    }
                    sb = sb42222;
                }
            }
            if (sb != null) {
                sb3 = sb.toString();
            }
            sb3 = null;
        }
        if (z4) {
            tL_secureRequiredType3 = tL_secureRequiredType;
            hashMap5 = null;
        } else {
            tL_secureRequiredType3 = tL_secureRequiredType;
            hashMap5 = (HashMap) this.r1.get(o1(tL_secureRequiredType3.type));
        }
        if (tL_secureRequiredType2 != null) {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            hashMap6 = (HashMap) this.r1.get(o1(tL_secureRequiredType4.type));
        } else {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            hashMap6 = null;
        }
        if ((hashMap5 != null || hashMap5.size() <= 0) && (hashMap6 == null || hashMap6.size() <= 0)) {
            secureValueType = tL_secureRequiredType3.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                if (TextUtils.isEmpty(sb3)) {
                    if (tL_secureRequiredType4 == null) {
                        sb3 = LocaleController.getString(R.string.PassportPersonalDetailsInfo);
                    } else if (this.b == 8) {
                        sb3 = LocaleController.getString(R.string.PassportDocuments);
                    } else if (i10 == 1) {
                        TLRPC.SecureValueType secureValueType4 = tL_secureRequiredType4.type;
                        if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassport) {
                            sb3 = LocaleController.getString(R.string.PassportIdentityPassport);
                        } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                            sb3 = LocaleController.getString(R.string.PassportIdentityInternalPassport);
                        } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            sb3 = LocaleController.getString(R.string.PassportIdentityDriverLicence);
                        } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                            sb3 = LocaleController.getString(R.string.PassportIdentityID);
                        }
                    } else {
                        sb3 = LocaleController.getString(R.string.PassportIdentityDocumentInfo);
                    }
                    en0Var2 = en0Var;
                    z10 = false;
                }
                en0Var2 = en0Var;
                z10 = false;
            } else {
                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                    if (TextUtils.isEmpty(sb3)) {
                        if (tL_secureRequiredType4 == null) {
                            sb3 = LocaleController.getString(R.string.PassportAddressNoUploadInfo);
                        } else if (this.b == 8) {
                            sb3 = LocaleController.getString(R.string.PassportDocuments);
                        } else if (i10 == 1) {
                            TLRPC.SecureValueType secureValueType5 = tL_secureRequiredType4.type;
                            if (secureValueType5 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                sb3 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                            } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                sb3 = LocaleController.getString(R.string.PassportAddBillInfo);
                            } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                sb3 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                            } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                sb3 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                            } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                sb3 = LocaleController.getString(R.string.PassportAddBankInfo);
                            }
                        } else {
                            sb3 = LocaleController.getString(R.string.PassportAddressInfo);
                        }
                        en0Var2 = en0Var;
                        z10 = false;
                    }
                } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                    if (TextUtils.isEmpty(sb3)) {
                        sb3 = LocaleController.getString(R.string.PassportPhoneInfo);
                    }
                } else if ((secureValueType instanceof TLRPC.TL_secureValueTypeEmail) && TextUtils.isEmpty(sb3)) {
                    sb3 = LocaleController.getString(R.string.PassportEmailInfo);
                }
                en0Var2 = en0Var;
                z10 = false;
            }
        } else {
            sb3 = !z4 ? (String) this.s1.get(o1(tL_secureRequiredType3.type)) : null;
            if (sb3 == null) {
                sb3 = (String) this.s1.get(o1(tL_secureRequiredType4.type));
            }
            en0Var2 = en0Var;
            z10 = true;
        }
        en0Var2.setValue(sb3);
        en0Var2.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, z10 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.z6, false));
        en0Var2.setChecked(z10 && this.b != 8 && ((z4 && tL_secureRequiredType4 != null) || !(z4 || tL_secureValue == null)) && (tL_secureRequiredType4 == null || r13 != null));
    }

    public final void M1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = str;
        d2Var.Q = str2;
        showDialog(d2Var);
    }

    public final void N1(boolean z4, boolean z10) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
        if (z4 && this.I != null) {
            this.J = new AnimatorSet();
            if (z10) {
                this.K.setVisibility(0);
                this.I.setEnabled(false);
                AnimatorSet animatorSet2 = this.J;
                View contentView = this.I.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property, 0.1f);
                View contentView2 = this.I.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property2, 0.1f);
                View contentView3 = this.I.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.K, (Property<org.telegram.ui.Components.tq, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.K, (Property<org.telegram.ui.Components.tq, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.K, (Property<org.telegram.ui.Components.tq, Float>) property3, 1.0f));
            } else {
                this.I.getContentView().setVisibility(0);
                this.I.setEnabled(true);
                AnimatorSet animatorSet3 = this.J;
                org.telegram.ui.Components.tq tqVar = this.K;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tqVar, (Property<org.telegram.ui.Components.tq, Float>) property4, 0.1f);
                org.telegram.ui.Components.tq tqVar2 = this.K;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tqVar2, (Property<org.telegram.ui.Components.tq, Float>) property5, 0.1f);
                org.telegram.ui.Components.tq tqVar3 = this.K;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(tqVar3, (Property<org.telegram.ui.Components.tq, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.I.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.I.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.I.getContentView(), (Property<View, Float>) property6, 1.0f));
            }
            this.J.addListener(new jm0(this, z10, i11));
            this.J.setDuration(150L);
            this.J.start();
            return;
        }
        if (this.L != null) {
            this.J = new AnimatorSet();
            if (z10) {
                this.M.setVisibility(0);
                this.N.setEnabled(false);
                AnimatorSet animatorSet4 = this.J;
                TextView textView = this.L;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property7, 0.1f);
                TextView textView2 = this.L;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property8, 0.1f);
                TextView textView3 = this.L;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.M, (Property<org.telegram.ui.Components.tq, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.M, (Property<org.telegram.ui.Components.tq, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.M, (Property<org.telegram.ui.Components.tq, Float>) property9, 1.0f));
            } else {
                this.L.setVisibility(0);
                this.N.setEnabled(true);
                AnimatorSet animatorSet5 = this.J;
                org.telegram.ui.Components.tq tqVar4 = this.M;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(tqVar4, (Property<org.telegram.ui.Components.tq, Float>) property10, 0.1f);
                org.telegram.ui.Components.tq tqVar5 = this.M;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(tqVar5, (Property<org.telegram.ui.Components.tq, Float>) property11, 0.1f);
                org.telegram.ui.Components.tq tqVar6 = this.M;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(tqVar6, (Property<org.telegram.ui.Components.tq, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.L, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.L, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.L, (Property<TextView, Float>) property12, 1.0f));
            }
            this.J.addListener(new jm0(this, z10, i10));
            this.J.setDuration(150L);
            this.J.start();
        }
    }

    public final void O1(boolean z4, String str, Runnable runnable, tm0 tm0Var, vm0 vm0Var) {
        boolean z10;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        boolean z11 = (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0) ? false : true;
        if (getParentActivity() == null || Build.VERSION.SDK_INT < 23 || !z11) {
            z10 = true;
        } else {
            z10 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (z4) {
                this.J1.clear();
                if (!z10) {
                    this.J1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.J1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.Q = string;
                        this.I1 = showDialog(d2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.J1.toArray(new String[0]), 6);
                    }
                    this.B1 = str;
                    this.D1 = tm0Var;
                    this.C1 = runnable;
                    this.E1 = vm0Var;
                    return;
                }
            }
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        tL_codeSettings.allow_flashcall = z11 && z10;
        tL_codeSettings.allow_app_hash = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).commit();
        } else {
            sharedPreferences.edit().remove("sms_hash").commit();
        }
        if (sendverifyphonecode.settings.allow_flashcall) {
            try {
                String line1Number = telephonyManager.getLine1Number();
                if (TextUtils.isEmpty(line1Number)) {
                    TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                    tL_codeSettings2.unknown_number = true;
                    tL_codeSettings2.current_number = false;
                } else {
                    sendverifyphonecode.settings.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                    if (!tL_codeSettings3.current_number) {
                        tL_codeSettings3.allow_flashcall = false;
                    }
                }
            } catch (Exception e6) {
                sendverifyphonecode.settings.allow_flashcall = false;
                FileLog.e(e6);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new lh.b1(this, str, vm0Var, sendverifyphonecode, 12), 2);
    }

    public final void P1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.C;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(q1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportPersonal));
        }
        S1(2);
        S1(3);
        S1(1);
        S1(4);
    }

    public final void Q1() {
        if (this.y.values.isEmpty()) {
            this.x0.setVisibility(0);
            this.i0.setVisibility(8);
            this.g0.setVisibility(8);
            this.u0.setVisibility(8);
            this.v0.setVisibility(8);
            this.w0.setVisibility(8);
            return;
        }
        this.x0.setVisibility(8);
        this.i0.setVisibility(0);
        this.g0.setVisibility(0);
        this.v0.setVisibility(0);
        this.w0.setVisibility(0);
        if (s1(TLRPC.TL_secureValueTypePhone.class) || s1(TLRPC.TL_secureValueTypeEmail.class) || s1(TLRPC.TL_secureValueTypePersonalDetails.class) || s1(TLRPC.TL_secureValueTypePassport.class) || s1(TLRPC.TL_secureValueTypeInternalPassport.class) || s1(TLRPC.TL_secureValueTypeIdentityCard.class) || s1(TLRPC.TL_secureValueTypeDriverLicense.class) || s1(TLRPC.TL_secureValueTypeAddress.class) || s1(TLRPC.TL_secureValueTypeUtilityBill.class) || s1(TLRPC.TL_secureValueTypePassportRegistration.class) || s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) || s1(TLRPC.TL_secureValueTypeBankStatement.class) || s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.u0.setVisibility(0);
        } else {
            this.u0.setVisibility(8);
        }
    }

    public final void R0(final SecureDocument secureDocument, final int i10) {
        String string;
        final String str;
        String formatDateForBan;
        HashMap hashMap;
        if (i10 == 1) {
            this.g1 = secureDocument;
            if (this.d0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.h1.add(secureDocument);
            if (this.e0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.i1 = secureDocument;
            if (this.b0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.j1 = secureDocument;
            if (this.c0 == null) {
                return;
            }
        } else {
            this.f1.add(secureDocument);
            if (this.a0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final dn0 dn0Var = new dn0(this, getParentActivity());
        dn0Var.setTag(secureDocument);
        dn0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        this.k1.put(secureDocument, dn0Var);
        String n12 = n1(secureDocument);
        if (i10 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.d0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "selfie" + n12;
        } else if (i10 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.e0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "translation" + n12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.C.type;
            string = ((secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) ? LocaleController.getString(R.string.PassportMainPage) : LocaleController.getString(R.string.PassportFrontSide);
            this.b0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "front" + n12;
        } else if (i10 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.c0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "reverse" + n12;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.a0.addView(dn0Var, k7.c6.n(-1, -2));
            str = "files" + n12;
        }
        if (str == null || (hashMap = this.u1) == null || (formatDateForBan = (String) hashMap.get(str)) == null) {
            formatDateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        } else {
            dn0Var.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
            this.v1.put(str, "");
        }
        dn0Var.a.setText(string);
        dn0Var.b.setText(formatDateForBan);
        org.telegram.ui.Components.p9 p9Var = dn0Var.c;
        p9Var.getClass();
        p9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        dn0Var.f = secureDocument;
        dn0Var.a(false);
        dn0Var.setOnClickListener(new mh.x0(this, i10, 17));
        dn0Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.ul0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                fn0 fn0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fn0Var.getParentActivity());
                int i11 = i10;
                if (i11 == 1) {
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new eg.j3(fn0Var, secureDocument, i11, dn0Var, str, 6));
                fn0Var.showDialog(alertDialog$Builder.a);
                return true;
            }
        });
    }

    public final void R1() {
        ImageView imageView = this.F0;
        if (imageView == null) {
            return;
        }
        TL_account.Password password = this.G;
        if (password == null || this.K0 != 0) {
            imageView.setVisibility(8);
            this.G0.setVisibility(8);
            this.H0.setVisibility(8);
            this.I0.setVisibility(8);
            this.W[0].setVisibility(8);
            this.I.setVisibility(8);
            this.J0.setVisibility(8);
            this.E0.setVisibility(8);
            this.D0.setVisibility(8);
            this.C0.setVisibility(0);
            return;
        }
        if (!password.has_password) {
            this.D0.setVisibility(0);
            this.F0.setVisibility(0);
            this.G0.setVisibility(0);
            this.H0.setVisibility(0);
            this.I0.setVisibility(8);
            this.W[0].setVisibility(8);
            this.I.setVisibility(8);
            this.J0.setVisibility(8);
            this.E0.setVisibility(8);
            this.D0.setLayoutParams(k7.c6.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
            this.C0.setVisibility(8);
            return;
        }
        this.D0.setVisibility(0);
        this.F0.setVisibility(8);
        this.G0.setVisibility(8);
        this.H0.setVisibility(8);
        this.C0.setVisibility(8);
        this.I0.setVisibility(0);
        this.W[0].setVisibility(0);
        this.I.setVisibility(0);
        this.J0.setVisibility(0);
        this.E0.setVisibility(0);
        this.D0.setLayoutParams(k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        if (this.V != null) {
            TL_account.Password password2 = this.G;
            if (password2 == null || TextUtils.isEmpty(password2.hint)) {
                this.V[0].setHint(LocaleController.getString(R.string.LoginPassword));
            } else {
                this.V[0].setHint(this.G.hint);
            }
        }
    }

    public final void S0(TLRPC.TL_secureFile tL_secureFile, int i10) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] computeSHA512 = Utilities.computeSHA512(i1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr4, 0, 16);
        R0(new SecureDocument(new SecureDocumentKey(bArr3, bArr4), tL_secureFile, null, null, null), i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_secureValueTypeDriverLicense) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1(int i10) {
        TLRPC.SecureValueType secureValueType;
        boolean z4 = true;
        if (i10 == 0) {
            if (this.O == null) {
                return;
            }
            if (this.f1.size() >= 1) {
                this.O.b(LocaleController.getString(R.string.PassportUploadAdditinalDocument), false);
                return;
            } else {
                this.O.b(LocaleController.getString(R.string.PassportUploadDocument), false);
                return;
            }
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.z8 z8Var = this.T;
            if (z8Var == null) {
                return;
            }
            z8Var.setVisibility(this.g1 != null ? 8 : 0);
            return;
        }
        if (i10 == 4) {
            if (this.U == null) {
                return;
            }
            if (this.h1.size() >= 1) {
                this.U.b(LocaleController.getString(R.string.PassportUploadAdditinalDocument), false);
                return;
            } else {
                this.U.b(LocaleController.getString(R.string.PassportUploadDocument), false);
                return;
            }
        }
        if (i10 != 2) {
            if (i10 != 3 || this.S == null) {
                return;
            }
            TLRPC.SecureValueType secureValueType2 = this.C.type;
            if ((secureValueType2 instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                this.c0.setVisibility(0);
                this.S.setVisibility(this.j1 != null ? 8 : 0);
                return;
            } else {
                this.c0.setVisibility(8);
                this.S.setVisibility(8);
                return;
            }
        }
        org.telegram.ui.Cells.z8 z8Var2 = this.R;
        if (z8Var2 == null) {
            return;
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.C;
        if (tL_secureRequiredType != null) {
            if (!tL_secureRequiredType.selfie_required) {
                TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
                if (!(secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                }
            }
            secureValueType = tL_secureRequiredType.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                z8Var2.a(LocaleController.getString(R.string.PassportMainPage), LocaleController.getString(R.string.PassportMainPageInfo), z4);
            } else {
                z8Var2.a(LocaleController.getString(R.string.PassportFrontSide), LocaleController.getString(R.string.PassportFrontSideInfo), z4);
            }
            this.R.setVisibility(this.i1 != null ? 8 : 0);
        }
        z4 = false;
        secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
        }
        z8Var2.a(LocaleController.getString(R.string.PassportMainPage), LocaleController.getString(R.string.PassportMainPageInfo), z4);
        this.R.setVisibility(this.i1 != null ? 8 : 0);
    }

    public final void T0(ArrayList arrayList) {
        this.f1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final en0 U0(Context context, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z4, boolean z10) {
        String str;
        String str2;
        String str3;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        String str4;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        String str5;
        TLRPC.TL_secureValue r12;
        int size = arrayList != null ? arrayList.size() : 0;
        en0 en0Var = new en0(context);
        int i10 = this.b;
        int i11 = i10 == 8 ? 21 : 51;
        TextView textView = new TextView(context);
        en0Var.a = textView;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = null;
        b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z11 = LocaleController.isRTL;
        en0Var.addView(textView, k7.c6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? i11 : 21, 10.0f, z11 ? 21 : i11, 0.0f));
        TextView textView2 = new TextView(context);
        en0Var.b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.z6, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z12 = LocaleController.isRTL;
        int i12 = (z12 ? 5 : 3) | 48;
        float f10 = z12 ? i11 : 21;
        if (z12) {
            i11 = 21;
        }
        en0Var.addView(textView2, k7.c6.d(-2, -2.0f, i12, f10, 35.0f, i11, 0.0f));
        ImageView imageView = new ImageView(context);
        en0Var.c = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Mh, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageResource(R.drawable.sticker_added);
        en0Var.addView(imageView, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        en0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            en0Var.a((arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.PassportPersonalDetails) : (z4 && arrayList.size() == 1) ? q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type) : (z4 && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), q1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : LocaleController.getString(R.string.PassportIdentityDocument), !z10);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            en0Var.a((arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.PassportAddress) : (z4 && arrayList.size() == 1) ? q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type) : (z4 && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), q1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : LocaleController.getString(R.string.PassportResidentialAddress), !z10);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            en0Var.a(LocaleController.getString(R.string.PassportPhone), !z10);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            en0Var.a(LocaleController.getString(R.string.PassportEmail), !z10);
        }
        if (i10 == 8) {
            this.Z.addView(en0Var, r9.getChildCount() - 5, k7.c6.n(-1, -2));
        } else {
            this.Z.addView(en0Var, k7.c6.n(-1, -2));
        }
        en0Var.setOnClickListener(new fg.d1(arrayList, tL_secureRequiredType, this, z4));
        this.n1.put(tL_secureRequiredType, en0Var);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.m1;
        hashMap2.put(tL_secureRequiredType, hashMap);
        TLRPC.TL_secureValue r13 = r1(tL_secureRequiredType, false);
        if (r13 != null) {
            TLRPC.SecurePlainData securePlainData = r13.plain_data;
            if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                str = ((TLRPC.TL_securePlainEmail) securePlainData).email;
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                str = ((TLRPC.TL_securePlainPhone) securePlainData).phone;
            } else {
                TLRPC.TL_secureData tL_secureData = r13.data;
                if (tL_secureData != null) {
                    str2 = h1(tL_secureData.data, i1(tL_secureData.secret, tL_secureData.data_hash), r13.data.data_hash);
                    str = null;
                    if (arrayList != null || arrayList.isEmpty()) {
                        str3 = str;
                        tL_secureRequiredType2 = tL_secureRequiredType;
                        str4 = str2;
                        tL_secureRequiredType3 = null;
                        str5 = null;
                    } else {
                        int size2 = arrayList.size();
                        String str6 = null;
                        int i13 = 0;
                        boolean z13 = false;
                        while (i13 < size2) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList.get(i13);
                            hashMap2.put(tL_secureRequiredType5, new HashMap());
                            this.o1.put(tL_secureRequiredType5, tL_secureRequiredType);
                            String str7 = str;
                            if (!z13 && (r12 = r1(tL_secureRequiredType5, false)) != null) {
                                TLRPC.TL_secureData tL_secureData2 = r12.data;
                                if (tL_secureData2 != null) {
                                    str6 = h1(tL_secureData2.data, i1(tL_secureData2.secret, tL_secureData2.data_hash), r12.data.data_hash);
                                }
                                tL_secureRequiredType4 = tL_secureRequiredType5;
                                z13 = true;
                            }
                            i13++;
                            str = str7;
                        }
                        str3 = str;
                        if (tL_secureRequiredType4 == null) {
                            tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) arrayList.get(0);
                        }
                        tL_secureRequiredType2 = tL_secureRequiredType;
                        str4 = str2;
                        str5 = str6;
                        tL_secureRequiredType3 = tL_secureRequiredType4;
                    }
                    L1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z4, size);
                    return en0Var;
                }
            }
            str2 = null;
            if (arrayList != null) {
            }
            str3 = str;
            tL_secureRequiredType2 = tL_secureRequiredType;
            str4 = str2;
            tL_secureRequiredType3 = null;
            str5 = null;
            L1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z4, size);
            return en0Var;
        }
        str = null;
        str2 = null;
        if (arrayList != null) {
        }
        str3 = str;
        tL_secureRequiredType2 = tL_secureRequiredType;
        str4 = str2;
        tL_secureRequiredType3 = null;
        str5 = null;
        L1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z4, size);
        return en0Var;
    }

    public final void V0(ArrayList arrayList) {
        this.h1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void W0(boolean z4) {
        if (this.d1) {
            return;
        }
        String str = this.n;
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = this.b;
        if (isEmpty) {
            if (this.z1) {
                if (z4 || (!this.c1 && (i10 == 5 || i10 == 0))) {
                    getParentActivity().setResult(z4 ? -1 : 0);
                }
                this.d1 = true;
                return;
            }
            return;
        }
        if (z4) {
            af.g.p(getParentActivity(), Uri.parse(str + "&tg_passport=success"), true, true);
        } else if (!this.c1 && (i10 == 5 || i10 == 0)) {
            af.g.p(getParentActivity(), Uri.parse(str + "&tg_passport=cancel"), true, true);
        }
        this.d1 = true;
    }

    public final boolean X0(boolean z4) {
        if (u1()) {
            return false;
        }
        if (!z4) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new sl0(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.a.O = LocaleController.getString(R.string.DiscardChanges);
        String string = LocaleController.getString(R.string.PassportDiscardChanges);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.Q = string;
        showDialog(d2Var);
        return true;
    }

    public final void Y0(boolean z4) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.X == null) {
            return;
        }
        String str = (String) this.V0.get(this.v);
        String str2 = SharedConfig.getCountryLangs().get(this.v);
        int i10 = 0;
        if (!this.B.native_names || TextUtils.isEmpty(this.v) || "EN".equals(str2)) {
            if (this.n0.getVisibility() != 8) {
                this.n0.setVisibility(8);
                this.g0.setVisibility(8);
                this.Q.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.X;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.c == 0 && this.C != null) || this.E == null || this.s0) && this.F == null) {
                    this.j0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                    return;
                } else {
                    this.j0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
                    return;
                }
            }
            return;
        }
        int i11 = 2;
        if (this.n0.getVisibility() != 0) {
            this.n0.setVisibility(0);
            this.g0.setVisibility(0);
            this.Q.setVisibility(0);
            int i12 = 0;
            while (true) {
                editTextBoldCursorArr = this.X;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                ((View) editTextBoldCursorArr[i12].getParent()).setVisibility(0);
                i12++;
            }
            if (editTextBoldCursorArr[0].length() == 0 && this.X[1].length() == 0 && this.X[2].length() == 0) {
                int i13 = 0;
                while (true) {
                    boolean[] zArr = this.q0;
                    if (i13 >= zArr.length) {
                        break;
                    }
                    if (zArr[i13]) {
                        this.X[0].setText(this.V[0].getText());
                        this.X[1].setText(this.V[1].getText());
                        this.X[2].setText(this.V[2].getText());
                        break;
                    }
                    i13++;
                }
            }
            this.j0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
        }
        this.n0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str));
        String serverString = str2 != null ? LocaleController.getServerString("PassportLanguage_".concat(str2)) : null;
        if (serverString != null) {
            this.g0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, serverString));
        } else {
            this.g0.setText(LocaleController.getString(R.string.PassportNativeHeader));
        }
        for (int i14 = 0; i14 < 3; i14++) {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        if (serverString != null) {
                            this.X[i14].setHintText(LocaleController.getString(R.string.PassportSurname));
                        } else {
                            this.X[i14].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str));
                        }
                    }
                } else if (serverString != null) {
                    this.X[i14].setHintText(LocaleController.getString(R.string.PassportMidname));
                } else {
                    this.X[i14].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str));
                }
            } else if (serverString != null) {
                this.X[i14].setHintText(LocaleController.getString(R.string.PassportName));
            } else {
                this.X[i14].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str));
            }
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new pl0(this, i11));
        }
    }

    public final void a1(boolean z4) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.m0 == null) {
            return;
        }
        HashMap hashMap = this.t1;
        HashMap hashMap2 = this.v1;
        if (hashMap == null || (!(z4 || hashMap2.containsKey("error_all")) || (str2 = (String) this.t1.get("error_all")) == null)) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str2);
            if (z4) {
                hashMap2.put("error_all", "");
            }
        }
        if (this.u1 != null && ((z4 || hashMap2.containsKey("error_document_all")) && (str = (String) this.u1.get("error_all")) != null)) {
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
            }
            if (z4) {
                hashMap2.put("error_document_all", "");
            }
        }
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false)), 0, spannableStringBuilder.length(), 33);
            this.m0.setText(spannableStringBuilder);
            this.m0.setVisibility(0);
        } else if (this.m0.getVisibility() != 8) {
            this.m0.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(Context context) {
        long j10;
        String str;
        this.V0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.V0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.m0 = a9Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.k6.b7;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i10, i11));
        int i12 = 0;
        this.m0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.Z.addView(this.m0, k7.c6.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.C;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentRentalAgreement));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentBankStatement));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentUtilityBill));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentPassportRegistration));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ActionBotDocumentTemporaryRegistration));
            }
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            this.g0 = m4Var;
            m4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.m4 m4Var2 = this.g0;
            int i13 = org.telegram.ui.ActionBar.k6.d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            this.Z.addView(this.g0, k7.c6.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.a0 = linearLayout;
            linearLayout.setOrientation(1);
            this.Z.addView(this.a0, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.O = aaVar;
            aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.Z.addView(this.O, k7.c6.n(-1, -2));
            this.O.setOnClickListener(new ql0(this, 7));
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            this.k0 = a9Var2;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i11));
            if (this.c != 0) {
                this.w1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.C.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.w1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.w1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.w1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.w1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.w1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.w1 = "";
                }
            }
            String str2 = this.w1;
            HashMap hashMap = this.u1;
            j10 = 0;
            HashMap hashMap2 = this.v1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.w1);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false)), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.k0.setText(str3);
            this.Z.addView(this.k0, k7.c6.n(-1, -2));
            if (this.C.translation_required) {
                org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
                this.g0 = m4Var3;
                m4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                this.Z.addView(this.g0, k7.c6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.e0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.Z.addView(this.e0, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.aa aaVar2 = new org.telegram.ui.Cells.aa(context);
                this.U = aaVar2;
                aaVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.Z.addView(this.U, k7.c6.n(-1, -2));
                this.U.setOnClickListener(new ql0(this, 8));
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                this.l0 = a9Var3;
                a9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i11));
                if (this.c != 0) {
                    this.x1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.C.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.x1 = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.x1 = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.x1 = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.x1 = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.x1 = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.x1 = "";
                    }
                }
                String str5 = this.x1;
                HashMap hashMap3 = this.u1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.x1);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false)), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.l0.setText(str6);
                this.Z.addView(this.l0, k7.c6.n(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
        this.g0 = m4Var4;
        m4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        this.g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        this.Z.addView(this.g0, k7.c6.n(-1, -2));
        this.V = new EditTextBoldCursor[6];
        int i14 = 0;
        while (true) {
            int i15 = 4;
            if (i14 >= 6) {
                break;
            }
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.V[i14] = editTextBoldCursor;
            zl0 zl0Var = new zl0(context, editTextBoldCursor, i12);
            zl0Var.setWillNotDraw(false);
            this.Z.addView(zl0Var, k7.c6.n(-1, -2));
            int i16 = org.telegram.ui.ActionBar.k6.d6;
            zl0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            if (i14 == 5) {
                View view = new View(context);
                this.P = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                this.Z.addView(this.P, k7.c6.n(-1, 6));
            }
            if (this.s0 && this.C != null) {
                zl0Var.setVisibility(8);
                View view2 = this.P;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.V[i14].setTag(Integer.valueOf(i14));
            this.V[i14].setSupportRtlHint(true);
            this.V[i14].setTextSize(1, 16.0f);
            this.V[i14].setHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            this.V[i14].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L6, false));
            this.V[i14].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.V[i14];
            int i17 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
            this.V[i14].setBackgroundDrawable(null);
            this.V[i14].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
            this.V[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.V[i14].setCursorWidth(1.5f);
            this.V[i14].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
            if (i14 == 5) {
                this.V[i14].setOnTouchListener(new rl0(this, 2));
                this.V[i14].setInputType(0);
                this.V[i14].setFocusable(false);
            } else {
                this.V[i14].setInputType(16385);
                this.V[i14].setImeOptions(268435461);
            }
            if (i14 == 0) {
                this.V[i14].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            } else if (i14 == 1) {
                this.V[i14].setHintText(LocaleController.getString(R.string.PassportStreet2));
                str = "street_line2";
            } else if (i14 == 2) {
                this.V[i14].setHintText(LocaleController.getString(R.string.PassportPostcode));
                str = "post_code";
            } else if (i14 == 3) {
                this.V[i14].setHintText(LocaleController.getString(R.string.PassportCity));
                str = "city";
            } else if (i14 == 4) {
                this.V[i14].setHintText(LocaleController.getString(R.string.PassportState));
                str = "state";
            } else if (i14 != 5) {
                i14++;
            } else {
                this.V[i14].setHintText(LocaleController.getString(R.string.PassportCountry));
                str = "country_code";
            }
            J1(this.p1, this.V[i14], str);
            if (i14 == 2) {
                this.V[i14].addTextChangedListener(new am0(this, editTextBoldCursor, str));
                this.V[i14].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.V[i14].addTextChangedListener(new bm0(this, editTextBoldCursor, str, i12));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.V[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.V[i14].setPadding(0, 0, 0, 0);
            this.V[i14].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            zl0Var.addView(this.V[i14], k7.c6.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.V[i14].setOnEditorActionListener(new ol0(this, i15));
            i14++;
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        this.i0 = z6Var;
        this.Z.addView(z6Var, k7.c6.n(-1, -2));
        if (this.s0 && this.C != null) {
            this.g0.setVisibility(8);
            this.i0.setVisibility(8);
        }
        long j11 = this.c;
        TLRPC.TL_secureValue tL_secureValue = this.F;
        if (((j11 == j10 && this.C != null) || this.E == null || this.s0) && tL_secureValue == null) {
            org.telegram.ui.Cells.z6 z6Var2 = this.i0;
            int i18 = R.drawable.greydivider_bottom;
            int i19 = org.telegram.ui.ActionBar.k6.b7;
            z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i18, i19));
            if (this.s0 && this.C != null) {
                this.k0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i19));
            }
        } else {
            if (tL_secureValue != null) {
                T0(tL_secureValue.files);
                V0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.z6 z6Var3 = this.i0;
            int i20 = R.drawable.greydivider;
            int i21 = org.telegram.ui.ActionBar.k6.b7;
            z6Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i20, i21));
            org.telegram.ui.Cells.aa aaVar3 = new org.telegram.ui.Cells.aa(context);
            aaVar3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
            aaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            if (this.C == null) {
                aaVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                aaVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.Z.addView(aaVar3, k7.c6.n(-1, -2));
            aaVar3.setOnClickListener(new ql0(this, 9));
            org.telegram.ui.Cells.z6 z6Var4 = new org.telegram.ui.Cells.z6(context, (b) null);
            this.i0 = z6Var4;
            z6Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i21));
            this.Z.addView(this.i0, k7.c6.n(-1, -2));
        }
        S1(0);
        S1(4);
    }

    public final void c1() {
        if (getParentActivity() != null && this.O0 == null) {
            org.telegram.ui.Components.mi miVar = new org.telegram.ui.Components.mi(getParentActivity(), this, false, false);
            this.O0 = miVar;
            miVar.W1 = new km0(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a88  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        int i11;
        TLRPC.User user;
        boolean z4;
        ArrayList arrayList;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        boolean z10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.User currentUser;
        org.telegram.ui.Components.mi miVar;
        Context context2 = context;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new nm0(this));
        int i12 = 2;
        int i13 = this.b;
        if (i13 == 7) {
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(this, context2, r4);
            this.Y = x1Var;
            this.fragmentView = x1Var;
            x1Var.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.Y, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.s8, false));
        } else {
            FrameLayout frameLayout = new FrameLayout(context2);
            this.fragmentView = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
            lh.k3 k3Var = new lh.k3(context2, i12);
            this.Y = k3Var;
            k3Var.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.Y, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.s8, false));
            frameLayout.addView(this.Y, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context2);
            this.Z = linearLayout;
            linearLayout.setOrientation(1);
            this.Y.addView(this.Z, new FrameLayout.LayoutParams(-1, -2));
        }
        if (i13 != 0 && i13 != 8) {
            this.I = this.actionBar.n().h(2, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.tq tqVar = new org.telegram.ui.Components.tq(context2, 1);
            this.K = tqVar;
            tqVar.setAlpha(0.0f);
            this.K.setScaleX(0.1f);
            this.K.setScaleY(0.1f);
            this.K.setVisibility(4);
            this.I.addView(this.K, k7.c6.c(-1.0f, -1));
            if ((i13 == 1 || i13 == 2) && (miVar = this.O0) != null) {
                try {
                    if (miVar.isShowing()) {
                        this.O0.dismiss();
                    }
                } catch (Exception unused) {
                }
                this.O0.v1();
                this.O0 = null;
            }
        }
        if (i13 == 5) {
            if (this.y != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= this.y.users.size()) {
                        currentUser = null;
                        break;
                    }
                    TLRPC.User user2 = this.y.users.get(i14);
                    int i15 = i14;
                    if (user2.id == this.c) {
                        currentUser = user2;
                        break;
                    }
                    i14 = i15 + 1;
                }
            } else {
                currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            }
            FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
            org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context2, null);
            this.C0 = ozVar;
            ozVar.b();
            frameLayout2.addView(this.C0, k7.c6.c(-1.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context2);
            this.I0 = frameLayout3;
            this.Z.addView(frameLayout3, k7.c6.n(-1, 100));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
            p9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            this.I0.addView(p9Var, k7.c6.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            p9Var.e(currentUser, new org.telegram.ui.Components.z8(0, currentUser));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context2);
            this.D0 = a9Var;
            a9Var.getTextView().setGravity(1);
            if (this.c == 0) {
                this.D0.setText(LocaleController.getString(R.string.PassportSelfRequest));
            } else {
                this.D0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", R.string.PassportRequest, UserObject.getFirstName(currentUser))));
            }
            ((FrameLayout.LayoutParams) this.D0.getTextView().getLayoutParams()).gravity = 1;
            this.Z.addView(this.D0, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
            ImageView imageView = new ImageView(context2);
            this.F0 = imageView;
            imageView.setImageResource(R.drawable.no_password);
            this.F0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Xd, false), PorterDuff.Mode.MULTIPLY));
            this.Z.addView(this.F0, k7.c6.t(-2, -2, 49, 0, 13, 0, 0));
            TextView textView = new TextView(context2);
            this.G0 = textView;
            textView.setTextSize(1, 14.0f);
            this.G0.setGravity(1);
            this.G0.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(17.0f));
            this.G0.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
            this.G0.setText(LocaleController.getString(R.string.TelegramPassportCreatePasswordInfo));
            this.Z.addView(this.G0, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(context2);
            this.H0 = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.r6, false));
            this.H0.setGravity(17);
            this.H0.setTextSize(1, 16.0f);
            this.H0.setTypeface(AndroidUtilities.bold());
            this.H0.setText(LocaleController.getString(R.string.TelegramPassportCreatePassword));
            this.Z.addView(this.H0, k7.c6.d(-1, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
            this.H0.setOnClickListener(new ql0(this, 10));
            this.V = new EditTextBoldCursor[1];
            this.W = new ViewGroup[]{new FrameLayout(context2)};
            this.Z.addView(this.W[0], k7.c6.n(-1, 50));
            this.W[0].setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            this.V[0] = new EditTextBoldCursor(context2);
            this.V[0].setTag(0);
            this.V[0].setTextSize(1, 16.0f);
            this.V[0].setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.V[0];
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            this.V[0].setBackgroundDrawable(null);
            this.V[0].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
            this.V[0].setCursorSize(AndroidUtilities.dp(20.0f));
            this.V[0].setCursorWidth(1.5f);
            this.V[0].setInputType(129);
            this.V[0].setMaxLines(1);
            this.V[0].setLines(1);
            this.V[0].setSingleLine(true);
            this.V[0].setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.V[0].setTypeface(Typeface.DEFAULT);
            this.V[0].setImeOptions(268435462);
            this.V[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            this.V[0].setGravity(LocaleController.isRTL ? 5 : 3);
            this.W[0].addView(this.V[0], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.V[0].setOnEditorActionListener(new ol0(this, 5));
            this.V[0].setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(3));
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context2);
            this.E0 = a9Var2;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
            this.E0.setText(LocaleController.formatString("PassportRequestPasswordInfo", R.string.PassportRequestPasswordInfo, new Object[0]));
            this.Z.addView(this.E0, k7.c6.n(-1, -2));
            TextView textView3 = new TextView(context2);
            this.J0 = textView3;
            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false));
            this.J0.setTextSize(1, 14.0f);
            this.J0.setText(LocaleController.getString(R.string.ForgotPassword));
            this.J0.setPadding(0, 0, 0, 0);
            this.Z.addView(this.J0, k7.c6.t(-2, 30, (LocaleController.isRTL ? 5 : 3) | 48, 21, 0, 21, 0));
            this.J0.setOnClickListener(new ql0(this, 11));
            R1();
        } else if (i13 == 0) {
            if (this.y != null) {
                for (int i17 = 0; i17 < this.y.users.size(); i17++) {
                    TLRPC.User user3 = this.y.users.get(i17);
                    if (user3.id == this.c) {
                        user = user3;
                        break;
                    }
                }
            }
            user = null;
            FrameLayout frameLayout4 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
            this.actionBar.n().a(1, R.drawable.msg_info);
            if (user != null) {
                FrameLayout frameLayout5 = new FrameLayout(context2);
                this.Z.addView(frameLayout5, k7.c6.n(-1, 100));
                org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context2);
                p9Var2.setRoundRadius(AndroidUtilities.dp(32.0f));
                frameLayout5.addView(p9Var2, k7.c6.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
                p9Var2.e(user, new org.telegram.ui.Components.z8(0, user));
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context2);
                this.k0 = a9Var3;
                a9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.b7));
                this.k0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", R.string.PassportRequest, UserObject.getFirstName(user))));
                this.k0.getTextView().setGravity(1);
                ((FrameLayout.LayoutParams) this.k0.getTextView().getLayoutParams()).gravity = 1;
                this.Z.addView(this.k0, k7.c6.n(-1, -2));
            }
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2);
            this.g0 = m4Var;
            m4Var.setText(LocaleController.getString(R.string.PassportRequestedInformation));
            this.g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            this.Z.addView(this.g0, k7.c6.n(-1, -2));
            TL_account.authorizationForm authorizationform = this.y;
            if (authorizationform != null) {
                int size = authorizationform.required_types.size();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                boolean z11 = false;
                int i18 = 0;
                boolean z12 = false;
                int i19 = 0;
                for (int i20 = 0; i20 < size; i20++) {
                    TLRPC.SecureRequiredType secureRequiredType = this.y.required_types.get(i20);
                    if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                        if (v1(tL_secureRequiredType3.type)) {
                            arrayList4.add(tL_secureRequiredType3);
                            i18++;
                        } else if (t1(tL_secureRequiredType3.type)) {
                            arrayList5.add(tL_secureRequiredType3);
                            i19++;
                        } else {
                            TLRPC.SecureValueType secureValueType = tL_secureRequiredType3.type;
                            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                z11 = true;
                            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                z12 = true;
                            }
                        }
                    } else if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                        if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                            if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                                if (v1(tL_secureRequiredType4.type)) {
                                    int size2 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i21 = 0; i21 < size2; i21++) {
                                        TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i21);
                                        if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                        }
                                    }
                                    i18++;
                                } else if (t1(tL_secureRequiredType4.type)) {
                                    int size3 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i22 = 0; i22 < size3; i22++) {
                                        TLRPC.SecureRequiredType secureRequiredType4 = tL_secureRequiredTypeOneOf.types.get(i22);
                                        if (secureRequiredType4 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList5.add((TLRPC.TL_secureRequiredType) secureRequiredType4);
                                        }
                                    }
                                    i19++;
                                }
                            }
                        }
                    }
                }
                boolean z13 = !z11 || i18 > 1;
                boolean z14 = !z12 || i19 > 1;
                int i23 = 0;
                while (i23 < size) {
                    TLRPC.SecureRequiredType secureRequiredType5 = this.y.required_types.get(i23);
                    if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType5;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType5.type;
                        if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) {
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                            arrayList = null;
                            z10 = false;
                        } else {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                if (!z13) {
                                    arrayList3 = arrayList4;
                                    arrayList = arrayList3;
                                    z10 = false;
                                }
                                arrayList3 = null;
                                arrayList = arrayList3;
                                z10 = false;
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (!z14) {
                                    arrayList3 = arrayList5;
                                    arrayList = arrayList3;
                                    z10 = false;
                                }
                                arrayList3 = null;
                                arrayList = arrayList3;
                                z10 = false;
                            } else {
                                if (z13 && v1(secureValueType2)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                } else if (z14 && t1(tL_secureRequiredType5.type)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypeAddress();
                                }
                                arrayList = arrayList2;
                                z10 = true;
                            }
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                        }
                        U0(context, tL_secureRequiredType2, arrayList, z10, i23 != size + (-1));
                    } else if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                        if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                            if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                if ((z13 && v1(tL_secureRequiredType6.type)) || (z14 && t1(tL_secureRequiredType6.type))) {
                                    arrayList = new ArrayList();
                                    int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                    for (int i24 = 0; i24 < size4; i24++) {
                                        TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i24);
                                        if (secureRequiredType7 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList.add((TLRPC.TL_secureRequiredType) secureRequiredType7);
                                        }
                                    }
                                    if (v1(tL_secureRequiredType6.type)) {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                    } else {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                                    }
                                    tL_secureRequiredType2 = tL_secureRequiredType;
                                    z10 = true;
                                    U0(context, tL_secureRequiredType2, arrayList, z10, i23 != size + (-1));
                                }
                            }
                        }
                    }
                    i23++;
                }
                context2 = context;
            }
            if (user != null) {
                org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context2);
                this.k0 = a9Var4;
                a9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                org.telegram.ui.Cells.a9 a9Var5 = this.k0;
                int i25 = org.telegram.ui.ActionBar.k6.B6;
                a9Var5.setLinkTextColorKey(i25);
                if (TextUtils.isEmpty(this.y.privacy_policy_url)) {
                    z4 = false;
                    this.k0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportNoPolicy", R.string.PassportNoPolicy, UserObject.getFirstName(user), user.username)));
                } else {
                    String formatString = LocaleController.formatString("PassportPolicy", R.string.PassportPolicy, UserObject.getFirstName(user), user.username);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                    int indexOf = formatString.indexOf(42);
                    int lastIndexOf = formatString.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        this.k0.getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new um0(this), indexOf, lastIndexOf - 1, 33);
                    }
                    this.k0.setText(spannableStringBuilder);
                    z4 = false;
                }
                this.k0.getTextView().setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, i25, z4));
                this.k0.getTextView().setGravity(1);
                this.Z.addView(this.k0, k7.c6.n(-1, -2));
            }
            FrameLayout frameLayout6 = new FrameLayout(context2);
            this.N = frameLayout6;
            frameLayout6.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.rh, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.sh, false)));
            frameLayout4.addView(this.N, k7.c6.e(-1, 48, 80));
            this.N.setOnClickListener(new ql0(this, 15));
            TextView textView4 = new TextView(context2);
            this.L = textView4;
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
            this.L.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
            this.L.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.th, false));
            this.L.setText(LocaleController.getString(R.string.PassportAuthorize));
            this.L.setTextSize(1, 14.0f);
            this.L.setGravity(17);
            this.L.setTypeface(AndroidUtilities.bold());
            this.N.addView(this.L, k7.c6.e(-2, -1, 17));
            org.telegram.ui.Components.tq tqVar2 = new org.telegram.ui.Components.tq(context2, 0);
            this.M = tqVar2;
            tqVar2.setVisibility(4);
            this.N.addView(this.M, k7.c6.c(-1.0f, -1));
            View view = new View(context2);
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            frameLayout4.addView(view, k7.c6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        } else if (i13 == 1) {
            e1(context);
            if (this.a == null) {
                this.a = m1();
            }
        } else if (i13 == 2) {
            b1(context);
            if (this.a == null) {
                this.a = m1();
            }
        } else if (i13 == 3) {
            g1(context);
        } else {
            int i26 = 6;
            if (i13 == 4) {
                this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                if (TextUtils.isEmpty(this.a1)) {
                    i10 = -1;
                } else {
                    org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context2);
                    aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false));
                    aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                    aaVar.b(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, this.a1), false);
                    this.Z.addView(aaVar, k7.c6.n(-1, -2));
                    aaVar.setOnClickListener(new ql0(this, i26));
                    org.telegram.ui.Cells.a9 a9Var6 = new org.telegram.ui.Cells.a9(context2);
                    this.k0 = a9Var6;
                    a9Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                    this.k0.setText(LocaleController.getString(R.string.PassportPhoneUseSameEmailInfo));
                    i10 = -1;
                    this.Z.addView(this.k0, k7.c6.n(-1, -2));
                }
                this.V = new EditTextBoldCursor[1];
                FrameLayout frameLayout7 = new FrameLayout(context2);
                this.Z.addView(frameLayout7, k7.c6.n(i10, 50));
                frameLayout7.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                this.V[0] = new EditTextBoldCursor(context2);
                this.V[0].setTag(0);
                this.V[0].setTextSize(1, 16.0f);
                this.V[0].setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
                EditTextBoldCursor editTextBoldCursor2 = this.V[0];
                int i27 = org.telegram.ui.ActionBar.k6.G6;
                editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i27, false));
                this.V[0].setBackgroundDrawable(null);
                this.V[0].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i27, false));
                this.V[0].setCursorSize(AndroidUtilities.dp(20.0f));
                this.V[0].setCursorWidth(1.5f);
                this.V[0].setInputType(33);
                this.V[0].setImeOptions(268435462);
                this.V[0].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                TLRPC.TL_secureValue tL_secureValue = this.E;
                if (tL_secureValue != null) {
                    TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
                    if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                        TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                        if (!TextUtils.isEmpty(tL_securePlainEmail.email)) {
                            i11 = 0;
                            this.V[0].setText(tL_securePlainEmail.email);
                            EditTextBoldCursor editTextBoldCursor3 = this.V[i11];
                            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                            this.V[i11].setPadding(i11, i11, i11, AndroidUtilities.dp(6.0f));
                            this.V[i11].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout7.addView(this.V[i11], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            this.V[i11].setOnEditorActionListener(new ol0(this, 3));
                            org.telegram.ui.Cells.a9 a9Var7 = new org.telegram.ui.Cells.a9(context2);
                            this.k0 = a9Var7;
                            a9Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                            this.k0.setText(LocaleController.getString(R.string.PassportEmailUploadInfo));
                            this.Z.addView(this.k0, k7.c6.n(-1, -2));
                        }
                    }
                }
                i11 = 0;
                EditTextBoldCursor editTextBoldCursor32 = this.V[i11];
                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                this.V[i11].setPadding(i11, i11, i11, AndroidUtilities.dp(6.0f));
                this.V[i11].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout7.addView(this.V[i11], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.V[i11].setOnEditorActionListener(new ol0(this, 3));
                org.telegram.ui.Cells.a9 a9Var72 = new org.telegram.ui.Cells.a9(context2);
                this.k0 = a9Var72;
                a9Var72.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                this.k0.setText(LocaleController.getString(R.string.PassportEmailUploadInfo));
                this.Z.addView(this.k0, k7.c6.n(-1, -2));
            } else {
                HashMap hashMap = this.p1;
                if (i13 == 6) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                    this.V = new EditTextBoldCursor[1];
                    FrameLayout frameLayout8 = new FrameLayout(context2);
                    this.Z.addView(frameLayout8, k7.c6.n(-1, 50));
                    frameLayout8.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    this.V[0] = new EditTextBoldCursor(context2);
                    this.V[0].setTag(0);
                    this.V[0].setTextSize(1, 16.0f);
                    this.V[0].setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
                    EditTextBoldCursor editTextBoldCursor4 = this.V[0];
                    int i28 = org.telegram.ui.ActionBar.k6.G6;
                    editTextBoldCursor4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i28, false));
                    this.V[0].setBackgroundDrawable(null);
                    this.V[0].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i28, false));
                    this.V[0].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.V[0].setCursorWidth(1.5f);
                    this.V[0].setInputType(3);
                    this.V[0].setImeOptions(268435462);
                    this.V[0].setHint(LocaleController.getString(R.string.PassportEmailCode));
                    EditTextBoldCursor editTextBoldCursor5 = this.V[0];
                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                    this.V[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.V[0].setGravity(LocaleController.isRTL ? 5 : 3);
                    frameLayout8.addView(this.V[0], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    this.V[0].setOnEditorActionListener(new ol0(this, i26));
                    this.V[0].addTextChangedListener(new n0(this, 12));
                    org.telegram.ui.Cells.a9 a9Var8 = new org.telegram.ui.Cells.a9(context2);
                    this.k0 = a9Var8;
                    a9Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                    this.k0.setText(LocaleController.formatString("PassportEmailVerifyInfo", R.string.PassportEmailVerifyInfo, hashMap.get("email")));
                    this.Z.addView(this.k0, k7.c6.n(-1, -2));
                } else if (i13 == 7) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
                    FrameLayout frameLayout9 = new FrameLayout(context2);
                    this.Y.addView(frameLayout9, k7.c6.x(-1, -2, 51));
                    for (int i29 = 0; i29 < 3; i29++) {
                        bn0 bn0Var = new bn0(this, context2, i29 + 2);
                        org.telegram.ui.Components.wv0[] wv0VarArr = this.G1;
                        wv0VarArr[i29] = bn0Var;
                        bn0Var.setVisibility(8);
                        frameLayout9.addView(wv0VarArr[i29], k7.c6.d(-1, -1.0f, 51, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 30.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", (String) hashMap.get("phone"));
                    l1(bundle, this.H, false);
                } else if (i13 == 8) {
                    f1(context);
                }
            }
        }
        return this.fragmentView;
    }

    public final void d1() {
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rs(29, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string;
        boolean z4 = this.s0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.B;
        if (z4 && this.C == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            d2Var.Q = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z4 && this.C == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            d2Var.Q = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            d2Var.Q = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.s0 && this.C != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
            z1Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                z1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                z1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
            }
            z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(z1Var, k7.c6.e(-1, 48, 51));
            z1Var.setOnClickListener(new o8(4, zArr));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(d2Var);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        dn0 dn0Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 != NotificationCenter.fileUploaded) {
            if (i10 != NotificationCenter.fileUploadFailed && i10 == NotificationCenter.twoStepPasswordChanged) {
                if (objArr == null || objArr.length <= 0) {
                    this.G = null;
                    w1();
                } else {
                    Object obj = objArr[7];
                    if (obj != null && (editTextBoldCursor = this.V[0]) != null) {
                        editTextBoldCursor.setText((String) obj);
                    }
                    if (objArr[6] == null) {
                        TL_account.TL_password tL_password = new TL_account.TL_password();
                        this.G = tL_password;
                        tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                        tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                        tL_password.secure_random = (byte[]) objArr[3];
                        tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                        TL_account.Password password = this.G;
                        password.hint = (String) objArr[5];
                        password.srp_id = -1L;
                        byte[] bArr = new byte[256];
                        password.srp_B = bArr;
                        Utilities.random.nextBytes(bArr);
                        EditTextBoldCursor editTextBoldCursor2 = this.V[0];
                        if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                            this.K0 = 2;
                        }
                    }
                }
                R1();
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        HashMap hashMap = this.l1;
        SecureDocument secureDocument = (SecureDocument) hashMap.get(str);
        if (secureDocument != null) {
            secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
            hashMap.remove(str);
            if (hashMap.isEmpty() && (w0Var = this.I) != null) {
                w0Var.setEnabled(true);
                this.I.setAlpha(1.0f);
            }
            HashMap hashMap2 = this.k1;
            if (hashMap2 != null && (dn0Var = (dn0) hashMap2.get(secureDocument)) != null) {
                dn0Var.a(true);
            }
            HashMap hashMap3 = this.v1;
            if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                hashMap3.remove("error_document_all");
                a1(false);
            }
            int i12 = secureDocument.type;
            if (i12 == 0) {
                if (this.k0 != null && !TextUtils.isEmpty(this.w1)) {
                    this.k0.setText(this.w1);
                }
                hashMap3.remove("files_all");
                return;
            }
            if (i12 == 4) {
                if (this.l0 != null && !TextUtils.isEmpty(this.x1)) {
                    this.l0.setText(this.x1);
                }
                hashMap3.remove("translation_all");
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.mi miVar = this.O0;
        if (miVar == null || this.visibleDialog != miVar) {
            super.dismissCurrentDialog();
            return;
        }
        miVar.g0.a0(false);
        this.O0.dismissInternal();
        this.O0.g0.d0(true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.O0 && super.dismissDialogOnPause(dialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05c0  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(Context context) {
        long j10;
        String str;
        String str2;
        this.V0 = new HashMap();
        ?? r42 = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.V0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.m0 = a9Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.k6.b7;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i10, i11));
        boolean z4 = false;
        this.m0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        int i12 = -1;
        this.Z.addView(this.m0, k7.c6.n(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.C;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.B;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            this.g0 = m4Var;
            if (this.s0) {
                m4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                m4Var.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.m4 m4Var2 = this.g0;
            int i13 = org.telegram.ui.ActionBar.k6.d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
            this.Z.addView(this.g0, k7.c6.n(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.b0 = linearLayout;
            linearLayout.setOrientation(1);
            this.Z.addView(this.b0, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            this.R = z8Var;
            z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.Z.addView(this.R, k7.c6.n(-1, -2));
            this.R.setOnClickListener(new ql0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.c0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.Z.addView(this.c0, k7.c6.n(-1, -2));
            boolean z10 = this.C.selfie_required;
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.S = z8Var2;
            z8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            j10 = 0;
            this.S.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z10);
            this.Z.addView(this.S, k7.c6.n(-1, -2));
            this.S.setOnClickListener(new ql0(this, 2));
            if (this.C.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.d0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.Z.addView(this.d0, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                this.T = z8Var3;
                z8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.T.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType2.translation_required);
                this.Z.addView(this.T, k7.c6.n(-1, -2));
                this.T.setOnClickListener(new ql0(this, 3));
            }
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            this.k0 = a9Var2;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i11));
            this.k0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.Z.addView(this.k0, k7.c6.n(-1, -2));
            if (this.C.translation_required) {
                org.telegram.ui.Cells.m4 m4Var3 = new org.telegram.ui.Cells.m4(context);
                this.g0 = m4Var3;
                m4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                this.g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                this.Z.addView(this.g0, k7.c6.n(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.e0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.Z.addView(this.e0, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
                this.U = aaVar;
                aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.Z.addView(this.U, k7.c6.n(-1, -2));
                this.U.setOnClickListener(new ql0(this, 4));
                org.telegram.ui.Cells.a9 a9Var3 = new org.telegram.ui.Cells.a9(context);
                this.l0 = a9Var3;
                a9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i11));
                if (this.c != 0) {
                    this.x1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.C.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.x1 = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.x1 = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.x1 = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.x1 = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.x1 = "";
                    }
                }
                String str3 = this.x1;
                HashMap hashMap = this.u1;
                String str4 = str3;
                if (hashMap != null) {
                    String str5 = (String) hashMap.get("translation_all");
                    str4 = str3;
                    if (str5 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.x1);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false)), 0, str5.length(), 33);
                        this.v1.put("translation_all", "");
                        str4 = spannableStringBuilder;
                    }
                }
                this.l0.setText(str4);
                this.Z.addView(this.l0, k7.c6.n(-1, -2));
            }
        } else {
            j10 = 0;
            org.telegram.ui.Cells.aa aaVar2 = new org.telegram.ui.Cells.aa(context);
            this.o0 = aaVar2;
            aaVar2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.o0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.Z.addView(this.o0, k7.c6.n(-1, -2));
            this.o0.setOnClickListener(new ql0(this, 5));
            org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
            this.k0 = a9Var4;
            a9Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i11));
            this.k0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.Z.addView(this.k0, k7.c6.n(-1, -2));
        }
        org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
        this.g0 = m4Var4;
        if (this.s0) {
            m4Var4.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            m4Var4.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        this.g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        this.Z.addView(this.g0, k7.c6.n(-1, -2));
        int i14 = 7;
        int i15 = this.C != null ? 9 : 7;
        this.V = new EditTextBoldCursor[i15];
        int i16 = 0;
        while (true) {
            HashMap hashMap2 = this.p1;
            if (i16 >= i15) {
                org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
                this.j0 = z6Var;
                this.Z.addView(z6Var, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.m4 m4Var5 = new org.telegram.ui.Cells.m4(context);
                this.g0 = m4Var5;
                m4Var5.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                this.Z.addView(this.g0, k7.c6.n(-1, -2));
                this.X = new EditTextBoldCursor[3];
                int i17 = 0;
                for (int i18 = 3; i17 < i18; i18 = 3) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.X[i17] = editTextBoldCursor;
                    zl0 zl0Var = new zl0(context, editTextBoldCursor, 2);
                    zl0Var.setWillNotDraw(false);
                    this.Z.addView(zl0Var, k7.c6.n(-1, 64));
                    int i19 = org.telegram.ui.ActionBar.k6.d6;
                    zl0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i19, false));
                    if (i17 == 2) {
                        View view = new View(context);
                        this.Q = view;
                        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i19, false));
                        this.Z.addView(this.Q, k7.c6.n(-1, 6));
                    }
                    this.X[i17].setTag(Integer.valueOf(i17));
                    this.X[i17].setSupportRtlHint(true);
                    this.X[i17].setTextSize(1, 16.0f);
                    this.X[i17].setHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
                    EditTextBoldCursor editTextBoldCursor2 = this.X[i17];
                    int i20 = org.telegram.ui.ActionBar.k6.G6;
                    editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i20, false));
                    this.X[i17].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L6, false));
                    this.X[i17].setTransformHintToHeader(true);
                    this.X[i17].setBackgroundDrawable(null);
                    this.X[i17].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i20, false));
                    this.X[i17].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.X[i17].setCursorWidth(1.5f);
                    this.X[i17].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
                    this.X[i17].setInputType(16385);
                    this.X[i17].setImeOptions(268435461);
                    if (i17 == 0) {
                        str = "first_name_native";
                    } else if (i17 == 1) {
                        str = "middle_name_native";
                    } else if (i17 != 2) {
                        i17++;
                    } else {
                        str = "last_name_native";
                    }
                    J1(hashMap2, this.X[i17], str);
                    EditTextBoldCursor editTextBoldCursor3 = this.X[i17];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    if (i17 == 0 || i17 == 2 || i17 == 1) {
                        this.X[i17].addTextChangedListener(new bm0(this, editTextBoldCursor, str, 1));
                    }
                    this.X[i17].setPadding(0, 0, 0, 0);
                    this.X[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var.addView(this.X[i17], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.X[i17].setOnEditorActionListener(new ol0(this, 2));
                    i17++;
                }
                org.telegram.ui.Cells.a9 a9Var5 = new org.telegram.ui.Cells.a9(context);
                this.n0 = a9Var5;
                this.Z.addView(a9Var5, k7.c6.n(-1, -2));
                long j11 = this.c;
                TLRPC.TL_secureValue tL_secureValue = this.F;
                if (((j11 == j10 && this.C != null) || this.E == null || this.s0) && tL_secureValue == null) {
                    this.n0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                } else {
                    if (tL_secureValue != null) {
                        T0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            S0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        V0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.aa aaVar3 = new org.telegram.ui.Cells.aa(context);
                    aaVar3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
                    aaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                    if (this.C == null) {
                        aaVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        aaVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.Z.addView(aaVar3, k7.c6.n(-1, -2));
                    aaVar3.setOnClickListener(new ql0(this, 1));
                    org.telegram.ui.Cells.a9 a9Var6 = this.n0;
                    int i21 = R.drawable.greydivider;
                    int i22 = org.telegram.ui.ActionBar.k6.b7;
                    a9Var6.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i21, i22));
                    org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (b) null);
                    this.i0 = z6Var2;
                    z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i22));
                    this.Z.addView(this.i0, k7.c6.n(-1, -2));
                }
                P1();
                Y0(false);
                return;
            }
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            this.V[i16] = editTextBoldCursor4;
            zl0 zl0Var2 = new zl0(context, editTextBoldCursor4, 1);
            zl0Var2.setWillNotDraw(z4);
            this.Z.addView(zl0Var2, k7.c6.n(i12, 64));
            int i23 = org.telegram.ui.ActionBar.k6.d6;
            zl0Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i23, z4));
            if (i16 == i15 - 1) {
                View view2 = new View(context);
                this.P = view2;
                view2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i23, z4));
                this.Z.addView(this.P, k7.c6.n(i12, 6));
            }
            if (this.s0 && this.C != null && i16 < i14) {
                zl0Var2.setVisibility(8);
                View view3 = this.P;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            this.V[i16].setTag(Integer.valueOf(i16));
            this.V[i16].setSupportRtlHint(r42);
            this.V[i16].setTextSize(r42, 16.0f);
            this.V[i16].setHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            EditTextBoldCursor editTextBoldCursor5 = this.V[i16];
            int i24 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
            this.V[i16].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L6, false));
            this.V[i16].setTransformHintToHeader(r42);
            this.V[i16].setBackgroundDrawable(null);
            this.V[i16].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
            this.V[i16].setCursorSize(AndroidUtilities.dp(20.0f));
            this.V[i16].setCursorWidth(1.5f);
            this.V[i16].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
            if (i16 == 5 || i16 == 6) {
                this.V[i16].setOnTouchListener(new rl0(this, 0));
                this.V[i16].setInputType(0);
            } else if (i16 == 3 || i16 == 8) {
                this.V[i16].setOnTouchListener(new org.telegram.ui.ActionBar.i1(6, this, context));
                this.V[i16].setInputType(0);
                this.V[i16].setFocusable(false);
            } else if (i16 == 4) {
                this.V[i16].setOnTouchListener(new rl0(this, 1));
                this.V[i16].setInputType(0);
                this.V[i16].setFocusable(false);
            } else {
                this.V[i16].setInputType(16385);
                this.V[i16].setImeOptions(268435461);
            }
            HashMap hashMap3 = this.q1;
            switch (i16) {
                case 0:
                    if (tL_secureRequiredType2.native_names) {
                        this.V[i16].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                    } else {
                        this.V[i16].setHintText(LocaleController.getString(R.string.PassportName));
                    }
                    str2 = "first_name";
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor6 = this.V[i16];
                    editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                    if (i16 != 0 || i16 == 2 || i16 == 1) {
                        this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    } else {
                        this.V[i16].addTextChangedListener(new org.telegram.ui.Components.lx0(this, editTextBoldCursor4, str2, hashMap2));
                    }
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
                case 1:
                    if (tL_secureRequiredType2.native_names) {
                        this.V[i16].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                    } else {
                        this.V[i16].setHintText(LocaleController.getString(R.string.PassportMidname));
                    }
                    str2 = "middle_name";
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor62 = this.V[i16];
                    editTextBoldCursor62.setSelection(editTextBoldCursor62.length());
                    if (i16 != 0) {
                        break;
                    }
                    this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
                case 2:
                    if (tL_secureRequiredType2.native_names) {
                        this.V[i16].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                    } else {
                        this.V[i16].setHintText(LocaleController.getString(R.string.PassportSurname));
                    }
                    str2 = "last_name";
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor622 = this.V[i16];
                    editTextBoldCursor622.setSelection(editTextBoldCursor622.length());
                    if (i16 != 0) {
                    }
                    this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
                case 3:
                    this.V[i16].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                    str2 = "birth_date";
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor6222 = this.V[i16];
                    editTextBoldCursor6222.setSelection(editTextBoldCursor6222.length());
                    if (i16 != 0) {
                    }
                    this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
                case 4:
                    this.V[i16].setHintText(LocaleController.getString(R.string.PassportGender));
                    str2 = "gender";
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor62222 = this.V[i16];
                    editTextBoldCursor62222.setSelection(editTextBoldCursor62222.length());
                    if (i16 != 0) {
                    }
                    this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
                case 5:
                    this.V[i16].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                    str2 = "country_code";
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor622222 = this.V[i16];
                    editTextBoldCursor622222.setSelection(editTextBoldCursor622222.length());
                    if (i16 != 0) {
                    }
                    this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
                case 6:
                    this.V[i16].setHintText(LocaleController.getString(R.string.PassportResidence));
                    str2 = "residence_country_code";
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor6222222 = this.V[i16];
                    editTextBoldCursor6222222.setSelection(editTextBoldCursor6222222.length());
                    if (i16 != 0) {
                    }
                    this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
                case 7:
                    this.V[i16].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                    str2 = "document_no";
                    hashMap2 = hashMap3;
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor62222222 = this.V[i16];
                    editTextBoldCursor62222222.setSelection(editTextBoldCursor62222222.length());
                    if (i16 != 0) {
                    }
                    this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
                case 8:
                    this.V[i16].setHintText(LocaleController.getString(R.string.PassportExpired));
                    str2 = "expiry_date";
                    hashMap2 = hashMap3;
                    J1(hashMap2, this.V[i16], str2);
                    EditTextBoldCursor editTextBoldCursor622222222 = this.V[i16];
                    editTextBoldCursor622222222.setSelection(editTextBoldCursor622222222.length());
                    if (i16 != 0) {
                    }
                    this.V[i16].addTextChangedListener(new dm0(this, editTextBoldCursor4, str2));
                    this.V[i16].setPadding(0, 0, 0, 0);
                    this.V[i16].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    zl0Var2.addView(this.V[i16], k7.c6.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.V[i16].setOnEditorActionListener(new ol0(this, 1));
                    break;
            }
            i16++;
            r42 = 1;
            i14 = 7;
            z4 = false;
            i12 = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(Context context) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList arrayList;
        boolean z4;
        fn0 fn0Var = this;
        Context context2 = context;
        fn0Var.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
        fn0Var.actionBar.n().a(1, R.drawable.msg_info);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2);
        fn0Var.g0 = m4Var;
        m4Var.setText(LocaleController.getString(R.string.PassportProvidedInformation));
        fn0Var.g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        fn0Var.Z.addView(fn0Var.g0, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context2, (b) null);
        fn0Var.i0 = z6Var;
        int i10 = R.drawable.greydivider;
        int i11 = org.telegram.ui.ActionBar.k6.b7;
        z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, i10, i11));
        fn0Var.Z.addView(fn0Var.i0, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context2);
        fn0Var.u0 = aaVar;
        aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        fn0Var.u0.b(LocaleController.getString(R.string.PassportNoDocumentsAdd), true);
        fn0Var.Z.addView(fn0Var.u0, k7.c6.n(-1, -2));
        fn0Var.u0.setOnClickListener(new ql0(fn0Var, 12));
        org.telegram.ui.Cells.aa aaVar2 = new org.telegram.ui.Cells.aa(context2);
        fn0Var.v0 = aaVar2;
        aaVar2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
        fn0Var.v0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        fn0Var.v0.b(LocaleController.getString(R.string.TelegramPassportDelete), false);
        fn0Var.Z.addView(fn0Var.v0, k7.c6.n(-1, -2));
        fn0Var.v0.setOnClickListener(new ql0(fn0Var, 13));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context2, (b) null);
        fn0Var.w0 = z6Var2;
        z6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_bottom, i11));
        fn0Var.Z.addView(fn0Var.w0, k7.c6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context2);
        fn0Var.x0 = linearLayout;
        linearLayout.setOrientation(1);
        fn0Var.x0.setGravity(17);
        fn0Var.x0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context2, R.drawable.greydivider_bottom, i11));
        if (AndroidUtilities.isTablet()) {
            fn0Var.Z.addView(fn0Var.x0, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(528.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            fn0Var.Z.addView(fn0Var.x0, new LinearLayout.LayoutParams(-1, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        ImageView imageView = new ImageView(context2);
        fn0Var.y0 = imageView;
        imageView.setImageResource(R.drawable.no_passport);
        fn0Var.y0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ci, false), PorterDuff.Mode.MULTIPLY));
        fn0Var.x0.addView(fn0Var.y0, k7.c6.n(-2, -2));
        TextView textView = new TextView(context2);
        fn0Var.z0 = textView;
        int i12 = org.telegram.ui.ActionBar.k6.z6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        fn0Var.z0.setGravity(17);
        fn0Var.z0.setTextSize(1, 15.0f);
        fn0Var.z0.setTypeface(AndroidUtilities.bold());
        fn0Var.z0.setText(LocaleController.getString(R.string.PassportNoDocuments));
        TextView i13 = yh.i(fn0Var.x0, fn0Var.z0, k7.c6.t(-2, -2, 17, 0, 16, 0, 0), context2);
        fn0Var.A0 = i13;
        i13.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        fn0Var.A0.setGravity(17);
        fn0Var.A0.setTextSize(1, 14.0f);
        fn0Var.A0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        fn0Var.A0.setText(LocaleController.getString(R.string.PassportNoDocumentsInfo));
        TextView i14 = yh.i(fn0Var.x0, fn0Var.A0, k7.c6.t(-2, -2, 17, 0, 14, 0, 0), context2);
        fn0Var.B0 = i14;
        int i15 = org.telegram.ui.ActionBar.k6.q6;
        i14.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        fn0Var.B0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        fn0Var.B0.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i15, false), 32), 7, -1));
        fn0Var.B0.setGravity(17);
        fn0Var.B0.setTextSize(1, 15.0f);
        fn0Var.B0.setTypeface(AndroidUtilities.bold());
        fn0Var.B0.setGravity(17);
        fn0Var.B0.setText(LocaleController.getString(R.string.PassportNoDocumentsAdd).toUpperCase());
        fn0Var.x0.addView(fn0Var.B0, k7.c6.t(-2, 30, 17, 0, 12, 0, 0));
        fn0Var.B0.setOnClickListener(new ql0(fn0Var, 14));
        int size = fn0Var.y.values.size();
        int i16 = 0;
        while (i16 < size) {
            TLRPC.TL_secureValue tL_secureValue = fn0Var.y.values.get(i16);
            if (v1(tL_secureValue.type)) {
                arrayList = new ArrayList();
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = tL_secureValue.type;
                tL_secureRequiredType2.selfie_required = true;
                tL_secureRequiredType2.translation_required = true;
                arrayList.add(tL_secureRequiredType2);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
            } else if (t1(tL_secureValue.type)) {
                arrayList = new ArrayList();
                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType3.type = tL_secureValue.type;
                tL_secureRequiredType3.translation_required = true;
                arrayList.add(tL_secureRequiredType3);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
            } else {
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType4.type = tL_secureValue.type;
                tL_secureRequiredType = tL_secureRequiredType4;
                arrayList = null;
                z4 = false;
                fn0Var.U0(context2, tL_secureRequiredType, arrayList, z4, i16 != size + (-1));
                i16++;
                fn0Var = this;
                context2 = context;
            }
            z4 = true;
            fn0Var.U0(context2, tL_secureRequiredType, arrayList, z4, i16 != size + (-1));
            i16++;
            fn0Var = this;
            context2 = context;
        }
        Q1();
    }

    public final void g1(Context context) {
        String str;
        ViewGroup frameLayout;
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        this.V0 = new HashMap();
        int i10 = 3;
        int i11 = 1;
        int i12 = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.R0.add(0, split[2]);
                this.S0.put(split[2], split[0]);
                this.T0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.U0.put(split[0], split[3]);
                }
                this.V0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        Collections.sort(this.R0, new e5.f(13));
        String str2 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
        String str3 = null;
        aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q6, false));
        aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        aaVar.b(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, se.b.c().b("+" + str2)), false);
        this.Z.addView(aaVar, k7.c6.n(-1, -2));
        aaVar.setOnClickListener(new ql0(this, 16));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.k0 = a9Var;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
        this.k0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.Z.addView(this.k0, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        this.g0 = m4Var;
        m4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        this.g0.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
        this.Z.addView(this.g0, k7.c6.n(-1, -2));
        this.V = new EditTextBoldCursor[3];
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 2) {
                this.V[i13] = new org.telegram.ui.Components.j40(context);
            } else {
                this.V[i13] = new EditTextBoldCursor(context);
            }
            if (i13 == 1) {
                frameLayout = org.telegram.messenger.y3.f(context, 0);
                this.Z.addView(frameLayout, k7.c6.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            } else if (i13 == 2) {
                frameLayout = (ViewGroup) this.V[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.Z.addView(frameLayout, k7.c6.n(-1, 50));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            }
            this.V[i13].setTag(Integer.valueOf(i13));
            this.V[i13].setTextSize(1, 16.0f);
            this.V[i13].setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.V[i13];
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
            this.V[i13].setBackgroundDrawable(null);
            this.V[i13].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
            this.V[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.V[i13].setCursorWidth(1.5f);
            if (i13 == 0) {
                this.V[i13].setOnTouchListener(new rl0(this, i10));
                this.V[i13].setText(LocaleController.getString(R.string.ChooseCountry));
                this.V[i13].setInputType(0);
                this.V[i13].setFocusable(false);
            } else {
                this.V[i13].setInputType(3);
                if (i13 == 2) {
                    this.V[i13].setImeOptions(268435462);
                } else {
                    this.V[i13].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.V[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            if (i13 == 1) {
                TextView textView = new TextView(context);
                this.t0 = textView;
                textView.setText("+");
                this.t0.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                this.t0.setTextSize(1, 16.0f);
                frameLayout.addView(this.t0, k7.c6.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.V[i13].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.V[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.V[i13].setGravity(19);
                frameLayout.addView(this.V[i13], k7.c6.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.V[i13].addTextChangedListener(new sm0(this));
            } else if (i13 == 2) {
                this.V[i13].setPadding(0, 0, 0, 0);
                this.V[i13].setGravity(19);
                this.V[i13].setHintText(null);
                this.V[i13].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.V[i13], k7.c6.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.V[i13].addTextChangedListener(new yr(this, i10));
            } else {
                this.V[i13].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.V[i13].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout.addView(this.V[i13], k7.c6.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.V[i13].setOnEditorActionListener(new ol0(this, i12));
            if (i13 == 2) {
                this.V[i13].setOnKeyListener(new og(this, i11));
            }
            if (i13 == 0) {
                View view = new View(context);
                this.h0.add(view);
                view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d7, false));
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                str3 = telephonyManager.getSimCountryIso().toUpperCase();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (str3 != null && (str = (String) this.V0.get(str3)) != null && this.R0.indexOf(str) != -1) {
            this.V[1].setText((CharSequence) this.S0.get(str));
        }
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
        this.k0 = a9Var2;
        a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
        this.k0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.Z.addView(this.k0, k7.c6.n(-1, -2));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        int i11 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        View view = this.P;
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i12));
        View view2 = this.Q;
        if (view2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(view2, 1, null, null, null, null, i12));
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.h0;
            if (i13 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6((View) arrayList2.get(i13), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d7));
            i13++;
        }
        Iterator it = this.k1.entrySet().iterator();
        while (it.hasNext()) {
            dn0 dn0Var = (dn0) ((Map.Entry) it.next()).getValue();
            arrayList.add(new org.telegram.ui.ActionBar.m6(dn0Var, TLObject.FLAG_28, new Class[]{dn0.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(dn0Var, 0, new Class[]{dn0.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(dn0Var, 0, new Class[]{dn0.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.z6));
        }
        int i14 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, TLObject.FLAG_28, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, TLObject.FLAG_28, new Class[]{org.telegram.ui.Cells.aa.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        int i17 = org.telegram.ui.ActionBar.k6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, TLObject.FLAG_28, new Class[]{en0.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 4, new Class[]{en0.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 4, new Class[]{en0.class}, null, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 4, new Class[]{en0.class}, new String[]{"valueTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 8, new Class[]{en0.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 16, new Class[]{org.telegram.ui.Cells.m4.class}, null, null, null, i14));
        int i18 = org.telegram.ui.ActionBar.k6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        if (this.V != null) {
            int i19 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.V;
                if (i19 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6((View) editTextBoldCursorArr[i19].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 16777220, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 8390656, null, null, null, null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 32, null, null, null, null, org.telegram.ui.ActionBar.k6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.V[i19], 2080, null, null, null, null, org.telegram.ui.ActionBar.k6.p7));
                i19++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, null, null, null, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8390656, null, null, null, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.k6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.l6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 2080, null, null, null, null, org.telegram.ui.ActionBar.k6.p7));
        }
        if (this.X != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.X;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.m6((View) editTextBoldCursorArr2[i11].getParent(), 1, null, null, null, null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 16777220, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 8390656, null, null, null, null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 32, null, null, null, null, org.telegram.ui.ActionBar.k6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.X[i11], 2080, null, null, null, null, org.telegram.ui.ActionBar.k6.p7));
                i11++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C0, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F0, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.Xd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.G0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.H0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.r6));
        TextView textView = this.J0;
        int i20 = org.telegram.ui.ActionBar.k6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.t0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.th));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.rh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.sh));
        org.telegram.ui.Components.tq tqVar = this.K;
        int i21 = org.telegram.ui.ActionBar.k6.D7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tqVar, 0, null, null, null, null, i21));
        org.telegram.ui.Components.tq tqVar2 = this.K;
        int i22 = org.telegram.ui.ActionBar.k6.E7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tqVar2, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 0, null, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 0, null, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y0, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.Ci));
        TextView textView2 = this.z0;
        int i23 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView2, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.A0, 4, null, null, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B0, 4, null, null, null, null, i20));
        return arrayList;
    }

    public final byte[] i1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.b1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.b1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.Z0, 0, bArr5, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!Z0(bArr5, null)) {
            return null;
        }
        byte[] computeSHA512 = Utilities.computeSHA512(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public final void j1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z4, final pl0 pl0Var, final sl0 sl0Var, final boolean z10) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (!z10 || tL_secureRequiredType2 == null) {
            if (z4) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        } else {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() { // from class: org.telegram.ui.wl0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final fn0 fn0Var = fn0.this;
                final tm0 tm0Var = sl0Var;
                final boolean z11 = z10;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z12 = z4;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = pl0Var;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.yl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        fn0 fn0Var2 = fn0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str2 = null;
                        if (tL_error2 != null) {
                            tm0 tm0Var2 = tm0Var;
                            if (tm0Var2 != null) {
                                tm0Var2.C(tL_error2.text, null);
                            }
                            fn0Var2.M1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z13 = z11;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z14 = z12;
                        if (!z13) {
                            if (z14) {
                                fn0Var2.H1(tL_secureRequiredType6);
                            }
                            fn0Var2.H1(tL_secureRequiredType5);
                        } else if (tL_secureRequiredType5 != null) {
                            fn0Var2.H1(tL_secureRequiredType5);
                        } else {
                            fn0Var2.H1(tL_secureRequiredType6);
                        }
                        if (fn0Var2.b == 8) {
                            en0 en0Var = (en0) fn0Var2.n1.remove(tL_secureRequiredType6);
                            if (en0Var != null) {
                                fn0Var2.Z.removeView(en0Var);
                                View childAt = fn0Var2.Z.getChildAt(r1.getChildCount() - 6);
                                if (childAt instanceof en0) {
                                    ((en0) childAt).setNeedDivider(false);
                                }
                            }
                            fn0Var2.Q1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 == null || arrayList3 == null || arrayList3.size() <= 1) {
                                str = null;
                            } else {
                                int size = arrayList3.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size) {
                                        str = null;
                                        break;
                                    }
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i10);
                                    TLRPC.TL_secureValue r12 = fn0Var2.r1(tL_secureRequiredType7, false);
                                    if (r12 != null) {
                                        TLRPC.TL_secureData tL_secureData2 = r12.data;
                                        str = tL_secureData2 != null ? fn0.h1(tL_secureData2.data, fn0Var2.i1(tL_secureData2.secret, tL_secureData2.data_hash), r12.data.data_hash) : null;
                                        tL_secureRequiredType5 = tL_secureRequiredType7;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (tL_secureRequiredType5 == null) {
                                    tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList3.get(0);
                                }
                            }
                            if (z14) {
                                fn0Var2.L1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z13, arrayList3 != null ? arrayList3.size() : 0);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str3 = str;
                                TLRPC.TL_secureValue r13 = fn0Var2.r1(tL_secureRequiredType6, false);
                                if (r13 != null && (tL_secureData = r13.data) != null) {
                                    str2 = fn0.h1(tL_secureData.data, fn0Var2.i1(tL_secureData.secret, tL_secureData.data_hash), r13.data.data_hash);
                                }
                                fn0Var2.L1(tL_secureRequiredType6, null, str2, tL_secureRequiredType8, str3, z13, arrayList3 != null ? arrayList3.size() : 0);
                            }
                        }
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        });
    }

    public final c5.j k1(byte[] bArr) {
        byte[] p12 = p1();
        int nextInt = Utilities.random.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.random.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] computeSHA256 = Utilities.computeSHA256(bArr3);
        byte[] computeSHA512 = Utilities.computeSHA512(p12, computeSHA256);
        byte[] bArr4 = new byte[32];
        System.arraycopy(computeSHA512, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(computeSHA512, 32, bArr5, 0, 16);
        Utilities.aesCbcEncryptionByteArraySafe(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.b1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.b1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.Z0, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] computeSHA5122 = Utilities.computeSHA512(bArr8, computeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(computeSHA5122, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(computeSHA5122, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(p12, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        c5.j jVar = new c5.j();
        jVar.c = bArr3;
        jVar.a = bArr11;
        jVar.d = computeSHA256;
        jVar.b = p12;
        jVar.e = new SecureDocumentKey(bArr4, bArr5);
        return jVar;
    }

    public final void l1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z4) {
        bundle.putString("phoneHash", tL_auth_sentCode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = tL_auth_sentCode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        }
        if (tL_auth_sentCode.timeout == 0) {
            tL_auth_sentCode.timeout = 60;
        }
        bundle.putInt("timeout", tL_auth_sentCode.timeout * MediaDataController.MAX_STYLE_RUNS_COUNT);
        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            K1(bundle, 2, z4);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            K1(bundle, 1, z4);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            K1(bundle, 0, z4);
        }
    }

    public final String m1() {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.V;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            sb.append((CharSequence) editTextBoldCursorArr[i10].getText());
            sb.append(",");
            i10++;
        }
        if (this.X != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.X;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.f1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb.append(((SecureDocument) arrayList.get(i12)).secureFile.id);
        }
        SecureDocument secureDocument = this.i1;
        if (secureDocument != null) {
            sb.append(secureDocument.secureFile.id);
        }
        SecureDocument secureDocument2 = this.j1;
        if (secureDocument2 != null) {
            sb.append(secureDocument2.secureFile.id);
        }
        SecureDocument secureDocument3 = this.g1;
        if (secureDocument3 != null) {
            sb.append(secureDocument3.secureFile.id);
        }
        ArrayList arrayList2 = this.h1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb.append(((SecureDocument) arrayList2.get(i13)).secureFile.id);
        }
        return sb.toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 == 0 || i10 == 2) {
                c1();
                org.telegram.ui.Components.mi miVar = this.O0;
                if (miVar != null) {
                    miVar.g0.g0(i10, intent, this.N0);
                }
                this.N0 = null;
                return;
            }
            if (i10 == 1) {
                if (intent == null || intent.getData() == null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.UnsupportedAttachment), 0).show();
                } else {
                    ArrayList arrayList = new ArrayList();
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    sendingMediaInfo.uri = intent.getData();
                    arrayList.add(sendingMediaInfo);
                    G1(arrayList);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        int i10 = this.b;
        if (i10 == 7) {
            if (z4) {
                int i11 = this.F1;
                org.telegram.ui.Components.wv0[] wv0VarArr = this.G1;
                wv0VarArr[i11].c(true);
                for (org.telegram.ui.Components.wv0 wv0Var : wv0VarArr) {
                    if (wv0Var != null) {
                        wv0Var.f();
                    }
                }
            }
        } else if (i10 == 0 || i10 == 5) {
            if (z4) {
                W0(false);
            }
        } else if (i10 == 1 || i10 == 2) {
            return !X0(z4);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        if (this.b == 3 && Build.VERSION.SDK_INT >= 23 && dialog == this.I1) {
            ArrayList arrayList = this.J1;
            if (arrayList.isEmpty()) {
                return;
            }
            getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        int i10 = 0;
        W0(false);
        org.telegram.ui.Components.mi miVar = this.O0;
        if (miVar != null) {
            miVar.dismissInternal();
            this.O0.v1();
        }
        if (this.b == 7) {
            while (true) {
                org.telegram.ui.Components.wv0[] wv0VarArr = this.G1;
                if (i10 >= wv0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.wv0 wv0Var = wv0VarArr[i10];
                if (wv0Var != null) {
                    wv0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.d2 d2Var = this.H1;
            if (d2Var != null) {
                try {
                    d2Var.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                this.H1 = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.mi miVar = this.O0;
        if (miVar != null) {
            miVar.x1();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.mi miVar;
        org.telegram.ui.Cells.aa aaVar;
        int i11 = this.b;
        if ((i11 != 1 && i11 != 2) || (miVar = this.O0) == null) {
            if (i11 == 3 && i10 == 6) {
                O1(false, this.B1, this.C1, this.D1, this.E1);
                return;
            }
            return;
        }
        if (i10 == 17) {
            miVar.g0.U(false);
            return;
        }
        if (i10 == 21) {
            if (getParentActivity() == null || iArr == null || iArr.length == 0 || iArr[0] == 0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new sl0(this, 0));
            l.d.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            F1(0);
            return;
        }
        if (i10 != 22 || iArr == null || iArr.length <= 0 || iArr[0] != 0 || (aaVar = this.o0) == null) {
            return;
        }
        aaVar.callOnClick();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.mi miVar = this.O0;
        if (miVar != null) {
            miVar.y1();
        }
        if (this.b == 5 && (viewGroupArr = this.W) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.V[0].requestFocus();
            AndroidUtilities.showKeyboard(this.V[0]);
            AndroidUtilities.runOnUIThread(new pl0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (this.e1 != null) {
            AndroidUtilities.runOnUIThread(new pl0(this, 1));
        }
        int i10 = this.b;
        if (i10 == 5) {
            if (z4) {
                if (this.W[0].getVisibility() == 0) {
                    this.V[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.V[0]);
                }
                if (this.K0 == 2) {
                    B1(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 7) {
            if (z4) {
                this.G1[this.F1].j();
                return;
            }
            return;
        }
        if (i10 == 4) {
            if (z4) {
                this.V[0].requestFocus();
                AndroidUtilities.showKeyboard(this.V[0]);
                return;
            }
            return;
        }
        if (i10 == 6) {
            if (z4) {
                this.V[0].requestFocus();
                AndroidUtilities.showKeyboard(this.V[0]);
                return;
            }
            return;
        }
        if (i10 == 2 || i10 == 1) {
            c1();
        }
    }

    public final TLRPC.TL_secureValue r1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z4) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_secureValue tL_secureValue = this.y.values.get(i10);
            if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                if (z4) {
                    if (tL_secureRequiredType.selfie_required && !(tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    if (tL_secureRequiredType.translation_required && tL_secureValue.translation.isEmpty()) {
                        return null;
                    }
                    if (t1(tL_secureRequiredType.type) && tL_secureValue.files.isEmpty()) {
                        return null;
                    }
                    if (v1(tL_secureRequiredType.type) && !(tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                    if (((secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) && !(tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    boolean z10 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    if (z10 || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                        String[] strArr = z10 ? tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                        try {
                            TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                            JSONObject jSONObject = new JSONObject(h1(tL_secureData.data, i1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                            for (int i11 = 0; i11 < strArr.length; i11++) {
                                if (!jSONObject.has(strArr[i11]) || TextUtils.isEmpty(jSONObject.getString(strArr[i11]))) {
                                    return null;
                                }
                            }
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                }
                return tL_secureValue;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        this.N0 = bundle.getString("path");
    }

    public final boolean s1(Class cls) {
        int size = this.y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.y.values.get(i10).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.N0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean u1() {
        String str = this.a;
        return str == null || str.equals(m1());
    }

    public final void w1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new tl0(this, 3)), this.classGuid);
    }

    public final void x1() {
        org.telegram.ui.ActionBar.d2 d2Var = this.H1;
        if (d2Var == null) {
            return;
        }
        try {
            d2Var.dismiss();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        this.H1 = null;
    }

    public final void y1() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.H1 != null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
        this.H1 = d2Var;
        d2Var.d0 = false;
        d2Var.show();
    }

    public final void z1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(view);
        I1(view);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public fn0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i10, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i11;
        String o12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.c = j10;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.r = str2;
        this.n = str5;
        if (i10 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new lm0(this));
            int size = authorizationform.errors.size();
            int i12 = 0;
            while (i12 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i12);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    o12 = o1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    o12 = o1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    o12 = o1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        o12 = o1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        o12 = o1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            o12 = o1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            o12 = o1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            o12 = o1(tL_secureValueError.type);
                            str6 = tL_secureValueError.text;
                            bArr = tL_secureValueError.hash;
                            str7 = null;
                            str8 = "error_all";
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                int i13 = 0;
                                while (i13 < authorizationform.values.size()) {
                                    TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i13).data;
                                    if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                        i13++;
                                        size = size;
                                    } else {
                                        o12 = o1(tL_secureValueErrorData.type);
                                        str6 = tL_secureValueErrorData.text;
                                        String str10 = tL_secureValueErrorData.field;
                                        bArr = tL_secureValueErrorData.data_hash;
                                        str7 = str10;
                                        str8 = "data";
                                    }
                                }
                            }
                            i11 = size;
                            i12++;
                            size = i11;
                        }
                        str8 = "files";
                    }
                    str8 = "translation";
                }
                HashMap hashMap = (HashMap) this.r1.get(o12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.r1.put(o12, hashMap);
                    this.s1.put(o12, str6);
                } else {
                    i11 = size;
                }
                if (bArr != null) {
                    str9 = Base64.encodeToString(bArr, 2);
                } else {
                    str9 = "";
                }
                switch (str8.hashCode()) {
                    case -1840647503:
                        if (!str8.equals("translation")) {
                            break;
                        } else if (bArr != null) {
                            hashMap.put("translation" + str9, str6);
                            break;
                        } else {
                            hashMap.put("translation_all", str6);
                            break;
                        }
                    case -906020504:
                        if (!str8.equals("selfie")) {
                            break;
                        } else {
                            hashMap.put("selfie" + str9, str6);
                            break;
                        }
                    case 3076010:
                        if (str8.equals("data") && str7 != null) {
                            hashMap.put(str7, str6);
                            break;
                        }
                        break;
                    case 97434231:
                        if (!str8.equals("files")) {
                            break;
                        } else if (bArr != null) {
                            hashMap.put("files" + str9, str6);
                            break;
                        } else {
                            hashMap.put("files_all", str6);
                            break;
                        }
                    case 97705513:
                        if (!str8.equals("front")) {
                            break;
                        } else {
                            hashMap.put("front" + str9, str6);
                            break;
                        }
                    case 329856746:
                        if (!str8.equals("error_all")) {
                            break;
                        } else {
                            hashMap.put("error_all", str6);
                            break;
                        }
                    case 1099846370:
                        if (!str8.equals("reverse")) {
                            break;
                        } else {
                            hashMap.put("reverse" + str9, str6);
                            break;
                        }
                }
                i12++;
                size = i11;
            }
        } catch (Exception unused) {
        }
    }
}
