package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb0 b;

    public /* synthetic */ vb0(wb0 wb0Var, int i10) {
        this.a = i10;
        this.b = wb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wb0 wb0Var = this.b;
                if (wb0Var.W != -1) {
                    NotificationCenter.getInstance(wb0Var.Y.c0.w).onAnimationFinish(wb0Var.W);
                    wb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                wb0 wb0Var2 = this.b;
                if (wb0Var2.W != -1) {
                    NotificationCenter.getInstance(wb0Var2.Y.c0.w).onAnimationFinish(wb0Var2.W);
                    wb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
