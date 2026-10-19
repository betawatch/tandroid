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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ md0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ dd0(md0 md0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = md0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final md0 md0Var = this.b;
                id0 id0Var = md0Var.a;
                dg0 dg0Var = md0Var.W;
                dg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    md0Var.E = false;
                    dg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", md0Var.I);
                    bundle.putString("ephone", md0Var.J);
                    bundle.putString("phoneFormated", md0Var.L);
                    bundle.putString("phoneHash", md0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            dg0Var.p0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        md0Var.o(new Runnable() { // from class: org.telegram.ui.gd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        md0Var.W.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        md0Var.W.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        md0Var.o(new jq(md0Var, tLObject, bundle, 27));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new bd0(md0Var, str, 1), 10);
                } else {
                    md0Var.E = false;
                    dg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        ed0 ed0Var = md0Var.S;
                        ld0 ld0Var = md0Var.Q;
                        try {
                            id0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            tr[] trVarArr = id0Var.f;
                            if (i12 < trVarArr.length) {
                                trVarArr[i12].setText("");
                                id0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (ld0Var.getCurrentView() == md0Var.e) {
                                    ld0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(md0Var.h, false, 1.0f, true);
                                }
                                id0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(id0Var, 10.0f, new ed0(md0Var, 3));
                                md0Var.removeCallbacks(ed0Var);
                                md0Var.postDelayed(ed0Var, 5000L);
                                md0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        dg0Var.u1(0, true, null, true);
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        dg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (id0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            tr[] trVarArr2 = id0Var.f;
                            if (i13 < trVarArr2.length) {
                                trVarArr2[i13].setText("");
                                i13++;
                            } else {
                                trVarArr2[0].requestFocus();
                            }
                        }
                    }
                    id0Var.e = false;
                }
                md0Var.F = null;
                break;
            default:
                final md0 md0Var2 = this.b;
                md0Var2.E = false;
                dg0 dg0Var2 = md0Var2.W;
                dg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    dg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.f5.w0(dg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", md0Var2.L);
                        bundle2.putString("phoneHash", md0Var2.M);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        md0Var2.o(new Runnable() { // from class: org.telegram.ui.gd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        md0Var2.W.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        md0Var2.W.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ dd0(md0 md0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = md0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
