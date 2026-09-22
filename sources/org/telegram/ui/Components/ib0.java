package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jb0 b;

    public /* synthetic */ ib0(jb0 jb0Var, int i10) {
        this.a = i10;
        this.b = jb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jb0 jb0Var = this.b;
                if (jb0Var.W != -1) {
                    NotificationCenter.getInstance(jb0Var.Y.c0.w).onAnimationFinish(jb0Var.W);
                    jb0Var.W = -1;
                    break;
                }
                break;
            case 1:
                this.b.Y.h();
                break;
            default:
                jb0 jb0Var2 = this.b;
                if (jb0Var2.W != -1) {
                    NotificationCenter.getInstance(jb0Var2.Y.c0.w).onAnimationFinish(jb0Var2.W);
                    jb0Var2.W = -1;
                    break;
                }
                break;
        }
    }
}
