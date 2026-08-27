package org.telegram.ui;

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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ff0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        char c10;
        String formatPluralString;
        int i12;
        ?? r52;
        String formatString;
        org.telegram.ui.ActionBar.n2 U;
        co0 co0Var;
        co0 co0Var2;
        ck ckVar;
        String str = "";
        int i13 = 1;
        switch (this.a) {
            case 0:
                mf0 mf0Var = (mf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                mf0Var.getClass();
                mf0Var.a0 = tL_error.text;
                break;
            case 1:
                ((mf0) this.b).o0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 2:
                mf0 mf0Var2 = (mf0) this.b;
                Runnable runnable = (Runnable) this.c;
                ur urVar = mf0Var2.f;
                int i14 = 0;
                while (true) {
                    wr[] wrVarArr = urVar.f;
                    if (i14 >= wrVarArr.length) {
                        runnable.run();
                        urVar.e = false;
                        break;
                    } else {
                        wrVarArr[i14].l(0.0f);
                        i14++;
                    }
                }
            case 3:
                ((x3) this.b).run((String) this.c);
                break;
            case 4:
                kh0 kh0Var = (kh0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                kh0Var.Y = false;
                if (tL_error2 == null) {
                    bh0 f02 = kh0Var.f0();
                    kh0Var.f0.clear();
                    kh0Var.h0(f02);
                    break;
                }
                break;
            case 5:
                ah0 ah0Var = (ah0) this.b;
                TLObject tLObject = (TLObject) this.c;
                kh0 kh0Var2 = ah0Var.a;
                bh0 f03 = kh0Var2.f0();
                kh0Var2.e0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = kh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    kh0Var2.getMessagesStorage().saveChatLinksCount(kh0Var2.n, kh0Var2.d.invitesCount);
                }
                kh0Var2.h0(f03);
                break;
            case 6:
                vi0 vi0Var = (vi0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (vi0Var.getParentActivity() != null) {
                    Toast.makeText(vi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 7:
                oj0 oj0Var = (oj0) this.b;
                String str2 = (String) this.c;
                oj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                oj0Var.getContext().startActivity(intent);
                break;
            case 8:
                oj0 oj0Var2 = (oj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                oj0Var2.dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 9:
                ((ib0) this.b).run((TLRPC.User) this.c);
                break;
            case 10:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (wr wrVar : passcodeActivity.n.f) {
                    wrVar.l(0.0f);
                }
                runnable2.run();
                break;
            case 12:
                xk0 xk0Var = (xk0) this.b;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                PasscodeActivity passcodeActivity2 = xk0Var.b;
                f1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                f1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.k0();
                if (passcodeActivity2.e0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 13:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                break;
            case 14:
                xm0 xm0Var = (xm0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = xm0Var.x;
                int i15 = result.type;
                if (i15 == 2) {
                    if (!(xm0Var.B.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = xm0Var.C.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) xm0Var.C.get(i16);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    xm0Var.B = tL_secureRequiredType;
                                    xm0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i15 == 1) {
                    if (!(xm0Var.B.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = xm0Var.C.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) xm0Var.C.get(i17);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    xm0Var.B = tL_secureRequiredType2;
                                    xm0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i15 == 3) {
                    if (!(xm0Var.B.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = xm0Var.C.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) xm0Var.C.get(i18);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    xm0Var.B = tL_secureRequiredType3;
                                    xm0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i15 == 4 && !(xm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = xm0Var.C.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) xm0Var.C.get(i19);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                xm0Var.B = tL_secureRequiredType4;
                                xm0Var.P1();
                            } else {
                                i19++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    xm0Var.U[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    xm0Var.U[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    xm0Var.U[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    xm0Var.U[7].setText(result.number);
                }
                int i20 = result.gender;
                if (i20 != 0) {
                    if (i20 == 1) {
                        xm0Var.w = "male";
                        xm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i20 == 2) {
                        xm0Var.w = "female";
                        xm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    xm0Var.s = str3;
                    String str4 = (String) xm0Var.U0.get(str3);
                    if (str4 != null) {
                        xm0Var.U[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    xm0Var.v = str5;
                    String str6 = (String) xm0Var.U0.get(str5);
                    if (str6 != null) {
                        xm0Var.U[6].setText(str6);
                    }
                }
                int i21 = result.birthDay;
                if (i21 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    xm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i22 = result.expiryDay;
                if (i22 <= 0 || (i10 = result.expiryMonth) <= 0 || (i11 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    xm0Var.U[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i11;
                    iArr[1] = i10;
                    iArr[2] = i22;
                    xm0Var.U[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
                break;
            case 15:
                xm0 xm0Var2 = (xm0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    xm0Var2.F = password;
                    if (TwoStepVerificationActivity.i0(password, false)) {
                        TwoStepVerificationActivity.m0(xm0Var2.F);
                        xm0Var2.R1();
                        if (xm0Var2.V[0].getVisibility() == 0) {
                            xm0Var2.U[0].requestFocus();
                            AndroidUtilities.showKeyboard(xm0Var2.U[0]);
                        }
                        if (xm0Var2.J0 == 1) {
                            xm0Var2.B1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.y4.x0(xm0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 16:
                xm0 xm0Var3 = (xm0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (tL_error3 == null) {
                    xm0Var3.b1 = true;
                    xm0Var3.W0(true);
                    xm0Var3.finishFragment();
                    break;
                } else {
                    xm0Var3.N1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error3.text)) {
                        org.telegram.ui.Components.y4.x0(xm0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        xm0Var3.M1(LocaleController.getString(R.string.AppName), tL_error3.text);
                        break;
                    }
                }
            case 17:
                ((sm0) this.b).a.G = ((TLRPC.TL_error) this.c).text;
                break;
            case 18:
                do0 do0Var = (do0) this.b;
                View view = (View) this.c;
                do0Var.D0(false);
                view.callOnClick();
                break;
            case 19:
                do0 do0Var2 = (do0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                do0Var2.H0(true, false);
                if (tL_error4 != null) {
                    if (tL_error4.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.h3 h3Var = do0Var2.O;
                        try {
                            h3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(h3Var, 2.5f);
                        org.telegram.ui.Cells.h3 h3Var2 = do0Var2.O;
                        h3Var2.a.setText("");
                        h3Var2.b = false;
                        h3Var2.setWillNotDraw(true);
                        break;
                    } else if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c10 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string = LocaleController.getString(R.string.AppName);
                        int i23 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c10] = formatPluralString;
                        do0Var2.F0(string, LocaleController.formatString("FloodWaitTime", i23, objArr));
                        break;
                    } else {
                        do0Var2.F0(LocaleController.getString(R.string.AppName), tL_error4.text);
                        break;
                    }
                } else if (do0Var2.getParentActivity() != null) {
                    cn0 cn0Var = do0Var2.Z;
                    if (cn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(cn0Var);
                        do0Var2.Z = null;
                    }
                    do0Var2.t0();
                    break;
                }
                break;
            case 20:
                do0.W((do0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 21:
                do0 do0Var3 = (do0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = do0Var3.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = ApplicationLoader.applicationContext;
                }
                if (obj == null) {
                    obj = LaunchActivity.C1;
                }
                if (obj != null) {
                    do0Var3.W0 = true;
                    do0Var3.b1 = 1;
                    TLRPC.InputInvoice inputInvoice = do0Var3.X0;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (co0Var2 = do0Var3.V0) != null) {
                        co0Var2.b(1);
                    }
                    do0Var3.t0();
                    if (z10 && (co0Var = do0Var3.V0) != null) {
                        co0Var.b(do0Var3.b1);
                    }
                    long r02 = do0Var3.r0();
                    int i24 = (r02 > 0L ? 1 : (r02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str = UserObject.getForcedFirstName(do0Var3.getMessagesController().getUser(Long.valueOf(r02)));
                    } else if (i24 < 0) {
                        i12 = i24;
                        r52 = 0;
                        r52 = 0;
                        TLRPC.Chat chat = do0Var3.getMessagesController().getChat(Long.valueOf(-r02));
                        if (chat != null) {
                            str = chat.title;
                        }
                        long q02 = do0Var3.q0();
                        int i25 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String string2 = z10 ? LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                        if (z10) {
                            int i26 = R.string.PaymentInfoHint;
                            String str7 = do0Var3.N0[r52];
                            String str8 = do0Var3.m0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r52] = str7;
                            objArr2[1] = str8;
                            formatString = LocaleController.formatString(i26, objArr2);
                        } else if (z12) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) q02);
                        } else {
                            String str9 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r52] = str;
                            formatString = LocaleController.formatPluralStringComma(str9, (int) q02, objArr3);
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                        U = LaunchActivity.U();
                        if (U == null) {
                            org.telegram.ui.Components.mc a02 = org.telegram.ui.Components.mc.a0(U);
                            org.telegram.ui.Components.ec M = (i12 == 0 || string2 == null || z12) ? string2 != null ? a02.M(string2, replaceTags, i25) : a02.Q(i25, 36, replaceTags) : a02.K(i25, string2, replaceTags, LocaleController.getString(R.string.ViewInChat), new hh.v9(r02, i13));
                            M.r = r52;
                            M.j = 5000;
                            if (messageArr[r52] != null) {
                                ag.u1 u1Var = new ag.u1(do0Var3, M, z11, messageArr, 4);
                                org.telegram.ui.Components.jb jbVar = M.e;
                                if (jbVar != null) {
                                    jbVar.setOnClickListener(u1Var);
                                }
                            }
                            M.k(z12);
                            break;
                        }
                    }
                    i12 = i24;
                    r52 = 0;
                    long q022 = do0Var3.q0();
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
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                c31.T(photoViewer.A, photoViewer.i4, false, (jh.b) this.c, null);
                break;
            case 23:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                es0 es0Var = (es0) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (es0Var.getWindow() != null) {
                    es0Var.setFocusable(true);
                    rn rnVar = photoViewer2.h4;
                    if (rnVar != null && (ckVar = rnVar.U) != null) {
                        ckVar.m0(false);
                        break;
                    }
                }
                break;
            case 24:
                gh.b1 b1Var = (gh.b1) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                b1Var.run(bitmap);
                break;
            case 25:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                zf.v0 v0Var = (zf.v0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                v0Var.e.h();
                v0Var.c.postRunnable(new tq0(19));
                photoViewer3.a0.removeView(photoViewer3.J1);
                break;
            case 26:
                org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.P8;
                if (x5Var != null) {
                    ArrayList arrayList = x5Var.h;
                    org.telegram.ui.Components.u5 u5Var = x5Var.n;
                    if (u5Var != null) {
                        arrayList.add(u5Var);
                    }
                    org.telegram.ui.Components.u5 u5Var2 = x5Var.r;
                    if (u5Var2 != null) {
                        arrayList.add(u5Var2);
                    }
                    org.telegram.ui.Components.u5 u5Var3 = x5Var.s;
                    if (u5Var3 != null) {
                        arrayList.add(u5Var3);
                    }
                    x5Var.n = new org.telegram.ui.Components.u5(bitmap2);
                    x5Var.r = null;
                    x5Var.s = null;
                    x5Var.t();
                    break;
                }
                break;
            case 27:
                fr0 fr0Var = (fr0) this.b;
                View view2 = (View) this.c;
                fr0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = fr0Var.c;
                ImageView imageView = photoViewer4.t3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                tt0 tt0Var = photoViewer4.A2;
                if (tt0Var != null) {
                    tt0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 28:
                ps0 ps0Var = (ps0) this.b;
                org.telegram.ui.Components.m61 m61Var = (org.telegram.ui.Components.m61) this.c;
                ps0Var.getClass();
                if (m61Var.q() > 0 && m61Var.o() >= m61Var.q() - 590) {
                    ps0Var.a.a0.invalidate();
                    break;
                }
                break;
            default:
                ts0 ts0Var = (ts0) this.b;
                zf.v0 v0Var2 = (zf.v0) this.c;
                v0Var2.e.h();
                v0Var2.c.postRunnable(new tq0(19));
                try {
                    ts0Var.b.a0.removeView(v0Var2);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
        }
    }
}
