package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ o31(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f41 f41Var = this.b;
                v31 v31Var = f41Var.G;
                v31Var.C1(true);
                t31 t31Var = f41Var.s;
                t31Var.C1(true);
                f41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(t31Var);
                AndroidUtilities.updateVisibleRows(v31Var);
                break;
            default:
                f41 f41Var2 = this.b;
                if (f41Var2.l()) {
                    f41Var2.m();
                    break;
                }
                break;
        }
    }
}
