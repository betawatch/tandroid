package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vc0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ oc0(vc0 vc0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = vc0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        String str = this.e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        final vc0 vc0Var = this.b;
        final int i12 = 0;
        final int i13 = 1;
        switch (i11) {
            case 0:
                tc0 tc0Var = vc0Var.a;
                gf0 gf0Var = vc0Var.W;
                gf0Var.t1(false, true);
                if (tL_error == null) {
                    vc0Var.E = false;
                    gf0Var.E1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", vc0Var.I);
                    bundle.putString("ephone", vc0Var.J);
                    bundle.putString("phoneFormated", vc0Var.L);
                    bundle.putString("phoneHash", vc0Var.M);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            gf0Var.q0 = tL_help_termsOfService;
                        }
                        vc0Var.n(new Runnable() { // from class: org.telegram.ui.rc0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        vc0Var.W.D1(5, true, bundle, false);
                                        break;
                                    default:
                                        vc0Var.W.D1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        vc0Var.n(new qq(vc0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new mc0(vc0Var, str, i13), 10);
                } else {
                    vc0Var.E = false;
                    gf0Var.E1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751205, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        pc0 pc0Var = vc0Var.S;
                        uc0 uc0Var = vc0Var.Q;
                        int i14 = 3;
                        try {
                            tc0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i15 = 0;
                        while (true) {
                            bs[] bsVarArr = tc0Var.f;
                            if (i15 < bsVarArr.length) {
                                bsVarArr[i15].setText("");
                                tc0Var.f[i15].z(1.0f);
                                i15++;
                            } else {
                                if (uc0Var.getCurrentView() == vc0Var.e) {
                                    uc0Var.showNext();
                                    org.telegram.messenger.i0.Y3(vc0Var.h, false, 1.0f, true, true);
                                }
                                tc0Var.f[0].requestFocus();
                                org.telegram.messenger.i0.F3(10.0f, tc0Var, new pc0(vc0Var, i14));
                                vc0Var.removeCallbacks(pc0Var);
                                vc0Var.postDelayed(pc0Var, 5000L);
                                vc0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751201, null));
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751198, null));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        gf0Var.D1(0, true, null, true);
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                    } else {
                        String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.a30.q("ErrorOccurred", 2131751106, sb2, "\n");
                        sb2.append(tL_error.text);
                        gf0Var.u1(L0, sb2.toString());
                    }
                    if (tc0Var.f != null) {
                        int i16 = 0;
                        while (true) {
                            bs[] bsVarArr2 = tc0Var.f;
                            if (i16 < bsVarArr2.length) {
                                bsVarArr2[i16].setText("");
                                i16++;
                            } else {
                                bsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    tc0Var.e = false;
                }
                vc0Var.F = null;
                break;
            default:
                vc0Var.E = false;
                gf0 gf0Var2 = vc0Var.W;
                gf0Var2.E1(false, true);
                if (tL_error != null) {
                    gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", vc0Var.L);
                        bundle2.putString("phoneHash", vc0Var.M);
                        bundle2.putString("code", str);
                        vc0Var.n(new Runnable() { // from class: org.telegram.ui.rc0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        vc0Var.W.D1(5, true, bundle2, false);
                                        break;
                                    default:
                                        vc0Var.W.D1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ oc0(vc0 vc0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = vc0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
