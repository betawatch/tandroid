package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ hm0(jm0 jm0Var, int i9) {
        this.a = i9;
        this.b = jm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new im0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i9 = 1;
                final jm0 jm0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11;
                        switch (i9) {
                            case 0:
                                jm0 jm0Var2 = jm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                wm0 wm0Var = jm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new hm0(jm0Var2, 4), 8);
                                    break;
                                } else {
                                    if (wm0Var.y == null) {
                                        wm0Var.y = new TL_account.authorizationForm();
                                    }
                                    jm0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                jm0 jm0Var3 = jm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) jm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new hm0(jm0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new ye0(jm0Var3, jm0Var3.b, jm0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 0;
                final jm0 jm0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11;
                        switch (i10) {
                            case 0:
                                jm0 jm0Var22 = jm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                wm0 wm0Var = jm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new hm0(jm0Var22, 4), 8);
                                    break;
                                } else {
                                    if (wm0Var.y == null) {
                                        wm0Var.y = new TL_account.authorizationForm();
                                    }
                                    jm0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                jm0 jm0Var3 = jm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) jm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword2, new hm0(jm0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new ye0(jm0Var3, jm0Var3.b, jm0Var3.d, 12));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new im0(this.b, tL_error, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new im0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
