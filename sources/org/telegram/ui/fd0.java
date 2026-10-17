package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ od0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ fd0(od0 od0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = od0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final od0 od0Var = this.b;
                kd0 kd0Var = od0Var.a;
                fg0 fg0Var = od0Var.W;
                fg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    od0Var.E = false;
                    fg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", od0Var.I);
                    bundle.putString("ephone", od0Var.J);
                    bundle.putString("phoneFormated", od0Var.L);
                    bundle.putString("phoneHash", od0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            fg0Var.p0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        od0Var.o(new Runnable() { // from class: org.telegram.ui.id0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        od0Var.W.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        od0Var.W.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        od0Var.o(new lq(od0Var, tLObject, bundle, 27));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) fg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new dd0(od0Var, str, 1), 10);
                } else {
                    od0Var.E = false;
                    fg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        gd0 gd0Var = od0Var.S;
                        nd0 nd0Var = od0Var.Q;
                        try {
                            kd0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            vr[] vrVarArr = kd0Var.f;
                            if (i12 < vrVarArr.length) {
                                vrVarArr[i12].setText("");
                                kd0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (nd0Var.getCurrentView() == od0Var.e) {
                                    nd0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(od0Var.h, false, 1.0f, true);
                                }
                                kd0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(kd0Var, 10.0f, new gd0(od0Var, 3));
                                od0Var.removeCallbacks(gd0Var);
                                od0Var.postDelayed(gd0Var, 5000L);
                                od0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        fg0Var.u1(0, true, null, true);
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (kd0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            vr[] vrVarArr2 = kd0Var.f;
                            if (i13 < vrVarArr2.length) {
                                vrVarArr2[i13].setText("");
                                i13++;
                            } else {
                                vrVarArr2[0].requestFocus();
                            }
                        }
                    }
                    kd0Var.e = false;
                }
                od0Var.F = null;
                break;
            default:
                final od0 od0Var2 = this.b;
                od0Var2.E = false;
                fg0 fg0Var2 = od0Var2.W;
                fg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.f5.w0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", od0Var2.L);
                        bundle2.putString("phoneHash", od0Var2.M);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        od0Var2.o(new Runnable() { // from class: org.telegram.ui.id0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        od0Var2.W.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        od0Var2.W.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ fd0(od0 od0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = od0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
