package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tb0 b;

    public /* synthetic */ sb0(tb0 tb0Var, int i10) {
        this.a = i10;
        this.b = tb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tb0 tb0Var = this.b;
                if (tb0Var.W != -1) {
                    NotificationCenter.getInstance(tb0Var.Y.c0.w).onAnimationFinish(tb0Var.W);
                    tb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                tb0 tb0Var2 = this.b;
                if (tb0Var2.W != -1) {
                    NotificationCenter.getInstance(tb0Var2.Y.c0.w).onAnimationFinish(tb0Var2.W);
                    tb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
