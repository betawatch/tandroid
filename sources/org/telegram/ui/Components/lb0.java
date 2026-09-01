package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb0 b;

    public /* synthetic */ lb0(mb0 mb0Var, int i10) {
        this.a = i10;
        this.b = mb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mb0 mb0Var = this.b;
                if (mb0Var.W != -1) {
                    NotificationCenter.getInstance(mb0Var.Y.W.w).onAnimationFinish(mb0Var.W);
                    mb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                mb0 mb0Var2 = this.b;
                if (mb0Var2.W != -1) {
                    NotificationCenter.getInstance(mb0Var2.Y.W.w).onAnimationFinish(mb0Var2.W);
                    mb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
