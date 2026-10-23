package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
