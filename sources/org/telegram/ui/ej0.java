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
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ej0(int i10, Object obj, Object obj2) {
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
        org.telegram.ui.Components.qc M;
        wo0 wo0Var;
        wo0 wo0Var2;
        mk mkVar;
        String str = "";
        int i12 = 12;
        int i13 = 0;
        switch (this.a) {
            case 0:
                lj0 lj0Var = (lj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (lj0Var.getParentActivity() != null) {
                    Toast.makeText(lj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 1:
                ek0 ek0Var = (ek0) this.b;
                String str2 = (String) this.c;
                ek0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ek0Var.getContext().startActivity(intent);
                break;
            case 2:
                ek0 ek0Var2 = (ek0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ek0Var2.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 3:
                ((oj0) this.b).run((TLRPC.User) this.c);
                break;
            case 4:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 5:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                gs[] gsVarArr = passcodeActivity.n.f;
                int length = gsVarArr.length;
                while (i13 < length) {
                    gsVarArr[i13].l(0.0f);
                    i13++;
                }
                runnable.run();
                break;
            case 6:
                pl0 pl0Var = (pl0) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                PasscodeActivity passcodeActivity2 = pl0Var.b;
                f1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                f1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 7:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 8:
                pn0 pn0Var = (pn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
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
                    String str3 = result.nationality;
                    pn0Var.s = str3;
                    String str4 = (String) pn0Var.Y0.get(str3);
                    if (str4 != null) {
                        pn0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    pn0Var.v = str5;
                    String str6 = (String) pn0Var.Y0.get(str5);
                    if (str6 != null) {
                        pn0Var.Y[6].setText(str6);
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
            case 9:
                pn0 pn0Var2 = (pn0) this.b;
                TLObject tLObject = (TLObject) this.c;
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
            case 10:
                pn0 pn0Var3 = (pn0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
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
            case 11:
                ((kn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 12:
                xo0 xo0Var = (xo0) this.b;
                View view = (View) this.c;
                xo0Var.D0(false);
                view.callOnClick();
                break;
            case 13:
                xo0 xo0Var2 = (xo0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
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
                        org.telegram.ui.Cells.j3 j3Var = xo0Var2.S;
                        try {
                            j3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                        org.telegram.ui.Cells.j3 j3Var2 = xo0Var2.S;
                        j3Var2.a.setText("");
                        j3Var2.b = false;
                        j3Var2.setWillNotDraw(true);
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
            case 14:
                xo0.W((xo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 15:
                xo0 xo0Var3 = (xo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
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
                        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(U2);
                        if (r02 == 0 || string == null || z12) {
                            String str7 = string;
                            M = str7 != null ? a02.M(str7, replaceTags, i22) : a02.Q(i22, 36, replaceTags);
                        } else {
                            M = a02.K(i22, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new yn0(r02, i13));
                        }
                        org.telegram.ui.Components.qc qcVar = M;
                        qcVar.r = false;
                        qcVar.j = 5000;
                        if (messageArr[0] != null) {
                            bi.w4 w4Var = new bi.w4(xo0Var3, qcVar, z11, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(w4Var);
                            }
                        }
                        qcVar.k(z12);
                        break;
                    }
                }
                break;
            case 16:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                k41.T(photoViewer.E, photoViewer.m4, false, (bi.b) this.c, null);
                break;
            case 17:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ft0 ft0Var = (ft0) this.c;
                Drawable[] drawableArr = PhotoViewer.T8;
                if (ft0Var.getWindow() != null) {
                    ft0Var.setFocusable(true);
                    co coVar = photoViewer2.l4;
                    if (coVar != null && (mkVar = coVar.Y) != null) {
                        mkVar.m0(false);
                        break;
                    }
                }
                break;
            case 18:
                org.telegram.messenger.f2 f2Var = (org.telegram.messenger.f2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.T8;
                f2Var.run(bitmap);
                break;
            case 19:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                rg.y0 y0Var = (rg.y0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.T8;
                y0Var.e.h();
                y0Var.c.postRunnable(new q31(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 20:
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.T8;
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
            case 21:
                gs0 gs0Var = (gs0) this.b;
                View view2 = (View) this.c;
                gs0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = gs0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                tu0 tu0Var = photoViewer4.E2;
                if (tu0Var != null) {
                    tu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 22:
                qt0 qt0Var = (qt0) this.b;
                org.telegram.ui.Components.g71 g71Var = (org.telegram.ui.Components.g71) this.c;
                qt0Var.getClass();
                if (g71Var.p() > 0 && g71Var.n() >= g71Var.p() - 590) {
                    qt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 23:
                ut0 ut0Var = (ut0) this.b;
                rg.y0 y0Var2 = (rg.y0) this.c;
                y0Var2.e.h();
                y0Var2.c.postRunnable(new q31(i12));
                try {
                    ut0Var.b.e0.removeView(y0Var2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 24:
                zs0 zs0Var = (zs0) this.b;
                ah.w wVar = (ah.w) this.c;
                PhotoViewer photoViewer5 = zs0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) wVar.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 25:
                eu0 eu0Var = (eu0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                eu0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 26:
                eu0 eu0Var2 = (eu0) this.b;
                cv0 cv0Var = (cv0) this.c;
                eu0Var2.r.s4 = false;
                if (!cv0Var.s) {
                    cv0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 27:
                lw0 lw0Var = (lw0) this.b;
                String str8 = (String) this.c;
                lw0Var.getClass();
                AndroidUtilities.addToClipboard(str8);
                lw0Var.c(true);
                break;
            case 28:
                lw0 lw0Var2 = (lw0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                lw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                lw0Var2.c(true);
                break;
            default:
                lw0 lw0Var3 = (lw0) this.b;
                SendMessagesHelper.getInstance(lw0Var3.H.currentAccount).deletePollOption(lw0Var3.H, (byte[]) this.c);
                lw0Var3.c(true);
                break;
        }
    }
}
