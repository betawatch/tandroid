package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ t9(y9 y9Var, int i7) {
        this.a = i7;
        this.b = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        y9 y9Var = this.b;
        switch (i7) {
            case 0:
                y9Var.d0 = null;
                break;
            default:
                gc.a0(y9Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                break;
        }
    }
}
