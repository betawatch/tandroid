package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
                    NotificationCenter.getInstance(kb0Var.Y.c0.w).onAnimationFinish(kb0Var.W);
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
                    NotificationCenter.getInstance(kb0Var2.Y.c0.w).onAnimationFinish(kb0Var2.W);
                    kb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
