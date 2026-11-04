package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ lb0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ cb0(lb0 lb0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = lb0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10 = this.a;
        String str = this.e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        final lb0 lb0Var = this.b;
        final int i11 = 0;
        final int i12 = 1;
        switch (i10) {
            case 0:
                ib0 ib0Var = lb0Var.a;
                xd0 xd0Var = lb0Var.a0;
                xd0Var.t1(false, true);
                if (tL_error == null) {
                    lb0Var.F = false;
                    xd0Var.E1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", lb0Var.J);
                    bundle.putString("ephone", lb0Var.K);
                    bundle.putString("phoneFormated", lb0Var.M);
                    bundle.putString("phoneHash", lb0Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            xd0Var.r0 = tL_help_termsOfService;
                        }
                        lb0Var.n(new Runnable() { // from class: org.telegram.ui.fb0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        lb0Var.a0.D1(5, true, bundle, false);
                                        break;
                                    default:
                                        lb0Var.a0.D1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        lb0Var.n(new pp(lb0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new ab0(lb0Var, str, i12), 10);
                } else {
                    lb0Var.F = false;
                    xd0Var.E1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751205, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        db0 db0Var = lb0Var.T;
                        kb0 kb0Var = lb0Var.R;
                        int i13 = 3;
                        try {
                            ib0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i14 = 0;
                        while (true) {
                            zq[] zqVarArr = ib0Var.f;
                            if (i14 < zqVarArr.length) {
                                zqVarArr[i14].setText("");
                                ib0Var.f[i14].z(1.0f);
                                i14++;
                            } else {
                                if (kb0Var.getCurrentView() == lb0Var.e) {
                                    kb0Var.showNext();
                                    org.telegram.messenger.g0.Z3(lb0Var.h, false, 1.0f, true, true);
                                }
                                ib0Var.f[0].requestFocus();
                                org.telegram.messenger.g0.G3(10.0f, ib0Var, new db0(lb0Var, i13));
                                lb0Var.removeCallbacks(db0Var);
                                lb0Var.postDelayed(db0Var, 5000L);
                                lb0Var.S = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751201, null));
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751198, null));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        xd0Var.D1(0, true, null, true);
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                    } else {
                        String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                        sb2.append(tL_error.text);
                        xd0Var.u1(M0, sb2.toString());
                    }
                    if (ib0Var.f != null) {
                        int i15 = 0;
                        while (true) {
                            zq[] zqVarArr2 = ib0Var.f;
                            if (i15 < zqVarArr2.length) {
                                zqVarArr2[i15].setText("");
                                i15++;
                            } else {
                                zqVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ib0Var.e = false;
                }
                lb0Var.G = null;
                break;
            default:
                lb0Var.F = false;
                xd0 xd0Var2 = lb0Var.a0;
                xd0Var2.E1(false, true);
                if (tL_error != null) {
                    xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", lb0Var.M);
                        bundle2.putString("phoneHash", lb0Var.N);
                        bundle2.putString("code", str);
                        lb0Var.n(new Runnable() { // from class: org.telegram.ui.fb0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        lb0Var.a0.D1(5, true, bundle2, false);
                                        break;
                                    default:
                                        lb0Var.a0.D1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ cb0(lb0 lb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = lb0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
