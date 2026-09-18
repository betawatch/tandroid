package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class an0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;

    public /* synthetic */ an0(cn0 cn0Var, int i10) {
        this.a = i10;
        this.b = cn0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bn0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final cn0 cn0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                cn0 cn0Var2 = cn0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                qn0 qn0Var = cn0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new an0(cn0Var2, 4), 8);
                                    break;
                                } else {
                                    if (qn0Var.y == null) {
                                        qn0Var.y = new TL_account.authorizationForm();
                                    }
                                    cn0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                cn0 cn0Var3 = cn0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.o2) cn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new an0(cn0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new rf0(cn0Var3, cn0Var3.b, cn0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final cn0 cn0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.zm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        switch (i11) {
                            case 0:
                                cn0 cn0Var22 = cn0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                qn0 qn0Var = cn0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new an0(cn0Var22, 4), 8);
                                    break;
                                } else {
                                    if (qn0Var.y == null) {
                                        qn0Var.y = new TL_account.authorizationForm();
                                    }
                                    cn0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                cn0 cn0Var3 = cn0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.o2) cn0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new an0(cn0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new rf0(cn0Var3, cn0Var3.b, cn0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new bn0(this.b, tL_error, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new bn0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
