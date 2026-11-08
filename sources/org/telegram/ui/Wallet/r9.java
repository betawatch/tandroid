package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ r9(w9 w9Var, int i7) {
        this.a = i7;
        this.b = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        w9 w9Var = this.b;
        switch (i7) {
            case 0:
                w9Var.d0 = null;
                break;
            default:
                hc.a0(w9Var).N(id.M0(2131745864, null), id.M0(2131751106, null)).j();
                break;
        }
    }
}
