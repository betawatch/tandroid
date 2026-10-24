package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class km0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm0 b;

    public /* synthetic */ km0(mm0 mm0Var, int i10) {
        this.a = i10;
        this.b = mm0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lm0(this.b, tLObject, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final mm0 mm0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12;
                        switch (i10) {
                            case 0:
                                mm0 mm0Var2 = mm0Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                an0 an0Var = mm0Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new km0(mm0Var2, 4), 8);
                                    break;
                                } else {
                                    if (an0Var.y == null) {
                                        an0Var.y = new TL_account.authorizationForm();
                                    }
                                    mm0Var2.a();
                                    break;
                                }
                                break;
                            default:
                                mm0 mm0Var3 = mm0Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.o2) mm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new km0(mm0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new re0(mm0Var3, mm0Var3.b, mm0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 0;
                final mm0 mm0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.jm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12;
                        switch (i11) {
                            case 0:
                                mm0 mm0Var22 = mm0Var2;
                                TLRPC.TL_error tL_error2 = tL_error;
                                an0 an0Var = mm0Var22.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new km0(mm0Var22, 4), 8);
                                    break;
                                } else {
                                    if (an0Var.y == null) {
                                        an0Var.y = new TL_account.authorizationForm();
                                    }
                                    mm0Var22.a();
                                    break;
                                }
                                break;
                            default:
                                mm0 mm0Var3 = mm0Var2;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i12 = ((org.telegram.ui.ActionBar.o2) mm0Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i12).sendRequest(getpassword2, new km0(mm0Var3, 3), 8);
                                    break;
                                } else {
                                    Utilities.globalQueue.postRunnable(new re0(mm0Var3, mm0Var3.b, mm0Var3.d, 14));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new lm0(this.b, tL_error, tLObject, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new lm0(this.b, tL_error, tLObject, 2));
                break;
        }
    }
}
