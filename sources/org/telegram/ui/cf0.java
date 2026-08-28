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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cf0(int i9, Object obj, Object obj2) {
        this.a = i9;
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
        int i9;
        int i10;
        char c10;
        String formatPluralString;
        int i11;
        ?? r52;
        String formatString;
        org.telegram.ui.ActionBar.o2 U;
        bo0 bo0Var;
        bo0 bo0Var2;
        ak akVar;
        String str = "";
        int i12 = 18;
        int i13 = 1;
        switch (this.a) {
            case 0:
                jf0 jf0Var = (jf0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                jf0Var.getClass();
                jf0Var.a0 = tL_error.text;
                break;
            case 1:
                ((jf0) this.b).o0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.c), false);
                break;
            case 2:
                jf0 jf0Var2 = (jf0) this.b;
                Runnable runnable = (Runnable) this.c;
                sr srVar = jf0Var2.f;
                int i14 = 0;
                while (true) {
                    vr[] vrVarArr = srVar.f;
                    if (i14 >= vrVarArr.length) {
                        runnable.run();
                        srVar.e = false;
                        break;
                    } else {
                        vrVarArr[i14].l(0.0f);
                        i14++;
                    }
                }
            case 3:
                ((w3) this.b).run((String) this.c);
                break;
            case 4:
                hh0 hh0Var = (hh0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                hh0Var.Y = false;
                if (tL_error2 == null) {
                    yg0 e02 = hh0Var.e0();
                    hh0Var.f0.clear();
                    hh0Var.g0(e02);
                    break;
                }
                break;
            case 5:
                xg0 xg0Var = (xg0) this.b;
                TLObject tLObject = (TLObject) this.c;
                hh0 hh0Var2 = xg0Var.a;
                yg0 e03 = hh0Var2.e0();
                hh0Var2.e0.add(0, (TLRPC.TL_chatInviteExported) tLObject);
                TLRPC.ChatFull chatFull = hh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    hh0Var2.getMessagesStorage().saveChatLinksCount(hh0Var2.n, hh0Var2.d.invitesCount);
                }
                hh0Var2.g0(e03);
                break;
            case 6:
                ti0 ti0Var = (ti0) this.b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.c;
                if (ti0Var.getParentActivity() != null) {
                    Toast.makeText(ti0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    break;
                }
                break;
            case 7:
                nj0 nj0Var = (nj0) this.b;
                String str2 = (String) this.c;
                nj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + str2));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                nj0Var.getContext().startActivity(intent);
                break;
            case 8:
                nj0 nj0Var2 = (nj0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                nj0Var2.dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(user.id));
                    break;
                }
                break;
            case 9:
                ((eb0) this.b).run((TLRPC.User) this.c);
                break;
            case 10:
                NotificationsCustomSettingsActivity.V((NotificationsCustomSettingsActivity) this.b, (ArrayList) this.c);
                break;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                Runnable runnable2 = (Runnable) this.c;
                for (vr vrVar : passcodeActivity.n.f) {
                    vrVar.l(0.0f);
                }
                runnable2.run();
                break;
            case 12:
                xk0 xk0Var = (xk0) this.b;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                PasscodeActivity passcodeActivity2 = xk0Var.b;
                g1Var.setText(LocaleController.getString(passcodeActivity2.y == 0 ? R.string.PasscodeSwitchToPassword : R.string.PasscodeSwitchToPIN));
                g1Var.setIcon(passcodeActivity2.y == 0 ? R.drawable.msg_permissions : R.drawable.msg_pin_code);
                passcodeActivity2.j0();
                if (passcodeActivity2.d0()) {
                    passcodeActivity2.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity2.s, true, 0.1f, false);
                    break;
                }
                break;
            case 13:
                ((PasskeysActivity) this.b).X((TL_account.Passkey) this.c);
                break;
            case 14:
                wm0 wm0Var = (wm0) this.b;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.c;
                int[] iArr = wm0Var.x;
                int i15 = result.type;
                if (i15 == 2) {
                    if (!(wm0Var.B.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size = wm0Var.C.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) wm0Var.C.get(i16);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    wm0Var.B = tL_secureRequiredType;
                                    wm0Var.P1();
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                } else if (i15 == 1) {
                    if (!(wm0Var.B.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size2 = wm0Var.C.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) wm0Var.C.get(i17);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    wm0Var.B = tL_secureRequiredType2;
                                    wm0Var.P1();
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                } else if (i15 == 3) {
                    if (!(wm0Var.B.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size3 = wm0Var.C.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) wm0Var.C.get(i18);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    wm0Var.B = tL_secureRequiredType3;
                                    wm0Var.P1();
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                } else if (i15 == 4 && !(wm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size4 = wm0Var.C.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size4) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) wm0Var.C.get(i19);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                wm0Var.B = tL_secureRequiredType4;
                                wm0Var.P1();
                            } else {
                                i19++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(result.firstName)) {
                    wm0Var.U[0].setText(result.firstName);
                }
                if (!TextUtils.isEmpty(result.middleName)) {
                    wm0Var.U[1].setText(result.middleName);
                }
                if (!TextUtils.isEmpty(result.lastName)) {
                    wm0Var.U[2].setText(result.lastName);
                }
                if (!TextUtils.isEmpty(result.number)) {
                    wm0Var.U[7].setText(result.number);
                }
                int i20 = result.gender;
                if (i20 != 0) {
                    if (i20 == 1) {
                        wm0Var.w = "male";
                        wm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    } else if (i20 == 2) {
                        wm0Var.w = "female";
                        wm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                    }
                }
                if (!TextUtils.isEmpty(result.nationality)) {
                    String str3 = result.nationality;
                    wm0Var.s = str3;
                    String str4 = (String) wm0Var.U0.get(str3);
                    if (str4 != null) {
                        wm0Var.U[5].setText(str4);
                    }
                }
                if (!TextUtils.isEmpty(result.issuingCountry)) {
                    String str5 = result.issuingCountry;
                    wm0Var.v = str5;
                    String str6 = (String) wm0Var.U0.get(str5);
                    if (str6 != null) {
                        wm0Var.U[6].setText(str6);
                    }
                }
                int i21 = result.birthDay;
                if (i21 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
                    wm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i21), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
                }
                int i22 = result.expiryDay;
                if (i22 <= 0 || (i9 = result.expiryMonth) <= 0 || (i10 = result.expiryYear) <= 0) {
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    wm0Var.U[8].setText(LocaleController.getString(R.string.PassportNoExpireDate));
                    break;
                } else {
                    iArr[0] = i10;
                    iArr[1] = i9;
                    iArr[2] = i22;
                    wm0Var.U[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i22), Integer.valueOf(result.expiryMonth), Integer.valueOf(result.expiryYear)));
                    break;
                }
                break;
            case 15:
                wm0 wm0Var2 = (wm0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    wm0Var2.F = password;
                    if (TwoStepVerificationActivity.h0(password, false)) {
                        TwoStepVerificationActivity.l0(wm0Var2.F);
                        wm0Var2.R1();
                        if (wm0Var2.V[0].getVisibility() == 0) {
                            wm0Var2.U[0].requestFocus();
                            AndroidUtilities.showKeyboard(wm0Var2.U[0]);
                        }
                        if (wm0Var2.J0 == 1) {
                            wm0Var2.B1(true);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.y4.x0(wm0Var2.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    }
                }
                break;
            case 16:
                wm0 wm0Var3 = (wm0) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                if (tL_error3 == null) {
                    wm0Var3.b1 = true;
                    wm0Var3.W0(true);
                    wm0Var3.finishFragment();
                    break;
                } else {
                    wm0Var3.N1(false, false);
                    if ("APP_VERSION_OUTDATED".equals(tL_error3.text)) {
                        org.telegram.ui.Components.y4.x0(wm0Var3.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        wm0Var3.M1(LocaleController.getString(R.string.AppName), tL_error3.text);
                        break;
                    }
                }
            case 17:
                ((rm0) this.b).a.G = ((TLRPC.TL_error) this.c).text;
                break;
            case 18:
                co0 co0Var = (co0) this.b;
                View view = (View) this.c;
                co0Var.C0(false);
                view.callOnClick();
                break;
            case 19:
                co0 co0Var2 = (co0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                co0Var2.G0(true, false);
                if (tL_error4 != null) {
                    if (tL_error4.text.startsWith("CODE_INVALID")) {
                        org.telegram.ui.Cells.k3 k3Var = co0Var2.O;
                        try {
                            k3Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AndroidUtilities.shakeViewSpring(k3Var, 2.5f);
                        org.telegram.ui.Cells.k3 k3Var2 = co0Var2.O;
                        k3Var2.a.setText("");
                        k3Var2.b = false;
                        k3Var2.setWillNotDraw(true);
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
                        co0Var2.E0(string, LocaleController.formatString("FloodWaitTime", i23, objArr));
                        break;
                    } else {
                        co0Var2.E0(LocaleController.getString(R.string.AppName), tL_error4.text);
                        break;
                    }
                } else if (co0Var2.getParentActivity() != null) {
                    bn0 bn0Var = co0Var2.Z;
                    if (bn0Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(bn0Var);
                        co0Var2.Z = null;
                    }
                    co0Var2.s0();
                    break;
                }
                break;
            case 20:
                co0.V((co0) this.b, (TLRPC.TL_payments_validatedRequestedInfo) this.c);
                break;
            case 21:
                co0 co0Var3 = (co0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = co0Var3.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = ApplicationLoader.applicationContext;
                }
                if (obj == null) {
                    obj = LaunchActivity.C1;
                }
                if (obj != null) {
                    co0Var3.W0 = true;
                    co0Var3.b1 = 1;
                    TLRPC.InputInvoice inputInvoice = co0Var3.X0;
                    boolean z10 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z11 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z12 = z10 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z10 && (bo0Var2 = co0Var3.V0) != null) {
                        bo0Var2.b(1);
                    }
                    co0Var3.s0();
                    if (z10 && (bo0Var = co0Var3.V0) != null) {
                        bo0Var.b(co0Var3.b1);
                    }
                    long q02 = co0Var3.q0();
                    int i24 = (q02 > 0L ? 1 : (q02 == 0L ? 0 : -1));
                    if (i24 > 0) {
                        str = UserObject.getForcedFirstName(co0Var3.getMessagesController().getUser(Long.valueOf(q02)));
                    } else if (i24 < 0) {
                        i11 = i24;
                        r52 = 0;
                        r52 = 0;
                        TLRPC.Chat chat = co0Var3.getMessagesController().getChat(Long.valueOf(-q02));
                        if (chat != null) {
                            str = chat.title;
                        }
                        long p02 = co0Var3.p0();
                        int i25 = !z10 ? (z11 || z12) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String string2 = z10 ? LocaleController.getString(z12 ? R.string.StarsGiveawaySentPopup : z11 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired) : null;
                        if (z10) {
                            int i26 = R.string.PaymentInfoHint;
                            String str7 = co0Var3.N0[r52];
                            String str8 = co0Var3.m0;
                            Object[] objArr2 = new Object[2];
                            objArr2[r52] = str7;
                            objArr2[1] = str8;
                            formatString = LocaleController.formatString(i26, objArr2);
                        } else if (z12) {
                            formatString = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) p02);
                        } else {
                            String str9 = z11 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[r52] = str;
                            formatString = LocaleController.formatPluralStringComma(str9, (int) p02, objArr3);
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatString);
                        U = LaunchActivity.U();
                        if (U == null) {
                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(U);
                            org.telegram.ui.Components.gc M = (i11 == 0 || string2 == null || z12) ? string2 != null ? a02.M(string2, replaceTags, i25) : a02.Q(i25, 36, replaceTags) : a02.K(i25, string2, replaceTags, LocaleController.getString(R.string.ViewInChat), new gh.w9(q02, i13));
                            M.r = r52;
                            M.j = 5000;
                            if (messageArr[r52] != null) {
                                ih.t3 t3Var = new ih.t3(co0Var3, M, z11, messageArr, 3);
                                org.telegram.ui.Components.lb lbVar = M.e;
                                if (lbVar != null) {
                                    lbVar.setOnClickListener(t3Var);
                                }
                            }
                            M.k(z12);
                            break;
                        }
                    }
                    i11 = i24;
                    r52 = 0;
                    long p022 = co0Var3.p0();
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
                d31.S(photoViewer.A, photoViewer.i4, false, (ih.b) this.c, null);
                break;
            case 23:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ds0 ds0Var = (ds0) this.c;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (ds0Var.getWindow() != null) {
                    ds0Var.setFocusable(true);
                    qn qnVar = photoViewer2.h4;
                    if (qnVar != null && (akVar = qnVar.U) != null) {
                        akVar.l0(false);
                        break;
                    }
                }
                break;
            case 24:
                fh.d1 d1Var = (fh.d1) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.P8;
                d1Var.run(bitmap);
                break;
            case 25:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                yf.v0 v0Var = (yf.v0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.P8;
                v0Var.e.h();
                v0Var.c.postRunnable(new lj0(i12));
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
                dr0 dr0Var = (dr0) this.b;
                View view2 = (View) this.c;
                dr0Var.getClass();
                view2.setOutlineProvider(null);
                PhotoViewer photoViewer4 = dr0Var.c;
                ImageView imageView = photoViewer4.t3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                st0 st0Var = photoViewer4.A2;
                if (st0Var != null) {
                    st0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 28:
                os0 os0Var = (os0) this.b;
                org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) this.c;
                os0Var.getClass();
                if (k61Var.q() > 0 && k61Var.o() >= k61Var.q() - 590) {
                    os0Var.a.a0.invalidate();
                    break;
                }
                break;
            default:
                ss0 ss0Var = (ss0) this.b;
                yf.v0 v0Var2 = (yf.v0) this.c;
                v0Var2.e.h();
                v0Var2.c.postRunnable(new lj0(i12));
                try {
                    ss0Var.b.a0.removeView(v0Var2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
