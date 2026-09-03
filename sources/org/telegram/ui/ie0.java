package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ie0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        char c3;
        String formatPluralString;
        boolean z4;
        char c10;
        String formatString;
        org.telegram.ui.ActionBar.p2 U;
        ko0 ko0Var;
        ko0 ko0Var2;
        lk lkVar;
        String str = "";
        int i14 = 2;
        int i15 = 1;
        switch (this.a) {
            case 0:
                je0 je0Var = (je0) this.b;
                String str2 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = je0Var.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                ge0 ge0Var = new ge0(je0Var, i14);
                if (z10) {
                    TL_account.Password password = je0Var.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ge0Var.run(null, tL_error);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.p2) je0Var.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ge0Var, 10);
                        break;
                    }
                }
                break;
            case 1:
                bf0 bf0Var = (bf0) this.b;
                TLObject tLObject = (TLObject) this.c;
                bf0Var.L.k1(false, false);
                AndroidUtilities.hideKeyboard(bf0Var.L.fragmentView.findFocus());
                bf0Var.L.o1((TLRPC.TL_auth_authorization) tLObject, true);
                TLRPC.FileLocation fileLocation = bf0Var.K;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new ie0(i14, bf0Var, fileLocation));
                    break;
                }
                break;
            case 2:
                bf0 bf0Var2 = (bf0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.p2) bf0Var2.L).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 3:
                cf0 cf0Var = (cf0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                pg0 pg0Var = cf0Var.B;
                pg0Var.k1(false, true);
                if (tL_error2 == null) {
                    if (cf0Var.r != null && cf0Var.s != null && cf0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", cf0Var.r);
                        bundle.putString("phoneHash", cf0Var.s);
                        bundle.putString("code", cf0Var.v);
                        pg0Var.u1(5, true, bundle, false);
                        break;
                    } else {
                        pg0Var.u1(0, true, null, true);
                        break;
                    }
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    pg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                }
                break;
            case 4:
                tf0 tf0Var = (tf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.Q = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.y3.j(new StringBuilder("+"), tf0Var.b, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new pf0(tf0Var, 0));
                alertDialog$Builder.o();
                break;
            case 5:
                tf0 tf0Var2 = (tf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                tf0Var2.getClass();
                tf0Var2.b0 = tL_error3.text;
                break;
            case 6:
                ((tf0) this.b).p0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 7:
                tf0 tf0Var3 = (tf0) this.b;
                Runnable runnable = (Runnable) this.c;
                as asVar = tf0Var3.f;
                int i16 = 0;
                while (true) {
                    ds[] dsVarArr = asVar.f;
                    if (i16 >= dsVarArr.length) {
                        runnable.run();
                        asVar.e = false;
                        break;
                    } else {
                        dsVarArr[i16].l(0.0f);
                        i16++;
                    }
                }
            case 8:
                ((y3) this.b).run((String) this.c);
                break;
            case 9:
                rh0 rh0Var = (rh0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                rh0Var.Z = false;
                if (tL_error4 == null) {
                    ih0 f02 = rh0Var.f0();
                    rh0Var.g0.clear();
                    rh0Var.h0(f02);
                    break;
                }
                break;
            case 10:
                hh0 hh0Var = (hh0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                rh0 rh0Var2 = hh0Var.a;
                ih0 f03 = rh0Var2.f0();
                rh0Var2.f0.add(0, (TLRPC.TL_chatInviteExported) tLObject2);
                TLRPC.ChatFull chatFull = rh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    rh0Var2.getMessagesStorage().saveChatLinksCount(rh0Var2.n, rh0Var2.d.invitesCount);
                }
                rh0Var2.h0(f03);
                break;
            case 11:
                cj0 cj0Var = (cj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (cj0Var.getParentActivity() != null) {
                    Toast.makeText(cj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 12:
                uj0 uj0Var = (uj0) this.b;
                String str3 = (String) this.c;
                uj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str3));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                uj0Var.getContext().startActivity(intent);
                break;
            case 13:
                uj0 uj0Var2 = (uj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                uj0Var2.dismiss();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 14:
                ((org.telegram.ui.Components.vk) this.b).run((TLRPC.User) this.c);
                break;
            case 15:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 16:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (ds dsVar : passcodeActivity.n.f) {
                    dsVar.l(0.0f);
                }
                runnable2.run();
                break;
            case 17:
                el0 el0Var = (el0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity2 = el0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 18:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 19:
                fn0 fn0Var = (fn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = fn0Var.x;
                int i17 = result.type;
                if (i17 == 2) {
                    if (!(fn0Var.C.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = fn0Var.D.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) fn0Var.D.get(i18);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    fn0Var.C = tL_secureRequiredType;
                                    fn0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i17 == 1) {
                    if (!(fn0Var.C.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = fn0Var.D.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) fn0Var.D.get(i19);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    fn0Var.C = tL_secureRequiredType2;
                                    fn0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i17 == 3) {
                    if (!(fn0Var.C.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = fn0Var.D.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) fn0Var.D.get(i20);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    fn0Var.C = tL_secureRequiredType3;
                                    fn0Var.P1();
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                } else if (i17 == 4 && !(fn0Var.C.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = fn0Var.D.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) fn0Var.D.get(i21);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                fn0Var.C = tL_secureRequiredType4;
                                fn0Var.P1();
                            } else {
                                i21++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    fn0Var.V[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    fn0Var.V[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    fn0Var.V[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    fn0Var.V[7].setText(result.number);
                }
                int i22 = result.gender;
                if (i22 != 0) {
                    if (i22 == 1) {
                        fn0Var.w = "male";
                        fn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i22 == 2) {
                        fn0Var.w = "female";
                        fn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str4 = result.nationality;
                    fn0Var.s = str4;
                    String str5 = (String) fn0Var.V0.get(str4);
                    if (str5 != null) {
                        fn0Var.V[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str6 = result.issuingCountry;
                    fn0Var.v = str6;
                    String str7 = (String) fn0Var.V0.get(str6);
                    if (str7 != null) {
                        fn0Var.V[6].setText(str7);
                    }
                }
                int i23 = result.birthDay;
                if (i23 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    fn0Var.V[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i23), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i24 = result.expiryDay;
                if (i24 <= 0 || (i12 = result.expiryMonth) <= 0 || (i13 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    fn0Var.V[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i24;
                    fn0Var.V[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i24), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
                break;
            case 20:
                fn0 fn0Var2 = (fn0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    fn0Var2.G = password2;
                    if (TwoStepVerificationActivity.i0(password2, false)) {
                        TwoStepVerificationActivity.m0(fn0Var2.G);
                        fn0Var2.R1();
                        if (fn0Var2.W[0].getVisibility() == 0) {
                            fn0Var2.V[0].requestFocus();
                            AndroidUtilities.showKeyboard(fn0Var2.V[0]);
                        }
                        if (fn0Var2.K0 == 1) {
                            fn0Var2.B1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.z4.x0(fn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 21:
                fn0 fn0Var3 = (fn0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                if (tL_error5 == null) {
                    fn0Var3.c1 = true;
                    fn0Var3.W0(true);
                    fn0Var3.finishFragment();
                    break;
                } else {
                    fn0Var3.N1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error5.text)) {
                        org.telegram.ui.Components.z4.x0(fn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        fn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error5.text);
                        break;
                    }
                }
            case 22:
                ((an0) this.b).a.H = ((TLRPC.TL_error) this.c).text;
                break;
            case 23:
                lo0 lo0Var = (lo0) this.b;
                View view = (View) this.c;
                lo0Var.D0(false);
                view.callOnClick();
                break;
            case 24:
                lo0 lo0Var2 = (lo0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                lo0Var2.H0(true, false);
                if (tL_error6 != null) {
                    if (tL_error6.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.i3 i3Var = lo0Var2.P;
                        try {
                            i3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(i3Var, 2.5f);
                        org.telegram.ui.Cells.i3 i3Var2 = lo0Var2.P;
                        i3Var2.a.setText("");
                        i3Var2.b = false;
                        i3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string = LocaleController.getString(R.string.AppName);
                        int i25 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c3] = formatPluralString;
                        lo0Var2.F0(string, LocaleController.formatString("FloodWaitTime", i25, objArr));
                        break;
                    } else {
                        lo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error6.text);
                        break;
                    }
                } else if (lo0Var2.getParentActivity() != null) {
                    kn0 kn0Var = lo0Var2.a0;
                    if (kn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(kn0Var);
                        lo0Var2.a0 = null;
                    }
                    lo0Var2.t0();
                    break;
                }
                break;
            case 25:
                lo0.W((lo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 26:
                lo0 lo0Var3 = (lo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = lo0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.D1;
                }
                if (parentActivity != null) {
                    lo0Var3.X0 = true;
                    lo0Var3.c1 = 1;
                    TLRPC.InputInvoice inputInvoice = lo0Var3.Y0;
                    boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z12 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z13 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z11 && (ko0Var2 = lo0Var3.W0) != null) {
                        ko0Var2.a(1);
                    }
                    lo0Var3.t0();
                    if (z11 && (ko0Var = lo0Var3.W0) != null) {
                        ko0Var.a(lo0Var3.c1);
                    }
                    long r02 = lo0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(lo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0) {
                        z4 = z12;
                        c10 = 0;
                        TLRPC.Chat chat = lo0Var3.getMessagesController().getChat(Long.valueOf(-r02));
                        if (chat != null) {
                            str = chat.title;
                        }
                        long q02 = lo0Var3.q0();
                        int i26 = !z11 ? (z4 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String string2 = z11 ? LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z4 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                        if (z11) {
                            int i27 = R.string.PaymentInfoHint;
                            String str8 = lo0Var3.O0[c10];
                            String str9 = lo0Var3.n0;
                            Object[] objArr2 = new Object[2];
                            objArr2[c10] = str8;
                            objArr2[1] = str9;
                            formatString = LocaleController.formatString(i27, objArr2);
                        } else if (z13) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            String str10 = z4 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[c10] = str;
                            formatString = LocaleController.formatPluralStringComma(str10, (int) q02, objArr3);
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                        U = LaunchActivity.U();
                        if (U == null) {
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(U);
                            org.telegram.ui.Components.ic M = (r02 == 0 || string2 == null || z13) ? string2 != null ? a02.M(string2, replaceTags, i26) : a02.Q(i26, 36, replaceTags) : a02.K(i26, string2, replaceTags, LocaleController.getString(R.string.ViewInChat), new lh.s9(r02, i15));
                            M.r = false;
                            M.j = 5000;
                            if (messageArr[0] != null) {
                                eg.e1 e1Var = new eg.e1(lo0Var3, M, z4, messageArr, 4);
                                org.telegram.ui.Components.nb nbVar = M.e;
                                if (nbVar != null) {
                                    nbVar.setOnClickListener(e1Var);
                                }
                            }
                            M.k(z13);
                            break;
                        }
                    }
                    z4 = z12;
                    c10 = 0;
                    long q022 = lo0Var3.q0();
                    int i262 = !z11 ? (z4 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z11) {
                    }
                    String string22 = z11 ? LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z4 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                    if (z11) {
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                    U = LaunchActivity.U();
                    if (U == null) {
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                w31.T(photoViewer.B, photoViewer.j4, false, (nh.b) this.c, null);
                break;
            case 28:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                rs0 rs0Var = (rs0) this.c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (rs0Var.getWindow() != null) {
                    rs0Var.setFocusable(true);
                    zn znVar = photoViewer2.i4;
                    if (znVar != null && (lkVar = znVar.V) != null) {
                        lkVar.m0(false);
                        break;
                    }
                }
                break;
            default:
                kh.y0 y0Var = (kh.y0) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                y0Var.run(bitmap);
                break;
        }
    }
}
