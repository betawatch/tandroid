package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class u21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n31 b;

    public /* synthetic */ u21(n31 n31Var, int i10) {
        this.a = i10;
        this.b = n31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n31 n31Var = this.b;
                d31 d31Var = n31Var.G;
                d31Var.x1(true);
                b31 b31Var = n31Var.s;
                b31Var.x1(true);
                n31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(b31Var);
                AndroidUtilities.updateVisibleRows(d31Var);
                break;
            default:
                n31 n31Var2 = this.b;
                if (n31Var2.k()) {
                    n31Var2.l();
                    break;
                }
                break;
        }
    }
}
