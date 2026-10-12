package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc0 b;

    public /* synthetic */ ic0(jc0 jc0Var, int i10) {
        this.a = i10;
        this.b = jc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jc0 jc0Var = this.b;
                if (jc0Var.W != -1) {
                    NotificationCenter.getInstance(jc0Var.Y.c0.w).onAnimationFinish(jc0Var.W);
                    jc0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                jc0 jc0Var2 = this.b;
                if (jc0Var2.W != -1) {
                    NotificationCenter.getInstance(jc0Var2.Y.c0.w).onAnimationFinish(jc0Var2.W);
                    jc0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
