package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ ed0(kd0 kd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.a = i10;
        this.b = kd0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final kd0 kd0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.gd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12 = i10;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        kd0 kd0Var2 = kd0Var;
                        int i13 = 1;
                        int i14 = 0;
                        switch (i12) {
                            case 0:
                                int i15 = kd0Var2.a;
                                org.telegram.ui.ActionBar.n0 n0Var = kd0Var2.c;
                                gf0 gf0Var = kd0Var2.a0;
                                gf0Var.t1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        kd0Var2.R = false;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                kd0Var2.r(false);
                                                n0Var.post(new id0(kd0Var2, i14));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                kd0Var2.c(true);
                                                gf0Var.D1(0, true, null, true);
                                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                                            } else {
                                                String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.a30.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                gf0Var.u1(L0, sb2.toString());
                                            }
                                            n0Var.setText("");
                                            n0Var.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i11 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                        ConnectionsManager.getInstance(i11).sendRequest(getpassword, new ed0(kd0Var2, tL_auth_signIn2, i13), 10);
                                        kd0Var2.q();
                                    }
                                } else {
                                    kd0Var2.R = false;
                                    gf0Var.E1(false, true);
                                    kd0Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gf0Var.q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", kd0Var2.G);
                                        bundle.putString("phoneHash", kd0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        gf0Var.D1(5, true, bundle, false);
                                    } else {
                                        gf0Var.x1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i15 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    break;
                                }
                                break;
                            default:
                                kd0Var2.R = false;
                                gf0 gf0Var2 = kd0Var2.a0;
                                gf0Var2.E1(false, true);
                                if (tL_error2 != null) {
                                    gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", kd0Var2.G);
                                        bundle2.putString("phoneHash", kd0Var2.H);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        gf0Var2.D1(6, true, bundle2, false);
                                        break;
                                    }
                                }
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final kd0 kd0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.gd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12 = i11;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        kd0 kd0Var22 = kd0Var2;
                        int i13 = 1;
                        int i14 = 0;
                        switch (i12) {
                            case 0:
                                int i15 = kd0Var22.a;
                                org.telegram.ui.ActionBar.n0 n0Var = kd0Var22.c;
                                gf0 gf0Var = kd0Var22.a0;
                                gf0Var.t1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        kd0Var22.R = false;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                kd0Var22.r(false);
                                                n0Var.post(new id0(kd0Var22, i14));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                kd0Var22.c(true);
                                                gf0Var.D1(0, true, null, true);
                                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                                            } else {
                                                String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.a30.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                gf0Var.u1(L0, sb2.toString());
                                            }
                                            n0Var.setText("");
                                            n0Var.requestFocus();
                                            break;
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i112 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                        ConnectionsManager.getInstance(i112).sendRequest(getpassword, new ed0(kd0Var22, tL_auth_signIn22, i13), 10);
                                        kd0Var22.q();
                                    }
                                } else {
                                    kd0Var22.R = false;
                                    gf0Var.E1(false, true);
                                    kd0Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gf0Var.q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", kd0Var22.G);
                                        bundle.putString("phoneHash", kd0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        gf0Var.D1(5, true, bundle, false);
                                    } else {
                                        gf0Var.x1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i15 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    break;
                                }
                                break;
                            default:
                                kd0Var22.R = false;
                                gf0 gf0Var2 = kd0Var22.a0;
                                gf0Var2.E1(false, true);
                                if (tL_error2 != null) {
                                    gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", kd0Var22.G);
                                        bundle2.putString("phoneHash", kd0Var22.H);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        gf0Var2.D1(6, true, bundle2, false);
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
