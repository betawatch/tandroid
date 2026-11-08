package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ob0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ String e;

    public /* synthetic */ gb0(ob0 ob0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.b = ob0Var;
        this.c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        String str = this.e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        final ob0 ob0Var = this.b;
        final int i11 = 0;
        final int i12 = 1;
        switch (i10) {
            case 0:
                lb0 lb0Var = ob0Var.a;
                ce0 ce0Var = ob0Var.W;
                ce0Var.C1(false, true);
                if (tL_error == null) {
                    ob0Var.E = false;
                    ce0Var.N1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ob0Var.I);
                    bundle.putString("ephone", ob0Var.J);
                    bundle.putString("phoneFormated", ob0Var.L);
                    bundle.putString("phoneHash", ob0Var.M);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ce0Var.q0 = tL_help_termsOfService;
                        }
                        ob0Var.n(new Runnable() { // from class: org.telegram.ui.jb0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        ob0Var.W.M1(5, true, bundle, false);
                                        break;
                                    default:
                                        ob0Var.W.M1(6, true, bundle, false);
                                        break;
                                }
                            }
                        });
                    } else {
                        ob0Var.n(new rp(ob0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new eb0(ob0Var, str, i12), 10);
                } else {
                    ob0Var.E = false;
                    ce0Var.N1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131751205, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749180, "InvalidPhoneNumber"));
                    } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        hb0 hb0Var = ob0Var.S;
                        nb0 nb0Var = ob0Var.Q;
                        int i13 = 3;
                        try {
                            lb0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i14 = 0;
                        while (true) {
                            br[] brVarArr = lb0Var.f;
                            if (i14 < brVarArr.length) {
                                brVarArr[i14].setText("");
                                lb0Var.f[i14].z(1.0f);
                                i14++;
                            } else {
                                if (nb0Var.getCurrentView() == ob0Var.e) {
                                    nb0Var.showNext();
                                    org.telegram.messenger.g0.Z3(ob0Var.h, false, 1.0f, true, true);
                                }
                                lb0Var.f[0].requestFocus();
                                org.telegram.messenger.g0.G3(10.0f, lb0Var, new hb0(ob0Var, i13));
                                ob0Var.removeCallbacks(hb0Var);
                                ob0Var.postDelayed(hb0Var, 5000L);
                                ob0Var.R = true;
                            }
                        }
                    } else if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131751201, null));
                    } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131751198, null));
                    } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                        ce0Var.M1(0, true, null, true);
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, "FloodWait"));
                    } else {
                        String M0 = org.telegram.messenger.id.M0(2131746074, null);
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                        sb2.append(tL_error.text);
                        ce0Var.D1(M0, sb2.toString());
                    }
                    if (lb0Var.f != null) {
                        int i15 = 0;
                        while (true) {
                            br[] brVarArr2 = lb0Var.f;
                            if (i15 < brVarArr2.length) {
                                brVarArr2[i15].setText("");
                                i15++;
                            } else {
                                brVarArr2[0].requestFocus();
                            }
                        }
                    }
                    lb0Var.e = false;
                }
                ob0Var.F = null;
                break;
            default:
                ob0Var.E = false;
                ce0 ce0Var2 = ob0Var.W;
                ce0Var2.N1(false, true);
                if (tL_error != null) {
                    ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error.text);
                    break;
                } else {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.v4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743823, "UpdateAppAlert"), true);
                        break;
                    } else {
                        final Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", ob0Var.L);
                        bundle2.putString("phoneHash", ob0Var.M);
                        bundle2.putString("code", str);
                        ob0Var.n(new Runnable() { // from class: org.telegram.ui.jb0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        ob0Var.W.M1(5, true, bundle2, false);
                                        break;
                                    default:
                                        ob0Var.W.M1(6, true, bundle2, false);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }

    public /* synthetic */ gb0(ob0 ob0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.b = ob0Var;
        this.c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}
