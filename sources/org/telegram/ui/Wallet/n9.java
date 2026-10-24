package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class n9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ n9(s9 s9Var, int i10) {
        this.a = i10;
        this.b = s9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ei.e2 e2Var;
        switch (this.a) {
            case 0:
                s9.Z(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                s9 s9Var = this.b;
                if (!s9Var.isFinished && (e2Var = s9Var.M) != null) {
                    if (user != null) {
                        AndroidUtilities.hideKeyboard(e2Var);
                        s9Var.h0(null, user);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new o9(s9Var, 1));
                        break;
                    }
                }
                break;
        }
    }
}
