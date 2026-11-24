// default package

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eg6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rg6 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ eg6(rg6 rg6Var, TLRPC.TL_auth_signIn tL_auth_signIn, byte b) {
        this.a = b;
        this.b = rg6Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final byte b = 0;
                final rg6 rg6Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                gm.c3(new Runnable() { // from class: gg6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        int i2;
                        int i3;
                        int i4;
                        byte b2 = b;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final rg6 rg6Var2 = rg6Var;
                        final byte b3 = 0;
                        final byte b4 = 1;
                        switch (b2) {
                            case 0:
                                byte b5 = rg6Var2.i0;
                                mh6 mh6Var = rg6Var2.v0;
                                rg6Var2.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    rg6Var2.h0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        rg6Var2.g0 = false;
                                        mh6Var.K1(false, true);
                                        if ((b5 == 3 && ((i3 = rg6Var2.j0) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((b5 == 2 && ((i2 = rg6Var2.j0) == 4 || i2 == 3)) || (b5 == 4 && ((i = rg6Var2.j0) == 2 || i == 17 || i == 16)))) {
                                            rg6Var2.r();
                                        }
                                        if (b5 == 15) {
                                            nm7.e().a(rg6Var2, nm7.k4);
                                        } else if (b5 == 2) {
                                            gm.y3(true);
                                            nm7.e().a(rg6Var2, nm7.k4);
                                        } else if (b5 == 3) {
                                            gm.x3(true);
                                            nm7.e().a(rg6Var2, nm7.l4);
                                            gm.c3(new bn3((byte) 27));
                                        }
                                        rg6Var2.f0 = true;
                                        if (b5 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                rg6Var2.x();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                rg6Var2.d(true);
                                                mh6Var.J1(0, true, null, true);
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                                            } else {
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751042, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                tk2 tk2Var = rg6Var2.f;
                                                gl2[] gl2VarArr = tk2Var.f;
                                                if (i5 >= gl2VarArr.length) {
                                                    tk2Var.e = false;
                                                    gl2VarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    gl2VarArr[i5].setText("");
                                                    i5++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i4 = ((d) mh6Var).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(getpassword, new eg6(rg6Var2, tL_auth_signIn2, b4), 10);
                                        rg6Var2.t();
                                        rg6Var2.s();
                                    }
                                } else {
                                    rg6Var2.g0 = false;
                                    mh6Var.K1(false, true);
                                    rg6Var2.t();
                                    rg6Var2.s();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            mh6Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", rg6Var2.d);
                                        bundle.putString("phoneHash", rg6Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        rg6Var2.o(new Runnable() { // from class: jg6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b6 = b3;
                                                Bundle bundle2 = bundle;
                                                rg6 rg6Var3 = rg6Var2;
                                                switch (b6) {
                                                    case 0:
                                                        rg6Var3.v0.J1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        rg6Var3.v0.J1(6, true, bundle2, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        rg6Var2.o(new k16(rg6Var2, tLObject2, (byte) 24));
                                    }
                                }
                                if (b5 == 3) {
                                    gm.T();
                                    gm.x3(false);
                                    break;
                                }
                                break;
                            default:
                                rg6Var2.g0 = false;
                                mh6 mh6Var2 = rg6Var2.v0;
                                mh6Var2.K1(false, true);
                                if (tL_error2 != null) {
                                    mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.b0(password, true)) {
                                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", rg6Var2.d);
                                        bundle2.putString("phoneHash", rg6Var2.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        rg6Var2.o(new Runnable() { // from class: jg6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b6 = b4;
                                                Bundle bundle22 = bundle2;
                                                rg6 rg6Var3 = rg6Var2;
                                                switch (b6) {
                                                    case 0:
                                                        rg6Var3.v0.J1(5, true, bundle22, false);
                                                        break;
                                                    default:
                                                        rg6Var3.v0.J1(6, true, bundle22, false);
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
                final byte b2 = 1;
                final rg6 rg6Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                gm.c3(new Runnable() { // from class: gg6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        int i2;
                        int i3;
                        int i4;
                        byte b22 = b2;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final rg6 rg6Var22 = rg6Var2;
                        final byte b3 = 0;
                        final byte b4 = 1;
                        switch (b22) {
                            case 0:
                                byte b5 = rg6Var22.i0;
                                mh6 mh6Var = rg6Var22.v0;
                                rg6Var22.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    rg6Var22.h0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        rg6Var22.g0 = false;
                                        mh6Var.K1(false, true);
                                        if ((b5 == 3 && ((i3 = rg6Var22.j0) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((b5 == 2 && ((i2 = rg6Var22.j0) == 4 || i2 == 3)) || (b5 == 4 && ((i = rg6Var22.j0) == 2 || i == 17 || i == 16)))) {
                                            rg6Var22.r();
                                        }
                                        if (b5 == 15) {
                                            nm7.e().a(rg6Var22, nm7.k4);
                                        } else if (b5 == 2) {
                                            gm.y3(true);
                                            nm7.e().a(rg6Var22, nm7.k4);
                                        } else if (b5 == 3) {
                                            gm.x3(true);
                                            nm7.e().a(rg6Var22, nm7.l4);
                                            gm.c3(new bn3((byte) 27));
                                        }
                                        rg6Var22.f0 = true;
                                        if (b5 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                rg6Var22.x();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                rg6Var22.d(true);
                                                mh6Var.J1(0, true, null, true);
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131750619, "FloodWait"));
                                            } else {
                                                mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751042, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                tk2 tk2Var = rg6Var22.f;
                                                gl2[] gl2VarArr = tk2Var.f;
                                                if (i5 >= gl2VarArr.length) {
                                                    tk2Var.e = false;
                                                    gl2VarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    gl2VarArr[i5].setText("");
                                                    i5++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i4 = ((d) mh6Var).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(getpassword, new eg6(rg6Var22, tL_auth_signIn22, b4), 10);
                                        rg6Var22.t();
                                        rg6Var22.s();
                                    }
                                } else {
                                    rg6Var22.g0 = false;
                                    mh6Var.K1(false, true);
                                    rg6Var22.t();
                                    rg6Var22.s();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            mh6Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", rg6Var22.d);
                                        bundle.putString("phoneHash", rg6Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        rg6Var22.o(new Runnable() { // from class: jg6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b6 = b3;
                                                Bundle bundle22 = bundle;
                                                rg6 rg6Var3 = rg6Var22;
                                                switch (b6) {
                                                    case 0:
                                                        rg6Var3.v0.J1(5, true, bundle22, false);
                                                        break;
                                                    default:
                                                        rg6Var3.v0.J1(6, true, bundle22, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        rg6Var22.o(new k16(rg6Var22, tLObject2, (byte) 24));
                                    }
                                }
                                if (b5 == 3) {
                                    gm.T();
                                    gm.x3(false);
                                    break;
                                }
                                break;
                            default:
                                rg6Var22.g0 = false;
                                mh6 mh6Var2 = rg6Var22.v0;
                                mh6Var2.K1(false, true);
                                if (tL_error2 != null) {
                                    mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                    break;
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.b0(password, true)) {
                                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                                        break;
                                    } else {
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", rg6Var22.d);
                                        bundle2.putString("phoneHash", rg6Var22.c);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        rg6Var22.o(new Runnable() { // from class: jg6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b6 = b4;
                                                Bundle bundle22 = bundle2;
                                                rg6 rg6Var3 = rg6Var22;
                                                switch (b6) {
                                                    case 0:
                                                        rg6Var3.v0.J1(5, true, bundle22, false);
                                                        break;
                                                    default:
                                                        rg6Var3.v0.J1(6, true, bundle22, false);
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
