package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj0 b;

    public /* synthetic */ nj0(pj0 pj0Var, int i7) {
        this.a = i7;
        this.b = pj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new oj0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i7 = 1;
                final pj0 pj0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.mj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        switch (i7) {
                            case 0:
                                pj0 pj0Var2 = pj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                bk0 bk0Var = pj0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new nj0(pj0Var2, 4), 8);
                                    break;
                                } else {
                                    if (bk0Var.D == null) {
                                        bk0Var.D = new TL_account.authorizationForm();
                                    }
                                    pj0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                pj0 pj0Var3 = pj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.f2) pj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new nj0(pj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new mc0(pj0Var3, pj0Var3.b, pj0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 0;
                final pj0 pj0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.mj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11;
                        switch (i10) {
                            case 0:
                                pj0 pj0Var22 = pj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                bk0 bk0Var = pj0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new nj0(pj0Var22, 4), 8);
                                    break;
                                } else {
                                    if (bk0Var.D == null) {
                                        bk0Var.D = new TL_account.authorizationForm();
                                    }
                                    pj0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                pj0 pj0Var3 = pj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.f2) pj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new nj0(pj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new mc0(pj0Var3, pj0Var3.b, pj0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                org.telegram.messenger.g0.h3(new oj0(this.b, tL_error, tLObject, 1));
                break;
            default:
                org.telegram.messenger.g0.h3(new oj0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
