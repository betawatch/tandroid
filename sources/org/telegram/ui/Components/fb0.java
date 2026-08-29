package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb0 b;

    public /* synthetic */ fb0(gb0 gb0Var, int i10) {
        this.a = i10;
        this.b = gb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gb0 gb0Var = this.b;
                if (gb0Var.W != -1) {
                    NotificationCenter.getInstance(gb0Var.Y.V.w).onAnimationFinish(gb0Var.W);
                    gb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                gb0 gb0Var2 = this.b;
                if (gb0Var2.W != -1) {
                    NotificationCenter.getInstance(gb0Var2.Y.V.w).onAnimationFinish(gb0Var2.W);
                    gb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
