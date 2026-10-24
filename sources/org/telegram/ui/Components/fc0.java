package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc0 b;

    public /* synthetic */ fc0(gc0 gc0Var, int i10) {
        this.a = i10;
        this.b = gc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gc0 gc0Var = this.b;
                if (gc0Var.W != -1) {
                    NotificationCenter.getInstance(gc0Var.Y.c0.w).onAnimationFinish(gc0Var.W);
                    gc0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                gc0 gc0Var2 = this.b;
                if (gc0Var2.W != -1) {
                    NotificationCenter.getInstance(gc0Var2.Y.c0.w).onAnimationFinish(gc0Var2.W);
                    gc0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
