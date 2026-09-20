package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb0 b;

    public /* synthetic */ qb0(rb0 rb0Var, int i10) {
        this.a = i10;
        this.b = rb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rb0 rb0Var = this.b;
                if (rb0Var.W != -1) {
                    NotificationCenter.getInstance(rb0Var.Y.c0.w).onAnimationFinish(rb0Var.W);
                    rb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                rb0 rb0Var2 = this.b;
                if (rb0Var2.W != -1) {
                    NotificationCenter.getInstance(rb0Var2.Y.c0.w).onAnimationFinish(rb0Var2.W);
                    rb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
