package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub0 b;

    public /* synthetic */ tb0(ub0 ub0Var, int i10) {
        this.a = i10;
        this.b = ub0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ub0 ub0Var = this.b;
                if (ub0Var.W != -1) {
                    NotificationCenter.getInstance(ub0Var.Y.c0.w).onAnimationFinish(ub0Var.W);
                    ub0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                ub0 ub0Var2 = this.b;
                if (ub0Var2.W != -1) {
                    NotificationCenter.getInstance(ub0Var2.Y.c0.w).onAnimationFinish(ub0Var2.W);
                    ub0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
