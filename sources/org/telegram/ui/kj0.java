package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj0 b;

    public /* synthetic */ kj0(mj0 mj0Var, int i3) {
        this.a = i3;
        this.b = mj0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new lj0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i3 = 1;
                final mj0 mj0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.jj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        switch (i3) {
                            case 0:
                                mj0 mj0Var2 = mj0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                yj0 yj0Var = mj0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new kj0(mj0Var2, 4), 8);
                                    break;
                                } else {
                                    if (yj0Var.E == null) {
                                        yj0Var.E = new TL_account.authorizationForm();
                                    }
                                    mj0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                mj0 mj0Var3 = mj0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.d2) mj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new kj0(mj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new hc0(mj0Var3, mj0Var3.b, mj0Var3.d, 15));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 0;
                final mj0 mj0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.jj0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11;
                        switch (i10) {
                            case 0:
                                mj0 mj0Var22 = mj0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                yj0 yj0Var = mj0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new kj0(mj0Var22, 4), 8);
                                    break;
                                } else {
                                    if (yj0Var.E == null) {
                                        yj0Var.E = new TL_account.authorizationForm();
                                    }
                                    mj0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                mj0 mj0Var3 = mj0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.d2) mj0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new kj0(mj0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new hc0(mj0Var3, mj0Var3.b, mj0Var3.d, 15));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                org.telegram.messenger.g0.h3(new lj0(this.b, tL_error, tLObject, 1));
                break;
            default:
                org.telegram.messenger.g0.h3(new lj0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
