package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ be0(ie0 ie0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.a = i10;
        this.b = ie0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ie0 ie0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        switch (i10) {
                            case 0:
                                ie0 ie0Var2 = ie0Var;
                                int i12 = ie0Var2.a;
                                fi.c2 c2Var = ie0Var2.c;
                                ig0 ig0Var = ie0Var2.a0;
                                ig0Var.p1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        ie0Var2.R = false;
                                        if (i12 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                ie0Var2.r(false);
                                                c2Var.post(new fe0(ie0Var2, 0));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ie0Var2.c(true);
                                                ig0Var.z1(0, true, null, true);
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            c2Var.setText("");
                                            c2Var.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i11 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        ConnectionsManager.getInstance(i11).sendRequest(getpassword, new be0(ie0Var2, tL_auth_signIn2, 1), 10);
                                        ie0Var2.q();
                                    }
                                } else {
                                    ie0Var2.R = false;
                                    ig0Var.A1(false, true);
                                    ie0Var2.q();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ie0Var2.G);
                                        bundle.putString("phoneHash", ie0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        ig0Var.z1(5, true, bundle, false);
                                    } else {
                                        ig0Var.t1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i12 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                ie0 ie0Var3 = ie0Var;
                                ie0Var3.R = false;
                                ig0 ig0Var2 = ie0Var3.a0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", ie0Var3.G);
                                        bundle2.putString("phoneHash", ie0Var3.H);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        ig0Var2.z1(6, true, bundle2, false);
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final ie0 ie0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.de0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        switch (i11) {
                            case 0:
                                ie0 ie0Var22 = ie0Var2;
                                int i12 = ie0Var22.a;
                                fi.c2 c2Var = ie0Var22.c;
                                ig0 ig0Var = ie0Var22.a0;
                                ig0Var.p1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        ie0Var22.R = false;
                                        if (i12 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                ie0Var22.r(false);
                                                c2Var.post(new fe0(ie0Var22, 0));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ie0Var22.c(true);
                                                ig0Var.z1(0, true, null, true);
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            c2Var.setText("");
                                            c2Var.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i112 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                                        ConnectionsManager.getInstance(i112).sendRequest(getpassword, new be0(ie0Var22, tL_auth_signIn22, 1), 10);
                                        ie0Var22.q();
                                    }
                                } else {
                                    ie0Var22.R = false;
                                    ig0Var.A1(false, true);
                                    ie0Var22.q();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ie0Var22.G);
                                        bundle.putString("phoneHash", ie0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        ig0Var.z1(5, true, bundle, false);
                                    } else {
                                        ig0Var.t1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i12 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    break;
                                }
                                break;
                            default:
                                ie0 ie0Var3 = ie0Var2;
                                ie0Var3.R = false;
                                ig0 ig0Var2 = ie0Var3.a0;
                                ig0Var2.A1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.j0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", ie0Var3.G);
                                        bundle2.putString("phoneHash", ie0Var3.H);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        ig0Var2.z1(6, true, bundle2, false);
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
