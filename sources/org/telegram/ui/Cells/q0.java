package org.telegram.ui.Cells;

import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
