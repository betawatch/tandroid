package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ r9(w9 w9Var, int i3) {
        this.a = i3;
        this.b = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        w9 w9Var = this.b;
        switch (i3) {
            case 0:
                w9Var.e0 = null;
                break;
            default:
                fc.a0(w9Var).N(bd.M0(2131745871, null), bd.M0(2131751106, null)).j();
                break;
        }
    }
}
