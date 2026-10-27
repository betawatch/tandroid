package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kn0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout A0;
    public String A1;
    public ImageView B0;
    public an0 B1;
    public TextView C0;
    public boolean C1;
    public TextView D0;
    public final jm0 D1;
    public final TLRPC.TL_secureRequiredType E;
    public TextView E0;
    public String E1;
    public TLRPC.TL_secureRequiredType F;
    public org.telegram.ui.Components.uz F0;
    public Runnable F1;
    public ArrayList G;
    public org.telegram.ui.Cells.i9 G0;
    public ym0 G1;
    public final TLRPC.TL_secureValue H;
    public org.telegram.ui.Cells.i9 H0;
    public an0 H1;
    public final TLRPC.TL_secureValue I;
    public ImageView I0;
    public int I1;
    public TL_account.Password J;
    public TextView J0;
    public final org.telegram.ui.Components.bx0[] J1;
    public TLRPC.TL_auth_sentCode K;
    public TextView K0;
    public org.telegram.ui.ActionBar.e2 K1;
    public org.telegram.ui.ActionBar.w0 L;
    public FrameLayout L0;
    public Dialog L1;
    public AnimatorSet M;
    public TextView M0;
    public final ArrayList M1;
    public org.telegram.ui.Components.er N;
    public int N0;
    public int N1;
    public TextView O;
    public final byte[] O0;
    public int O1;
    public org.telegram.ui.Components.er P;
    public final byte[] P0;
    public int P1;
    public FrameLayout Q;
    public String Q0;
    public org.telegram.ui.Cells.ga R;
    public org.telegram.ui.Components.ti R0;
    public View S;
    public int S0;
    public View T;
    public int T0;
    public org.telegram.ui.Cells.h9 U;
    public final ArrayList U0;
    public org.telegram.ui.Cells.h9 V;
    public final HashMap V0;
    public org.telegram.ui.Cells.h9 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.ga X;
    public final HashMap X0;
    public EditTextBoldCursor[] Y;
    public HashMap Y0;
    public ViewGroup[] Z;
    public boolean Z0;
    public String a;
    public EditTextBoldCursor[] a0;
    public boolean a1;
    public final int b;
    public ScrollView b0;
    public long b1;
    public long c;
    public LinearLayout c0;
    public byte[] c1;
    public final String d;
    public LinearLayout d0;
    public String d1;
    public final String e;
    public LinearLayout e0;
    public byte[] e1;
    public boolean f;
    public LinearLayout f0;
    public boolean f1;
    public LinearLayout g0;
    public boolean g1;
    public final String h;
    public LinearLayout h0;
    public kn0 h1;
    public LinearLayout i0;
    public final ArrayList i1;
    public org.telegram.ui.Cells.q4 j0;
    public SecureDocument j1;
    public final ArrayList k0;
    public final ArrayList k1;
    public org.telegram.ui.Cells.f7 l0;
    public SecureDocument l1;
    public org.telegram.ui.Cells.f7 m0;
    public SecureDocument m1;
    public final String n;
    public org.telegram.ui.Cells.i9 n0;
    public final HashMap n1;
    public org.telegram.ui.Cells.i9 o0;
    public final HashMap o1;
    public org.telegram.ui.Cells.i9 p0;
    public final HashMap p1;
    public org.telegram.ui.Cells.i9 q0;
    public final HashMap q1;
    public final String r;
    public org.telegram.ui.Cells.ga r0;
    public final HashMap r1;
    public String s;
    public int s0;
    public final HashMap s1;
    public final boolean[] t0;
    public final HashMap t1;
    public boolean u0;
    public final HashMap u1;
    public String v;
    public boolean v0;
    public final HashMap v1;
    public String w;
    public TextView w0;
    public HashMap w1;
    public final int[] x;
    public org.telegram.ui.Cells.ga x0;
    public HashMap x1;
    public TL_account.authorizationForm y;
    public org.telegram.ui.Cells.ga y0;
    public final HashMap y1;
    public org.telegram.ui.Cells.f7 z0;
    public String z1;

    public kn0(int i10, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.s = "";
        this.v = "";
        this.x = new int[3];
        this.k0 = new ArrayList();
        this.t0 = new boolean[3];
        this.u0 = true;
        this.U0 = new ArrayList();
        this.V0 = new HashMap();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.i1 = new ArrayList();
        this.k1 = new ArrayList();
        this.n1 = new HashMap();
        this.o1 = new HashMap();
        this.p1 = new HashMap();
        this.q1 = new HashMap();
        this.r1 = new HashMap();
        this.u1 = new HashMap();
        this.v1 = new HashMap();
        this.y1 = new HashMap();
        this.D1 = new jm0(this);
        this.b = i10;
        this.y = authorizationform;
        this.E = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.u0 = tL_secureRequiredType.native_names;
        }
        this.H = tL_secureValue;
        this.F = tL_secureRequiredType2;
        this.I = tL_secureValue2;
        this.J = password;
        this.s1 = hashMap;
        this.t1 = hashMap2;
        if (i10 == 3) {
            this.M1 = new ArrayList();
        } else if (i10 == 7) {
            this.J1 = new org.telegram.ui.Components.bx0[3];
        }
        if (hashMap == null) {
            this.s1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.t1 = new HashMap();
        }
        if (i10 == 5) {
            if (UserConfig.getInstance(this.currentAccount).savedPasswordHash != null && UserConfig.getInstance(this.currentAccount).savedSaltedPassword != null) {
                this.N0 = 1;
                this.O0 = UserConfig.getInstance(this.currentAccount).savedPasswordHash;
                this.P0 = UserConfig.getInstance(this.currentAccount).savedSaltedPassword;
            }
            TL_account.Password password2 = this.J;
            if (password2 == null) {
                w1();
            } else {
                TwoStepVerificationActivity.n0(password2);
                if (this.N0 == 1) {
                    B1(true);
                }
            }
            if (SharedConfig.isPassportConfigLoaded()) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = SharedConfig.passportConfigHash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new di.d6(18));
        }
    }

    public static int C0(kn0 kn0Var, String str) {
        kn0Var.getClass();
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
    /* JADX WARN: Code restructure failed: missing block: B:180:0x026a, code lost:
    
        if (r9 < 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0279, code lost:
    
        if (r9 < 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0282, code lost:
    
        if (r9 > 10) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean D0(kn0 kn0Var) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        boolean z10;
        View view;
        ArrayList arrayList = kn0Var.k1;
        ArrayList arrayList2 = kn0Var.i1;
        HashMap hashMap = kn0Var.n1;
        HashMap hashMap2 = kn0Var.y1;
        if (kn0Var.F != null) {
            if (hashMap2.containsKey("error_all") || hashMap2.containsKey("error_document_all")) {
                kn0Var.z1(kn0Var.p0);
                return true;
            }
            if (kn0Var.R != null) {
                if (arrayList2.isEmpty()) {
                    kn0Var.z1(kn0Var.R);
                    return true;
                }
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SecureDocument secureDocument = (SecureDocument) arrayList2.get(i10);
                    String str = "files" + n1(secureDocument);
                    if (str != null && hashMap2.containsKey(str)) {
                        kn0Var.z1((View) hashMap.get(secureDocument));
                        return true;
                    }
                }
            }
            if (hashMap2.containsKey("files_all") || hashMap2.containsKey("translation_all")) {
                kn0Var.z1(kn0Var.n0);
                return true;
            }
            View view2 = kn0Var.U;
            if (view2 != null) {
                if (kn0Var.l1 == null) {
                    kn0Var.z1(view2);
                    return true;
                }
                if (hashMap2.containsKey("front" + n1(kn0Var.l1))) {
                    kn0Var.z1((View) hashMap.get(kn0Var.l1));
                    return true;
                }
            }
            TLRPC.SecureValueType secureValueType = kn0Var.F.type;
            if (((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) && (view = kn0Var.V) != null) {
                if (kn0Var.m1 == null) {
                    kn0Var.z1(view);
                    return true;
                }
                if (hashMap2.containsKey("reverse" + n1(kn0Var.m1))) {
                    kn0Var.z1((View) hashMap.get(kn0Var.m1));
                    return true;
                }
            }
            View view3 = kn0Var.W;
            if (view3 != null && kn0Var.c != 0) {
                if (kn0Var.j1 == null) {
                    kn0Var.z1(view3);
                    return true;
                }
                if (hashMap2.containsKey("selfie" + n1(kn0Var.j1))) {
                    kn0Var.z1((View) hashMap.get(kn0Var.j1));
                    return true;
                }
            }
            if (kn0Var.X != null && kn0Var.c != 0) {
                if (arrayList.isEmpty()) {
                    kn0Var.z1(kn0Var.X);
                    return true;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    SecureDocument secureDocument2 = (SecureDocument) arrayList.get(i11);
                    if (hashMap2.containsKey("translation" + n1(secureDocument2))) {
                        kn0Var.z1((View) hashMap.get(secureDocument2));
                        return true;
                    }
                }
            }
        }
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 == 0) {
                editTextBoldCursorArr = kn0Var.Y;
            } else {
                org.telegram.ui.Cells.i9 i9Var = kn0Var.q0;
                editTextBoldCursorArr = (i9Var == null || i9Var.getVisibility() != 0) ? null : kn0Var.a0;
            }
            if (editTextBoldCursorArr != null) {
                int i13 = 0;
                while (i13 < editTextBoldCursorArr.length) {
                    boolean hasErrorText = editTextBoldCursorArr[i13].hasErrorText();
                    if (!hashMap2.isEmpty()) {
                        TLRPC.SecureValueType secureValueType2 = kn0Var.E.type;
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
                    if (!kn0Var.v0 || kn0Var.F == null || i13 >= 7) {
                        if (!hasErrorText) {
                            int length = editTextBoldCursorArr[i13].length();
                            int i14 = kn0Var.b;
                            if (i14 != 1) {
                                if (i14 == 2) {
                                    if (i13 == 1) {
                                        continue;
                                    } else if (i13 != 3) {
                                        if (i13 == 4) {
                                            if (!"US".equals(kn0Var.s)) {
                                                continue;
                                            }
                                        } else if (i13 == 2) {
                                            if (length >= 2) {
                                            }
                                            z10 = false;
                                            hasErrorText = true;
                                        }
                                    }
                                }
                                z10 = false;
                            } else if (i13 != 8) {
                                if ((i12 == 0 && (i13 == 0 || i13 == 2 || i13 == 1)) || (i12 == 1 && (i13 == 0 || i13 == 1 || i13 == 2))) {
                                    if (length > 255) {
                                        hasErrorText = true;
                                    }
                                    if ((i12 == 0 && i13 == 1) || (i12 == 1 && i13 == 1)) {
                                        z10 = true;
                                    }
                                } else if (i13 == 7) {
                                }
                                z10 = false;
                            } else {
                                continue;
                            }
                            if (!hasErrorText && !z10 && length == 0) {
                                hasErrorText = true;
                            }
                        }
                        if (hasErrorText) {
                            kn0Var.z1(editTextBoldCursorArr[i13]);
                            return true;
                        }
                    }
                    i13++;
                }
            }
        }
        return false;
    }

    public static void J0(kn0 kn0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z10) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = kn0Var.y1;
        if (hashMap == null || (str2 = (String) hashMap.get(str)) == null) {
            editTextBoldCursor.setErrorText(null);
        } else if (TextUtils.equals(str2, editable)) {
            HashMap hashMap2 = kn0Var.w1;
            if (hashMap2 == null || (str4 = (String) hashMap2.get(str)) == null) {
                HashMap hashMap3 = kn0Var.x1;
                if (hashMap3 != null && (str3 = (String) hashMap3.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        String str5 = z10 ? "error_document_all" : "error_all";
        if (hashMap == null || !hashMap.containsKey(str5)) {
            return;
        }
        hashMap.remove(str5);
        kn0Var.a1(false);
    }

    public static void P1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z10, boolean z11) {
        if (editTextBoldCursorArr == null) {
            return;
        }
        for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.y6.G6, null);
                if (z10) {
                    org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.y6.H6, null);
                    org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.y6.L6, null);
                    if (z11) {
                        int paddingLeft = editTextBoldCursor.getPaddingLeft();
                        int paddingTop = editTextBoldCursor.getPaddingTop();
                        int paddingRight = editTextBoldCursor.getPaddingRight();
                        int paddingBottom = editTextBoldCursor.getPaddingBottom();
                        org.telegram.ui.ActionBar.f7.G(editTextBoldCursor, org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, null);
                        if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                            editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void V(kn0 kn0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = kn0Var.J;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        kn0Var.presentFragment(new fg1(kn0Var.currentAccount, 4, password));
    }

    public static void W(kn0 kn0Var) {
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = kn0Var.r1;
        HashMap hashMap2 = kn0Var.q1;
        String str = kn0Var.r;
        ArrayList arrayList2 = new ArrayList();
        int size = kn0Var.y.required_types.size();
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.SecureRequiredType secureRequiredType = kn0Var.y.required_types.get(i12);
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
                                    if (kn0Var.r1(tL_secureRequiredType5, true) != null) {
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
            TLRPC.TL_secureValue r12 = kn0Var.r1(tL_secureRequiredType, true);
            if (r12 == null) {
                Vibrator vibrator = (Vibrator) kn0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                jn0 jn0Var = (jn0) hashMap2.get(tL_secureRequiredType);
                if (jn0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    jn0Var = (jn0) hashMap2.get(tL_secureRequiredType2);
                }
                AndroidUtilities.shakeView(jn0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) kn0Var.u1.get(o1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) kn0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                jn0 jn0Var2 = (jn0) hashMap2.get(tL_secureRequiredType);
                if (jn0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    jn0Var2 = (jn0) hashMap2.get(tL_secureRequiredType3);
                }
                AndroidUtilities.shakeView(jn0Var2);
                return;
            }
            boolean z10 = tL_secureRequiredType.selfie_required;
            boolean z11 = tL_secureRequiredType.translation_required;
            km0 km0Var = new km0();
            km0Var.a = r12;
            km0Var.b = z10;
            km0Var.c = z11;
            arrayList2.add(km0Var);
        }
        kn0Var.N1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = kn0Var.c;
        acceptauthorization.scope = kn0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            km0 km0Var2 = (km0) arrayList2.get(i14);
            TLRPC.TL_secureValue tL_secureValue = km0Var2.a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData == null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] i15 = kn0Var.i1(tL_secureData.secret, tL_secureData.data_hash);
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
                                    byte[] i17 = kn0Var.i1(tL_secureFile.secret, tL_secureFile.file_hash);
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
                        byte[] i18 = kn0Var.i1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(i18, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] i19 = kn0Var.i1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(i19, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (km0Var2.b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] i110 = kn0Var.i1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(i110, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (km0Var2.c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i20 = 0; i20 < size5; i20++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i20);
                            byte[] i111 = kn0Var.i1(tL_secureFile5.secret, tL_secureFile5.file_hash);
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
        Object obj = kn0Var.d;
        if (obj != null) {
            try {
                jSONObject9.put("payload", obj);
            } catch (Exception unused6) {
            }
        }
        Object obj2 = kn0Var.e;
        if (obj2 != null) {
            try {
                jSONObject9.put("nonce", obj2);
            } catch (Exception unused7) {
            }
        }
        a8.me k12 = kn0Var.k1(AndroidUtilities.getStringBytes(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) k12.d;
        tL_secureCredentialsEncrypted.data = (byte[]) k12.c;
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) k12.b);
        } catch (Exception e) {
            FileLog.e(e);
        }
        ConnectionsManager.getInstance(kn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(kn0Var.currentAccount).sendRequest(acceptauthorization, new yl0(kn0Var, 1)), kn0Var.classGuid);
    }

    public static /* synthetic */ void X(kn0 kn0Var, TLRPC.TL_error tL_error, String str, an0 an0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error != null) {
            org.telegram.ui.Components.g5.e0(kn0Var.currentAccount, tL_error, kn0Var, sendverifyphonecode, str);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("phone", str);
        kn0 kn0Var2 = new kn0(7, kn0Var.y, kn0Var.J, kn0Var.E, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
        kn0Var2.currentAccount = kn0Var.currentAccount;
        kn0Var2.e1 = kn0Var.e1;
        kn0Var2.c1 = kn0Var.c1;
        kn0Var2.B1 = an0Var;
        kn0Var2.K = (TLRPC.TL_auth_sentCode) tLObject;
        kn0Var.presentFragment(kn0Var2, true);
    }

    public static /* synthetic */ void Y(kn0 kn0Var, SecureDocument secureDocument, int i10) {
        HashMap hashMap = kn0Var.n1;
        int i11 = kn0Var.S0;
        if (i11 == 1) {
            SecureDocument secureDocument2 = kn0Var.j1;
            if (secureDocument2 != null) {
                in0 in0Var = (in0) hashMap.remove(secureDocument2);
                if (in0Var != null) {
                    kn0Var.g0.removeView(in0Var);
                }
                kn0Var.j1 = null;
            }
        } else if (i11 == 4) {
            if (kn0Var.k1.size() >= 20) {
                return;
            }
        } else if (i11 == 2) {
            SecureDocument secureDocument3 = kn0Var.l1;
            if (secureDocument3 != null) {
                in0 in0Var2 = (in0) hashMap.remove(secureDocument3);
                if (in0Var2 != null) {
                    kn0Var.e0.removeView(in0Var2);
                }
                kn0Var.l1 = null;
            }
        } else if (i11 == 3) {
            SecureDocument secureDocument4 = kn0Var.m1;
            if (secureDocument4 != null) {
                in0 in0Var3 = (in0) hashMap.remove(secureDocument4);
                if (in0Var3 != null) {
                    kn0Var.f0.removeView(in0Var3);
                }
                kn0Var.m1 = null;
            }
        } else if (i11 == 0 && kn0Var.i1.size() >= 20) {
            return;
        }
        kn0Var.o1.put(secureDocument.path, secureDocument);
        kn0Var.L.setEnabled(false);
        kn0Var.L.setAlpha(0.5f);
        FileLoader.getInstance(kn0Var.currentAccount).uploadFile(secureDocument.path, false, true, 16777216);
        kn0Var.R0(secureDocument, i10);
        kn0Var.T1(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void Z(kn0 kn0Var, boolean z10, String str) {
        byte[] bArr;
        byte[] x9;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        if (z10) {
            x9 = kn0Var.O0;
        } else {
            if (!(kn0Var.J.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
                bArr = null;
                wm0 wm0Var = new wm0(kn0Var, z10, bArr, getpasswordsettings, str);
                TL_account.Password password = kn0Var.J;
                passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "PASSWORD_HASH_INVALID";
                    wm0Var.run(null, tL_error);
                    return;
                }
                TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                getpasswordsettings.password = startCheck;
                if (startCheck != null) {
                    ConnectionsManager.getInstance(kn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(kn0Var.currentAccount).sendRequest(getpasswordsettings, wm0Var, 10), kn0Var.classGuid);
                    return;
                } else {
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "ALGO_INVALID";
                    wm0Var.run(null, tL_error2);
                    return;
                }
            }
            x9 = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) kn0Var.J.current_algo);
        }
        bArr = x9;
        wm0 wm0Var2 = new wm0(kn0Var, z10, bArr, getpasswordsettings, str);
        TL_account.Password password2 = kn0Var.J;
        passwordKdfAlgo = password2.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        }
    }

    public static boolean Z0(byte[] bArr, Long l4) {
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
        return l4 == null || Utilities.bytesToLong(Utilities.computeSHA256(bArr)) == l4.longValue();
    }

    public static /* synthetic */ void a0(int i10, String str, SecureDocument secureDocument, in0 in0Var, kn0 kn0Var) {
        HashMap hashMap = kn0Var.o1;
        kn0Var.n1.remove(secureDocument);
        if (i10 == 1) {
            kn0Var.j1 = null;
            kn0Var.g0.removeView(in0Var);
        } else if (i10 == 4) {
            kn0Var.k1.remove(secureDocument);
            kn0Var.h0.removeView(in0Var);
        } else if (i10 == 2) {
            kn0Var.l1 = null;
            kn0Var.e0.removeView(in0Var);
        } else if (i10 == 3) {
            kn0Var.m1 = null;
            kn0Var.f0.removeView(in0Var);
        } else {
            kn0Var.i1.remove(secureDocument);
            kn0Var.d0.removeView(in0Var);
        }
        if (str != null) {
            HashMap hashMap2 = kn0Var.x1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = kn0Var.y1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        kn0Var.T1(i10);
        String str2 = secureDocument.path;
        if (str2 == null || hashMap.remove(str2) == null) {
            return;
        }
        if (hashMap.isEmpty()) {
            kn0Var.L.setEnabled(true);
            kn0Var.L.setAlpha(1.0f);
        }
        FileLoader.getInstance(kn0Var.currentAccount).cancelFileUpload(secureDocument.path, false);
    }

    public static /* synthetic */ void b0(kn0 kn0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i10 = 0; i10 < kn0Var.y.values.size(); i10++) {
            deletesecurevalue.types.add(kn0Var.y.values.get(i10).type);
        }
        kn0Var.y1();
        ConnectionsManager.getInstance(kn0Var.currentAccount).sendRequest(deletesecurevalue, new yl0(kn0Var, 2));
    }

    public static void c0(kn0 kn0Var) {
        fg1 fg1Var = new fg1(kn0Var.currentAccount, 0, kn0Var.J);
        fg1Var.Y = true;
        kn0Var.presentFragment(fg1Var);
    }

    public static void d0(kn0 kn0Var) {
        if (kn0Var.J.has_recovery) {
            kn0Var.y1();
            ConnectionsManager.getInstance(kn0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(kn0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new yl0(kn0Var, 0), 10), kn0Var.classGuid);
            return;
        }
        if (kn0Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var.getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.RestorePasswordResetAccount), new xl0(kn0Var, 4));
        alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
        String string = LocaleController.getString(R.string.RestorePasswordNoEmailText);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.T = string;
        kn0Var.showDialog(e2Var);
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

    public final void A1(boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z10) {
            this.Y[0].setText("");
        }
        AndroidUtilities.shakeView(this.Y[0]);
    }

    public final void B1(boolean z10) {
        String obj;
        if (z10) {
            obj = null;
        } else {
            obj = this.Y[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                A1(false);
                return;
            }
            N1(true, true);
        }
        Utilities.globalQueue.postRunnable(new f80(this, z10, obj, 3));
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
        alertDialog$Builder.a.R = LocaleController.getString(R.string.PassportNoDocumentsAdd);
        alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new ng.j(9, this, arrayList2));
        showDialog(alertDialog$Builder.a);
    }

    public final void D1() {
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.S0;
        ArrayList arrayList = this.i1;
        int i11 = 1;
        if (i10 == 0 && arrayList.size() >= 20) {
            M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("PassportUploadMaxReached", R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", 20, new Object[0])));
            return;
        }
        c1();
        org.telegram.ui.Components.ti tiVar = this.R0;
        int i12 = this.S0;
        tiVar.X1 = i12 == 1;
        if (i12 != 0) {
            if (i12 == 4) {
                size = this.k1.size();
            }
            tiVar.R1(i11, false);
            this.R0.j0.g0();
            this.R0.w1();
            showDialog(this.R0);
        }
        size = arrayList.size();
        i11 = 20 - size;
        tiVar.R1(i11, false);
        this.R0.j0.g0();
        this.R0.w1();
        showDialog(this.R0);
    }

    public final void E1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z10) {
        HashMap hashMap;
        HashMap hashMap2;
        int size = arrayList != null ? arrayList.size() : 0;
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2 != null ? tL_secureRequiredType2.type : null;
        int i10 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? 1 : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? 2 : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? 3 : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? 4 : -1;
        if (i10 != -1) {
            HashMap hashMap3 = this.u1;
            HashMap hashMap4 = !z10 ? (HashMap) hashMap3.get(o1(secureValueType)) : null;
            HashMap hashMap5 = (HashMap) hashMap3.get(o1(secureValueType2));
            TLRPC.TL_secureValue r12 = r1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue r13 = r1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap4;
            TL_account.authorizationForm authorizationform = this.y;
            int i11 = i10;
            TL_account.Password password = this.J;
            HashMap hashMap7 = this.p1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap = hashMap5;
                hashMap2 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap = hashMap5;
                hashMap2 = null;
            }
            kn0 kn0Var = new kn0(i11, authorizationform, password, tL_secureRequiredType, r12, tL_secureRequiredType2, r13, hashMap8, hashMap2);
            kn0Var.B1 = new nm0(this, secureValueType, z10, size);
            kn0Var.currentAccount = this.currentAccount;
            kn0Var.e1 = this.e1;
            kn0Var.c1 = this.c1;
            kn0Var.c = this.c;
            kn0Var.w1 = hashMap6;
            kn0Var.v0 = z10;
            kn0Var.x1 = hashMap;
            kn0Var.G = arrayList;
            if (i11 == 4) {
                kn0Var.d1 = this.d1;
            }
            presentFragment(kn0Var);
        }
    }

    public final void F1(int i10) {
        if (i10 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
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
                    this.Q0 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void G1(ArrayList arrayList) {
        boolean z10;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = this.S0;
        boolean z11 = true;
        if (i10 == 1 || i10 == 4 || !(this.E.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            z10 = false;
        } else {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i11 < editTextBoldCursorArr.length) {
                    if (i11 != 5 && i11 != 8 && i11 != 4 && i11 != 6 && editTextBoldCursorArr[i11].length() > 0) {
                        z11 = false;
                        break;
                    }
                    i11++;
                } else {
                    break;
                }
            }
            z10 = z11;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.messenger.voip.j0(this.S0, 7, this, arrayList, z10));
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
        while (view != null && this.c0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.b0.smoothScrollTo(0, view.getTop() - ((this.b0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
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
                    CharSequence charSequence3 = (String) this.Y0.get(str2);
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
                    CharSequence charSequence4 = (String) this.Y0.get(str2);
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
        HashMap hashMap2 = this.w1;
        HashMap hashMap3 = this.y1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.x1;
        if (hashMap4 == null || (charSequence = (String) hashMap4.get(str)) == null) {
            return;
        }
        editTextBoldCursor.setErrorText(charSequence);
        hashMap3.put(str, editTextBoldCursor.getText().toString());
    }

    public final void K1(Bundle bundle, int i10, boolean z10) {
        if (i10 == 3) {
            this.L.setVisibility(8);
        }
        int i11 = this.I1;
        org.telegram.ui.Components.bx0[] bx0VarArr = this.J1;
        org.telegram.ui.Components.bx0 bx0Var = bx0VarArr[i11];
        org.telegram.ui.Components.bx0 bx0Var2 = bx0VarArr[i10];
        this.I1 = i10;
        bx0Var2.m(bundle, false);
        bx0Var2.j();
        if (!z10) {
            bx0Var2.setTranslationX(0.0f);
            bx0Var2.setVisibility(0);
            if (bx0Var != bx0Var2) {
                bx0Var.setVisibility(8);
                return;
            }
            return;
        }
        bx0Var2.setTranslationX(AndroidUtilities.displaySize.x);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(bx0Var, "translationX", -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(bx0Var2, "translationX", 0.0f));
        animatorSet.addListener(new org.telegram.ui.Components.ml0(bx0Var2, bx0Var, 9));
        animatorSet.start();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void L1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kn0.L1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void M1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = str;
        e2Var.T = str2;
        showDialog(e2Var);
    }

    public final void N1(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i10 = 1;
        int i11 = 0;
        if (z10 && this.L != null) {
            this.M = new AnimatorSet();
            if (z11) {
                this.N.setVisibility(0);
                this.L.setEnabled(false);
                AnimatorSet animatorSet2 = this.M;
                View contentView = this.L.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property, 0.1f);
                View contentView2 = this.L.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property2, 0.1f);
                View contentView3 = this.L.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.N, (Property<org.telegram.ui.Components.er, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.N, (Property<org.telegram.ui.Components.er, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.N, (Property<org.telegram.ui.Components.er, Float>) property3, 1.0f));
            } else {
                this.L.getContentView().setVisibility(0);
                this.L.setEnabled(true);
                AnimatorSet animatorSet3 = this.M;
                org.telegram.ui.Components.er erVar = this.N;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(erVar, (Property<org.telegram.ui.Components.er, Float>) property4, 0.1f);
                org.telegram.ui.Components.er erVar2 = this.N;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(erVar2, (Property<org.telegram.ui.Components.er, Float>) property5, 0.1f);
                org.telegram.ui.Components.er erVar3 = this.N;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(erVar3, (Property<org.telegram.ui.Components.er, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.L.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), (Property<View, Float>) property6, 1.0f));
            }
            this.M.addListener(new om0(this, z11, i11));
            this.M.setDuration(150L);
            this.M.start();
            return;
        }
        if (this.O != null) {
            this.M = new AnimatorSet();
            if (z11) {
                this.P.setVisibility(0);
                this.Q.setEnabled(false);
                AnimatorSet animatorSet4 = this.M;
                TextView textView = this.O;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property7, 0.1f);
                TextView textView2 = this.O;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property8, 0.1f);
                TextView textView3 = this.O;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.P, (Property<org.telegram.ui.Components.er, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.P, (Property<org.telegram.ui.Components.er, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.P, (Property<org.telegram.ui.Components.er, Float>) property9, 1.0f));
            } else {
                this.O.setVisibility(0);
                this.Q.setEnabled(true);
                AnimatorSet animatorSet5 = this.M;
                org.telegram.ui.Components.er erVar4 = this.P;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(erVar4, (Property<org.telegram.ui.Components.er, Float>) property10, 0.1f);
                org.telegram.ui.Components.er erVar5 = this.P;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(erVar5, (Property<org.telegram.ui.Components.er, Float>) property11, 0.1f);
                org.telegram.ui.Components.er erVar6 = this.P;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(erVar6, (Property<org.telegram.ui.Components.er, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.O, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<TextView, Float>) property12, 1.0f));
            }
            this.M.addListener(new om0(this, z11, i10));
            this.M.setDuration(150L);
            this.M.start();
        }
    }

    public final void O1(boolean z10, String str, Runnable runnable, ym0 ym0Var, an0 an0Var) {
        boolean z11;
        TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        boolean z12 = (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0) ? false : true;
        if (getParentActivity() == null || !z12) {
            z11 = true;
        } else {
            z11 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (z10) {
                this.M1.clear();
                if (!z11) {
                    this.M1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.M1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        String string = LocaleController.getString(R.string.AllowReadCall);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                        e2Var.T = string;
                        this.L1 = showDialog(e2Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.M1.toArray(new String[0]), 6);
                    }
                    this.E1 = str;
                    this.G1 = ym0Var;
                    this.F1 = runnable;
                    this.H1 = an0Var;
                    return;
                }
            }
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        tL_codeSettings.allow_flashcall = z12 && z11;
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
            } catch (Exception e) {
                sendverifyphonecode.settings.allow_flashcall = false;
                FileLog.e(e);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new bi.i2(this, str, an0Var, sendverifyphonecode, 14), 2);
    }

    public final void Q1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(q1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportPersonal));
        }
        T1(2);
        T1(3);
        T1(1);
        T1(4);
    }

    public final void R0(final SecureDocument secureDocument, final int i10) {
        String string;
        final String str;
        String formatDateForBan;
        HashMap hashMap;
        if (i10 == 1) {
            this.j1 = secureDocument;
            if (this.g0 == null) {
                return;
            }
        } else if (i10 == 4) {
            this.k1.add(secureDocument);
            if (this.h0 == null) {
                return;
            }
        } else if (i10 == 2) {
            this.l1 = secureDocument;
            if (this.e0 == null) {
                return;
            }
        } else if (i10 == 3) {
            this.m1 = secureDocument;
            if (this.f0 == null) {
                return;
            }
        } else {
            this.i1.add(secureDocument);
            if (this.d0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final in0 in0Var = new in0(this, getParentActivity());
        in0Var.setTag(secureDocument);
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.d6);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
        in0Var.setBackground(M0);
        org.telegram.ui.ActionBar.f7.k(in0Var, M0, N, N2, null);
        this.n1.put(secureDocument, in0Var);
        String n12 = n1(secureDocument);
        if (i10 == 1) {
            string = LocaleController.getString(R.string.PassportSelfie);
            this.g0.addView(in0Var, org.telegram.ui.Components.kb1.r(-1, -2));
            str = "selfie" + n12;
        } else if (i10 == 4) {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.h0.addView(in0Var, org.telegram.ui.Components.kb1.r(-1, -2));
            str = "translation" + n12;
        } else if (i10 == 2) {
            TLRPC.SecureValueType secureValueType = this.F.type;
            string = ((secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) ? LocaleController.getString(R.string.PassportMainPage) : LocaleController.getString(R.string.PassportFrontSide);
            this.e0.addView(in0Var, org.telegram.ui.Components.kb1.r(-1, -2));
            str = "front" + n12;
        } else if (i10 == 3) {
            string = LocaleController.getString(R.string.PassportReverseSide);
            this.f0.addView(in0Var, org.telegram.ui.Components.kb1.r(-1, -2));
            str = "reverse" + n12;
        } else {
            string = LocaleController.getString(R.string.AttachPhoto);
            this.d0.addView(in0Var, org.telegram.ui.Components.kb1.r(-1, -2));
            str = "files" + n12;
        }
        if (str == null || (hashMap = this.x1) == null || (formatDateForBan = (String) hashMap.get(str)) == null) {
            formatDateForBan = LocaleController.formatDateForBan(secureDocument.secureFile.date);
        } else {
            org.telegram.ui.ActionBar.f7.V(in0Var.b, org.telegram.ui.ActionBar.y6.p7, null);
            this.y1.put(str, "");
        }
        in0Var.a.setText(string);
        in0Var.b.setText(formatDateForBan);
        org.telegram.ui.Components.y9 y9Var = in0Var.c;
        y9Var.getClass();
        y9Var.m(ImageLocation.getForSecureDocument(secureDocument), "48_48", null, null, null, null, 0, null);
        in0Var.f = secureDocument;
        in0Var.a(false);
        in0Var.setOnClickListener(new ai.w(this, i10, 27));
        in0Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.zl0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                kn0 kn0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kn0Var.getParentActivity());
                int i11 = i10;
                if (i11 == 1) {
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PassportDeleteSelfie);
                } else {
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PassportDeleteScan);
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new bi.e6(kn0Var, secureDocument, i11, in0Var, str, 4));
                kn0Var.showDialog(alertDialog$Builder.a);
                return true;
            }
        });
    }

    public final void R1() {
        if (this.y.values.isEmpty()) {
            this.A0.setVisibility(0);
            this.l0.setVisibility(8);
            this.j0.setVisibility(8);
            this.x0.setVisibility(8);
            this.y0.setVisibility(8);
            this.z0.setVisibility(8);
            return;
        }
        this.A0.setVisibility(8);
        this.l0.setVisibility(0);
        this.j0.setVisibility(0);
        this.y0.setVisibility(0);
        this.z0.setVisibility(0);
        if (s1(TLRPC.TL_secureValueTypePhone.class) || s1(TLRPC.TL_secureValueTypeEmail.class) || s1(TLRPC.TL_secureValueTypePersonalDetails.class) || s1(TLRPC.TL_secureValueTypePassport.class) || s1(TLRPC.TL_secureValueTypeInternalPassport.class) || s1(TLRPC.TL_secureValueTypeIdentityCard.class) || s1(TLRPC.TL_secureValueTypeDriverLicense.class) || s1(TLRPC.TL_secureValueTypeAddress.class) || s1(TLRPC.TL_secureValueTypeUtilityBill.class) || s1(TLRPC.TL_secureValueTypePassportRegistration.class) || s1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) || s1(TLRPC.TL_secureValueTypeBankStatement.class) || s1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.x0.setVisibility(0);
        } else {
            this.x0.setVisibility(8);
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

    public final void S1() {
        ImageView imageView = this.I0;
        if (imageView == null) {
            return;
        }
        TL_account.Password password = this.J;
        if (password == null || this.N0 != 0) {
            imageView.setVisibility(8);
            this.J0.setVisibility(8);
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            this.Z[0].setVisibility(8);
            this.L.setVisibility(8);
            this.M0.setVisibility(8);
            this.H0.setVisibility(8);
            this.G0.setVisibility(8);
            this.F0.setVisibility(0);
            return;
        }
        if (!password.has_password) {
            this.G0.setVisibility(0);
            this.I0.setVisibility(0);
            this.J0.setVisibility(0);
            this.K0.setVisibility(0);
            this.L0.setVisibility(8);
            this.Z[0].setVisibility(8);
            this.L.setVisibility(8);
            this.M0.setVisibility(8);
            this.H0.setVisibility(8);
            this.G0.setLayoutParams(org.telegram.ui.Components.kb1.o(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
            this.F0.setVisibility(8);
            return;
        }
        this.G0.setVisibility(0);
        this.I0.setVisibility(8);
        this.J0.setVisibility(8);
        this.K0.setVisibility(8);
        this.F0.setVisibility(8);
        this.L0.setVisibility(0);
        this.Z[0].setVisibility(0);
        this.L.setVisibility(0);
        this.M0.setVisibility(0);
        this.H0.setVisibility(0);
        this.G0.setLayoutParams(org.telegram.ui.Components.kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        if (this.Y != null) {
            TL_account.Password password2 = this.J;
            if (password2 == null || TextUtils.isEmpty(password2.hint)) {
                this.Y[0].setHint(LocaleController.getString(R.string.LoginPassword));
            } else {
                this.Y[0].setHint(this.J.hint);
            }
        }
    }

    public final void T0(ArrayList arrayList) {
        this.i1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_secureValueTypeDriverLicense) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1(int i10) {
        TLRPC.SecureValueType secureValueType;
        boolean z10 = true;
        if (i10 == 0) {
            if (this.R == null) {
                return;
            }
            if (this.i1.size() >= 1) {
                this.R.b(LocaleController.getString(R.string.PassportUploadAdditinalDocument), false);
                return;
            } else {
                this.R.b(LocaleController.getString(R.string.PassportUploadDocument), false);
                return;
            }
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.h9 h9Var = this.W;
            if (h9Var == null) {
                return;
            }
            h9Var.setVisibility(this.j1 != null ? 8 : 0);
            return;
        }
        if (i10 == 4) {
            if (this.X == null) {
                return;
            }
            if (this.k1.size() >= 1) {
                this.X.b(LocaleController.getString(R.string.PassportUploadAdditinalDocument), false);
                return;
            } else {
                this.X.b(LocaleController.getString(R.string.PassportUploadDocument), false);
                return;
            }
        }
        if (i10 != 2) {
            if (i10 != 3 || this.V == null) {
                return;
            }
            TLRPC.SecureValueType secureValueType2 = this.F.type;
            if ((secureValueType2 instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                this.f0.setVisibility(0);
                this.V.setVisibility(this.m1 != null ? 8 : 0);
                return;
            } else {
                this.f0.setVisibility(8);
                this.V.setVisibility(8);
                return;
            }
        }
        org.telegram.ui.Cells.h9 h9Var2 = this.U;
        if (h9Var2 == null) {
            return;
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            if (!tL_secureRequiredType.selfie_required) {
                TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
                if (!(secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                }
            }
            secureValueType = tL_secureRequiredType.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                h9Var2.a(LocaleController.getString(R.string.PassportMainPage), LocaleController.getString(R.string.PassportMainPageInfo), z10);
            } else {
                h9Var2.a(LocaleController.getString(R.string.PassportFrontSide), LocaleController.getString(R.string.PassportFrontSideInfo), z10);
            }
            this.U.setVisibility(this.l1 != null ? 8 : 0);
        }
        z10 = false;
        secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
        }
        h9Var2.a(LocaleController.getString(R.string.PassportMainPage), LocaleController.getString(R.string.PassportMainPageInfo), z10);
        this.U.setVisibility(this.l1 != null ? 8 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jn0 U0(Context context, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        String str3;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        String str4;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        String str5;
        TLRPC.TL_secureValue r12;
        int size = arrayList != null ? arrayList.size() : 0;
        jn0 jn0Var = new jn0(context);
        int i10 = this.b;
        int i11 = i10 == 8 ? 21 : 51;
        TextView textView = new TextView(context);
        jn0Var.a = textView;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = null;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z12 = LocaleController.isRTL;
        jn0Var.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? i11 : 21, 10.0f, z12 ? 21 : i11, 0.0f));
        TextView textView2 = new TextView(context);
        jn0Var.b = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z13 = LocaleController.isRTL;
        jn0Var.addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, (z13 ? 5 : 3) | 48, z13 ? i11 : 21, 35.0f, z13 ? 21 : i11, 0.0f));
        ImageView imageView = new ImageView(context);
        jn0Var.c = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Mh, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageResource(R.drawable.sticker_added);
        jn0Var.addView(imageView, org.telegram.ui.Components.kb1.h(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.d6);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
        jn0Var.setBackground(M0);
        org.telegram.ui.ActionBar.f7.k(jn0Var, M0, N, N2, null);
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            jn0Var.a((arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.PassportPersonalDetails) : (z10 && arrayList.size() == 1) ? q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type) : (z10 && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), q1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : LocaleController.getString(R.string.PassportIdentityDocument), !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            jn0Var.a((arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.PassportAddress) : (z10 && arrayList.size() == 1) ? q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type) : (z10 && arrayList.size() == 2) ? LocaleController.formatString("PassportTwoDocuments", R.string.PassportTwoDocuments, q1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), q1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : LocaleController.getString(R.string.PassportResidentialAddress), !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            jn0Var.a(LocaleController.getString(R.string.PassportPhone), !z11);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            jn0Var.a(LocaleController.getString(R.string.PassportEmail), !z11);
        }
        if (i10 == 8) {
            this.c0.addView(jn0Var, r9.getChildCount() - 5, org.telegram.ui.Components.kb1.r(-1, -2));
        } else {
            this.c0.addView(jn0Var, org.telegram.ui.Components.kb1.r(-1, -2));
        }
        jn0Var.setOnClickListener(new di.y3(arrayList, tL_secureRequiredType, this, z10));
        this.q1.put(tL_secureRequiredType, jn0Var);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.p1;
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
                        int i12 = 0;
                        boolean z14 = false;
                        String str6 = null;
                        while (i12 < size2) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList.get(i12);
                            hashMap2.put(tL_secureRequiredType5, new HashMap());
                            this.r1.put(tL_secureRequiredType5, tL_secureRequiredType);
                            String str7 = str;
                            if (!z14 && (r12 = r1(tL_secureRequiredType5, false)) != null) {
                                TLRPC.TL_secureData tL_secureData2 = r12.data;
                                if (tL_secureData2 != null) {
                                    str6 = h1(tL_secureData2.data, i1(tL_secureData2.secret, tL_secureData2.data_hash), r12.data.data_hash);
                                }
                                tL_secureRequiredType4 = tL_secureRequiredType5;
                                z14 = true;
                            }
                            i12++;
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
                    L1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z10, size);
                    return jn0Var;
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
            L1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z10, size);
            return jn0Var;
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
        L1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z10, size);
        return jn0Var;
    }

    public final void V0(ArrayList arrayList) {
        this.k1.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i10);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                S0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void W0(boolean z10) {
        if (this.g1) {
            return;
        }
        String str = this.n;
        boolean isEmpty = TextUtils.isEmpty(str);
        int i10 = this.b;
        if (isEmpty) {
            if (this.C1) {
                if (z10 || (!this.f1 && (i10 == 5 || i10 == 0))) {
                    getParentActivity().setResult(z10 ? -1 : 0);
                }
                this.g1 = true;
                return;
            }
            return;
        }
        if (z10) {
            qf.d.o(getParentActivity(), Uri.parse(str + "&tg_passport=success"), true, true);
        } else if (!this.f1 && (i10 == 5 || i10 == 0)) {
            qf.d.o(getParentActivity(), Uri.parse(str + "&tg_passport=cancel"), true, true);
        }
        this.g1 = true;
    }

    public final boolean X0(boolean z10) {
        if (u1()) {
            return false;
        }
        if (!z10) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new xl0(this, 1));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DiscardChanges);
        String string = LocaleController.getString(R.string.PassportDiscardChanges);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.T = string;
        showDialog(e2Var);
        return true;
    }

    public final void Y0(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.a0 == null) {
            return;
        }
        String str = (String) this.Y0.get(this.v);
        String str2 = SharedConfig.getCountryLangs().get(this.v);
        int i10 = 0;
        if (!this.E.native_names || TextUtils.isEmpty(this.v) || "EN".equals(str2)) {
            if (this.q0.getVisibility() != 8) {
                this.q0.setVisibility(8);
                this.j0.setVisibility(8);
                this.T.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.a0;
                    if (i10 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i10].getParent()).setVisibility(8);
                    i10++;
                }
                if (((this.c == 0 && this.F != null) || this.H == null || this.v0) && this.I == null) {
                    org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, getParentActivity(), this.m0, null);
                    return;
                } else {
                    org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7, getParentActivity(), this.m0, null);
                    return;
                }
            }
            return;
        }
        int i11 = 2;
        if (this.q0.getVisibility() != 0) {
            this.q0.setVisibility(0);
            this.j0.setVisibility(0);
            this.T.setVisibility(0);
            int i12 = 0;
            while (true) {
                editTextBoldCursorArr = this.a0;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                ((View) editTextBoldCursorArr[i12].getParent()).setVisibility(0);
                i12++;
            }
            if (editTextBoldCursorArr[0].length() == 0 && this.a0[1].length() == 0 && this.a0[2].length() == 0) {
                int i13 = 0;
                while (true) {
                    boolean[] zArr = this.t0;
                    if (i13 >= zArr.length) {
                        break;
                    }
                    if (zArr[i13]) {
                        this.a0[0].setText(this.Y[0].getText());
                        this.a0[1].setText(this.Y[1].getText());
                        this.a0[2].setText(this.Y[2].getText());
                        break;
                    }
                    i13++;
                }
            }
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7, getParentActivity(), this.m0, null);
        }
        this.q0.setText(LocaleController.formatString("PassportNativeInfo", R.string.PassportNativeInfo, str));
        String serverString = str2 != null ? LocaleController.getServerString("PassportLanguage_".concat(str2)) : null;
        if (serverString != null) {
            this.j0.setText(LocaleController.formatString("PassportNativeHeaderLang", R.string.PassportNativeHeaderLang, serverString));
        } else {
            this.j0.setText(LocaleController.getString(R.string.PassportNativeHeader));
        }
        for (int i14 = 0; i14 < 3; i14++) {
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        if (serverString != null) {
                            this.a0[i14].setHintText(LocaleController.getString(R.string.PassportSurname));
                        } else {
                            this.a0[i14].setHintText(LocaleController.formatString("PassportSurnameCountry", R.string.PassportSurnameCountry, str));
                        }
                    }
                } else if (serverString != null) {
                    this.a0[i14].setHintText(LocaleController.getString(R.string.PassportMidname));
                } else {
                    this.a0[i14].setHintText(LocaleController.formatString("PassportMidnameCountry", R.string.PassportMidnameCountry, str));
                }
            } else if (serverString != null) {
                this.a0[i14].setHintText(LocaleController.getString(R.string.PassportName));
            } else {
                this.a0[i14].setHintText(LocaleController.formatString("PassportNameCountry", R.string.PassportNameCountry, str));
            }
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ul0(this, i11));
        }
    }

    public final void a1(boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.p0 == null) {
            return;
        }
        HashMap hashMap = this.w1;
        HashMap hashMap2 = this.y1;
        if (hashMap == null || (!(z10 || hashMap2.containsKey("error_all")) || (str2 = (String) this.w1.get("error_all")) == null)) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str2);
            if (z10) {
                hashMap2.put("error_all", "");
            }
        }
        if (this.x1 != null && ((z10 || hashMap2.containsKey("error_document_all")) && (str = (String) this.x1.get("error_all")) != null)) {
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
            }
            if (z10) {
                hashMap2.put("error_document_all", "");
            }
        }
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.p7, null), 0, spannableStringBuilder.length(), 33);
            this.p0.setText(spannableStringBuilder);
            this.p0.setVisibility(0);
        } else if (this.p0.getVisibility() != 8) {
            this.p0.setVisibility(8);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Mh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(Context context) {
        long j10;
        String str;
        this.Y0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
        this.p0 = i9Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.y6.b7;
        org.telegram.ui.ActionBar.f7.a0(i10, i11, context, i9Var, null);
        int i12 = 0;
        this.p0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.c0.addView(this.p0, org.telegram.ui.Components.kb1.r(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
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
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
            this.j0 = q4Var;
            q4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            org.telegram.ui.Cells.q4 q4Var2 = this.j0;
            int i13 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.f7.i(i13, q4Var2, null);
            this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.c0.addView(this.d0, org.telegram.ui.Components.kb1.r(-1, -2));
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
            this.R = gaVar;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
            int i14 = org.telegram.ui.ActionBar.y6.i6;
            j10 = 0;
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
            gaVar.setBackground(M0);
            org.telegram.ui.ActionBar.f7.k(gaVar, M0, N, N2, null);
            this.c0.addView(this.R, org.telegram.ui.Components.kb1.r(-1, -2));
            this.R.setOnClickListener(new vl0(this, 7));
            org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context);
            this.n0 = i9Var2;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, i11, context, i9Var2, null);
            if (this.c != 0) {
                this.z1 = LocaleController.getString(R.string.PassportAddAddressUploadInfo);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.F.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.z1 = LocaleController.getString(R.string.PassportAddAgreementInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.z1 = LocaleController.getString(R.string.PassportAddBillInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.z1 = LocaleController.getString(R.string.PassportAddPassportRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.z1 = LocaleController.getString(R.string.PassportAddTemporaryRegistrationInfo);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.z1 = LocaleController.getString(R.string.PassportAddBankInfo);
                } else {
                    this.z1 = "";
                }
            }
            String str2 = this.z1;
            HashMap hashMap = this.x1;
            HashMap hashMap2 = this.y1;
            String str3 = str2;
            if (hashMap != null) {
                String str4 = (String) hashMap.get("files_all");
                str3 = str2;
                if (str4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.z1);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.n0.setText(str3);
            this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.q4 q4Var3 = new org.telegram.ui.Cells.q4(context);
                this.j0 = q4Var3;
                q4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                org.telegram.ui.ActionBar.f7.i(i13, this.j0, null);
                this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.h0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.c0.addView(this.h0, org.telegram.ui.Components.kb1.r(-1, -2));
                org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context);
                this.X = gaVar2;
                org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.y6.M0(true);
                org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i13);
                org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i14);
                gaVar2.setBackground(M02);
                org.telegram.ui.ActionBar.f7.k(gaVar2, M02, N3, N4, null);
                this.c0.addView(this.X, org.telegram.ui.Components.kb1.r(-1, -2));
                this.X.setOnClickListener(new vl0(this, 8));
                org.telegram.ui.Cells.i9 i9Var3 = new org.telegram.ui.Cells.i9(context);
                this.o0 = i9Var3;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, i11, context, i9Var3, null);
                if (this.c != 0) {
                    this.A1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.F.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationAgreementInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationBillInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationPassportRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationTemporaryRegistrationInfo);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.A1 = LocaleController.getString(R.string.PassportAddTranslationBankInfo);
                    } else {
                        this.A1 = "";
                    }
                }
                String str5 = this.A1;
                HashMap hashMap3 = this.x1;
                String str6 = str5;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str5;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.A1);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.o0.setText(str6);
                this.c0.addView(this.o0, org.telegram.ui.Components.kb1.r(-1, -2));
            }
        } else {
            j10 = 0;
            this.actionBar.setTitle(LocaleController.getString(R.string.PassportAddress));
        }
        org.telegram.ui.Cells.q4 q4Var4 = new org.telegram.ui.Cells.q4(context);
        this.j0 = q4Var4;
        q4Var4.setText(LocaleController.getString(R.string.PassportAddressHeader));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.j0, null);
        this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
        this.Y = new EditTextBoldCursor[6];
        int i15 = 0;
        while (true) {
            int i16 = 4;
            if (i15 >= 6) {
                break;
            }
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Y[i15] = editTextBoldCursor;
            em0 em0Var = new em0(context, editTextBoldCursor, i12);
            em0Var.setWillNotDraw(false);
            this.c0.addView(em0Var, org.telegram.ui.Components.kb1.r(-1, -2));
            int i17 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.f7.i(i17, em0Var, null);
            if (i15 == 5) {
                View view = new View(context);
                this.S = view;
                org.telegram.ui.ActionBar.f7.i(i17, view, null);
                this.c0.addView(this.S, org.telegram.ui.Components.kb1.r(-1, 6));
            }
            if (this.v0 && this.F != null) {
                em0Var.setVisibility(8);
                View view2 = this.S;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Y[i15].setTag(Integer.valueOf(i15));
            this.Y[i15].setSupportRtlHint(true);
            this.Y[i15].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.B(this.Y[i15], org.telegram.ui.ActionBar.y6.H6, null);
            org.telegram.ui.ActionBar.f7.A(this.Y[i15], org.telegram.ui.ActionBar.y6.L6, null);
            this.Y[i15].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i15];
            int i18 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor2, i18, null);
            this.Y[i15].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.f7.w(this.Y[i15], i18, null);
            this.Y[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i15].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.f7.G(this.Y[i15], org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, null);
            if (i15 == 5) {
                this.Y[i15].setOnTouchListener(new wl0(this, 2));
                this.Y[i15].setInputType(0);
                this.Y[i15].setFocusable(false);
            } else {
                this.Y[i15].setInputType(16385);
                this.Y[i15].setImeOptions(268435461);
            }
            if (i15 == 0) {
                this.Y[i15].setHintText(LocaleController.getString(R.string.PassportStreet1));
                str = "street_line1";
            } else if (i15 == 1) {
                this.Y[i15].setHintText(LocaleController.getString(R.string.PassportStreet2));
                str = "street_line2";
            } else if (i15 == 2) {
                this.Y[i15].setHintText(LocaleController.getString(R.string.PassportPostcode));
                str = "post_code";
            } else if (i15 == 3) {
                this.Y[i15].setHintText(LocaleController.getString(R.string.PassportCity));
                str = "city";
            } else if (i15 == 4) {
                this.Y[i15].setHintText(LocaleController.getString(R.string.PassportState));
                str = "state";
            } else if (i15 != 5) {
                i15++;
            } else {
                this.Y[i15].setHintText(LocaleController.getString(R.string.PassportCountry));
                str = "country_code";
            }
            J1(this.s1, this.Y[i15], str);
            if (i15 == 2) {
                this.Y[i15].addTextChangedListener(new fm0(this, editTextBoldCursor, str));
                this.Y[i15].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Y[i15].addTextChangedListener(new gm0(this, editTextBoldCursor, str, i12));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Y[i15];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Y[i15].setPadding(0, 0, 0, 0);
            this.Y[i15].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            em0Var.addView(this.Y[i15], org.telegram.ui.Components.kb1.h(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Y[i15].setOnEditorActionListener(new tl0(this, i16));
            i15++;
        }
        org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
        this.l0 = f7Var;
        this.c0.addView(f7Var, org.telegram.ui.Components.kb1.r(-1, -2));
        if (this.v0 && this.F != null) {
            this.j0.setVisibility(8);
            this.l0.setVisibility(8);
        }
        long j11 = this.c;
        TLRPC.TL_secureValue tL_secureValue = this.I;
        if (((j11 == j10 && this.F != null) || this.H == null || this.v0) && tL_secureValue == null) {
            org.telegram.ui.Cells.f7 f7Var2 = this.l0;
            int i19 = R.drawable.greydivider_bottom;
            int i20 = org.telegram.ui.ActionBar.y6.b7;
            org.telegram.ui.ActionBar.f7.a0(i19, i20, context, f7Var2, null);
            if (this.v0 && this.F != null) {
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i20, context, this.n0, null);
            }
        } else {
            if (tL_secureValue != null) {
                T0(tL_secureValue.files);
                V0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.f7 f7Var3 = this.l0;
            int i21 = R.drawable.greydivider;
            int i22 = org.telegram.ui.ActionBar.y6.b7;
            org.telegram.ui.ActionBar.f7.a0(i21, i22, context, f7Var3, null);
            org.telegram.ui.Cells.ga gaVar3 = new org.telegram.ui.Cells.ga(context);
            org.telegram.ui.ActionBar.f7.V(gaVar3.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
            org.telegram.ui.Cells.y M03 = org.telegram.ui.ActionBar.y6.M0(true);
            org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.d6);
            org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
            gaVar3.setBackground(M03);
            org.telegram.ui.ActionBar.f7.k(gaVar3, M03, N5, N6, null);
            if (this.F == null) {
                gaVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
            } else {
                gaVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
            }
            this.c0.addView(gaVar3, org.telegram.ui.Components.kb1.r(-1, -2));
            gaVar3.setOnClickListener(new vl0(this, 9));
            org.telegram.ui.Cells.f7 f7Var4 = new org.telegram.ui.Cells.f7(context, (d3) null);
            this.l0 = f7Var4;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i22, context, f7Var4, null);
            this.c0.addView(this.l0, org.telegram.ui.Components.kb1.r(-1, -2));
        }
        T1(0);
        T1(4);
    }

    public final void c1() {
        if (getParentActivity() != null && this.R0 == null) {
            org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(getParentActivity(), this, false, false);
            this.R0 = tiVar;
            tiVar.c2 = new pm0(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a41  */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        int i11;
        TLRPC.User user;
        int i12;
        ArrayList arrayList;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        boolean z10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.User currentUser;
        int i13;
        org.telegram.ui.Components.ti tiVar;
        Context context2 = context;
        int i14 = 0;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i15 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new sm0(this));
        int i16 = 4;
        int i17 = this.b;
        if (i17 == 7) {
            org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(this, context2, i16);
            this.b0 = w1Var;
            this.fragmentView = w1Var;
            w1Var.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.b0, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.s8, false));
        } else {
            FrameLayout frameLayout = new FrameLayout(context2);
            this.fragmentView = frameLayout;
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, frameLayout, null);
            dx dxVar = new dx(context2, i15);
            this.b0 = dxVar;
            dxVar.setFillViewport(true);
            AndroidUtilities.setScrollViewEdgeEffectColor(this.b0, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.s8, false));
            frameLayout.addView(this.b0, org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i17 == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context2);
            this.c0 = linearLayout;
            linearLayout.setOrientation(1);
            this.b0.addView(this.c0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (i17 != 0 && i17 != 8) {
            this.L = this.actionBar.l().h(2, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(context2, 1);
            this.N = erVar;
            erVar.setAlpha(0.0f);
            this.N.setScaleX(0.1f);
            this.N.setScaleY(0.1f);
            this.N.setVisibility(4);
            this.L.addView(this.N, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            if ((i17 == 1 || i17 == 2) && (tiVar = this.R0) != null) {
                try {
                    if (tiVar.isShowing()) {
                        this.R0.dismiss();
                    }
                } catch (Exception unused) {
                }
                this.R0.B1();
                this.R0 = null;
            }
        }
        if (i17 == 5) {
            if (this.y != null) {
                int i18 = 0;
                while (true) {
                    if (i18 >= this.y.users.size()) {
                        currentUser = null;
                        break;
                    }
                    currentUser = this.y.users.get(i18);
                    if (currentUser.id == this.c) {
                        break;
                    }
                    i18++;
                }
            } else {
                currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            }
            FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
            org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context2, null);
            this.F0 = uzVar;
            uzVar.b();
            frameLayout2.addView(this.F0, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context2);
            this.L0 = frameLayout3;
            this.c0.addView(frameLayout3, org.telegram.ui.Components.kb1.r(-1, 100));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context2);
            y9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            this.L0.addView(y9Var, org.telegram.ui.Components.kb1.h(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            y9Var.f(currentUser, new org.telegram.ui.Components.j9(0, currentUser));
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context2);
            this.G0 = i9Var;
            i9Var.getTextView().setGravity(1);
            if (this.c == 0) {
                this.G0.setText(LocaleController.getString(R.string.PassportSelfRequest));
                i13 = 1;
            } else {
                i13 = 1;
                this.G0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", R.string.PassportRequest, UserObject.getFirstName(currentUser))));
            }
            ((FrameLayout.LayoutParams) this.G0.getTextView().getLayoutParams()).gravity = i13;
            this.c0.addView(this.G0, org.telegram.ui.Components.kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
            ImageView imageView = new ImageView(context2);
            this.I0 = imageView;
            imageView.setImageResource(R.drawable.no_password);
            org.telegram.ui.ActionBar.f7.t(this.I0, org.telegram.ui.ActionBar.y6.Xd, null, PorterDuff.Mode.MULTIPLY);
            this.c0.addView(this.I0, org.telegram.ui.Components.kb1.x(-2, -2, 49, 0, 13, 0, 0));
            TextView textView = new TextView(context2);
            this.J0 = textView;
            textView.setTextSize(1, 14.0f);
            this.J0.setGravity(1);
            this.J0.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(17.0f));
            org.telegram.ui.ActionBar.f7.V(this.J0, org.telegram.ui.ActionBar.y6.B6, null);
            this.J0.setText(LocaleController.getString(R.string.TelegramPassportCreatePasswordInfo));
            this.c0.addView(this.J0, org.telegram.ui.Components.kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(context2);
            this.K0 = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.r6, null);
            this.K0.setGravity(17);
            this.K0.setTextSize(1, 16.0f);
            this.K0.setTypeface(AndroidUtilities.bold());
            this.K0.setText(LocaleController.getString(R.string.TelegramPassportCreatePassword));
            this.c0.addView(this.K0, org.telegram.ui.Components.kb1.h(-1, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
            this.K0.setOnClickListener(new vl0(this, 10));
            this.Y = new EditTextBoldCursor[1];
            this.Z = new ViewGroup[]{new FrameLayout(context2)};
            this.c0.addView(this.Z[0], org.telegram.ui.Components.kb1.r(-1, 50));
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.Z[0], null);
            this.Y[0] = new EditTextBoldCursor(context2);
            this.Y[0].setTag(0);
            this.Y[0].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.E(this.Y[0], org.telegram.ui.ActionBar.y6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Y[0];
            int i19 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i19, null);
            this.Y[0].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.f7.w(this.Y[0], i19, null);
            this.Y[0].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[0].setCursorWidth(1.5f);
            this.Y[0].setInputType(129);
            this.Y[0].setMaxLines(1);
            this.Y[0].setLines(1);
            this.Y[0].setSingleLine(true);
            this.Y[0].setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.Y[0].setTypeface(Typeface.DEFAULT);
            this.Y[0].setImeOptions(268435462);
            this.Y[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            this.Y[0].setGravity(LocaleController.isRTL ? 5 : 3);
            this.Z[0].addView(this.Y[0], org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.Y[0].setOnEditorActionListener(new tl0(this, r15));
            this.Y[0].setCustomSelectionActionModeCallback(new li.b1(3));
            org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context2);
            this.H0 = i9Var2;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context2, i9Var2, null);
            this.H0.setText(LocaleController.formatString("PassportRequestPasswordInfo", R.string.PassportRequestPasswordInfo, new Object[0]));
            this.c0.addView(this.H0, org.telegram.ui.Components.kb1.r(-1, -2));
            TextView textView3 = new TextView(context2);
            this.M0 = textView3;
            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.q6, null);
            this.M0.setTextSize(1, 14.0f);
            this.M0.setText(LocaleController.getString(R.string.ForgotPassword));
            this.M0.setPadding(0, 0, 0, 0);
            this.c0.addView(this.M0, org.telegram.ui.Components.kb1.x(-2, 30, (LocaleController.isRTL ? 5 : 3) | 48, 21, 0, 21, 0));
            this.M0.setOnClickListener(new vl0(this, 11));
            S1();
        } else if (i17 == 0) {
            if (this.y != null) {
                for (int i20 = 0; i20 < this.y.users.size(); i20++) {
                    TLRPC.User user2 = this.y.users.get(i20);
                    if (user2.id == this.c) {
                        user = user2;
                        break;
                    }
                }
            }
            user = null;
            FrameLayout frameLayout4 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
            this.actionBar.l().a(1, R.drawable.msg_info);
            if (user != null) {
                FrameLayout frameLayout5 = new FrameLayout(context2);
                this.c0.addView(frameLayout5, org.telegram.ui.Components.kb1.r(-1, 100));
                org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context2);
                y9Var2.setRoundRadius(AndroidUtilities.dp(32.0f));
                frameLayout5.addView(y9Var2, org.telegram.ui.Components.kb1.h(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
                y9Var2.f(user, new org.telegram.ui.Components.j9(0, user));
                org.telegram.ui.Cells.i9 i9Var3 = new org.telegram.ui.Cells.i9(context2);
                this.n0 = i9Var3;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_top, org.telegram.ui.ActionBar.y6.b7, context2, i9Var3, null);
                this.n0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportRequest", R.string.PassportRequest, UserObject.getFirstName(user))));
                this.n0.getTextView().setGravity(1);
                ((FrameLayout.LayoutParams) this.n0.getTextView().getLayoutParams()).gravity = 1;
                this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
            }
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context2);
            this.j0 = q4Var;
            q4Var.setText(LocaleController.getString(R.string.PassportRequestedInformation));
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.j0, null);
            this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
            TL_account.authorizationForm authorizationform = this.y;
            if (authorizationform != null) {
                int size = authorizationform.required_types.size();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                boolean z11 = false;
                boolean z12 = false;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < size) {
                    TLRPC.SecureRequiredType secureRequiredType = this.y.required_types.get(i21);
                    if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                        if (v1(tL_secureRequiredType3.type)) {
                            arrayList4.add(tL_secureRequiredType3);
                            i22++;
                        } else if (t1(tL_secureRequiredType3.type)) {
                            arrayList5.add(tL_secureRequiredType3);
                            i23++;
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
                            TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(i14);
                            if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                                if (v1(tL_secureRequiredType4.type)) {
                                    int size2 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i24 = i14; i24 < size2; i24++) {
                                        TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i24);
                                        if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                        }
                                    }
                                    i22++;
                                } else if (t1(tL_secureRequiredType4.type)) {
                                    int size3 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i25 = 0; i25 < size3; i25++) {
                                        TLRPC.SecureRequiredType secureRequiredType4 = tL_secureRequiredTypeOneOf.types.get(i25);
                                        if (secureRequiredType4 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList5.add((TLRPC.TL_secureRequiredType) secureRequiredType4);
                                        }
                                    }
                                    i23++;
                                }
                            }
                        }
                    }
                    i21++;
                    i14 = 0;
                }
                boolean z13 = !z11 || i22 > 1;
                boolean z14 = !z12 || i23 > 1;
                int i26 = 0;
                while (i26 < size) {
                    TLRPC.SecureRequiredType secureRequiredType5 = this.y.required_types.get(i26);
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
                        U0(context, tL_secureRequiredType2, arrayList, z10, i26 != size + (-1));
                    } else if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                        if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                            if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                if ((z13 && v1(tL_secureRequiredType6.type)) || (z14 && t1(tL_secureRequiredType6.type))) {
                                    arrayList = new ArrayList();
                                    int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                    for (int i27 = 0; i27 < size4; i27++) {
                                        TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i27);
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
                                    U0(context, tL_secureRequiredType2, arrayList, z10, i26 != size + (-1));
                                }
                            }
                        }
                    }
                    i26++;
                }
                context2 = context;
            }
            if (user != null) {
                org.telegram.ui.Cells.i9 i9Var4 = new org.telegram.ui.Cells.i9(context2);
                this.n0 = i9Var4;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context2, i9Var4, null);
                org.telegram.ui.Cells.i9 i9Var5 = this.n0;
                int i28 = org.telegram.ui.ActionBar.y6.B6;
                i9Var5.setLinkTextColorKey(i28);
                if (TextUtils.isEmpty(this.y.privacy_policy_url)) {
                    i12 = 1;
                    this.n0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("PassportNoPolicy", R.string.PassportNoPolicy, UserObject.getFirstName(user), user.username)));
                } else {
                    String formatString = LocaleController.formatString("PassportPolicy", R.string.PassportPolicy, UserObject.getFirstName(user), user.username);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                    int indexOf = formatString.indexOf(42);
                    int lastIndexOf = formatString.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        this.n0.getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new zm0(this), indexOf, lastIndexOf - 1, 33);
                    }
                    this.n0.setText(spannableStringBuilder);
                    i12 = 1;
                }
                org.telegram.ui.ActionBar.f7.D(this.n0.getTextView(), i28, null);
                this.n0.getTextView().setGravity(i12);
                this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
            }
            FrameLayout frameLayout6 = new FrameLayout(context2);
            this.Q = frameLayout6;
            int i29 = org.telegram.ui.ActionBar.y6.rh;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i29, false);
            int i30 = org.telegram.ui.ActionBar.y6.sh;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.y6.h0(x02, org.telegram.ui.ActionBar.y6.x0(null, i30, false));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i29);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i30);
            frameLayout6.setBackground(h02);
            org.telegram.ui.ActionBar.f7.k(frameLayout6, h02, N, N2, null);
            frameLayout4.addView(this.Q, org.telegram.ui.Components.kb1.i(-1, 48, 80));
            this.Q.setOnClickListener(new vl0(this, 15));
            TextView textView4 = new TextView(context2);
            this.O = textView4;
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
            this.O.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
            org.telegram.ui.ActionBar.f7.V(this.O, org.telegram.ui.ActionBar.y6.th, null);
            this.O.setText(LocaleController.getString(R.string.PassportAuthorize));
            this.O.setTextSize(1, 14.0f);
            this.O.setGravity(17);
            this.O.setTypeface(AndroidUtilities.bold());
            this.Q.addView(this.O, org.telegram.ui.Components.kb1.i(-2, -1, 17));
            org.telegram.ui.Components.er erVar2 = new org.telegram.ui.Components.er(context2, 0);
            this.P = erVar2;
            erVar2.setVisibility(4);
            this.Q.addView(this.P, org.telegram.ui.Components.kb1.g(-1.0f, -1));
            View view = new View(context2);
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            frameLayout4.addView(view, org.telegram.ui.Components.kb1.h(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        } else if (i17 == 1) {
            e1(context);
            if (this.a == null) {
                this.a = m1();
            }
        } else if (i17 == 2) {
            b1(context);
            if (this.a == null) {
                this.a = m1();
            }
        } else if (i17 == 3) {
            g1(context);
        } else {
            int i31 = 6;
            if (i17 == 4) {
                this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                if (TextUtils.isEmpty(this.d1)) {
                    i10 = -1;
                } else {
                    org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context2);
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.q6, null);
                    org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
                    org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.d6);
                    org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
                    gaVar.setBackground(M0);
                    org.telegram.ui.ActionBar.f7.k(gaVar, M0, N3, N4, null);
                    gaVar.b(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, this.d1), false);
                    this.c0.addView(gaVar, org.telegram.ui.Components.kb1.r(-1, -2));
                    gaVar.setOnClickListener(new vl0(this, i31));
                    org.telegram.ui.Cells.i9 i9Var6 = new org.telegram.ui.Cells.i9(context2);
                    this.n0 = i9Var6;
                    org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context2, i9Var6, null);
                    this.n0.setText(LocaleController.getString(R.string.PassportPhoneUseSameEmailInfo));
                    i10 = -1;
                    this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
                }
                this.Y = new EditTextBoldCursor[1];
                FrameLayout frameLayout7 = new FrameLayout(context2);
                this.c0.addView(frameLayout7, org.telegram.ui.Components.kb1.r(i10, 50));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, frameLayout7, null);
                this.Y[0] = new EditTextBoldCursor(context2);
                this.Y[0].setTag(0);
                this.Y[0].setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.f7.E(this.Y[0], org.telegram.ui.ActionBar.y6.H6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Y[0];
                int i32 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.ui.ActionBar.f7.V(editTextBoldCursor2, i32, null);
                this.Y[0].setBackgroundDrawable(null);
                org.telegram.ui.ActionBar.f7.w(this.Y[0], i32, null);
                this.Y[0].setCursorSize(AndroidUtilities.dp(20.0f));
                this.Y[0].setCursorWidth(1.5f);
                this.Y[0].setInputType(33);
                this.Y[0].setImeOptions(268435462);
                this.Y[0].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                TLRPC.TL_secureValue tL_secureValue = this.H;
                if (tL_secureValue != null) {
                    TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
                    if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                        TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                        if (!TextUtils.isEmpty(tL_securePlainEmail.email)) {
                            i11 = 0;
                            this.Y[0].setText(tL_securePlainEmail.email);
                            EditTextBoldCursor editTextBoldCursor3 = this.Y[i11];
                            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                            this.Y[i11].setPadding(i11, i11, i11, AndroidUtilities.dp(6.0f));
                            this.Y[i11].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout7.addView(this.Y[i11], org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            this.Y[i11].setOnEditorActionListener(new tl0(this, 3));
                            org.telegram.ui.Cells.i9 i9Var7 = new org.telegram.ui.Cells.i9(context2);
                            this.n0 = i9Var7;
                            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context2, i9Var7, null);
                            this.n0.setText(LocaleController.getString(R.string.PassportEmailUploadInfo));
                            this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
                        }
                    }
                }
                i11 = 0;
                EditTextBoldCursor editTextBoldCursor32 = this.Y[i11];
                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                this.Y[i11].setPadding(i11, i11, i11, AndroidUtilities.dp(6.0f));
                this.Y[i11].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout7.addView(this.Y[i11], org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.Y[i11].setOnEditorActionListener(new tl0(this, 3));
                org.telegram.ui.Cells.i9 i9Var72 = new org.telegram.ui.Cells.i9(context2);
                this.n0 = i9Var72;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context2, i9Var72, null);
                this.n0.setText(LocaleController.getString(R.string.PassportEmailUploadInfo));
                this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
            } else {
                HashMap hashMap = this.s1;
                if (i17 == 6) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PassportEmail));
                    this.Y = new EditTextBoldCursor[1];
                    FrameLayout frameLayout8 = new FrameLayout(context2);
                    this.c0.addView(frameLayout8, org.telegram.ui.Components.kb1.r(-1, 50));
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, frameLayout8, null);
                    this.Y[0] = new EditTextBoldCursor(context2);
                    this.Y[0].setTag(0);
                    this.Y[0].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.f7.E(this.Y[0], org.telegram.ui.ActionBar.y6.H6, null);
                    EditTextBoldCursor editTextBoldCursor4 = this.Y[0];
                    int i33 = org.telegram.ui.ActionBar.y6.G6;
                    org.telegram.ui.ActionBar.f7.V(editTextBoldCursor4, i33, null);
                    this.Y[0].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.f7.w(this.Y[0], i33, null);
                    this.Y[0].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.Y[0].setCursorWidth(1.5f);
                    this.Y[0].setInputType(3);
                    this.Y[0].setImeOptions(268435462);
                    this.Y[0].setHint(LocaleController.getString(R.string.PassportEmailCode));
                    EditTextBoldCursor editTextBoldCursor5 = this.Y[0];
                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                    this.Y[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    this.Y[0].setGravity(LocaleController.isRTL ? 5 : 3);
                    frameLayout8.addView(this.Y[0], org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    this.Y[0].setOnEditorActionListener(new tl0(this, i31));
                    this.Y[0].addTextChangedListener(new m0(this, 12));
                    org.telegram.ui.Cells.i9 i9Var8 = new org.telegram.ui.Cells.i9(context2);
                    this.n0 = i9Var8;
                    org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context2, i9Var8, null);
                    this.n0.setText(LocaleController.formatString("PassportEmailVerifyInfo", R.string.PassportEmailVerifyInfo, hashMap.get("email")));
                    this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
                } else if (i17 == 7) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
                    FrameLayout frameLayout9 = new FrameLayout(context2);
                    this.b0.addView(frameLayout9, org.telegram.ui.Components.kb1.B(-1, -2, 51));
                    for (int i34 = 0; i34 < 3; i34++) {
                        gn0 gn0Var = new gn0(this, context2, i34 + 2);
                        org.telegram.ui.Components.bx0[] bx0VarArr = this.J1;
                        bx0VarArr[i34] = gn0Var;
                        gn0Var.setVisibility(8);
                        frameLayout9.addView(bx0VarArr[i34], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 30.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", (String) hashMap.get("phone"));
                    l1(bundle, this.K, false);
                } else if (i17 == 8) {
                    f1(context);
                }
            }
        }
        return this.fragmentView;
    }

    public final void d1() {
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new cf0(2, this, zArr));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = string;
        boolean z10 = this.v0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.E;
        if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            e2Var.T = LocaleController.getString(R.string.PassportDeleteAddressAlert);
        } else if (z10 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            e2Var.T = LocaleController.getString(R.string.PassportDeletePersonalAlert);
        } else {
            e2Var.T = LocaleController.getString(R.string.PassportDeleteDocumentAlert);
        }
        if (!this.v0 && this.F != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1);
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(false);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
            y1Var.setBackground(M0);
            org.telegram.ui.ActionBar.f7.k(y1Var, M0, null, N, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                y1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentAddress), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                y1Var.e(LocaleController.getString(R.string.PassportDeleteDocumentPersonal), "", true, false, false);
            }
            y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(y1Var, org.telegram.ui.Components.kb1.i(-1, 48, 51));
            y1Var.setOnClickListener(new p8(4, zArr));
            alertDialog$Builder.o(frameLayout);
        }
        showDialog(e2Var);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        in0 in0Var;
        org.telegram.ui.ActionBar.w0 w0Var;
        if (i10 != NotificationCenter.fileUploaded) {
            if (i10 != NotificationCenter.fileUploadFailed && i10 == NotificationCenter.twoStepPasswordChanged) {
                if (objArr == null || objArr.length <= 0) {
                    this.J = null;
                    w1();
                } else {
                    Object obj = objArr[7];
                    if (obj != null && (editTextBoldCursor = this.Y[0]) != null) {
                        editTextBoldCursor.setText((String) obj);
                    }
                    if (objArr[6] == null) {
                        TL_account.TL_password tL_password = new TL_account.TL_password();
                        this.J = tL_password;
                        tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                        tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                        tL_password.secure_random = (byte[]) objArr[3];
                        tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                        TL_account.Password password = this.J;
                        password.hint = (String) objArr[5];
                        password.srp_id = -1L;
                        byte[] bArr = new byte[256];
                        password.srp_B = bArr;
                        Utilities.random.nextBytes(bArr);
                        EditTextBoldCursor editTextBoldCursor2 = this.Y[0];
                        if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                            this.N0 = 2;
                        }
                    }
                }
                S1();
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        HashMap hashMap = this.o1;
        SecureDocument secureDocument = (SecureDocument) hashMap.get(str);
        if (secureDocument != null) {
            secureDocument.inputFile = (TLRPC.TL_inputFile) objArr[1];
            hashMap.remove(str);
            if (hashMap.isEmpty() && (w0Var = this.L) != null) {
                w0Var.setEnabled(true);
                this.L.setAlpha(1.0f);
            }
            HashMap hashMap2 = this.n1;
            if (hashMap2 != null && (in0Var = (in0) hashMap2.get(secureDocument)) != null) {
                in0Var.a(true);
            }
            HashMap hashMap3 = this.y1;
            if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                hashMap3.remove("error_document_all");
                a1(false);
            }
            int i12 = secureDocument.type;
            if (i12 == 0) {
                if (this.n0 != null && !TextUtils.isEmpty(this.z1)) {
                    this.n0.setText(this.z1);
                }
                hashMap3.remove("files_all");
                return;
            }
            if (i12 == 4) {
                if (this.o0 != null && !TextUtils.isEmpty(this.A1)) {
                    this.o0.setText(this.A1);
                }
                hashMap3.remove("translation_all");
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar == null || this.visibleDialog != tiVar) {
            super.dismissCurrentDialog();
            return;
        }
        tiVar.j0.b0(false);
        this.R0.dismissInternal();
        this.R0.j0.e0(true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.R0 && super.dismissDialogOnPause(dialog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1(Context context) {
        long j10;
        String str;
        String str2;
        this.Y0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
        this.p0 = i9Var;
        int i10 = R.drawable.greydivider_top;
        int i11 = org.telegram.ui.ActionBar.y6.b7;
        org.telegram.ui.ActionBar.f7.a0(i10, i11, context, i9Var, null);
        boolean z10 = false;
        this.p0.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        int i12 = -1;
        this.c0.addView(this.p0, org.telegram.ui.Components.kb1.r(-1, -2));
        a1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.E;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
            this.j0 = q4Var;
            if (this.v0) {
                q4Var.setText(LocaleController.getString(R.string.PassportDocuments));
            } else {
                q4Var.setText(LocaleController.getString(R.string.PassportRequiredDocuments));
            }
            org.telegram.ui.Cells.q4 q4Var2 = this.j0;
            int i13 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.f7.i(i13, q4Var2, null);
            this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.c0.addView(this.e0, org.telegram.ui.Components.kb1.r(-1, -2));
            org.telegram.ui.Cells.h9 h9Var = new org.telegram.ui.Cells.h9(context);
            this.U = h9Var;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
            int i14 = org.telegram.ui.ActionBar.y6.i6;
            j10 = 0;
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
            h9Var.setBackground(M0);
            org.telegram.ui.ActionBar.f7.k(h9Var, M0, N, N2, null);
            this.c0.addView(this.U, org.telegram.ui.Components.kb1.r(-1, -2));
            this.U.setOnClickListener(new vl0(this, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.c0.addView(this.f0, org.telegram.ui.Components.kb1.r(-1, -2));
            boolean z11 = this.F.selfie_required;
            org.telegram.ui.Cells.h9 h9Var2 = new org.telegram.ui.Cells.h9(context);
            this.V = h9Var2;
            org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.y6.M0(true);
            org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i13);
            org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i14);
            h9Var2.setBackground(M02);
            org.telegram.ui.ActionBar.f7.k(h9Var2, M02, N3, N4, null);
            this.V.a(LocaleController.getString(R.string.PassportReverseSide), LocaleController.getString(R.string.PassportReverseSideInfo), z11);
            this.c0.addView(this.V, org.telegram.ui.Components.kb1.r(-1, -2));
            this.V.setOnClickListener(new vl0(this, 2));
            if (this.F.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.g0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.c0.addView(this.g0, org.telegram.ui.Components.kb1.r(-1, -2));
                org.telegram.ui.Cells.h9 h9Var3 = new org.telegram.ui.Cells.h9(context);
                this.W = h9Var3;
                org.telegram.ui.Cells.y M03 = org.telegram.ui.ActionBar.y6.M0(true);
                org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i13);
                org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(i14);
                h9Var3.setBackground(M03);
                org.telegram.ui.ActionBar.f7.k(h9Var3, M03, N5, N6, null);
                this.W.a(LocaleController.getString(R.string.PassportSelfie), LocaleController.getString(R.string.PassportSelfieInfo), tL_secureRequiredType2.translation_required);
                this.c0.addView(this.W, org.telegram.ui.Components.kb1.r(-1, -2));
                this.W.setOnClickListener(new vl0(this, 3));
            }
            org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context);
            this.n0 = i9Var2;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, i11, context, i9Var2, null);
            this.n0.setText(LocaleController.getString(R.string.PassportPersonalUploadInfo));
            this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.q4 q4Var3 = new org.telegram.ui.Cells.q4(context);
                this.j0 = q4Var3;
                q4Var3.setText(LocaleController.getString(R.string.PassportTranslation));
                org.telegram.ui.ActionBar.f7.i(i13, this.j0, null);
                this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.h0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.c0.addView(this.h0, org.telegram.ui.Components.kb1.r(-1, -2));
                org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
                this.X = gaVar;
                org.telegram.ui.Cells.y M04 = org.telegram.ui.ActionBar.y6.M0(true);
                org.telegram.ui.ActionBar.b7 N7 = org.telegram.ui.ActionBar.f7.N(i13);
                org.telegram.ui.ActionBar.b7 N8 = org.telegram.ui.ActionBar.f7.N(i14);
                gaVar.setBackground(M04);
                org.telegram.ui.ActionBar.f7.k(gaVar, M04, N7, N8, null);
                this.c0.addView(this.X, org.telegram.ui.Components.kb1.r(-1, -2));
                this.X.setOnClickListener(new vl0(this, 4));
                org.telegram.ui.Cells.i9 i9Var3 = new org.telegram.ui.Cells.i9(context);
                this.o0 = i9Var3;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, i11, context, i9Var3, null);
                if (this.c != 0) {
                    this.A1 = LocaleController.getString(R.string.PassportAddTranslationUploadInfo);
                } else {
                    TLRPC.SecureValueType secureValueType = this.F.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.A1 = LocaleController.getString(R.string.PassportAddPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.A1 = LocaleController.getString(R.string.PassportAddInternalPassportInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.A1 = LocaleController.getString(R.string.PassportAddIdentityCardInfo);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.A1 = LocaleController.getString(R.string.PassportAddDriverLicenceInfo);
                    } else {
                        this.A1 = "";
                    }
                }
                String str3 = this.A1;
                HashMap hashMap = this.x1;
                String str4 = str3;
                if (hashMap != null) {
                    String str5 = (String) hashMap.get("translation_all");
                    str4 = str3;
                    if (str5 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.A1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.p7, null), 0, str5.length(), 33);
                        this.y1.put("translation_all", "");
                        str4 = spannableStringBuilder;
                    }
                }
                this.o0.setText(str4);
                this.c0.addView(this.o0, org.telegram.ui.Components.kb1.r(-1, -2));
            }
        } else {
            j10 = 0;
            org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context);
            this.r0 = gaVar2;
            org.telegram.ui.Cells.y M05 = org.telegram.ui.ActionBar.y6.M0(true);
            org.telegram.ui.ActionBar.b7 N9 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.d6);
            org.telegram.ui.ActionBar.b7 N10 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
            gaVar2.setBackground(M05);
            org.telegram.ui.ActionBar.f7.k(gaVar2, M05, N9, N10, null);
            this.r0.b(LocaleController.getString(R.string.PassportScanPassport), false);
            this.c0.addView(this.r0, org.telegram.ui.Components.kb1.r(-1, -2));
            this.r0.setOnClickListener(new vl0(this, 5));
            org.telegram.ui.Cells.i9 i9Var4 = new org.telegram.ui.Cells.i9(context);
            this.n0 = i9Var4;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, i11, context, i9Var4, null);
            this.n0.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
        }
        org.telegram.ui.Cells.q4 q4Var4 = new org.telegram.ui.Cells.q4(context);
        this.j0 = q4Var4;
        if (this.v0) {
            q4Var4.setText(LocaleController.getString(R.string.PassportDocument));
        } else {
            q4Var4.setText(LocaleController.getString(R.string.PassportPersonal));
        }
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.j0, null);
        this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
        int i15 = 7;
        int i16 = this.F != null ? 9 : 7;
        this.Y = new EditTextBoldCursor[i16];
        int i17 = 0;
        while (true) {
            HashMap hashMap2 = this.s1;
            if (i17 >= i16) {
                org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                this.m0 = f7Var;
                this.c0.addView(f7Var, org.telegram.ui.Components.kb1.r(-1, -2));
                org.telegram.ui.Cells.q4 q4Var5 = new org.telegram.ui.Cells.q4(context);
                this.j0 = q4Var5;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var5, null);
                this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
                this.a0 = new EditTextBoldCursor[3];
                int i18 = 0;
                for (int i19 = 3; i18 < i19; i19 = 3) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.a0[i18] = editTextBoldCursor;
                    em0 em0Var = new em0(context, editTextBoldCursor, 2);
                    em0Var.setWillNotDraw(false);
                    this.c0.addView(em0Var, org.telegram.ui.Components.kb1.r(-1, 64));
                    int i20 = org.telegram.ui.ActionBar.y6.d6;
                    org.telegram.ui.ActionBar.f7.i(i20, em0Var, null);
                    if (i18 == 2) {
                        View view = new View(context);
                        this.T = view;
                        org.telegram.ui.ActionBar.f7.i(i20, view, null);
                        this.c0.addView(this.T, org.telegram.ui.Components.kb1.r(-1, 6));
                    }
                    this.a0[i18].setTag(Integer.valueOf(i18));
                    this.a0[i18].setSupportRtlHint(true);
                    this.a0[i18].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.f7.B(this.a0[i18], org.telegram.ui.ActionBar.y6.H6, null);
                    EditTextBoldCursor editTextBoldCursor2 = this.a0[i18];
                    int i21 = org.telegram.ui.ActionBar.y6.G6;
                    org.telegram.ui.ActionBar.f7.V(editTextBoldCursor2, i21, null);
                    org.telegram.ui.ActionBar.f7.A(this.a0[i18], org.telegram.ui.ActionBar.y6.L6, null);
                    this.a0[i18].setTransformHintToHeader(true);
                    this.a0[i18].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.f7.w(this.a0[i18], i21, null);
                    this.a0[i18].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.a0[i18].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.f7.G(this.a0[i18], org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, null);
                    this.a0[i18].setInputType(16385);
                    this.a0[i18].setImeOptions(268435461);
                    if (i18 == 0) {
                        str = "first_name_native";
                    } else if (i18 == 1) {
                        str = "middle_name_native";
                    } else if (i18 != 2) {
                        i18++;
                    } else {
                        str = "last_name_native";
                    }
                    J1(hashMap2, this.a0[i18], str);
                    EditTextBoldCursor editTextBoldCursor3 = this.a0[i18];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    if (i18 == 0 || i18 == 2 || i18 == 1) {
                        this.a0[i18].addTextChangedListener(new gm0(this, editTextBoldCursor, str, 1));
                    }
                    this.a0[i18].setPadding(0, 0, 0, 0);
                    this.a0[i18].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var.addView(this.a0[i18], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.a0[i18].setOnEditorActionListener(new tl0(this, 2));
                    i18++;
                }
                org.telegram.ui.Cells.i9 i9Var5 = new org.telegram.ui.Cells.i9(context);
                this.q0 = i9Var5;
                this.c0.addView(i9Var5, org.telegram.ui.Components.kb1.r(-1, -2));
                long j11 = this.c;
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (((j11 == j10 && this.F != null) || this.H == null || this.v0) && tL_secureValue == null) {
                    org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context, this.q0, null);
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
                    org.telegram.ui.Cells.ga gaVar3 = new org.telegram.ui.Cells.ga(context);
                    org.telegram.ui.ActionBar.f7.V(gaVar3.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
                    org.telegram.ui.Cells.y M06 = org.telegram.ui.ActionBar.y6.M0(true);
                    org.telegram.ui.ActionBar.b7 N11 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.d6);
                    org.telegram.ui.ActionBar.b7 N12 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
                    gaVar3.setBackground(M06);
                    org.telegram.ui.ActionBar.f7.k(gaVar3, M06, N11, N12, null);
                    if (this.F == null) {
                        gaVar3.b(LocaleController.getString(R.string.PassportDeleteInfo), false);
                    } else {
                        gaVar3.b(LocaleController.getString(R.string.PassportDeleteDocument), false);
                    }
                    this.c0.addView(gaVar3, org.telegram.ui.Components.kb1.r(-1, -2));
                    gaVar3.setOnClickListener(new vl0(this, 1));
                    org.telegram.ui.Cells.i9 i9Var6 = this.q0;
                    int i22 = R.drawable.greydivider;
                    int i23 = org.telegram.ui.ActionBar.y6.b7;
                    org.telegram.ui.ActionBar.f7.a0(i22, i23, context, i9Var6, null);
                    org.telegram.ui.Cells.f7 f7Var2 = new org.telegram.ui.Cells.f7(context, (d3) null);
                    this.l0 = f7Var2;
                    org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i23, context, f7Var2, null);
                    this.c0.addView(this.l0, org.telegram.ui.Components.kb1.r(-1, -2));
                }
                Q1();
                Y0(false);
                return;
            }
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            this.Y[i17] = editTextBoldCursor4;
            em0 em0Var2 = new em0(context, editTextBoldCursor4, 1);
            em0Var2.setWillNotDraw(z10);
            this.c0.addView(em0Var2, org.telegram.ui.Components.kb1.r(i12, 64));
            int i24 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.f7.i(i24, em0Var2, null);
            if (i17 == i16 - 1) {
                View view2 = new View(context);
                this.S = view2;
                org.telegram.ui.ActionBar.f7.i(i24, view2, null);
                this.c0.addView(this.S, org.telegram.ui.Components.kb1.r(i12, 6));
            }
            if (this.v0 && this.F != null && i17 < i15) {
                em0Var2.setVisibility(8);
                View view3 = this.S;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            this.Y[i17].setTag(Integer.valueOf(i17));
            this.Y[i17].setSupportRtlHint(true);
            this.Y[i17].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.B(this.Y[i17], org.telegram.ui.ActionBar.y6.H6, null);
            EditTextBoldCursor editTextBoldCursor5 = this.Y[i17];
            int i25 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor5, i25, null);
            org.telegram.ui.ActionBar.f7.A(this.Y[i17], org.telegram.ui.ActionBar.y6.L6, null);
            this.Y[i17].setTransformHintToHeader(true);
            this.Y[i17].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.f7.w(this.Y[i17], i25, null);
            this.Y[i17].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i17].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.f7.G(this.Y[i17], org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, null);
            if (i17 == 5 || i17 == 6) {
                this.Y[i17].setOnTouchListener(new wl0(this, 0));
                this.Y[i17].setInputType(0);
            } else if (i17 == 3 || i17 == 8) {
                this.Y[i17].setOnTouchListener(new fi.o1(7, this, context));
                this.Y[i17].setInputType(0);
                this.Y[i17].setFocusable(false);
            } else if (i17 == 4) {
                this.Y[i17].setOnTouchListener(new wl0(this, 1));
                this.Y[i17].setInputType(0);
                this.Y[i17].setFocusable(false);
            } else {
                this.Y[i17].setInputType(16385);
                this.Y[i17].setImeOptions(268435461);
            }
            HashMap hashMap3 = this.t1;
            switch (i17) {
                case 0:
                    if (tL_secureRequiredType2.native_names) {
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportNameLatin));
                    } else {
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportName));
                    }
                    str2 = "first_name";
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor6 = this.Y[i17];
                    editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                    if (i17 != 0 || i17 == 2 || i17 == 1) {
                        this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    } else {
                        this.Y[i17].addTextChangedListener(new org.telegram.ui.Components.qy0(this, editTextBoldCursor4, str2, hashMap2));
                    }
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
                case 1:
                    if (tL_secureRequiredType2.native_names) {
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportMidnameLatin));
                    } else {
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportMidname));
                    }
                    str2 = "middle_name";
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor62 = this.Y[i17];
                    editTextBoldCursor62.setSelection(editTextBoldCursor62.length());
                    if (i17 != 0) {
                        break;
                    }
                    this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
                case 2:
                    if (tL_secureRequiredType2.native_names) {
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportSurnameLatin));
                    } else {
                        this.Y[i17].setHintText(LocaleController.getString(R.string.PassportSurname));
                    }
                    str2 = "last_name";
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor622 = this.Y[i17];
                    editTextBoldCursor622.setSelection(editTextBoldCursor622.length());
                    if (i17 != 0) {
                    }
                    this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
                case 3:
                    this.Y[i17].setHintText(LocaleController.getString(R.string.PassportBirthdate));
                    str2 = "birth_date";
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor6222 = this.Y[i17];
                    editTextBoldCursor6222.setSelection(editTextBoldCursor6222.length());
                    if (i17 != 0) {
                    }
                    this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
                case 4:
                    this.Y[i17].setHintText(LocaleController.getString(R.string.PassportGender));
                    str2 = "gender";
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor62222 = this.Y[i17];
                    editTextBoldCursor62222.setSelection(editTextBoldCursor62222.length());
                    if (i17 != 0) {
                    }
                    this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
                case 5:
                    this.Y[i17].setHintText(LocaleController.getString(R.string.PassportCitizenship));
                    str2 = "country_code";
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor622222 = this.Y[i17];
                    editTextBoldCursor622222.setSelection(editTextBoldCursor622222.length());
                    if (i17 != 0) {
                    }
                    this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
                case 6:
                    this.Y[i17].setHintText(LocaleController.getString(R.string.PassportResidence));
                    str2 = "residence_country_code";
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor6222222 = this.Y[i17];
                    editTextBoldCursor6222222.setSelection(editTextBoldCursor6222222.length());
                    if (i17 != 0) {
                    }
                    this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
                case 7:
                    this.Y[i17].setHintText(LocaleController.getString(R.string.PassportDocumentNumber));
                    str2 = "document_no";
                    hashMap2 = hashMap3;
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor62222222 = this.Y[i17];
                    editTextBoldCursor62222222.setSelection(editTextBoldCursor62222222.length());
                    if (i17 != 0) {
                    }
                    this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
                case 8:
                    this.Y[i17].setHintText(LocaleController.getString(R.string.PassportExpired));
                    str2 = "expiry_date";
                    hashMap2 = hashMap3;
                    J1(hashMap2, this.Y[i17], str2);
                    EditTextBoldCursor editTextBoldCursor622222222 = this.Y[i17];
                    editTextBoldCursor622222222.setSelection(editTextBoldCursor622222222.length());
                    if (i17 != 0) {
                    }
                    this.Y[i17].addTextChangedListener(new im0(this, editTextBoldCursor4, str2));
                    this.Y[i17].setPadding(0, 0, 0, 0);
                    this.Y[i17].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    em0Var2.addView(this.Y[i17], org.telegram.ui.Components.kb1.h(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i17].setOnEditorActionListener(new tl0(this, 1));
                    break;
            }
            i17++;
            i15 = 7;
            z10 = false;
            i12 = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(Context context) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList arrayList;
        boolean z10;
        kn0 kn0Var = this;
        Context context2 = context;
        kn0Var.actionBar.setTitle(LocaleController.getString(R.string.TelegramPassport));
        kn0Var.actionBar.l().a(1, R.drawable.msg_info);
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context2);
        kn0Var.j0 = q4Var;
        q4Var.setText(LocaleController.getString(R.string.PassportProvidedInformation));
        org.telegram.ui.Cells.q4 q4Var2 = kn0Var.j0;
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i10, q4Var2, null);
        kn0Var.c0.addView(kn0Var.j0, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context2, (d3) null);
        kn0Var.l0 = f7Var;
        int i11 = R.drawable.greydivider;
        int i12 = org.telegram.ui.ActionBar.y6.b7;
        org.telegram.ui.ActionBar.f7.a0(i11, i12, context2, f7Var, null);
        kn0Var.c0.addView(kn0Var.l0, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context2);
        kn0Var.x0 = gaVar;
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        int i13 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
        gaVar.setBackground(M0);
        org.telegram.ui.ActionBar.f7.k(gaVar, M0, N, N2, null);
        kn0Var.x0.b(LocaleController.getString(R.string.PassportNoDocumentsAdd), true);
        kn0Var.c0.addView(kn0Var.x0, org.telegram.ui.Components.kb1.r(-1, -2));
        kn0Var.x0.setOnClickListener(new vl0(kn0Var, 12));
        org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context2);
        kn0Var.y0 = gaVar2;
        org.telegram.ui.ActionBar.f7.V(gaVar2.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
        org.telegram.ui.ActionBar.f7.R(kn0Var.y0, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(i13), null);
        kn0Var.y0.b(LocaleController.getString(R.string.TelegramPassportDelete), false);
        kn0Var.c0.addView(kn0Var.y0, org.telegram.ui.Components.kb1.r(-1, -2));
        kn0Var.y0.setOnClickListener(new vl0(kn0Var, 13));
        org.telegram.ui.Cells.f7 f7Var2 = new org.telegram.ui.Cells.f7(context2, (d3) null);
        kn0Var.z0 = f7Var2;
        org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i12, context2, f7Var2, null);
        kn0Var.c0.addView(kn0Var.z0, org.telegram.ui.Components.kb1.r(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context2);
        kn0Var.A0 = linearLayout;
        linearLayout.setOrientation(1);
        kn0Var.A0.setGravity(17);
        org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i12, context2, kn0Var.A0, null);
        if (AndroidUtilities.isTablet()) {
            kn0Var.c0.addView(kn0Var.A0, new LinearLayout.LayoutParams(-1, AndroidUtilities.dp(528.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            kn0Var.c0.addView(kn0Var.A0, new LinearLayout.LayoutParams(-1, AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        ImageView imageView = new ImageView(context2);
        kn0Var.B0 = imageView;
        imageView.setImageResource(R.drawable.no_passport);
        org.telegram.ui.ActionBar.f7.t(kn0Var.B0, org.telegram.ui.ActionBar.y6.Ci, null, PorterDuff.Mode.MULTIPLY);
        kn0Var.A0.addView(kn0Var.B0, org.telegram.ui.Components.kb1.r(-2, -2));
        TextView textView = new TextView(context2);
        kn0Var.C0 = textView;
        int i14 = org.telegram.ui.ActionBar.y6.z6;
        org.telegram.ui.ActionBar.f7.V(textView, i14, null);
        kn0Var.C0.setGravity(17);
        kn0Var.C0.setTextSize(1, 15.0f);
        kn0Var.C0.setTypeface(AndroidUtilities.bold());
        kn0Var.C0.setText(LocaleController.getString(R.string.PassportNoDocuments));
        TextView e = org.telegram.messenger.wh.e(kn0Var.A0, kn0Var.C0, org.telegram.ui.Components.kb1.x(-2, -2, 17, 0, 16, 0, 0), context2);
        kn0Var.D0 = e;
        org.telegram.ui.ActionBar.f7.V(e, i14, null);
        kn0Var.D0.setGravity(17);
        kn0Var.D0.setTextSize(1, 14.0f);
        kn0Var.D0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        kn0Var.D0.setText(LocaleController.getString(R.string.PassportNoDocumentsInfo));
        TextView e10 = org.telegram.messenger.wh.e(kn0Var.A0, kn0Var.D0, org.telegram.ui.Components.kb1.x(-2, -2, 17, 0, 14, 0, 0), context2);
        kn0Var.E0 = e10;
        int i15 = org.telegram.ui.ActionBar.y6.q6;
        org.telegram.ui.ActionBar.f7.V(e10, i15, null);
        kn0Var.E0.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.f7.R(kn0Var.E0, org.telegram.ui.ActionBar.y6.g0(i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i15, false), 32), 7, -1), null, org.telegram.ui.ActionBar.f7.h(i15, 32), null);
        kn0Var.E0.setGravity(17);
        kn0Var.E0.setTextSize(1, 15.0f);
        kn0Var.E0.setTypeface(AndroidUtilities.bold());
        kn0Var.E0.setGravity(17);
        kn0Var.E0.setText(LocaleController.getString(R.string.PassportNoDocumentsAdd).toUpperCase());
        kn0Var.A0.addView(kn0Var.E0, org.telegram.ui.Components.kb1.x(-2, 30, 17, 0, 12, 0, 0));
        kn0Var.E0.setOnClickListener(new vl0(kn0Var, 14));
        int size = kn0Var.y.values.size();
        int i16 = 0;
        while (i16 < size) {
            TLRPC.TL_secureValue tL_secureValue = kn0Var.y.values.get(i16);
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
                z10 = false;
                kn0Var.U0(context2, tL_secureRequiredType, arrayList, z10, i16 != size + (-1));
                i16++;
                kn0Var = this;
                context2 = context;
            }
            z10 = true;
            kn0Var.U0(context2, tL_secureRequiredType, arrayList, z10, i16 != size + (-1));
            i16++;
            kn0Var = this;
            context2 = context;
        }
        R1();
    }

    public final void g1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(LocaleController.getString(R.string.PassportPhone));
        this.Y0 = new HashMap();
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
                this.U0.add(0, split[2]);
                this.V0.put(split[2], split[0]);
                this.W0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.X0.put(split[0], split[3]);
                }
                this.Y0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.U0, new dv(20));
        String str3 = UserConfig.getInstance(this.currentAccount).getCurrentUser().phone;
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
        org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.q6, null);
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(true);
        int i13 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6);
        gaVar.setBackground(M0);
        org.telegram.ui.ActionBar.f7.k(gaVar, M0, N, N2, null);
        gaVar.b(LocaleController.formatString("PassportPhoneUseSame", R.string.PassportPhoneUseSame, kf.b.c().b("+" + str3)), false);
        this.c0.addView(gaVar, org.telegram.ui.Components.kb1.r(-1, -2));
        gaVar.setOnClickListener(new vl0(this, 16));
        org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
        this.n0 = i9Var;
        org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context, i9Var, null);
        this.n0.setText(LocaleController.getString(R.string.PassportPhoneUseSameInfo));
        this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
        this.j0 = q4Var;
        q4Var.setText(LocaleController.getString(R.string.PassportPhoneUseOther));
        org.telegram.ui.ActionBar.f7.i(i13, this.j0, null);
        this.c0.addView(this.j0, org.telegram.ui.Components.kb1.r(-1, -2));
        this.Y = new EditTextBoldCursor[3];
        for (int i14 = 0; i14 < 3; i14++) {
            if (i14 == 2) {
                this.Y[i14] = new org.telegram.ui.Components.q40(context);
            } else {
                this.Y[i14] = new EditTextBoldCursor(context);
            }
            if (i14 == 1) {
                frameLayout = org.telegram.messenger.wh.d(context, 0);
                this.c0.addView(frameLayout, org.telegram.ui.Components.kb1.r(-1, 50));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, frameLayout, null);
            } else if (i14 == 2) {
                frameLayout = (ViewGroup) this.Y[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.c0.addView(frameLayout, org.telegram.ui.Components.kb1.r(-1, 50));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, frameLayout, null);
            }
            this.Y[i14].setTag(Integer.valueOf(i14));
            this.Y[i14].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.f7.E(this.Y[i14], org.telegram.ui.ActionBar.y6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Y[i14];
            int i15 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor, i15, null);
            this.Y[i14].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.f7.w(this.Y[i14], i15, null);
            this.Y[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.Y[i14].setCursorWidth(1.5f);
            if (i14 == 0) {
                this.Y[i14].setOnTouchListener(new wl0(this, i10));
                this.Y[i14].setText(LocaleController.getString(R.string.ChooseCountry));
                this.Y[i14].setInputType(0);
                this.Y[i14].setFocusable(false);
            } else {
                this.Y[i14].setInputType(3);
                if (i14 == 2) {
                    this.Y[i14].setImeOptions(268435462);
                } else {
                    this.Y[i14].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i14];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            if (i14 == 1) {
                TextView textView = new TextView(context);
                this.w0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.f7.V(this.w0, i15, null);
                this.w0.setTextSize(1, 16.0f);
                frameLayout.addView(this.w0, org.telegram.ui.Components.kb1.o(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Y[i14].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                this.Y[i14].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Y[i14].setGravity(19);
                frameLayout.addView(this.Y[i14], org.telegram.ui.Components.kb1.o(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Y[i14].addTextChangedListener(new xm0(this));
            } else if (i14 == 2) {
                this.Y[i14].setPadding(0, 0, 0, 0);
                this.Y[i14].setGravity(19);
                this.Y[i14].setHintText(null);
                this.Y[i14].setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                frameLayout.addView(this.Y[i14], org.telegram.ui.Components.kb1.o(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Y[i14].addTextChangedListener(new wr(this, i10));
            } else {
                this.Y[i14].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.Y[i14].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout.addView(this.Y[i14], org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Y[i14].setOnEditorActionListener(new tl0(this, i12));
            if (i14 == 2) {
                this.Y[i14].setOnKeyListener(new mg(this, i11));
            }
            if (i14 == 0) {
                View view = new View(context);
                this.k0.add(view);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Y0.get(str)) != null && this.U0.indexOf(str2) != -1) {
                this.Y[1].setText((CharSequence) this.V0.get(str2));
            }
            org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context);
            this.n0 = i9Var2;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context, i9Var2, null);
            this.n0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
            this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Y[1].setText((CharSequence) this.V0.get(str2));
        }
        org.telegram.ui.Cells.i9 i9Var22 = new org.telegram.ui.Cells.i9(context);
        this.n0 = i9Var22;
        org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7, context, i9Var22, null);
        this.n0.setText(LocaleController.getString(R.string.PassportPhoneUploadInfo));
        this.c0.addView(this.n0, org.telegram.ui.Components.kb1.r(-1, -2));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.k0;
            if (i11 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) arrayList2.get(i11), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d7));
            i11++;
        }
        Iterator it = this.n1.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new org.telegram.ui.ActionBar.h7((in0) ((Map.Entry) it.next()).getValue(), TLObject.FLAG_28, new Class[]{in0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
        }
        int i12 = org.telegram.ui.ActionBar.y6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c0, TLObject.FLAG_28, new Class[]{org.telegram.ui.Cells.h9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c0, TLObject.FLAG_28, new Class[]{org.telegram.ui.Cells.ga.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c0, TLObject.FLAG_28, new Class[]{jn0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        if (this.Y != null) {
            int i13 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i13 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) editTextBoldCursorArr[i13].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y[i13], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y[i13], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y[i13], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y[i13], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
                i13++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k6));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l6));
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
        }
        if (this.a0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.a0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.h7((View) editTextBoldCursorArr2[i10].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.a0[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.a0[i10], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.a0[i10], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.h7(this.a0[i10], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
                i10++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.F0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Q, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.rh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Q, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.sh));
        return arrayList;
    }

    public final byte[] i1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.e1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.e1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.c1, 0, bArr5, 0, 32);
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

    public final void j1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z10, final ul0 ul0Var, final xl0 xl0Var, final boolean z11) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (!z11 || tL_secureRequiredType2 == null) {
            if (z10) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        } else {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() { // from class: org.telegram.ui.bm0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final kn0 kn0Var = kn0.this;
                final ym0 ym0Var = xl0Var;
                final boolean z12 = z11;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z13 = z10;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = ul0Var;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.dm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        kn0 kn0Var2 = kn0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str2 = null;
                        if (tL_error2 != null) {
                            ym0 ym0Var2 = ym0Var;
                            if (ym0Var2 != null) {
                                ym0Var2.d(tL_error2.text, null);
                            }
                            kn0Var2.M1(LocaleController.getString(R.string.AppName), tL_error2.text);
                            return;
                        }
                        boolean z14 = z12;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z15 = z13;
                        if (!z14) {
                            if (z15) {
                                kn0Var2.H1(tL_secureRequiredType6);
                            }
                            kn0Var2.H1(tL_secureRequiredType5);
                        } else if (tL_secureRequiredType5 != null) {
                            kn0Var2.H1(tL_secureRequiredType5);
                        } else {
                            kn0Var2.H1(tL_secureRequiredType6);
                        }
                        if (kn0Var2.b == 8) {
                            jn0 jn0Var = (jn0) kn0Var2.q1.remove(tL_secureRequiredType6);
                            if (jn0Var != null) {
                                kn0Var2.c0.removeView(jn0Var);
                                View childAt = kn0Var2.c0.getChildAt(r1.getChildCount() - 6);
                                if (childAt instanceof jn0) {
                                    ((jn0) childAt).setNeedDivider(false);
                                }
                            }
                            kn0Var2.R1();
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
                                    TLRPC.TL_secureValue r12 = kn0Var2.r1(tL_secureRequiredType7, false);
                                    if (r12 != null) {
                                        TLRPC.TL_secureData tL_secureData2 = r12.data;
                                        str = tL_secureData2 != null ? kn0.h1(tL_secureData2.data, kn0Var2.i1(tL_secureData2.secret, tL_secureData2.data_hash), r12.data.data_hash) : null;
                                        tL_secureRequiredType5 = tL_secureRequiredType7;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (tL_secureRequiredType5 == null) {
                                    tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList3.get(0);
                                }
                            }
                            if (z15) {
                                kn0Var2.L1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z14, arrayList3 != null ? arrayList3.size() : 0);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str3 = str;
                                TLRPC.TL_secureValue r13 = kn0Var2.r1(tL_secureRequiredType6, false);
                                if (r13 != null && (tL_secureData = r13.data) != null) {
                                    str2 = kn0.h1(tL_secureData.data, kn0Var2.i1(tL_secureData.secret, tL_secureData.data_hash), r13.data.data_hash);
                                }
                                kn0Var2.L1(tL_secureRequiredType6, null, str2, tL_secureRequiredType8, str3, z14, arrayList3 != null ? arrayList3.size() : 0);
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

    public final a8.me k1(byte[] bArr) {
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
        System.arraycopy(this.e1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.e1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.c1, 0, bArr8, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] computeSHA5122 = Utilities.computeSHA512(bArr8, computeSHA256);
        byte[] bArr9 = new byte[32];
        System.arraycopy(computeSHA5122, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(computeSHA5122, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(p12, 0, bArr11, 0, 32);
        Utilities.aesCbcEncryptionByteArraySafe(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        a8.me meVar = new a8.me();
        meVar.c = bArr3;
        meVar.a = bArr11;
        meVar.d = computeSHA256;
        meVar.b = p12;
        meVar.e = new SecureDocumentKey(bArr4, bArr5);
        return meVar;
    }

    public final void l1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z10) {
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
            K1(bundle, 2, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            K1(bundle, 1, z10);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            K1(bundle, 0, z10);
        }
    }

    public final String m1() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i10].getText());
            sb2.append(",");
            i10++;
        }
        if (this.a0 != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.a0;
                if (i11 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i11].getText());
                sb2.append(",");
                i11++;
            }
        }
        ArrayList arrayList = this.i1;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            sb2.append(((SecureDocument) arrayList.get(i12)).secureFile.id);
        }
        SecureDocument secureDocument = this.l1;
        if (secureDocument != null) {
            sb2.append(secureDocument.secureFile.id);
        }
        SecureDocument secureDocument2 = this.m1;
        if (secureDocument2 != null) {
            sb2.append(secureDocument2.secureFile.id);
        }
        SecureDocument secureDocument3 = this.j1;
        if (secureDocument3 != null) {
            sb2.append(secureDocument3.secureFile.id);
        }
        ArrayList arrayList2 = this.k1;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            sb2.append(((SecureDocument) arrayList2.get(i13)).secureFile.id);
        }
        return sb2.toString();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 == 0 || i10 == 2) {
                c1();
                org.telegram.ui.Components.ti tiVar = this.R0;
                if (tiVar != null) {
                    tiVar.j0.h0(i10, intent, this.Q0);
                }
                this.Q0 = null;
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

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        int i10 = this.b;
        if (i10 == 7) {
            if (z10) {
                int i11 = this.I1;
                org.telegram.ui.Components.bx0[] bx0VarArr = this.J1;
                bx0VarArr[i11].c(true);
                for (org.telegram.ui.Components.bx0 bx0Var : bx0VarArr) {
                    if (bx0Var != null) {
                        bx0Var.f();
                    }
                }
            }
        } else if (i10 == 0 || i10 == 5) {
            if (z10) {
                W0(false);
            }
        } else if (i10 == 1 || i10 == 2) {
            return !X0(z10);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onDialogDismiss(Dialog dialog) {
        if (this.b == 3 && dialog == this.L1) {
            ArrayList arrayList = this.M1;
            if (arrayList.isEmpty()) {
                return;
            }
            getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        int i10 = 0;
        W0(false);
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.dismissInternal();
            this.R0.B1();
        }
        if (this.b == 7) {
            while (true) {
                org.telegram.ui.Components.bx0[] bx0VarArr = this.J1;
                if (i10 >= bx0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.bx0 bx0Var = bx0VarArr[i10];
                if (bx0Var != null) {
                    bx0Var.f();
                }
                i10++;
            }
            org.telegram.ui.ActionBar.e2 e2Var = this.K1;
            if (e2Var != null) {
                try {
                    e2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.K1 = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.D1();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.ti tiVar;
        org.telegram.ui.Cells.ga gaVar;
        int i11 = this.b;
        if ((i11 != 1 && i11 != 2) || (tiVar = this.R0) == null) {
            if (i11 == 3 && i10 == 6) {
                O1(false, this.E1, this.F1, this.G1, this.H1);
                return;
            }
            return;
        }
        if (i10 == 17) {
            tiVar.j0.V(false);
            return;
        }
        if (i10 == 21) {
            if (getParentActivity() == null || iArr == null || iArr.length == 0 || iArr[0] == 0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
            alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new xl0(this, 0));
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            F1(0);
            return;
        }
        if (i10 != 22 || iArr == null || iArr.length <= 0 || iArr[0] != 0 || (gaVar = this.r0) == null) {
            return;
        }
        gaVar.callOnClick();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.ti tiVar = this.R0;
        if (tiVar != null) {
            tiVar.E1();
        }
        if (this.b == 5 && (viewGroupArr = this.Z) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Y[0].requestFocus();
            AndroidUtilities.showKeyboard(this.Y[0]);
            AndroidUtilities.runOnUIThread(new ul0(this, 0), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: Exception -> 0x0010, TRY_LEAVE, TryCatch #0 {Exception -> 0x0010, blocks: (B:2:0x0000, B:4:0x0006, B:5:0x0012, B:10:0x001e, B:12:0x0032, B:14:0x0036, B:16:0x003a, B:19:0x003f, B:21:0x004b), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onThemeColorsChanged() {
        boolean z10;
        try {
            ScrollView scrollView = this.b0;
            boolean z11 = false;
            if (scrollView != null) {
                AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.s8, false));
            }
            int i10 = this.b;
            if (i10 != 2 && i10 != 1) {
                z10 = false;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k6, false);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.l6, false);
                int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false);
                if (z10 && (x02 != this.N1 || x03 != this.O1 || x04 != this.P1)) {
                    z11 = true;
                }
                P1(this.Y, z10, z11);
                P1(this.a0, z10, z11);
                if (z11) {
                    return;
                }
                this.N1 = x02;
                this.O1 = x03;
                this.P1 = x04;
                return;
            }
            z10 = true;
            int x022 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k6, false);
            int x032 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.l6, false);
            int x042 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.p7, false);
            if (z10) {
                z11 = true;
            }
            P1(this.Y, z10, z11);
            P1(this.a0, z10, z11);
            if (z11) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (this.h1 != null) {
            AndroidUtilities.runOnUIThread(new ul0(this, 1));
        }
        int i10 = this.b;
        if (i10 == 5) {
            if (z10) {
                if (this.Z[0].getVisibility() == 0) {
                    this.Y[0].requestFocus();
                    AndroidUtilities.showKeyboard(this.Y[0]);
                }
                if (this.N0 == 2) {
                    B1(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 7) {
            if (z10) {
                this.J1[this.I1].j();
                return;
            }
            return;
        }
        if (i10 == 4) {
            if (z10) {
                this.Y[0].requestFocus();
                AndroidUtilities.showKeyboard(this.Y[0]);
                return;
            }
            return;
        }
        if (i10 == 6) {
            if (z10) {
                this.Y[0].requestFocus();
                AndroidUtilities.showKeyboard(this.Y[0]);
                return;
            }
            return;
        }
        if (i10 == 2 || i10 == 1) {
            c1();
        }
    }

    public final TLRPC.TL_secureValue r1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z10) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.y.values.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_secureValue tL_secureValue = this.y.values.get(i10);
            if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                if (z10) {
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
                    boolean z11 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                    if (z11 || (secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                        String[] strArr = z11 ? tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void restoreSelfArgs(Bundle bundle) {
        this.Q0 = bundle.getString("path");
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.Q0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean u1() {
        String str = this.a;
        return str == null || str.equals(m1());
    }

    public final void w1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new yl0(this, 3)), this.classGuid);
    }

    public final void x1() {
        org.telegram.ui.ActionBar.e2 e2Var = this.K1;
        if (e2Var == null) {
            return;
        }
        try {
            e2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.K1 = null;
    }

    public final void y1() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.K1 != null) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
        this.K1 = e2Var;
        e2Var.i0 = false;
        e2Var.show();
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
    public kn0(int i10, long j10, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
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
            Collections.sort(authorizationform.errors, new qm0(this));
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
                HashMap hashMap = (HashMap) this.u1.get(o12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i11 = size;
                    this.u1.put(o12, hashMap);
                    this.v1.put(o12, str6);
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
