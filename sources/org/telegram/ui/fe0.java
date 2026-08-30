package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fe0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00db  */
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
        io0 io0Var;
        io0 io0Var2;
        jk jkVar;
        String str = "";
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        switch (this.a) {
            case 0:
                he0 he0Var = (he0) this.b;
                TLObject tLObject = (TLObject) this.c;
                ng0 ng0Var = he0Var.y;
                ng0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(he0Var.a);
                ng0Var.o1((TLRPC.TL_auth_authorization) tLObject, false);
                break;
            case 1:
                he0 he0Var2 = (he0) this.b;
                String str2 = (String) this.c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = he0Var2.n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                byte[] x10 = z10 ? SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
                ee0 ee0Var = new ee0(he0Var2, i15);
                if (z10) {
                    TL_account.Password password = he0Var2.n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x10, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ee0Var.run(null, tL_error);
                        break;
                    } else {
                        TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                        tL_auth_checkPassword.password = startCheck;
                        i10 = ((org.telegram.ui.ActionBar.p2) he0Var2.y).currentAccount;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ee0Var, 10);
                        break;
                    }
                }
                break;
            case 2:
                ze0 ze0Var = (ze0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ze0Var.L.k1(false, false);
                AndroidUtilities.hideKeyboard(ze0Var.L.fragmentView.findFocus());
                ze0Var.L.o1((TLRPC.TL_auth_authorization) tLObject2, true);
                TLRPC.FileLocation fileLocation = ze0Var.K;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new fe0(i14, ze0Var, fileLocation));
                    break;
                }
                break;
            case 3:
                ze0 ze0Var2 = (ze0) this.b;
                TLRPC.FileLocation fileLocation2 = (TLRPC.FileLocation) this.c;
                i11 = ((org.telegram.ui.ActionBar.p2) ze0Var2.L).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar(fileLocation2);
                break;
            case 4:
                af0 af0Var = (af0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ng0 ng0Var2 = af0Var.B;
                ng0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (af0Var.r != null && af0Var.s != null && af0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", af0Var.r);
                        bundle.putString("phoneHash", af0Var.s);
                        bundle.putString("code", af0Var.v);
                        ng0Var2.u1(5, true, bundle, false);
                        break;
                    } else {
                        ng0Var2.u1(0, true, null, true);
                        break;
                    }
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    break;
                } else {
                    ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                }
            case 5:
                rf0 rf0Var = (rf0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.c);
                alertDialog$Builder.a.O = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.a.Q = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.y3.j(new StringBuilder("+"), rf0Var.b, se.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.a.setOnDismissListener(new nf0(rf0Var, 0));
                alertDialog$Builder.o();
                break;
            case 6:
                rf0 rf0Var2 = (rf0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                rf0Var2.getClass();
                rf0Var2.b0 = tL_error3.text;
                break;
            case 7:
                ((rf0) this.b).p0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 8:
                rf0 rf0Var3 = (rf0) this.b;
                Runnable runnable = (Runnable) this.c;
                yr yrVar = rf0Var3.f;
                int i17 = 0;
                while (true) {
                    bs[] bsVarArr = yrVar.f;
                    if (i17 >= bsVarArr.length) {
                        runnable.run();
                        yrVar.e = false;
                        break;
                    } else {
                        bsVarArr[i17].l(0.0f);
                        i17++;
                    }
                }
            case 9:
                ((w3) this.b).run((String) this.c);
                break;
            case 10:
                ph0 ph0Var = (ph0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                ph0Var.Z = false;
                if (tL_error4 == null) {
                    gh0 f02 = ph0Var.f0();
                    ph0Var.g0.clear();
                    ph0Var.h0(f02);
                    break;
                }
                break;
            case 11:
                fh0 fh0Var = (fh0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ph0 ph0Var2 = fh0Var.a;
                gh0 f03 = ph0Var2.f0();
                ph0Var2.f0.add(0, (TLRPC.TL_chatInviteExported) tLObject3);
                TLRPC.ChatFull chatFull = ph0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ph0Var2.getMessagesStorage().saveChatLinksCount(ph0Var2.n, ph0Var2.d.invitesCount);
                }
                ph0Var2.h0(f03);
                break;
            case 12:
                aj0 aj0Var = (aj0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (aj0Var.getParentActivity() != null) {
                    Toast.makeText(aj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 13:
                sj0 sj0Var = (sj0) this.b;
                String str3 = (String) this.c;
                sj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str3));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                sj0Var.getContext().startActivity(intent);
                break;
            case 14:
                sj0 sj0Var2 = (sj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                sj0Var2.dismiss();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 15:
                ((org.telegram.ui.Components.vk) this.b).run((TLRPC.User) this.c);
                break;
            case 16:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (bs bsVar : passcodeActivity.n.f) {
                    bsVar.l(0.0f);
                }
                runnable2.run();
                break;
            case 18:
                cl0 cl0Var = (cl0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity2 = cl0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 19:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 20:
                dn0 dn0Var = (dn0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = dn0Var.x;
                int i18 = result.type;
                if (i18 == 2) {
                    if (!(dn0Var.C.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = dn0Var.D.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) dn0Var.D.get(i19);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    dn0Var.C = tL_secureRequiredType;
                                    dn0Var.P1();
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                } else if (i18 == 1) {
                    if (!(dn0Var.C.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = dn0Var.D.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) dn0Var.D.get(i20);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    dn0Var.C = tL_secureRequiredType2;
                                    dn0Var.P1();
                                } else {
                                    i20++;
                                }
                            }
                        }
                    }
                } else if (i18 == 3) {
                    if (!(dn0Var.C.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = dn0Var.D.size();
                        int i21 = 0;
                        while (true) {
                            if (i21 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) dn0Var.D.get(i21);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    dn0Var.C = tL_secureRequiredType3;
                                    dn0Var.P1();
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                } else if (i18 == 4 && !(dn0Var.C.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = dn0Var.D.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) dn0Var.D.get(i22);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                dn0Var.C = tL_secureRequiredType4;
                                dn0Var.P1();
                            } else {
                                i22++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    dn0Var.V[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    dn0Var.V[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    dn0Var.V[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    dn0Var.V[7].setText(result.number);
                }
                int i23 = result.gender;
                if (i23 != 0) {
                    if (i23 == 1) {
                        dn0Var.w = "male";
                        dn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i23 == 2) {
                        dn0Var.w = "female";
                        dn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str4 = result.nationality;
                    dn0Var.s = str4;
                    String str5 = (String) dn0Var.V0.get(str4);
                    if (str5 != null) {
                        dn0Var.V[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str6 = result.issuingCountry;
                    dn0Var.v = str6;
                    String str7 = (String) dn0Var.V0.get(str6);
                    if (str7 != null) {
                        dn0Var.V[6].setText(str7);
                    }
                }
                int i24 = result.birthDay;
                if (i24 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    dn0Var.V[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i24), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i25 = result.expiryDay;
                if (i25 <= 0 || (i12 = result.expiryMonth) <= 0 || (i13 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    dn0Var.V[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i13;
                    iArr[1] = i12;
                    iArr[2] = i25;
                    dn0Var.V[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i25), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
                break;
            case 21:
                dn0 dn0Var2 = (dn0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 != null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject4;
                    dn0Var2.G = password2;
                    if (TwoStepVerificationActivity.i0(password2, false)) {
                        TwoStepVerificationActivity.m0(dn0Var2.G);
                        dn0Var2.R1();
                        if (dn0Var2.W[0].getVisibility() == 0) {
                            dn0Var2.V[0].requestFocus();
                            AndroidUtilities.showKeyboard(dn0Var2.V[0]);
                        }
                        if (dn0Var2.K0 == 1) {
                            dn0Var2.B1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.z4.x0(dn0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 22:
                dn0 dn0Var3 = (dn0) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                if (tL_error5 == null) {
                    dn0Var3.c1 = true;
                    dn0Var3.W0(true);
                    dn0Var3.finishFragment();
                    break;
                } else {
                    dn0Var3.N1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error5.text)) {
                        org.telegram.ui.Components.z4.x0(dn0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        dn0Var3.M1(LocaleController.getString(R.string.AppName), tL_error5.text);
                        break;
                    }
                }
            case 23:
                ((ym0) this.b).a.H = ((TLRPC.TL_error) this.c).text;
                break;
            case 24:
                jo0 jo0Var = (jo0) this.b;
                View view = (View) this.c;
                jo0Var.D0(false);
                view.callOnClick();
                break;
            case 25:
                jo0 jo0Var2 = (jo0) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.c;
                jo0Var2.H0(true, false);
                if (tL_error6 != null) {
                    if (tL_error6.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.j3 j3Var = jo0Var2.P;
                        try {
                            j3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(j3Var, 2.5f);
                        org.telegram.ui.Cells.j3 j3Var2 = jo0Var2.P;
                        j3Var2.a.setText("");
                        j3Var2.b = false;
                        j3Var2.setWillNotDraw(true);
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
                        int i26 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c3] = formatPluralString;
                        jo0Var2.F0(string, LocaleController.formatString("FloodWaitTime", i26, objArr));
                        break;
                    } else {
                        jo0Var2.F0(LocaleController.getString(R.string.AppName), tL_error6.text);
                        break;
                    }
                } else if (jo0Var2.getParentActivity() != null) {
                    in0 in0Var = jo0Var2.a0;
                    if (in0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(in0Var);
                        jo0Var2.a0 = null;
                    }
                    jo0Var2.t0();
                    break;
                }
                break;
            case 26:
                jo0.W((jo0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 27:
                jo0 jo0Var3 = (jo0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Context parentActivity = jo0Var3.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = ApplicationLoader.applicationContext;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.D1;
                }
                if (parentActivity != null) {
                    jo0Var3.X0 = true;
                    jo0Var3.c1 = 1;
                    TLRPC.InputInvoice inputInvoice = jo0Var3.Y0;
                    boolean z11 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z12 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z13 = z11 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z11 && (io0Var2 = jo0Var3.W0) != null) {
                        io0Var2.a(1);
                    }
                    jo0Var3.t0();
                    if (z11 && (io0Var = jo0Var3.W0) != null) {
                        io0Var.a(jo0Var3.c1);
                    }
                    long r02 = jo0Var3.r0();
                    if (r02 > 0) {
                        str = UserObject.getForcedFirstName(jo0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (r02 < 0) {
                        z4 = z12;
                        c10 = 0;
                        TLRPC.Chat chat = jo0Var3.getMessagesController().getChat(Long.valueOf(-r02));
                        if (chat != null) {
                            str = chat.title;
                        }
                        long q02 = jo0Var3.q0();
                        int i27 = !z11 ? (z4 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String string2 = z11 ? LocaleController.getString(z13 ? R.string.StarsGiveawaySentPopup : z4 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                        if (z11) {
                            int i28 = R.string.PaymentInfoHint;
                            String str8 = jo0Var3.O0[c10];
                            String str9 = jo0Var3.n0;
                            Object[] objArr2 = new Object[2];
                            objArr2[c10] = str8;
                            objArr2[1] = str9;
                            formatString = LocaleController.formatString(i28, objArr2);
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
                            org.telegram.ui.Components.ic M = (r02 == 0 || string2 == null || z13) ? string2 != null ? a02.M(string2, replaceTags, i27) : a02.Q(i27, 36, replaceTags) : a02.K(i27, string2, replaceTags, LocaleController.getString(R.string.ViewInChat), new lh.s9(r02, i16));
                            M.r = false;
                            M.j = 5000;
                            if (messageArr[0] != null) {
                                eg.e1 e1Var = new eg.e1(jo0Var3, M, z4, messageArr, 4);
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
                    long q022 = jo0Var3.q0();
                    int i272 = !z11 ? (z4 || z13) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
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
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                p31.T(photoViewer.B, photoViewer.j4, false, (nh.b) this.c, null);
                break;
            default:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ks0 ks0Var = (ks0) this.c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (ks0Var.getWindow() != null) {
                    ks0Var.setFocusable(true);
                    xn xnVar = photoViewer2.i4;
                    if (xnVar != null && (jkVar = xnVar.V) != null) {
                        jkVar.m0(false);
                        break;
                    }
                }
                break;
        }
    }
}
