package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class bk0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public LinearLayout A0;
    public String A1;
    public ImageView B0;
    public sj0 B1;
    public TextView C0;
    public boolean C1;
    public TL_account.authorizationForm D;
    public TextView D0;
    public final cj0 D1;
    public final TLRPC.TL_secureRequiredType E;
    public TextView E0;
    public String E1;
    public TLRPC.TL_secureRequiredType F;
    public org.telegram.ui.Components.iy F0;
    public Runnable F1;
    public ArrayList G;
    public org.telegram.ui.Cells.z8 G0;
    public qj0 G1;
    public final TLRPC.TL_secureValue H;
    public org.telegram.ui.Cells.z8 H0;
    public sj0 H1;
    public final TLRPC.TL_secureValue I;
    public ImageView I0;
    public int I1;
    public TL_account.Password J;
    public TextView J0;
    public final org.telegram.ui.Components.wt0[] J1;
    public TLRPC.TL_auth_sentCode K;
    public TextView K0;
    public org.telegram.ui.ActionBar.u1 K1;
    public org.telegram.ui.ActionBar.r0 L;
    public FrameLayout L0;
    public Dialog L1;
    public AnimatorSet M;
    public TextView M0;
    public final ArrayList M1;
    public org.telegram.ui.Components.zp N;
    public int N0;
    public int N1;
    public TextView O;
    public final byte[] O0;
    public int O1;
    public org.telegram.ui.Components.zp P;
    public final byte[] P0;
    public int P1;
    public FrameLayout Q;
    public String Q0;
    public org.telegram.ui.Cells.w9 R;
    public org.telegram.ui.Components.di R0;
    public View S;
    public int S0;
    public View T;
    public int T0;
    public org.telegram.ui.Cells.y8 U;
    public final ArrayList U0;
    public org.telegram.ui.Cells.y8 V;
    public final HashMap V0;
    public org.telegram.ui.Cells.y8 W;
    public final HashMap W0;
    public org.telegram.ui.Cells.w9 X;
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
    public bk0 h1;
    public LinearLayout i0;
    public final ArrayList i1;
    public org.telegram.ui.Cells.n4 j0;
    public org.telegram.messenger.ew j1;
    public final ArrayList k0;
    public final ArrayList k1;
    public org.telegram.ui.Cells.y6 l0;
    public org.telegram.messenger.ew l1;
    public org.telegram.ui.Cells.y6 m0;
    public org.telegram.messenger.ew m1;
    public final String n;
    public org.telegram.ui.Cells.z8 n0;
    public final HashMap n1;
    public org.telegram.ui.Cells.z8 o0;
    public final HashMap o1;
    public org.telegram.ui.Cells.z8 p0;
    public final HashMap p1;
    public org.telegram.ui.Cells.z8 q0;
    public final HashMap q1;
    public final String r;
    public org.telegram.ui.Cells.w9 r0;
    public final HashMap r1;
    public String s;
    public int s0;
    public final HashMap s1;
    public final boolean[] t0;
    public final HashMap t1;
    public boolean u0;
    public final HashMap u1;
    public boolean v0;
    public final HashMap v1;
    public String w;
    public TextView w0;
    public HashMap w1;
    public String x;
    public org.telegram.ui.Cells.w9 x0;
    public HashMap x1;
    public final int[] y;
    public org.telegram.ui.Cells.w9 y0;
    public final HashMap y1;
    public org.telegram.ui.Cells.y6 z0;
    public String z1;

    public bk0(int i7, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.s = "";
        this.w = "";
        this.y = new int[3];
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
        this.D1 = new cj0(this);
        this.b = i7;
        this.D = authorizationform;
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
        if (i7 == 3) {
            this.M1 = new ArrayList();
        } else if (i7 == 7) {
            this.J1 = new org.telegram.ui.Components.wt0[3];
        }
        if (hashMap == null) {
            this.s1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.t1 = new HashMap();
        }
        if (i7 == 5) {
            if (org.telegram.messenger.p10.i(this.currentAccount).j0 != null && org.telegram.messenger.p10.i(this.currentAccount).k0 != null) {
                this.N0 = 1;
                this.O0 = org.telegram.messenger.p10.i(this.currentAccount).j0;
                this.P0 = org.telegram.messenger.p10.i(this.currentAccount).k0;
            }
            TL_account.Password password2 = this.J;
            if (password2 == null) {
                A1();
            } else {
                TwoStepVerificationActivity.r0(password2);
                if (this.N0 == 1) {
                    F1(true);
                }
            }
            if (org.telegram.messenger.iz.j0 != null) {
                return;
            }
            TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
            tL_help_getPassportConfig.hash = org.telegram.messenger.iz.k0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new di.u5(24));
        }
    }

    public static int G0(bk0 bk0Var, String str) {
        bk0Var.getClass();
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

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ed, code lost:
    
        if (r7 != 5) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0261, code lost:
    
        if (r9 > 24) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x026d, code lost:
    
        if (r9 < 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x027c, code lost:
    
        if (r9 < 2) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0285, code lost:
    
        if (r9 > 10) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H0(bk0 bk0Var) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        boolean z9;
        View view;
        ArrayList arrayList = bk0Var.k1;
        ArrayList arrayList2 = bk0Var.i1;
        HashMap hashMap = bk0Var.n1;
        HashMap hashMap2 = bk0Var.y1;
        if (bk0Var.F != null) {
            if (hashMap2.containsKey("error_all") || hashMap2.containsKey("error_document_all")) {
                bk0Var.D1(bk0Var.p0);
                return true;
            }
            if (bk0Var.R != null) {
                if (arrayList2.isEmpty()) {
                    bk0Var.D1(bk0Var.R);
                    return true;
                }
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ew ewVar = (org.telegram.messenger.ew) arrayList2.get(i7);
                    String str = "files" + r1(ewVar);
                    if (str != null && hashMap2.containsKey(str)) {
                        bk0Var.D1((View) hashMap.get(ewVar));
                        return true;
                    }
                }
            }
            if (hashMap2.containsKey("files_all") || hashMap2.containsKey("translation_all")) {
                bk0Var.D1(bk0Var.n0);
                return true;
            }
            View view2 = bk0Var.U;
            if (view2 != null) {
                if (bk0Var.l1 == null) {
                    bk0Var.D1(view2);
                    return true;
                }
                if (hashMap2.containsKey("front" + r1(bk0Var.l1))) {
                    bk0Var.D1((View) hashMap.get(bk0Var.l1));
                    return true;
                }
            }
            TLRPC.SecureValueType secureValueType = bk0Var.F.type;
            if (((secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) || (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense)) && (view = bk0Var.V) != null) {
                if (bk0Var.m1 == null) {
                    bk0Var.D1(view);
                    return true;
                }
                if (hashMap2.containsKey("reverse" + r1(bk0Var.m1))) {
                    bk0Var.D1((View) hashMap.get(bk0Var.m1));
                    return true;
                }
            }
            View view3 = bk0Var.W;
            if (view3 != null && bk0Var.c != 0) {
                if (bk0Var.j1 == null) {
                    bk0Var.D1(view3);
                    return true;
                }
                if (hashMap2.containsKey("selfie" + r1(bk0Var.j1))) {
                    bk0Var.D1((View) hashMap.get(bk0Var.j1));
                    return true;
                }
            }
            if (bk0Var.X != null && bk0Var.c != 0) {
                if (arrayList.isEmpty()) {
                    bk0Var.D1(bk0Var.X);
                    return true;
                }
                int size2 = arrayList.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    org.telegram.messenger.ew ewVar2 = (org.telegram.messenger.ew) arrayList.get(i10);
                    if (hashMap2.containsKey("translation" + r1(ewVar2))) {
                        bk0Var.D1((View) hashMap.get(ewVar2));
                        return true;
                    }
                }
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                editTextBoldCursorArr = bk0Var.Y;
            } else {
                org.telegram.ui.Cells.z8 z8Var = bk0Var.q0;
                editTextBoldCursorArr = (z8Var == null || z8Var.getVisibility() != 0) ? null : bk0Var.a0;
            }
            if (editTextBoldCursorArr != null) {
                int i12 = 0;
                while (i12 < editTextBoldCursorArr.length) {
                    boolean z10 = !TextUtils.isEmpty(editTextBoldCursorArr[i12].w0);
                    if (!hashMap2.isEmpty()) {
                        TLRPC.SecureValueType secureValueType2 = bk0Var.E.type;
                        String str2 = "country_code";
                        if (!(secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (i12 == 0) {
                                    str2 = "street_line1";
                                } else if (i12 == 1) {
                                    str2 = "street_line2";
                                } else if (i12 == 2) {
                                    str2 = "post_code";
                                } else if (i12 == 3) {
                                    str2 = "city";
                                } else if (i12 == 4) {
                                    str2 = "state";
                                }
                                if (str2 != null) {
                                }
                            }
                            str2 = null;
                            if (str2 != null) {
                            }
                        } else if (i11 == 0) {
                            switch (i12) {
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
                                if (!TextUtils.isEmpty(str3) && str3.equals(editTextBoldCursorArr[i12].getText().toString())) {
                                    z10 = true;
                                }
                            }
                        } else {
                            if (i12 == 0) {
                                str2 = "first_name_native";
                            } else if (i12 != 1) {
                                if (i12 == 2) {
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
                    if (!bk0Var.v0 || bk0Var.F == null || i12 >= 7) {
                        if (!z10) {
                            int length = editTextBoldCursorArr[i12].length();
                            int i13 = bk0Var.b;
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    if (i12 == 1) {
                                        continue;
                                    } else if (i12 != 3) {
                                        if (i12 == 4) {
                                            if (!"US".equals(bk0Var.s)) {
                                                continue;
                                            }
                                        } else if (i12 == 2) {
                                            if (length >= 2) {
                                            }
                                            z9 = false;
                                            z10 = true;
                                        }
                                    }
                                }
                                z9 = false;
                            } else if (i12 != 8) {
                                if ((i11 == 0 && (i12 == 0 || i12 == 2 || i12 == 1)) || (i11 == 1 && (i12 == 0 || i12 == 1 || i12 == 2))) {
                                    if (length > 255) {
                                        z10 = true;
                                    }
                                    if ((i11 == 0 && i12 == 1) || (i11 == 1 && i12 == 1)) {
                                        z9 = true;
                                    }
                                } else if (i12 == 7) {
                                }
                                z9 = false;
                            } else {
                                continue;
                            }
                            if (!z10 && !z9 && length == 0) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            bk0Var.D1(editTextBoldCursorArr[i12]);
                            return true;
                        }
                    }
                    i12++;
                }
            }
        }
        return false;
    }

    public static void N0(bk0 bk0Var, EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z9) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = bk0Var.y1;
        if (hashMap == null || (str2 = (String) hashMap.get(str)) == null) {
            editTextBoldCursor.setErrorText(null);
        } else if (TextUtils.equals(str2, editable)) {
            HashMap hashMap2 = bk0Var.w1;
            if (hashMap2 == null || (str4 = (String) hashMap2.get(str)) == null) {
                HashMap hashMap3 = bk0Var.x1;
                if (hashMap3 != null && (str3 = (String) hashMap3.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str3);
                }
            } else {
                editTextBoldCursor.setErrorText(str4);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        String str5 = z9 ? "error_document_all" : "error_all";
        if (hashMap == null || !hashMap.containsKey(str5)) {
            return;
        }
        hashMap.remove(str5);
        bk0Var.e1(false);
    }

    public static void T1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z9, boolean z10) {
        if (editTextBoldCursorArr == null) {
            return;
        }
        for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
                if (z9) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 35, org.telegram.ui.ActionBar.k6.L6, null);
                    if (z10) {
                        int paddingLeft = editTextBoldCursor.getPaddingLeft();
                        int paddingTop = editTextBoldCursor.getPaddingTop();
                        int paddingRight = editTextBoldCursor.getPaddingRight();
                        int paddingBottom = editTextBoldCursor.getPaddingBottom();
                        org.telegram.ui.ActionBar.r6.G(editTextBoldCursor, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
                        if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                            editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                        }
                    }
                }
            }
        }
    }

    public static /* synthetic */ void Z(bk0 bk0Var, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = bk0Var.J;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        bk0Var.presentFragment(new ya1(bk0Var.currentAccount, 4, password));
    }

    public static void a0(bk0 bk0Var) {
        ArrayList arrayList;
        int i7;
        int i10;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap = bk0Var.r1;
        HashMap hashMap2 = bk0Var.q1;
        String str = bk0Var.r;
        ArrayList arrayList2 = new ArrayList();
        int size = bk0Var.D.required_types.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.SecureRequiredType secureRequiredType = bk0Var.D.required_types.get(i11);
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
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                                TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i12);
                                if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                    if (bk0Var.v1(tL_secureRequiredType5, true) != null) {
                                        tL_secureRequiredType = tL_secureRequiredType5;
                                        break;
                                    }
                                }
                                i12++;
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
            TLRPC.TL_secureValue v12 = bk0Var.v1(tL_secureRequiredType, true);
            if (v12 == null) {
                Vibrator vibrator = (Vibrator) bk0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                ak0 ak0Var = (ak0) hashMap2.get(tL_secureRequiredType);
                if (ak0Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    ak0Var = (ak0) hashMap2.get(tL_secureRequiredType2);
                }
                org.telegram.messenger.g0.F3(ak0Var);
                return;
            }
            HashMap hashMap3 = (HashMap) bk0Var.u1.get(s1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) bk0Var.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                ak0 ak0Var2 = (ak0) hashMap2.get(tL_secureRequiredType);
                if (ak0Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    ak0Var2 = (ak0) hashMap2.get(tL_secureRequiredType3);
                }
                org.telegram.messenger.g0.F3(ak0Var2);
                return;
            }
            boolean z9 = tL_secureRequiredType.selfie_required;
            boolean z10 = tL_secureRequiredType.translation_required;
            dj0 dj0Var = new dj0();
            dj0Var.a = v12;
            dj0Var.b = z9;
            dj0Var.c = z10;
            arrayList2.add(dj0Var);
        }
        bk0Var.R1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = bk0Var.c;
        acceptauthorization.scope = bk0Var.h;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            dj0 dj0Var2 = (dj0) arrayList2.get(i13);
            TLRPC.TL_secureValue tL_secureValue = dj0Var2.a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData == null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] m12 = bk0Var.m1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(m12, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (tL_secureValue.files.isEmpty()) {
                        i7 = size3;
                        i10 = i13;
                    } else {
                        JSONArray jSONArray = new JSONArray();
                        int i14 = 0;
                        for (int size4 = tL_secureValue.files.size(); i14 < size4; size4 = size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i14);
                            i7 = size3;
                            try {
                                i10 = i13;
                                try {
                                    byte[] m13 = bk0Var.m1(tL_secureFile.secret, tL_secureFile.file_hash);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(m13, 2));
                                    jSONArray.put(jSONObject4);
                                    i14++;
                                    size3 = i7;
                                    i13 = i10;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i7 = size3;
                        i10 = i13;
                        jSONObject3.put("files", jSONArray);
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] m14 = bk0Var.m1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(m14, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] m15 = bk0Var.m1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(m15, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (dj0Var2.b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] m16 = bk0Var.m1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(m16, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (dj0Var2.c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i15 = 0; i15 < size5; i15++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i15);
                            byte[] m17 = bk0Var.m1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(m17, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(s1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i13 = i10 + 1;
                arrayList2 = arrayList;
                size3 = i7;
            } else if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
            }
            arrayList = arrayList2;
            i7 = size3;
            i10 = i13;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i13 = i10 + 1;
            arrayList2 = arrayList;
            size3 = i7;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj = bk0Var.d;
        if (obj != null) {
            try {
                jSONObject9.put("payload", obj);
            } catch (Exception unused6) {
            }
        }
        Object obj2 = bk0Var.e;
        if (obj2 != null) {
            try {
                jSONObject9.put("nonce", obj2);
            } catch (Exception unused7) {
            }
        }
        a8.r7 o12 = bk0Var.o1(org.telegram.messenger.g0.h1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) o12.e;
        tL_secureCredentialsEncrypted.data = (byte[]) o12.d;
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) o12.c);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        ConnectionsManager.getInstance(bk0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(bk0Var.currentAccount).sendRequest(acceptauthorization, new ti0(bk0Var, 1)), bk0Var.classGuid);
    }

    public static /* synthetic */ void b0(bk0 bk0Var, TLRPC.TL_error tL_error, String str, sj0 sj0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error != null) {
            org.telegram.ui.Components.v4.c0(bk0Var.currentAccount, tL_error, bk0Var, sendverifyphonecode, str);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("phone", str);
        bk0 bk0Var2 = new bk0(7, bk0Var.D, bk0Var.J, bk0Var.E, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
        bk0Var2.currentAccount = bk0Var.currentAccount;
        bk0Var2.e1 = bk0Var.e1;
        bk0Var2.c1 = bk0Var.c1;
        bk0Var2.B1 = sj0Var;
        bk0Var2.K = (TLRPC.TL_auth_sentCode) tLObject;
        bk0Var.presentFragment(bk0Var2, true);
    }

    public static /* synthetic */ void c0(bk0 bk0Var, org.telegram.messenger.ew ewVar, int i7) {
        String str = ewVar.c;
        HashMap hashMap = bk0Var.n1;
        int i10 = bk0Var.S0;
        if (i10 == 1) {
            org.telegram.messenger.ew ewVar2 = bk0Var.j1;
            if (ewVar2 != null) {
                zj0 zj0Var = (zj0) hashMap.remove(ewVar2);
                if (zj0Var != null) {
                    bk0Var.g0.removeView(zj0Var);
                }
                bk0Var.j1 = null;
            }
        } else if (i10 == 4) {
            if (bk0Var.k1.size() >= 20) {
                return;
            }
        } else if (i10 == 2) {
            org.telegram.messenger.ew ewVar3 = bk0Var.l1;
            if (ewVar3 != null) {
                zj0 zj0Var2 = (zj0) hashMap.remove(ewVar3);
                if (zj0Var2 != null) {
                    bk0Var.e0.removeView(zj0Var2);
                }
                bk0Var.l1 = null;
            }
        } else if (i10 == 3) {
            org.telegram.messenger.ew ewVar4 = bk0Var.m1;
            if (ewVar4 != null) {
                zj0 zj0Var3 = (zj0) hashMap.remove(ewVar4);
                if (zj0Var3 != null) {
                    bk0Var.f0.removeView(zj0Var3);
                }
                bk0Var.m1 = null;
            }
        } else if (i10 == 0 && bk0Var.i1.size() >= 20) {
            return;
        }
        bk0Var.o1.put(str, ewVar);
        bk0Var.L.setEnabled(false);
        bk0Var.L.setAlpha(0.5f);
        org.telegram.messenger.w7.G(bk0Var.currentAccount).h0(false, 16777216, str, true);
        bk0Var.V0(ewVar, i7);
        bk0Var.X1(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void d0(bk0 bk0Var, boolean z9, String str) {
        byte[] bArr;
        byte[] c10;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        if (z9) {
            c10 = bk0Var.O0;
        } else {
            if (!(bk0Var.J.current_algo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
                bArr = null;
                pj0 pj0Var = new pj0(bk0Var, z9, bArr, getpasswordsettings, str);
                TL_account.Password password = bk0Var.J;
                passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "PASSWORD_HASH_INVALID";
                    pj0Var.run(null, tL_error);
                    return;
                }
                TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                getpasswordsettings.password = d;
                if (d != null) {
                    ConnectionsManager.getInstance(bk0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(bk0Var.currentAccount).sendRequest(getpasswordsettings, pj0Var, 10), bk0Var.classGuid);
                    return;
                } else {
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "ALGO_INVALID";
                    pj0Var.run(null, tL_error2);
                    return;
                }
            }
            c10 = org.telegram.messenger.pv.c(org.telegram.messenger.g0.h1(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) bk0Var.J.current_algo);
        }
        bArr = c10;
        pj0 pj0Var2 = new pj0(bk0Var, z9, bArr, getpasswordsettings, str);
        TL_account.Password password2 = bk0Var.J;
        passwordKdfAlgo = password2.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
        }
    }

    public static boolean d1(byte[] bArr, Long l10) {
        if (bArr != null && bArr.length == 32) {
            int i7 = 0;
            for (byte b10 : bArr) {
                i7 += b10 & 255;
            }
            if (i7 % org.telegram.messenger.qs.e4 == 239 && (l10 == null || Utilities.g(Utilities.o(bArr.length, bArr)) == l10.longValue())) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void e0(int i7, String str, org.telegram.messenger.ew ewVar, zj0 zj0Var, bk0 bk0Var) {
        String str2 = ewVar.c;
        HashMap hashMap = bk0Var.o1;
        bk0Var.n1.remove(ewVar);
        if (i7 == 1) {
            bk0Var.j1 = null;
            bk0Var.g0.removeView(zj0Var);
        } else if (i7 == 4) {
            bk0Var.k1.remove(ewVar);
            bk0Var.h0.removeView(zj0Var);
        } else if (i7 == 2) {
            bk0Var.l1 = null;
            bk0Var.e0.removeView(zj0Var);
        } else if (i7 == 3) {
            bk0Var.m1 = null;
            bk0Var.f0.removeView(zj0Var);
        } else {
            bk0Var.i1.remove(ewVar);
            bk0Var.d0.removeView(zj0Var);
        }
        if (str != null) {
            HashMap hashMap2 = bk0Var.x1;
            if (hashMap2 != null) {
                hashMap2.remove(str);
            }
            HashMap hashMap3 = bk0Var.y1;
            if (hashMap3 != null) {
                hashMap3.remove(str);
            }
        }
        bk0Var.X1(i7);
        if (str2 == null || hashMap.remove(str2) == null) {
            return;
        }
        if (hashMap.isEmpty()) {
            bk0Var.L.setEnabled(true);
            bk0Var.L.setAlpha(1.0f);
        }
        org.telegram.messenger.w7.G(bk0Var.currentAccount).b(str2, false);
    }

    public static /* synthetic */ void f0(bk0 bk0Var) {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i7 = 0; i7 < bk0Var.D.values.size(); i7++) {
            deletesecurevalue.types.add(bk0Var.D.values.get(i7).type);
        }
        bk0Var.C1();
        ConnectionsManager.getInstance(bk0Var.currentAccount).sendRequest(deletesecurevalue, new ti0(bk0Var, 2));
    }

    public static void g0(bk0 bk0Var) {
        ya1 ya1Var = new ya1(bk0Var.currentAccount, 0, bk0Var.J);
        ya1Var.Y = true;
        bk0Var.presentFragment(ya1Var);
    }

    public static void h0(bk0 bk0Var) {
        if (bk0Var.J.has_recovery) {
            bk0Var.C1();
            ConnectionsManager.getInstance(bk0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(bk0Var.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ti0(bk0Var, 0), 10), bk0Var.classGuid);
            return;
        }
        if (bk0Var.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131746071, null), new si0(bk0Var, 4));
        String M0 = org.telegram.messenger.hd.M0(2131746072, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131746074, null);
        bk0Var.showDialog(u1Var);
    }

    public static String l1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr2.length != 32 || bArr3 == null || bArr3.length != 32) {
            return null;
        }
        byte[] r10 = Utilities.r(bArr2, bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r10, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r10, 32, bArr5, 0, 16);
        int length = bArr.length;
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        Utilities.b(bArr6, bArr4, bArr5, 0, length, 0, 0);
        if (!Arrays.equals(Utilities.o(length, bArr6), bArr3)) {
            return null;
        }
        int i7 = bArr6[0] & 255;
        return new String(bArr6, i7, length - i7);
    }

    public static String r1(org.telegram.messenger.ew ewVar) {
        byte[] bArr;
        if (ewVar == null) {
            return "";
        }
        TLRPC.TL_secureFile tL_secureFile = ewVar.b;
        if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
            return Base64.encodeToString(bArr, 2);
        }
        byte[] bArr2 = ewVar.f;
        return bArr2 != null ? Base64.encodeToString(bArr2, 2) : "";
    }

    public static String s1(TLRPC.SecureValueType secureValueType) {
        return secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? "personal_details" : secureValueType instanceof TLRPC.TL_secureValueTypePassport ? "passport" : secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport ? "internal_passport" : secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense ? "driver_license" : secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard ? "identity_card" : secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill ? "utility_bill" : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? "address" : secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement ? "bank_statement" : secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement ? "rental_agreement" : secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration ? "temporary_registration" : secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration ? "passport_registration" : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? "email" : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? "phone" : "";
    }

    public static byte[] t1() {
        byte[] bArr = new byte[32];
        Utilities.b.nextBytes(bArr);
        int i7 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            i7 += 255 & bArr[i10];
        }
        int i11 = i7 % org.telegram.messenger.qs.e4;
        if (i11 != 239) {
            int i12 = org.telegram.messenger.qs.O3 - i11;
            int nextInt = Utilities.b.nextInt(32);
            int i13 = (bArr[nextInt] & 255) + i12;
            if (i13 < 255) {
                i13 += org.telegram.messenger.qs.e4;
            }
            bArr[nextInt] = (byte) (i13 % org.telegram.messenger.qs.e4);
        }
        return bArr;
    }

    public static String u1(TLRPC.SecureValueType secureValueType) {
        return secureValueType instanceof TLRPC.TL_secureValueTypePassport ? org.telegram.messenger.hd.M0(2131754676, null) : secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense ? org.telegram.messenger.hd.M0(2131754681, null) : secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard ? org.telegram.messenger.hd.M0(2131754678, null) : secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill ? org.telegram.messenger.hd.M0(2131754671, null) : secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement ? org.telegram.messenger.hd.M0(2131754682, null) : secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement ? org.telegram.messenger.hd.M0(2131754673, null) : secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport ? org.telegram.messenger.hd.M0(2131754677, null) : secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration ? org.telegram.messenger.hd.M0(2131754675, null) : secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration ? org.telegram.messenger.hd.M0(2131754672, null) : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? org.telegram.messenger.hd.M0(2131754674, null) : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? org.telegram.messenger.hd.M0(2131754680, null) : "";
    }

    public static boolean x1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) || (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) || (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) || (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement);
    }

    public static boolean z1(TLRPC.SecureValueType secureValueType) {
        return (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) || (secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard);
    }

    public final void A1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ti0(this, 3)), this.classGuid);
    }

    public final void B1() {
        org.telegram.ui.ActionBar.u1 u1Var = this.K1;
        if (u1Var == null) {
            return;
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.K1 = null;
    }

    public final void C1() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || this.K1 != null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
        this.K1 = u1Var;
        u1Var.i0 = false;
        u1Var.show();
    }

    public final void D1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        org.telegram.messenger.g0.F3(view);
        M1(view);
    }

    public final void E1(boolean z9) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z9) {
            this.Y[0].setText("");
        }
        org.telegram.messenger.g0.F3(this.Y[0]);
    }

    public final void F1(boolean z9) {
        String obj;
        if (z9) {
            obj = null;
        } else {
            obj = this.Y[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                E1(false);
                return;
            }
            R1(true, true);
        }
        Utilities.e.c(new g60(this, z9, obj, 3));
    }

    public final void G1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (w1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (w1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (w1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (w1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (w1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (w1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (w1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754683, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (w1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (w1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(org.telegram.messenger.hd.M0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() == null || arrayList.isEmpty()) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131747495, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        alertDialog$Builder.f((CharSequence[]) arrayList.toArray(new CharSequence[0]), new og.j(9, this, arrayList2));
        showDialog(u1Var);
    }

    public final void H1() {
        int size;
        if (getParentActivity() == null) {
            return;
        }
        int i7 = this.S0;
        ArrayList arrayList = this.i1;
        int i10 = 1;
        if (i7 == 0 && arrayList.size() >= 20) {
            Q1(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("PassportUploadMaxReached", null, 2131747450, org.telegram.messenger.hd.G(20, "Files", new Object[0])));
            return;
        }
        g1();
        org.telegram.ui.Components.di diVar = this.R0;
        int i11 = this.S0;
        diVar.O3 = i11 == 1;
        if (i11 != 0) {
            if (i11 == 4) {
                size = this.k1.size();
            }
            diVar.y1(i10, false);
            this.R0.a2.i0();
            this.R0.e1();
            showDialog(this.R0);
        }
        size = arrayList.size();
        i10 = 20 - size;
        diVar.y1(i10, false);
        this.R0.a2.i0();
        this.R0.e1();
        showDialog(this.R0);
    }

    public final void I1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z9) {
        HashMap hashMap;
        HashMap hashMap2;
        int size = arrayList != null ? arrayList.size() : 0;
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2 != null ? tL_secureRequiredType2.type : null;
        int i7 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails ? 1 : secureValueType instanceof TLRPC.TL_secureValueTypeAddress ? 2 : secureValueType instanceof TLRPC.TL_secureValueTypePhone ? 3 : secureValueType instanceof TLRPC.TL_secureValueTypeEmail ? 4 : -1;
        if (i7 != -1) {
            HashMap hashMap3 = this.u1;
            HashMap hashMap4 = !z9 ? (HashMap) hashMap3.get(s1(secureValueType)) : null;
            HashMap hashMap5 = (HashMap) hashMap3.get(s1(secureValueType2));
            TLRPC.TL_secureValue v12 = v1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap4;
            TL_account.authorizationForm authorizationform = this.D;
            int i10 = i7;
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
            bk0 bk0Var = new bk0(i10, authorizationform, password, tL_secureRequiredType, v12, tL_secureRequiredType2, v13, hashMap8, hashMap2);
            bk0Var.B1 = new gj0(this, secureValueType, z9, size);
            bk0Var.currentAccount = this.currentAccount;
            bk0Var.e1 = this.e1;
            bk0Var.c1 = this.c1;
            bk0Var.c = this.c;
            bk0Var.w1 = hashMap6;
            bk0Var.v0 = z9;
            bk0Var.x1 = hashMap;
            bk0Var.G = arrayList;
            if (i10 == 4) {
                bk0Var.d1 = this.d1;
            }
            presentFragment(bk0Var);
        }
    }

    public final void J1(int i7) {
        if (i7 == 0) {
            int i10 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.Q0 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void K1(ArrayList arrayList) {
        boolean z9;
        if (arrayList.isEmpty()) {
            return;
        }
        int i7 = this.S0;
        boolean z10 = true;
        if (i7 == 1 || i7 == 4 || !(this.E.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            z9 = false;
        } else {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i10 < editTextBoldCursorArr.length) {
                    if (i10 != 5 && i10 != 8 && i10 != 4 && i10 != 6 && editTextBoldCursorArr[i10].length() > 0) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            z9 = z10;
        }
        Utilities.e.c(new org.telegram.messenger.voip.k0(this.S0, 7, this, arrayList, z9));
    }

    public final TLRPC.TL_secureValue L1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.D.values.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (tL_secureRequiredType.type.getClass() == this.D.values.get(i7).type.getClass()) {
                return this.D.values.remove(i7);
            }
        }
        return null;
    }

    public final void M1(View view) {
        while (view != null && this.c0.indexOfChild(view) < 0) {
            view = (View) view.getParent();
        }
        if (view != null) {
            this.b0.smoothScrollTo(0, view.getTop() - ((this.b0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
        }
    }

    public final void N1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            switch (str) {
                case "residence_country_code":
                    this.w = str2;
                    CharSequence charSequence3 = (String) this.Y0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case "gender":
                    if (!"male".equals(str2)) {
                        if ("female".equals(str2)) {
                            this.x = str2;
                            editTextBoldCursor.setText(org.telegram.messenger.hd.M0(2131747568, null));
                            break;
                        }
                    } else {
                        this.x = str2;
                        editTextBoldCursor.setText(org.telegram.messenger.hd.M0(2131747507, null));
                        break;
                    }
                    break;
                case "expiry_date":
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.y;
                    if (!isEmpty) {
                        String[] split = str2.split("\\.");
                        if (split.length == 3) {
                            iArr[0] = Utilities.z(split[2]).intValue();
                            iArr[1] = Utilities.z(split[1]).intValue();
                            iArr[2] = Utilities.z(split[0]).intValue();
                            editTextBoldCursor.setText(str2);
                            break;
                        }
                    }
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    editTextBoldCursor.setText(org.telegram.messenger.hd.M0(2131747493, null));
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

    public final void O1(Bundle bundle, int i7, boolean z9) {
        if (i7 == 3) {
            this.L.setVisibility(8);
        }
        int i10 = this.I1;
        org.telegram.ui.Components.wt0[] wt0VarArr = this.J1;
        org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i10];
        org.telegram.ui.Components.wt0 wt0Var2 = wt0VarArr[i7];
        this.I1 = i7;
        wt0Var2.m(bundle, false);
        wt0Var2.j();
        if (!z9) {
            wt0Var2.setTranslationX(0.0f);
            wt0Var2.setVisibility(0);
            if (wt0Var != wt0Var2) {
                wt0Var.setVisibility(8);
                return;
            }
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        wt0Var2.setTranslationX(point.x);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(wt0Var, "translationX", -point.x), ObjectAnimator.ofFloat(wt0Var2, "translationX", 0.0f));
        animatorSet.addListener(new org.telegram.ui.Components.v50(wt0Var2, wt0Var, 10));
        animatorSet.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x031e, code lost:
    
        if (r4.equals("residence_country_code") != false) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022a A[Catch: all -> 0x023e, TryCatch #3 {all -> 0x023e, blocks: (B:180:0x0220, B:181:0x0224, B:183:0x022a, B:185:0x0236, B:188:0x0242), top: B:179:0x0220, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0256 A[Catch: Exception -> 0x036a, TryCatch #2 {Exception -> 0x036a, blocks: (B:273:0x01ec, B:192:0x0253, B:194:0x0256, B:197:0x0260, B:266:0x024e, B:279:0x0209, B:180:0x0220, B:181:0x0224, B:183:0x022a, B:185:0x0236, B:188:0x0242), top: B:272:0x01ec, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P1(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, boolean z9, int i7) {
        int i10;
        StringBuilder sb2;
        boolean z10;
        TLRPC.TL_secureValue tL_secureValue;
        ak0 ak0Var;
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
        StringBuilder sb3;
        int i14;
        String[] strArr5;
        HashMap hashMap3;
        HashMap hashMap4;
        JSONObject jSONObject3;
        Iterator<String> keys;
        String sb4;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        HashMap hashMap5;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4;
        HashMap hashMap6;
        TLRPC.SecureValueType secureValueType;
        boolean z11;
        boolean z12;
        ak0 ak0Var2;
        String str4 = str2;
        ak0 ak0Var3 = (ak0) this.q1.get(tL_secureRequiredType);
        if (ak0Var3 == null) {
            if (this.b != 8) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (tL_secureRequiredType2 != null) {
                arrayList.add(tL_secureRequiredType2);
            }
            LinearLayout linearLayout = this.c0;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 6);
            if (childAt instanceof ak0) {
                ((ak0) childAt).setNeedDivider(true);
            }
            ak0Var3 = Y0(getParentActivity(), tL_secureRequiredType, arrayList, true, true);
            V1();
        }
        ak0 ak0Var4 = ak0Var3;
        HashMap hashMap7 = (HashMap) this.p1.get(tL_secureRequiredType);
        HashMap hashMap8 = tL_secureRequiredType2 != null ? (HashMap) this.p1.get(tL_secureRequiredType2) : null;
        TLRPC.TL_secureValue v12 = v1(tL_secureRequiredType, true);
        TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType2, true);
        if (str4 == null || this.Y0 != null) {
            i10 = 2;
            this.Y0 = null;
        } else {
            this.Y0 = new HashMap();
            try {
                i10 = 2;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt")));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split(";");
                        this.Y0.put(split[1], split[2]);
                    }
                    bufferedReader.close();
                } catch (Exception e10) {
                    e = e10;
                    org.telegram.messenger.a8.g(e, true);
                    if (str == null) {
                    }
                    if (z9) {
                    }
                    if (tL_secureRequiredType2 == null) {
                    }
                    if (hashMap5 != null) {
                    }
                    secureValueType = tL_secureRequiredType3.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    }
                    ak0Var2.setValue(sb4);
                    org.telegram.ui.ActionBar.r6.V(ak0Var2.b, !z12 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.z6, null);
                    ak0Var2.setChecked((!z12 || this.b == 8 || ((!z9 || tL_secureRequiredType4 == null) && (z9 || tL_secureValue == null)) || (tL_secureRequiredType4 != null && v13 == null)) ? z10 : z11);
                }
            } catch (Exception e11) {
                e = e11;
                i10 = 2;
            }
        }
        if (str == null) {
            TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
                sb4 = pf.b.c().b("+".concat(str));
                ak0Var = ak0Var4;
            } else {
                ak0Var = ak0Var4;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
                    sb4 = str;
                } else {
                    tL_secureValue = v12;
                    z10 = false;
                    sb4 = null;
                }
            }
            tL_secureValue = v12;
            z10 = false;
        } else {
            if (this.b == 8 || tL_secureRequiredType2 == null || (TextUtils.isEmpty(str3) && v13 == null)) {
                sb2 = null;
            } else {
                sb2 = new StringBuilder();
                if (i7 > 1) {
                    sb2.append(u1(tL_secureRequiredType2.type));
                } else if (TextUtils.isEmpty(str3)) {
                    sb2.append(org.telegram.messenger.hd.M0(2131747575, null));
                }
            }
            if (str4 == null && str3 == null) {
                ak0Var = ak0Var4;
                tL_secureValue = v12;
                z10 = false;
            } else {
                if (hashMap7 == null) {
                    return;
                }
                hashMap7.clear();
                TLRPC.SecureValueType secureValueType3 = tL_secureRequiredType.type;
                z10 = false;
                boolean z13 = true;
                tL_secureValue = v12;
                ak0Var = ak0Var4;
                if (secureValueType3 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                    int i15 = this.b;
                    if (i15 != 0 || z9) {
                        int i16 = i15 == 8 ? tL_secureRequiredType2 != null ? 8 : 8 : 8;
                        strArr2 = null;
                        if (i15 != 0 || (i15 == i16 && tL_secureRequiredType2 != null)) {
                            strArr = new String[i10];
                            strArr[0] = "document_no";
                            strArr[1] = "expiry_date";
                            if (strArr2 == null || strArr != null) {
                                StringBuilder sb5 = sb2;
                                String[] strArr6 = strArr;
                                i12 = 0;
                                JSONObject jSONObject4 = null;
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
                                                        org.telegram.messenger.a8.g(th2, z13);
                                                    }
                                                    i14 = 0;
                                                    while (i14 < strArr3.length) {
                                                        if (jSONObject.has(strArr3[i14])) {
                                                            sb2 = sb5 == null ? new StringBuilder() : sb5;
                                                            strArr5 = strArr3;
                                                            try {
                                                                String string = jSONObject.getString(strArr5[i14]);
                                                                if (string == null || TextUtils.isEmpty(string)) {
                                                                    hashMap3 = hashMap7;
                                                                } else {
                                                                    hashMap3 = hashMap7;
                                                                    if (!"first_name_native".equals(strArr5[i14]) && !"middle_name_native".equals(strArr5[i14]) && !"last_name_native".equals(strArr5[i14])) {
                                                                        if (sb2.length() > 0) {
                                                                            if (!"last_name".equals(strArr5[i14]) && !"last_name_native".equals(strArr5[i14]) && !"middle_name".equals(strArr5[i14]) && !"middle_name_native".equals(strArr5[i14])) {
                                                                                sb2.append(", ");
                                                                            }
                                                                            sb2.append(" ");
                                                                        }
                                                                        String str5 = strArr5[i14];
                                                                        hashMap4 = hashMap8;
                                                                        int hashCode = str5.hashCode();
                                                                        jSONObject3 = jSONObject;
                                                                        if (hashCode != -2006252145) {
                                                                            if (hashCode != -1249512767) {
                                                                                if (hashCode == 1481071862 && str5.equals("country_code")) {
                                                                                    String str6 = (String) this.Y0.get(string);
                                                                                    if (str6 != null) {
                                                                                        sb2.append(str6);
                                                                                    }
                                                                                }
                                                                            } else if (str5.equals("gender")) {
                                                                                if ("male".equals(string)) {
                                                                                    sb2.append(org.telegram.messenger.hd.M0(2131747507, null));
                                                                                } else if ("female".equals(string)) {
                                                                                    sb2.append(org.telegram.messenger.hd.M0(2131747568, null));
                                                                                }
                                                                            }
                                                                            sb2.append(string);
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
                                                            sb2 = sb5;
                                                        }
                                                        i14++;
                                                        sb5 = sb2;
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
                                                sb3 = sb5;
                                                i12 = i13 + 1;
                                                str4 = str2;
                                                sb5 = sb3;
                                                strArr7 = strArr4;
                                                hashMap7 = hashMap;
                                                hashMap8 = hashMap2;
                                                jSONObject4 = jSONObject2;
                                                z13 = true;
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
                                        sb3 = sb5;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb5 = sb3;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z13 = true;
                                    } else if (hashMap8 == null) {
                                        jSONObject2 = jSONObject4;
                                        hashMap = hashMap7;
                                        hashMap2 = hashMap8;
                                        strArr4 = strArr7;
                                        sb3 = sb5;
                                        i13 = i12;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb5 = sb3;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z13 = true;
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
                                            sb3 = sb5;
                                            i12 = i13 + 1;
                                            str4 = str2;
                                            sb5 = sb3;
                                            strArr7 = strArr4;
                                            hashMap7 = hashMap;
                                            hashMap8 = hashMap2;
                                            jSONObject4 = jSONObject2;
                                            z13 = true;
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
                                        sb3 = sb5;
                                        i12 = i13 + 1;
                                        str4 = str2;
                                        sb5 = sb3;
                                        strArr7 = strArr4;
                                        hashMap7 = hashMap;
                                        hashMap8 = hashMap2;
                                        jSONObject4 = jSONObject2;
                                        z13 = true;
                                    }
                                }
                                sb2 = sb5;
                            }
                        }
                        strArr = null;
                        if (strArr2 == null) {
                        }
                        StringBuilder sb52 = sb2;
                        String[] strArr62 = strArr;
                        i12 = 0;
                        JSONObject jSONObject42 = null;
                        String[] strArr72 = null;
                        while (i12 < 2) {
                        }
                        sb2 = sb52;
                    }
                    String[] strArr9 = new String[10];
                    strArr9[0] = "first_name";
                    strArr9[1] = "middle_name";
                    strArr9[i10] = "last_name";
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
                    strArr = new String[i10];
                    strArr[0] = "document_no";
                    strArr[1] = "expiry_date";
                    if (strArr2 == null) {
                    }
                    StringBuilder sb522 = sb2;
                    String[] strArr622 = strArr;
                    i12 = 0;
                    JSONObject jSONObject422 = null;
                    String[] strArr722 = null;
                    while (i12 < 2) {
                    }
                    sb2 = sb522;
                } else if (!(secureValueType3 instanceof TLRPC.TL_secureValueTypeAddress) || (((i11 = this.b) != 0 || z9) && !(i11 == 8 && tL_secureRequiredType2 == null))) {
                    strArr = null;
                    strArr2 = null;
                    if (strArr2 == null) {
                    }
                    StringBuilder sb5222 = sb2;
                    String[] strArr6222 = strArr;
                    i12 = 0;
                    JSONObject jSONObject4222 = null;
                    String[] strArr7222 = null;
                    while (i12 < 2) {
                    }
                    sb2 = sb5222;
                } else {
                    strArr2 = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                    strArr = null;
                    if (strArr2 == null) {
                    }
                    StringBuilder sb52222 = sb2;
                    String[] strArr62222 = strArr;
                    i12 = 0;
                    JSONObject jSONObject42222 = null;
                    String[] strArr72222 = null;
                    while (i12 < 2) {
                    }
                    sb2 = sb52222;
                }
            }
            if (sb2 != null) {
                sb4 = sb2.toString();
            }
            sb4 = null;
        }
        if (z9) {
            tL_secureRequiredType3 = tL_secureRequiredType;
            hashMap5 = (HashMap) this.u1.get(s1(tL_secureRequiredType3.type));
        } else {
            tL_secureRequiredType3 = tL_secureRequiredType;
            hashMap5 = null;
        }
        if (tL_secureRequiredType2 == null) {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            hashMap6 = (HashMap) this.u1.get(s1(tL_secureRequiredType4.type));
        } else {
            tL_secureRequiredType4 = tL_secureRequiredType2;
            hashMap6 = null;
        }
        if ((hashMap5 != null || hashMap5.size() <= 0) && (hashMap6 == null || hashMap6.size() <= 0)) {
            secureValueType = tL_secureRequiredType3.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                    if (TextUtils.isEmpty(sb4)) {
                        if (tL_secureRequiredType4 == null) {
                            sb4 = org.telegram.messenger.hd.M0(2131747598, null);
                        } else if (this.b == 8) {
                            sb4 = org.telegram.messenger.hd.M0(2131747575, null);
                        } else {
                            z11 = true;
                            if (i7 == 1) {
                                TLRPC.SecureValueType secureValueType4 = tL_secureRequiredType4.type;
                                if (secureValueType4 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                    sb4 = org.telegram.messenger.hd.M0(2131747624, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                    sb4 = org.telegram.messenger.hd.M0(2131747620, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                    sb4 = org.telegram.messenger.hd.M0(2131747610, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                    sb4 = org.telegram.messenger.hd.M0(2131747608, null);
                                } else if (secureValueType4 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                    sb4 = org.telegram.messenger.hd.M0(2131747622, null);
                                }
                            } else {
                                sb4 = org.telegram.messenger.hd.M0(2131747599, null);
                            }
                        }
                        z12 = z10;
                        ak0Var2 = ak0Var;
                        z11 = true;
                    }
                    z11 = true;
                } else {
                    z11 = true;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                        if (TextUtils.isEmpty(sb4)) {
                            sb4 = org.telegram.messenger.hd.M0(2131747486, null);
                        }
                    } else if ((secureValueType instanceof TLRPC.TL_secureValueTypeEmail) && TextUtils.isEmpty(sb4)) {
                        sb4 = org.telegram.messenger.hd.M0(2131747572, null);
                    }
                }
                z12 = z10;
                ak0Var2 = ak0Var;
            } else {
                if (TextUtils.isEmpty(sb4)) {
                    if (tL_secureRequiredType4 == null) {
                        sb4 = org.telegram.messenger.hd.M0(2131747489, null);
                    } else if (this.b == 8) {
                        sb4 = org.telegram.messenger.hd.M0(2131747575, null);
                    } else if (i7 == 1) {
                        TLRPC.SecureValueType secureValueType5 = tL_secureRequiredType4.type;
                        if (secureValueType5 instanceof TLRPC.TL_secureValueTypePassport) {
                            sb4 = org.telegram.messenger.hd.M0(2131747559, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                            sb4 = org.telegram.messenger.hd.M0(2131747560, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            sb4 = org.telegram.messenger.hd.M0(2131747562, null);
                        } else if (secureValueType5 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                            sb4 = org.telegram.messenger.hd.M0(2131747561, null);
                        }
                    } else {
                        sb4 = org.telegram.messenger.hd.M0(2131747563, null);
                    }
                    z12 = z10;
                    ak0Var2 = ak0Var;
                    z11 = true;
                }
                z11 = true;
                z12 = z10;
                ak0Var2 = ak0Var;
            }
        } else {
            sb4 = !z9 ? (String) this.v1.get(s1(tL_secureRequiredType3.type)) : null;
            if (sb4 == null) {
                sb4 = (String) this.v1.get(s1(tL_secureRequiredType4.type));
            }
            ak0Var2 = ak0Var;
            z11 = true;
            z12 = true;
        }
        ak0Var2.setValue(sb4);
        org.telegram.ui.ActionBar.r6.V(ak0Var2.b, !z12 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.z6, null);
        ak0Var2.setChecked((!z12 || this.b == 8 || ((!z9 || tL_secureRequiredType4 == null) && (z9 || tL_secureValue == null)) || (tL_secureRequiredType4 != null && v13 == null)) ? z10 : z11);
    }

    public final void Q1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = str2;
        showDialog(u1Var);
    }

    public final void R1(boolean z9, boolean z10) {
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        int i7 = 1;
        int i10 = 0;
        if (z9 && this.L != null) {
            this.M = new AnimatorSet();
            if (z10) {
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
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.N, (Property<org.telegram.ui.Components.zp, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.N, (Property<org.telegram.ui.Components.zp, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.N, (Property<org.telegram.ui.Components.zp, Float>) property3, 1.0f));
            } else {
                this.L.getContentView().setVisibility(0);
                this.L.setEnabled(true);
                AnimatorSet animatorSet3 = this.M;
                org.telegram.ui.Components.zp zpVar = this.N;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(zpVar, (Property<org.telegram.ui.Components.zp, Float>) property4, 0.1f);
                org.telegram.ui.Components.zp zpVar2 = this.N;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zpVar2, (Property<org.telegram.ui.Components.zp, Float>) property5, 0.1f);
                org.telegram.ui.Components.zp zpVar3 = this.N;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(zpVar3, (Property<org.telegram.ui.Components.zp, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.L.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.L.getContentView(), (Property<View, Float>) property6, 1.0f));
            }
            this.M.addListener(new hj0(this, z10, i10));
            this.M.setDuration(150L);
            this.M.start();
            return;
        }
        if (this.O != null) {
            this.M = new AnimatorSet();
            if (z10) {
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
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.P, (Property<org.telegram.ui.Components.zp, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.P, (Property<org.telegram.ui.Components.zp, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.P, (Property<org.telegram.ui.Components.zp, Float>) property9, 1.0f));
            } else {
                this.O.setVisibility(0);
                this.Q.setEnabled(true);
                AnimatorSet animatorSet5 = this.M;
                org.telegram.ui.Components.zp zpVar4 = this.P;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(zpVar4, (Property<org.telegram.ui.Components.zp, Float>) property10, 0.1f);
                org.telegram.ui.Components.zp zpVar5 = this.P;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(zpVar5, (Property<org.telegram.ui.Components.zp, Float>) property11, 0.1f);
                org.telegram.ui.Components.zp zpVar6 = this.P;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(zpVar6, (Property<org.telegram.ui.Components.zp, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.O, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<TextView, Float>) property12, 1.0f));
            }
            this.M.addListener(new hj0(this, z10, i7));
            this.M.setDuration(150L);
            this.M.start();
        }
    }

    public final void S1(boolean z9, String str, Runnable runnable, qj0 qj0Var, sj0 sj0Var) {
        boolean z10;
        TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
        boolean z11 = (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0) ? false : true;
        if (getParentActivity() == null || !z11) {
            z10 = true;
        } else {
            z10 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (z9) {
                this.M1.clear();
                if (!z10) {
                    this.M1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.M1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                        String M0 = org.telegram.messenger.hd.M0(2131754275, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.T = M0;
                        this.L1 = showDialog(u1Var);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.M1.toArray(new String[0]), 6);
                    }
                    this.E1 = str;
                    this.G1 = qj0Var;
                    this.F1 = runnable;
                    this.H1 = sj0Var;
                    return;
                }
            }
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        tL_codeSettings.allow_flashcall = z11 && z10;
        tL_codeSettings.allow_app_hash = org.telegram.messenger.tt.b.hasServices();
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z12 = org.telegram.messenger.r2.a;
            org.telegram.messenger.t0.u();
            edit.putString("sms_hash", "O2P2z+/jBpJ").commit();
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
            } catch (Exception e10) {
                sendverifyphonecode.settings.allow_flashcall = false;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new bi.g2(this, str, sj0Var, sendverifyphonecode, 14), 2);
    }

    public final void U1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            this.actionBar.setTitle(u1(tL_secureRequiredType.type));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747491, null));
        }
        X1(2);
        X1(3);
        X1(1);
        X1(4);
    }

    public final void V0(final org.telegram.messenger.ew ewVar, final int i7) {
        String M0;
        final String str;
        String v;
        HashMap hashMap;
        if (i7 == 1) {
            this.j1 = ewVar;
            if (this.g0 == null) {
                return;
            }
        } else if (i7 == 4) {
            this.k1.add(ewVar);
            if (this.h0 == null) {
                return;
            }
        } else if (i7 == 2) {
            this.l1 = ewVar;
            if (this.e0 == null) {
                return;
            }
        } else if (i7 == 3) {
            this.m1 = ewVar;
            if (this.f0 == null) {
                return;
            }
        } else {
            this.i1.add(ewVar);
            if (this.d0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final zj0 zj0Var = new zj0(this, getParentActivity());
        zj0Var.setTag(ewVar);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        zj0Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(zj0Var, N0, N, N2, null);
        this.n1.put(ewVar, zj0Var);
        String r12 = r1(ewVar);
        if (i7 == 1) {
            M0 = org.telegram.messenger.hd.M0(2131747462, null);
            this.g0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "selfie" + r12;
        } else if (i7 == 4) {
            M0 = org.telegram.messenger.hd.M0(2131753948, null);
            this.h0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "translation" + r12;
        } else if (i7 == 2) {
            TLRPC.SecureValueType secureValueType = this.F.type;
            M0 = ((secureValueType instanceof TLRPC.TL_secureValueTypePassport) || (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) ? org.telegram.messenger.hd.M0(2131747509, null) : org.telegram.messenger.hd.M0(2131747567, null);
            this.e0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "front" + r12;
        } else if (i7 == 3) {
            M0 = org.telegram.messenger.hd.M0(2131747471, null);
            this.f0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "reverse" + r12;
        } else {
            M0 = org.telegram.messenger.hd.M0(2131753948, null);
            this.d0.addView(zj0Var, c8.ha.o(-1, -2));
            str = "files" + r12;
        }
        TextView textView = zj0Var.b;
        if (str == null || (hashMap = this.x1) == null || (v = (String) hashMap.get(str)) == null) {
            v = org.telegram.messenger.hd.v(ewVar.b.date);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.p7, null);
            this.y1.put(str, "");
        }
        zj0Var.a.setText(M0);
        textView.setText(v);
        org.telegram.ui.Components.l9 l9Var = zj0Var.c;
        l9Var.getClass();
        org.telegram.messenger.hc hcVar = new org.telegram.messenger.hc();
        hcVar.h = ewVar;
        l9Var.n(hcVar, "48_48", null, null, null, null, 0, null);
        zj0Var.f = ewVar;
        zj0Var.a(false);
        zj0Var.setOnClickListener(new ai.v(this, i7, 26));
        zj0Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.ui0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                bk0 bk0Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bk0Var.getParentActivity());
                int i10 = i7;
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                if (i10 == 1) {
                    u1Var.T = org.telegram.messenger.hd.M0(2131747581, null);
                } else {
                    u1Var.T = org.telegram.messenger.hd.M0(2131747583, null);
                }
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                u1Var.R = org.telegram.messenger.hd.M0(R.string.AppName, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new bi.i6(bk0Var, ewVar, i10, zj0Var, str, 4));
                bk0Var.showDialog(u1Var);
                return true;
            }
        });
    }

    public final void V1() {
        if (this.D.values.isEmpty()) {
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
        if (w1(TLRPC.TL_secureValueTypePhone.class) || w1(TLRPC.TL_secureValueTypeEmail.class) || w1(TLRPC.TL_secureValueTypePersonalDetails.class) || w1(TLRPC.TL_secureValueTypePassport.class) || w1(TLRPC.TL_secureValueTypeInternalPassport.class) || w1(TLRPC.TL_secureValueTypeIdentityCard.class) || w1(TLRPC.TL_secureValueTypeDriverLicense.class) || w1(TLRPC.TL_secureValueTypeAddress.class) || w1(TLRPC.TL_secureValueTypeUtilityBill.class) || w1(TLRPC.TL_secureValueTypePassportRegistration.class) || w1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) || w1(TLRPC.TL_secureValueTypeBankStatement.class) || w1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.x0.setVisibility(0);
        } else {
            this.x0.setVisibility(8);
        }
    }

    public final void W0(TLRPC.TL_secureFile tL_secureFile, int i7) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] r10 = Utilities.r(m1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(r10, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(r10, 32, bArr4, 0, 16);
        V0(new org.telegram.messenger.ew(new org.telegram.messenger.fw(bArr3, bArr4), tL_secureFile, null, null, null), i7);
    }

    public final void W1() {
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
            this.G0.setLayoutParams(c8.ha.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
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
        this.G0.setLayoutParams(c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        if (this.Y != null) {
            TL_account.Password password2 = this.J;
            if (password2 == null || TextUtils.isEmpty(password2.hint)) {
                this.Y[0].setHint(org.telegram.messenger.hd.M0(2131748725, null));
            } else {
                this.Y[0].setHint(this.J.hint);
            }
        }
    }

    public final void X0(ArrayList arrayList) {
        this.i1.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i7);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        if ((r1 instanceof org.telegram.tgnet.TLRPC.TL_secureValueTypeDriverLicense) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1(int i7) {
        TLRPC.SecureValueType secureValueType;
        boolean z9 = true;
        if (i7 == 0) {
            if (this.R == null) {
                return;
            }
            if (this.i1.size() >= 1) {
                this.R.b(org.telegram.messenger.hd.M0(2131747452, null), false);
                return;
            } else {
                this.R.b(org.telegram.messenger.hd.M0(2131747451, null), false);
                return;
            }
        }
        if (i7 == 1) {
            org.telegram.ui.Cells.y8 y8Var = this.W;
            if (y8Var == null) {
                return;
            }
            y8Var.setVisibility(this.j1 != null ? 8 : 0);
            return;
        }
        if (i7 == 4) {
            if (this.X == null) {
                return;
            }
            if (this.k1.size() >= 1) {
                this.X.b(org.telegram.messenger.hd.M0(2131747452, null), false);
                return;
            } else {
                this.X.b(org.telegram.messenger.hd.M0(2131747451, null), false);
                return;
            }
        }
        if (i7 != 2) {
            if (i7 != 3 || this.V == null) {
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
        org.telegram.ui.Cells.y8 y8Var2 = this.U;
        if (y8Var2 == null) {
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
                y8Var2.a(org.telegram.messenger.hd.M0(2131747509, null), org.telegram.messenger.hd.M0(2131747508, null), z9);
            } else {
                y8Var2.a(org.telegram.messenger.hd.M0(2131747567, null), org.telegram.messenger.hd.M0(2131747566, null), z9);
            }
            this.U.setVisibility(this.l1 != null ? 8 : 0);
        }
        z9 = false;
        secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
        }
        y8Var2.a(org.telegram.messenger.hd.M0(2131747509, null), org.telegram.messenger.hd.M0(2131747508, null), z9);
        this.U.setVisibility(this.l1 != null ? 8 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ak0 Y0(Context context, TLRPC.TL_secureRequiredType tL_secureRequiredType, ArrayList arrayList, boolean z9, boolean z10) {
        String str;
        String str2;
        String str3;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        String str4;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        String str5;
        TLRPC.TL_secureValue v12;
        int size = arrayList != null ? arrayList.size() : 0;
        ak0 ak0Var = new ak0(context);
        int i7 = this.b;
        int i10 = i7 == 8 ? 21 : 51;
        TextView textView = new TextView(context);
        ak0Var.a = textView;
        TLRPC.TL_secureRequiredType tL_secureRequiredType4 = null;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        boolean z11 = org.telegram.messenger.hd.a0;
        ak0Var.addView(textView, c8.ha.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? i10 : 21, 10.0f, z11 ? 21 : i10, 0.0f));
        TextView textView2 = new TextView(context);
        ak0Var.b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z12 = org.telegram.messenger.hd.a0;
        ak0Var.addView(textView2, c8.ha.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? i10 : 21, 35.0f, z12 ? 21 : i10, 0.0f));
        ImageView imageView = new ImageView(context);
        ak0Var.c = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageResource(R.drawable.sticker_added);
        ak0Var.addView(imageView, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 21.0f, 25.0f, 21.0f, 0.0f));
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        ak0Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(ak0Var, N0, N, N2, null);
        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            ak0Var.a((arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.hd.M0(2131747490, null) : (z9 && arrayList.size() == 1) ? u1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type) : (z9 && arrayList.size() == 2) ? org.telegram.messenger.hd.a0("PassportTwoDocuments", null, 2131747453, u1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), u1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : org.telegram.messenger.hd.M0(2131747564, null), !z10);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            ak0Var.a((arrayList == null || arrayList.isEmpty()) ? org.telegram.messenger.hd.M0(2131747601, null) : (z9 && arrayList.size() == 1) ? u1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type) : (z9 && arrayList.size() == 2) ? org.telegram.messenger.hd.a0("PassportTwoDocuments", null, 2131747453, u1(((TLRPC.TL_secureRequiredType) arrayList.get(0)).type), u1(((TLRPC.TL_secureRequiredType) arrayList.get(1)).type)) : org.telegram.messenger.hd.M0(2131747472, null), !z10);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            ak0Var.a(org.telegram.messenger.hd.M0(2131747487, null), !z10);
        } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            ak0Var.a(org.telegram.messenger.hd.M0(2131747574, null), !z10);
        }
        if (i7 == 8) {
            this.c0.addView(ak0Var, r9.getChildCount() - 5, c8.ha.o(-1, -2));
        } else {
            this.c0.addView(ak0Var, c8.ha.o(-1, -2));
        }
        ak0Var.setOnClickListener(new di.r3(arrayList, tL_secureRequiredType, this, z9));
        this.q1.put(tL_secureRequiredType, ak0Var);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.p1;
        hashMap2.put(tL_secureRequiredType, hashMap);
        TLRPC.TL_secureValue v13 = v1(tL_secureRequiredType, false);
        if (v13 != null) {
            TLRPC.SecurePlainData securePlainData = v13.plain_data;
            if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                str = ((TLRPC.TL_securePlainEmail) securePlainData).email;
            } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                str = ((TLRPC.TL_securePlainPhone) securePlainData).phone;
            } else {
                TLRPC.TL_secureData tL_secureData = v13.data;
                if (tL_secureData != null) {
                    str2 = l1(tL_secureData.data, m1(tL_secureData.secret, tL_secureData.data_hash), v13.data.data_hash);
                    str = null;
                    if (arrayList != null || arrayList.isEmpty()) {
                        str3 = str;
                        tL_secureRequiredType2 = tL_secureRequiredType;
                        str4 = str2;
                        tL_secureRequiredType3 = null;
                        str5 = null;
                    } else {
                        int size2 = arrayList.size();
                        int i11 = 0;
                        boolean z13 = false;
                        String str6 = null;
                        while (i11 < size2) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList.get(i11);
                            hashMap2.put(tL_secureRequiredType5, new HashMap());
                            this.r1.put(tL_secureRequiredType5, tL_secureRequiredType);
                            String str7 = str;
                            if (!z13 && (v12 = v1(tL_secureRequiredType5, false)) != null) {
                                TLRPC.TL_secureData tL_secureData2 = v12.data;
                                if (tL_secureData2 != null) {
                                    str6 = l1(tL_secureData2.data, m1(tL_secureData2.secret, tL_secureData2.data_hash), v12.data.data_hash);
                                }
                                tL_secureRequiredType4 = tL_secureRequiredType5;
                                z13 = true;
                            }
                            i11++;
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
                    P1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z9, size);
                    return ak0Var;
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
            P1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z9, size);
            return ak0Var;
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
        P1(tL_secureRequiredType2, str3, str4, tL_secureRequiredType3, str5, z9, size);
        return ak0Var;
    }

    public final void Z0(ArrayList arrayList) {
        this.k1.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i7);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                W0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void a1(boolean z9) {
        if (this.g1) {
            return;
        }
        String str = this.n;
        boolean isEmpty = TextUtils.isEmpty(str);
        int i7 = this.b;
        if (isEmpty) {
            if (this.C1) {
                if (z9 || (!this.f1 && (i7 == 5 || i7 == 0))) {
                    getParentActivity().setResult(z9 ? -1 : 0);
                }
                this.g1 = true;
                return;
            }
            return;
        }
        if (z9) {
            vf.c.q(getParentActivity(), Uri.parse(str + "&tg_passport=success"), true, true);
        } else if (!this.f1 && (i7 == 5 || i7 == 0)) {
            vf.c.q(getParentActivity(), Uri.parse(str + "&tg_passport=cancel"), true, true);
        }
        this.g1 = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    public final boolean b1(boolean z9) {
        if (y1()) {
            return false;
        }
        int i7 = 1;
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747579, null), new si0(this, i7));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            String M0 = org.telegram.messenger.hd.M0(2131751406, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131747578, null);
            showDialog(u1Var);
        }
        return true;
    }

    public final void c1(boolean z9) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.a0 == null) {
            return;
        }
        String str2 = (String) this.Y0.get(this.w);
        String str3 = (String) org.telegram.messenger.iz.n().get(this.w);
        int i7 = 0;
        if (!this.E.native_names || TextUtils.isEmpty(this.w) || "EN".equals(str3)) {
            if (this.q0.getVisibility() != 8) {
                this.q0.setVisibility(8);
                this.j0.setVisibility(8);
                this.T.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.a0;
                    if (i7 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr2[i7].getParent()).setVisibility(8);
                    i7++;
                }
                if (((this.c == 0 && this.F != null) || this.H == null || this.v0) && this.I == null) {
                    org.telegram.ui.ActionBar.r6.a0(this.m0, getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    return;
                } else {
                    org.telegram.ui.ActionBar.r6.a0(this.m0, getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
                    return;
                }
            }
            return;
        }
        int i10 = 2;
        if (this.q0.getVisibility() != 0) {
            this.q0.setVisibility(0);
            this.j0.setVisibility(0);
            this.T.setVisibility(0);
            int i11 = 0;
            while (true) {
                editTextBoldCursorArr = this.a0;
                if (i11 >= editTextBoldCursorArr.length) {
                    break;
                }
                ((View) editTextBoldCursorArr[i11].getParent()).setVisibility(0);
                i11++;
            }
            if (editTextBoldCursorArr[0].length() == 0 && this.a0[1].length() == 0 && this.a0[2].length() == 0) {
                int i12 = 0;
                while (true) {
                    boolean[] zArr = this.t0;
                    if (i12 >= zArr.length) {
                        break;
                    }
                    if (zArr[i12]) {
                        this.a0[0].setText(this.Y[0].getText());
                        this.a0[1].setText(this.Y[1].getText());
                        this.a0[2].setText(this.Y[2].getText());
                        break;
                    }
                    i12++;
                }
            }
            org.telegram.ui.ActionBar.r6.a0(this.m0, getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7);
        }
        this.q0.setText(org.telegram.messenger.hd.a0("PassportNativeInfo", null, 2131747497, str2));
        if (str3 != null) {
            String concat = "PassportLanguage_".concat(str3);
            str = org.telegram.messenger.hd.E0().Y.b(concat);
            if (str == null) {
                org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
                E0.i();
                str = E0.W.b(concat);
            }
        } else {
            str = null;
        }
        if (str != null) {
            this.j0.setText(org.telegram.messenger.hd.a0("PassportNativeHeaderLang", null, 2131747498, str));
        } else {
            this.j0.setText(org.telegram.messenger.hd.M0(2131747499, null));
        }
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        if (str != null) {
                            this.a0[i13].setHintText(org.telegram.messenger.hd.M0(2131747457, null));
                        } else {
                            this.a0[i13].setHintText(org.telegram.messenger.hd.a0("PassportSurnameCountry", null, 2131747456, str2));
                        }
                    }
                } else if (str != null) {
                    this.a0[i13].setHintText(org.telegram.messenger.hd.M0(2131747506, null));
                } else {
                    this.a0[i13].setHintText(org.telegram.messenger.hd.a0("PassportMidnameCountry", null, 2131747505, str2));
                }
            } else if (str != null) {
                this.a0[i13].setHintText(org.telegram.messenger.hd.M0(2131747503, null));
            } else {
                this.a0[i13].setHintText(org.telegram.messenger.hd.a0("PassportNameCountry", null, 2131747501, str2));
            }
        }
        if (z9) {
            org.telegram.messenger.g0.h3(new pi0(this, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a62  */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i7;
        int i10;
        TLRPC.User user;
        org.telegram.ui.ActionBar.f6 f6Var;
        ArrayList arrayList;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        boolean z9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.User f10;
        org.telegram.ui.Components.di diVar;
        Context context2 = context;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new kj0(this));
        int i11 = 4;
        int i12 = 2;
        int i13 = this.b;
        if (i13 == 7) {
            org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(this, context2, i11);
            this.b0 = m1Var;
            this.fragmentView = m1Var;
            m1Var.setFillViewport(true);
            org.telegram.messenger.g0.z3(this.b0, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
        } else {
            FrameLayout frameLayout = new FrameLayout(context2);
            this.fragmentView = frameLayout;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
            org.telegram.ui.Components.h60 h60Var = new org.telegram.ui.Components.h60(context2, i12);
            this.b0 = h60Var;
            h60Var.setFillViewport(true);
            org.telegram.messenger.g0.z3(this.b0, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
            frameLayout.addView(this.b0, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, i13 == 0 ? 48.0f : 0.0f));
            LinearLayout linearLayout = new LinearLayout(context2);
            this.c0 = linearLayout;
            linearLayout.setOrientation(1);
            this.b0.addView(this.c0, new FrameLayout.LayoutParams(-1, -2));
        }
        if (i13 != 0 && i13 != 8) {
            this.L = this.actionBar.q().h(2, R.drawable.ic_ab_done, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.hd.M0(2131751355, null));
            org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context2, 1);
            this.N = zpVar;
            zpVar.setAlpha(0.0f);
            this.N.setScaleX(0.1f);
            this.N.setScaleY(0.1f);
            this.N.setVisibility(4);
            this.L.addView(this.N, c8.ha.c(-1.0f, -1));
            if ((i13 == 1 || i13 == 2) && (diVar = this.R0) != null) {
                try {
                    if (diVar.isShowing()) {
                        this.R0.dismiss();
                    }
                } catch (Exception unused) {
                }
                this.R0.j1();
                this.R0 = null;
            }
        }
        if (i13 == 5) {
            if (this.D != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= this.D.users.size()) {
                        f10 = null;
                        break;
                    }
                    f10 = this.D.users.get(i14);
                    int i15 = i14;
                    if (f10.id == this.c) {
                        break;
                    }
                    i14 = i15 + 1;
                }
            } else {
                f10 = org.telegram.messenger.p10.i(this.currentAccount).f();
            }
            FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131744238, null));
            org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context2, null);
            this.F0 = iyVar;
            iyVar.b();
            frameLayout2.addView(this.F0, c8.ha.c(-1.0f, -1));
            FrameLayout frameLayout3 = new FrameLayout(context2);
            this.L0 = frameLayout3;
            this.c0.addView(frameLayout3, c8.ha.o(-1, 100));
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context2);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            this.L0.addView(l9Var, c8.ha.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
            l9Var.e(f10, new org.telegram.ui.Components.w8(0, f10));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context2);
            this.G0 = z8Var;
            z8Var.getTextView().setGravity(1);
            if (this.c == 0) {
                this.G0.setText(org.telegram.messenger.hd.M0(2131747463, null));
            } else {
                this.G0.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("PassportRequest", null, 2131747477, org.telegram.messenger.t10.j(f10, true))));
            }
            ((FrameLayout.LayoutParams) this.G0.getTextView().getLayoutParams()).gravity = 1;
            this.c0.addView(this.G0, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
            ImageView imageView = new ImageView(context2);
            this.I0 = imageView;
            imageView.setImageResource(R.drawable.no_password);
            org.telegram.ui.ActionBar.r6.t(this.I0, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
            this.c0.addView(this.I0, c8.ha.t(-2, -2, 49, 0, 13, 0, 0));
            TextView textView = new TextView(context2);
            this.J0 = textView;
            textView.setTextSize(1, 14.0f);
            this.J0.setGravity(1);
            this.J0.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(17.0f));
            org.telegram.ui.ActionBar.r6.V(this.J0, org.telegram.ui.ActionBar.k6.B6, null);
            this.J0.setText(org.telegram.messenger.hd.M0(2131744236, null));
            this.c0.addView(this.J0, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
            TextView textView2 = new TextView(context2);
            this.K0 = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r6, null);
            this.K0.setGravity(17);
            this.K0.setTextSize(1, 16.0f);
            this.K0.setTypeface(org.telegram.messenger.g0.o());
            this.K0.setText(org.telegram.messenger.hd.M0(2131744237, null));
            this.c0.addView(this.K0, c8.ha.d(-1, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 21.0f, 9.0f, 21.0f, 0.0f));
            this.K0.setOnClickListener(new qi0(this, 10));
            this.Y = new EditTextBoldCursor[1];
            this.Z = new ViewGroup[]{new FrameLayout(context2)};
            this.c0.addView(this.Z[0], c8.ha.o(-1, 50));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.Z[0], null);
            this.Y[0] = new EditTextBoldCursor(context2);
            this.Y[0].setTag(0);
            this.Y[0].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.E(this.Y[0], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Y[0];
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i16, null);
            this.Y[0].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Y[0], i16, null);
            this.Y[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Y[0].setCursorWidth(1.5f);
            this.Y[0].setInputType(org.telegram.messenger.qs.N1);
            this.Y[0].setMaxLines(1);
            this.Y[0].setLines(1);
            this.Y[0].setSingleLine(true);
            this.Y[0].setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.Y[0].setTypeface(Typeface.DEFAULT);
            this.Y[0].setImeOptions(268435462);
            this.Y[0].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            this.Y[0].setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            this.Z[0].addView(this.Y[0], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            this.Y[0].setOnEditorActionListener(new oi0(this, 5));
            this.Y[0].setCustomSelectionActionModeCallback(new li.a1(3));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context2);
            this.H0 = z8Var2;
            org.telegram.ui.ActionBar.r6.a0(z8Var2, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
            this.H0.setText(org.telegram.messenger.hd.a0("PassportRequestPasswordInfo", null, 2131747476, new Object[0]));
            this.c0.addView(this.H0, c8.ha.o(-1, -2));
            TextView textView3 = new TextView(context2);
            this.M0 = textView3;
            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q6, null);
            this.M0.setTextSize(1, 14.0f);
            this.M0.setText(org.telegram.messenger.hd.M0(2131750592, null));
            this.M0.setPadding(0, 0, 0, 0);
            this.c0.addView(this.M0, c8.ha.t(-2, 30, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 21, 0, 21, 0));
            this.M0.setOnClickListener(new qi0(this, 11));
            W1();
        } else if (i13 == 0) {
            if (this.D != null) {
                for (int i17 = 0; i17 < this.D.users.size(); i17++) {
                    TLRPC.User user2 = this.D.users.get(i17);
                    if (user2.id == this.c) {
                        user = user2;
                        break;
                    }
                }
            }
            user = null;
            FrameLayout frameLayout4 = (FrameLayout) this.fragmentView;
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131744238, null));
            this.actionBar.q().a(1, R.drawable.msg_info);
            if (user != null) {
                FrameLayout frameLayout5 = new FrameLayout(context2);
                this.c0.addView(frameLayout5, c8.ha.o(-1, 100));
                org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context2);
                l9Var2.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
                frameLayout5.addView(l9Var2, c8.ha.d(64, 64.0f, 17, 0.0f, 8.0f, 0.0f, 0.0f));
                l9Var2.e(user, new org.telegram.ui.Components.w8(0, user));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context2);
                this.n0 = z8Var3;
                org.telegram.ui.ActionBar.r6.a0(z8Var3, context2, R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.b7);
                this.n0.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("PassportRequest", null, 2131747477, org.telegram.messenger.t10.j(user, true))));
                this.n0.getTextView().setGravity(1);
                ((FrameLayout.LayoutParams) this.n0.getTextView().getLayoutParams()).gravity = 1;
                this.c0.addView(this.n0, c8.ha.o(-1, -2));
            }
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2);
            this.j0 = n4Var;
            n4Var.setText(org.telegram.messenger.hd.M0(2131747475, null));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.j0, null);
            this.c0.addView(this.j0, c8.ha.o(-1, -2));
            TL_account.authorizationForm authorizationform = this.D;
            if (authorizationform != null) {
                int size = authorizationform.required_types.size();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                boolean z10 = false;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                for (int i20 = 0; i20 < size; i20++) {
                    TLRPC.SecureRequiredType secureRequiredType = this.D.required_types.get(i20);
                    if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) secureRequiredType;
                        if (z1(tL_secureRequiredType3.type)) {
                            arrayList4.add(tL_secureRequiredType3);
                            i18++;
                        } else if (x1(tL_secureRequiredType3.type)) {
                            arrayList5.add(tL_secureRequiredType3);
                            i19++;
                        } else {
                            TLRPC.SecureValueType secureValueType = tL_secureRequiredType3.type;
                            if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                z10 = true;
                            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                z11 = true;
                            }
                        }
                    } else if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                        if (!tL_secureRequiredTypeOneOf.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                            if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                                if (z1(tL_secureRequiredType4.type)) {
                                    int size2 = tL_secureRequiredTypeOneOf.types.size();
                                    for (int i21 = 0; i21 < size2; i21++) {
                                        TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i21);
                                        if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList4.add((TLRPC.TL_secureRequiredType) secureRequiredType3);
                                        }
                                    }
                                    i18++;
                                } else if (x1(tL_secureRequiredType4.type)) {
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
                boolean z12 = !z10 || i18 > 1;
                boolean z13 = !z11 || i19 > 1;
                int i23 = 0;
                while (i23 < size) {
                    TLRPC.SecureRequiredType secureRequiredType5 = this.D.required_types.get(i23);
                    if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredType) {
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType5;
                        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType5.type;
                        if ((secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) || (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail)) {
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                            arrayList = null;
                            z9 = false;
                        } else {
                            if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                if (!z12) {
                                    arrayList3 = arrayList4;
                                    arrayList = arrayList3;
                                    z9 = false;
                                }
                                arrayList3 = null;
                                arrayList = arrayList3;
                                z9 = false;
                            } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                                if (!z13) {
                                    arrayList3 = arrayList5;
                                    arrayList = arrayList3;
                                    z9 = false;
                                }
                                arrayList3 = null;
                                arrayList = arrayList3;
                                z9 = false;
                            } else {
                                if (z12 && z1(secureValueType2)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                } else if (z13 && x1(tL_secureRequiredType5.type)) {
                                    arrayList2 = new ArrayList();
                                    arrayList2.add(tL_secureRequiredType5);
                                    tL_secureRequiredType5 = new TLRPC.TL_secureRequiredType();
                                    tL_secureRequiredType5.type = new TLRPC.TL_secureValueTypeAddress();
                                }
                                arrayList = arrayList2;
                                z9 = true;
                            }
                            tL_secureRequiredType2 = tL_secureRequiredType5;
                        }
                        Y0(context, tL_secureRequiredType2, arrayList, z9, i23 != size + (-1));
                    } else if (secureRequiredType5 instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                        TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf2 = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType5;
                        if (!tL_secureRequiredTypeOneOf2.types.isEmpty()) {
                            TLRPC.SecureRequiredType secureRequiredType6 = tL_secureRequiredTypeOneOf2.types.get(0);
                            if (secureRequiredType6 instanceof TLRPC.TL_secureRequiredType) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = (TLRPC.TL_secureRequiredType) secureRequiredType6;
                                if ((z12 && z1(tL_secureRequiredType6.type)) || (z13 && x1(tL_secureRequiredType6.type))) {
                                    arrayList = new ArrayList();
                                    int size4 = tL_secureRequiredTypeOneOf2.types.size();
                                    for (int i24 = 0; i24 < size4; i24++) {
                                        TLRPC.SecureRequiredType secureRequiredType7 = tL_secureRequiredTypeOneOf2.types.get(i24);
                                        if (secureRequiredType7 instanceof TLRPC.TL_secureRequiredType) {
                                            arrayList.add((TLRPC.TL_secureRequiredType) secureRequiredType7);
                                        }
                                    }
                                    if (z1(tL_secureRequiredType6.type)) {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
                                    } else {
                                        tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                                        tL_secureRequiredType.type = new TLRPC.TL_secureValueTypeAddress();
                                    }
                                    tL_secureRequiredType2 = tL_secureRequiredType;
                                    z9 = true;
                                    Y0(context, tL_secureRequiredType2, arrayList, z9, i23 != size + (-1));
                                }
                            }
                        }
                    }
                    i23++;
                }
                context2 = context;
            }
            if (user != null) {
                org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context2);
                this.n0 = z8Var4;
                org.telegram.ui.ActionBar.r6.a0(z8Var4, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                org.telegram.ui.Cells.z8 z8Var5 = this.n0;
                int i25 = org.telegram.ui.ActionBar.k6.B6;
                z8Var5.setLinkTextColorKey(i25);
                if (TextUtils.isEmpty(this.D.privacy_policy_url)) {
                    f6Var = null;
                    this.n0.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("PassportNoPolicy", null, 2131747492, org.telegram.messenger.t10.j(user, true), user.username)));
                } else {
                    String a02 = org.telegram.messenger.hd.a0("PassportPolicy", null, 2131747480, org.telegram.messenger.t10.j(user, true), user.username);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                    int indexOf = a02.indexOf(42);
                    int lastIndexOf = a02.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1) {
                        this.n0.getTextView().setMovementMethod(new org.telegram.messenger.c0(false));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new rj0(this), indexOf, lastIndexOf - 1, 33);
                    }
                    this.n0.setText(spannableStringBuilder);
                    f6Var = null;
                }
                org.telegram.ui.ActionBar.r6.D(this.n0.getTextView(), i25, f6Var);
                this.n0.getTextView().setGravity(1);
                this.c0.addView(this.n0, c8.ha.o(-1, -2));
            }
            FrameLayout frameLayout6 = new FrameLayout(context2);
            this.Q = frameLayout6;
            int i26 = org.telegram.ui.ActionBar.k6.fi;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i26, false);
            int i27 = org.telegram.ui.ActionBar.k6.gi;
            org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(x02, org.telegram.ui.ActionBar.k6.x0(null, i27, false));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i26);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i27);
            frameLayout6.setBackground(i02);
            org.telegram.ui.ActionBar.r6.k(frameLayout6, i02, N, N2, null);
            frameLayout4.addView(this.Q, c8.ha.e(-1, 48, 80));
            this.Q.setOnClickListener(new qi0(this, 15));
            TextView textView4 = new TextView(context2);
            this.O = textView4;
            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            this.O.setCompoundDrawablesWithIntrinsicBounds(R.drawable.authorize, 0, 0, 0);
            org.telegram.ui.ActionBar.r6.V(this.O, org.telegram.ui.ActionBar.k6.hi, null);
            this.O.setText(org.telegram.messenger.hd.M0(2131747597, null));
            this.O.setTextSize(1, 14.0f);
            this.O.setGravity(17);
            this.O.setTypeface(org.telegram.messenger.g0.o());
            this.Q.addView(this.O, c8.ha.e(-2, -1, 17));
            org.telegram.ui.Components.zp zpVar2 = new org.telegram.ui.Components.zp(context2, 0);
            this.P = zpVar2;
            zpVar2.setVisibility(4);
            this.Q.addView(this.P, c8.ha.c(-1.0f, -1));
            View view = new View(context2);
            view.setBackgroundResource(R.drawable.header_shadow_reverse);
            frameLayout4.addView(view, c8.ha.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        } else if (i13 == 1) {
            i1(context);
            if (this.a == null) {
                this.a = q1();
            }
        } else if (i13 == 2) {
            f1(context);
            if (this.a == null) {
                this.a = q1();
            }
        } else if (i13 == 3) {
            k1(context);
        } else {
            int i28 = 6;
            if (i13 == 4) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747574, null));
                if (TextUtils.isEmpty(this.d1)) {
                    i7 = -1;
                } else {
                    org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context2);
                    org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.q6, null);
                    org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
                    org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
                    org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
                    w9Var.setBackground(N0);
                    org.telegram.ui.ActionBar.r6.k(w9Var, N0, N3, N4, null);
                    w9Var.b(org.telegram.messenger.hd.a0("PassportPhoneUseSame", null, 2131747483, this.d1), false);
                    this.c0.addView(w9Var, c8.ha.o(-1, -2));
                    w9Var.setOnClickListener(new qi0(this, i28));
                    org.telegram.ui.Cells.z8 z8Var6 = new org.telegram.ui.Cells.z8(context2);
                    this.n0 = z8Var6;
                    org.telegram.ui.ActionBar.r6.a0(z8Var6, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    this.n0.setText(org.telegram.messenger.hd.M0(2131747482, null));
                    i7 = -1;
                    this.c0.addView(this.n0, c8.ha.o(-1, -2));
                }
                this.Y = new EditTextBoldCursor[1];
                FrameLayout frameLayout7 = new FrameLayout(context2);
                this.c0.addView(frameLayout7, c8.ha.o(i7, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout7, null);
                this.Y[0] = new EditTextBoldCursor(context2);
                this.Y[0].setTag(0);
                this.Y[0].setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.r6.E(this.Y[0], org.telegram.ui.ActionBar.k6.H6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Y[0];
                int i29 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i29, null);
                this.Y[0].setBackgroundDrawable(null);
                org.telegram.ui.ActionBar.r6.w(this.Y[0], i29, null);
                this.Y[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.Y[0].setCursorWidth(1.5f);
                this.Y[0].setInputType(33);
                this.Y[0].setImeOptions(268435462);
                this.Y[0].setHint(org.telegram.messenger.hd.M0(2131747375, null));
                TLRPC.TL_secureValue tL_secureValue = this.H;
                if (tL_secureValue != null) {
                    TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
                    if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                        TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                        if (!TextUtils.isEmpty(tL_securePlainEmail.email)) {
                            i10 = 0;
                            this.Y[0].setText(tL_securePlainEmail.email);
                            EditTextBoldCursor editTextBoldCursor3 = this.Y[i10];
                            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                            this.Y[i10].setPadding(i10, i10, i10, org.telegram.messenger.g0.L(6.0f));
                            this.Y[i10].setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
                            frameLayout7.addView(this.Y[i10], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            this.Y[i10].setOnEditorActionListener(new oi0(this, 3));
                            org.telegram.ui.Cells.z8 z8Var7 = new org.telegram.ui.Cells.z8(context2);
                            this.n0 = z8Var7;
                            org.telegram.ui.ActionBar.r6.a0(z8Var7, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                            this.n0.setText(org.telegram.messenger.hd.M0(2131747571, null));
                            this.c0.addView(this.n0, c8.ha.o(-1, -2));
                        }
                    }
                }
                i10 = 0;
                EditTextBoldCursor editTextBoldCursor32 = this.Y[i10];
                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                this.Y[i10].setPadding(i10, i10, i10, org.telegram.messenger.g0.L(6.0f));
                this.Y[i10].setGravity(!org.telegram.messenger.hd.a0 ? 5 : 3);
                frameLayout7.addView(this.Y[i10], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.Y[i10].setOnEditorActionListener(new oi0(this, 3));
                org.telegram.ui.Cells.z8 z8Var72 = new org.telegram.ui.Cells.z8(context2);
                this.n0 = z8Var72;
                org.telegram.ui.ActionBar.r6.a0(z8Var72, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                this.n0.setText(org.telegram.messenger.hd.M0(2131747571, null));
                this.c0.addView(this.n0, c8.ha.o(-1, -2));
            } else {
                HashMap hashMap = this.s1;
                if (i13 == 6) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747574, null));
                    this.Y = new EditTextBoldCursor[1];
                    FrameLayout frameLayout8 = new FrameLayout(context2);
                    this.c0.addView(frameLayout8, c8.ha.o(-1, 50));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout8, null);
                    int i30 = 0;
                    this.Y[0] = new EditTextBoldCursor(context2);
                    this.Y[0].setTag(0);
                    this.Y[0].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.E(this.Y[0], org.telegram.ui.ActionBar.k6.H6, null);
                    EditTextBoldCursor editTextBoldCursor4 = this.Y[0];
                    int i31 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor4, i31, null);
                    this.Y[0].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.r6.w(this.Y[0], i31, null);
                    this.Y[0].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.Y[0].setCursorWidth(1.5f);
                    this.Y[0].setInputType(3);
                    this.Y[0].setImeOptions(268435462);
                    this.Y[0].setHint(org.telegram.messenger.hd.M0(2131747573, null));
                    EditTextBoldCursor editTextBoldCursor5 = this.Y[0];
                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                    this.Y[0].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                    this.Y[0].setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                    frameLayout8.addView(this.Y[0], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    this.Y[0].setOnEditorActionListener(new oi0(this, i28));
                    this.Y[0].addTextChangedListener(new lj0(this, i30));
                    org.telegram.ui.Cells.z8 z8Var8 = new org.telegram.ui.Cells.z8(context2);
                    this.n0 = z8Var8;
                    org.telegram.ui.ActionBar.r6.a0(z8Var8, context2, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                    this.n0.setText(org.telegram.messenger.hd.a0("PassportEmailVerifyInfo", null, 2131747570, hashMap.get("email")));
                    this.c0.addView(this.n0, c8.ha.o(-1, -2));
                } else if (i13 == 7) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747487, null));
                    FrameLayout frameLayout9 = new FrameLayout(context2);
                    this.b0.addView(frameLayout9, c8.ha.x(-1, -2, 51));
                    for (int i32 = 0; i32 < 3; i32++) {
                        xj0 xj0Var = new xj0(this, context2, i32 + 2);
                        org.telegram.ui.Components.wt0[] wt0VarArr = this.J1;
                        wt0VarArr[i32] = xj0Var;
                        xj0Var.setVisibility(8);
                        frameLayout9.addView(wt0VarArr[i32], c8.ha.d(-1, -1.0f, 51, org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f, 30.0f, org.telegram.messenger.g0.Q1() ? 26.0f : 18.0f, 0.0f));
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", (String) hashMap.get("phone"));
                    p1(bundle, this.K, false);
                } else if (i13 == 8) {
                    j1(context);
                }
            }
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        zj0 zj0Var;
        org.telegram.ui.ActionBar.r0 r0Var;
        if (i7 != org.telegram.messenger.qs.U1) {
            if (i7 != org.telegram.messenger.qs.V1 && i7 == org.telegram.messenger.qs.p0) {
                if (objArr.length > 0) {
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
                        Utilities.b.nextBytes(bArr);
                        EditTextBoldCursor editTextBoldCursor2 = this.Y[0];
                        if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                            this.N0 = 2;
                        }
                    }
                } else {
                    this.J = null;
                    A1();
                }
                W1();
                return;
            }
            return;
        }
        String str = (String) objArr[0];
        HashMap hashMap = this.o1;
        org.telegram.messenger.ew ewVar = (org.telegram.messenger.ew) hashMap.get(str);
        if (ewVar != null) {
            ewVar.d = (TLRPC.TL_inputFile) objArr[1];
            hashMap.remove(str);
            if (hashMap.isEmpty() && (r0Var = this.L) != null) {
                r0Var.setEnabled(true);
                this.L.setAlpha(1.0f);
            }
            HashMap hashMap2 = this.n1;
            if (hashMap2 != null && (zj0Var = (zj0) hashMap2.get(ewVar)) != null) {
                zj0Var.a(true);
            }
            HashMap hashMap3 = this.y1;
            if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                hashMap3.remove("error_document_all");
                e1(false);
            }
            int i11 = ewVar.i;
            if (i11 == 0) {
                if (this.n0 != null && !TextUtils.isEmpty(this.z1)) {
                    this.n0.setText(this.z1);
                }
                hashMap3.remove("files_all");
                return;
            }
            if (i11 == 4) {
                if (this.o0 != null && !TextUtils.isEmpty(this.A1)) {
                    this.o0.setText(this.A1);
                }
                hashMap3.remove("translation_all");
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.di diVar = this.R0;
        if (diVar == null || this.visibleDialog != diVar) {
            super.dismissCurrentDialog();
            return;
        }
        diVar.a2.d0(false);
        this.R0.K();
        this.R0.a2.g0(true);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.R0 && super.dismissDialogOnPause(dialog);
    }

    public final void e1(boolean z9) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.p0 == null) {
            return;
        }
        HashMap hashMap = this.w1;
        HashMap hashMap2 = this.y1;
        if (hashMap == null || (!(z9 || hashMap2.containsKey("error_all")) || (str2 = (String) this.w1.get("error_all")) == null)) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str2);
            if (z9) {
                hashMap2.put("error_all", "");
            }
        }
        if (this.x1 != null && ((z9 || hashMap2.containsKey("error_document_all")) && (str = (String) this.x1.get("error_all")) != null)) {
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
            }
            if (z9) {
                hashMap2.put("error_document_all", "");
            }
        }
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.p7, null), 0, spannableStringBuilder.length(), 33);
            this.p0.setText(spannableStringBuilder);
            this.p0.setVisibility(0);
        } else if (this.p0.getVisibility() != 8) {
            this.p0.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f1(Context context) {
        long j3;
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.p0 = z8Var;
        int i7 = org.telegram.ui.ActionBar.k6.b7;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, R.drawable.greydivider_top, i7);
        int i10 = 0;
        this.p0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.c0.addView(this.p0, c8.ha.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754673, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754682, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754671, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754675, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131754672, null));
            }
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            this.j0 = n4Var;
            n4Var.setText(org.telegram.messenger.hd.M0(2131747575, null));
            org.telegram.ui.Cells.n4 n4Var2 = this.j0;
            int i11 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i11, n4Var2, null);
            j3 = 0;
            this.c0.addView(this.j0, c8.ha.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.d0 = linearLayout;
            linearLayout.setOrientation(1);
            this.c0.addView(this.d0, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.R = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            int i12 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
            this.c0.addView(this.R, c8.ha.o(-1, -2));
            this.R.setOnClickListener(new qi0(this, 7));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.n0 = z8Var2;
            org.telegram.ui.ActionBar.r6.a0(z8Var2, context, R.drawable.greydivider, i7);
            if (this.c != 0) {
                this.z1 = org.telegram.messenger.hd.M0(2131747626, null);
            } else {
                TLRPC.SecureValueType secureValueType2 = this.F.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    this.z1 = org.telegram.messenger.hd.M0(2131747624, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    this.z1 = org.telegram.messenger.hd.M0(2131747620, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    this.z1 = org.telegram.messenger.hd.M0(2131747610, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    this.z1 = org.telegram.messenger.hd.M0(2131747608, null);
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    this.z1 = org.telegram.messenger.hd.M0(2131747622, null);
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
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.p7, null), 0, str4.length(), 33);
                    hashMap2.put("files_all", "");
                    str3 = spannableStringBuilder;
                }
            }
            this.n0.setText(str3);
            this.c0.addView(this.n0, c8.ha.o(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
                this.j0 = n4Var3;
                n4Var3.setText(org.telegram.messenger.hd.M0(2131747454, null));
                org.telegram.ui.ActionBar.r6.i(i11, this.j0, null);
                this.c0.addView(this.j0, c8.ha.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.h0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.c0.addView(this.h0, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
                this.X = w9Var2;
                org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i11);
                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i12);
                w9Var2.setBackground(N02);
                org.telegram.ui.ActionBar.r6.k(w9Var2, N02, N3, N4, null);
                this.c0.addView(this.X, c8.ha.o(-1, -2));
                this.X.setOnClickListener(new qi0(this, 8));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                this.o0 = z8Var3;
                org.telegram.ui.ActionBar.r6.a0(z8Var3, context, R.drawable.greydivider, i7);
                if (this.c != 0) {
                    this.A1 = org.telegram.messenger.hd.M0(2131747602, null);
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.F.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747607, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747605, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747604, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747603, null);
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747606, null);
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
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.p7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.o0.setText(str6);
                this.c0.addView(this.o0, c8.ha.o(-1, -2));
            }
        } else {
            j3 = 0;
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747601, null));
        }
        org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
        this.j0 = n4Var4;
        n4Var4.setText(org.telegram.messenger.hd.M0(2131747600, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.j0, null);
        this.c0.addView(this.j0, c8.ha.o(-1, -2));
        this.Y = new EditTextBoldCursor[6];
        int i13 = 0;
        while (true) {
            int i14 = 4;
            if (i13 >= 6) {
                break;
            }
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Y[i13] = editTextBoldCursor;
            yi0 yi0Var = new yi0(context, editTextBoldCursor, i10);
            yi0Var.setWillNotDraw(false);
            this.c0.addView(yi0Var, c8.ha.o(-1, -2));
            int i15 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i15, yi0Var, null);
            if (i13 == 5) {
                View view = new View(context);
                this.S = view;
                org.telegram.ui.ActionBar.r6.i(i15, view, null);
                this.c0.addView(this.S, c8.ha.o(-1, 6));
            }
            if (this.v0 && this.F != null) {
                yi0Var.setVisibility(8);
                View view2 = this.S;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Y[i13].setTag(Integer.valueOf(i13));
            this.Y[i13].setSupportRtlHint(true);
            this.Y[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.Y[i13], org.telegram.ui.ActionBar.k6.H6, null);
            org.telegram.ui.ActionBar.r6.A(this.Y[i13], org.telegram.ui.ActionBar.k6.L6, null);
            this.Y[i13].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i13];
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i16, null);
            this.Y[i13].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Y[i13], i16, null);
            this.Y[i13].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Y[i13].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.r6.G(this.Y[i13], org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
            if (i13 == 5) {
                this.Y[i13].setOnTouchListener(new ri0(this, 2));
                this.Y[i13].setInputType(0);
                this.Y[i13].setFocusable(false);
            } else {
                this.Y[i13].setInputType(16385);
                this.Y[i13].setImeOptions(268435461);
            }
            if (i13 == 0) {
                this.Y[i13].setHintText(org.telegram.messenger.hd.M0(2131747459, null));
                str = "street_line1";
            } else if (i13 == 1) {
                this.Y[i13].setHintText(org.telegram.messenger.hd.M0(2131747458, null));
                str = "street_line2";
            } else if (i13 == 2) {
                this.Y[i13].setHintText(org.telegram.messenger.hd.M0(2131747479, null));
                str = "post_code";
            } else if (i13 == 3) {
                this.Y[i13].setHintText(org.telegram.messenger.hd.M0(2131747594, null));
                str = "city";
            } else if (i13 == 4) {
                this.Y[i13].setHintText(org.telegram.messenger.hd.M0(2131747460, null));
                str = "state";
            } else if (i13 != 5) {
                i13++;
            } else {
                this.Y[i13].setHintText(org.telegram.messenger.hd.M0(2131747593, null));
                str = "country_code";
            }
            N1(this.s1, this.Y[i13], str);
            if (i13 == 2) {
                this.Y[i13].addTextChangedListener(new zi0(this, editTextBoldCursor, str));
                this.Y[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                this.Y[i13].addTextChangedListener(new aj0(this, editTextBoldCursor, str, i10));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Y[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Y[i13].setPadding(0, 0, 0, 0);
            this.Y[i13].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            yi0Var.addView(this.Y[i13], c8.ha.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Y[i13].setOnEditorActionListener(new oi0(this, i14));
            i13++;
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.l0 = y6Var;
        this.c0.addView(y6Var, c8.ha.o(-1, -2));
        if (this.v0 && this.F != null) {
            this.j0.setVisibility(8);
            this.l0.setVisibility(8);
        }
        long j10 = this.c;
        TLRPC.TL_secureValue tL_secureValue = this.I;
        if (((j10 == j3 && this.F != null) || this.H == null || this.v0) && tL_secureValue == null) {
            org.telegram.ui.Cells.y6 y6Var2 = this.l0;
            int i17 = org.telegram.ui.ActionBar.k6.b7;
            org.telegram.ui.ActionBar.r6.a0(y6Var2, context, R.drawable.greydivider_bottom, i17);
            if (this.v0 && this.F != null) {
                org.telegram.ui.ActionBar.r6.a0(this.n0, context, R.drawable.greydivider_bottom, i17);
            }
        } else {
            if (tL_secureValue != null) {
                X0(tL_secureValue.files);
                Z0(tL_secureValue.translation);
            }
            org.telegram.ui.Cells.y6 y6Var3 = this.l0;
            int i18 = org.telegram.ui.ActionBar.k6.b7;
            org.telegram.ui.ActionBar.r6.a0(y6Var3, context, R.drawable.greydivider, i18);
            org.telegram.ui.Cells.w9 w9Var3 = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.r6.V(w9Var3.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
            org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
            w9Var3.setBackground(N03);
            org.telegram.ui.ActionBar.r6.k(w9Var3, N03, N5, N6, null);
            if (this.F == null) {
                w9Var3.b(org.telegram.messenger.hd.M0(2131747586, null), false);
            } else {
                w9Var3.b(org.telegram.messenger.hd.M0(2131747591, null), false);
            }
            this.c0.addView(w9Var3, c8.ha.o(-1, -2));
            w9Var3.setOnClickListener(new qi0(this, 9));
            org.telegram.ui.Cells.y6 y6Var4 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            this.l0 = y6Var4;
            org.telegram.ui.ActionBar.r6.a0(y6Var4, context, R.drawable.greydivider_bottom, i18);
            this.c0.addView(this.l0, c8.ha.o(-1, -2));
        }
        X1(0);
        X1(4);
    }

    public final void g1() {
        if (getParentActivity() != null && this.R0 == null) {
            org.telegram.ui.Components.di diVar = new org.telegram.ui.Components.di(getParentActivity(), this, false, false);
            this.R0 = diVar;
            diVar.T3 = new bj0(this);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, TLObject.FLAG_27, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.k0;
            if (i10 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) arrayList2.get(i10), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d7));
            i10++;
        }
        Iterator it = this.n1.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new org.telegram.ui.ActionBar.t6((zj0) ((Map.Entry) it.next()).getValue(), TLObject.FLAG_28, new Class[]{zj0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        }
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c0, TLObject.FLAG_28, new Class[]{org.telegram.ui.Cells.y8.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c0, TLObject.FLAG_28, new Class[]{org.telegram.ui.Cells.w9.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c0, TLObject.FLAG_28, new Class[]{ak0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        if (this.Y != null) {
            int i12 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
                if (i12 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr[i12].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i12], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i12], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i12], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y[i12], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
                i12++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        }
        if (this.a0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.a0;
                if (i7 >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6((View) editTextBoldCursorArr2[i7].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.a0[i7], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.a0[i7], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.a0[i7], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.a0[i7], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
                i7++;
            }
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.fi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Q, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gi));
        return arrayList;
    }

    public final void h1() {
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new pu(26, this, zArr));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        boolean z9 = this.v0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.E;
        if (z9 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            u1Var.T = org.telegram.messenger.hd.M0(2131747592, null);
        } else if (z9 && this.F == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            u1Var.T = org.telegram.messenger.hd.M0(2131747585, null);
        } else {
            u1Var.T = org.telegram.messenger.hd.M0(2131747589, null);
        }
        if (!this.v0 && this.F != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(getParentActivity(), 1);
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(false);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
            c2Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(c2Var, N0, null, N, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                c2Var.e(org.telegram.messenger.hd.M0(2131747590, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                c2Var.e(org.telegram.messenger.hd.M0(2131747588, null), "", true, false, false);
            }
            c2Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
            frameLayout.addView(c2Var, c8.ha.e(-1, 48, 51));
            c2Var.setOnClickListener(new j8(4, zArr));
            alertDialog$Builder.o(frameLayout);
        }
        showDialog(u1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i1(Context context) {
        String str;
        int i7;
        String str2;
        String str3;
        this.Y0 = new HashMap();
        int i10 = 2;
        int i11 = 1;
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.p0 = z8Var;
        int i12 = org.telegram.ui.ActionBar.k6.b7;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, R.drawable.greydivider_top, i12);
        int i13 = 0;
        this.p0.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        int i14 = -1;
        this.c0.addView(this.p0, c8.ha.o(-1, -2));
        e1(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.E;
        int i15 = 3;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        if (tL_secureRequiredType != null) {
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            this.j0 = n4Var;
            if (this.v0) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747575, null));
            } else {
                n4Var.setText(org.telegram.messenger.hd.M0(2131747474, null));
            }
            org.telegram.ui.Cells.n4 n4Var2 = this.j0;
            int i16 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i16, n4Var2, null);
            this.c0.addView(this.j0, c8.ha.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.c0.addView(this.e0, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            this.U = y8Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
            int i17 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i17);
            y8Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(y8Var, N0, N, N2, null);
            this.c0.addView(this.U, c8.ha.o(-1, -2));
            this.U.setOnClickListener(new qi0(this, i13));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.f0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.c0.addView(this.f0, c8.ha.o(-1, -2));
            boolean z9 = this.F.selfie_required;
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            this.V = y8Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
            org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i17);
            y8Var2.setBackground(N02);
            org.telegram.ui.ActionBar.r6.k(y8Var2, N02, N3, N4, null);
            this.V.a(org.telegram.messenger.hd.M0(2131747471, null), org.telegram.messenger.hd.M0(2131747470, null), z9);
            this.c0.addView(this.V, c8.ha.o(-1, -2));
            this.V.setOnClickListener(new qi0(this, i10));
            if (this.F.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.g0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.c0.addView(this.g0, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.y8 y8Var3 = new org.telegram.ui.Cells.y8(context);
                this.W = y8Var3;
                org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i16);
                org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i17);
                y8Var3.setBackground(N03);
                org.telegram.ui.ActionBar.r6.k(y8Var3, N03, N5, N6, null);
                this.W.a(org.telegram.messenger.hd.M0(2131747462, null), org.telegram.messenger.hd.M0(2131747461, null), tL_secureRequiredType2.translation_required);
                this.c0.addView(this.W, c8.ha.o(-1, -2));
                this.W.setOnClickListener(new qi0(this, i15));
            }
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.n0 = z8Var2;
            org.telegram.ui.ActionBar.r6.a0(z8Var2, context, R.drawable.greydivider, i12);
            this.n0.setText(org.telegram.messenger.hd.M0(2131747488, null));
            this.c0.addView(this.n0, c8.ha.o(-1, -2));
            if (this.F.translation_required) {
                org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context);
                this.j0 = n4Var3;
                n4Var3.setText(org.telegram.messenger.hd.M0(2131747454, null));
                org.telegram.ui.ActionBar.r6.i(i16, this.j0, null);
                this.c0.addView(this.j0, c8.ha.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.h0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.c0.addView(this.h0, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
                this.X = w9Var;
                org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.k6.N0(true);
                org.telegram.ui.ActionBar.n6 N7 = org.telegram.ui.ActionBar.r6.N(i16);
                org.telegram.ui.ActionBar.n6 N8 = org.telegram.ui.ActionBar.r6.N(i17);
                w9Var.setBackground(N04);
                org.telegram.ui.ActionBar.r6.k(w9Var, N04, N7, N8, null);
                this.c0.addView(this.X, c8.ha.o(-1, -2));
                this.X.setOnClickListener(new qi0(this, 4));
                org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
                this.o0 = z8Var3;
                org.telegram.ui.ActionBar.r6.a0(z8Var3, context, R.drawable.greydivider, i12);
                if (this.c != 0) {
                    this.A1 = org.telegram.messenger.hd.M0(2131747602, null);
                } else {
                    TLRPC.SecureValueType secureValueType = this.F.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747612, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747615, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747617, null);
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        this.A1 = org.telegram.messenger.hd.M0(2131747618, null);
                    } else {
                        this.A1 = "";
                    }
                }
                String str4 = this.A1;
                HashMap hashMap = this.x1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.A1);
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.p7, null), 0, str6.length(), 33);
                        this.y1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.o0.setText(str5);
                this.c0.addView(this.o0, c8.ha.o(-1, -2));
            }
        } else {
            org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
            this.r0 = w9Var2;
            org.telegram.ui.Cells.y N05 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N9 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
            org.telegram.ui.ActionBar.n6 N10 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
            w9Var2.setBackground(N05);
            org.telegram.ui.ActionBar.r6.k(w9Var2, N05, N9, N10, null);
            this.r0.b(org.telegram.messenger.hd.M0(2131747469, null), false);
            this.c0.addView(this.r0, c8.ha.o(-1, -2));
            this.r0.setOnClickListener(new qi0(this, 5));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.n0 = z8Var4;
            org.telegram.ui.ActionBar.r6.a0(z8Var4, context, R.drawable.greydivider, i12);
            this.n0.setText(org.telegram.messenger.hd.M0(2131747468, null));
            this.c0.addView(this.n0, c8.ha.o(-1, -2));
        }
        org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
        this.j0 = n4Var4;
        if (this.v0) {
            n4Var4.setText(org.telegram.messenger.hd.M0(2131747577, null));
        } else {
            n4Var4.setText(org.telegram.messenger.hd.M0(2131747491, null));
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this.j0, null);
        this.c0.addView(this.j0, c8.ha.o(-1, -2));
        int i18 = 7;
        int i19 = this.F != null ? 9 : 7;
        this.Y = new EditTextBoldCursor[i19];
        int i20 = 0;
        while (true) {
            int i21 = 6;
            HashMap hashMap2 = this.s1;
            if (i20 >= i19) {
                org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                this.m0 = y6Var;
                this.c0.addView(y6Var, c8.ha.o(-1, -2));
                org.telegram.ui.Cells.n4 n4Var5 = new org.telegram.ui.Cells.n4(context);
                this.j0 = n4Var5;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var5, null);
                this.c0.addView(this.j0, c8.ha.o(-1, -2));
                int i22 = 3;
                this.a0 = new EditTextBoldCursor[3];
                int i23 = 0;
                while (i23 < i22) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                    this.a0[i23] = editTextBoldCursor;
                    yi0 yi0Var = new yi0(context, editTextBoldCursor, 2);
                    yi0Var.setWillNotDraw(false);
                    this.c0.addView(yi0Var, c8.ha.o(-1, 64));
                    int i24 = org.telegram.ui.ActionBar.k6.d6;
                    org.telegram.ui.ActionBar.r6.i(i24, yi0Var, null);
                    if (i23 == 2) {
                        View view = new View(context);
                        this.T = view;
                        org.telegram.ui.ActionBar.r6.i(i24, view, null);
                        this.c0.addView(this.T, c8.ha.o(-1, i21));
                    }
                    this.a0[i23].setTag(Integer.valueOf(i23));
                    this.a0[i23].setSupportRtlHint(true);
                    this.a0[i23].setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.B(this.a0[i23], org.telegram.ui.ActionBar.k6.H6, null);
                    EditTextBoldCursor editTextBoldCursor2 = this.a0[i23];
                    int i25 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i25, null);
                    org.telegram.ui.ActionBar.r6.A(this.a0[i23], org.telegram.ui.ActionBar.k6.L6, null);
                    this.a0[i23].setTransformHintToHeader(true);
                    this.a0[i23].setBackgroundDrawable(null);
                    org.telegram.ui.ActionBar.r6.w(this.a0[i23], i25, null);
                    this.a0[i23].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.a0[i23].setCursorWidth(1.5f);
                    org.telegram.ui.ActionBar.r6.G(this.a0[i23], org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
                    this.a0[i23].setInputType(16385);
                    this.a0[i23].setImeOptions(268435461);
                    if (i23 == 0) {
                        str = "first_name_native";
                    } else if (i23 == 1) {
                        str = "middle_name_native";
                    } else if (i23 != 2) {
                        i23++;
                        i22 = 3;
                        i21 = 6;
                    } else {
                        str = "last_name_native";
                    }
                    N1(hashMap2, this.a0[i23], str);
                    EditTextBoldCursor editTextBoldCursor3 = this.a0[i23];
                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                    int i26 = 2;
                    if (i23 == 0 || i23 == 2 || i23 == 1) {
                        this.a0[i23].addTextChangedListener(new aj0(this, editTextBoldCursor, str, i26));
                    }
                    this.a0[i23].setPadding(0, 0, 0, 0);
                    this.a0[i23].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var.addView(this.a0[i23], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.a0[i23].setOnEditorActionListener(new oi0(this, 2));
                    i23++;
                    i22 = 3;
                    i21 = 6;
                }
                org.telegram.ui.Cells.z8 z8Var5 = new org.telegram.ui.Cells.z8(context);
                this.q0 = z8Var5;
                this.c0.addView(z8Var5, c8.ha.o(-1, -2));
                long j3 = this.c;
                TLRPC.TL_secureValue tL_secureValue = this.I;
                if (((j3 == 0 && this.F != null) || this.H == null || this.v0) && tL_secureValue == null) {
                    org.telegram.ui.ActionBar.r6.a0(this.q0, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
                } else {
                    if (tL_secureValue != null) {
                        X0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            W0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        Z0(tL_secureValue.translation);
                    }
                    org.telegram.ui.Cells.w9 w9Var3 = new org.telegram.ui.Cells.w9(context);
                    org.telegram.ui.ActionBar.r6.V(w9Var3.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                    org.telegram.ui.Cells.y N06 = org.telegram.ui.ActionBar.k6.N0(true);
                    org.telegram.ui.ActionBar.n6 N11 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6);
                    org.telegram.ui.ActionBar.n6 N12 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
                    w9Var3.setBackground(N06);
                    org.telegram.ui.ActionBar.r6.k(w9Var3, N06, N11, N12, null);
                    if (this.F == null) {
                        w9Var3.b(org.telegram.messenger.hd.M0(2131747586, null), false);
                    } else {
                        w9Var3.b(org.telegram.messenger.hd.M0(2131747591, null), false);
                    }
                    this.c0.addView(w9Var3, c8.ha.o(-1, -2));
                    w9Var3.setOnClickListener(new qi0(this, i11));
                    org.telegram.ui.Cells.z8 z8Var6 = this.q0;
                    int i27 = org.telegram.ui.ActionBar.k6.b7;
                    org.telegram.ui.ActionBar.r6.a0(z8Var6, context, R.drawable.greydivider, i27);
                    org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                    this.l0 = y6Var2;
                    org.telegram.ui.ActionBar.r6.a0(y6Var2, context, R.drawable.greydivider_bottom, i27);
                    this.c0.addView(this.l0, c8.ha.o(-1, -2));
                }
                U1();
                c1(false);
                return;
            }
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            this.Y[i20] = editTextBoldCursor4;
            yi0 yi0Var2 = new yi0(context, editTextBoldCursor4, i11);
            yi0Var2.setWillNotDraw(false);
            this.c0.addView(yi0Var2, c8.ha.o(i14, 64));
            int i28 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i28, yi0Var2, f6Var);
            if (i20 == i19 - 1) {
                View view2 = new View(context);
                this.S = view2;
                org.telegram.ui.ActionBar.r6.i(i28, view2, f6Var);
                this.c0.addView(this.S, c8.ha.o(i14, 6));
            }
            if (this.v0 && this.F != null && i20 < i18) {
                yi0Var2.setVisibility(8);
                View view3 = this.S;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            this.Y[i20].setTag(Integer.valueOf(i20));
            this.Y[i20].setSupportRtlHint(true);
            this.Y[i20].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.Y[i20], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor5 = this.Y[i20];
            int i29 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor5, i29, null);
            org.telegram.ui.ActionBar.r6.A(this.Y[i20], org.telegram.ui.ActionBar.k6.L6, null);
            this.Y[i20].setTransformHintToHeader(true);
            this.Y[i20].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Y[i20], i29, null);
            this.Y[i20].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Y[i20].setCursorWidth(1.5f);
            org.telegram.ui.ActionBar.r6.G(this.Y[i20], org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
            if (i20 == 5 || i20 == 6) {
                i7 = 7;
                this.Y[i20].setOnTouchListener(new ri0(this, 0));
                this.Y[i20].setInputType(0);
            } else if (i20 == 3 || i20 == 8) {
                i7 = 7;
                this.Y[i20].setOnTouchListener(new fi.n1(i7, this, context));
                this.Y[i20].setInputType(0);
                this.Y[i20].setFocusable(false);
            } else {
                if (i20 == 4) {
                    this.Y[i20].setOnTouchListener(new ri0(this, i11));
                    this.Y[i20].setInputType(0);
                    this.Y[i20].setFocusable(false);
                } else {
                    this.Y[i20].setInputType(16385);
                    this.Y[i20].setImeOptions(268435461);
                }
                i7 = 7;
            }
            HashMap hashMap3 = this.t1;
            switch (i20) {
                case 0:
                    if (tL_secureRequiredType2.native_names) {
                        this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747500, null));
                    } else {
                        this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747503, null));
                    }
                    str2 = "first_name";
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor6 = this.Y[i20];
                    editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                    if (i20 != 0 || i20 == 2 || i20 == 1) {
                        this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    } else {
                        this.Y[i20].addTextChangedListener(new org.telegram.ui.Components.lv0(this, editTextBoldCursor4, str2, hashMap2));
                    }
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
                case 1:
                    if (tL_secureRequiredType2.native_names) {
                        this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747504, null));
                    } else {
                        this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747506, null));
                    }
                    str2 = "middle_name";
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor62 = this.Y[i20];
                    editTextBoldCursor62.setSelection(editTextBoldCursor62.length());
                    if (i20 != 0) {
                        break;
                    }
                    this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
                case 2:
                    if (tL_secureRequiredType2.native_names) {
                        this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747455, null));
                    } else {
                        this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747457, null));
                    }
                    str2 = "last_name";
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor622 = this.Y[i20];
                    editTextBoldCursor622.setSelection(editTextBoldCursor622.length());
                    if (i20 != 0) {
                    }
                    this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
                case 3:
                    this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747596, null));
                    str2 = "birth_date";
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor6222 = this.Y[i20];
                    editTextBoldCursor6222.setSelection(editTextBoldCursor6222.length());
                    if (i20 != 0) {
                    }
                    this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
                case 4:
                    this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747565, null));
                    str2 = "gender";
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor62222 = this.Y[i20];
                    editTextBoldCursor62222.setSelection(editTextBoldCursor62222.length());
                    if (i20 != 0) {
                    }
                    this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
                case 5:
                    this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747595, null));
                    str2 = "country_code";
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor622222 = this.Y[i20];
                    editTextBoldCursor622222.setSelection(editTextBoldCursor622222.length());
                    if (i20 != 0) {
                    }
                    this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
                case 6:
                    this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747473, null));
                    str2 = "residence_country_code";
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor6222222 = this.Y[i20];
                    editTextBoldCursor6222222.setSelection(editTextBoldCursor6222222.length());
                    if (i20 != 0) {
                    }
                    this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
                case 7:
                    this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747576, null));
                    str3 = "document_no";
                    String str7 = str3;
                    hashMap2 = hashMap3;
                    str2 = str7;
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor62222222 = this.Y[i20];
                    editTextBoldCursor62222222.setSelection(editTextBoldCursor62222222.length());
                    if (i20 != 0) {
                    }
                    this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
                case 8:
                    this.Y[i20].setHintText(org.telegram.messenger.hd.M0(2131747569, null));
                    str3 = "expiry_date";
                    String str72 = str3;
                    hashMap2 = hashMap3;
                    str2 = str72;
                    N1(hashMap2, this.Y[i20], str2);
                    EditTextBoldCursor editTextBoldCursor622222222 = this.Y[i20];
                    editTextBoldCursor622222222.setSelection(editTextBoldCursor622222222.length());
                    if (i20 != 0) {
                    }
                    this.Y[i20].addTextChangedListener(new aj0(this, editTextBoldCursor4, str2, i11));
                    this.Y[i20].setPadding(0, 0, 0, 0);
                    this.Y[i20].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
                    yi0Var2.addView(this.Y[i20], c8.ha.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.Y[i20].setOnEditorActionListener(new oi0(this, i11));
                    break;
            }
            i20++;
            i18 = i7;
            i14 = -1;
            f6Var = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(Context context) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        ArrayList arrayList;
        boolean z9;
        bk0 bk0Var = this;
        Context context2 = context;
        bk0Var.actionBar.setTitle(org.telegram.messenger.hd.M0(2131744238, null));
        bk0Var.actionBar.q().a(1, R.drawable.msg_info);
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2);
        bk0Var.j0 = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131747478, null));
        org.telegram.ui.Cells.n4 n4Var2 = bk0Var.j0;
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i7, n4Var2, null);
        bk0Var.c0.addView(bk0Var.j0, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
        bk0Var.l0 = y6Var;
        int i10 = org.telegram.ui.ActionBar.k6.b7;
        org.telegram.ui.ActionBar.r6.a0(y6Var, context2, R.drawable.greydivider, i10);
        bk0Var.c0.addView(bk0Var.l0, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context2);
        bk0Var.x0 = w9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        w9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
        bk0Var.x0.b(org.telegram.messenger.hd.M0(2131747495, null), true);
        bk0Var.c0.addView(bk0Var.x0, c8.ha.o(-1, -2));
        bk0Var.x0.setOnClickListener(new qi0(bk0Var, 12));
        org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context2);
        bk0Var.y0 = w9Var2;
        org.telegram.ui.ActionBar.r6.V(w9Var2.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
        org.telegram.ui.ActionBar.r6.R(bk0Var.y0, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i7), org.telegram.ui.ActionBar.r6.N(i11), null);
        bk0Var.y0.b(org.telegram.messenger.hd.M0(2131744235, null), false);
        bk0Var.c0.addView(bk0Var.y0, c8.ha.o(-1, -2));
        bk0Var.y0.setOnClickListener(new qi0(bk0Var, 13));
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
        bk0Var.z0 = y6Var2;
        org.telegram.ui.ActionBar.r6.a0(y6Var2, context2, R.drawable.greydivider_bottom, i10);
        bk0Var.c0.addView(bk0Var.z0, c8.ha.o(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context2);
        bk0Var.A0 = linearLayout;
        linearLayout.setOrientation(1);
        bk0Var.A0.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(bk0Var.A0, context2, R.drawable.greydivider_bottom, i10);
        if (org.telegram.messenger.g0.Q1()) {
            bk0Var.c0.addView(bk0Var.A0, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.L(528.0f) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        } else {
            bk0Var.c0.addView(bk0Var.A0, new LinearLayout.LayoutParams(-1, org.telegram.messenger.g0.q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        ImageView imageView = new ImageView(context2);
        bk0Var.B0 = imageView;
        imageView.setImageResource(R.drawable.no_passport);
        org.telegram.ui.ActionBar.r6.t(bk0Var.B0, org.telegram.ui.ActionBar.k6.qj, null, PorterDuff.Mode.MULTIPLY);
        bk0Var.A0.addView(bk0Var.B0, c8.ha.o(-2, -2));
        TextView textView = new TextView(context2);
        bk0Var.C0 = textView;
        int i12 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        bk0Var.C0.setGravity(17);
        bk0Var.C0.setTextSize(1, 15.0f);
        bk0Var.C0.setTypeface(org.telegram.messenger.g0.o());
        bk0Var.C0.setText(org.telegram.messenger.hd.M0(2131747496, null));
        TextView f10 = org.telegram.messenger.camera.q.f(bk0Var.A0, bk0Var.C0, c8.ha.t(-2, -2, 17, 0, 16, 0, 0), context2);
        bk0Var.D0 = f10;
        org.telegram.ui.ActionBar.r6.V(f10, i12, null);
        bk0Var.D0.setGravity(17);
        bk0Var.D0.setTextSize(1, 14.0f);
        bk0Var.D0.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        bk0Var.D0.setText(org.telegram.messenger.hd.M0(2131747494, null));
        TextView f11 = org.telegram.messenger.camera.q.f(bk0Var.A0, bk0Var.D0, c8.ha.t(-2, -2, 17, 0, 14, 0, 0), context2);
        bk0Var.E0 = f11;
        int i13 = org.telegram.ui.ActionBar.k6.q6;
        org.telegram.ui.ActionBar.r6.V(f11, i13, null);
        bk0Var.E0.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.r6.R(bk0Var.E0, org.telegram.ui.ActionBar.k6.h0(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 32), 7, -1), null, org.telegram.ui.ActionBar.r6.h(i13, 32), null);
        bk0Var.E0.setGravity(17);
        bk0Var.E0.setTextSize(1, 15.0f);
        bk0Var.E0.setTypeface(org.telegram.messenger.g0.o());
        bk0Var.E0.setGravity(17);
        bk0Var.E0.setText(org.telegram.messenger.hd.M0(2131747495, null).toUpperCase());
        bk0Var.A0.addView(bk0Var.E0, c8.ha.t(-2, 30, 17, 0, 12, 0, 0));
        bk0Var.E0.setOnClickListener(new qi0(bk0Var, 14));
        int size = bk0Var.D.values.size();
        int i14 = 0;
        while (i14 < size) {
            TLRPC.TL_secureValue tL_secureValue = bk0Var.D.values.get(i14);
            if (z1(tL_secureValue.type)) {
                arrayList = new ArrayList();
                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = tL_secureValue.type;
                tL_secureRequiredType2.selfie_required = true;
                tL_secureRequiredType2.translation_required = true;
                arrayList.add(tL_secureRequiredType2);
                tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType.type = new TLRPC.TL_secureValueTypePersonalDetails();
            } else if (x1(tL_secureValue.type)) {
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
                z9 = false;
                bk0Var.Y0(context2, tL_secureRequiredType, arrayList, z9, i14 != size + (-1));
                i14++;
                bk0Var = this;
                context2 = context;
            }
            z9 = true;
            bk0Var.Y0(context2, tL_secureRequiredType, arrayList, z9, i14 != size + (-1));
            i14++;
            bk0Var = this;
            context2 = context;
        }
        V1();
    }

    public final void k1(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747487, null));
        this.Y0 = new HashMap();
        int i7 = 3;
        int i10 = 1;
        int i11 = 0;
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
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.U0, new un0(14));
        String str3 = org.telegram.messenger.p10.i(this.currentAccount).f().phone;
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
        org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.q6, null);
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6);
        w9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
        w9Var.b(org.telegram.messenger.hd.a0("PassportPhoneUseSame", null, 2131747483, pf.b.c().b("+" + str3)), false);
        this.c0.addView(w9Var, c8.ha.o(-1, -2));
        w9Var.setOnClickListener(new qi0(this, 16));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.n0 = z8Var;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
        this.n0.setText(org.telegram.messenger.hd.M0(2131747481, null));
        this.c0.addView(this.n0, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
        this.j0 = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131747484, null));
        org.telegram.ui.ActionBar.r6.i(i12, this.j0, null);
        this.c0.addView(this.j0, c8.ha.o(-1, -2));
        this.Y = new EditTextBoldCursor[3];
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 2) {
                this.Y[i13] = new org.telegram.ui.Components.v20(context);
            } else {
                this.Y[i13] = new EditTextBoldCursor(context);
            }
            if (i13 == 1) {
                frameLayout = org.telegram.messenger.k5.f(context, 0);
                this.c0.addView(frameLayout, c8.ha.o(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, null);
            } else if (i13 == 2) {
                frameLayout = (ViewGroup) this.Y[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.c0.addView(frameLayout, c8.ha.o(-1, 50));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, frameLayout, null);
            }
            this.Y[i13].setTag(Integer.valueOf(i13));
            this.Y[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.E(this.Y[i13], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.Y[i13];
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i14, null);
            this.Y[i13].setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.w(this.Y[i13], i14, null);
            this.Y[i13].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.Y[i13].setCursorWidth(1.5f);
            if (i13 == 0) {
                this.Y[i13].setOnTouchListener(new ri0(this, i7));
                this.Y[i13].setText(org.telegram.messenger.hd.M0(2131752134, null));
                this.Y[i13].setInputType(0);
                this.Y[i13].setFocusable(false);
            } else {
                this.Y[i13].setInputType(3);
                if (i13 == 2) {
                    this.Y[i13].setImeOptions(268435462);
                } else {
                    this.Y[i13].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Y[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            if (i13 == 1) {
                TextView textView = new TextView(context);
                this.w0 = textView;
                textView.setText("+");
                org.telegram.ui.ActionBar.r6.V(this.w0, i14, null);
                this.w0.setTextSize(1, 16.0f);
                frameLayout.addView(this.w0, c8.ha.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Y[i13].setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
                this.Y[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Y[i13].setGravity(19);
                frameLayout.addView(this.Y[i13], c8.ha.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Y[i13].addTextChangedListener(new lj0(this, i10));
            } else if (i13 == 2) {
                this.Y[i13].setPadding(0, 0, 0, 0);
                this.Y[i13].setGravity(19);
                this.Y[i13].setHintText(null);
                this.Y[i13].setHint(org.telegram.messenger.hd.M0(2131747371, null));
                frameLayout.addView(this.Y[i13], c8.ha.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                this.Y[i13].addTextChangedListener(new xq(this, i7));
            } else {
                this.Y[i13].setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
                this.Y[i13].setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
                frameLayout.addView(this.Y[i13], c8.ha.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
            }
            this.Y[i13].setOnEditorActionListener(new oi0(this, i11));
            if (i13 == 2) {
                this.Y[i13].setOnKeyListener(new zf(this, i10));
            }
            if (i13 == 0) {
                View view = new View(context);
                this.k0.add(view);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, null);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) org.telegram.messenger.t0.b.getSystemService("phone");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Y0.get(str)) != null && this.U0.indexOf(str2) != -1) {
                this.Y[1].setText((CharSequence) this.V0.get(str2));
            }
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            this.n0 = z8Var2;
            org.telegram.ui.ActionBar.r6.a0(z8Var2, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
            this.n0.setText(org.telegram.messenger.hd.M0(2131747485, null));
            this.c0.addView(this.n0, c8.ha.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Y[1].setText((CharSequence) this.V0.get(str2));
        }
        org.telegram.ui.Cells.z8 z8Var22 = new org.telegram.ui.Cells.z8(context);
        this.n0 = z8Var22;
        org.telegram.ui.ActionBar.r6.a0(z8Var22, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
        this.n0.setText(org.telegram.messenger.hd.M0(2131747485, null));
        this.c0.addView(this.n0, c8.ha.o(-1, -2));
    }

    public final byte[] m1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.e1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.e1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.c1, 0, bArr5, 0, 32);
        Utilities.b(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!d1(bArr5, null)) {
            return null;
        }
        byte[] r10 = Utilities.r(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(r10, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(r10, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public final void n1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z9, final pi0 pi0Var, final si0 si0Var, final boolean z10) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (!z10 || tL_secureRequiredType2 == null) {
            if (z9) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        } else {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() { // from class: org.telegram.ui.vi0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
                final bk0 bk0Var = bk0.this;
                final qj0 qj0Var = si0Var;
                final boolean z11 = z10;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType3 = tL_secureRequiredType2;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                final boolean z12 = z9;
                final ArrayList arrayList2 = arrayList;
                final Runnable runnable = pi0Var;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.xi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        TLRPC.TL_secureData tL_secureData;
                        bk0 bk0Var2 = bk0.this;
                        TLRPC.TL_error tL_error2 = tL_error;
                        String str2 = null;
                        if (tL_error2 != null) {
                            qj0 qj0Var2 = qj0Var;
                            if (qj0Var2 != null) {
                                qj0Var2.a(tL_error2.text, null);
                            }
                            bk0Var2.Q1(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error2.text);
                            return;
                        }
                        boolean z13 = z11;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType3;
                        TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType4;
                        boolean z14 = z12;
                        if (!z13) {
                            if (z14) {
                                bk0Var2.L1(tL_secureRequiredType6);
                            }
                            bk0Var2.L1(tL_secureRequiredType5);
                        } else if (tL_secureRequiredType5 != null) {
                            bk0Var2.L1(tL_secureRequiredType5);
                        } else {
                            bk0Var2.L1(tL_secureRequiredType6);
                        }
                        if (bk0Var2.b == 8) {
                            ak0 ak0Var = (ak0) bk0Var2.q1.remove(tL_secureRequiredType6);
                            if (ak0Var != null) {
                                bk0Var2.c0.removeView(ak0Var);
                                View childAt = bk0Var2.c0.getChildAt(r1.getChildCount() - 6);
                                if (childAt instanceof ak0) {
                                    ((ak0) childAt).setNeedDivider(false);
                                }
                            }
                            bk0Var2.V1();
                        } else {
                            ArrayList arrayList3 = arrayList2;
                            if (tL_secureRequiredType5 == null || arrayList3 == null || arrayList3.size() <= 1) {
                                str = null;
                            } else {
                                int size = arrayList3.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size) {
                                        str = null;
                                        break;
                                    }
                                    TLRPC.TL_secureRequiredType tL_secureRequiredType7 = (TLRPC.TL_secureRequiredType) arrayList3.get(i7);
                                    TLRPC.TL_secureValue v12 = bk0Var2.v1(tL_secureRequiredType7, false);
                                    if (v12 != null) {
                                        TLRPC.TL_secureData tL_secureData2 = v12.data;
                                        str = tL_secureData2 != null ? bk0.l1(tL_secureData2.data, bk0Var2.m1(tL_secureData2.secret, tL_secureData2.data_hash), v12.data.data_hash) : null;
                                        tL_secureRequiredType5 = tL_secureRequiredType7;
                                    } else {
                                        i7++;
                                    }
                                }
                                if (tL_secureRequiredType5 == null) {
                                    tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) arrayList3.get(0);
                                }
                            }
                            if (z14) {
                                bk0Var2.P1(tL_secureRequiredType6, null, null, tL_secureRequiredType5, str, z13, arrayList3 != null ? arrayList3.size() : 0);
                            } else {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType8 = tL_secureRequiredType5;
                                String str3 = str;
                                TLRPC.TL_secureValue v13 = bk0Var2.v1(tL_secureRequiredType6, false);
                                if (v13 != null && (tL_secureData = v13.data) != null) {
                                    str2 = bk0.l1(tL_secureData.data, bk0Var2.m1(tL_secureData.secret, tL_secureData.data_hash), v13.data.data_hash);
                                }
                                bk0Var2.P1(tL_secureRequiredType6, null, str2, tL_secureRequiredType8, str3, z13, arrayList3 != null ? arrayList3.size() : 0);
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

    public final a8.r7 o1(byte[] bArr) {
        byte[] t12 = t1();
        int nextInt = Utilities.b.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.b.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] o4 = Utilities.o(length, bArr3);
        byte[] r10 = Utilities.r(t12, o4);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r10, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r10, 32, bArr5, 0, 16);
        Utilities.b(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.e1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.e1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.c1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r11 = Utilities.r(bArr8, o4);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r11, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r11, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(t12, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        a8.r7 r7Var = new a8.r7(17);
        r7Var.d = bArr3;
        r7Var.b = bArr11;
        r7Var.e = o4;
        r7Var.c = t12;
        r7Var.f = new org.telegram.messenger.fw(bArr4, bArr5);
        return r7Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 == 0 || i7 == 2) {
                g1();
                org.telegram.ui.Components.di diVar = this.R0;
                if (diVar != null) {
                    diVar.a2.j0(i7, intent, this.Q0);
                }
                this.Q0 = null;
                return;
            }
            if (i7 == 1) {
                if (intent == null || intent.getData() == null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    Toast.makeText(getParentActivity(), org.telegram.messenger.hd.M0(2131743834, null), 0).show();
                } else {
                    ArrayList arrayList = new ArrayList();
                    org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
                    fzVar.a = intent.getData();
                    arrayList.add(fzVar);
                    K1(arrayList);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        int i7 = this.b;
        if (i7 == 7) {
            if (z9) {
                int i10 = this.I1;
                org.telegram.ui.Components.wt0[] wt0VarArr = this.J1;
                wt0VarArr[i10].c(true);
                for (org.telegram.ui.Components.wt0 wt0Var : wt0VarArr) {
                    if (wt0Var != null) {
                        wt0Var.f();
                    }
                }
            }
        } else if (i7 == 0 || i7 == 5) {
            if (z9) {
                a1(false);
            }
        } else if (i7 == 1 || i7 == 2) {
            return !b1(z9);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onDialogDismiss(Dialog dialog) {
        if (this.b == 3 && dialog == this.L1) {
            ArrayList arrayList = this.M1;
            if (arrayList.isEmpty()) {
                return;
            }
            getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.U1);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.V1);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.p0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.r0);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.U1);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.V1);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.p0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.r0);
        int i7 = 0;
        a1(false);
        org.telegram.ui.Components.di diVar = this.R0;
        if (diVar != null) {
            diVar.K();
            this.R0.j1();
        }
        if (this.b == 7) {
            while (true) {
                org.telegram.ui.Components.wt0[] wt0VarArr = this.J1;
                if (i7 >= wt0VarArr.length) {
                    break;
                }
                org.telegram.ui.Components.wt0 wt0Var = wt0VarArr[i7];
                if (wt0Var != null) {
                    wt0Var.f();
                }
                i7++;
            }
            org.telegram.ui.ActionBar.u1 u1Var = this.K1;
            if (u1Var != null) {
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                this.K1 = null;
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.di diVar = this.R0;
        if (diVar != null) {
            diVar.l1();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.di diVar;
        org.telegram.ui.Cells.w9 w9Var;
        int i10 = this.b;
        if ((i10 != 1 && i10 != 2) || (diVar = this.R0) == null) {
            if (i10 == 3 && i7 == 6) {
                S1(false, this.E1, this.F1, this.G1, this.H1);
                return;
            }
            return;
        }
        int i11 = 0;
        if (i7 == 17) {
            diVar.a2.W(false);
            return;
        }
        if (i7 == 21) {
            if (getParentActivity() == null || iArr == null || iArr.length == 0 || iArr[0] == 0) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131747311, null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747299, null), new si0(this, i11));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
            alertDialog$Builder.p();
            return;
        }
        if (i7 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            J1(0);
            return;
        }
        if (i7 != 22 || iArr == null || iArr.length <= 0 || iArr[0] != 0 || (w9Var = this.r0) == null) {
            return;
        }
        w9Var.callOnClick();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        org.telegram.ui.Components.di diVar = this.R0;
        if (diVar != null) {
            diVar.m1();
        }
        if (this.b == 5 && (viewGroupArr = this.Z) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Y[0].requestFocus();
            org.telegram.messenger.g0.K3(this.Y[0]);
            org.telegram.messenger.g0.i3(new pi0(this, 0), 200L);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: Exception -> 0x0011, TRY_LEAVE, TryCatch #0 {Exception -> 0x0011, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0013, B:11:0x001e, B:13:0x0032, B:15:0x0036, B:17:0x003a, B:20:0x003f, B:22:0x004b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onThemeColorsChanged() {
        boolean z9;
        try {
            ScrollView scrollView = this.b0;
            boolean z10 = false;
            if (scrollView != null) {
                org.telegram.messenger.g0.z3(scrollView, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
            }
            int i7 = this.b;
            if (i7 != 2 && i7 != 1) {
                z9 = false;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false);
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false);
                if (z9 && (x02 != this.N1 || x03 != this.O1 || x04 != this.P1)) {
                    z10 = true;
                }
                T1(this.Y, z9, z10);
                T1(this.a0, z9, z10);
                if (z10) {
                    return;
                }
                this.N1 = x02;
                this.O1 = x03;
                this.P1 = x04;
                return;
            }
            z9 = true;
            int x022 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.k6, false);
            int x032 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.l6, false);
            int x042 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false);
            if (z9) {
                z10 = true;
            }
            T1(this.Y, z9, z10);
            T1(this.a0, z9, z10);
            if (z10) {
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (this.h1 != null) {
            org.telegram.messenger.g0.h3(new pi0(this, 1));
        }
        int i7 = this.b;
        if (i7 == 5) {
            if (z9) {
                if (this.Z[0].getVisibility() == 0) {
                    this.Y[0].requestFocus();
                    org.telegram.messenger.g0.K3(this.Y[0]);
                }
                if (this.N0 == 2) {
                    F1(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 7) {
            if (z9) {
                this.J1[this.I1].j();
                return;
            }
            return;
        }
        if (i7 == 4) {
            if (z9) {
                this.Y[0].requestFocus();
                org.telegram.messenger.g0.K3(this.Y[0]);
                return;
            }
            return;
        }
        if (i7 == 6) {
            if (z9) {
                this.Y[0].requestFocus();
                org.telegram.messenger.g0.K3(this.Y[0]);
                return;
            }
            return;
        }
        if (i7 == 2 || i7 == 1) {
            g1();
        }
    }

    public final void p1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z9) {
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
        bundle.putInt("timeout", tL_auth_sentCode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 4);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            O1(bundle, 2, z9);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            O1(bundle, 1, z9);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            O1(bundle, 0, z9);
        }
    }

    public final String q1() {
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Y;
            if (i7 >= editTextBoldCursorArr.length) {
                break;
            }
            sb2.append((CharSequence) editTextBoldCursorArr[i7].getText());
            sb2.append(",");
            i7++;
        }
        if (this.a0 != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.a0;
                if (i10 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb2.append((CharSequence) editTextBoldCursorArr2[i10].getText());
                sb2.append(",");
                i10++;
            }
        }
        ArrayList arrayList = this.i1;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(((org.telegram.messenger.ew) arrayList.get(i11)).b.id);
        }
        org.telegram.messenger.ew ewVar = this.l1;
        if (ewVar != null) {
            sb2.append(ewVar.b.id);
        }
        org.telegram.messenger.ew ewVar2 = this.m1;
        if (ewVar2 != null) {
            sb2.append(ewVar2.b.id);
        }
        org.telegram.messenger.ew ewVar3 = this.j1;
        if (ewVar3 != null) {
            sb2.append(ewVar3.b.id);
        }
        ArrayList arrayList2 = this.k1;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sb2.append(((org.telegram.messenger.ew) arrayList2.get(i12)).b.id);
        }
        return sb2.toString();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void restoreSelfArgs(Bundle bundle) {
        this.Q0 = bundle.getString("path");
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.Q0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final TLRPC.TL_secureValue v1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z9) {
        if (tL_secureRequiredType == null) {
            return null;
        }
        int size = this.D.values.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_secureValue tL_secureValue = this.D.values.get(i7);
            if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                if (z9) {
                    if (tL_secureRequiredType.selfie_required && !(tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                        return null;
                    }
                    if (tL_secureRequiredType.translation_required && tL_secureValue.translation.isEmpty()) {
                        return null;
                    }
                    if (x1(tL_secureRequiredType.type) && tL_secureValue.files.isEmpty()) {
                        return null;
                    }
                    if (z1(tL_secureRequiredType.type) && !(tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
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
                            JSONObject jSONObject = new JSONObject(l1(tL_secureData.data, m1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                            for (int i10 = 0; i10 < strArr.length; i10++) {
                                if (!jSONObject.has(strArr[i10]) || TextUtils.isEmpty(jSONObject.getString(strArr[i10]))) {
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

    public final boolean w1(Class cls) {
        int size = this.D.values.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.D.values.get(i7).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    public final boolean y1() {
        String str = this.a;
        return str == null || str.equals(q1());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public bk0(int i7, long j3, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i7, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i10;
        String s12;
        String str6;
        String str7;
        String str8;
        String str9;
        this.c = j3;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.r = str2;
        this.n = str5;
        if (i7 != 0 || authorizationform.errors.isEmpty()) {
            return;
        }
        try {
            Collections.sort(authorizationform.errors, new ij0(this));
            int size = authorizationform.errors.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i11);
                byte[] bArr = null;
                if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                    TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                    s12 = s1(tL_secureValueErrorFrontSide.type);
                    str6 = tL_secureValueErrorFrontSide.text;
                    bArr = tL_secureValueErrorFrontSide.file_hash;
                    str7 = null;
                    str8 = "front";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                    TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                    s12 = s1(tL_secureValueErrorReverseSide.type);
                    str6 = tL_secureValueErrorReverseSide.text;
                    bArr = tL_secureValueErrorReverseSide.file_hash;
                    str7 = null;
                    str8 = "reverse";
                } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                    TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                    s12 = s1(tL_secureValueErrorSelfie.type);
                    str6 = tL_secureValueErrorSelfie.text;
                    bArr = tL_secureValueErrorSelfie.file_hash;
                    str7 = null;
                    str8 = "selfie";
                } else {
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                        TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                        s12 = s1(tL_secureValueErrorTranslationFile.type);
                        str6 = tL_secureValueErrorTranslationFile.text;
                        bArr = tL_secureValueErrorTranslationFile.file_hash;
                        str7 = null;
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                        TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                        s12 = s1(tL_secureValueErrorTranslationFiles.type);
                        str6 = tL_secureValueErrorTranslationFiles.text;
                        str7 = null;
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                            TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                            s12 = s1(tL_secureValueErrorFile.type);
                            str6 = tL_secureValueErrorFile.text;
                            bArr = tL_secureValueErrorFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                            TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                            s12 = s1(tL_secureValueErrorFiles.type);
                            str6 = tL_secureValueErrorFiles.text;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                            TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                            s12 = s1(tL_secureValueError.type);
                            str6 = tL_secureValueError.text;
                            bArr = tL_secureValueError.hash;
                            str7 = null;
                            str8 = "error_all";
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                int i12 = 0;
                                while (i12 < authorizationform.values.size()) {
                                    TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i12).data;
                                    if (tL_secureData == null || !Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                        i12++;
                                        size = size;
                                    } else {
                                        s12 = s1(tL_secureValueErrorData.type);
                                        str6 = tL_secureValueErrorData.text;
                                        String str10 = tL_secureValueErrorData.field;
                                        bArr = tL_secureValueErrorData.data_hash;
                                        str7 = str10;
                                        str8 = "data";
                                    }
                                }
                            }
                            i10 = size;
                            i11++;
                            size = i10;
                        }
                        str8 = "files";
                    }
                    str8 = "translation";
                }
                HashMap hashMap = (HashMap) this.u1.get(s12);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    i10 = size;
                    this.u1.put(s12, hashMap);
                    this.v1.put(s12, str6);
                } else {
                    i10 = size;
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
                i11++;
                size = i10;
            }
        } catch (Exception unused) {
        }
    }
}
