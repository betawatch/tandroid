package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        fi.c2 c2Var;
        switch (this.a) {
            case 0:
                r9.a0(this.b, (String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                r9 r9Var = this.b;
                if (!r9Var.isFinished && (c2Var = r9Var.N) != null) {
                    if (user != null) {
                        AndroidUtilities.hideKeyboard(c2Var);
                        r9Var.i0(null, user);
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
