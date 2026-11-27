// default package

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mf6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sf6 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ mf6(sf6 sf6Var, TLRPC.TL_auth_signIn tL_auth_signIn, byte b) {
        this.a = b;
        this.b = sf6Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final byte b = 0;
                final sf6 sf6Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                hl.c3(new Runnable() { // from class: of6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b2 = b;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        sf6 sf6Var2 = sf6Var;
                        byte b3 = 1;
                        byte b4 = 0;
                        switch (b2) {
                            case 0:
                                byte b5 = sf6Var2.a;
                                m7 m7Var = sf6Var2.c;
                                qh6 qh6Var = sf6Var2.b0;
                                qh6Var.y1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        sf6Var2.S = false;
                                        if (b5 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                sf6Var2.r(false);
                                                m7Var.post(new qf6(sf6Var2, b4));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                sf6Var2.c(true);
                                                qh6Var.J1(0, true, null, true);
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                                            } else {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                            m7Var.setText("");
                                            m7Var.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i = ((e) qh6Var).currentAccount;
                                        ConnectionsManager.getInstance(i).sendRequest(getpassword, new mf6(sf6Var2, tL_auth_signIn2, b3), 10);
                                        sf6Var2.q();
                                    }
                                } else {
                                    sf6Var2.S = false;
                                    qh6Var.K1(false, true);
                                    sf6Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qh6Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", sf6Var2.H);
                                        bundle.putString("phoneHash", sf6Var2.I);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        qh6Var.J1(5, true, bundle, false);
                                    } else {
                                        qh6Var.C1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (b5 == 3) {
                                    hl.T();
                                    hl.x3(false);
                                    break;
                                }
                                break;
                            default:
                                sf6Var2.S = false;
                                qh6 qh6Var2 = sf6Var2.b0;
                                qh6Var2.K1(false, true);
                                if (tL_error2 != null) {
                                    qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", sf6Var2.H);
                                        bundle2.putString("phoneHash", sf6Var2.I);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        qh6Var2.J1(6, true, bundle2, false);
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
            default:
                final byte b2 = 1;
                final sf6 sf6Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                hl.c3(new Runnable() { // from class: of6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b22 = b2;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        sf6 sf6Var22 = sf6Var2;
                        byte b3 = 1;
                        byte b4 = 0;
                        switch (b22) {
                            case 0:
                                byte b5 = sf6Var22.a;
                                m7 m7Var = sf6Var22.c;
                                qh6 qh6Var = sf6Var22.b0;
                                qh6Var.y1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        sf6Var22.S = false;
                                        if (b5 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                sf6Var22.r(false);
                                                m7Var.post(new qf6(sf6Var22, b4));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                sf6Var22.c(true);
                                                qh6Var.J1(0, true, null, true);
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                                            } else {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                            m7Var.setText("");
                                            m7Var.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i = ((e) qh6Var).currentAccount;
                                        ConnectionsManager.getInstance(i).sendRequest(getpassword, new mf6(sf6Var22, tL_auth_signIn22, b3), 10);
                                        sf6Var22.q();
                                    }
                                } else {
                                    sf6Var22.S = false;
                                    qh6Var.K1(false, true);
                                    sf6Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qh6Var.s0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", sf6Var22.H);
                                        bundle.putString("phoneHash", sf6Var22.I);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        qh6Var.J1(5, true, bundle, false);
                                    } else {
                                        qh6Var.C1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (b5 == 3) {
                                    hl.T();
                                    hl.x3(false);
                                    break;
                                }
                                break;
                            default:
                                sf6Var22.S = false;
                                qh6 qh6Var2 = sf6Var22.b0;
                                qh6Var2.K1(false, true);
                                if (tL_error2 != null) {
                                    qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        jj.u0(qh6Var2.getParentActivity(), ob6.M0(2131743475, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", sf6Var22.H);
                                        bundle2.putString("phoneHash", sf6Var22.I);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        qh6Var2.J1(6, true, bundle2, false);
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
