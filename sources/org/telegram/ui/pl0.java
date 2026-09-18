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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pl0(int i10, Object obj, Object obj2) {
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
        org.telegram.ui.Components.oc M;
        xo0 xo0Var;
        xo0 xo0Var2;
        nk nkVar;
        String str = "";
        int i12 = 10;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ql0 ql0Var = (ql0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity = ql0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
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
                qn0 qn0Var = (qn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = qn0Var.x;
                int i14 = result.type;
                if (i14 == 2) {
                    if (!(qn0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = qn0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) qn0Var.G.get(i15);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    qn0Var.F = tL_secureRequiredType;
                                    qn0Var.P1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i14 == 1) {
                    if (!(qn0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = qn0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) qn0Var.G.get(i16);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    qn0Var.F = tL_secureRequiredType2;
                                    qn0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i14 == 3) {
                    if (!(qn0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = qn0Var.G.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) qn0Var.G.get(i17);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    qn0Var.F = tL_secureRequiredType3;
                                    qn0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i14 == 4 && !(qn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = qn0Var.G.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) qn0Var.G.get(i18);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                qn0Var.F = tL_secureRequiredType4;
                                qn0Var.P1();
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    qn0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    qn0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    qn0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    qn0Var.Y[7].setText(result.number);
                }
                int i19 = result.gender;
                if (i19 != 0) {
                    if (i19 == 1) {
                        qn0Var.w = "male";
                        qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i19 == 2) {
                        qn0Var.w = "female";
                        qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str2 = result.nationality;
                    qn0Var.s = str2;
                    String str3 = (String) qn0Var.Y0.get(str2);
                    if (str3 != null) {
                        qn0Var.Y[5].setText(str3);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str4 = result.issuingCountry;
                    qn0Var.v = str4;
                    String str5 = (String) qn0Var.Y0.get(str4);
                    if (str5 != null) {
                        qn0Var.Y[6].setText(str5);
                    }
                }
                int i20 = result.birthDay;
                if (i20 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    qn0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i21 = result.expiryDay;
                if (i21 > 0 && (i10 = result.expiryMonth) > 0 && (i11 = result.expiryYear) > 0) {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i21;
                    qn0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                } else {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    qn0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                }
                break;
            case 3:
                qn0 qn0Var2 = (qn0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    qn0Var2.J = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.c5.x0(qn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TwoStepVerificationActivity.m0(qn0Var2.J);
                        qn0Var2.R1();
                        if (qn0Var2.Z[0].getVisibility() == 0) {
                            qn0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(qn0Var2.Y[0]);
                        }
                        if (qn0Var2.N0 == 1) {
                            qn0Var2.B1(true);
                            break;
                        }
                    }
                }
                break;
            case 4:
                qn0 qn0Var3 = (qn0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error != null) {
                    qn0Var3.N1(false, false);
                    if (!"APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        qn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    } else {
                        org.telegram.ui.Components.c5.x0(qn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                } else {
                    qn0Var3.f1 = true;
                    qn0Var3.W0(true);
                    qn0Var3.finishFragment();
                    break;
                }
            case 5:
                ((ln0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 6:
                yo0 yo0Var = (yo0) this.b;
                View view = (View) this.c;
                yo0Var.D0(false);
                view.callOnClick();
                break;
            case 7:
                yo0 yo0Var2 = (yo0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                yo0Var2.H0(true, false);
                if (tL_error2 != null) {
                    if (!tL_error2.text.startsWith("CODE_INVALID")) {
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            yo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                            break;
                        } else {
                            int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                            yo0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                            break;
                        }
                    } else {
                        org.telegram.ui.Cells.j3 j3Var = yo0Var2.S;
                        try {
                            j3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                        org.telegram.ui.Cells.j3 j3Var2 = yo0Var2.S;
                        j3Var2.a.setText("");
                        j3Var2.b = false;
                        j3Var2.setWillNotDraw(true);
                        break;
                    }
                } else if (yo0Var2.getParentActivity() != null) {
                    vn0 vn0Var = yo0Var2.d0;
                    if (vn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(vn0Var);
                        yo0Var2.d0 = null;
                    }
                    yo0Var2.t0();
                    break;
                }
                break;
            case 8:
                yo0.W((yo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 9:
                yo0 yo0Var3 = (yo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = yo0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.G1;
                }
                if (parentActivity != null) {
                    yo0Var3.a1 = true;
                    yo0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = yo0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (xo0Var2 = yo0Var3.Z0) != null) {
                        xo0Var2.a(1);
                    }
                    yo0Var3.t0();
                    if (z10 && (xo0Var = yo0Var3.Z0) != null) {
                        xo0Var.a(yo0Var3.f1);
                    }
                    long r02 = yo0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(yo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = yo0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = yo0Var3.q0();
                    int i22 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                        string = LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired);
                    } else {
                        string = null;
                    }
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, yo0Var3.R0[0], yo0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(U);
                        if (r02 == 0 || string == null || z12) {
                            String str6 = string;
                            M = str6 != null ? a02.M(str6, replaceTags, i22) : a02.Q(i22, 36, replaceTags);
                        } else {
                            M = a02.K(i22, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new zn0(r02, i13));
                        }
                        org.telegram.ui.Components.oc ocVar = M;
                        ocVar.r = false;
                        ocVar.j = 5000;
                        if (messageArr[0] != null) {
                            ai.m5 m5Var = new ai.m5(yo0Var3, ocVar, z11, messageArr, 3);
                            org.telegram.ui.Components.sb sbVar = ocVar.e;
                            if (sbVar != null) {
                                sbVar.setOnClickListener(m5Var);
                            }
                        }
                        ocVar.k(z12);
                        break;
                    }
                }
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                j41.T(photoViewer.E, photoViewer.m4, false, (ai.d) this.c, null);
                break;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                it0 it0Var = (it0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (it0Var.getWindow() != null) {
                    it0Var.setFocusable(true);
                    bo boVar = photoViewer2.l4;
                    if (boVar != null && (nkVar = boVar.Y) != null) {
                        nkVar.n0(false);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.messenger.f2 f2Var = (org.telegram.messenger.f2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                f2Var.run(bitmap);
                break;
            case 13:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                qg.z0 z0Var = (qg.z0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                z0Var.e.h();
                z0Var.c.postRunnable(new p91(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 14:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (b6Var != null) {
                    ArrayList arrayList = b6Var.h;
                    org.telegram.ui.Components.y5 y5Var = b6Var.n;
                    if (y5Var != null) {
                        arrayList.add(y5Var);
                    }
                    org.telegram.ui.Components.y5 y5Var2 = b6Var.r;
                    if (y5Var2 != null) {
                        arrayList.add(y5Var2);
                    }
                    org.telegram.ui.Components.y5 y5Var3 = b6Var.s;
                    if (y5Var3 != null) {
                        arrayList.add(y5Var3);
                    }
                    b6Var.n = new org.telegram.ui.Components.y5(bitmap2);
                    b6Var.r = null;
                    b6Var.s = null;
                    b6Var.t();
                    break;
                }
                break;
            case 15:
                js0 js0Var = (js0) this.b;
                View view2 = (View) this.c;
                js0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = js0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                wu0 wu0Var = photoViewer4.E2;
                if (wu0Var != null) {
                    wu0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 16:
                tt0 tt0Var = (tt0) this.b;
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) this.c;
                tt0Var.getClass();
                if (h71Var.p() > 0 && h71Var.n() >= h71Var.p() - 590) {
                    tt0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 17:
                xt0 xt0Var = (xt0) this.b;
                qg.z0 z0Var2 = (qg.z0) this.c;
                z0Var2.e.h();
                z0Var2.c.postRunnable(new p91(i12));
                try {
                    xt0Var.b.e0.removeView(z0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 18:
                ct0 ct0Var = (ct0) this.b;
                ci.n6 n6Var = (ci.n6) this.c;
                PhotoViewer photoViewer5 = ct0Var.b;
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
            case 19:
                hu0 hu0Var = (hu0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                hu0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 20:
                hu0 hu0Var2 = (hu0) this.b;
                fv0 fv0Var = (fv0) this.c;
                hu0Var2.r.s4 = false;
                if (!fv0Var.s) {
                    fv0Var.a.setVisible(false, true);
                    break;
                }
                break;
            case 21:
                ow0 ow0Var = (ow0) this.b;
                String str7 = (String) this.c;
                ow0Var.getClass();
                AndroidUtilities.addToClipboard(str7);
                ow0Var.c(true);
                break;
            case 22:
                ow0 ow0Var2 = (ow0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                ow0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(pollAnswer.text, false));
                ow0Var2.c(true);
                break;
            case 23:
                ow0 ow0Var3 = (ow0) this.b;
                SendMessagesHelper.getInstance(ow0Var3.H.currentAccount).deletePollOption(ow0Var3.H, (byte[]) this.c);
                ow0Var3.c(true);
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
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) this.c;
                boolean z13 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z13;
                w8Var.setChecked(z13);
                break;
            case 28:
                ((iy0) this.b).getMessagesController().unblockPeer(((Long) this.c).longValue());
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
                profileActivity.presentFragment(new bo(bundle), true);
                break;
        }
    }
}
