package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ m9(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ei.e2 e2Var;
        switch (this.a) {
            case 0:
                r9.Z(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                r9 r9Var = this.b;
                if (!r9Var.isFinished && (e2Var = r9Var.M) != null) {
                    if (user != null) {
                        AndroidUtilities.hideKeyboard(e2Var);
                        r9Var.h0(null, user);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new n9(r9Var, 1));
                        break;
                    }
                }
                break;
        }
    }
}
