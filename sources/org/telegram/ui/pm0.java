package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rm0 b;

    public /* synthetic */ pm0(rm0 rm0Var, int i10) {
        this.a = i10;
        this.b = rm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qm0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final rm0 rm0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.om0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                rm0 rm0Var2 = rm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                fn0 fn0Var = rm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new pm0(rm0Var2, 4), 8);
                                    break;
                                } else {
                                    if (fn0Var.y == null) {
                                        fn0Var.y = new TL_account.authorizationForm();
                                    }
                                    rm0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                rm0 rm0Var3 = rm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.p2) rm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new pm0(rm0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new jf0(rm0Var3, rm0Var3.b, rm0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final rm0 rm0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.om0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        switch (i11) {
                            case 0:
                                rm0 rm0Var22 = rm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                fn0 fn0Var = rm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new pm0(rm0Var22, 4), 8);
                                    break;
                                } else {
                                    if (fn0Var.y == null) {
                                        fn0Var.y = new TL_account.authorizationForm();
                                    }
                                    rm0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                rm0 rm0Var3 = rm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.p2) rm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new pm0(rm0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new jf0(rm0Var3, rm0Var3.b, rm0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new qm0(this.b, tL_error, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new qm0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
