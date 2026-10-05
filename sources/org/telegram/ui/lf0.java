package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ lf0(xf0 xf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.a = i10;
        this.b = xf0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final xf0 xf0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.of0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        int i13;
                        int i14;
                        switch (i10) {
                            case 0:
                                final xf0 xf0Var2 = xf0Var;
                                int i15 = xf0Var2.f0;
                                ug0 ug0Var = xf0Var2.s0;
                                xf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    xf0Var2.e0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        xf0Var2.d0 = false;
                                        ug0Var.v1(false, true);
                                        if ((i15 == 3 && ((i13 = xf0Var2.g0) == 4 || i13 == 2 || i13 == 17 || i13 == 16)) || ((i15 == 2 && ((i12 = xf0Var2.g0) == 4 || i12 == 3)) || (i15 == 4 && ((i11 = xf0Var2.g0) == 2 || i11 == 17 || i11 == 16)))) {
                                            xf0Var2.u();
                                        }
                                        if (i15 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(xf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(xf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(xf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(24));
                                        }
                                        xf0Var2.c0 = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                xf0Var2.y();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                xf0Var2.c(true);
                                                ug0Var.u1(0, true, null, true);
                                                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                cs csVar = xf0Var2.f;
                                                es[] esVarArr = csVar.f;
                                                if (i16 >= esVarArr.length) {
                                                    csVar.e = false;
                                                    esVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    esVarArr[i16].setText("");
                                                    i16++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i14 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(getpassword, new lf0(xf0Var2, tL_auth_signIn2, 1), 10);
                                        xf0Var2.w();
                                        xf0Var2.v();
                                    }
                                } else {
                                    xf0Var2.d0 = false;
                                    ug0Var.v1(false, true);
                                    xf0Var2.w();
                                    xf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ug0Var.p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", xf0Var2.d);
                                        bundle.putString("phoneHash", xf0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        final int i17 = 0;
                                        xf0Var2.q(new Runnable() { // from class: org.telegram.ui.rf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        xf0Var2.s0.u1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        xf0Var2.s0.u1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        xf0Var2.q(new h90(22, xf0Var2, tLObject2));
                                    }
                                }
                                if (i15 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                final xf0 xf0Var3 = xf0Var;
                                xf0Var3.d0 = false;
                                ug0 ug0Var2 = xf0Var3.s0;
                                ug0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(ug0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", xf0Var3.d);
                                        bundle2.putString("phoneHash", xf0Var3.c);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        final int i18 = 1;
                                        xf0Var3.q(new Runnable() { // from class: org.telegram.ui.rf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        xf0Var3.s0.u1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        xf0Var3.s0.u1(6, true, bundle2, false);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final xf0 xf0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.of0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        int i13;
                        int i14;
                        switch (i11) {
                            case 0:
                                final xf0 xf0Var22 = xf0Var2;
                                int i15 = xf0Var22.f0;
                                ug0 ug0Var = xf0Var22.s0;
                                xf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    xf0Var22.e0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        xf0Var22.d0 = false;
                                        ug0Var.v1(false, true);
                                        if ((i15 == 3 && ((i13 = xf0Var22.g0) == 4 || i13 == 2 || i13 == 17 || i13 == 16)) || ((i15 == 2 && ((i12 = xf0Var22.g0) == 4 || i12 == 3)) || (i15 == 4 && ((i112 = xf0Var22.g0) == 2 || i112 == 17 || i112 == 16)))) {
                                            xf0Var22.u();
                                        }
                                        if (i15 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(xf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(xf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i15 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(xf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(24));
                                        }
                                        xf0Var22.c0 = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                xf0Var22.y();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                xf0Var22.c(true);
                                                ug0Var.u1(0, true, null, true);
                                                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ug0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                cs csVar = xf0Var22.f;
                                                es[] esVarArr = csVar.f;
                                                if (i16 >= esVarArr.length) {
                                                    csVar.e = false;
                                                    esVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    esVarArr[i16].setText("");
                                                    i16++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i14 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(getpassword, new lf0(xf0Var22, tL_auth_signIn22, 1), 10);
                                        xf0Var22.w();
                                        xf0Var22.v();
                                    }
                                } else {
                                    xf0Var22.d0 = false;
                                    ug0Var.v1(false, true);
                                    xf0Var22.w();
                                    xf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ug0Var.p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", xf0Var22.d);
                                        bundle.putString("phoneHash", xf0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        final int i17 = 0;
                                        xf0Var22.q(new Runnable() { // from class: org.telegram.ui.rf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        xf0Var22.s0.u1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        xf0Var22.s0.u1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        xf0Var22.q(new h90(22, xf0Var22, tLObject2));
                                    }
                                }
                                if (i15 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                final xf0 xf0Var3 = xf0Var2;
                                xf0Var3.d0 = false;
                                ug0 ug0Var2 = xf0Var3.s0;
                                ug0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(ug0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", xf0Var3.d);
                                        bundle2.putString("phoneHash", xf0Var3.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        final int i18 = 1;
                                        xf0Var3.q(new Runnable() { // from class: org.telegram.ui.rf0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i18) {
                                                    case 0:
                                                        xf0Var3.s0.u1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        xf0Var3.s0.u1(6, true, bundle2, false);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
        }
    }
}
