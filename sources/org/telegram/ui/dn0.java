package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;

    public /* synthetic */ dn0(fn0 fn0Var, int i10) {
        this.a = i10;
        this.b = fn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new en0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final fn0 fn0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                fn0 fn0Var2 = fn0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                un0 un0Var = fn0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new dn0(fn0Var2, 4), 8);
                                    break;
                                } else {
                                    if (un0Var.y == null) {
                                        un0Var.y = new TL_account.authorizationForm();
                                    }
                                    fn0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                fn0 fn0Var3 = fn0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.m2) fn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new dn0(fn0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new uf0(fn0Var3, fn0Var3.b, fn0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final fn0 fn0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        switch (i11) {
                            case 0:
                                fn0 fn0Var22 = fn0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                un0 un0Var = fn0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new dn0(fn0Var22, 4), 8);
                                    break;
                                } else {
                                    if (un0Var.y == null) {
                                        un0Var.y = new TL_account.authorizationForm();
                                    }
                                    fn0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                fn0 fn0Var3 = fn0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.m2) fn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new dn0(fn0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new uf0(fn0Var3, fn0Var3.b, fn0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new en0(this.b, tL_error, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new en0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
