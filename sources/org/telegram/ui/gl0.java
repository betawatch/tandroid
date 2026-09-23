package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gl0(int i10, Object obj, Object obj2) {
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
        po0 po0Var;
        po0 po0Var2;
        jk jkVar;
        String str = "";
        int i12 = 10;
        int i13 = 0;
        switch (this.a) {
            case 0:
                hl0 hl0Var = (hl0) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                PasscodeActivity passcodeActivity = hl0Var.b;
                f1Var.setText(LocaleController.getString(passcodeActivity.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                f1Var.setIcon(passcodeActivity.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity.k0();
                if (passcodeActivity.e0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.s, true, 0.1f, false);
                    break;
                }
                break;
            case 1:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 2:
                in0 in0Var = (in0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = in0Var.x;
                int i14 = result.type;
                if (i14 == 2) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = in0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) in0Var.G.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    in0Var.F = tL_secureRequiredType;
                                    in0Var.P1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = in0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    in0Var.F = tL_secureRequiredType2;
                                    in0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(in0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = in0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    in0Var.F = tL_secureRequiredType3;
                                    in0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(in0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = in0Var.G.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) in0Var.G.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                in0Var.F = tL_secureRequiredType4;
                                in0Var.P1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    in0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    in0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    in0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    in0Var.Y[7].setText(result.number);
                }
                int i19 = result.gender;
                if (i19 != 0) {
                    if (i19 == 1) {
                        in0Var.w = "male";
                        in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i19 == 2) {
                        in0Var.w = "female";
                        in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str2 = result.nationality;
                    in0Var.s = str2;
                    String str3 = (String) in0Var.Y0.get(str2);
                    if (str3 != null) {
                        in0Var.Y[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str4 = result.issuingCountry;
                    in0Var.v = str4;
                    String str5 = (String) in0Var.Y0.get(str4);
                    if (str5 != null) {
                        in0Var.Y[6].setText(str5);
                    }
                }
                int i20 = result.birthDay;
                if (i20 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    in0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i21 = result.expiryDay;
                if (i21 > 0 && (i10 = result.expiryMonth) > 0 && (i11 = result.expiryYear) > 0) {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i21;
                    in0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    in0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 3:
                in0 in0Var2 = (in0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    in0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(in0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.m0(in0Var2.J);
                        in0Var2.R1();
                        if (in0Var2.Z[0].getVisibility() == 0) {
                            in0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(in0Var2.Y[0]);
                        }
                        if (in0Var2.N0 == 1) {
                            in0Var2.B1(true);
                            break;
                        }
                    }
                }
                break;
            case 4:
                in0 in0Var3 = (in0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error != null) {
                    in0Var3.N1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        in0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    } else {
                        org.telegram.ui.Components.e5.x0(in0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    in0Var3.f1 = true;
                    in0Var3.W0(true);
                    in0Var3.finishFragment();
                    break;
                }
            case 5:
                ((dn0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 6:
                qo0 qo0Var = (qo0) this.b;
                View view = (View) this.c;
                qo0Var.D0(false);
                view.callOnClick();
                break;
            case 7:
                qo0 qo0Var2 = (qo0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                qo0Var2.H0(true, false);
                if (tL_error2 != null) {
                    if (!tL_error2.text.startsWith("CODE_INVALID")) {
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            qo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                            qo0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.j3 j3Var = qo0Var2.S;
                        try {
                            j3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                        org.telegram.ui.Cells.j3 j3Var2 = qo0Var2.S;
                        j3Var2.a.setText("");
                        j3Var2.b = false;
                        j3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (qo0Var2.getParentActivity() != null) {
                    nn0 nn0Var = qo0Var2.d0;
                    if (nn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(nn0Var);
                        qo0Var2.d0 = null;
                    }
                    qo0Var2.t0();
                    break;
                }
                break;
            case 8:
                qo0.W((qo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 9:
                qo0 qo0Var3 = (qo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = qo0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    qo0Var3.a1 = true;
                    qo0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = qo0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (po0Var2 = qo0Var3.Z0) != null) {
                        po0Var2.a(1);
                    }
                    qo0Var3.t0();
                    if (z10 && (po0Var = qo0Var3.Z0) != null) {
                        po0Var.a(qo0Var3.f1);
                    }
                    long r02 = qo0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(qo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = qo0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = qo0Var3.q0();
                    int i22 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                        string = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    } else {
                        string = null;
                    }
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, qo0Var3.R0[0], qo0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U);
                        if (r02 == 0 || string == null || z12) {
                            String str6 = string;
                            M = str6 != null ? a02.M(str6, replaceTags, i22) : a02.Q(i22, 36, replaceTags);
                        } else {
                            M = a02.K(i22, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new rn0(r02, i13));
                        }
                        org.telegram.ui.Components.qc qcVar = M;
                        qcVar.r = false;
                        qcVar.j = 5000;
                        if (messageArr[0] != null) {
                            ai.l5 l5Var = new ai.l5(qo0Var3, qcVar, z11, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(l5Var);
                            }
                        }
                        qcVar.k(z12);
                        break;
                    }
                }
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                a41.T(photoViewer.E, photoViewer.m4, false, (ai.d) this.c, null);
                break;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                zs0 zs0Var = (zs0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (zs0Var.getWindow() != null) {
                    zs0Var.setFocusable(true);
                    xn xnVar = photoViewer2.l4;
                    if (xnVar != null && (jkVar = xnVar.Y) != null) {
                        jkVar.n0(false);
                        break;
                    }
                }
                break;
            case 12:
                ai.l lVar = (ai.l) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                lVar.run(bitmap);
                break;
            case 13:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                qg.z0 z0Var = (qg.z0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                z0Var.e.h();
                z0Var.c.postRunnable(new g91(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 14:
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
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
            case 15:
                as0 as0Var = (as0) this.b;
                View view2 = (View) this.c;
                as0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = as0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                nu0 nu0Var = photoViewer4.E2;
                if (nu0Var != null) {
                    nu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 16:
                kt0 kt0Var = (kt0) this.b;
                org.telegram.ui.Components.f71 f71Var = (org.telegram.ui.Components.f71) this.c;
                kt0Var.getClass();
                if (f71Var.p() > 0 && f71Var.n() >= f71Var.p() - 590) {
                    kt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 17:
                ot0 ot0Var = (ot0) this.b;
                qg.z0 z0Var2 = (qg.z0) this.c;
                z0Var2.e.h();
                z0Var2.c.postRunnable(new g91(i12));
                try {
                    ot0Var.b.e0.removeView(z0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 18:
                ts0 ts0Var = (ts0) this.b;
                ci.m6 m6Var = (ci.m6) this.c;
                PhotoViewer photoViewer5 = ts0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) m6Var.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 19:
                yt0 yt0Var = (yt0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                yt0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 20:
                yt0 yt0Var2 = (yt0) this.b;
                wu0 wu0Var = (wu0) this.c;
                yt0Var2.r.s4 = false;
                if (!wu0Var.s) {
                    wu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 21:
                fw0 fw0Var = (fw0) this.b;
                String str7 = (String) this.c;
                fw0Var.getClass();
                AndroidUtilities.addToClipboard(str7);
                fw0Var.c(true);
                break;
            case 22:
                fw0 fw0Var2 = (fw0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                fw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                fw0Var2.c(true);
                break;
            case 23:
                fw0 fw0Var3 = (fw0) this.b;
                SendMessagesHelper.getInstance(fw0Var3.H.currentAccount).deletePollOption(fw0Var3.H, (byte[]) this.c);
                fw0Var3.c(true);
                break;
            case 24:
                PrivacyControlActivity.W((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 25:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    break;
                }
                break;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.y0();
                break;
            case 27:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) this.c;
                boolean z13 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z13;
                x8Var.setChecked(z13);
                break;
            case 28:
                ((zx0) this.b).getMessagesController().unblockPeer(((Long) this.c).longValue());
                break;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr = (Object[]) this.c;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i23 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i23);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i23, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new xn(bundle), true);
                break;
        }
    }
}
