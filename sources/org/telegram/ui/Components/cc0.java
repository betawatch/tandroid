package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc0 b;

    public /* synthetic */ cc0(dc0 dc0Var, int i10) {
        this.a = i10;
        this.b = dc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dc0 dc0Var = this.b;
                if (dc0Var.W != -1) {
                    NotificationCenter.getInstance(dc0Var.Y.c0.w).onAnimationFinish(dc0Var.W);
                    dc0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.i();
                break;
            default:
                dc0 dc0Var2 = this.b;
                if (dc0Var2.W != -1) {
                    NotificationCenter.getInstance(dc0Var2.Y.c0.w).onAnimationFinish(dc0Var2.W);
                    dc0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
