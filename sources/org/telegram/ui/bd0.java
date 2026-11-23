package org.telegram.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
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
        org.telegram.ui.ActionBar.g2 T;
        org.telegram.ui.Components.fc I;
        jl0 jl0Var;
        jl0 jl0Var2;
        rj rjVar;
        int i11 = 4;
        String str = "";
        int i12 = 2;
        switch (this.a) {
            case 0:
                gd0 gd0Var = (gd0) this.b;
                Runnable runnable = (Runnable) this.c;
                br brVar = gd0Var.f;
                int i13 = 0;
                while (true) {
                    er[] erVarArr = brVar.f;
                    if (i13 >= erVarArr.length) {
                        runnable.run();
                        brVar.e = false;
                        break;
                    } else {
                        erVarArr[i13].D(0.0f);
                        i13++;
                    }
                }
            case 1:
                ((r3) this.b).a((String) this.c);
                break;
            case 2:
                ce0 ce0Var = (ce0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                de0 de0Var = ce0Var.h0;
                SharedPreferences g12 = org.telegram.messenger.mp.g1();
                if (!g12.getBoolean("firstloginshow", true) && !de0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    de0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    g12.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(de0Var.getParentActivity());
                    int i14 = org.telegram.ui.ActionBar.n6.L5;
                    alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.n6.x0(null, i14, false), null);
                    alertDialog$Builder.n(i14, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, "Continue"), null);
                    String N0 = org.telegram.messenger.gd.N0(2131754275, "AllowFillNumber");
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.U = N0;
                    de0Var.n = de0Var.showDialog(t1Var, true, null);
                    de0Var.d0 = true;
                    break;
                }
                break;
            case 3:
                ce0 ce0Var2 = (ce0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                if (ce0Var2.o()) {
                    org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, ce0Var2.getContext(), null);
                    t1Var2.setOnCancelListener(new wf(cancellationTokenSource, i11));
                    t1Var2.show();
                    ce0Var2.c0 = t1Var2;
                    break;
                }
                break;
            case 4:
                fe0.Z((fe0) this.b, (org.telegram.ui.ActionBar.t1) this.c);
                break;
            case 5:
                ef0 ef0Var = (ef0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                ef0Var.d0 = false;
                if (tL_error == null) {
                    we0 l02 = ef0Var.l0();
                    ef0Var.k0.clear();
                    ef0Var.n0(l02);
                    break;
                }
                break;
            case 6:
                ve0 ve0Var = (ve0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ef0 ef0Var2 = ve0Var.a;
                we0 l03 = ef0Var2.l0();
                ef0Var2.j0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = ef0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ef0Var2.getMessagesStorage().w1(ef0Var2.d.invitesCount, ef0Var2.n);
                }
                ef0Var2.n0(l03);
                break;
            case 7:
                mg0 mg0Var = (mg0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (mg0Var.getParentActivity() != null) {
                    Toast.makeText(mg0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 8:
                dh0 dh0Var = (dh0) this.b;
                String str2 = (String) this.c;
                dh0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.gd.a0(null, null, 2131748923, "https://telegram.org/dl"));
                dh0Var.getContext().startActivity(intent);
                break;
            case 9:
                dh0 dh0Var2 = (dh0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                dh0Var2.dismiss();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.D4(user.id));
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.Components.ph) this.b).a((TLRPC.User) this.c);
                break;
            case 11:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 12:
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                w2VarArr[0] = null;
                ei0.a = null;
                zArr[0] = true;
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (er erVar : passcodeActivity.n.f) {
                    erVar.D(0.0f);
                }
                runnable2.run();
                break;
            case 14:
                ki0 ki0Var = (ki0) this.b;
                org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) ki0Var.c;
                y0Var.setText(org.telegram.messenger.gd.N0(passcodeActivity2.E == 0 ? 2131747459 : 2131747460, null));
                y0Var.setIcon(passcodeActivity2.E == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.y0();
                if (passcodeActivity2.s0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.g0.X3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).d0((TL_account.Passkey) this.c);
                break;
            case 16:
                fk0 fk0Var = (fk0) this.b;
                org.telegram.messenger.ur urVar = (org.telegram.messenger.ur) this.c;
                int[] iArr = fk0Var.y;
                int i15 = urVar.a;
                if (i15 == 2) {
                    if (!(fk0Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = fk0Var.H.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) fk0Var.H.get(i16);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    fk0Var.G = tL_secureRequiredType;
                                    fk0Var.U1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i15 == 1) {
                    if (!(fk0Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = fk0Var.H.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) fk0Var.H.get(i17);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    fk0Var.G = tL_secureRequiredType2;
                                    fk0Var.U1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i15 == 3) {
                    if (!(fk0Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = fk0Var.H.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) fk0Var.H.get(i18);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    fk0Var.G = tL_secureRequiredType3;
                                    fk0Var.U1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i15 == 4 && !(fk0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = fk0Var.H.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) fk0Var.H.get(i19);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                fk0Var.G = tL_secureRequiredType4;
                                fk0Var.U1();
                            } else {
                                i19++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(urVar.b)) {
                    fk0Var.Z[0].setText(urVar.b);
                }
                if (!TextUtils.isEmpty(urVar.d)) {
                    fk0Var.Z[1].setText(urVar.d);
                }
                if (!TextUtils.isEmpty(urVar.c)) {
                    fk0Var.Z[2].setText(urVar.c);
                }
                if (!TextUtils.isEmpty(urVar.e)) {
                    fk0Var.Z[7].setText(urVar.e);
                }
                int i20 = urVar.n;
                if (i20 != 0) {
                    if (i20 == 1) {
                        fk0Var.x = "male";
                        fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747314, null));
                    } else if (i20 == 2) {
                        fk0Var.x = "female";
                        fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747375, null));
                    }
                }
                if (!TextUtils.isEmpty(urVar.m)) {
                    String str3 = urVar.m;
                    fk0Var.s = str3;
                    String str4 = (String) fk0Var.Z0.get(str3);
                    if (str4 != null) {
                        fk0Var.Z[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(urVar.l)) {
                    String str5 = urVar.l;
                    fk0Var.w = str5;
                    String str6 = (String) fk0Var.Z0.get(str5);
                    if (str6 != null) {
                        fk0Var.Z[6].setText(str6);
                    }
                }
                int i21 = urVar.k;
                if (i21 > 0 && urVar.j > 0 && urVar.i > 0) {
                    fk0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(urVar.j), Integer.valueOf(urVar.i)));
                }
                int i22 = urVar.h;
                if (i22 <= 0 || (i7 = urVar.g) <= 0 || (i10 = urVar.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    fk0Var.Z[8].setText(org.telegram.messenger.gd.N0(2131747300, null));
                    break;
                } else {
                    iArr[0] = i10;
                    iArr[1] = i7;
                    iArr[2] = i22;
                    fk0Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(urVar.g), Integer.valueOf(urVar.f)));
                    break;
                }
                break;
            case 17:
                fk0 fk0Var2 = (fk0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    fk0Var2.K = password;
                    if (TwoStepVerificationActivity.n0(password, false)) {
                        TwoStepVerificationActivity.r0(fk0Var2.K);
                        fk0Var2.W1();
                        if (fk0Var2.a0[0].getVisibility() == 0) {
                            fk0Var2.Z[0].requestFocus();
                            org.telegram.messenger.g0.I3(fk0Var2.Z[0]);
                        }
                        if (fk0Var2.O0 == 1) {
                            fk0Var2.F1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.b5.u0(fk0Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, null), true);
                        break;
                    }
                }
                break;
            case 18:
                fk0 fk0Var3 = (fk0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tL_error2 == null) {
                    fk0Var3.g1 = true;
                    fk0Var3.a1(true);
                    fk0Var3.finishFragment();
                    break;
                } else {
                    fk0Var3.R1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.b5.u0(fk0Var3.getParentActivity(), org.telegram.messenger.gd.N0(2131743573, null), true);
                        break;
                    } else {
                        fk0Var3.Q1(org.telegram.messenger.gd.N0(R.string.AppName, null), tL_error2.text);
                        break;
                    }
                }
            case 19:
                ((ak0) this.b).a.L = ((TLRPC.TL_error) this.c).text;
                break;
            case 20:
                kl0 kl0Var = (kl0) this.b;
                View view = (View) this.c;
                kl0Var.J0(false);
                view.callOnClick();
                break;
            case 21:
                kl0 kl0Var2 = (kl0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                kl0Var2.N0(true, false);
                if (tL_error3 != null) {
                    if (tL_error3.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.m3 m3Var = kl0Var2.T;
                        try {
                            m3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.E3(2.5f, m3Var, null);
                        org.telegram.ui.Cells.m3 m3Var2 = kl0Var2.T;
                        m3Var2.a.setText("");
                        m3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error3.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String N02 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        kl0Var2.L0(N02, org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, objArr));
                        break;
                    } else {
                        kl0Var2.L0(org.telegram.messenger.gd.N0(R.string.AppName, null), tL_error3.text);
                        break;
                    }
                } else if (kl0Var2.getParentActivity() != null) {
                    lk0 lk0Var = kl0Var2.e0;
                    if (lk0Var != null) {
                        org.telegram.messenger.g0.r(lk0Var);
                        kl0Var2.e0 = null;
                    }
                    kl0Var2.z0();
                    break;
                }
                break;
            case 22:
                kl0.b0((kl0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 23:
                kl0 kl0Var3 = (kl0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = kl0Var3.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = org.telegram.messenger.t0.b;
                }
                if (obj == null) {
                    obj = LaunchActivity.H1;
                }
                if (obj != null) {
                    kl0Var3.b1 = true;
                    kl0Var3.g1 = 1;
                    TLRPC.InputInvoice inputInvoice = kl0Var3.c1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (jl0Var2 = kl0Var3.a1) != null) {
                        jl0Var2.e(1);
                    }
                    kl0Var3.z0();
                    if (z10 && (jl0Var = kl0Var3.a1) != null) {
                        jl0Var.e(kl0Var3.g1);
                    }
                    long w02 = kl0Var3.w0();
                    if (w02 > 0) {
                        str = org.telegram.messenger.n10.l(kl0Var3.getMessagesController().c2(Long.valueOf(w02)));
                    } else if (w02 < 0) {
                        char c11 = 0;
                        TLRPC.Chat O0 = kl0Var3.getMessagesController().O0(Long.valueOf(-w02));
                        r15 = c11;
                        if (O0 != null) {
                            str = O0.title;
                            r15 = c11;
                        }
                        long v02 = kl0Var3.v0();
                        int i23 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String N03 = z10 ? null : org.telegram.messenger.gd.N0(z12 ? 2131744851 : z11 ? 2131744859 : 2131744918, null);
                        if (z10) {
                            String str7 = kl0Var3.S0[r15];
                            String str8 = kl0Var3.r0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r15] = str7;
                            objArr2[1] = str8;
                            a02 = org.telegram.messenger.gd.a0(null, null, 2131747207, objArr2);
                        } else if (z12) {
                            a02 = org.telegram.messenger.gd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                        } else {
                            String str9 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r15] = str;
                            a02 = org.telegram.messenger.gd.K(str9, (int) v02, ',', objArr3);
                        }
                        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                        T = LaunchActivity.T();
                        if (T == null) {
                            org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(T);
                            if (w02 == 0 || N03 == null || z12) {
                                String str10 = N03;
                                I = str10 != null ? b02.I(i23, str10, W2) : b02.Q(i23, 36, W2);
                            } else {
                                I = b02.L(i23, N03, W2, org.telegram.messenger.gd.N0(2131743302, null), new di.g3(w02, i12));
                            }
                            boolean z13 = r15;
                            org.telegram.ui.Components.fc fcVar = I;
                            fcVar.r = z13;
                            fcVar.j = 5000;
                            if (messageArr[z13 ? 1 : 0] != null) {
                                fi.k3 k3Var = new fi.k3(kl0Var3, fcVar, z11, messageArr, 3);
                                org.telegram.ui.Components.kb kbVar = fcVar.e;
                                if (kbVar != null) {
                                    kbVar.setOnClickListener(k3Var);
                                }
                            }
                            fcVar.k(z12);
                            break;
                        }
                    }
                    r15 = 0;
                    long v022 = kl0Var3.v0();
                    int i232 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                    }
                    if (z10) {
                    }
                    SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(a02);
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 24:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (b6Var != null) {
                    ArrayList arrayList2 = b6Var.h;
                    org.telegram.ui.Components.y5 y5Var = b6Var.n;
                    if (y5Var != null) {
                        arrayList2.add(y5Var);
                    }
                    org.telegram.ui.Components.y5 y5Var2 = b6Var.r;
                    if (y5Var2 != null) {
                        arrayList2.add(y5Var2);
                    }
                    org.telegram.ui.Components.y5 y5Var3 = b6Var.s;
                    if (y5Var3 != null) {
                        arrayList2.add(y5Var3);
                    }
                    b6Var.n = new org.telegram.ui.Components.y5(bitmap);
                    b6Var.r = null;
                    b6Var.s = null;
                    b6Var.t();
                    break;
                }
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ty0.e1(photoViewer.F, photoViewer.m4, false, (fi.b) this.c, null);
                break;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ep0 ep0Var = (ep0) this.c;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                if (ep0Var.getWindow() != null) {
                    ep0Var.A0(true);
                    bn bnVar = photoViewer2.l4;
                    if (bnVar != null && (rjVar = bnVar.a0) != null) {
                        rjVar.L0(false);
                        break;
                    }
                }
                break;
            case 27:
                bi.k2 k2Var = (bi.k2) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr3 = PhotoViewer.f9;
                k2Var.a(bitmap2);
                break;
            case 28:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                tg.t0 t0Var = (tg.t0) this.c;
                Drawable[] drawableArr4 = PhotoViewer.f9;
                t0Var.e.h();
                t0Var.c.postRunnable(new cd0(24));
                photoViewer3.f0.removeView(photoViewer3.O1);
                break;
            default:
                eo0 eo0Var = (eo0) this.b;
                View view2 = (View) this.c;
                eo0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = eo0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                pq0 pq0Var = photoViewer4.F2;
                if (pq0Var != null) {
                    pq0Var.setOutlineProvider(null);
                    break;
                }
                break;
        }
    }
}
