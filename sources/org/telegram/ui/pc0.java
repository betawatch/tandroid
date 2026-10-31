package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wc0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ pc0(wc0 wc0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = wc0Var;
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
        final wc0 wc0Var = this.b;
        final int i12 = 0;
        final int i13 = 1;
        switch (i11) {
            case 0:
                uc0 uc0Var = wc0Var.a;
                hf0 hf0Var = wc0Var.W;
                hf0Var.s1(false, true);
                if (tL_error == null) {
                    wc0Var.E = false;
                    hf0Var.D1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", wc0Var.I);
                    bundle.putString("ephone", wc0Var.J);
                    bundle.putString("phoneFormated", wc0Var.L);
                    bundle.putString("phoneHash", wc0Var.M);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            hf0Var.q0 = tL_help_termsOfService;
                        }
                        wc0Var.n(new Runnable() { // from class: org.telegram.ui.sc0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        wc0Var.W.C1(5, true, bundle, false);
                                        break;
                                    default:
                                        wc0Var.W.C1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        wc0Var.n(new qq(wc0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new nc0(wc0Var, str, i13), 10);
                } else {
                    wc0Var.E = false;
                    hf0Var.D1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751205, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, "InvalidPhoneNumber"));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        qc0 qc0Var = wc0Var.S;
                        vc0 vc0Var = wc0Var.Q;
                        int i14 = 3;
                        try {
                            uc0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i15 = 0;
                        while (true) {
                            bs[] bsVarArr = uc0Var.f;
                            if (i15 < bsVarArr.length) {
                                bsVarArr[i15].setText("");
                                uc0Var.f[i15].z(1.0f);
                                i15++;
                            } else {
                                if (vc0Var.getCurrentView() == wc0Var.e) {
                                    vc0Var.showNext();
                                    org.telegram.messenger.i0.Y3(wc0Var.h, false, 1.0f, true, true);
                                }
                                uc0Var.f[0].requestFocus();
                                org.telegram.messenger.i0.F3(10.0f, uc0Var, new qc0(wc0Var, i14));
                                wc0Var.removeCallbacks(qc0Var);
                                wc0Var.postDelayed(qc0Var, 5000L);
                                wc0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751201, null));
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751198, null));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        hf0Var.C1(0, true, null, true);
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                    } else {
                        String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.z20.q("ErrorOccurred", 2131751106, sb2, "\n");
                        sb2.append(tL_error.text);
                        hf0Var.t1(L0, sb2.toString());
                    }
                    if (uc0Var.f != null) {
                        int i16 = 0;
                        while (true) {
                            bs[] bsVarArr2 = uc0Var.f;
                            if (i16 < bsVarArr2.length) {
                                bsVarArr2[i16].setText("");
                                i16++;
                            } else {
                                bsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    uc0Var.e = false;
                }
                wc0Var.F = null;
                break;
            default:
                wc0Var.E = false;
                hf0 hf0Var2 = wc0Var.W;
                hf0Var2.D1(false, true);
                if (tL_error != null) {
                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.m0(password, true)) {
                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", wc0Var.L);
                        bundle2.putString("phoneHash", wc0Var.M);
                        bundle2.putString("code", str);
                        wc0Var.n(new Runnable() { // from class: org.telegram.ui.sc0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        wc0Var.W.C1(5, true, bundle2, false);
                                        break;
                                    default:
                                        wc0Var.W.C1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ pc0(wc0 wc0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = wc0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
