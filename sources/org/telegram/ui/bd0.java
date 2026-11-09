package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.tasks.CancellationTokenSource;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bd0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int i10;
        char c10;
        String G;
        ?? r15;
        String a02;
        org.telegram.ui.ActionBar.f2 T;
        org.telegram.ui.Components.cc I;
        il0 il0Var;
        il0 il0Var2;
        sj sjVar;
        int i11 = 4;
        String str = "";
        int i12 = 2;
        switch (this.a) {
            case 0:
                id0 id0Var = (id0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131752579, null);
                alertDialog$Builder.a.T = org.telegram.messenger.id.a0("CancelLinkSuccess", null, 2131752580, org.telegram.messenger.k5.i(new StringBuilder("+"), id0Var.b, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752041, null), null);
                alertDialog$Builder.a.setOnDismissListener(new ed0(id0Var, 0));
                alertDialog$Builder.p();
                break;
            case 1:
                id0 id0Var2 = (id0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                id0Var2.getClass();
                id0Var2.g0 = tL_error.text;
                break;
            case 2:
                ((id0) this.b).u0.G1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 3:
                id0 id0Var3 = (id0) this.b;
                Runnable runnable = (Runnable) this.c;
                ar arVar = id0Var3.f;
                int i13 = 0;
                while (true) {
                    dr[] drVarArr = arVar.f;
                    if (i13 >= drVarArr.length) {
                        runnable.run();
                        arVar.e = false;
                        break;
                    } else {
                        drVarArr[i13].C(0.0f);
                        i13++;
                    }
                }
            case 4:
                ((r3) this.b).a((String) this.c);
                break;
            case 5:
                de0 de0Var = (de0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ee0 ee0Var = de0Var.g0;
                SharedPreferences e12 = org.telegram.messenger.qp.e1();
                if (!e12.getBoolean("firstloginshow", true) && !ee0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ee0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    e12.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ee0Var.getParentActivity());
                    int i14 = org.telegram.ui.ActionBar.l6.L5;
                    alertDialog$Builder2.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.l6.x0(null, i14, false), null);
                    alertDialog$Builder2.n(i14, null);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751771, "Continue"), null);
                    String M0 = org.telegram.messenger.id.M0(2131754278, "AllowFillNumber");
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder2.a;
                    u1Var.T = M0;
                    ee0Var.n = ee0Var.showDialog(u1Var, true, null);
                    ee0Var.c0 = true;
                    break;
                }
                break;
            case 6:
                de0 de0Var2 = (de0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                if (de0Var2.o()) {
                    org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, de0Var2.getContext(), null);
                    u1Var2.setOnCancelListener(new vf(cancellationTokenSource, i11));
                    u1Var2.show();
                    de0Var2.b0 = u1Var2;
                    break;
                }
                break;
            case 7:
                ge0.Z((ge0) this.b, (org.telegram.ui.ActionBar.u1) this.c);
                break;
            case 8:
                ef0 ef0Var = (ef0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ef0Var.c0 = false;
                if (tL_error2 == null) {
                    we0 l02 = ef0Var.l0();
                    ef0Var.j0.clear();
                    ef0Var.n0(l02);
                    break;
                }
                break;
            case 9:
                ve0 ve0Var = (ve0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ef0 ef0Var2 = ve0Var.a;
                we0 l03 = ef0Var2.l0();
                ef0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = ef0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ef0Var2.getMessagesStorage().w1(ef0Var2.d.invitesCount, ef0Var2.n);
                }
                ef0Var2.n0(l03);
                break;
            case 10:
                lg0 lg0Var = (lg0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (lg0Var.getParentActivity() != null) {
                    Toast.makeText(lg0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 11:
                ch0 ch0Var = (ch0) this.b;
                String str2 = (String) this.c;
                ch0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.id.a0(null, null, 2131749116, "https://telegram.org/dl"));
                ch0Var.getContext().startActivity(intent);
                break;
            case 12:
                ch0 ch0Var2 = (ch0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ch0Var2.dismiss();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.D4(user.id));
                    break;
                }
                break;
            case 13:
                ((org.telegram.ui.Components.fx) this.b).a((TLRPC.User) this.c);
                break;
            case 14:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 15:
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                v2VarArr[0] = null;
                di0.a = null;
                zArr[0] = true;
                break;
            case 16:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (dr drVar : passcodeActivity.n.f) {
                    drVar.C(0.0f);
                }
                runnable2.run();
                break;
            case 17:
                ji0 ji0Var = (ji0) this.b;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) ji0Var.c;
                z0Var.setText(org.telegram.messenger.id.M0(passcodeActivity2.D == 0 ? 2131747653 : 2131747654, null));
                z0Var.setIcon(passcodeActivity2.D == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.y0();
                if (passcodeActivity2.s0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.g0.Z3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 18:
                ((PasskeysActivity) this.b).d0((TL_account.Passkey) this.c);
                break;
            case 19:
                dk0 dk0Var = (dk0) this.b;
                org.telegram.messenger.zr zrVar = (org.telegram.messenger.zr) this.c;
                int[] iArr = dk0Var.y;
                int i15 = zrVar.a;
                if (i15 == 2) {
                    if (!(dk0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = dk0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) dk0Var.G.get(i16);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    dk0Var.F = tL_secureRequiredType;
                                    dk0Var.U1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i15 == 1) {
                    if (!(dk0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = dk0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) dk0Var.G.get(i17);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    dk0Var.F = tL_secureRequiredType2;
                                    dk0Var.U1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i15 == 3) {
                    if (!(dk0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = dk0Var.G.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) dk0Var.G.get(i18);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    dk0Var.F = tL_secureRequiredType3;
                                    dk0Var.U1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i15 == 4 && !(dk0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = dk0Var.G.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) dk0Var.G.get(i19);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                dk0Var.F = tL_secureRequiredType4;
                                dk0Var.U1();
                            } else {
                                i19++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(zrVar.b)) {
                    dk0Var.Y[0].setText(zrVar.b);
                }
                if (!TextUtils.isEmpty(zrVar.d)) {
                    dk0Var.Y[1].setText(zrVar.d);
                }
                if (!TextUtils.isEmpty(zrVar.c)) {
                    dk0Var.Y[2].setText(zrVar.c);
                }
                if (!TextUtils.isEmpty(zrVar.e)) {
                    dk0Var.Y[7].setText(zrVar.e);
                }
                int i20 = zrVar.n;
                if (i20 != 0) {
                    if (i20 == 1) {
                        dk0Var.x = "male";
                        dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
                    } else if (i20 == 2) {
                        dk0Var.x = "female";
                        dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
                    }
                }
                if (!TextUtils.isEmpty(zrVar.m)) {
                    String str3 = zrVar.m;
                    dk0Var.s = str3;
                    String str4 = (String) dk0Var.Y0.get(str3);
                    if (str4 != null) {
                        dk0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(zrVar.l)) {
                    String str5 = zrVar.l;
                    dk0Var.w = str5;
                    String str6 = (String) dk0Var.Y0.get(str5);
                    if (str6 != null) {
                        dk0Var.Y[6].setText(str6);
                    }
                }
                int i21 = zrVar.k;
                if (i21 > 0 && zrVar.j > 0 && zrVar.i > 0) {
                    dk0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(zrVar.j), Integer.valueOf(zrVar.i)));
                }
                int i22 = zrVar.h;
                if (i22 <= 0 || (i7 = zrVar.g) <= 0 || (i10 = zrVar.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    dk0Var.Y[8].setText(org.telegram.messenger.id.M0(2131747494, null));
                    break;
                } else {
                    iArr[0] = i10;
                    iArr[1] = i7;
                    iArr[2] = i22;
                    dk0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(zrVar.g), Integer.valueOf(zrVar.f)));
                    break;
                }
                break;
            case 20:
                dk0 dk0Var2 = (dk0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    dk0Var2.J = password;
                    if (TwoStepVerificationActivity.n0(password, false)) {
                        TwoStepVerificationActivity.r0(dk0Var2.J);
                        dk0Var2.W1();
                        if (dk0Var2.Z[0].getVisibility() == 0) {
                            dk0Var2.Y[0].requestFocus();
                            org.telegram.messenger.g0.K3(dk0Var2.Y[0]);
                        }
                        if (dk0Var2.N0 == 1) {
                            dk0Var2.F1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.v4.u0(dk0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                        break;
                    }
                }
                break;
            case 21:
                dk0 dk0Var3 = (dk0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (tL_error3 == null) {
                    dk0Var3.f1 = true;
                    dk0Var3.a1(true);
                    dk0Var3.finishFragment();
                    break;
                } else {
                    dk0Var3.R1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error3.text)) {
                        org.telegram.ui.Components.v4.u0(dk0Var3.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                        break;
                    } else {
                        dk0Var3.Q1(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error3.text);
                        break;
                    }
                }
            case 22:
                ((yj0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 23:
                jl0 jl0Var = (jl0) this.b;
                View view = (View) this.c;
                jl0Var.J0(false);
                view.callOnClick();
                break;
            case 24:
                jl0 jl0Var2 = (jl0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                jl0Var2.N0(true, false);
                if (tL_error4 != null) {
                    if (tL_error4.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.l3 l3Var = jl0Var2.S;
                        try {
                            l3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.G3(2.5f, l3Var, null);
                        org.telegram.ui.Cells.l3 l3Var2 = jl0Var2.S;
                        l3Var2.a.setText("");
                        l3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error4.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String M02 = org.telegram.messenger.id.M0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        jl0Var2.L0(M02, org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750686, objArr));
                        break;
                    } else {
                        jl0Var2.L0(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error4.text);
                        break;
                    }
                } else if (jl0Var2.getParentActivity() != null) {
                    kk0 kk0Var = jl0Var2.d0;
                    if (kk0Var != null) {
                        org.telegram.messenger.g0.r(kk0Var);
                        jl0Var2.d0 = null;
                    }
                    jl0Var2.z0();
                    break;
                }
                break;
            case 25:
                jl0.b0((jl0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 26:
                jl0 jl0Var3 = (jl0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = jl0Var3.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = org.telegram.messenger.t0.b;
                }
                if (obj == null) {
                    obj = LaunchActivity.G1;
                }
                if (obj != null) {
                    jl0Var3.a1 = true;
                    jl0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = jl0Var3.b1;
                    boolean z9 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z10 = z9 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z11 = z9 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z9 && (il0Var2 = jl0Var3.Z0) != null) {
                        il0Var2.b(1);
                    }
                    jl0Var3.z0();
                    if (z9 && (il0Var = jl0Var3.Z0) != null) {
                        il0Var.b(jl0Var3.f1);
                    }
                    long w02 = jl0Var3.w0();
                    if (w02 > 0) {
                        str = org.telegram.messenger.t10.k(jl0Var3.getMessagesController().a2(Long.valueOf(w02)));
                    } else if (w02 < 0) {
                        char c11 = 0;
                        TLRPC.Chat M03 = jl0Var3.getMessagesController().M0(Long.valueOf(-w02));
                        r15 = c11;
                        if (M03 != null) {
                            str = M03.title;
                            r15 = c11;
                        }
                        long v02 = jl0Var3.v0();
                        int i23 = !z9 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String M04 = z9 ? null : org.telegram.messenger.id.M0(z11 ? 2131745092 : z10 ? 2131745100 : 2131745159, null);
                        if (z9) {
                            String str7 = jl0Var3.R0[r15];
                            String str8 = jl0Var3.q0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r15] = str7;
                            objArr2[1] = str8;
                            a02 = org.telegram.messenger.id.a0(null, null, 2131747401, objArr2);
                        } else if (z11) {
                            a02 = org.telegram.messenger.id.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                        } else {
                            String str9 = z10 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r15] = str;
                            a02 = org.telegram.messenger.id.K(str9, (int) v02, ',', objArr3);
                        }
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
                        T = LaunchActivity.T();
                        if (T == null) {
                            org.telegram.ui.Components.hc a03 = org.telegram.ui.Components.hc.a0(T);
                            if (w02 == 0 || M04 == null || z11) {
                                String str10 = M04;
                                I = str10 != null ? a03.I(i23, str10, X2) : a03.Q(i23, 36, X2);
                            } else {
                                I = a03.L(i23, M04, X2, org.telegram.messenger.id.M0(2131743552, null), new bi.k4(w02, i12));
                            }
                            boolean z12 = r15;
                            org.telegram.ui.Components.cc ccVar = I;
                            ccVar.r = z12;
                            ccVar.j = 5000;
                            if (messageArr[z12 ? 1 : 0] != null) {
                                di.r3 r3Var = new di.r3(jl0Var3, ccVar, z10, messageArr, 3);
                                org.telegram.ui.Components.gb gbVar = ccVar.e;
                                if (gbVar != null) {
                                    gbVar.setOnClickListener(r3Var);
                                }
                            }
                            ccVar.k(z11);
                            break;
                        }
                    }
                    r15 = 0;
                    long v022 = jl0Var3.v0();
                    int i232 = !z9 ? (z10 || z11) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z9) {
                    }
                    if (z9) {
                    }
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(a02);
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                vy0.d1(photoViewer.E, photoViewer.l4, false, (di.b) this.c, null);
                break;
            case 28:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                gp0 gp0Var = (gp0) this.c;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (gp0Var.getWindow() != null) {
                    gp0Var.A0(true);
                    cn cnVar = photoViewer2.k4;
                    if (cnVar != null && (sjVar = cnVar.Z) != null) {
                        sjVar.k0(false);
                        break;
                    }
                }
                break;
            default:
                bi.r2 r2Var = (bi.r2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                r2Var.a(bitmap);
                break;
        }
    }
}
