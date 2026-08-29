package org.telegram.ui;

import android.animation.AnimatorSet;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lf0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f8  */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        char c3;
        String formatPluralString;
        int i12;
        ?? r15;
        String formatString;
        org.telegram.ui.ActionBar.o2 U;
        ao0 ao0Var;
        ao0 ao0Var2;
        dk dkVar;
        String str = "";
        int i13 = 2;
        int i14 = 1;
        switch (this.a) {
            case 0:
                ((x3) this.b).run((String) this.c);
                break;
            case 1:
                hh0 hh0Var = (hh0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                hh0Var.Y = false;
                if (tL_error == null) {
                    yg0 f02 = hh0Var.f0();
                    hh0Var.f0.clear();
                    hh0Var.h0(f02);
                    break;
                }
                break;
            case 2:
                xg0 xg0Var = (xg0) this.b;
                TLObject tLObject = (TLObject) this.c;
                hh0 hh0Var2 = xg0Var.a;
                yg0 f03 = hh0Var2.f0();
                hh0Var2.e0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = hh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    hh0Var2.getMessagesStorage().saveChatLinksCount(hh0Var2.n, hh0Var2.d.invitesCount);
                }
                hh0Var2.h0(f03);
                break;
            case 3:
                si0 si0Var = (si0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (si0Var.getParentActivity() != null) {
                    Toast.makeText(si0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 4:
                kj0 kj0Var = (kj0) this.b;
                String str2 = (String) this.c;
                kj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                kj0Var.getContext().startActivity(intent);
                break;
            case 5:
                kj0 kj0Var2 = (kj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                kj0Var2.dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 6:
                ((tm) this.b).run((TLRPC.User) this.c);
                break;
            case 7:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable = (Runnable) this.c;
                for (ur urVar : passcodeActivity.n.f) {
                    urVar.l(0.0f);
                }
                runnable.run();
                break;
            case 9:
                tk0 tk0Var = (tk0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity2 = tk0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 10:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 11:
                vm0 vm0Var = (vm0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = vm0Var.x;
                int i15 = result.type;
                if (i15 == 2) {
                    if (!(vm0Var.B.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = vm0Var.C.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) vm0Var.C.get(i16);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    vm0Var.B = tL_secureRequiredType;
                                    vm0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i15 == 1) {
                    if (!(vm0Var.B.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = vm0Var.C.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) vm0Var.C.get(i17);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    vm0Var.B = tL_secureRequiredType2;
                                    vm0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i15 == 3) {
                    if (!(vm0Var.B.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = vm0Var.C.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) vm0Var.C.get(i18);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    vm0Var.B = tL_secureRequiredType3;
                                    vm0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i15 == 4 && !(vm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = vm0Var.C.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) vm0Var.C.get(i19);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                vm0Var.B = tL_secureRequiredType4;
                                vm0Var.P1();
                            } else {
                                i19++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    vm0Var.U[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    vm0Var.U[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    vm0Var.U[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    vm0Var.U[7].setText(result.number);
                }
                int i20 = result.gender;
                if (i20 != 0) {
                    if (i20 == 1) {
                        vm0Var.w = "male";
                        vm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i20 == 2) {
                        vm0Var.w = "female";
                        vm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    vm0Var.s = str3;
                    String str4 = (String) vm0Var.U0.get(str3);
                    if (str4 != null) {
                        vm0Var.U[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    vm0Var.v = str5;
                    String str6 = (String) vm0Var.U0.get(str5);
                    if (str6 != null) {
                        vm0Var.U[6].setText(str6);
                    }
                }
                int i21 = result.birthDay;
                if (i21 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    vm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i22 = result.expiryDay;
                if (i22 <= 0 || (i10 = result.expiryMonth) <= 0 || (i11 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    vm0Var.U[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i22;
                    vm0Var.U[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
            case 12:
                vm0 vm0Var2 = (vm0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    vm0Var2.F = password;
                    if (TwoStepVerificationActivity.i0(password, false)) {
                        TwoStepVerificationActivity.m0(vm0Var2.F);
                        vm0Var2.R1();
                        if (vm0Var2.V[0].getVisibility() == 0) {
                            vm0Var2.U[0].requestFocus();
                            AndroidUtilities.showKeyboard(vm0Var2.U[0]);
                        }
                        if (vm0Var2.J0 == 1) {
                            vm0Var2.B1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.c5.x0(vm0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 13:
                vm0 vm0Var3 = (vm0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (tL_error2 == null) {
                    vm0Var3.b1 = true;
                    vm0Var3.W0(true);
                    vm0Var3.finishFragment();
                    break;
                } else {
                    vm0Var3.N1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error2.text)) {
                        org.telegram.ui.Components.c5.x0(vm0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        vm0Var3.M1(LocaleController.getString(R.string.AppName), tL_error2.text);
                        break;
                    }
                }
            case 14:
                ((qm0) this.b).a.G = ((TLRPC.TL_error) this.c).text;
                break;
            case 15:
                bo0 bo0Var = (bo0) this.b;
                View view = (View) this.c;
                bo0Var.D0(false);
                view.callOnClick();
                break;
            case 16:
                bo0 bo0Var2 = (bo0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                bo0Var2.H0(true, false);
                if (tL_error3 != null) {
                    if (tL_error3.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.h3 h3Var = bo0Var2.O;
                        try {
                            h3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(h3Var, 2.5f);
                        org.telegram.ui.Cells.h3 h3Var2 = bo0Var2.O;
                        h3Var2.a.setText("");
                        h3Var2.b = false;
                        h3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error3.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error3.text).intValue();
                        if (intValue < 60) {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string = LocaleController.getString(R.string.AppName);
                        int i23 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c3] = formatPluralString;
                        bo0Var2.F0(string, LocaleController.formatString("FloodWaitTime", i23, objArr));
                        break;
                    } else {
                        bo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error3.text);
                        break;
                    }
                } else if (bo0Var2.getParentActivity() != null) {
                    an0 an0Var = bo0Var2.Z;
                    if (an0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(an0Var);
                        bo0Var2.Z = null;
                    }
                    bo0Var2.t0();
                    break;
                }
                break;
            case 17:
                bo0.W((bo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 18:
                bo0 bo0Var3 = (bo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = bo0Var3.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = ApplicationLoader.applicationContext;
                }
                if (obj == null) {
                    obj = LaunchActivity.C1;
                }
                if (obj != null) {
                    bo0Var3.W0 = true;
                    bo0Var3.b1 = 1;
                    TLRPC.InputInvoice inputInvoice = bo0Var3.X0;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (ao0Var2 = bo0Var3.V0) != null) {
                        ao0Var2.a(1);
                    }
                    bo0Var3.t0();
                    if (z10 && (ao0Var = bo0Var3.V0) != null) {
                        ao0Var.a(bo0Var3.b1);
                    }
                    long r02 = bo0Var3.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str = UserObject.getForcedFirstName(bo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0) {
                        i12 = i24;
                        r15 = 0;
                        r15 = 0;
                        TLRPC.Chat chat = bo0Var3.getMessagesController().getChat(Long.valueOf(-r02));
                        if (chat != null) {
                            str = chat.title;
                        }
                        long q02 = bo0Var3.q0();
                        int i25 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String string2 = z10 ? LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                        if (z10) {
                            int i26 = R.string.PaymentInfoHint;
                            String str7 = bo0Var3.N0[r15];
                            String str8 = bo0Var3.m0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r15] = str7;
                            objArr2[1] = str8;
                            formatString = LocaleController.formatString(i26, objArr2);
                        } else if (z12) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            String str9 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r15] = str;
                            formatString = LocaleController.formatPluralStringComma(str9, (int) q02, objArr3);
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                        U = LaunchActivity.U();
                        if (U == null) {
                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(U);
                            org.telegram.ui.Components.mc M = (i12 == 0 || string2 == null || z12) ? string2 != null ? a02.M(string2, replaceTags, i25) : a02.Q(i25, 36, replaceTags) : a02.K(i25, string2, replaceTags, LocaleController.getString(R.string.ViewInChat), new jh.r9(r02, i14));
                            M.r = r15;
                            M.j = 5000;
                            if (messageArr[r15] != null) {
                                cg.f1 f1Var = new cg.f1(bo0Var3, M, z11, messageArr, 4);
                                org.telegram.ui.Components.rb rbVar = M.e;
                                if (rbVar != null) {
                                    rbVar.setOnClickListener(f1Var);
                                }
                            }
                            M.k(z12);
                            break;
                        }
                    }
                    i12 = i24;
                    r15 = 0;
                    long q022 = bo0Var3.q0();
                    int i252 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z10) {
                    }
                    String string22 = z10 ? LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                    if (z10) {
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                    U = LaunchActivity.U();
                    if (U == null) {
                    }
                }
                break;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                d31.T(photoViewer.A, photoViewer.i4, false, (lh.b) this.c, null);
                break;
            case 20:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                cs0 cs0Var = (cs0) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (cs0Var.getWindow() != null) {
                    cs0Var.setFocusable(true);
                    tn tnVar = photoViewer2.h4;
                    if (tnVar != null && (dkVar = tnVar.U) != null) {
                        dkVar.m0(false);
                        break;
                    }
                }
                break;
            case 21:
                ih.z0 z0Var = (ih.z0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                z0Var.run(bitmap);
                break;
            case 22:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                bg.s1 s1Var = (bg.s1) this.c;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                s1Var.e.h();
                s1Var.c.postRunnable(new ag.o0(i13));
                photoViewer3.a0.removeView(photoViewer3.J1);
                break;
            case 23:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.P8;
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
            case 24:
                dr0 dr0Var = (dr0) this.b;
                View view2 = (View) this.c;
                dr0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = dr0Var.c;
                ImageView imageView = photoViewer4.t3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                qt0 qt0Var = photoViewer4.A2;
                if (qt0Var != null) {
                    qt0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 25:
                ns0 ns0Var = (ns0) this.b;
                org.telegram.ui.Components.x61 x61Var = (org.telegram.ui.Components.x61) this.c;
                ns0Var.getClass();
                if (x61Var.q() > 0 && x61Var.o() >= x61Var.q() - 590) {
                    ns0Var.a.a0.invalidate();
                    break;
                }
                break;
            case 26:
                rs0 rs0Var = (rs0) this.b;
                bg.s1 s1Var2 = (bg.s1) this.c;
                s1Var2.e.h();
                s1Var2.c.postRunnable(new ag.o0(i13));
                try {
                    rs0Var.b.a0.removeView(s1Var2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 27:
                wr0 wr0Var = (wr0) this.b;
                bg.d1 d1Var = (bg.d1) this.c;
                PhotoViewer photoViewer5 = wr0Var.b;
                if (photoViewer5.y3 != null) {
                    ImageView imageView2 = photoViewer5.t3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.t3.setImageBitmap(photoViewer5.y3);
                    }
                    ((ImageReceiver) d1Var.b).setImageBitmap(photoViewer5.y3);
                    break;
                }
                break;
            case 28:
                bt0 bt0Var = (bt0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                bt0Var.r.h7.lock();
                animatorSet.start();
                break;
            default:
                bt0 bt0Var2 = (bt0) this.b;
                zt0 zt0Var = (zt0) this.c;
                bt0Var2.r.o4 = false;
                if (!zt0Var.s) {
                    zt0Var.a.setVisible(false, true);
                    break;
                }
                break;
        }
    }
}
