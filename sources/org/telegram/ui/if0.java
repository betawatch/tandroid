package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class if0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ if0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        char c10;
        String G;
        int i12;
        String a02;
        org.telegram.ui.ActionBar.k2 T;
        org.telegram.ui.Components.wb I;
        pm0 pm0Var;
        pm0 pm0Var2;
        mk mkVar;
        String str = "";
        switch (this.a) {
            case 0:
                jf0.Z((jf0) this.b, (org.telegram.ui.ActionBar.x1) this.c);
                break;
            case 1:
                ig0 ig0Var = (ig0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                ig0Var.c0 = false;
                if (tL_error == null) {
                    zf0 l02 = ig0Var.l0();
                    ig0Var.j0.clear();
                    ig0Var.n0(l02);
                    break;
                }
                break;
            case 2:
                yf0 yf0Var = (yf0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ig0 ig0Var2 = yf0Var.a;
                zf0 l03 = ig0Var2.l0();
                ig0Var2.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = ig0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ig0Var2.getMessagesStorage().w1(ig0Var2.d.invitesCount, ig0Var2.n);
                }
                ig0Var2.n0(l03);
                break;
            case 3:
                qh0 qh0Var = (qh0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (qh0Var.getParentActivity() != null) {
                    Toast.makeText(qh0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 4:
                ei0 ei0Var = (ei0) this.b;
                String str2 = (String) this.c;
                ei0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", org.telegram.messenger.dd.a0(null, null, 2131749126, "https://telegram.org/dl"));
                ei0Var.getContext().startActivity(intent);
                break;
            case 5:
                ei0 ei0Var2 = (ei0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ei0Var2.dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(ProfileActivity.A4(user.id));
                    break;
                }
                break;
            case 6:
                ((org.telegram.ui.Components.vg) this.b).a((TLRPC.User) this.c);
                break;
            case 7:
                NotificationsCustomSettingsActivity.b0((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 8:
                org.telegram.ui.ActionBar.z2[] z2VarArr = (org.telegram.ui.ActionBar.z2[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                z2VarArr[0] = null;
                hj0.a = null;
                zArr[0] = true;
                break;
            case 9:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (bs bsVar : passcodeActivity.n.f) {
                    bsVar.C(0.0f);
                }
                runnable.run();
                break;
            case 10:
                nj0 nj0Var = (nj0) this.b;
                org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) this.c;
                PasscodeActivity passcodeActivity2 = (PasscodeActivity) nj0Var.c;
                b1Var.setText(org.telegram.messenger.dd.L0(passcodeActivity2.D == 0 ? 2131747669 : 2131747670, null));
                b1Var.setIcon(passcodeActivity2.D == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.y0();
                if (passcodeActivity2.s0()) {
                    passcodeActivity2.h.setInputType(524417);
                    org.telegram.messenger.i0.Y3(passcodeActivity2.s, true, 0.1f, true, false);
                    break;
                }
                break;
            case 11:
                ((PasskeysActivity) this.b).d0((TL_account.Passkey) this.c);
                break;
            case 12:
                jl0 jl0Var = (jl0) this.b;
                org.telegram.messenger.js jsVar = (org.telegram.messenger.js) this.c;
                int[] iArr = jl0Var.y;
                int i13 = jsVar.a;
                if (i13 == 2) {
                    if (!(jl0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = jl0Var.G.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) jl0Var.G.get(i14);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    jl0Var.F = tL_secureRequiredType;
                                    jl0Var.U1();
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                } else if (i13 == 1) {
                    if (!(jl0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = jl0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) jl0Var.G.get(i15);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    jl0Var.F = tL_secureRequiredType2;
                                    jl0Var.U1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i13 == 3) {
                    if (!(jl0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = jl0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) jl0Var.G.get(i16);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    jl0Var.F = tL_secureRequiredType3;
                                    jl0Var.U1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i13 == 4 && !(jl0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = jl0Var.G.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) jl0Var.G.get(i17);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                jl0Var.F = tL_secureRequiredType4;
                                jl0Var.U1();
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(jsVar.b)) {
                    jl0Var.Y[0].setText(jsVar.b);
                }
                if (!TextUtils.isEmpty(jsVar.d)) {
                    jl0Var.Y[1].setText(jsVar.d);
                }
                if (!TextUtils.isEmpty(jsVar.c)) {
                    jl0Var.Y[2].setText(jsVar.c);
                }
                if (!TextUtils.isEmpty(jsVar.e)) {
                    jl0Var.Y[7].setText(jsVar.e);
                }
                int i18 = jsVar.n;
                if (i18 != 0) {
                    if (i18 == 1) {
                        jl0Var.x = "male";
                        jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747524, null));
                    } else if (i18 == 2) {
                        jl0Var.x = "female";
                        jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747585, null));
                    }
                }
                if (!TextUtils.isEmpty(jsVar.m)) {
                    String str3 = jsVar.m;
                    jl0Var.s = str3;
                    String str4 = (String) jl0Var.Y0.get(str3);
                    if (str4 != null) {
                        jl0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(jsVar.l)) {
                    String str5 = jsVar.l;
                    jl0Var.w = str5;
                    String str6 = (String) jl0Var.Y0.get(str5);
                    if (str6 != null) {
                        jl0Var.Y[6].setText(str6);
                    }
                }
                int i19 = jsVar.k;
                if (i19 > 0 && jsVar.j > 0 && jsVar.i > 0) {
                    jl0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i19), Integer.valueOf(jsVar.j), Integer.valueOf(jsVar.i)));
                }
                int i20 = jsVar.h;
                if (i20 <= 0 || (i10 = jsVar.g) <= 0 || (i11 = jsVar.f) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    jl0Var.Y[8].setText(org.telegram.messenger.dd.L0(2131747510, null));
                    break;
                } else {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i20;
                    jl0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(jsVar.g), Integer.valueOf(jsVar.f)));
                    break;
                }
                break;
            case 13:
                jl0 jl0Var2 = (jl0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    jl0Var2.J = password;
                    if (TwoStepVerificationActivity.n0(password, false)) {
                        TwoStepVerificationActivity.r0(jl0Var2.J);
                        jl0Var2.W1();
                        if (jl0Var2.Z[0].getVisibility() == 0) {
                            jl0Var2.Y[0].requestFocus();
                            org.telegram.messenger.i0.J3(jl0Var2.Y[0]);
                        }
                        if (jl0Var2.N0 == 1) {
                            jl0Var2.F1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.s4.w0(jl0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
                        break;
                    }
                }
                break;
            case 14:
                jl0 jl0Var3 = (jl0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tL_error2 == null) {
                    jl0Var3.f1 = true;
                    jl0Var3.a1(true);
                    jl0Var3.finishFragment();
                    break;
                } else {
                    jl0Var3.R1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.s4.w0(jl0Var3.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, null), true);
                        break;
                    } else {
                        jl0Var3.Q1(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error2.text);
                        break;
                    }
                }
            case 15:
                ((el0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 16:
                qm0 qm0Var = (qm0) this.b;
                View view = (View) this.c;
                qm0Var.J0(false);
                view.callOnClick();
                break;
            case 17:
                qm0 qm0Var2 = (qm0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                qm0Var2.N0(true, false);
                if (tL_error3 != null) {
                    if (tL_error3.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.n3 n3Var = qm0Var2.S;
                        try {
                            n3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.i0.F3(2.5f, n3Var, null);
                        org.telegram.ui.Cells.n3 n3Var2 = qm0Var2.S;
                        n3Var2.a.setText("");
                        n3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error3.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String L0 = org.telegram.messenger.dd.L0(R.string.AppName, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        qm0Var2.L0(L0, org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, objArr));
                        break;
                    } else {
                        qm0Var2.L0(org.telegram.messenger.dd.L0(R.string.AppName, null), tL_error3.text);
                        break;
                    }
                } else if (qm0Var2.getParentActivity() != null) {
                    pl0 pl0Var = qm0Var2.d0;
                    if (pl0Var != null) {
                        org.telegram.messenger.i0.r(pl0Var);
                        qm0Var2.d0 = null;
                    }
                    qm0Var2.z0();
                    break;
                }
                break;
            case 18:
                qm0.b0((qm0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 19:
                qm0 qm0Var3 = (qm0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = qm0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = org.telegram.messenger.w0.b;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.I1;
                }
                if (parentActivity != null) {
                    qm0Var3.a1 = true;
                    qm0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = qm0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (pm0Var2 = qm0Var3.Z0) != null) {
                        pm0Var2.e(1);
                    }
                    qm0Var3.z0();
                    if (z10 && (pm0Var = qm0Var3.Z0) != null) {
                        pm0Var.e(qm0Var3.f1);
                    }
                    long w02 = qm0Var3.w0();
                    if (w02 > 0) {
                        str = org.telegram.messenger.i20.k(qm0Var3.getMessagesController().Z1(Long.valueOf(w02)));
                    } else if (w02 < 0) {
                        i12 = 0;
                        TLRPC.Chat L02 = qm0Var3.getMessagesController().L0(Long.valueOf(-w02));
                        if (L02 != null) {
                            str = L02.title;
                        }
                        long v02 = qm0Var3.v0();
                        int i21 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String L03 = z10 ? null : org.telegram.messenger.dd.L0(z12 ? 2131745110 : z11 ? 2131745118 : 2131745177, null);
                        if (z10) {
                            String str7 = qm0Var3.R0[i12];
                            String str8 = qm0Var3.q0;
                            Object[] objArr2 = new Object[2];
                            objArr2[i12] = str7;
                            objArr2[1] = str8;
                            a02 = org.telegram.messenger.dd.a0(null, null, 2131747417, objArr2);
                        } else if (z12) {
                            a02 = org.telegram.messenger.dd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                        } else {
                            String str9 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[i12] = str;
                            a02 = org.telegram.messenger.dd.K(str9, (int) v02, ',', objArr3);
                        }
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(a02);
                        T = LaunchActivity.T();
                        if (T == null) {
                            org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(T);
                            if (w02 == 0 || L03 == null || z12) {
                                String str10 = L03;
                                I = str10 != null ? a03.I(i21, str10, W2) : a03.Q(i21, 36, W2);
                            } else {
                                I = a03.L(i21, L03, W2, org.telegram.messenger.dd.L0(2131743578, null), new tl0(w02, i12));
                            }
                            org.telegram.ui.Components.wb wbVar = I;
                            wbVar.r = false;
                            wbVar.j = 5000;
                            if (messageArr[0] != null) {
                                kg.z0 z0Var = new kg.z0(qm0Var3, wbVar, z11, messageArr, 3);
                                org.telegram.ui.Components.bb bbVar = wbVar.e;
                                if (bbVar != null) {
                                    bbVar.setOnClickListener(z0Var);
                                }
                            }
                            wbVar.k(z12);
                            break;
                        }
                    }
                    i12 = 0;
                    long v022 = qm0Var3.v0();
                    int i212 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                    }
                    if (z10) {
                    }
                    SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(a02);
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                g01.d1(photoViewer.E, photoViewer.m4, false, (th.b) this.c, null);
                break;
            case 21:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                mq0 mq0Var = (mq0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (mq0Var.getWindow() != null) {
                    mq0Var.A0(true);
                    un unVar = photoViewer2.l4;
                    if (unVar != null && (mkVar = unVar.Z) != null) {
                        mkVar.i0(false);
                        break;
                    }
                }
                break;
            case 22:
                ko koVar = (ko) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                koVar.a(bitmap);
                break;
            case 23:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                jg.a1 a1Var = (jg.a1) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                a1Var.e.h();
                a1Var.c.postRunnable(new ag.f3(5));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 24:
                org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (s5Var != null) {
                    ArrayList arrayList = s5Var.h;
                    org.telegram.ui.Components.p5 p5Var = s5Var.n;
                    if (p5Var != null) {
                        arrayList.add(p5Var);
                    }
                    org.telegram.ui.Components.p5 p5Var2 = s5Var.r;
                    if (p5Var2 != null) {
                        arrayList.add(p5Var2);
                    }
                    org.telegram.ui.Components.p5 p5Var3 = s5Var.s;
                    if (p5Var3 != null) {
                        arrayList.add(p5Var3);
                    }
                    s5Var.n = new org.telegram.ui.Components.p5(bitmap2);
                    s5Var.r = null;
                    s5Var.s = null;
                    s5Var.t();
                    break;
                }
                break;
            case 25:
                mp0 mp0Var = (mp0) this.b;
                View view2 = (View) this.c;
                mp0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = mp0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                yr0 yr0Var = photoViewer4.E2;
                if (yr0Var != null) {
                    yr0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 26:
                uq0 uq0Var = (uq0) this.b;
                org.telegram.ui.Components.v61 v61Var = (org.telegram.ui.Components.v61) this.c;
                uq0Var.getClass();
                if (v61Var.U() > 0 && v61Var.S() >= v61Var.U() - 590) {
                    uq0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 27:
                xq0 xq0Var = (xq0) this.b;
                jg.a1 a1Var2 = (jg.a1) this.c;
                a1Var2.e.h();
                a1Var2.c.postRunnable(new ag.f3(5));
                try {
                    xq0Var.b.e0.removeView(a1Var2);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 28:
                gq0 gq0Var = (gq0) this.b;
                fg.i iVar = (fg.i) this.c;
                PhotoViewer photoViewer5 = gq0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) iVar.b).v0(photoViewer5.C3);
                    break;
                }
                break;
            default:
                ir0 ir0Var = (ir0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                ir0Var.r.l7.d();
                animatorSet.start();
                break;
        }
    }
}
