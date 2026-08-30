package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb0 b;

    public /* synthetic */ jb0(kb0 kb0Var, int i10) {
        this.a = i10;
        this.b = kb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kb0 kb0Var = this.b;
                if (kb0Var.W != -1) {
                    NotificationCenter.getInstance(kb0Var.Y.W.w).onAnimationFinish(kb0Var.W);
                    kb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                kb0 kb0Var2 = this.b;
                if (kb0Var2.W != -1) {
                    NotificationCenter.getInstance(kb0Var2.Y.W.w).onAnimationFinish(kb0Var2.W);
                    kb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
