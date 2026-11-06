package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ s9(x9 x9Var, int i7) {
        this.a = i7;
        this.b = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x9 x9Var = this.b;
        switch (i7) {
            case 0:
                x9Var.d0 = null;
                break;
            default:
                hc.a0(x9Var).N(hd.M0(2131745862, null), hd.M0(2131751106, null)).j();
                break;
        }
    }
}
