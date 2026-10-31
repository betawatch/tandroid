package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ be0(me0 me0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.a = i10;
        this.b = me0Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final me0 me0Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.de0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        int i13;
                        int i14;
                        int i15 = i10;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final me0 me0Var2 = me0Var;
                        final int i16 = 0;
                        final int i17 = 1;
                        switch (i15) {
                            case 0:
                                int i18 = me0Var2.h0;
                                hf0 hf0Var = me0Var2.u0;
                                me0Var2.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    me0Var2.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        me0Var2.f0 = false;
                                        hf0Var.D1(false, true);
                                        if ((i18 == 3 && ((i13 = me0Var2.i0) == 4 || i13 == 2 || i13 == 17 || i13 == 16)) || ((i18 == 2 && ((i12 = me0Var2.i0) == 4 || i12 == 3)) || (i18 == 4 && ((i11 = me0Var2.i0) == 2 || i11 == 17 || i11 == 16)))) {
                                            me0Var2.s();
                                        }
                                        if (i18 == 15) {
                                            org.telegram.messenger.zs.e().b(me0Var2, org.telegram.messenger.zs.g4);
                                        } else if (i18 == 2) {
                                            org.telegram.messenger.i0.D3(true);
                                            org.telegram.messenger.zs.e().b(me0Var2, org.telegram.messenger.zs.g4);
                                        } else if (i18 == 3) {
                                            org.telegram.messenger.i0.C3(true);
                                            org.telegram.messenger.zs.e().b(me0Var2, org.telegram.messenger.zs.h4);
                                            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(9));
                                        }
                                        me0Var2.e0 = true;
                                        if (i18 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                me0Var2.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                me0Var2.c(true);
                                                hf0Var.C1(0, true, null, true);
                                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                                            } else {
                                                String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.z20.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                hf0Var.t1(L0, sb2.toString());
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                zr zrVar = me0Var2.f;
                                                bs[] bsVarArr = zrVar.f;
                                                if (i19 >= bsVarArr.length) {
                                                    zrVar.e = false;
                                                    bsVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    bsVarArr[i19].setText("");
                                                    i19++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i14 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(getpassword, new be0(me0Var2, tL_auth_signIn2, i17), 10);
                                        me0Var2.u();
                                        me0Var2.t();
                                    }
                                } else {
                                    me0Var2.f0 = false;
                                    hf0Var.D1(false, true);
                                    me0Var2.u();
                                    me0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            hf0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", me0Var2.d);
                                        bundle.putString("phoneHash", me0Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        me0Var2.p(new Runnable() { // from class: org.telegram.ui.ge0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        me0Var2.u0.C1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        me0Var2.u0.C1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        me0Var2.p(new f70(25, me0Var2, tLObject2));
                                    }
                                }
                                if (i18 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    break;
                                }
                                break;
                            default:
                                me0Var2.f0 = false;
                                hf0 hf0Var2 = me0Var2.u0;
                                hf0Var2.D1(false, true);
                                if (tL_error2 != null) {
                                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.m0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", me0Var2.d);
                                        bundle2.putString("phoneHash", me0Var2.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        me0Var2.p(new Runnable() { // from class: org.telegram.ui.ge0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        me0Var2.u0.C1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        me0Var2.u0.C1(6, true, bundle2, false);
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
                final me0 me0Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.de0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        int i13;
                        int i14;
                        int i15 = i11;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final me0 me0Var22 = me0Var2;
                        final int i16 = 0;
                        final int i17 = 1;
                        switch (i15) {
                            case 0:
                                int i18 = me0Var22.h0;
                                hf0 hf0Var = me0Var22.u0;
                                me0Var22.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    me0Var22.g0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        me0Var22.f0 = false;
                                        hf0Var.D1(false, true);
                                        if ((i18 == 3 && ((i13 = me0Var22.i0) == 4 || i13 == 2 || i13 == 17 || i13 == 16)) || ((i18 == 2 && ((i12 = me0Var22.i0) == 4 || i12 == 3)) || (i18 == 4 && ((i112 = me0Var22.i0) == 2 || i112 == 17 || i112 == 16)))) {
                                            me0Var22.s();
                                        }
                                        if (i18 == 15) {
                                            org.telegram.messenger.zs.e().b(me0Var22, org.telegram.messenger.zs.g4);
                                        } else if (i18 == 2) {
                                            org.telegram.messenger.i0.D3(true);
                                            org.telegram.messenger.zs.e().b(me0Var22, org.telegram.messenger.zs.g4);
                                        } else if (i18 == 3) {
                                            org.telegram.messenger.i0.C3(true);
                                            org.telegram.messenger.zs.e().b(me0Var22, org.telegram.messenger.zs.h4);
                                            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(9));
                                        }
                                        me0Var22.e0 = true;
                                        if (i18 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                me0Var22.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                me0Var22.c(true);
                                                hf0Var.C1(0, true, null, true);
                                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                                            } else {
                                                String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.z20.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                hf0Var.t1(L0, sb2.toString());
                                            }
                                            int i19 = 0;
                                            while (true) {
                                                zr zrVar = me0Var22.f;
                                                bs[] bsVarArr = zrVar.f;
                                                if (i19 >= bsVarArr.length) {
                                                    zrVar.e = false;
                                                    bsVarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    bsVarArr[i19].setText("");
                                                    i19++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i14 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                                        ConnectionsManager.getInstance(i14).sendRequest(getpassword, new be0(me0Var22, tL_auth_signIn22, i17), 10);
                                        me0Var22.u();
                                        me0Var22.t();
                                    }
                                } else {
                                    me0Var22.f0 = false;
                                    hf0Var.D1(false, true);
                                    me0Var22.u();
                                    me0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            hf0Var.q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", me0Var22.d);
                                        bundle.putString("phoneHash", me0Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        me0Var22.p(new Runnable() { // from class: org.telegram.ui.ge0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i16) {
                                                    case 0:
                                                        me0Var22.u0.C1(5, true, bundle, false);
                                                        break;
                                                    default:
                                                        me0Var22.u0.C1(6, true, bundle, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        me0Var22.p(new f70(25, me0Var22, tLObject2));
                                    }
                                }
                                if (i18 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    break;
                                }
                                break;
                            default:
                                me0Var22.f0 = false;
                                hf0 hf0Var2 = me0Var22.u0;
                                hf0Var2.D1(false, true);
                                if (tL_error2 != null) {
                                    hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.m0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", me0Var22.d);
                                        bundle2.putString("phoneHash", me0Var22.c);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        me0Var22.p(new Runnable() { // from class: org.telegram.ui.ge0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        me0Var22.u0.C1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        me0Var22.u0.C1(6, true, bundle2, false);
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
