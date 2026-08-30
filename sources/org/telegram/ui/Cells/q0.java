package org.telegram.ui.Cells;

import org.telegram.ui.Components.gj0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj0 b;

    public /* synthetic */ q0(gj0 gj0Var, int i10) {
        this.a = i10;
        this.b = gj0Var;
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
