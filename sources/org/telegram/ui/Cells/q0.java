package org.telegram.ui.Cells;

import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi0 b;

    public /* synthetic */ q0(xi0 xi0Var, int i10) {
        this.a = i10;
        this.b = xi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.F(false);
                break;
            default:
                this.b.start();
                break;
        }
    }
}
