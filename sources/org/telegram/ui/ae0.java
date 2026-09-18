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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ie0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ ae0(ie0 ie0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = ie0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                final ie0 ie0Var = this.b;
                fe0 fe0Var = ie0Var.a;
                yg0 yg0Var = ie0Var.W;
                yg0Var.k1(false, true);
                TLRPC.TL_error tL_error = this.c;
                String str = this.e;
                if (tL_error == null) {
                    ie0Var.E = false;
                    yg0Var.v1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ie0Var.I);
                    bundle.putString("ephone", ie0Var.J);
                    bundle.putString("phoneFormated", ie0Var.L);
                    bundle.putString("phoneHash", ie0Var.M);
                    bundle.putString("code", str);
                    TLObject tLObject = this.d;
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            yg0Var.p0 = tL_help_termsOfService;
                        }
                        final int i11 = 0;
                        ie0Var.o(new Runnable() { // from class: org.telegram.ui.de0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        ie0Var.W.u1(5, true, bundle, false);
                                        break;
                                    default:
                                        ie0Var.W.u1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        ie0Var.o(new xq(ie0Var, tLObject, bundle, 26));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new yd0(ie0Var, str, 1), 10);
                } else {
                    ie0Var.E = false;
                    yg0Var.v1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        be0 be0Var = ie0Var.S;
                        he0 he0Var = ie0Var.Q;
                        try {
                            fe0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            is[] isVarArr = fe0Var.f;
                            if (i12 < isVarArr.length) {
                                isVarArr[i12].setText("");
                                fe0Var.f[i12].i(1.0f);
                                i12++;
                            } else {
                                if (he0Var.getCurrentView() == ie0Var.e) {
                                    he0Var.showNext();
                                    AndroidUtilities.updateViewVisibilityAnimated(ie0Var.h, false, 1.0f, true);
                                }
                                fe0Var.f[0].requestFocus();
                                AndroidUtilities.shakeViewSpring(fe0Var, 10.0f, new be0(ie0Var, 3));
                                ie0Var.removeCallbacks(be0Var);
                                ie0Var.postDelayed(be0Var, 5000L);
                                ie0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        yg0Var.u1(0, true, null, true);
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else {
                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                    if (fe0Var.f != null) {
                        int i13 = 0;
                        while (true) {
                            is[] isVarArr2 = fe0Var.f;
                            if (i13 < isVarArr2.length) {
                                isVarArr2[i13].setText("");
                                i13++;
                            } else {
                                isVarArr2[0].requestFocus();
                            }
                        }
                    }
                    fe0Var.e = false;
                }
                ie0Var.F = null;
                break;
            default:
                final ie0 ie0Var2 = this.b;
                ie0Var2.E = false;
                yg0 yg0Var2 = ie0Var2.W;
                yg0Var2.v1(false, true);
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 != null) {
                    yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) this.d;
                    if (!TwoStepVerificationActivity.i0(password, true)) {
                        org.telegram.ui.Components.c5.x0(yg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", ie0Var2.L);
                        bundle2.putString("phoneHash", ie0Var2.M);
                        bundle2.putString("code", this.e);
                        final int i14 = 1;
                        ie0Var2.o(new Runnable() { // from class: org.telegram.ui.de0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        ie0Var2.W.u1(5, true, bundle2, false);
                                        break;
                                    default:
                                        ie0Var2.W.u1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ ae0(ie0 ie0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = ie0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
