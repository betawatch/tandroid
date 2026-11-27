// default package

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kh6 implements jy2, OnSuccessListener, OnFailureListener {
    public final /* synthetic */ ph6 a;

    public /* synthetic */ kh6(ph6 ph6Var) {
        this.a = ph6Var;
    }

    @Override // jy2
    public final void B(gy2 gy2Var) {
        ph6 ph6Var = this.a;
        ph6Var.L = true;
        String str = gy2Var.c;
        ph6Var.a.setText(str);
        ph6Var.u(str, gy2Var);
        ph6Var.G = gy2Var;
        ph6Var.F = (byte) 0;
        ph6Var.L = false;
        uc7.e1().edit().putString("phone_code_last_matched_" + gy2Var.c, gy2Var.d).apply();
        hl.d3(new fh6(ph6Var, (byte) 4), 300L);
        mh6 mh6Var = ph6Var.b;
        mh6Var.requestFocus();
        mh6Var.setSelection(mh6Var.length());
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i;
        ph6 ph6Var = this.a;
        qh6 qh6Var = ph6Var.h0;
        if (ph6Var.a0) {
            return;
        }
        byte b = 1;
        if (exc instanceof ConnectionsManager.RequestException) {
            String message = exc.getMessage();
            if (message != null) {
                if (message.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i = ((e) qh6Var).currentAccount;
                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new jh6(ph6Var, b), 10);
                    return;
                }
                boolean z = f11.a;
                new d31(qh6Var.a0, null).f0(message, false);
            }
        } else if (!(exc instanceof CancellationException)) {
            cc4.g(exc, true);
        }
        if (ph6Var.o()) {
            ph6Var.t(false);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
        ph6 ph6Var = this.a;
        qh6 qh6Var = ph6Var.h0;
        if (ph6Var.a0) {
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
            TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
            if (tL_help_termsOfService != null) {
                qh6Var.s0 = tL_help_termsOfService;
            }
            qh6Var.J1(5, true, bs2.l("fromFirebasePhoneNumberVerification", true), false);
            return;
        }
        if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
            qh6Var.C1((TLRPC.TL_auth_authorization) auth_authorization, false);
        } else {
            ph6Var.t(false);
        }
    }
}
