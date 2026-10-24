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
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bh0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        TLRPC.Chat chat;
        String formatString;
        org.telegram.ui.Components.qc M;
        ho0 ho0Var;
        ho0 ho0Var2;
        gk gkVar;
        String str = "";
        int i12 = 19;
        switch (this.a) {
            case 0:
                ch0 ch0Var = (ch0) this.b;
                TLObject tLObject = (TLObject) this.c;
                mh0 mh0Var = ch0Var.a;
                dh0 g02 = mh0Var.g0();
                mh0Var.i0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = mh0Var.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    mh0Var.getMessagesStorage().saveChatLinksCount(mh0Var.n, mh0Var.d.invitesCount);
                }
                mh0Var.i0(g02);
                break;
            case 1:
                yi0 yi0Var = (yi0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (yi0Var.getParentActivity() != null) {
                    Toast.makeText(yi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 2:
                rj0 rj0Var = (rj0) this.b;
                String str2 = (String) this.c;
                rj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                rj0Var.getContext().startActivity(intent);
                break;
            case 3:
                rj0 rj0Var2 = (rj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                rj0Var2.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.o4(user.id));
                    break;
                }
                break;
            case 4:
                ((org.telegram.ui.Components.qy) this.b).run((TLRPC.User) this.c);
                break;
            case 5:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 6:
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h3VarArr[0] = null;
                xk0.a = null;
                zArr[0] = true;
                break;
            case 7:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (vr vrVar : passcodeActivity.n.f) {
                    vrVar.l(0.0f);
                }
                runnable.run();
                break;
            case 8:
                cl0 cl0Var = (cl0) this.b;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                PasscodeActivity passcodeActivity2 = cl0Var.b;
                e1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                e1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.n0();
                if (passcodeActivity2.h0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 9:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 10:
                an0 an0Var = (an0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = an0Var.x;
                int i13 = result.type;
                if (i13 == 2) {
                    if (!(an0Var.F.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = an0Var.G.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) an0Var.G.get(i14);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    an0Var.F = tL_secureRequiredType;
                                    an0Var.P1();
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                } else if (i13 == 1) {
                    if (!(an0Var.F.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = an0Var.G.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) an0Var.G.get(i15);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    an0Var.F = tL_secureRequiredType2;
                                    an0Var.P1();
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                } else if (i13 == 3) {
                    if (!(an0Var.F.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = an0Var.G.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) an0Var.G.get(i16);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    an0Var.F = tL_secureRequiredType3;
                                    an0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i13 == 4 && !(an0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = an0Var.G.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) an0Var.G.get(i17);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                an0Var.F = tL_secureRequiredType4;
                                an0Var.P1();
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    an0Var.Y[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    an0Var.Y[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    an0Var.Y[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    an0Var.Y[7].setText(result.number);
                }
                int i18 = result.gender;
                if (i18 != 0) {
                    if (i18 == 1) {
                        an0Var.w = "male";
                        an0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i18 == 2) {
                        an0Var.w = "female";
                        an0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    an0Var.s = str3;
                    String str4 = (String) an0Var.Y0.get(str3);
                    if (str4 != null) {
                        an0Var.Y[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    an0Var.v = str5;
                    String str6 = (String) an0Var.Y0.get(str5);
                    if (str6 != null) {
                        an0Var.Y[6].setText(str6);
                    }
                }
                int i19 = result.birthDay;
                if (i19 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    an0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i19), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i20 = result.expiryDay;
                if (i20 <= 0 || (i10 = result.expiryMonth) <= 0 || (i11 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    an0Var.Y[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i20;
                    an0Var.Y[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i20), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
                break;
            case 11:
                an0 an0Var2 = (an0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    an0Var2.J = password;
                    if (TwoStepVerificationActivity.i0(password, false)) {
                        TwoStepVerificationActivity.m0(an0Var2.J);
                        an0Var2.R1();
                        if (an0Var2.Z[0].getVisibility() == 0) {
                            an0Var2.Y[0].requestFocus();
                            AndroidUtilities.showKeyboard(an0Var2.Y[0]);
                        }
                        if (an0Var2.N0 == 1) {
                            an0Var2.A1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.f5.x0(an0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 12:
                an0 an0Var3 = (an0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error == null) {
                    an0Var3.f1 = true;
                    an0Var3.V0(true);
                    an0Var3.finishFragment();
                    break;
                } else {
                    an0Var3.M1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.f5.x0(an0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        an0Var3.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                        break;
                    }
                }
            case 13:
                ((vm0) this.b).a.K = ((TLRPC.TL_error) this.c).text;
                break;
            case 14:
                io0 io0Var = (io0) this.b;
                View view = (View) this.c;
                io0Var.D0(false);
                view.callOnClick();
                break;
            case 15:
                io0 io0Var2 = (io0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                io0Var2.H0(true, false);
                if (tL_error2 != null) {
                    if (tL_error2.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.i3 i3Var = io0Var2.S;
                        try {
                            i3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(i3Var, 2.5f);
                        org.telegram.ui.Cells.i3 i3Var2 = io0Var2.S;
                        i3Var2.a.setText("");
                        i3Var2.b = false;
                        i3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                        io0Var2.F0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                        break;
                    } else {
                        io0Var2.F0(LocaleController.getString(R.string.AppName), tL_error2.text);
                        break;
                    }
                } else if (io0Var2.getParentActivity() != null) {
                    fn0 fn0Var = io0Var2.d0;
                    if (fn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(fn0Var);
                        io0Var2.d0 = null;
                    }
                    io0Var2.t0();
                    break;
                }
                break;
            case 16:
                io0.W((io0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 17:
                io0 io0Var3 = (io0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = io0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.J1;
                }
                if (parentActivity != null) {
                    io0Var3.a1 = true;
                    io0Var3.f1 = 1;
                    TLRPC.InputInvoice inputInvoice = io0Var3.b1;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (ho0Var2 = io0Var3.Z0) != null) {
                        ho0Var2.a(1);
                    }
                    io0Var3.t0();
                    if (z10 && (ho0Var = io0Var3.Z0) != null) {
                        ho0Var.a(io0Var3.f1);
                    }
                    long r02 = io0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(io0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0 && (chat = io0Var3.getMessagesController().getChat(Long.valueOf(-r02))) != null) {
                        str = chat.title;
                    }
                    long q02 = io0Var3.q0();
                    int i21 = z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    String string = z10 ? LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                    if (!z10) {
                        formatString = LocaleController.formatString(R.string.PaymentInfoHint, io0Var3.R0[0], io0Var3.q0);
                    } else if (z12) {
                        formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                    } else {
                        formatString = LocaleController.formatPluralStringComma(z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) q02, str);
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U2);
                        if (r02 == 0 || string == null || z12) {
                            String str7 = string;
                            M = str7 != null ? a02.M(str7, replaceTags, i21) : a02.Q(i21, 36, replaceTags);
                        } else {
                            M = a02.K(i21, string, replaceTags, LocaleController.getString(R.string.ViewInChat), new ai.o4(r02, 2));
                        }
                        org.telegram.ui.Components.qc qcVar = M;
                        qcVar.r = false;
                        qcVar.j = 5000;
                        if (messageArr[0] != null) {
                            ci.y3 y3Var = new ci.y3(io0Var3, qcVar, z11, messageArr, 3);
                            org.telegram.ui.Components.ub ubVar = qcVar.e;
                            if (ubVar != null) {
                                ubVar.setOnClickListener(y3Var);
                            }
                        }
                        qcVar.k(z12);
                        break;
                    }
                }
                break;
            case 18:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                x21.T(photoViewer.E, photoViewer.m4, false, (ci.b) this.c, null);
                break;
            case 19:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ps0 ps0Var = (ps0) this.c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (ps0Var.getWindow() != null) {
                    ps0Var.setFocusable(true);
                    sn snVar = photoViewer2.l4;
                    if (snVar != null && (gkVar = snVar.Y) != null) {
                        gkVar.j0(false);
                        break;
                    }
                }
                break;
            case 20:
                ai.x2 x2Var = (ai.x2) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                x2Var.run(bitmap);
                break;
            case 21:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                rg.w0 w0Var = (rg.w0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                w0Var.e.h();
                w0Var.c.postRunnable(new if0(i12));
                photoViewer3.e0.removeView(photoViewer3.N1);
                break;
            case 22:
                org.telegram.ui.Components.e6 e6Var = (org.telegram.ui.Components.e6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                if (e6Var != null) {
                    ArrayList arrayList = e6Var.h;
                    org.telegram.ui.Components.b6 b6Var = e6Var.n;
                    if (b6Var != null) {
                        arrayList.add(b6Var);
                    }
                    org.telegram.ui.Components.b6 b6Var2 = e6Var.r;
                    if (b6Var2 != null) {
                        arrayList.add(b6Var2);
                    }
                    org.telegram.ui.Components.b6 b6Var3 = e6Var.s;
                    if (b6Var3 != null) {
                        arrayList.add(b6Var3);
                    }
                    e6Var.n = new org.telegram.ui.Components.b6(bitmap2);
                    e6Var.r = null;
                    e6Var.s = null;
                    e6Var.t();
                    break;
                }
                break;
            case 23:
                qr0 qr0Var = (qr0) this.b;
                View view2 = (View) this.c;
                qr0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = qr0Var.c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                du0 du0Var = photoViewer4.E2;
                if (du0Var != null) {
                    du0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 24:
                at0 at0Var = (at0) this.b;
                org.telegram.ui.Components.j81 j81Var = (org.telegram.ui.Components.j81) this.c;
                at0Var.getClass();
                if (j81Var.p() > 0 && j81Var.n() >= j81Var.p() - 590) {
                    at0Var.a.e0.invalidate();
                    break;
                }
                break;
            case 25:
                et0 et0Var = (et0) this.b;
                rg.w0 w0Var2 = (rg.w0) this.c;
                w0Var2.e.h();
                w0Var2.c.postRunnable(new if0(i12));
                try {
                    et0Var.b.e0.removeView(w0Var2);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                js0 js0Var = (js0) this.b;
                ah.v vVar = (ah.v) this.c;
                PhotoViewer photoViewer5 = js0Var.b;
                if (photoViewer5.C3 != null) {
                    ImageView imageView2 = photoViewer5.x3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.x3.setImageBitmap(photoViewer5.C3);
                    }
                    ((ImageReceiver) vVar.b).setImageBitmap(photoViewer5.C3);
                    break;
                }
                break;
            case 27:
                ot0 ot0Var = (ot0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                ot0Var.r.l7.lock();
                animatorSet.start();
                break;
            case 28:
                ot0 ot0Var2 = (ot0) this.b;
                mu0 mu0Var = (mu0) this.c;
                ot0Var2.r.s4 = false;
                if (!mu0Var.s) {
                    mu0Var.a.setVisible(false, true);
                    break;
                }
                break;
            default:
                uv0 uv0Var = (uv0) this.b;
                String str8 = (String) this.c;
                uv0Var.getClass();
                AndroidUtilities.addToClipboard(str8);
                uv0Var.c(true);
                break;
        }
    }
}
