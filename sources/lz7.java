// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lz7 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nz7 b;

    public /* synthetic */ lz7(nz7 nz7Var, byte b) {
        this.a = b;
        this.b = nz7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 1;
        final nz7 nz7Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new mz7(nz7Var, tLObject, tL_error));
                break;
            case 1:
                gm.c3(new Runnable() { // from class: kz7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        int i2;
                        switch (b2) {
                            case 0:
                                nz7 nz7Var2 = nz7Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                xz7 xz7Var = nz7Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) xz7Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new lz7(nz7Var2, (byte) 4), 8);
                                    break;
                                } else {
                                    if (xz7Var.E == null) {
                                        xz7Var.E = new TL_account.authorizationForm();
                                    }
                                    nz7Var2.a();
                                    break;
                                }
                            default:
                                nz7 nz7Var3 = nz7Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i2 = ((d) nz7Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(getpassword2, new lz7(nz7Var3, (byte) 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new ud7((byte) 14, (Object) nz7Var3, (Object) nz7Var3.b, nz7Var3.d));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 2:
                final byte b3 = 0;
                gm.c3(new Runnable() { // from class: kz7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        int i2;
                        switch (b3) {
                            case 0:
                                nz7 nz7Var2 = nz7Var;
                                TLRPC.TL_error tL_error2 = tL_error;
                                xz7 xz7Var = nz7Var2.e;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) xz7Var).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new lz7(nz7Var2, (byte) 4), 8);
                                    break;
                                } else {
                                    if (xz7Var.E == null) {
                                        xz7Var.E = new TL_account.authorizationForm();
                                    }
                                    nz7Var2.a();
                                    break;
                                }
                            default:
                                nz7 nz7Var3 = nz7Var;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null && "SRP_ID_INVALID".equals(tL_error3.text)) {
                                    TL_account.getPassword getpassword2 = new TL_account.getPassword();
                                    i2 = ((d) nz7Var3.e).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(getpassword2, new lz7(nz7Var3, (byte) 3), 8);
                                    break;
                                } else {
                                    Utilities.e.c(new ud7((byte) 14, (Object) nz7Var3, (Object) nz7Var3.b, nz7Var3.d));
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                gm.c3(new mz7(nz7Var, tL_error, tLObject, b2));
                break;
            default:
                gm.c3(new mz7(nz7Var, tL_error, tLObject, (byte) 2));
                break;
        }
    }
}
