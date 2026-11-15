package org.telegram.ui;

import android.content.Context;
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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jd0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        TLRPC.Chat M0;
        String a02;
        org.telegram.ui.Components.xb I;
        il0 il0Var;
        il0 il0Var2;
        qj qjVar;
        int i11 = 4;
        String str = "";
        int i12 = 2;
        switch (this.a) {
            case 0:
                ((r3) this.b).a((String) this.c);
                break;
            case 1:
                be0 be0Var = (be0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ce0 ce0Var = be0Var.h0;
                SharedPreferences e12 = org.telegram.messenger.np.e1();
                if (!e12.getBoolean("firstloginshow", true) && !ce0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ce0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    break;
                } else {
                    e12.edit().putBoolean("firstloginshow", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                    int i13 = org.telegram.ui.ActionBar.j6.L5;
                    alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.j6.x0(null, i13, false), null);
                    alertDialog$Builder.n(i13, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, "Continue"), null);
                    String M02 = org.telegram.messenger.hd.M0(2131754278, "AllowFillNumber");
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.U = M02;
                    ce0Var.n = ce0Var.showDialog(t1Var, true, null);
                    ce0Var.d0 = true;
                    break;
                }
            case 2:
                be0 be0Var2 = (be0) this.b;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.c;
                if (be0Var2.o()) {
                    org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, be0Var2.getContext(), null);
                    t1Var2.setOnCancelListener(new tf(cancellationTokenSource, i11));
                    t1Var2.show();
                    be0Var2.c0 = t1Var2;
                    break;
                }
                break;
            case 3:
                ee0.Z((ee0) this.b, (org.telegram.ui.ActionBar.t1) this.c);
                break;
            case 4:
                cf0 cf0Var = (cf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                cf0Var.d0 = false;
                if (tL_error == null) {
                    ue0 l02 = cf0Var.l0();
                    cf0Var.k0.clear();
                    cf0Var.n0(l02);
                    break;
                }
                break;
            case 5:
                te0 te0Var = (te0) this.b;
                TLObject tLObject = (TLObject) this.c;
                cf0 cf0Var2 = te0Var.a;
                ue0 l03 = cf0Var2.l0();
                cf0Var2.j0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = cf0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    cf0Var2.getMessagesStorage().w1(cf0Var2.d.invitesCount, cf0Var2.n);
                }
                cf0Var2.n0(l03);
                break;
            case 6:
                jg0 jg0Var = (jg0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (jg0Var.getParentActivity() != null) {
                    Toast.makeText(jg0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 7:
                bh0 bh0Var = (bh0) this.b;
                String str2 = (String) this.c;
                bh0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.hd.a0(null, null, 2131749116, "https://telegram.org/dl"));
                bh0Var.getContext().startActivity(intent);
                break;
            case 8:
                bh0 bh0Var2 = (bh0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                bh0Var2.dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.C4(user.id));
                    break;
                }
                break;
            case 9:
                ((org.telegram.ui.Components.gh) this.b).a((TLRPC.User) this.c);
                break;
            case 10:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 11:
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                u2VarArr[0] = null;
                di0.a = null;
                zArr[0] = true;
                break;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (dr drVar : passcodeActivity.n.f) {
                    drVar.D(0.0f);
                }
                runnable.run();
                break;
            case 13:
                ji0 ji0Var = (ji0) this.b;
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) ji0Var.c;
                z0Var.setText(org.telegram.messenger.hd.M0(passcodeActivity2.E == 0 ? 2131747653 : 2131747654, null));
                z0Var.setIcon(passcodeActivity2.E == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.y0();
                if (passcodeActivity2.s0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.g0.Y3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 14:
                ((PasskeysActivity) this.b).d0((TL_account.Passkey) this.c);
                break;
            case 15:
                ek0 ek0Var = (ek0) this.b;
                org.telegram.messenger.wr wrVar = (org.telegram.messenger.wr) this.c;
                int[] iArr = ek0Var.y;
                int i14 = wrVar.a;
                if (i14 == 2) {
                    if (!(ek0Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = ek0Var.H.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) ek0Var.H.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    ek0Var.G = tL_secureRequiredType;
                                    ek0Var.U1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(ek0Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = ek0Var.H.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) ek0Var.H.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    ek0Var.G = tL_secureRequiredType2;
                                    ek0Var.U1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(ek0Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = ek0Var.H.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) ek0Var.H.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    ek0Var.G = tL_secureRequiredType3;
                                    ek0Var.U1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(ek0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = ek0Var.H.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) ek0Var.H.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                ek0Var.G = tL_secureRequiredType4;
                                ek0Var.U1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(wrVar.b)) {
                    ek0Var.Z[0].setText(wrVar.b);
                }
                if (!TextUtils.isEmpty(wrVar.d)) {
                    ek0Var.Z[1].setText(wrVar.d);
                }
                if (!TextUtils.isEmpty(wrVar.c)) {
                    ek0Var.Z[2].setText(wrVar.c);
                }
                if (!TextUtils.isEmpty(wrVar.e)) {
                    ek0Var.Z[7].setText(wrVar.e);
                }
                int i19 = wrVar.n;
                if (i19 != 0) {
                    if (i19 == 1) {
                        ek0Var.x = "male";
                        ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747508, null));
                    } else if (i19 == 2) {
                        ek0Var.x = "female";
                        ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747569, null));
                    }
                }
                if (!TextUtils.isEmpty(wrVar.m)) {
                    String str3 = wrVar.m;
                    ek0Var.s = str3;
                    String str4 = (String) ek0Var.Z0.get(str3);
                    if (str4 != null) {
                        ek0Var.Z[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(wrVar.l)) {
                    String str5 = wrVar.l;
                    ek0Var.w = str5;
                    String str6 = (String) ek0Var.Z0.get(str5);
                    if (str6 != null) {
                        ek0Var.Z[6].setText(str6);
                    }
                }
                int i20 = wrVar.k;
                if (i20 > 0 && wrVar.j > 0 && wrVar.i > 0) {
                    ek0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(wrVar.j), Integer.valueOf(wrVar.i)));
                }
                int i21 = wrVar.h;
                if (i21 <= 0 || (i7 = wrVar.g) <= 0 || (i10 = wrVar.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    ek0Var.Z[8].setText(org.telegram.messenger.hd.M0(2131747494, null));
                    break;
                } else {
                    iArr[0] = i10;
                    iArr[1] = i7;
                    iArr[2] = i21;
                    ek0Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(wrVar.g), Integer.valueOf(wrVar.f)));
                    break;
                }
                break;
            case 16:
                ek0 ek0Var2 = (ek0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    ek0Var2.K = password;
                    if (TwoStepVerificationActivity.n0(password, false)) {
                        TwoStepVerificationActivity.r0(ek0Var2.K);
                        ek0Var2.W1();
                        if (ek0Var2.a0[0].getVisibility() == 0) {
                            ek0Var2.Z[0].requestFocus();
                            org.telegram.messenger.g0.J3(ek0Var2.Z[0]);
                        }
                        if (ek0Var2.O0 == 1) {
                            ek0Var2.F1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.t4.u0(ek0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                        break;
                    }
                }
                break;
            case 17:
                ek0 ek0Var3 = (ek0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tL_error2 == null) {
                    ek0Var3.g1 = true;
                    ek0Var3.a1(true);
                    ek0Var3.finishFragment();
                    break;
                } else {
                    ek0Var3.R1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.t4.u0(ek0Var3.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                        break;
                    } else {
                        ek0Var3.Q1(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error2.text);
                        break;
                    }
                }
            case 18:
                ((zj0) this.b).a.L = ((TLRPC.TL_error) this.c).text;
                break;
            case 19:
                jl0 jl0Var = (jl0) this.b;
                View view = (View) this.c;
                jl0Var.J0(false);
                view.callOnClick();
                break;
            case 20:
                jl0 jl0Var2 = (jl0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                jl0Var2.N0(true, false);
                if (tL_error3 != null) {
                    if (tL_error3.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.l3 l3Var = jl0Var2.T;
                        try {
                            l3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.g0.F3(2.5f, l3Var, null);
                        org.telegram.ui.Cells.l3 l3Var2 = jl0Var2.T;
                        l3Var2.a.setText("");
                        l3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error3.text).intValue();
                        jl0Var2.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    } else {
                        jl0Var2.L0(org.telegram.messenger.hd.M0(R.string.AppName, null), tL_error3.text);
                        break;
                    }
                } else if (jl0Var2.getParentActivity() != null) {
                    kk0 kk0Var = jl0Var2.e0;
                    if (kk0Var != null) {
                        org.telegram.messenger.g0.r(kk0Var);
                        jl0Var2.e0 = null;
                    }
                    jl0Var2.z0();
                    break;
                }
                break;
            case 21:
                jl0.b0((jl0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 22:
                jl0 jl0Var3 = (jl0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = jl0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.t0.b;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    jl0Var3.b1 = true;
                    jl0Var3.g1 = 1;
                    TLRPC.InputInvoice inputInvoice = jl0Var3.c1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (il0Var2 = jl0Var3.a1) != null) {
                        il0Var2.e(1);
                    }
                    jl0Var3.z0();
                    if (z10 && (il0Var = jl0Var3.a1) != null) {
                        il0Var.e(jl0Var3.g1);
                    }
                    long w02 = jl0Var3.w0();
                    if (w02 > 0) {
                        str = org.telegram.messenger.q10.k(jl0Var3.getMessagesController().a2(Long.valueOf(w02)));
                    } else if (w02 < 0 && (M0 = jl0Var3.getMessagesController().M0(Long.valueOf(-w02))) != null) {
                        str = M0.title;
                    }
                    long v02 = jl0Var3.v0();
                    int i22 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String M03 = z10 ? org.telegram.messenger.hd.M0(z12 ? 2131745092 : z11 ? 2131745100 : 2131745159, null) : null;
                    if (!z10) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131747401, jl0Var3.S0[0], jl0Var3.r0);
                    } else if (z12) {
                        a02 = org.telegram.messenger.hd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                    } else {
                        a02 = org.telegram.messenger.hd.K(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) v02, ',', str);
                    }
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(T2);
                        if (w02 == 0 || M03 == null || z12) {
                            String str7 = M03;
                            I = str7 != null ? a03.I(i22, str7, X2) : a03.Q(i22, 36, X2);
                        } else {
                            I = a03.L(i22, M03, X2, org.telegram.messenger.hd.M0(2131743552, null), new di.l3(w02, i12));
                        }
                        I.r = false;
                        I.j = 5000;
                        if (messageArr[0] != null) {
                            fi.m3 m3Var = new fi.m3(jl0Var3, I, z11, messageArr, 3);
                            org.telegram.ui.Components.cb cbVar = I.e;
                            if (cbVar != null) {
                                cbVar.setOnClickListener(m3Var);
                            }
                        }
                        I.k(z12);
                        break;
                    }
                }
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                qy0.d1(photoViewer.F, photoViewer.m4, false, (fi.b) this.c, null);
                break;
            case 24:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                cp0 cp0Var = (cp0) this.c;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (cp0Var.getWindow() != null) {
                    cp0Var.A0(true);
                    an anVar = photoViewer2.l4;
                    if (anVar != null && (qjVar = anVar.a0) != null) {
                        qjVar.y0(false);
                        break;
                    }
                }
                break;
            case 25:
                bi.i1 i1Var = (bi.i1) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                i1Var.a(bitmap);
                break;
            case 26:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                tg.o0 o0Var = (tg.o0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.Z8;
                o0Var.e.h();
                o0Var.c.postRunnable(new ah0(21));
                photoViewer3.f0.removeView(photoViewer3.O1);
                break;
            case 27:
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.Z8;
                if (t5Var != null) {
                    ArrayList arrayList2 = t5Var.h;
                    org.telegram.ui.Components.q5 q5Var = t5Var.n;
                    if (q5Var != null) {
                        arrayList2.add(q5Var);
                    }
                    org.telegram.ui.Components.q5 q5Var2 = t5Var.r;
                    if (q5Var2 != null) {
                        arrayList2.add(q5Var2);
                    }
                    org.telegram.ui.Components.q5 q5Var3 = t5Var.s;
                    if (q5Var3 != null) {
                        arrayList2.add(q5Var3);
                    }
                    t5Var.n = new org.telegram.ui.Components.q5(bitmap2);
                    t5Var.r = null;
                    t5Var.s = null;
                    t5Var.t();
                    break;
                }
                break;
            case 28:
                co0 co0Var = (co0) this.b;
                View view2 = (View) this.c;
                co0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = co0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                nq0 nq0Var = photoViewer4.F2;
                if (nq0Var != null) {
                    nq0Var.setOutlineProvider(null);
                    break;
                }
                break;
            default:
                kp0 kp0Var = (kp0) this.b;
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.c;
                kp0Var.getClass();
                if (u51Var.U() > 0 && u51Var.S() >= u51Var.U() - 590) {
                    kp0Var.a.f0.invalidate();
                    break;
                }
                break;
        }
    }
}
