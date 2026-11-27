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
public final /* synthetic */ class hg6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg6 b;
    public final /* synthetic */ TLRPC.TL_auth_signIn c;

    public /* synthetic */ hg6(tg6 tg6Var, TLRPC.TL_auth_signIn tL_auth_signIn, byte b) {
        this.a = b;
        this.b = tg6Var;
        this.c = tL_auth_signIn;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final byte b = 0;
                final tg6 tg6Var = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.c;
                hl.c3(new Runnable() { // from class: jg6
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
                        final tg6 tg6Var2 = tg6Var;
                        final byte b3 = 0;
                        final byte b4 = 1;
                        switch (b2) {
                            case 0:
                                byte b5 = tg6Var2.i0;
                                qh6 qh6Var = tg6Var2.v0;
                                tg6Var2.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    tg6Var2.h0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        tg6Var2.g0 = false;
                                        qh6Var.K1(false, true);
                                        if ((b5 == 3 && ((i3 = tg6Var2.j0) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((b5 == 2 && ((i2 = tg6Var2.j0) == 4 || i2 == 3)) || (b5 == 4 && ((i = tg6Var2.j0) == 2 || i == 17 || i == 16)))) {
                                            tg6Var2.r();
                                        }
                                        if (b5 == 15) {
                                            jn7.e().a(tg6Var2, jn7.j4);
                                        } else if (b5 == 2) {
                                            hl.y3(true);
                                            jn7.e().a(tg6Var2, jn7.j4);
                                        } else if (b5 == 3) {
                                            hl.x3(true);
                                            jn7.e().a(tg6Var2, jn7.k4);
                                            hl.c3(new jm3((byte) 29));
                                        }
                                        tg6Var2.f0 = true;
                                        if (b5 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                tg6Var2.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                tg6Var2.c(true);
                                                qh6Var.J1(0, true, null, true);
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                                            } else {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                bk2 bk2Var = tg6Var2.f;
                                                ok2[] ok2VarArr = bk2Var.f;
                                                if (i5 >= ok2VarArr.length) {
                                                    bk2Var.e = false;
                                                    ok2VarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    ok2VarArr[i5].setText("");
                                                    i5++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i4 = ((e) qh6Var).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(getpassword, new hg6(tg6Var2, tL_auth_signIn2, b4), 10);
                                        tg6Var2.t();
                                        tg6Var2.s();
                                    }
                                } else {
                                    tg6Var2.g0 = false;
                                    qh6Var.K1(false, true);
                                    tg6Var2.t();
                                    tg6Var2.s();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qh6Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", tg6Var2.d);
                                        bundle.putString("phoneHash", tg6Var2.c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        tg6Var2.o(new Runnable() { // from class: mg6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b6 = b3;
                                                Bundle bundle2 = bundle;
                                                tg6 tg6Var3 = tg6Var2;
                                                switch (b6) {
                                                    case 0:
                                                        tg6Var3.v0.J1(5, true, bundle2, false);
                                                        break;
                                                    default:
                                                        tg6Var3.v0.J1(6, true, bundle2, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        tg6Var2.o(new z56(tg6Var2, tLObject2, (byte) 20));
                                    }
                                }
                                if (b5 == 3) {
                                    hl.T();
                                    hl.x3(false);
                                    break;
                                }
                                break;
                            default:
                                tg6Var2.g0 = false;
                                qh6 qh6Var2 = tg6Var2.v0;
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
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", tg6Var2.d);
                                        bundle2.putString("phoneHash", tg6Var2.c);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        tg6Var2.o(new Runnable() { // from class: mg6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b6 = b4;
                                                Bundle bundle22 = bundle2;
                                                tg6 tg6Var3 = tg6Var2;
                                                switch (b6) {
                                                    case 0:
                                                        tg6Var3.v0.J1(5, true, bundle22, false);
                                                        break;
                                                    default:
                                                        tg6Var3.v0.J1(6, true, bundle22, false);
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
                final tg6 tg6Var2 = this.b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.c;
                hl.c3(new Runnable() { // from class: jg6
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
                        final tg6 tg6Var22 = tg6Var2;
                        final byte b3 = 0;
                        final byte b4 = 1;
                        switch (b22) {
                            case 0:
                                byte b5 = tg6Var22.i0;
                                qh6 qh6Var = tg6Var22.v0;
                                tg6Var22.y(false);
                                if (tL_error2 != null) {
                                    String str = tL_error2.text;
                                    tg6Var22.h0 = str;
                                    if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                                        tg6Var22.g0 = false;
                                        qh6Var.K1(false, true);
                                        if ((b5 == 3 && ((i3 = tg6Var22.j0) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((b5 == 2 && ((i2 = tg6Var22.j0) == 4 || i2 == 3)) || (b5 == 4 && ((i = tg6Var22.j0) == 2 || i == 17 || i == 16)))) {
                                            tg6Var22.r();
                                        }
                                        if (b5 == 15) {
                                            jn7.e().a(tg6Var22, jn7.j4);
                                        } else if (b5 == 2) {
                                            hl.y3(true);
                                            jn7.e().a(tg6Var22, jn7.j4);
                                        } else if (b5 == 3) {
                                            hl.x3(true);
                                            jn7.e().a(tg6Var22, jn7.k4);
                                            hl.c3(new jm3((byte) 29));
                                        }
                                        tg6Var22.f0 = true;
                                        if (b5 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                tg6Var22.w();
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                tg6Var22.c(true);
                                                qh6Var.J1(0, true, null, true);
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131750647, "FloodWait"));
                                            } else {
                                                qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751070, "ErrorOccurred") + "\n" + tL_error2.text);
                                            }
                                            int i5 = 0;
                                            while (true) {
                                                bk2 bk2Var = tg6Var22.f;
                                                ok2[] ok2VarArr = bk2Var.f;
                                                if (i5 >= ok2VarArr.length) {
                                                    bk2Var.e = false;
                                                    ok2VarArr[0].requestFocus();
                                                    break;
                                                } else {
                                                    ok2VarArr[i5].setText("");
                                                    i5++;
                                                }
                                            }
                                        }
                                    } else {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i4 = ((e) qh6Var).currentAccount;
                                        ConnectionsManager.getInstance(i4).sendRequest(getpassword, new hg6(tg6Var22, tL_auth_signIn22, b4), 10);
                                        tg6Var22.t();
                                        tg6Var22.s();
                                    }
                                } else {
                                    tg6Var22.g0 = false;
                                    qh6Var.K1(false, true);
                                    tg6Var22.t();
                                    tg6Var22.s();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qh6Var.s0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", tg6Var22.d);
                                        bundle.putString("phoneHash", tg6Var22.c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        tg6Var22.o(new Runnable() { // from class: mg6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b6 = b3;
                                                Bundle bundle22 = bundle;
                                                tg6 tg6Var3 = tg6Var22;
                                                switch (b6) {
                                                    case 0:
                                                        tg6Var3.v0.J1(5, true, bundle22, false);
                                                        break;
                                                    default:
                                                        tg6Var3.v0.J1(6, true, bundle22, false);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        tg6Var22.o(new z56(tg6Var22, tLObject2, (byte) 20));
                                    }
                                }
                                if (b5 == 3) {
                                    hl.T();
                                    hl.x3(false);
                                    break;
                                }
                                break;
                            default:
                                tg6Var22.g0 = false;
                                qh6 qh6Var2 = tg6Var22.v0;
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
                                        final Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", tg6Var22.d);
                                        bundle2.putString("phoneHash", tg6Var22.c);
                                        bundle2.putString("code", tL_auth_signIn22.phone_code);
                                        tg6Var22.o(new Runnable() { // from class: mg6
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b6 = b4;
                                                Bundle bundle22 = bundle2;
                                                tg6 tg6Var3 = tg6Var22;
                                                switch (b6) {
                                                    case 0:
                                                        tg6Var3.v0.J1(5, true, bundle22, false);
                                                        break;
                                                    default:
                                                        tg6Var3.v0.J1(6, true, bundle22, false);
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
