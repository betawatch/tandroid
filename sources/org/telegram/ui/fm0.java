package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm0 b;

    public /* synthetic */ fm0(hm0 hm0Var, int i10) {
        this.a = i10;
        this.b = hm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gm0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final hm0 hm0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.em0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                hm0 hm0Var2 = hm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                vm0 vm0Var = hm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new fm0(hm0Var2, 4), 8);
                                    break;
                                } else {
                                    if (vm0Var.y == null) {
                                        vm0Var.y = new TL_account.authorizationForm();
                                    }
                                    hm0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                hm0 hm0Var3 = hm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.o2) hm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new fm0(hm0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new xe0(hm0Var3, hm0Var3.b, hm0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final hm0 hm0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.em0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        switch (i11) {
                            case 0:
                                hm0 hm0Var22 = hm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                vm0 vm0Var = hm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new fm0(hm0Var22, 4), 8);
                                    break;
                                } else {
                                    if (vm0Var.y == null) {
                                        vm0Var.y = new TL_account.authorizationForm();
                                    }
                                    hm0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                hm0 hm0Var3 = hm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.o2) hm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new fm0(hm0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new xe0(hm0Var3, hm0Var3.b, hm0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new gm0(this.b, tL_error, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gm0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
