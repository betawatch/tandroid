package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj0 b;

    public /* synthetic */ pj0(rj0 rj0Var, int i7) {
        this.a = i7;
        this.b = rj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new qj0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i7 = 1;
                final rj0 rj0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.oj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        switch (i7) {
                            case 0:
                                rj0 rj0Var2 = rj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                dk0 dk0Var = rj0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new pj0(rj0Var2, 4), 8);
                                    break;
                                } else {
                                    if (dk0Var.D == null) {
                                        dk0Var.D = new TL_account.authorizationForm();
                                    }
                                    rj0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                rj0 rj0Var3 = rj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.f2) rj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new pj0(rj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new oc0(rj0Var3, rj0Var3.b, rj0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 0;
                final rj0 rj0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.oj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11;
                        switch (i10) {
                            case 0:
                                rj0 rj0Var22 = rj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                dk0 dk0Var = rj0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new pj0(rj0Var22, 4), 8);
                                    break;
                                } else {
                                    if (dk0Var.D == null) {
                                        dk0Var.D = new TL_account.authorizationForm();
                                    }
                                    rj0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                rj0 rj0Var3 = rj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.f2) rj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new pj0(rj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new oc0(rj0Var3, rj0Var3.b, rj0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                org.telegram.messenger.g0.h3(new qj0(this.b, tL_error, tLObject, 1));
                break;
            default:
                org.telegram.messenger.g0.h3(new qj0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
