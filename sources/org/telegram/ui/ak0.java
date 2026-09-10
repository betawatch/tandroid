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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ak0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        TLRPC.Chat chat;
        String string;
        String formatString;
        org.telegram.ui.Components.pc M;
        vo0 vo0Var;
        vo0 vo0Var2;
        ok okVar;
        String str = "";
        int i12 = 4;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((nj0) this.b).run((TLRPC.User) this.c);
                break;
            case 1:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                hs[] hsVarArr = passcodeActivity.n.f;
                int length = hsVarArr.length;
                while (i13 < length) {
                    hsVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                break;
            case 3:
                ol0 ol0Var = (ol0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity2 = ol0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 4:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 5:
                on0 on0Var = (on0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = on0Var.x;
                int i14 = result.type;
                if (i14 == 2) {
                    if (!(on0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = on0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) on0Var.G.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    on0Var.F = tL_secureRequiredType;
                                    on0Var.P1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(on0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = on0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) on0Var.G.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    on0Var.F = tL_secureRequiredType2;
                                    on0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(on0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = on0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) on0Var.G.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    on0Var.F = tL_secureRequiredType3;
                                    on0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(on0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = on0Var.G.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) on0Var.G.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                on0Var.F = tL_secureRequiredType4;
                                on0Var.P1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    on0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    on0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    on0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    on0Var.Y[7].setText(result.number);
                }
                int i19 = result.gender;
                if (i19 != 0) {
                    if (i19 == 1) {
                        on0Var.w = "male";
                        on0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i19 == 2) {
                        on0Var.w = "female";
                        on0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str2 = result.nationality;
                    on0Var.s = str2;
                    String str3 = (String) on0Var.Y0.get(str2);
                    if (str3 != null) {
                        on0Var.Y[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str4 = result.issuingCountry;
                    on0Var.v = str4;
                    String str5 = (String) on0Var.Y0.get(str4);
                    if (str5 != null) {
                        on0Var.Y[6].setText(str5);
                    }
                }
                int i20 = result.birthDay;
                if (i20 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    on0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i21 = result.expiryDay;
                if (i21 > 0 && (i10 = result.expiryMonth) > 0 && (i11 = result.expiryYear) > 0) {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i21;
                    on0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    on0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 6:
                on0 on0Var2 = (on0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    on0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.d5.x0(on0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.m0(on0Var2.J);
                        on0Var2.R1();
                        if (on0Var2.Z[0].getVisibility() == 0) {
                            on0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(on0Var2.Y[0]);
                        }
                        if (on0Var2.N0 == 1) {
                            on0Var2.B1(true);
                            break;
                        }
                    }
                }
                break;
            case 7:
                on0 on0Var3 = (on0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error != null) {
                    on0Var3.N1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        on0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    } else {
                        org.telegram.ui.Components.d5.x0(on0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    on0Var3.f1 = true;
                    on0Var3.W0(true);
                    on0Var3.finishFragment();
                    break;
                }
            case 8:
                ((jn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 9:
                wo0 wo0Var = (wo0) this.b;
                View view = (View) this.c;
                wo0Var.D0(false);
                view.callOnClick();
                break;
            case 10:
                wo0 wo0Var2 = (wo0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                wo0Var2.H0(true, false);
                if (tL_error2 != null) {
                    if (!tL_error2.text.startsWith("CODE_INVALID")) {
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            wo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                            wo0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.j3 j3Var = wo0Var2.S;
                        try {
                            j3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                        org.telegram.ui.Cells.j3 j3Var2 = wo0Var2.S;
                        j3Var2.a.setText("");
                        j3Var2.b = false;
                        j3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (wo0Var2.getParentActivity() != null) {
                    tn0 tn0Var = wo0Var2.d0;
                    if (tn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(tn0Var);
                        wo0Var2.d0 = null;
                    }
                    wo0Var2.t0();
                    break;
                }
                break;
            case 11:
                wo0.W((wo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 12:
                wo0 wo0Var3 = (wo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = wo0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    wo0Var3.a1 = true;
                    wo0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = wo0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (vo0Var2 = wo0Var3.Z0) != null) {
                        vo0Var2.a(1);
                    }
                    wo0Var3.t0();
                    if (z10 && (vo0Var = wo0Var3.Z0) != null) {
                        vo0Var.a(wo0Var3.f1);
                    }
                    long r02 = wo0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(wo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = wo0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = wo0Var3.q0();
                    int i22 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                        string = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    } else {
                        string = null;
                    }
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, wo0Var3.R0[0], wo0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(U);
                        if (r02 == 0 || string == null || z12) {
                            String str6 = string;
                            M = str6 != null ? a02.M(str6, replaceTags, i22) : a02.Q(i22, 36, replaceTags);
                        } else {
                            M = a02.K(i22, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new xn0(r02, i13));
                        }
                        org.telegram.ui.Components.pc pcVar = M;
                        pcVar.r = false;
                        pcVar.j = 5000;
                        if (messageArr[0] != null) {
                            ou ouVar = new ou(wo0Var3, pcVar, z11, messageArr, 2);
                            org.telegram.ui.Components.tb tbVar = pcVar.e;
                            if (tbVar != null) {
                                tbVar.setOnClickListener(ouVar);
                            }
                        }
                        pcVar.k(z12);
                        break;
                    }
                }
                break;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                n41.T(photoViewer.E, photoViewer.m4, false, (zh.b) this.c, null);
                break;
            case 14:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ft0 ft0Var = (ft0) this.c;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (ft0Var.getWindow() != null) {
                    ft0Var.setFocusable(true);
                    eo eoVar = photoViewer2.l4;
                    if (eoVar != null && (okVar = eoVar.Y) != null) {
                        okVar.m0(false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.messenger.j2 j2Var = (org.telegram.messenger.j2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.T8;
                j2Var.run(bitmap);
                break;
            case 16:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                pg.w0 w0Var = (pg.w0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                w0Var.e.h();
                w0Var.c.postRunnable(new org.telegram.ui.web.d1(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 17:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.T8;
                if (c6Var != null) {
                    ArrayList arrayList = c6Var.h;
                    org.telegram.ui.Components.z5 z5Var = c6Var.n;
                    if (z5Var != null) {
                        arrayList.add(z5Var);
                    }
                    org.telegram.ui.Components.z5 z5Var2 = c6Var.r;
                    if (z5Var2 != null) {
                        arrayList.add(z5Var2);
                    }
                    org.telegram.ui.Components.z5 z5Var3 = c6Var.s;
                    if (z5Var3 != null) {
                        arrayList.add(z5Var3);
                    }
                    c6Var.n = new org.telegram.ui.Components.z5(bitmap2);
                    c6Var.r = null;
                    c6Var.s = null;
                    c6Var.t();
                    break;
                }
                break;
            case 18:
                fs0 fs0Var = (fs0) this.b;
                View view2 = (View) this.c;
                fs0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = fs0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                vu0 vu0Var = photoViewer4.E2;
                if (vu0Var != null) {
                    vu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 19:
                qt0 qt0Var = (qt0) this.b;
                org.telegram.ui.Components.t71 t71Var = (org.telegram.ui.Components.t71) this.c;
                qt0Var.getClass();
                if (t71Var.p() > 0 && t71Var.n() >= t71Var.p() - 590) {
                    qt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 20:
                ut0 ut0Var = (ut0) this.b;
                pg.w0 w0Var2 = (pg.w0) this.c;
                w0Var2.e.h();
                w0Var2.c.postRunnable(new org.telegram.ui.web.d1(i12));
                try {
                    ut0Var.b.e0.removeView(w0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 21:
                zs0 zs0Var = (zs0) this.b;
                bi.n7 n7Var = (bi.n7) this.c;
                PhotoViewer photoViewer5 = zs0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) n7Var.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 22:
                eu0 eu0Var = (eu0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                eu0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 23:
                eu0 eu0Var2 = (eu0) this.b;
                ev0 ev0Var = (ev0) this.c;
                eu0Var2.r.s4 = false;
                if (!ev0Var.s) {
                    ev0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 24:
                ow0 ow0Var = (ow0) this.b;
                String str7 = (String) this.c;
                ow0Var.getClass();
                AndroidUtilities.addToClipboard(str7);
                ow0Var.c(true);
                break;
            case 25:
                ow0 ow0Var2 = (ow0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                ow0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                ow0Var2.c(true);
                break;
            case 26:
                ow0 ow0Var3 = (ow0) this.b;
                SendMessagesHelper.getInstance(ow0Var3.H.currentAccount).deletePollOption(ow0Var3.H, (byte[]) this.c);
                ow0Var3.c(true);
                break;
            case 27:
                PrivacyControlActivity.W((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 28:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.y0();
                break;
        }
    }
}
