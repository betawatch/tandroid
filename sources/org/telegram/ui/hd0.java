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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pd0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ hd0(pd0 pd0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = pd0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final pd0 pd0Var = this.b;
                md0 md0Var = pd0Var.a;
                fg0 fg0Var = pd0Var.S;
                fg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    pd0Var.A = false;
                    fg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", pd0Var.E);
                    bundle.putString("ephone", pd0Var.F);
                    bundle.putString("phoneFormated", pd0Var.H);
                    bundle.putString("phoneHash", pd0Var.I);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            fg0Var.l0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        pd0Var.o(new Runnable() { // from class: org.telegram.ui.kd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        pd0Var.S.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        pd0Var.S.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        pd0Var.o(new lq(pd0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new fd0(pd0Var, str, 1), 10);
                } else {
                    pd0Var.A = false;
                    fg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        id0 id0Var = pd0Var.O;
                        od0 od0Var = pd0Var.M;
                        try {
                            md0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            ur[] urVarArr = md0Var.f;
                            if (i12 < urVarArr.length) {
                                urVarArr[i12].setText("");
                                md0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (od0Var.getCurrentView() == pd0Var.e) {
                                    od0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(pd0Var.h, false, 1.0f, true);
                                }
                                md0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(md0Var, 10.0f, new id0(pd0Var, 3));
                                pd0Var.removeCallbacks(id0Var);
                                pd0Var.postDelayed(id0Var, 5000L);
                                pd0Var.N = true;
                            }
                        }
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
                    if (md0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            ur[] urVarArr2 = md0Var.f;
                            if (i13 < urVarArr2.length) {
                                urVarArr2[i13].setText("");
                                i13++;
                            } else {
                                urVarArr2[0].requestFocus();
                            }
                        }
                    }
                    md0Var.e = false;
                }
                pd0Var.B = null;
                break;
            default:
                final pd0 pd0Var2 = this.b;
                pd0Var2.A = false;
                fg0 fg0Var2 = pd0Var2.S;
                fg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.c5.x0(fg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", pd0Var2.H);
                        bundle2.putString("phoneHash", pd0Var2.I);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        pd0Var2.o(new Runnable() { // from class: org.telegram.ui.kd0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        pd0Var2.S.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        pd0Var2.S.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ hd0(pd0 pd0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = pd0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
