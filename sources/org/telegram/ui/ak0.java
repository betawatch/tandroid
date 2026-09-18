package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ak0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        TLRPC.Chat chat;
        String string;
        String formatString;
        org.telegram.ui.Components.qc M;
        wo0 wo0Var;
        wo0 wo0Var2;
        lk lkVar;
        String str = "";
        int i12 = 10;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ek0 ek0Var = (ek0) this.c;
                TLRPC.User user = (TLRPC.User) this.b;
                ek0Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 1:
                ((nj0) this.c).run((TLRPC.User) this.b);
                break;
            case 2:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.c, (ArrayList) this.b);
                break;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.c;
                Runnable runnable = (Runnable) this.b;
                gs[] gsVarArr = passcodeActivity.n.f;
                int length = gsVarArr.length;
                while (i13 < length) {
                    gsVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                break;
            case 4:
                ql0 ql0Var = (ql0) this.c;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.b;
                PasscodeActivity passcodeActivity2 = ql0Var.b;
                f1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                f1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 5:
                ((PasskeysActivity) this.c).Y((TL_account.Passkey) this.b);
                break;
            case 6:
                pn0 pn0Var = (pn0) this.c;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.b;
                int[] iArr = pn0Var.x;
                int i14 = result.type;
                if (i14 == 2) {
                    if (!(pn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = pn0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) pn0Var.G.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    pn0Var.F = tL_secureRequiredType;
                                    pn0Var.P1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(pn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = pn0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) pn0Var.G.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    pn0Var.F = tL_secureRequiredType2;
                                    pn0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(pn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = pn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) pn0Var.G.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    pn0Var.F = tL_secureRequiredType3;
                                    pn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(pn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = pn0Var.G.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) pn0Var.G.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                pn0Var.F = tL_secureRequiredType4;
                                pn0Var.P1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    pn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    pn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    pn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    pn0Var.Y[7].setText(result.number);
                }
                int i19 = result.gender;
                if (i19 != 0) {
                    if (i19 == 1) {
                        pn0Var.w = "male";
                        pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i19 == 2) {
                        pn0Var.w = "female";
                        pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str2 = result.nationality;
                    pn0Var.s = str2;
                    String str3 = (String) pn0Var.Y0.get(str2);
                    if (str3 != null) {
                        pn0Var.Y[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str4 = result.issuingCountry;
                    pn0Var.v = str4;
                    String str5 = (String) pn0Var.Y0.get(str4);
                    if (str5 != null) {
                        pn0Var.Y[6].setText(str5);
                    }
                }
                int i20 = result.birthDay;
                if (i20 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    pn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i21 = result.expiryDay;
                if (i21 > 0 && (i10 = result.expiryMonth) > 0 && (i11 = result.expiryYear) > 0) {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i21;
                    pn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    pn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 7:
                pn0 pn0Var2 = (pn0) this.c;
                TLObject tLObject = (TLObject) this.b;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    pn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(pn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.m0(pn0Var2.J);
                        pn0Var2.R1();
                        if (pn0Var2.Z[0].getVisibility() == 0) {
                            pn0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(pn0Var2.Y[0]);
                        }
                        if (pn0Var2.N0 == 1) {
                            pn0Var2.B1(true);
                            break;
                        }
                    }
                }
                break;
            case 8:
                pn0 pn0Var3 = (pn0) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (tL_error != null) {
                    pn0Var3.N1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        pn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    } else {
                        org.telegram.ui.Components.e5.x0(pn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    pn0Var3.f1 = true;
                    pn0Var3.W0(true);
                    pn0Var3.finishFragment();
                    break;
                }
            case 9:
                ((kn0) this.c).a.K = ((TLRPC.TL_error) this.b).text;
                break;
            case 10:
                xo0 xo0Var = (xo0) this.c;
                View view = (View) this.b;
                xo0Var.D0(false);
                view.callOnClick();
                break;
            case 11:
                xo0 xo0Var2 = (xo0) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                xo0Var2.H0(true, false);
                if (tL_error2 != null) {
                    if (!tL_error2.text.startsWith("CODE_INVALID")) {
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            xo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                            xo0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.k3 k3Var = xo0Var2.S;
                        try {
                            k3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                        org.telegram.ui.Cells.k3 k3Var2 = xo0Var2.S;
                        k3Var2.a.setText("");
                        k3Var2.b = false;
                        k3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (xo0Var2.getParentActivity() != null) {
                    un0 un0Var = xo0Var2.d0;
                    if (un0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(un0Var);
                        xo0Var2.d0 = null;
                    }
                    xo0Var2.t0();
                    break;
                }
                break;
            case 12:
                xo0.W((xo0) this.c, (TLRPC.TL_payments_validatedRequestedInfo) this.b);
                break;
            case 13:
                xo0 xo0Var3 = (xo0) this.c;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.b;
                Context parentActivity = xo0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    xo0Var3.a1 = true;
                    xo0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = xo0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (wo0Var2 = xo0Var3.Z0) != null) {
                        wo0Var2.a(1);
                    }
                    xo0Var3.t0();
                    if (z10 && (wo0Var = xo0Var3.Z0) != null) {
                        wo0Var.a(xo0Var3.f1);
                    }
                    long r02 = xo0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(xo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = xo0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = xo0Var3.q0();
                    int i22 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                        string = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    } else {
                        string = null;
                    }
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, xo0Var3.R0[0], xo0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U2);
                        if (r02 == 0 || string == null || z12) {
                            String str6 = string;
                            M = str6 != null ? a02.M(str6, replaceTags, i22) : a02.Q(i22, 36, replaceTags);
                        } else {
                            M = a02.K(i22, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new yn0(r02, i13));
                        }
                        org.telegram.ui.Components.qc qcVar = M;
                        qcVar.r = false;
                        qcVar.j = 5000;
                        if (messageArr[0] != null) {
                            ai.m5 m5Var = new ai.m5(xo0Var3, qcVar, z11, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(m5Var);
                            }
                        }
                        qcVar.k(z12);
                        break;
                    }
                }
                break;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                h41.T(photoViewer.E, photoViewer.m4, false, (ai.d) this.b, null);
                break;
            case 15:
                PhotoViewer photoViewer2 = (PhotoViewer) this.c;
                gt0 gt0Var = (gt0) this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (gt0Var.getWindow() != null) {
                    gt0Var.setFocusable(true);
                    zn znVar = photoViewer2.l4;
                    if (znVar != null && (lkVar = znVar.Y) != null) {
                        lkVar.m0(false);
                        break;
                    }
                }
                break;
            case 16:
                org.telegram.messenger.f2 f2Var = (org.telegram.messenger.f2) this.c;
                Bitmap bitmap = (Bitmap) this.b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                f2Var.run(bitmap);
                break;
            case 17:
                PhotoViewer photoViewer3 = (PhotoViewer) this.c;
                qg.w0 w0Var = (qg.w0) this.b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.c.postRunnable(new o91(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 18:
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.c;
                Bitmap bitmap2 = (Bitmap) this.b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (d6Var != null) {
                    ArrayList arrayList = d6Var.h;
                    org.telegram.ui.Components.a6 a6Var = d6Var.n;
                    if (a6Var != null) {
                        arrayList.add(a6Var);
                    }
                    org.telegram.ui.Components.a6 a6Var2 = d6Var.r;
                    if (a6Var2 != null) {
                        arrayList.add(a6Var2);
                    }
                    org.telegram.ui.Components.a6 a6Var3 = d6Var.s;
                    if (a6Var3 != null) {
                        arrayList.add(a6Var3);
                    }
                    d6Var.n = new org.telegram.ui.Components.a6(bitmap2);
                    d6Var.r = null;
                    d6Var.s = null;
                    d6Var.t();
                    break;
                }
                break;
            case 19:
                hs0 hs0Var = (hs0) this.c;
                View view2 = (View) this.b;
                hs0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = hs0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                uu0 uu0Var = photoViewer4.E2;
                if (uu0Var != null) {
                    uu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 20:
                rt0 rt0Var = (rt0) this.c;
                org.telegram.ui.Components.u71 u71Var = (org.telegram.ui.Components.u71) this.b;
                rt0Var.getClass();
                if (u71Var.p() > 0 && u71Var.n() >= u71Var.p() - 590) {
                    rt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 21:
                vt0 vt0Var = (vt0) this.c;
                qg.w0 w0Var2 = (qg.w0) this.b;
                w0Var2.e.h();
                w0Var2.c.postRunnable(new o91(i12));
                try {
                    vt0Var.b.e0.removeView(w0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 22:
                at0 at0Var = (at0) this.c;
                ci.n6 n6Var = (ci.n6) this.b;
                PhotoViewer photoViewer5 = at0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) n6Var.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 23:
                fu0 fu0Var = (fu0) this.c;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                fu0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 24:
                fu0 fu0Var2 = (fu0) this.c;
                dv0 dv0Var = (dv0) this.b;
                fu0Var2.r.s4 = false;
                if (!dv0Var.s) {
                    dv0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 25:
                mw0 mw0Var = (mw0) this.c;
                String str7 = (String) this.b;
                mw0Var.getClass();
                AndroidUtilities.addToClipboard(str7);
                mw0Var.c(true);
                break;
            case 26:
                mw0 mw0Var2 = (mw0) this.c;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.b;
                mw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                mw0Var2.c(true);
                break;
            case 27:
                mw0 mw0Var3 = (mw0) this.c;
                SendMessagesHelper.getInstance(mw0Var3.H.currentAccount).deletePollOption(mw0Var3.H, (byte[]) this.b);
                mw0Var3.c(true);
                break;
            case 28:
                PrivacyControlActivity.W((PrivacyControlActivity) this.c, (TLObject) this.b);
                break;
            default:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.c;
                boolean[] zArr = (boolean[]) this.b;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
        }
    }
}
